/*
 *  Copyright 2018 Alexey Andreev.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.github.fluorumlabs.disconnect.maven.internals;

import org.teavm.ast.AsyncMethodNode;
import org.teavm.ast.ControlFlowEntry;
import org.teavm.ast.RegularMethodNode;
import org.teavm.cache.*;
import org.teavm.model.MethodReference;
import org.teavm.model.ReferenceCache;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Supplier;

public class FileSystemMethodNodeCache implements MethodNodeCache {
    private final Path directory;
    private final AstIO astIO;
    private final Map<MethodReference, Item> cache = new HashMap<>();
    private final Map<MethodReference, AsyncItem> asyncCache = new HashMap<>();
    private final Set<MethodReference> newMethods = new HashSet<>();
    private final Set<MethodReference> newAsyncMethods = new HashSet<>();

    public FileSystemMethodNodeCache(Path directory, ReferenceCache referenceCache, SymbolTable symbolTable,
                                     SymbolTable fileTable, SymbolTable variableTable) {
        this.directory = directory;
        astIO = new AstIO(referenceCache, symbolTable, fileTable, variableTable);
    }

    @Override
    public AstCacheEntry get(MethodReference methodReference, CacheStatus cacheStatus) {
        Item item = cache.get(methodReference);
        if (item == null) {
            item = new Item();
            cache.put(methodReference, item);
            Path file = getMethodFile(methodReference, false);
            if (Files.exists(file)) {
                try (InputStream stream = new BufferedInputStream(Files.newInputStream(file))) {
                    VarDataInput input = new VarDataInput(stream);
                    if (!checkIfDependenciesChanged(input, cacheStatus)) {
                        RegularMethodNode node = astIO.read(input, methodReference);
                        ControlFlowEntry[] cfg = astIO.readControlFlow(input);
                        item.entry = new AstCacheEntry(node, cfg);
                    }
                } catch (IOException e) {
                    // we could not read program, just leave it empty
                }
            }
        }
        return item.entry;
    }

    @Override
    public void store(MethodReference methodReference, AstCacheEntry entry, Supplier<String[]> dependencies) {
        Item item = new Item();
        item.entry = entry;
        item.dependencies = dependencies.get().clone();
        cache.put(methodReference, item);
        newMethods.add(methodReference);
    }

    @Override
    public AsyncMethodNode getAsync(MethodReference methodReference, CacheStatus cacheStatus) {
        AsyncItem item = asyncCache.get(methodReference);
        if (item == null) {
            item = new AsyncItem();
            asyncCache.put(methodReference, item);
            Path file = getMethodFile(methodReference, true);
            if (Files.exists(file)) {
                try (InputStream stream = new BufferedInputStream(Files.newInputStream(file))) {
                    VarDataInput input = new VarDataInput(stream);
                    if (!checkIfDependenciesChanged(input, cacheStatus)) {
                        item.node = astIO.readAsync(input, methodReference);
                    }
                } catch (IOException e) {
                    // we could not read program, just leave it empty
                }
            }
        }
        return item.node;
    }

    private boolean checkIfDependenciesChanged(VarDataInput input, CacheStatus cacheStatus) throws IOException {
        int depCount = input.readUnsigned();
        for (int i = 0; i < depCount; ++i) {
            String depClass = input.read();
            if (cacheStatus.isStaleClass(depClass)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void storeAsync(MethodReference methodReference, AsyncMethodNode node, Supplier<String[]> depenencies) {
        AsyncItem item = new AsyncItem();
        item.node = node;
        item.dependencies = depenencies.get().clone();
        asyncCache.put(methodReference, item);
        newAsyncMethods.add(methodReference);
    }

    public void flush() throws IOException {
        for (MethodReference method : newMethods) {
            Path file = getMethodFile(method, true);
            Item item = cache.get(method);
            try (VarDataOutput output = new VarDataOutput(new BufferedOutputStream(Files.newOutputStream(file)))) {
                output.writeUnsigned(item.dependencies.length);
                for (String dependency : item.dependencies) {
                    output.write(dependency);
                }
                astIO.write(output, item.entry.method);
                astIO.write(output, item.entry.cfg);
            }
        }
        for (MethodReference method : newAsyncMethods) {
            Path file = getMethodFile(method, true);
            AsyncItem item = asyncCache.get(method);
            try (VarDataOutput output = new VarDataOutput(new BufferedOutputStream(Files.newOutputStream(file)))) {
                output.writeUnsigned(item.dependencies.length);
                for (String dependency : item.dependencies) {
                    output.write(dependency);
                }
                astIO.writeAsync(output, item.node);
            }
        }
    }

    private Path getMethodFile(MethodReference method, boolean async) {
        Path dir = directory.resolve(method.getClassName().replace('.', '/'));
        return dir.resolve(FileNameEncoder.encodeFileName(method.getDescriptor().toString()) + ".teavm-ast"
                + (async ? "-async" : ""));
    }

    private static class Item {
        AstCacheEntry entry;
        String[] dependencies;
    }

    private static class AsyncItem {
        AsyncMethodNode node;
        String[] dependencies;
    }
}
