package com.github.fluorumlabs.disconnect.vaadin.upload;

import com.github.fluorumlabs.disconnect.core.annotations.CustomElement;
import com.github.fluorumlabs.disconnect.core.components.Component;
import com.github.fluorumlabs.disconnect.core.components.HtmlComponent;
import com.github.fluorumlabs.disconnect.core.observables.ObservableEvent;
import com.github.fluorumlabs.disconnect.core.observables.ObservableValue;
import com.github.fluorumlabs.disconnect.core.utils.Mirrored;
import com.github.fluorumlabs.disconnect.core.utils.SerDes;
import com.github.fluorumlabs.disconnect.vaadin.theme.Themable;
import js.lang.Unknown;
import js.lang.external.vaadin.upload.UploadElement;
import js.lang.external.vaadin.upload.UploadFile;
import js.lang.external.vaadin.upload.UploadI18n;
import js.util.collections.Array;
import js.web.dom.Event;

import java.util.Map;

/**
 * <code>&lt;vaadin-upload&gt;</code> is a Web Component for uploading multiple files with drag and drop support.
 *
 * Example:
 *
 * <pre><code>&lt;vaadin-upload&gt;&lt;/vaadin-upload&gt;
 * </code></pre>
 * <h3>Styling</h3>
 * The following shadow DOM parts are available for styling:
 *
 * <table>
 *  <thead>
 *   <tr>
 *    <th>Part name</th>
 *    <th>Description</th>
 *   </tr>
 *  </thead>
 *  <tbody>
 *   <tr>
 *    <td><code>primary-buttons</code></td>
 *    <td>Upload container</td>
 *   </tr>
 *   <tr>
 *    <td><code>upload-button</code></td>
 *    <td>Upload button</td>
 *   </tr>
 *   <tr>
 *    <td><code>drop-label</code></td>
 *    <td>Label for drop indicator</td>
 *   </tr>
 *   <tr>
 *    <td><code>drop-label-icon</code></td>
 *    <td>Icon for drop indicator</td>
 *   </tr>
 *   <tr>
 *    <td><code>file-list</code></td>
 *    <td>File list container</td>
 *   </tr>
 *  </tbody>
 * </table>
 * The following state attributes are available for styling:
 *
 * <table>
 *  <thead>
 *   <tr>
 *    <th>Attribute</th>
 *    <th>Description</th>
 *    <th>Part name</th>
 *   </tr>
 *  </thead>
 *  <tbody>
 *   <tr>
 *    <td><code>nodrop</code></td>
 *    <td>Set when drag and drop is disabled (e. g., on touch devices)</td>
 *    <td><code>:host</code></td>
 *   </tr>
 *   <tr>
 *    <td><code>dragover</code></td>
 *    <td>A file is being dragged over the element</td>
 *    <td><code>:host</code></td>
 *   </tr>
 *   <tr>
 *    <td><code>dragover-valid</code></td>
 *    <td>A dragged file is valid with <code>maxFiles</code> and <code>accept</code> criteria</td>
 *    <td><code>:host</code></td>
 *   </tr>
 *  </tbody>
 * </table>
 * See <a href="https://github.com/vaadin/vaadin-themable-mixin/wiki">ThemableMixin â€“ how to apply styles for shadow parts</a>
 *
 * <strong>Mixins:</strong> ElementMixin, ThemableMixin, ElementMixin
 *
 * <h2>Example</h2>
 * <pre><code class="language-javascript">demo/index.html
 * </code></pre>
 */
@CustomElement(tagName = "vaadin-upload", external = true)
public class Upload extends HtmlComponent<UploadElement> implements Themable<UploadElement> {

    public Upload() {
    }

    public Upload(String textContent) {
        super(textContent);
    }

    public Upload(Component<?>... components) {
        super(components);
    }

    // !wca! uploadFiles: (files?: !UploadFile | !Array<!UploadFile>=): void
    /**
     * Triggers the upload of any files that are not completed
     *
     * <strong>files</strong>: Files being uploaded. Defaults to all outstanding files
     */
    public void uploadFiles(Array<js.lang.external.vaadin.upload.UploadFile> files) {
        getElement().uploadFiles(Unknown.of(files));
    }

    // !wca! get accept: string
    /**
     * Specifies the types of files that the server accepts.
     * Syntax: a comma-separated list of MIME type patterns (wildcards are
     * allowed) or file extensions.
     * Notice that MIME types are widely supported, while file extensions
     * are only implemented in certain browsers, so avoid using it.
     * Example: accept="video/*,image/tiff" or accept=".pdf,audio/mp3"
     */
    public String getAccept() {
        return getElement().getAccept();
    }

