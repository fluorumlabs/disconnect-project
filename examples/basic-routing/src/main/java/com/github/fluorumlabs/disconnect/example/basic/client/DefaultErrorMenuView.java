package com.github.fluorumlabs.disconnect.example.basic.client;

import com.github.fluorumlabs.disconnect.core.annotations.ErrorView;
import com.github.fluorumlabs.disconnect.core.components.html.text.block.Div;
import com.github.fluorumlabs.disconnect.core.router.NotFoundException;

/**
 * Created by Artem Godin on 6/17/2020.
 */
@ErrorView(value = NotFoundException.class, outlet = BasicMenu.class)
public class DefaultErrorMenuView extends Div {
}
