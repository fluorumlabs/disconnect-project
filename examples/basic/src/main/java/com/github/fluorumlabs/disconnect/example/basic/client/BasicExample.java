package com.github.fluorumlabs.disconnect.example.basic.client;

import com.github.fluorumlabs.disconnect.core.Application;
import com.github.fluorumlabs.disconnect.core.annotations.EntryPoint;
import com.github.fluorumlabs.disconnect.core.components.html.form.Button;
import com.github.fluorumlabs.disconnect.core.components.html.form.TextInput;
import com.github.fluorumlabs.disconnect.core.components.html.text.block.Div;
import org.apache.commons.lang3.StringUtils;

@EntryPoint
public class BasicExample implements Runnable {

    public void run() {
        TextInput textInput = new TextInput();
        textInput.setPlaceholder("Your name");

        Button button = new Button("Click me!");
        Button resetButton = new Button("Reset");

        Div container = new Div(textInput, button, resetButton);

        textInput.value()
                .on(button.clickEvent())
                .when(StringUtils::isNotEmpty)
                .then(text -> container.add(new Div("Hi, " + text + "!")));

        resetButton.clickEvent().accept(() -> textInput.value().set(""));

        Application.render(container);
    }
}
