package com.github.fluorumlabs.disconnect.vaadin;

import com.github.fluorumlabs.disconnect.polymer.types.BooleanPropertyChangeEvent;
import com.github.fluorumlabs.disconnect.polymer.types.PropertyChangeEvent;
import com.github.fluorumlabs.disconnect.vaadin.constants.UploadMethod;
import com.github.fluorumlabs.disconnect.vaadin.elements.UploadElement;
import com.github.fluorumlabs.disconnect.vaadin.i18n.UploadI18n;
import com.github.fluorumlabs.disconnect.vaadin.types.UploadEvent;
import com.github.fluorumlabs.disconnect.vaadin.types.UploadRejectEvent;
import com.github.fluorumlabs.disconnect.vaadin.types.UploadRequestEvent;
import com.github.fluorumlabs.disconnect.vaadin.types.UploadingFile;
import com.github.fluorumlabs.disconnect.zero.component.AbstractComponent;
import com.github.fluorumlabs.disconnect.zero.component.Component;
import com.github.fluorumlabs.disconnect.zero.component.HasComponents;
import com.github.fluorumlabs.disconnect.zero.component.HasSlots;
import com.github.fluorumlabs.disconnect.zero.observable.ObservableEvent;
import js.util.StringRecord;
import js.util.collections.Array;

import javax.annotation.Nullable;

/**
 * <code>&lt;vaadin-upload&gt;</code> is a Web Component for uploading multiple files with drag and drop support.
 * <p>
 * Example:
 *
 * <pre><code>&lt;vaadin-upload&gt;&lt;/vaadin-upload&gt;
 * </code></pre>
 * <h3>Styling</h3>
 * The following shadow DOM parts are available for styling:
 *
 * <table>
 * <thead>
 * <tr><th>Part name</th><th>Description</th></tr>
 * </thead>
 * <tbody>
 * <tr><td><code>primary-buttons</code></td><td>Upload container</td></tr>
 * <tr><td><code>upload-button</code></td><td>Upload button</td></tr>
 * <tr><td><code>drop-label</code></td><td>Label for drop indicator</td></tr>
 * <tr><td><code>drop-label-icon</code></td><td>Icon for drop indicator</td></tr>
 * <tr><td><code>file-list</code></td><td>File list container</td></tr>
 * </tbody>
 * </table>
 * The following state attributes are available for styling:
 *
 * <table>
 * <thead>
 * <tr><th>Attribute</th><th>Description</th><th>Part name</th></tr>
 * </thead>
 * <tbody>
 * <tr><td><code>nodrop</code></td><td>Set when drag and drop is disabled (e. g., on touch devices)
 * </td><td><code>:host</code></td></tr>
 * <tr><td><code>dragover</code></td><td>A file is being dragged over the element</td><td><code>:host</code></td></tr>
 * <tr><td><code>dragover-valid</code></td><td>A dragged file is valid with <code>maxFiles</code> and
 * <code>accept</code> criteria</td><td><code>:host</code></td></tr>
 * </tbody>
 * </table>
 * See
 * <a href="https://github.com/vaadin/vaadin-themable-mixin/wiki">ThemableMixin – how to apply styles for shadow parts</a>
 */
