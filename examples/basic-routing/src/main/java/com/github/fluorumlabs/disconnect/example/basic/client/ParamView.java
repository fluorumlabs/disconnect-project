package com.github.fluorumlabs.disconnect.example.basic.client;

import com.github.fluorumlabs.disconnect.core.annotations.Route;
import com.github.fluorumlabs.disconnect.core.annotations.RouteParameter;
import com.github.fluorumlabs.disconnect.core.components.html.text.block.Div;
import com.github.fluorumlabs.disconnect.core.router.BeforeEnter;
import com.github.fluorumlabs.disconnect.core.router.HasLifecycleCallbacks;

/**
 * Created by Artem Godin on 6/17/2020.
 */
@Route("/:segment(\\d+)")
public class ParamView extends Div implements HasLifecycleCallbacks {
    @RouteParameter(name = "segment")
    private int segment;

    @Override
    public void onBeforeEnter(BeforeEnter beforeEnter) {
        if (segment==0) {
            throw new IllegalArgumentException("Segment is zero");
        }
        add("Got value: "+segment);
    }
}
