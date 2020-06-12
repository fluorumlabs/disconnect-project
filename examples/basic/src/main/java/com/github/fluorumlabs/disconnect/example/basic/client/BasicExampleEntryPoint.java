package com.github.fluorumlabs.disconnect.example.basic.client;

import com.github.fluorumlabs.disconnect.core.Application;
import com.github.fluorumlabs.disconnect.core.annotations.EntryPoint;
import com.github.fluorumlabs.disconnect.core.components.html.form.Button;
import com.github.fluorumlabs.disconnect.core.components.html.form.TextInput;
import com.github.fluorumlabs.disconnect.core.components.html.text.block.Div;
import org.apache.commons.lang3.StringUtils;

@EntryPoint
public class BasicExampleEntryPoint implements Runnable {

    public void run() {
        Div container = new Div();

        TextInput textInput = new TextInput();
        textInput.setPlaceholder("Your name");

        Button button = new Button("Click me!");

        container.add(textInput, button);

        textInput.value()
                .on(button.clickEvent())
                .when(StringUtils::isNotEmpty)
                .then(text -> container.add(new Div("Hi, " + text + "!")));

        Application.render(container);
    }

}
