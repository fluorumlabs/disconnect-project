package com.github.fluorumlabs.disconnect.core.internals.dependencies;


import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;


@NpmPackage(name = "@babel/core", version = "^7.5.5")
@NpmPackage(name = "@babel/preset-env", version = "^7.5.5")
@NpmPackage(name = "es-dev-server", version = "^1.26.1")
@NpmPackage(name = "core-js", version = "^3.2.1")
@NpmPackage(name = "postcss-copy", version = "^7.1.0")
@NpmPackage(name = "postcss-import", version = "^12.0.1")
@NpmPackage(name = "rollup", version = "1.23.1") // 1.24.0 breaks meta breaks
@NpmPackage(name = "sass", version = "^1.22.12")
@NpmPackage(name = "@rollup/plugin-inject", version = "^4.0.0")
@NpmPackage(name = "rollup-plugin-babel", version = "^4.3.3")
@NpmPackage(name = "rollup-plugin-commonjs", version = "^10.0.2")
@NpmPackage(name = "rollup-plugin-postcss", version = "^2.0.3")
@NpmPackage(name = "rollup-plugin-node-resolve", version = "^5.2.0")
@NpmPackage(name = "rollup-plugin-replace", version = "^2.2.0")
@NpmPackage(name = "rollup-plugin-terser", version = "^5.1.1")
@NpmPackage(name = "rollup-plugin-workbox-build", version = "^0.2.0")
@NpmPackage(name = "rollup-plugin-sizes", version = "^0.5.1")
@NpmPackage(name = "rollup-plugin-sourcemaps", version = "^0.4.2")
public interface BuildDependencies {
    static void init() {

    }
}
