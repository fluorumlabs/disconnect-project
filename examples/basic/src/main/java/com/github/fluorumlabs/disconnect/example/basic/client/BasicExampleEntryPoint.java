package com.github.fluorumlabs.disconnect.example.basic.client;

import com.github.fluorumlabs.disconnect.core.annotations.EntryPoint;
import js.lang.JsDate;
import js.web.dom.Element;
import js.web.dom.HTMLElement;

import static js.web.dom.Document.DOCUMENT;
import static js.web.dom.Window.WINDOW;


@EntryPoint
public class BasicExampleEntryPoint implements Runnable {

    @Override
    public void run() {
        HTMLElement h1 = DOCUMENT.createElement("h1");
        h1.setInnerText("Disconnect: Basic example");
        DOCUMENT.getBody().appendChild(h1);

        HTMLElement button = DOCUMENT.createElement("button");
        button.setInnerText("Click me");
        DOCUMENT.getBody().appendChild(button);

        button.addEventListener("click", evt -> {
            HTMLElement p = DOCUMENT.createElement("p");
            p.setInnerText("Button was clicked on "+ JsDate.create().toISOString());
            DOCUMENT.getBody().appendChild(p);

            for (Element child : DOCUMENT.getBody().getChildren().iterable()) {
                WINDOW.getConsole().debug(child);
            }
        });
    }

}
