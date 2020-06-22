package com.github.fluorumlabs.disconnect.example.basic.client;

import com.github.fluorumlabs.disconnect.core.Application;
import com.github.fluorumlabs.disconnect.core.annotations.EntryPoint;
import com.github.fluorumlabs.disconnect.core.annotations.ImportStyle;
import com.github.fluorumlabs.disconnect.core.components.html.section.Heading;
import com.github.fluorumlabs.disconnect.core.router.Router;

@EntryPoint
@ImportStyle("./link-styles.css")
public class BasicRoutingExample implements Runnable {

    public void run() {
        Application.render(new Heading.Level1("Basic router example"));
        Application.render(new BasicMenu());
        Application.render(Router.getRootOutlet());
    }
}
