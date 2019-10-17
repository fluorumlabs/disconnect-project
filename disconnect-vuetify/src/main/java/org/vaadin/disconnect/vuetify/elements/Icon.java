package org.vaadin.disconnect.vuetify.elements;

import org.vaadin.disconnect.vue.annotations.ImportComponent;
import org.vaadin.disconnect.vue.client.elements.Element;
import org.vaadin.disconnect.vue.client.elements.HasClickListener;
import org.vaadin.disconnect.vue.client.elements.Text;
import org.vaadin.disconnect.vue.client.events.VoidEventListener;
import org.vaadin.disconnect.vuetify.icons.IconFont;

/**
 * Created by Artem Godin on 9/25/2019.
 */
@ImportComponent(module = "vuetify/lib/components/VIcon")
public final class Icon extends Element<Icon> implements HasClickListener<Icon> {
    public Icon() {
        super(Icon.class);
    }

    public Icon(String icon) {
        this();
        setIcon(icon);
    }

    public Icon(IconFont icon) {
        this();
        setIcon(icon);
    }

    public Icon setIcon(String icon) {
        children().removeAll();
        children().add(new Text(icon), this);
        return this;
    }

    public Icon setIcon(IconFont icon) {
        children().removeAll();
        children().add(new Text(icon.prefix() + icon.value().stringValue()), this);
        return this;
    }

    public Icon setEnabled(boolean enabled) {
        data().properties().set("disabled", !enabled);
        return this;
    }

    @Override
    public Icon onClick(VoidEventListener listener) {
        data().eventListeners().set("click", listener);
        return this;
    }
}
