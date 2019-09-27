package org.vaadin.disconnect.demo.client;

import org.vaadin.disconnect.vue.annotations.Mutation;
import org.vaadin.disconnect.vue.annotations.VueState;

/**
 * Created by Artem Godin on 9/26/2019.
 */
@VueState
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
