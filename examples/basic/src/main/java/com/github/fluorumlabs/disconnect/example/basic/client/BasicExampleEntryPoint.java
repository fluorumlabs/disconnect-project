package com.github.fluorumlabs.disconnect.example.basic.client;

import com.github.fluorumlabs.disconnect.core.Application;
import com.github.fluorumlabs.disconnect.core.annotations.EntryPoint;
import com.github.fluorumlabs.disconnect.core.components.html.form.Button;
import com.github.fluorumlabs.disconnect.core.components.html.form.TextInput;
import com.github.fluorumlabs.disconnect.core.components.html.text.block.Div;

@EntryPoint
public class BasicExampleEntryPoint implements Runnable {

    public void run() {
        Div container = new Div();

        TextInput textInput = new TextInput();
        textInput.setPlaceholder("Your name");

        Button button = new Button();
        button.add("Click me!");

        container.add(textInput, button);

        textInput.value().on(button.clickEvent()).accept(text -> {
            Div greeting = new Div();
            greeting.setTextContent("Hi, " + text + "!");
            container.add(greeting);
        });

        Application.render(container);
    }

}
