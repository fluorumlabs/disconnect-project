package com.github.fluorumlabs.disconnect.example.basic.client;

import com.github.fluorumlabs.disconnect.core.annotations.Route;
import com.github.fluorumlabs.disconnect.core.components.html.text.block.Div;

/**
 * Created by Artem Godin on 6/17/2020.
 */
@Route("/")
public class DefaultView extends Div {
    public DefaultView() {
        super("This is the default view");
    }
}
