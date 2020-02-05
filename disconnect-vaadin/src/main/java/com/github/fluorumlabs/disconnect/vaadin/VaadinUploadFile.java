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
 * <code>&lt;vaadin-upload-file&gt;</code> element represents a file in the file list of <code>&lt;vaadin-upload&gt;
 * </code>.
 *
 * <h3>Styling</h3>
 * The following shadow DOM parts are available for styling:
 *
 * <table>
 * <thead>
 * <tr><th>Part name</th><th>Description</th></tr>
 * </thead>
 * <tbody>
 * <tr><td><code>row</code></td><td>File container</td></tr>
 * <tr><td><code>info</code></td><td>Container for file status icon, file name, status and error messages</td></tr>
 * <tr><td><code>done-icon</code></td><td>File done status icon</td></tr>
 * <tr><td><code>warning-icon</code></td><td>File warning status icon</td></tr>
 * <tr><td><code>meta</code></td><td>Container for file name, status and error messages</td></tr>
 * <tr><td><code>name</code></td><td>File name</td></tr>
 * <tr><td><code>error</code></td><td>Error message, shown when error happens</td></tr>
 * <tr><td><code>status</code></td><td>Status message</td></tr>
 * <tr><td><code>commands</code></td><td>Container for file command icons</td></tr>
 * <tr><td><code>start-button</code></td><td>Start file upload button</td></tr>
 * <tr><td><code>retry-button</code></td><td>Retry file upload button</td></tr>
 * <tr><td><code>clear-button</code></td><td>Clear file button</td></tr>
 * <tr><td><code>progress</code></td><td>Progress bar</td></tr>
 * </tbody>
 * </table>
 * The following state attributes are available for styling:
 *
 * <table>
 * <thead>
 * <tr><th>Attribute</th><th>Description</th><th>Part name</th></tr>
 * </thead>
 * <tbody>
 * <tr><td><code>error</code></td><td>An error has happened during uploading</td><td><code>:host</code></td></tr>
 * <tr><td><code>indeterminate</code></td><td>Uploading is in progress, but the progress value is
 * unknown</td><td><code>:host</code></td></tr>
 * <tr><td><code>uploading</code></td><td>Uploading is in progress</td><td><code>:host</code></td></tr>
 * <tr><td><code>complete</code></td><td>Uploading has finished successfully</td><td><code>:host</code></td></tr>
 * </tbody>
 * </table>
 * See
 * <a href="https://github.com/vaadin/vaadin-themable-mixin/wiki">ThemableMixin – how to apply styles for shadow parts</a>
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
	 * Fired when abort button is pressed. It is listened by <code>vaadin-upload</code> which
	 * will abort the upload in progress, but will not remove the file from the list
	 * to allow the animation to hide the element to be run.
	 */
	public ObservableEvent<UploadFileEvent> fileAbortEvent() {
		return createEvent("file-abort");
	}

	/**
	 * Fired after the animation to hide the element has finished. It is listened
	 * by <code>vaadin-upload</code> which will actually remove the file from the upload
	 * file list.
	 */
	public ObservableEvent<UploadFileEvent> fileRemoveEvent() {
		return createEvent("file-remove");
	}

	/**
	 * Fired when the retry button is pressed. It is listened by <code>vaadin-upload</code>
	 * which will start a new upload process of this file.
	 */
	public ObservableEvent<UploadFileEvent> fileRetryEvent() {
		return createEvent("file-retry");
	}

	/**
	 * Fired when the start button is pressed. It is listened by <code>vaadin-upload</code>
	 * which will start a new upload process of this file.
	 */
	public ObservableEvent<UploadFileEvent> fileStartEvent() {
		return createEvent("file-start");
	}
}
