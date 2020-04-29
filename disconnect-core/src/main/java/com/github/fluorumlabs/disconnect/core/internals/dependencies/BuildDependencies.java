package com.github.fluorumlabs.disconnect.core.internals.dependencies;


import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;


@NpmPackage(name = "postcss-copy", version = "^7.1.0")
@NpmPackage(name = "postcss-import", version = "^12.0.1")
@NpmPackage(name = "rollup", version = "1.23.1") // 1.24.0 breaks meta breaks
@NpmPackage(name = "sass", version = "^1.22.12")
@NpmPackage(name = "@rollup/plugin-inject", version = "^4.0.1")
@NpmPackage(name = "rollup-plugin-commonjs", version = "^10.0.2")
@NpmPackage(name = "rollup-plugin-copy", version = "^3.3.0")
@NpmPackage(name = "rollup-plugin-postcss", version = "^2.0.3")
@NpmPackage(name = "rollup-plugin-node-resolve", version = "^5.2.0")
@NpmPackage(name = "rollup-plugin-replace", version = "^2.2.0")
@NpmPackage(name = "rollup-plugin-terser", version = "^5.1.1")
@NpmPackage(name = "rollup-plugin-sourcemaps", version = "^0.4.2")
public interface BuildDependencies {
    static void init() {

    }
}