public class VaadinUpload extends AbstractComponent<UploadElement>
		implements HasSlots<UploadElement>,
		HasComponents<UploadElement, VaadinUpload, Component<?>> {
	public VaadinUpload() {
		super(UploadElement.TAGNAME());
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
	 * <em>window.location</em> will be used.
	 */
	@Nullable
	public String target() {
		return getNode().getTarget();
	}

	/**
	 * The server URL. The default value is an empty string, which means that
	 * <em>window.location</em> will be used.
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
	 *
	 * <pre><code>&lt;vaadin-upload headers='{&quot;X-Foo&quot;: &quot;Bar&quot;}'&gt;&lt;/vaadin-upload&gt;
	 * </code></pre>
	 */
	@Nullable
	public StringRecord headers() {
		return getNode().getHeaders();
	}

	/**
	 * FIXME type Object | null | undefined
	 * Key-Value map to send to the server. If you set this property as an
	 * attribute, use a valid JSON string, for example:
	 *
	 * <pre><code>&lt;vaadin-upload headers='{&quot;X-Foo&quot;: &quot;Bar&quot;}'&gt;&lt;/vaadin-upload&gt;
	 * </code></pre>
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
	 * Each element is a <a href="https://developer.mozilla.org/en-US/docs/Web/API/File"><code>File</code></a>
	 * object with a number of extra properties  to track the upload process:
	 *
	 * <ul>
	 * <li><code>uploadTarget</code>: The target URL used to upload this file.</li>
	 * <li><code>elapsed</code>: Elapsed time since the upload started.</li>
	 * <li><code>elapsedStr</code>: Human-readable elapsed time.</li>
	 * <li><code>remaining</code>: Number of seconds remaining for the upload to finish.</li>
	 * <li><code>remainingStr</code>: Human-readable remaining time for the upload to finish.</li>
	 * <li><code>progress</code>: Percentage of the file already uploaded.</li>
	 * <li><code>speed</code>: Upload speed in kB/s.</li>
	 * <li><code>size</code>: File size in bytes.</li>
	 * <li><code>totalStr</code>: Human-readable total size of the file.</li>
	 * <li><code>loaded</code>: Bytes transferred so far.</li>
	 * <li><code>loadedStr</code>: Human-readable uploaded size at the moment.</li>
	 * <li><code>status</code>: Status of the upload process.</li>
	 * <li><code>error</code>: Error message in case the upload failed.</li>
	 * <li><code>abort</code>: True if the file was canceled by the user.</li>
	 * <li><code>complete</code>: True when the file was transferred to the server.</li>
	 * <li><code>uploading</code>: True while transferring data to the server.</li>
	 * </ul>
	 */
	@Nullable
	public Array<UploadingFile> files() {
		return getNode().getFiles();
	}

	/**
	 * The array of files being processed, or already uploaded.
	 * <p>
	 * Each element is a <a href="https://developer.mozilla.org/en-US/docs/Web/API/File"><code>File</code></a>
	 * object with a number of extra properties  to track the upload process:
	 *
	 * <ul>
	 * <li><code>uploadTarget</code>: The target URL used to upload this file.</li>
	 * <li><code>elapsed</code>: Elapsed time since the upload started.</li>
	 * <li><code>elapsedStr</code>: Human-readable elapsed time.</li>
	 * <li><code>remaining</code>: Number of seconds remaining for the upload to finish.</li>
	 * <li><code>remainingStr</code>: Human-readable remaining time for the upload to finish.</li>
	 * <li><code>progress</code>: Percentage of the file already uploaded.</li>
	 * <li><code>speed</code>: Upload speed in kB/s.</li>
	 * <li><code>size</code>: File size in bytes.</li>
	 * <li><code>totalStr</code>: Human-readable total size of the file.</li>
	 * <li><code>loaded</code>: Bytes transferred so far.</li>
	 * <li><code>loadedStr</code>: Human-readable uploaded size at the moment.</li>
	 * <li><code>status</code>: Status of the upload process.</li>
	 * <li><code>error</code>: Error message in case the upload failed.</li>
	 * <li><code>abort</code>: True if the file was canceled by the user.</li>
	 * <li><code>complete</code>: True when the file was transferred to the server.</li>
	 * <li><code>uploading</code>: True while transferring data to the server.</li>
	 * </ul>
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
	 * Example: accept=&quot;video/*,image/tiff&quot; or accept=&quot;.pdf,audio/mp3&quot;
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
	 * Example: accept=&quot;video/*,image/tiff&quot; or accept=&quot;.pdf,audio/mp3&quot;
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
	 * When set, you must manually trigger uploads using the <code>uploadFiles</code> method
	 */
	public boolean noAuto() {
		return getNode().isNoAuto();
	}

	/**
	 * Prevents upload(s) from immediately uploading upon adding file(s).
	 * When set, you must manually trigger uploads using the <code>uploadFiles</code> method
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
	 * <em>i18n</em> object or just the property you want to modify.
	 * <p>
	 * The object has the following JSON structure and default values:
	 *
	 * <pre><code>  {
	 *     dropFiles: {
	 *     one: 'Drop file here
	 *     many: 'Drop files here
	 *     },
	 *     addFiles: {
	 *     one: 'Select File...',
	 *     many: 'Upload Files...'
	 *     },
	 *     cancel: 'Cancel',
	 *     error: {
	 *     tooManyFiles: 'Too Many Files.',
	 *     fileIsTooBig: 'File is Too Big.',
	 *     incorrectFileType: 'Incorrect File Type.'
	 *     },
	 *     uploading: {
	 *     status: {
	 *       connecting: 'Connecting...',
	 *       stalled: 'Stalled.',
	 *       processing: 'Processing File...',
	 *       held: 'Queued'
	 *     },
	 *     remainingTime: {
	 *       prefix: 'remaining time: ',
	 *       unknown: 'unknown remaining time'
	 *     },
	 *     error: {
	 *       serverUnavailable: 'Server Unavailable',
	 *       unexpectedServerError: 'Unexpected Server Error',
	 *       forbidden: 'Forbidden'
	 *     }
	 *     },
	 *     units: {
	 *     size: ['B', 'kB', 'MB', 'GB', 'TB', 'PB', 'EB', 'ZB', 'YB']
	 *     },
	 *     formatSize: function(bytes) {
	 *     // returns the size followed by the best suitable unit
	 *     },
	 *     formatTime: function(seconds, [secs, mins, hours]) {
	 *     // returns a 'HH:MM:SS' string
	 *     }
	 *   }
	 * </code></pre>
	 */
	@Nullable
	public UploadI18n i18n() {
		return getNode().getI18n();
	}

	/**
	 * The object used to localize this component.
	 * For changing the default localization, change the entire
	 * <em>i18n</em> object or just the property you want to modify.
	 * <p>
	 * The object has the following JSON structure and default values:
	 *
	 * <pre><code>  {
	 *     dropFiles: {
	 *     one: 'Drop file here
	 *     many: 'Drop files here
	 *     },
	 *     addFiles: {
	 *     one: 'Select File...',
	 *     many: 'Upload Files...'
	 *     },
	 *     cancel: 'Cancel',
	 *     error: {
	 *     tooManyFiles: 'Too Many Files.',
	 *     fileIsTooBig: 'File is Too Big.',
	 *     incorrectFileType: 'Incorrect File Type.'
	 *     },
	 *     uploading: {
	 *     status: {
	 *       connecting: 'Connecting...',
	 *       stalled: 'Stalled.',
	 *       processing: 'Processing File...',
	 *       held: 'Queued'
	 *     },
	 *     remainingTime: {
	 *       prefix: 'remaining time: ',
	 *       unknown: 'unknown remaining time'
	 *     },
	 *     error: {
	 *       serverUnavailable: 'Server Unavailable',
	 *       unexpectedServerError: 'Unexpected Server Error',
	 *       forbidden: 'Forbidden'
	 *     }
	 *     },
	 *     units: {
	 *     size: ['B', 'kB', 'MB', 'GB', 'TB', 'PB', 'EB', 'ZB', 'YB']
	 *     },
	 *     formatSize: function(bytes) {
	 *     // returns the size followed by the best suitable unit
	 *     },
	 *     formatTime: function(seconds, [secs, mins, hours]) {
	 *     // returns a 'HH:MM:SS' string
	 *     }
	 *   }
	 * </code></pre>
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
	 * headers, etc. If the event is defaultPrevented, <code>vaadin-upload</code> will not
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
	 * upload, etc. since he has full access to the <code>xhr</code> and <code>file</code> objects.
	 * Otherwise, if the event is not prevented default <code>vaadin-upload</code> continues
	 * with the normal workflow checking the <code>xhr.status</code> and <code>file.error</code>
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
	 * Fired when the <code>files</code> property changes.
	 */
	public ObservableEvent<PropertyChangeEvent<Array<UploadingFile>>> filesChangedEvent() {
		return createEvent("files-changed");
	}

	/**
	 * Fired when the <code>maxFilesReached</code> property changes.
	 */
	public ObservableEvent<BooleanPropertyChangeEvent> maxFilesReachedChangedEvent() {
		return createEvent("max-files-reached-changed");
	}

	public HasSlots.Container addButtonSlot() {
		return slotted("add-button");
	}

	public HasSlots.Container dropLabelIconSlot() {
		return slotted("drop-label-icon");
	}

	public HasSlots.Container dropLabelSlot() {
		return slotted("drop-label");
	}

	public HasSlots.Container fileListSlot() {
		return slotted("file-list");
	}
}
