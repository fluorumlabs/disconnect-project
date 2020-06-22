package com.github.fluorumlabs.disconnect.example.basic.client;

import com.github.fluorumlabs.disconnect.core.annotations.ErrorView;
import com.github.fluorumlabs.disconnect.core.components.html.text.block.Div;
import com.github.fluorumlabs.disconnect.core.router.HasErrorParameter;
import com.github.fluorumlabs.disconnect.core.router.NotFoundException;

/**
 * Created by Artem Godin on 6/17/2020.
 */
@ErrorView(NotFoundException.class)
@ErrorView.Alternative(IllegalArgumentException.class)
public class DefaultErrorView extends Div implements HasErrorParameter {
    @Override
    public void setErrorParameter(Exception exception) {
        add("Exception happened: ");
        add(exception.getClass().getName() + ": " + exception.getMessage());
    }
}
