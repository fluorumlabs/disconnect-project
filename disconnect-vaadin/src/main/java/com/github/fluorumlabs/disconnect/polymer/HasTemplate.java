package com.github.fluorumlabs.disconnect.polymer;

import com.github.fluorumlabs.disconnect.core.components.Component;
import com.github.fluorumlabs.disconnect.core.components.html.webcomponent.Template;

import java.util.List;

/**
 * Created by Artem Godin on 7/4/2020.
 */
public interface HasTemplate extends List<Component<?>>  {
    default void makeTemplate(String textContent) {
        Template template = new Template();
        template.getContent().add(textContent);
        add(template);
    }

    default void makeTemplate(Component<?>... components) {
        Template template = new Template();
        template.getContent().add(components);
        add(template);
    }
}
