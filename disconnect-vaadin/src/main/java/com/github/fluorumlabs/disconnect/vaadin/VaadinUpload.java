package com.github.fluorumlabs.disconnect.vaadin;

import com.github.fluorumlabs.disconnect.polymer.types.BooleanPropertyChangeEvent;
import com.github.fluorumlabs.disconnect.polymer.types.PropertyChangeEvent;
import com.github.fluorumlabs.disconnect.vaadin.constants.UploadMethod;
import com.github.fluorumlabs.disconnect.vaadin.elements.UploadElement;
import com.github.fluorumlabs.disconnect.vaadin.i18n.UploadI18n;
import com.github.fluorumlabs.disconnect.vaadin.mixins.HasThemableMixin;
import com.github.fluorumlabs.disconnect.vaadin.types.UploadEvent;
import com.github.fluorumlabs.disconnect.vaadin.types.UploadRejectEvent;
import com.github.fluorumlabs.disconnect.vaadin.types.UploadRequestEvent;
import com.github.fluorumlabs.disconnect.vaadin.types.UploadingFile;
import com.github.fluorumlabs.disconnect.zero.component.AbstractComponent;
import com.github.fluorumlabs.disconnect.zero.component.Component;
import com.github.fluorumlabs.disconnect.zero.component.HasSlottedComponents;
import com.github.fluorumlabs.disconnect.zero.observable.ObservableEvent;
import js.util.StringRecord;
import js.util.collections.Array;
import js.web.dom.Element;

import javax.annotation.Nullable;

/**
 * `<vaadin-upload>` is a Web Component for uploading multiple files with drag and drop support.
 * <p>
 * Example:
 * <p>
 * ```
 * <vaadin-upload></vaadin-upload>
 * ```
 * <p>
 * ### Styling
 * <p>
 * The following shadow DOM parts are available for styling:
 * <p>
 * Part name | Description
 * ---|---
 * `primary-buttons` | Upload container
 * `upload-button` | Upload button
 * `drop-label` | Label for drop indicator
 * `drop-label-icon` | Icon for drop indicator
 * `file-list` | File list container
 * <p>
 * The following state attributes are available for styling:
 * <p>
 * Attribute | Description | Part name
 * ---|---|---
 * `nodrop` | Set when drag and drop is disabled (e. g., on touch devices) | `:host`
 * `dragover` | A file is being dragged over the element | `:host`
 * `dragover-valid` | A dragged file is valid with `maxFiles` and `accept` criteria | `:host`
 * <p>
 * See [ThemableMixin – how to apply styles for shadow parts](https://github.com/vaadin/vaadin-themable-mixin/wiki)
 */
