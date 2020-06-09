package com.github.fluorumlabs.disconnect.core.components;

import com.github.fluorumlabs.disconnect.core.containers.ComponentList;

/**
 * Created by Artem Godin on 6/9/2020.
 */
public class LightDomCustomElementComponent extends CustomElementComponent{
    protected LightDomCustomElementComponent(){}

    @Override
    protected ComponentList<Component<?>> createRoot() {
        return this;
    }
}
