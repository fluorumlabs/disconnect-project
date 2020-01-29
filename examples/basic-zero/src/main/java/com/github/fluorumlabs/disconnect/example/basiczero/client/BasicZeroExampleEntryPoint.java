package com.github.fluorumlabs.disconnect.example.basiczero.client;

import com.github.fluorumlabs.disconnect.core.annotations.EntryPoint;

import static js.web.dom.Document.DOCUMENT;


@EntryPoint
public class BasicZeroExampleEntryPoint implements Runnable {

    @Override
    public void run() {
        BasicZeroExampleView basicZeroExampleView = new BasicZeroExampleView();

        DOCUMENT.getBody().appendChild(basicZeroExampleView.render());
    }

}
