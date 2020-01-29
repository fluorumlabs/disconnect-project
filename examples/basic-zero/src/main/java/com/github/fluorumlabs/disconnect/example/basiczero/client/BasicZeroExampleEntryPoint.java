package com.github.fluorumlabs.disconnect.example.basiczero.client;

import com.github.fluorumlabs.disconnect.core.annotations.EntryPoint;
import com.github.fluorumlabs.disconnect.zero.component.Component;
import js.web.dom.HTMLDivElement;

import static js.web.dom.Document.DOCUMENT;


@EntryPoint
public class BasicZeroExampleEntryPoint implements Runnable {

    @Override
    public void run() {
        Component<HTMLDivElement> basicZeroExampleView = new BasicZeroExampleView();

        DOCUMENT.getBody().appendChild(basicZeroExampleView.render());
    }

}
