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

import org.teavm.cache.SymbolTable;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FileSystemSymbolTable implements SymbolTable {
    private Path file;
    private List<String> symbols = new ArrayList<>();
    private Map<String, Integer> symbolMap = new HashMap<>();
    private int firstUnstoredIndex;

    public FileSystemSymbolTable(Path file) {
        this.file = file;
    }

    public void update() throws IOException {
        symbols.clear();
        symbolMap.clear();
        firstUnstoredIndex = 0;
        try (DataInputStream input = new DataInputStream(new BufferedInputStream(
                Files.newInputStream(file)
        ))) {
            while (true) {
                int length = input.read();
                if (length == -1) {
                    break;
                }
                length = ((length & 0xFF) << 8) | (input.read() & 0xFF);
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < length; ++i) {
                    sb.append(input.readChar());
                }
                String symbol = sb.toString();
                symbolMap.put(symbol, symbols.size());
                symbols.add(symbol);
                firstUnstoredIndex = symbols.size();
            }
        }
    }

    public void flush() throws IOException {
        if (firstUnstoredIndex >= symbols.size()) {
            return;
        }
        if (!Files.exists(file)) {
            Files.createFile(file);
        }
        try (DataOutputStream output = new DataOutputStream(new BufferedOutputStream(
                Files.newOutputStream(file, StandardOpenOption.WRITE, StandardOpenOption.APPEND)
        ))) {
            while (firstUnstoredIndex < symbols.size()) {
                String symbol = symbols.get(firstUnstoredIndex);
                output.writeByte((symbol.length() >> 8) & 0xFF);
                output.writeByte(symbol.length() & 0xFF);
                for (int i = 0; i < symbol.length(); ++i) {
                    output.writeChar(symbol.charAt(i));
                }
                firstUnstoredIndex++;
            }
        }
    }

    @Override
    public String at(int index) {
        return symbols.get(index);
    }

    @Override
    public int lookup(String symbol) {
        Integer index = symbolMap.get(symbol);
        if (index == null) {
            index = symbols.size();
            symbolMap.put(symbol, index);
            symbols.add(symbol);
        }
        return index;
    }
}
