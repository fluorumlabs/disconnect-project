/*
 *  Copyright 2014 Alexey Andreev.
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

import org.teavm.cache.CacheStatus;
import org.teavm.cache.FileNameEncoder;
import org.teavm.cache.ProgramIO;
import org.teavm.cache.SymbolTable;
import org.teavm.model.MethodReference;
import org.teavm.model.Program;
import org.teavm.model.ProgramCache;
import org.teavm.model.ReferenceCache;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Supplier;

public class FileSystemProgramCache implements ProgramCache {
    private Path directory;
    private ProgramIO programIO;
    private Map<MethodReference, Item> cache = new HashMap<>();
    private Set<MethodReference> newMethods = new HashSet<>();

    public FileSystemProgramCache(Path directory, ReferenceCache referenceCache, SymbolTable symbolTable,
                                  SymbolTable fileTable, SymbolTable variableTable) {
        this.directory = directory;
        programIO = new ProgramIO(referenceCache, symbolTable, fileTable, variableTable);
    }

    @Override
    public Program get(MethodReference method, CacheStatus cacheStatus) {
        Item item = cache.get(method);
        if (item == null) {
            item = new Item();
            cache.put(method, item);
            Path file = getMethodFile(method);
            if (Files.exists(file)) {
                try (InputStream stream = new BufferedInputStream(Files.newInputStream(file))) {
                    DataInput input = new DataInputStream(stream);
                    int depCount = input.readShort();
                    boolean dependenciesChanged = false;
                    for (int i = 0; i < depCount; ++i) {
                        String depClass = input.readUTF();
                        if (cacheStatus.isStaleClass(depClass)) {
                            dependenciesChanged = true;
                            break;
                        }
                    }
                    if (!dependenciesChanged) {
                        item.program = programIO.read(stream);
                    }
                } catch (IOException e) {
                    // we could not read program, just leave it empty
                }
            }
        }
        return item.program;
    }

    @Override
    public void store(MethodReference method, Program program, Supplier<String[]> dependencies) {
        Item item = new Item();
        cache.put(method, item);
        item.program = program;
        item.dependencies = dependencies.get().clone();
        newMethods.add(method);
    }

    public void flush() throws IOException {
        for (MethodReference method : newMethods) {
            Item item = cache.get(method);
            Path file = getMethodFile(method);
            Files.createDirectories(file.getParent());

            try (OutputStream stream = new BufferedOutputStream(Files.newOutputStream(file))) {
                DataOutput output = new DataOutputStream(stream);

                output.writeShort(item.dependencies.length);
                for (String dep : item.dependencies) {
                    output.writeUTF(dep);
                }
                programIO.write(item.program, stream);
            }
        }
    }

    private Path getMethodFile(MethodReference method) {
        Path dir = directory.resolve(method.getClassName().replace('.', '/'));
        return dir.resolve(FileNameEncoder.encodeFileName(method.getDescriptor().toString()) + ".teavm-opt");
    }

    static class Item {
        Program program;
        String[] dependencies;
    }
}
