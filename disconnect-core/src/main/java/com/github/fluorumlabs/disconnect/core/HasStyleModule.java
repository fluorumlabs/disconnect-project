package com.github.fluorumlabs.disconnect.core;


public interface HasStyleModule {
    default String getClassName(String className) {
        throw new UnsupportedOperationException("HasStyleModule without @ImportStyleModule annotation");
    }
}