    // !wca! set accept: string
    /**
     * Specifies the types of files that the server accepts.
     * Syntax: a comma-separated list of MIME type patterns (wildcards are
     * allowed) or file extensions.
     * Notice that MIME types are widely supported, while file extensions
     * are only implemented in certain browsers, so avoid using it.
     * Example: accept="video/*,image/tiff" or accept=".pdf,audio/mp3"
     */
    public void setAccept(String value) {
        getElement().setAccept(value);
    }

    // !wca! observe accept: string

    // !wca! get capture: string
    /**
     * Pass-through to input's capture attribute. Allows user to trigger device inputs
     * such as camera or microphone immediately.
     */
    public String getCapture() {
        return getElement().getCapture();
    }

    // !wca! set capture: string
    /**
     * Pass-through to input's capture attribute. Allows user to trigger device inputs
     * such as camera or microphone immediately.
     */
    public void setCapture(String value) {
        getElement().setCapture(value);
    }

    // !wca! observe capture: string

    // !wca! get files: !Array<!UploadFile>
    /**
     * The array of files being processed, or already uploaded.
     *
     * Each element is a <a href="https://developer.mozilla.org/en-US/docs/Web/API/File"><code>File</code></a>
     * object with a number of extra properties to track the upload process:
     * - <code>uploadTarget</code>: The target URL used to upload this file.
     * - <code>elapsed</code>: Elapsed time since the upload started.
     * - <code>elapsedStr</code>: Human-readable elapsed time.
     * - <code>remaining</code>: Number of seconds remaining for the upload to finish.
     * - <code>remainingStr</code>: Human-readable remaining time for the upload to finish.
     * - <code>progress</code>: Percentage of the file already uploaded.
     * - <code>speed</code>: Upload speed in kB/s.
     * - <code>size</code>: File size in bytes.
     * - <code>totalStr</code>: Human-readable total size of the file.
     * - <code>loaded</code>: Bytes transferred so far.
     * - <code>loadedStr</code>: Human-readable uploaded size at the moment.
     * - <code>status</code>: Status of the upload process.
     * - <code>error</code>: Error message in case the upload failed.
     * - <code>abort</code>: True if the file was canceled by the user.
     * - <code>complete</code>: True when the file was transferred to the server.
     * - <code>uploading</code>: True while transferring data to the server.
     * @return
     */
    public Array<UploadFile> getFiles() {
        return getElement().getFiles();
    }

    // !wca! set files: !Array<!UploadFile>
    /**
     * The array of files being processed, or already uploaded.
     *
     * Each element is a <a href="https://developer.mozilla.org/en-US/docs/Web/API/File"><code>File</code></a>
     * object with a number of extra properties to track the upload process:
     * - <code>uploadTarget</code>: The target URL used to upload this file.
     * - <code>elapsed</code>: Elapsed time since the upload started.
     * - <code>elapsedStr</code>: Human-readable elapsed time.
     * - <code>remaining</code>: Number of seconds remaining for the upload to finish.
     * - <code>remainingStr</code>: Human-readable remaining time for the upload to finish.
     * - <code>progress</code>: Percentage of the file already uploaded.
     * - <code>speed</code>: Upload speed in kB/s.
     * - <code>size</code>: File size in bytes.
     * - <code>totalStr</code>: Human-readable total size of the file.
     * - <code>loaded</code>: Bytes transferred so far.
     * - <code>loadedStr</code>: Human-readable uploaded size at the moment.
     * - <code>status</code>: Status of the upload process.
     * - <code>error</code>: Error message in case the upload failed.
     * - <code>abort</code>: True if the file was canceled by the user.
     * - <code>complete</code>: True when the file was transferred to the server.
     * - <code>uploading</code>: True while transferring data to the server.
     */
    public void setFiles(Array<UploadFile> value) {
        getElement().setFiles(value);
    }

    // !wca! observe files: !Array<!UploadFile>
    /**
     * The array of files being processed, or already uploaded.
     *
     * Each element is a <a href="https://developer.mozilla.org/en-US/docs/Web/API/File"><code>File</code></a>
     * object with a number of extra properties to track the upload process:
     * - <code>uploadTarget</code>: The target URL used to upload this file.
     * - <code>elapsed</code>: Elapsed time since the upload started.
     * - <code>elapsedStr</code>: Human-readable elapsed time.
     * - <code>remaining</code>: Number of seconds remaining for the upload to finish.
     * - <code>remainingStr</code>: Human-readable remaining time for the upload to finish.
     * - <code>progress</code>: Percentage of the file already uploaded.
     * - <code>speed</code>: Upload speed in kB/s.
     * - <code>size</code>: File size in bytes.
     * - <code>totalStr</code>: Human-readable total size of the file.
     * - <code>loaded</code>: Bytes transferred so far.
     * - <code>loadedStr</code>: Human-readable uploaded size at the moment.
     * - <code>status</code>: Status of the upload process.
     * - <code>error</code>: Error message in case the upload failed.
     * - <code>abort</code>: True if the file was canceled by the user.
     * - <code>complete</code>: True when the file was transferred to the server.
     * - <code>uploading</code>: True while transferring data to the server.
     */
    public ObservableValue<Array<UploadFile>> files() {
        return createObservableValue(this::getFiles, this::setFiles, "files-changed");
    }