public class VaadinUpload extends AbstractComponent<UploadElement>
		implements HasThemableMixin<UploadElement, VaadinUpload>,
		HasSlottedComponents<UploadElement, VaadinUpload, Component<? extends Element>> {
	public VaadinUpload() {
		super("vaadin-upload");
	}

	/**
	 * Define whether the element supports dropping files on it for uploading.
	 * By default it's enabled in desktop and disabled in touch devices
	 * because mobile devices do not support drag events in general. Setting
	 * it false means that drop is enabled even in touch-devices, and true
	 * disables drop in all devices.
	 */
	public boolean nodrop() {
		return getNode().isNodrop();
	}

	/**
	 * Define whether the element supports dropping files on it for uploading.
	 * By default it's enabled in desktop and disabled in touch devices
	 * because mobile devices do not support drag events in general. Setting
	 * it false means that drop is enabled even in touch-devices, and true
	 * disables drop in all devices.
	 */
	public VaadinUpload nodrop(boolean nodrop) {
		getNode().setNodrop(nodrop);
		return this;
	}

	/**
	 * The server URL. The default value is an empty string, which means that
	 * _window.location_ will be used.
	 */
	@Nullable
	public String target() {
		return getNode().getTarget();
	}

	/**
	 * The server URL. The default value is an empty string, which means that
	 * _window.location_ will be used.
	 */
	public VaadinUpload target(String target) {
		getNode().setTarget(target);
		return this;
	}

	/**
	 * HTTP Method used to send the files. Only POST and PUT are allowed.
	 */
	@Nullable
	public UploadMethod method() {
		return getNode().getMethod();
	}

	/**
	 * HTTP Method used to send the files. Only POST and PUT are allowed.
	 */
	public VaadinUpload method(UploadMethod method) {
		getNode().setMethod(method);
		return this;
	}

	/**
	 * Key-Value map to send to the server. If you set this property as an
	 * attribute, use a valid JSON string, for example:
	 * ```
	 * <vaadin-upload headers='{"X-Foo": "Bar"}'></vaadin-upload>
	 * ```
	 */
	@Nullable
	public StringRecord headers() {
		return getNode().getHeaders();
	}

	/**
	 * FIXME type Object | null | undefined
	 * Key-Value map to send to the server. If you set this property as an
	 * attribute, use a valid JSON string, for example:
	 * ```
	 * <vaadin-upload headers='{"X-Foo": "Bar"}'></vaadin-upload>
	 * ```
	 */
	public VaadinUpload headers(StringRecord headers) {
		getNode().setHeaders(headers);
		return this;
	}

	/**
	 * Max time in milliseconds for the entire upload process, if exceeded the
	 * request will be aborted. Zero means that there is no timeout.
	 */
	public int timeout() {
		return getNode().getTimeout();
	}

	/**
	 * Max time in milliseconds for the entire upload process, if exceeded the
	 * request will be aborted. Zero means that there is no timeout.
	 */
	public VaadinUpload timeout(int timeout) {
		getNode().setTimeout(timeout);
		return this;
	}

	/**
	 * The array of files being processed, or already uploaded.
	 * <p>
	 * Each element is a [`File`](https://developer.mozilla.org/en-US/docs/Web/API/File)
	 * object with a number of extra properties  to track the upload process:
	 * - `uploadTarget`: The target URL used to upload this file.
	 * - `elapsed`: Elapsed time since the upload started.
	 * - `elapsedStr`: Human-readable elapsed time.
	 * - `remaining`: Number of seconds remaining for the upload to finish.
	 * - `remainingStr`: Human-readable remaining time for the upload to finish.
	 * - `progress`: Percentage of the file already uploaded.
	 * - `speed`: Upload speed in kB/s.
	 * - `size`: File size in bytes.
	 * - `totalStr`: Human-readable total size of the file.
	 * - `loaded`: Bytes transferred so far.
	 * - `loadedStr`: Human-readable uploaded size at the moment.
	 * - `status`: Status of the upload process.
	 * - `error`: Error message in case the upload failed.
	 * - `abort`: True if the file was canceled by the user.
	 * - `complete`: True when the file was transferred to the server.
	 * - `uploading`: True while transferring data to the server.
	 */
	@Nullable
	public Array<UploadingFile> files() {
		return getNode().getFiles();
	}

	/**
	 * The array of files being processed, or already uploaded.
	 * <p>
	 * Each element is a [`File`](https://developer.mozilla.org/en-US/docs/Web/API/File)
	 * object with a number of extra properties  to track the upload process:
	 * - `uploadTarget`: The target URL used to upload this file.
	 * - `elapsed`: Elapsed time since the upload started.
	 * - `elapsedStr`: Human-readable elapsed time.
	 * - `remaining`: Number of seconds remaining for the upload to finish.
	 * - `remainingStr`: Human-readable remaining time for the upload to finish.
	 * - `progress`: Percentage of the file already uploaded.
	 * - `speed`: Upload speed in kB/s.
	 * - `size`: File size in bytes.
	 * - `totalStr`: Human-readable total size of the file.
	 * - `loaded`: Bytes transferred so far.
	 * - `loadedStr`: Human-readable uploaded size at the moment.
	 * - `status`: Status of the upload process.
	 * - `error`: Error message in case the upload failed.
	 * - `abort`: True if the file was canceled by the user.
	 * - `complete`: True when the file was transferred to the server.
	 * - `uploading`: True while transferring data to the server.
	 */
	public VaadinUpload files(UploadingFile... files) {
		getNode().setFiles(files);
		return this;
	}

	public VaadinUpload files(Array<UploadingFile> files) {
		getNode().setFiles(files);
		return this;
	}

	/**
	 * Limit of files to upload, by default it is unlimited. If the value is
	 * set to one, native file browser will prevent selecting multiple files.
	 */
	public int maxFiles() {
		return getNode().getMaxFiles();
	}

	/**
	 * Limit of files to upload, by default it is unlimited. If the value is
	 * set to one, native file browser will prevent selecting multiple files.
	 */
	public VaadinUpload maxFiles(int maxFiles) {
		getNode().setMaxFiles(maxFiles);
		return this;
	}

	/**
	 * Specifies if the maximum number of files have been uploaded
	 */
	public boolean maxFilesReached() {
		return getNode().isMaxFilesReached();
	}

	/**
	 * Specifies the types of files that the server accepts.
	 * Syntax: a comma-separated list of MIME type patterns (wildcards are
	 * allowed) or file extensions.
	 * Notice that MIME types are widely supported, while file extensions
	 * are only implemented in certain browsers, so avoid using it.
	 * Example: accept="video/*,image/tiff" or accept=".pdf,audio/mp3"
	 */
	@Nullable
	public String accept() {
		return getNode().getAccept();
	}

	/**
	 * Specifies the types of files that the server accepts.
	 * Syntax: a comma-separated list of MIME type patterns (wildcards are
	 * allowed) or file extensions.
	 * Notice that MIME types are widely supported, while file extensions
	 * are only implemented in certain browsers, so avoid using it.
	 * Example: accept="video/*,image/tiff" or accept=".pdf,audio/mp3"
	 */
	public VaadinUpload accept(String accept) {
		getNode().setAccept(accept);
		return this;
	}

	/**
	 * Specifies the maximum file size in bytes allowed to upload.
	 * Notice that it is a client-side constraint, which will be checked before
	 * sending the request. Obviously you need to do the same validation in
	 * the server-side and be sure that they are aligned.
	 */
	public int maxFileSize() {
		return getNode().getMaxFileSize();
	}

	/**
	 * Specifies the maximum file size in bytes allowed to upload.
	 * Notice that it is a client-side constraint, which will be checked before
	 * sending the request. Obviously you need to do the same validation in
	 * the server-side and be sure that they are aligned.
	 */
	public VaadinUpload maxFileSize(int maxFileSize) {
		getNode().setMaxFileSize(maxFileSize);
		return this;
	}

	/**
	 * Specifies the 'name' property at Content-Disposition
	 */
	@Nullable
	public String formDataName() {
		return getNode().getFormDataName();
	}

	/**
	 * Specifies the 'name' property at Content-Disposition
	 */
	public VaadinUpload formDataName(String formDataName) {
		getNode().setFormDataName(formDataName);
		return this;
	}

	/**
	 * Prevents upload(s) from immediately uploading upon adding file(s).
	 * When set, you must manually trigger uploads using the `uploadFiles` method
	 */
	public boolean noAuto() {
		return getNode().isNoAuto();
	}

	/**
	 * Prevents upload(s) from immediately uploading upon adding file(s).
	 * When set, you must manually trigger uploads using the `uploadFiles` method
	 */
	public VaadinUpload noAuto(boolean noAuto) {
		getNode().setNoAuto(noAuto);
		return this;
	}

	/**
	 * Set the withCredentials flag on the request.
	 */
	public boolean withCredentials() {
		return getNode().isWithCredentials();
	}

	/**
	 * Set the withCredentials flag on the request.
	 */
	public VaadinUpload withCredentials(boolean withCredentials) {
		getNode().setWithCredentials(withCredentials);
		return this;
	}

	/**
	 * Pass-through to input's capture attribute. Allows user to trigger device inputs
	 * such as camera or microphone immediately.
	 */
	@Nullable
	public String capture() {
		return getNode().getCapture();
	}

	/**
	 * Pass-through to input's capture attribute. Allows user to trigger device inputs
	 * such as camera or microphone immediately.
	 */
	public VaadinUpload capture(String capture) {
		getNode().setCapture(capture);
		return this;
	}

	/**
	 * The object used to localize this component.
	 * For changing the default localization, change the entire
	 * _i18n_ object or just the property you want to modify.
	 * <p>
	 * The object has the following JSON structure and default values:
	 * <p>
	 * {
	 * dropFiles: {
	 * one: 'Drop file here
	 * many: 'Drop files here
	 * },
	 * addFiles: {
	 * one: 'Select File...',
	 * many: 'Upload Files...'
	 * },
	 * cancel: 'Cancel',
	 * error: {
	 * tooManyFiles: 'Too Many Files.',
	 * fileIsTooBig: 'File is Too Big.',
	 * incorrectFileType: 'Incorrect File Type.'
	 * },
	 * uploading: {
	 * status: {
	 * connecting: 'Connecting...',
	 * stalled: 'Stalled.',
	 * processing: 'Processing File...',
	 * held: 'Queued'
	 * },
	 * remainingTime: {
	 * prefix: 'remaining time: ',
	 * unknown: 'unknown remaining time'
	 * },
	 * error: {
	 * serverUnavailable: 'Server Unavailable',
	 * unexpectedServerError: 'Unexpected Server Error',
	 * forbidden: 'Forbidden'
	 * }
	 * },
	 * units: {
	 * size: ['B', 'kB', 'MB', 'GB', 'TB', 'PB', 'EB', 'ZB', 'YB']
	 * },
	 * formatSize: function(bytes) {
	 * // returns the size followed by the best suitable unit
	 * },
	 * formatTime: function(seconds, [secs, mins, hours]) {
	 * // returns a 'HH:MM:SS' string
	 * }
	 * }
	 */
	@Nullable
	public UploadI18n i18n() {
		return getNode().getI18n();
	}

	/**
	 * The object used to localize this component.
	 * For changing the default localization, change the entire
	 * _i18n_ object or just the property you want to modify.
	 * <p>
	 * The object has the following JSON structure and default values:
	 * <p>
	 * {
	 * dropFiles: {
	 * one: 'Drop file here
	 * many: 'Drop files here
	 * },
	 * addFiles: {
	 * one: 'Select File...',
	 * many: 'Upload Files...'
	 * },
	 * cancel: 'Cancel',
	 * error: {
	 * tooManyFiles: 'Too Many Files.',
	 * fileIsTooBig: 'File is Too Big.',
	 * incorrectFileType: 'Incorrect File Type.'
	 * },
	 * uploading: {
	 * status: {
	 * connecting: 'Connecting...',
	 * stalled: 'Stalled.',
	 * processing: 'Processing File...',
	 * held: 'Queued'
	 * },
	 * remainingTime: {
	 * prefix: 'remaining time: ',
	 * unknown: 'unknown remaining time'
	 * },
	 * error: {
	 * serverUnavailable: 'Server Unavailable',
	 * unexpectedServerError: 'Unexpected Server Error',
	 * forbidden: 'Forbidden'
	 * }
	 * },
	 * units: {
	 * size: ['B', 'kB', 'MB', 'GB', 'TB', 'PB', 'EB', 'ZB', 'YB']
	 * },
	 * formatSize: function(bytes) {
	 * // returns the size followed by the best suitable unit
	 * },
	 * formatTime: function(seconds, [secs, mins, hours]) {
	 * // returns a 'HH:MM:SS' string
	 * }
	 * }
	 */
	public VaadinUpload i18n(UploadI18n i18n) {
		getNode().setI18n(i18n);
		return this;
	}

	/**
	 * Triggers the upload of any files that are not completed
	 */
	public void uploadFiles(UploadingFile... files) {
		getNode().uploadFiles(files);
	}

	public void uploadFiles(Array<UploadingFile> files) {
		getNode().uploadFiles(files);
	}

	/**
	 * Fired when a file cannot be added to the queue due to a constrain:
	 * file-size, file-type or maxFiles
	 */
	public ObservableEvent<UploadRejectEvent> fileRejectEvent() {
		return createEvent("file-reject");
	}

	/**
	 * Fired when retry abort is requested. If the default is prevented, then the
	 * file upload would not be aborted.
	 */
	public ObservableEvent<UploadEvent> uploadAbortEvent() {
		return createEvent("upload-abort");
	}

	/**
	 * Fired before the XHR is opened. Could be used for changing the request
	 * URL. If the default is prevented, then XHR would not be opened.
	 */
	public ObservableEvent<UploadEvent> uploadBeforeEvent() {
		return createEvent("upload-before");
	}

	/**
	 * Fired in case the upload process failed.
	 */
	public ObservableEvent<UploadEvent> uploadErrorEvent() {
		return createEvent("upload-error");
	}

	/**
	 * Fired as many times as the progress is updated.
	 */
	public ObservableEvent<UploadEvent> uploadProgressEvent() {
		return createEvent("upload-progress");
	}

	/**
	 * Fired when the XHR has been opened but not sent yet. Useful for appending
	 * data keys to the FormData object, for changing some parameters like
	 * headers, etc. If the event is defaultPrevented, `vaadin-upload` will not
	 * send the request allowing the user to do something on his own.
	 */
	public ObservableEvent<UploadRequestEvent> uploadRequestEvent() {
		return createEvent("upload-request");
	}

	/**
	 * Fired when we have the actual server response, and before the component
	 * analyses it. It's useful for developers to make the upload fail depending
	 * on the server response. If the event is defaultPrevented the vaadin-upload
	 * will return allowing the user to do something on his own like retry the
	 * upload, etc. since he has full access to the `xhr` and `file` objects.
	 * Otherwise, if the event is not prevented default `vaadin-upload` continues
	 * with the normal workflow checking the `xhr.status` and `file.error`
	 * which also might be modified by the user to force a customized response.
	 */
	public ObservableEvent<UploadEvent> uploadResponseEvent() {
		return createEvent("upload-response");
	}

	/**
	 * Fired when retry upload is requested. If the default is prevented, then
	 * retry would not be performed.
	 */
	public ObservableEvent<UploadEvent> uploadRetryEvent() {
		return createEvent("upload-retry");
	}

	/**
	 * Fired when the XHR is sent.
	 */
	public ObservableEvent<UploadEvent> uploadStartEvent() {
		return createEvent("upload-start");
	}

	/**
	 * Fired in case the upload process succeed.
	 */
	public ObservableEvent<UploadEvent> uploadSuccessEvent() {
		return createEvent("upload-success");
	}

	/**
	 * Fired when the `files` property changes.
	 */
	public ObservableEvent<PropertyChangeEvent<Array<UploadingFile>>> filesChangedEvent() {
		return createEvent("files-changed");
	}

	/**
	 * Fired when the `maxFilesReached` property changes.
	 */
	public ObservableEvent<BooleanPropertyChangeEvent> maxFilesReachedChangedEvent() {
		return createEvent("max-files-reached-changed");
	}

	public VaadinUpload setAddButton(Component<? extends Element> component) {
		return replaceSlotted("add-button", component);
	}

	public VaadinUpload setAddButton(Component<? extends Element>... components) {
		return replaceSlotted("add-button", components);
	}

	public VaadinUpload addToAddButton(Component<? extends Element> component) {
		return addSlotted("add-button", component);
	}

	public VaadinUpload addToAddButton(Component<? extends Element>... components) {
		return addSlotted("add-button", components);
	}

	public VaadinUpload insertToAddButton(Component<? extends Element> component) {
		return insertSlotted("add-button", component);
	}

	public VaadinUpload insertToAddButton(Component<? extends Element>... components) {
		return insertSlotted("add-button", components);
	}

	public VaadinUpload clearAddButton() {
		return removeAllSlotted("add-button");
	}

	public VaadinUpload setDropLabelIcon(Component<? extends Element> component) {
		return replaceSlotted("drop-label-icon", component);
	}

	public VaadinUpload setDropLabelIcon(Component<? extends Element>... components) {
		return replaceSlotted("drop-label-icon", components);
	}

	public VaadinUpload addToDropLabelIcon(Component<? extends Element> component) {
		return addSlotted("drop-label-icon", component);
	}

	public VaadinUpload addToDropLabelIcon(Component<? extends Element>... components) {
		return addSlotted("drop-label-icon", components);
	}

	public VaadinUpload insertToDropLabelIcon(Component<? extends Element> component) {
		return insertSlotted("drop-label-icon", component);
	}

	public VaadinUpload insertToDropLabelIcon(Component<? extends Element>... components) {
		return insertSlotted("drop-label-icon", components);
	}

	public VaadinUpload clearDropLabelIcon() {
		return removeAllSlotted("drop-label-icon");
	}

	public VaadinUpload setDropLabel(Component<? extends Element> component) {
		return replaceSlotted("drop-label", component);
	}

	public VaadinUpload setDropLabel(Component<? extends Element>... components) {
		return replaceSlotted("drop-label", components);
	}

	public VaadinUpload addToDropLabel(Component<? extends Element> component) {
		return addSlotted("drop-label", component);
	}

	public VaadinUpload addToDropLabel(Component<? extends Element>... components) {
		return addSlotted("drop-label", components);
	}

	public VaadinUpload insertToDropLabel(Component<? extends Element> component) {
		return insertSlotted("drop-label", component);
	}

	public VaadinUpload insertToDropLabel(Component<? extends Element>... components) {
		return insertSlotted("drop-label", components);
	}

	public VaadinUpload clearDropLabel() {
		return removeAllSlotted("drop-label");
	}

	public VaadinUpload setFileList(Component<? extends Element> component) {
		return replaceSlotted("file-list", component);
	}

	public VaadinUpload setFileList(Component<? extends Element>... components) {
		return replaceSlotted("file-list", components);
	}

	public VaadinUpload addToFileList(Component<? extends Element> component) {
		return addSlotted("file-list", component);
	}

	public VaadinUpload addToFileList(Component<? extends Element>... components) {
		return addSlotted("file-list", components);
	}

	public VaadinUpload insertToFileList(Component<? extends Element> component) {
		return insertSlotted("file-list", component);
	}

	public VaadinUpload insertToFileList(Component<? extends Element>... components) {
		return insertSlotted("file-list", components);
	}

	public VaadinUpload clearFileList() {
		return removeAllSlotted("file-list");
	}
}
