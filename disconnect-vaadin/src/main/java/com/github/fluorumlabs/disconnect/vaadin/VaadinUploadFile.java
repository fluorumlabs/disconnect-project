package com.github.fluorumlabs.disconnect.vaadin;

import com.github.fluorumlabs.disconnect.vaadin.elements.UploadFileElement;
import com.github.fluorumlabs.disconnect.vaadin.mixins.HasThemableMixin;
import com.github.fluorumlabs.disconnect.vaadin.types.UploadFileEvent;
import com.github.fluorumlabs.disconnect.vaadin.types.UploadingFile;
import com.github.fluorumlabs.disconnect.zero.component.AbstractComponent;
import com.github.fluorumlabs.disconnect.zero.component.Component;
import com.github.fluorumlabs.disconnect.zero.component.HasComponents;
import com.github.fluorumlabs.disconnect.zero.observable.ObservableEvent;

import javax.annotation.Nullable;

/**
 * `<vaadin-upload-file>` element represents a file in the file list of `<vaadin-upload>`.
 * <p>
 * ### Styling
 * <p>
 * The following shadow DOM parts are available for styling:
 * <p>
 * Part name | Description
 * ---|---
 * `row` | File container
 * `info` | Container for file status icon, file name, status and error messages
 * `done-icon` | File done status icon
 * `warning-icon` | File warning status icon
 * `meta` | Container for file name, status and error messages
 * `name` | File name
 * `error` | Error message, shown when error happens
 * `status` | Status message
 * `commands` | Container for file command icons
 * `start-button` | Start file upload button
 * `retry-button` | Retry file upload button
 * `clear-button` | Clear file button
 * `progress`| Progress bar
 * <p>
 * The following state attributes are available for styling:
 * <p>
 * Attribute | Description | Part name
 * ---|---|---
 * `error` | An error has happened during uploading | `:host`
 * `indeterminate` | Uploading is in progress, but the progress value is unknown | `:host`
 * `uploading` | Uploading is in progress | `:host`
 * `complete` | Uploading has finished successfully | `:host`
 * <p>
 * See [ThemableMixin – how to apply styles for shadow parts](https://github.com/vaadin/vaadin-themable-mixin/wiki)
 */
public class VaadinUploadFile extends AbstractComponent<UploadFileElement>
        implements HasThemableMixin<UploadFileElement, VaadinUploadFile>,
        HasComponents<UploadFileElement, VaadinUploadFile, Component<?>> {
    public VaadinUploadFile() {
        super("vaadin-upload-file");
    }

    /**
     *
     */
    @Nullable
    public UploadingFile file() {
        return getNode().getFile();
    }

    /**
     *
     */
    public VaadinUploadFile file(UploadingFile file) {
        getNode().setFile(file);
        return this;
    }

    /**
     * Fired when abort button is pressed. It is listened by `vaadin-upload` which
     * will abort the upload in progress, but will not remove the file from the list
     * to allow the animation to hide the element to be run.
     */
    public ObservableEvent<UploadFileEvent> fileAbortEvent() {
        return createEvent("file-abort");
    }

    /**
     * Fired after the animation to hide the element has finished. It is listened
     * by `vaadin-upload` which will actually remove the file from the upload
     * file list.
     */
    public ObservableEvent<UploadFileEvent> fileRemoveEvent() {
        return createEvent("file-remove");
    }

    /**
     * Fired when the retry button is pressed. It is listened by `vaadin-upload`
     * which will start a new upload process of this file.
     */
    public ObservableEvent<UploadFileEvent> fileRetryEvent() {
        return createEvent("file-retry");
    }

    /**
     * Fired when the start button is pressed. It is listened by `vaadin-upload`
     * which will start a new upload process of this file.
     */
    public ObservableEvent<UploadFileEvent> fileStartEvent() {
        return createEvent("file-start");
    }
}