    // !wca! get formDataName: string
    /**
     * Specifies the 'name' property at Content-Disposition
     */
    public String getFormDataName() {
        return getElement().getFormDataName();
    }

    // !wca! set formDataName: string
    /**
     * Specifies the 'name' property at Content-Disposition
     */
    public void setFormDataName(String value) {
        getElement().setFormDataName(value);
    }

    // !wca! observe formDataName: string

    // !wca! get headers: object | string
    /**
     * Key-Value map to send to the server. If you set this property as an
     * attribute, use a valid JSON string, for example:
     * <code>&lt;br /&gt;&lt;vaadin-upload headers='{"X-Foo": "Bar"}'&gt;&lt;/vaadin-upload&gt;&lt;br /&gt;</code>
     */
    public Map<String,String> getHeaders() {
        return SerDes.deserializeMap(getElement().getHeaders().<Mirrored<Map<String,String>>>cast(), String.class);
    }

    // !wca! set headers: object | string
    /**
     * Key-Value map to send to the server. If you set this property as an
     * attribute, use a valid JSON string, for example:
     * <code>&lt;br /&gt;&lt;vaadin-upload headers='{"X-Foo": "Bar"}'&gt;&lt;/vaadin-upload&gt;&lt;br /&gt;</code>
     */
    public void setHeaders(Map<String,String> value) {
        getElement().setHeaders(SerDes.serialize(value).cast());
    }

    // !wca! observe headers: object | string

    // !wca! get i18n: !UploadI18n

    // !wca! set i18n: !UploadI18n
    /**
     * The object used to localize this component.
     * For changing the default localization, change the entire
     * <em>i18n</em> object or just the property you want to modify.
     *
     * The object has the following JSON structure and default values:
     *
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
     *  connecting: 'Connecting...',
     *  stalled: 'Stalled.',
     *  processing: 'Processing File...',
     *  held: 'Queued'
     * },
     * remainingTime: {
     *  prefix: 'remaining time: ',
     *  unknown: 'unknown remaining time'
     * },
     * error: {
     *  serverUnavailable: 'Server Unavailable',
     *  unexpectedServerError: 'Unexpected Server Error',
     *  forbidden: 'Forbidden'
     * }
     * },
     * units: {
     * size: ['B', 'kB', 'MB', 'GB', 'TB', 'PB', 'EB', 'ZB', 'YB'],
     * sizeBase: 1000
     * },
     * formatSize: function(bytes) {
     * // returns the size followed by the best suitable unit
     * },
     * formatTime: function(seconds, [secs, mins, hours]) {
     * // returns a 'HH:MM:SS' string
     * }
     * }
     * @param value
     */
    public void setI18n(UploadI18n value) {
        getElement().setI18n(value);
    }

    // !wca! observe i18n: !UploadI18n

    // !wca! get maxFileSize: number
    /**
     * Specifies the maximum file size in bytes allowed to upload.
     * Notice that it is a client-side constraint, which will be checked before
     * sending the request. Obviously you need to do the same validation in
     * the server-side and be sure that they are aligned.
     */
    public int getMaxFileSize() {
        return getElement().getMaxFileSize();
    }

    // !wca! set maxFileSize: number
    /**
     * Specifies the maximum file size in bytes allowed to upload.
     * Notice that it is a client-side constraint, which will be checked before
     * sending the request. Obviously you need to do the same validation in
     * the server-side and be sure that they are aligned.
     */
    public void setMaxFileSize(int value) {
        getElement().setMaxFileSize(value);
    }

    // !wca! observe maxFileSize: number

    // !wca! get maxFiles: number
    /**
     * Limit of files to upload, by default it is unlimited. If the value is
     * set to one, native file browser will prevent selecting multiple files.
     */
    public int getMaxFiles() {
        return getElement().getMaxFiles();
    }

    // !wca! set maxFiles: number
    /**
     * Limit of files to upload, by default it is unlimited. If the value is
     * set to one, native file browser will prevent selecting multiple files.
     */
    public void setMaxFiles(int value) {
        getElement().setMaxFiles(value);
    }

    // !wca! observe maxFiles: number

    // !wca! get maxFilesReached: boolean
    /**
     * Specifies if the maximum number of files have been uploaded
     */
    public boolean isMaxFilesReached() {
        return getElement().isMaxFilesReached();
    }

    // !wca! set maxFilesReached: boolean
    /**
     * Specifies if the maximum number of files have been uploaded
     */
    public void setMaxFilesReached(boolean value) {
        getElement().setMaxFilesReached(value);
    }

