package org.vaadin.disconnect.vuetify.elements;

import org.vaadin.disconnect.vue.annotations.ImportComponent;
import org.vaadin.disconnect.vue.client.elements.Element;
import org.vaadin.disconnect.vue.client.elements.HasChildElements;
import org.vaadin.disconnect.vue.client.elements.Text;
import org.vaadin.disconnect.vuetify.elements.bars.AppBar;

/**
 * Created by Artem Godin on 9/25/2019.
 */
@ImportComponent(module = "vuetify/lib/components/VApp")
public final class ApplicationShell extends VuetifyElement<ApplicationShell> implements HasChildElements<ApplicationShell, Element<?>> {
    private final Content content;

    public ApplicationShell() {
        super(ApplicationShell.class);
        content = new Content();
        children().add(content.key(getKey()+"-c"));
    }

    public ApplicationShell setNavigationDrawer(NavigationDrawer drawer) {
        children().removeByKey(getKey() + "-nd");
        children().add(drawer.key(getKey()+"-nd").setApplicationShell());
        return this;
    }

    public ApplicationShell setAppBar(AppBar appBar) {
        children().removeByKey(getKey() + "-ab");
        children().add(appBar.key(getKey() + "-ab").setApplicationShell());
        return this;
    }

    public ApplicationShell setSystemBar(SystemBar systemBar) {
        children().removeByKey(getKey()+"-sb");
        children().add(systemBar.key(getKey() + "-sb").setApplicationShell());
        return this;
    }

    public ApplicationShell setBottomNavigation(BottomNavigation navBar) {
        children().removeByKey(getKey() + "-bn");
        children().add(navBar.key(getKey() + "-bn").setApplicationShell());
        return this;
    }

    public ApplicationShell setFooter(Footer footer) {
        children().removeByKey(getKey() + "-ab");
        children().add(footer.key(getKey() + "-ab").setApplicationShell());
        return this;
    }

    public ApplicationShell setContent(Content appBar) {
        children().removeByKey(getKey() + "-ab");
        add(appBar.key(getKey()+"-ab"));
        return this;
    }

    public ApplicationShell add(Element... elements) {
        content.add(elements);
        return this;
    }

    public ApplicationShell insert(Element... elements) {
        content.insert(elements);
        return this;
    }

    public ApplicationShell remove(Element...elements) {
        content.remove(elements);
        return this;
    }

    public ApplicationShell removeByKey(String...keys) {
        // Note: does not detach from parent
        content.removeByKey(keys);
        return this;
    }

    public ApplicationShell removeAll() {
        // Note: does not detach from parent
        content.removeAll();
        return this;
    }

}

