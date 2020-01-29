package org.vaadin.disconnect.demo.client;

import org.vaadin.disconnect.vue.annotations.Mutation;
import org.vaadin.disconnect.vue.annotations.PersistToLocalStorage;
import org.vaadin.disconnect.vue.annotations.VuexState;

import java.io.Serializable;


@VuexState
@PersistToLocalStorage
public class ApplicationConfiguration implements Serializable {
    public enum Theme { LIGHT, DARK }

    private Theme theme = Theme.LIGHT;

    @Mutation
    public final void setTheme(Theme theme) {
        this.theme = theme;
    }

    public boolean isDarkTheme() {
        return theme == Theme.DARK;
    }
}
