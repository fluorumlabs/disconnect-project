package com.github.fluorumlabs.disconnect.vaadin.types;

import js.web.dom.CustomEvent;
import js.web.dom.FormData;
import org.teavm.jso.JSProperty;

/**
 * Created by Artem Godin on 2/4/2020.
 */
public interface UploadRequestEvent extends CustomEvent<UploadRequestEvent.Details> {
    interface Details extends UploadEvent.Details {
        @JSProperty
        FormData getFormData();
    }
}
