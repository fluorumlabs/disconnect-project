package com.github.fluorumlabs.disconnect.example.basiczero.client;

import com.github.fluorumlabs.disconnect.zero.component.html.Button;
import com.github.fluorumlabs.disconnect.zero.component.html.Div;
import com.github.fluorumlabs.disconnect.zero.component.html.H1;
import com.github.fluorumlabs.disconnect.zero.component.html.Paragraph;
import org.teavm.jso.core.JSDate;


public class BasicZeroExampleView extends Div {
    {
        add(new H1().text("Disconnect: Basic example"));

        Button button = new Button().text("Click me");
        button.clickEvent().accept(buttonTarget -> {
            add(new Paragraph().text("Button was clicked on " + JSDate.create().toISOString()));
        });

        button.visibilityChangeEvent().accept(evt -> {
            add(new Paragraph().text("Button visibility changed to " + evt.becameVisible()));
        });

        Button hideButton = new Button().text("Hide button");
        hideButton.clickEvent().accept(buttonTarget -> {
            button.toggleVisibility();
        });

        add(button, hideButton);
    }
}
