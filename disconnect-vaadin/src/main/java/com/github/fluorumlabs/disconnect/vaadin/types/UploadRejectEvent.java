package com.github.fluorumlabs.disconnect.vaadin.types;

import js.web.dom.CustomEvent;
import org.teavm.jso.JSProperty;

/**
 * Created by Artem Godin on 2/4/2020.
 */
public interface UploadRejectEvent extends CustomEvent<UploadRejectEvent.Details> {
	interface Details extends UploadFileEvent.Details {
		@JSProperty
		String getError();
	}
}
