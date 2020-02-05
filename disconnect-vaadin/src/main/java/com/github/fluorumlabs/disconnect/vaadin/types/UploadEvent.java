package com.github.fluorumlabs.disconnect.vaadin.types;

import js.web.dom.CustomEvent;
import js.web.dom.XMLHttpRequest;
import org.teavm.jso.JSProperty;

/**
 * Created by Artem Godin on 2/4/2020.
 */
public interface UploadEvent extends CustomEvent<UploadEvent.Details> {
    interface Details extends UploadFileEvent.Details {
        @JSProperty
        XMLHttpRequest getXhr();
    }
}
