package com.github.fluorumlabs.disconnect.vaadin.elements;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.vaadin.Vaadin;
import com.github.fluorumlabs.disconnect.vaadin.constants.UploadMethod;
import com.github.fluorumlabs.disconnect.vaadin.elements.mixins.ThemableMixin;
import com.github.fluorumlabs.disconnect.vaadin.i18n.UploadI18n;
import com.github.fluorumlabs.disconnect.vaadin.types.UploadingFile;
import js.util.StringRecord;
import js.util.collections.Array;
import js.web.dom.HTMLElement;
import org.teavm.jso.JSByRef;
import org.teavm.jso.JSProperty;

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
@NpmPackage(
		name = "@vaadin/vaadin",
		version = Vaadin.VERSION
)
@Import(
		symbols = "UploadElement",
		module = "@vaadin/vaadin-upload/vaadin-upload.js"
)
public interface UploadElement extends HTMLElement, ThemableMixin {
	/**
	 * Define whether the element supports dropping files on it for uploading.
	 * By default it's enabled in desktop and disabled in touch devices
	 * because mobile devices do not support drag events in general. Setting
	 * it false means that drop is enabled even in touch-devices, and true
	 * disables drop in all devices.
	 */
	@JSProperty
	boolean isNodrop();

	/**
	 * Define whether the element supports dropping files on it for uploading.
	 * By default it's enabled in desktop and disabled in touch devices
	 * because mobile devices do not support drag events in general. Setting
	 * it false means that drop is enabled even in touch-devices, and true
	 * disables drop in all devices.
	 */
	@JSProperty
	void setNodrop(boolean nodrop);

	/**
	 * The server URL. The default value is an empty string, which means that
	 * <em>window.location</em> will be used.
	 */
	@Nullable
	@JSProperty
	String getTarget();

	/**
	 * The server URL. The default value is an empty string, which means that
	 * <em>window.location</em> will be used.
	 */
	@JSProperty
	void setTarget(String target);

	/**
	 * HTTP Method used to send the files. Only POST and PUT are allowed.
	 */
	@Nullable
	@JSProperty
	UploadMethod getMethod();

	/**
	 * HTTP Method used to send the files. Only POST and PUT are allowed.
	 */
	@JSProperty
	void setMethod(UploadMethod method);

	/**
	 * Key-Value map to send to the server. If you set this property as an
	 * attribute, use a valid JSON string, for example:
	 *
	 * <pre><code>&lt;vaadin-upload headers='{&quot;X-Foo&quot;: &quot;Bar&quot;}'&gt;&lt;/vaadin-upload&gt;
	 * </code></pre>
	 */
	@Nullable
	@JSProperty
	StringRecord getHeaders();

	/**
	 * Key-Value map to send to the server. If you set this property as an
	 * attribute, use a valid JSON string, for example:
	 *
	 * <pre><code>&lt;vaadin-upload headers='{&quot;X-Foo&quot;: &quot;Bar&quot;}'&gt;&lt;/vaadin-upload&gt;
	 * </code></pre>
	 */
	@JSProperty
	void setHeaders(StringRecord headers);

	/**
	 * Max time in milliseconds for the entire upload process, if exceeded the
	 * request will be aborted. Zero means that there is no timeout.
	 */
	@JSProperty
	int getTimeout();

	/**
	 * Max time in milliseconds for the entire upload process, if exceeded the
	 * request will be aborted. Zero means that there is no timeout.
	 */
	@JSProperty
	void setTimeout(int timeout);

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
	@JSProperty
	Array<UploadingFile> getFiles();

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
	@JSProperty
	void setFiles(@JSByRef UploadingFile... files);

	@JSProperty
	void setFiles(Array<UploadingFile> files);

	/**
	 * Limit of files to upload, by default it is unlimited. If the value is
	 * set to one, native file browser will prevent selecting multiple files.
	 */
	@JSProperty
	int getMaxFiles();

	/**
	 * Limit of files to upload, by default it is unlimited. If the value is
	 * set to one, native file browser will prevent selecting multiple files.
	 */
	@JSProperty
	void setMaxFiles(int maxFiles);

	/**
	 * Specifies if the maximum number of files have been uploaded
	 */
	@JSProperty
	boolean isMaxFilesReached();

	/**
	 * Specifies the types of files that the server accepts.
	 * Syntax: a comma-separated list of MIME type patterns (wildcards are
	 * allowed) or file extensions.
	 * Notice that MIME types are widely supported, while file extensions
	 * are only implemented in certain browsers, so avoid using it.
	 * Example: accept=&quot;video/*,image/tiff&quot; or accept=&quot;.pdf,audio/mp3&quot;
	 */
	@Nullable
	@JSProperty
	String getAccept();

	/**
	 * Specifies the types of files that the server accepts.
	 * Syntax: a comma-separated list of MIME type patterns (wildcards are
	 * allowed) or file extensions.
	 * Notice that MIME types are widely supported, while file extensions
	 * are only implemented in certain browsers, so avoid using it.
	 * Example: accept=&quot;video/*,image/tiff&quot; or accept=&quot;.pdf,audio/mp3&quot;
	 */
	@JSProperty
	void setAccept(String accept);

	/**
	 * Specifies the maximum file size in bytes allowed to upload.
	 * Notice that it is a client-side constraint, which will be checked before
	 * sending the request. Obviously you need to do the same validation in
	 * the server-side and be sure that they are aligned.
	 */
	@JSProperty
	int getMaxFileSize();

	/**
	 * Specifies the maximum file size in bytes allowed to upload.
	 * Notice that it is a client-side constraint, which will be checked before
	 * sending the request. Obviously you need to do the same validation in
	 * the server-side and be sure that they are aligned.
	 */
	@JSProperty
	void setMaxFileSize(int maxFileSize);

	/**
	 * Specifies the 'name' property at Content-Disposition
	 */
	@Nullable
	@JSProperty
	String getFormDataName();

	/**
	 * Specifies the 'name' property at Content-Disposition
	 */
	@JSProperty
	void setFormDataName(String formDataName);

	/**
	 * Prevents upload(s) from immediately uploading upon adding file(s).
	 * When set, you must manually trigger uploads using the <code>uploadFiles</code> method
	 */
	@JSProperty
	boolean isNoAuto();

	/**
	 * Prevents upload(s) from immediately uploading upon adding file(s).
	 * When set, you must manually trigger uploads using the <code>uploadFiles</code> method
	 */
	@JSProperty
	void setNoAuto(boolean noAuto);

	/**
	 * Set the withCredentials flag on the request.
	 */
	@JSProperty
	boolean isWithCredentials();

	/**
	 * Set the withCredentials flag on the request.
	 */
	@JSProperty
	void setWithCredentials(boolean withCredentials);

	/**
	 * Pass-through to input's capture attribute. Allows user to trigger device inputs
	 * such as camera or microphone immediately.
	 */
	@Nullable
	@JSProperty
	String getCapture();

	/**
	 * Pass-through to input's capture attribute. Allows user to trigger device inputs
	 * such as camera or microphone immediately.
	 */
	@JSProperty
	void setCapture(String capture);

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
	@JSProperty
	UploadI18n getI18n();

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
	@JSProperty
	void setI18n(UploadI18n i18n);

	/**
	 * Triggers the upload of any files that are not completed
	 */
	void uploadFiles(@JSByRef UploadingFile... files);

	void uploadFiles(Array<UploadingFile> files);
}
