package com.github.fluorumlabs.disconnect.example.basic.client;

import com.github.fluorumlabs.disconnect.core.components.html.text.inline.Anchor;
import com.github.fluorumlabs.disconnect.core.components.html.text.inline.Span;
import com.github.fluorumlabs.disconnect.core.router.RouterOutlet;

/**
 * Created by Artem Godin on 6/18/2020.
 */
public class BasicMenu extends Span {
    {
        add(new Anchor("/", "Root"));
        add(new Anchor(SomeView.class, "Some view"));
        add(new Anchor(AdditionalView.class, "Some other view"));
        add(new Anchor("/not-found", "404"));
        add("Also:");
        add(new RouterOutlet(BasicMenu.class));
    }
}
