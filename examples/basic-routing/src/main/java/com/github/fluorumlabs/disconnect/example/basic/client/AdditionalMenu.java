package com.github.fluorumlabs.disconnect.example.basic.client;

import com.github.fluorumlabs.disconnect.core.annotations.Route;
import com.github.fluorumlabs.disconnect.core.components.html.text.inline.Anchor;
import com.github.fluorumlabs.disconnect.core.components.html.text.inline.Span;

/**
 * Created by Artem Godin on 6/18/2020.
 */
@Route(value = "(.*)", parent = AdditionalRoot.class, outlet = BasicMenu.class)
public class AdditionalMenu extends Span {
    {
        add(new Anchor(AdditionalView.class, "Main view"));
        add(new Anchor(AdditionalSubView.class, "Sub view"));
    }
}
