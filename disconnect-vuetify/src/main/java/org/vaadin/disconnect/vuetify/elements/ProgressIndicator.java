package org.vaadin.disconnect.vuetify.elements;

import org.vaadin.disconnect.vue.annotations.ImportComponent;

/**
 * Created by Artem Godin on 9/27/2019.
 */
public final class ProgressIndicator {
    private ProgressIndicator(){}


    /**
     * Created by Artem Godin on 9/25/2019.
     */
    @ImportComponent(module = "vuetify/lib/components/VProgressLinear")
    public static final class Linear extends VuetifyElement<Linear> implements
            HasTheme<Linear>,
            HasColor<Linear>
    {
        public Linear() {
            super(Linear.class);
        }

        public Linear setAbsolute(boolean absolute) {
            data().properties().set("absolute", absolute);
            return this;
        }

        public Linear setActive(boolean active) {
            data().properties().set("active", active);
            return this;
        }

        public Linear setIndeterminate(boolean indeterminate) {
            data().properties().set("indeterminate", indeterminate);
            return this;
        }

        public Linear setQuery(boolean query) {
            data().properties().set("query", query);
            return this;
        }

        public Linear setTop(boolean query) {
            data().properties().set("top", query);
            return this;
        }

        public Linear backgroundOpacity(double opacity) {
            data().properties().set("backgroundOpacity", opacity);
            return this;
        }
    }
}