    // !wca! observe maxFilesReached: boolean
    /**
     * Specifies if the maximum number of files have been uploaded
     */
    public ObservableValue<Boolean> maxFilesReached() {
        return createObservableValue(this::isMaxFilesReached, this::setMaxFilesReached, "max-files-reached-changed");
    }

    // !wca! get method: !UploadMethod
    /**
     * HTTP Method used to send the files. Only POST and PUT are allowed.
     */
    public String getMethod() {
        return getElement().getMethod();
    }

    // !wca! set method: !UploadMethod
    /**
     * HTTP Method used to send the files. Only POST and PUT are allowed.
     */
    public void setMethod(String value) {
        getElement().setMethod(value);
    }

    // !wca! observe method: !UploadMethod

    // !wca! get noAuto: boolean
    /**
     * Prevents upload(s) from immediately uploading upon adding file(s).
     * When set, you must manually trigger uploads using the <code>uploadFiles</code> method
     */
    public boolean isNoAuto() {
        return getElement().isNoAuto();
    }

    // !wca! set noAuto: boolean
    /**
     * Prevents upload(s) from immediately uploading upon adding file(s).
     * When set, you must manually trigger uploads using the <code>uploadFiles</code> method
     */
    public void setNoAuto(boolean value) {
        getElement().setNoAuto(value);
    }

    // !wca! observe noAuto: boolean

    // !wca! get nodrop: boolean
    /**
     * Define whether the element supports dropping files on it for uploading.
     * By default it's enabled in desktop and disabled in touch devices
     * because mobile devices do not support drag events in general. Setting
     * it false means that drop is enabled even in touch-devices, and true
     * disables drop in all devices.
     */
    public boolean isNodrop() {
        return getElement().isNodrop();
    }

    // !wca! set nodrop: boolean
    /**
     * Define whether the element supports dropping files on it for uploading.
     * By default it's enabled in desktop and disabled in touch devices
     * because mobile devices do not support drag events in general. Setting
     * it false means that drop is enabled even in touch-devices, and true
     * disables drop in all devices.
     */
    public void setNodrop(boolean value) {
        getElement().setNodrop(value);
    }

    // !wca! observe nodrop: boolean

    // !wca! get target: string
    /**
     * The server URL. The default value is an empty string, which means that
     * <em>window.location</em> will be used.
     */
    public String getTarget() {
        return getElement().getTarget();
    }

    // !wca! set target: string
    /**
     * The server URL. The default value is an empty string, which means that
     * <em>window.location</em> will be used.
     */
    public void setTarget(String value) {
        getElement().setTarget(value);
    }

    // !wca! observe target: string

    // !wca! get theme: string | null | undefined

    // !wca! observe theme: string | null | undefined

    // !wca! get timeout: number
    /**
     * Max time in milliseconds for the entire upload process, if exceeded the
     * request will be aborted. Zero means that there is no timeout.
     */
    public int getTimeout() {
        return getElement().getTimeout();
    }

    // !wca! set timeout: number
    /**
     * Max time in milliseconds for the entire upload process, if exceeded the
     * request will be aborted. Zero means that there is no timeout.
     */
    public void setTimeout(int value) {
        getElement().setTimeout(value);
    }

    // !wca! observe timeout: number

    // !wca! get withCredentials: boolean
    /**
     * Set the withCredentials flag on the request.
     */
    public boolean isWithCredentials() {
        return getElement().isWithCredentials();
    }

    // !wca! set withCredentials: boolean
    /**
     * Set the withCredentials flag on the request.
     */
    public void setWithCredentials(boolean value) {
        getElement().setWithCredentials(value);
    }

    // !wca! observe withCredentials: boolean

    // !wca! event file-reject: ?
    public ObservableEvent<Event> fileRejectEvent() {
        return createEvent("file-reject");
    }

    // !wca! event upload-abort: ?
    public ObservableEvent<Event> uploadAbortEvent() {
        return createEvent("upload-abort");
    }

    // !wca! event upload-before: ?
    public ObservableEvent<Event> uploadBeforeEvent() {
        return createEvent("upload-before");
    }

    // !wca! event upload-progress: ?
    public ObservableEvent<Event> uploadProgressEvent() {
        return createEvent("upload-progress");
    }

    // !wca! event upload-request: ?
    public ObservableEvent<Event> uploadRequestEvent() {
        return createEvent("upload-request");
    }

    // !wca! event upload-response: ?
    public ObservableEvent<Event> uploadResponseEvent() {
        return createEvent("upload-response");
    }

    // !wca! event upload-retry: ?
    public ObservableEvent<Event> uploadRetryEvent() {
        return createEvent("upload-retry");
    }

    // !wca! event upload-start: ?
    public ObservableEvent<Event> uploadStartEvent() {
        return createEvent("upload-start");
    }
}
