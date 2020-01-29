package com.github.fluorumlabs.disconnect.core.internals.dependencies;


import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;


@NpmPackage(name = "workbox-window", version = "^4.3.1")
@NpmPackage(name = "workbox-precaching", version = "^4.3.1")
@NpmPackage(name = "workbox-routing", version = "^4.3.1")
@NpmPackage(name = "workbox-strategies", version = "^4.3.1")
@NpmPackage(name = "workbox-expiration", version = "^4.3.1")
@NpmPackage(name = "workbox-background-sync", version = "^4.3.1")
@NpmPackage(name = "workbox-cacheable-response", version = "^4.3.1")
public interface RuntimeDependencies {
    static void init() {

    }
}
