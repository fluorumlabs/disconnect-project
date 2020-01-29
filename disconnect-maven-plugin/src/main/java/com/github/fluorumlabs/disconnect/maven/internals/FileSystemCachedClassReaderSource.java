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
import org.teavm.cache.ClassIO;
import org.teavm.cache.SymbolTable;
import org.teavm.model.*;
import org.teavm.parsing.ClassDateProvider;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class FileSystemCachedClassReaderSource implements ClassReaderSource, CacheStatus {
    private Path directory;
    private ClassHolderSource innerSource;
    private ClassDateProvider classDateProvider;
    private Map<String, Item> cache = new LinkedHashMap<>();
    private Set<String> newClasses = new HashSet<>();
    private ClassIO classIO;

    public FileSystemCachedClassReaderSource(Path directory, ReferenceCache referenceCache, SymbolTable symbolTable,
                                             SymbolTable fileTable, SymbolTable variableTable, ClassHolderSource innerSource,
                                             ClassDateProvider classDateProvider) {
        this.directory = directory;
        this.innerSource = innerSource;
        this.classDateProvider = classDateProvider;
        classIO = new ClassIO(referenceCache, symbolTable, fileTable, variableTable);
    }

    @Override
    public ClassReader get(String name) {
        return getItemFromCache(name).cls;
    }

    @Override
    public boolean isStaleClass(String className) {
        return getItemFromCache(className).dirty;
    }

    @Override
    public boolean isStaleMethod(MethodReference method) {
        return isStaleClass(method.getClassName());
    }

    private Item getItemFromCache(String name) {
        Item item = cache.get(name);
        if (item == null) {
            item = new Item();
            cache.put(name, item);
            Path classFile = directory.resolve( name.replace('.', '/') + ".teavm-cls");
            if (Files.exists(classFile)) {
                Date classDate = classDateProvider.getModificationDate(name);
                if (classDate != null && classDate.before(new Date(getLastModifiedTime(classFile)))) {
                    try (InputStream input = new BufferedInputStream(Files.newInputStream(classFile))) {
                        item.cls = classIO.readClass(input, name);
                    } catch (IOException e) {
                        // We could not access cache file, so let's parse class file
                        item.cls = null;
                    }
                }
            }
            if (item.cls == null) {
                item.dirty = true;
                item.cls = innerSource.get(name);
                newClasses.add(name);
            }
        }
        return item;
    }

    private static long getLastModifiedTime(Path path) {
        try {
            return Files.getLastModifiedTime(path).toMillis();
        } catch (IOException e) {
            return -1;
        }
    }

    private static class Item {
        ClassReader cls;
        boolean dirty;
    }

    public void flush() throws IOException {
        for (String className : newClasses) {
            Item item = cache.get(className);
            if (item.cls != null) {
                Path classFile = directory.resolve(className.replace('.', '/') + ".teavm-cls");
                Files.createDirectories(classFile.getParent());
                try (OutputStream output = new BufferedOutputStream(Files.newOutputStream(classFile))) {
                    classIO.writeClass(output, item.cls);
                }
            }
        }
    }
}
