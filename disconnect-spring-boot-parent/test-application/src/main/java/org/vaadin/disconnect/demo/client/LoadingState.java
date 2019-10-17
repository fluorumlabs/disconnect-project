package org.vaadin.disconnect.demo.client;

import org.vaadin.disconnect.vue.annotations.Mutation;
import org.vaadin.disconnect.vue.annotations.VuexState;

/**
 * Created by Artem Godin on 9/26/2019.
 */
@VuexState
public class LoadingState {
    private int activeRequestCount = 0;

    @Mutation
    public final void beginRequest() {
        activeRequestCount++;
    }

    @Mutation
    public final void endRequest() {
        activeRequestCount--;
    }

    public boolean hasActiveRequests() {
        return activeRequestCount>0;
    }
}
