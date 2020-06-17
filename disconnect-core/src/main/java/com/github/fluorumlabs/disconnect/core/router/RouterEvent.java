package com.github.fluorumlabs.disconnect.core.router;

import js.lang.external.vaadin.router.Params;
import js.lang.external.vaadin.router.RouterLocation;

import javax.annotation.Nullable;

/**
 * Created by Artem Godin on 6/17/2020.
 */
public class RouterEvent {
    private final RouterLocation location;
    private final LocationParams params;

    public RouterEvent(RouterLocation location) {
        this.location = location;
        this.params = new LocationParams(location.getParams());
    }

    public String getPathname() {
        return location.getPathname();
    }

    @Nullable
    public String getSearch() {
        return location.getSearch();
    }

    @Nullable
    public String getHash() {
        return location.getHash();
    }

    public String getBaseUrl() {
        return location.getBaseUrl();
    }

    public LocationParams getParams() {
        return params;
    }

    @Nullable
    public String getRedirectFrom() {
        return location.getRedirectFrom();
    }

    public String getUrl(String[] params) {
        return location.getUrl(params);
    }

    public String getUrl(@Nullable Params params) {
        return location.getUrl(params);
    }

    /**
     *
     */
    public String getUrl() {
        return location.getUrl();
    }
}
