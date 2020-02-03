package com.github.fluorumlabs.disconnect.example.basiczero.client;

import com.github.fluorumlabs.disconnect.polymer.DomIf;
import com.github.fluorumlabs.disconnect.zero.component.html.Button;
import com.github.fluorumlabs.disconnect.zero.component.html.Div;
import com.github.fluorumlabs.disconnect.zero.component.html.H1;
import com.github.fluorumlabs.disconnect.zero.component.html.Paragraph;
import js.lang.JsDate;


public class BasicZeroExampleView extends Div {
    {
        add(new H1("Disconnect: Basic example"));

        DomIf domIf = new DomIf(new Paragraph("This text supposed to be hidden via dom-if"));
        domIf.setIf(true);

        Button button = new Button("Click me");
        button.clickEvent().accept(evt -> {
            add(new Paragraph("Button was clicked on " + JsDate.create().toISOString()));
        });

        button.visibilityChangeEvent().accept(evt -> {
            add(new Paragraph("Button visibility changed to " + evt.becameVisible()));
            domIf.setIf(evt.becameVisible());
        });

        Button hideButton = new Button("Hide button");
        hideButton.clickEvent().accept(evt -> button.toggleVisibility());

        add(button, hideButton, domIf);
    }
}
