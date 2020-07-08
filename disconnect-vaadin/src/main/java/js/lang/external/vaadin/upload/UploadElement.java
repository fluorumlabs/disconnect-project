package js.lang.external.vaadin.upload;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Unknown;
import js.util.StringRecord;
import js.util.collections.Array;
import js.web.dom.HTMLElement;
import org.teavm.jso.JSMethod;
import org.teavm.jso.JSProperty;

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
@NpmPackage(name = "@vaadin/vaadin-upload", version = "^4.4.0-alpha1")
@Import(module = "@vaadin/vaadin-upload/vaadin-upload.js")
public interface UploadElement extends HTMLElement {

    // !wca! uploadFiles: (files?: !UploadFile | !Array<!UploadFile>=): void
    /**
     * Triggers the upload of any files that are not completed
     *
     * <strong>files</strong>: Files being uploaded. Defaults to all outstanding files
     */
    @JSMethod("uploadFiles")
    void uploadFiles(Unknown files);

    // !wca! get accept: string
    /**
     * Specifies the types of files that the server accepts.
     * Syntax: a comma-separated list of MIME type patterns (wildcards are
     * allowed) or file extensions.
     * Notice that MIME types are widely supported, while file extensions
     * are only implemented in certain browsers, so avoid using it.
     * Example: accept="video/*,image/tiff" or accept=".pdf,audio/mp3"
     */
    @JSProperty("accept")
    String getAccept();

    // !wca! set accept: string
    /**
     * Specifies the types of files that the server accepts.
     * Syntax: a comma-separated list of MIME type patterns (wildcards are
     * allowed) or file extensions.
     * Notice that MIME types are widely supported, while file extensions
     * are only implemented in certain browsers, so avoid using it.
     * Example: accept="video/*,image/tiff" or accept=".pdf,audio/mp3"
     */
    @JSProperty("accept")
    void setAccept(String value);

    // !wca! get capture: string
    /**
     * Pass-through to input's capture attribute. Allows user to trigger device inputs
     * such as camera or microphone immediately.
     */
    @JSProperty("capture")
    String getCapture();

    // !wca! set capture: string
    /**
     * Pass-through to input's capture attribute. Allows user to trigger device inputs
     * such as camera or microphone immediately.
     */
    @JSProperty("capture")
    void setCapture(String value);

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
     */
    @JSProperty("files")
    Array<UploadFile> getFiles();

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
    @JSProperty("files")
    void setFiles(Array<UploadFile> value);

    // !wca! get formDataName: string
    /**
     * Specifies the 'name' property at Content-Disposition
     */
    @JSProperty("formDataName")
    String getFormDataName();

    // !wca! set formDataName: string
    /**
     * Specifies the 'name' property at Content-Disposition
     */
    @JSProperty("formDataName")
    void setFormDataName(String value);

    // !wca! get headers: object | string
    /**
     * Key-Value map to send to the server. If you set this property as an
     * attribute, use a valid JSON string, for example:
     * <code>&lt;br /&gt;&lt;vaadin-upload headers='{"X-Foo": "Bar"}'&gt;&lt;/vaadin-upload&gt;&lt;br /&gt;</code>
     */
    @JSProperty("headers")
    StringRecord getHeaders();

    // !wca! set headers: object | string
    /**
     * Key-Value map to send to the server. If you set this property as an
     * attribute, use a valid JSON string, for example:
     * <code>&lt;br /&gt;&lt;vaadin-upload headers='{"X-Foo": "Bar"}'&gt;&lt;/vaadin-upload&gt;&lt;br /&gt;</code>
     */
    @JSProperty("headers")
    void setHeaders(StringRecord value);

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
     */
    @JSProperty("i18n")
    void setI18n(UploadI18n value);

    // !wca! get maxFileSize: number
    /**
     * Specifies the maximum file size in bytes allowed to upload.
     * Notice that it is a client-side constraint, which will be checked before
     * sending the request. Obviously you need to do the same validation in
     * the server-side and be sure that they are aligned.
     */
    @JSProperty("maxFileSize")
    int getMaxFileSize();

    // !wca! set maxFileSize: number
    /**
     * Specifies the maximum file size in bytes allowed to upload.
     * Notice that it is a client-side constraint, which will be checked before
     * sending the request. Obviously you need to do the same validation in
     * the server-side and be sure that they are aligned.
     */
    @JSProperty("maxFileSize")
    void setMaxFileSize(int value);

    // !wca! get maxFiles: number
    /**
     * Limit of files to upload, by default it is unlimited. If the value is
     * set to one, native file browser will prevent selecting multiple files.
     */
    @JSProperty("maxFiles")
    int getMaxFiles();

    // !wca! set maxFiles: number
    /**
     * Limit of files to upload, by default it is unlimited. If the value is
     * set to one, native file browser will prevent selecting multiple files.
     */
    @JSProperty("maxFiles")
    void setMaxFiles(int value);

    // !wca! get maxFilesReached: boolean
    /**
     * Specifies if the maximum number of files have been uploaded
     */
    @JSProperty("maxFilesReached")
    boolean isMaxFilesReached();

    // !wca! set maxFilesReached: boolean
    /**
     * Specifies if the maximum number of files have been uploaded
     */
    @JSProperty("maxFilesReached")
    void setMaxFilesReached(boolean value);

    // !wca! get method: !UploadMethod
    /**
     * HTTP Method used to send the files. Only POST and PUT are allowed.
     */
    @JSProperty("method")
    String getMethod();

    // !wca! set method: !UploadMethod
    /**
     * HTTP Method used to send the files. Only POST and PUT are allowed.
     */
    @JSProperty("method")
    void setMethod(String value);

    // !wca! get noAuto: boolean
    /**
     * Prevents upload(s) from immediately uploading upon adding file(s).
     * When set, you must manually trigger uploads using the <code>uploadFiles</code> method
     */
    @JSProperty("noAuto")
    boolean isNoAuto();

    // !wca! set noAuto: boolean
    /**
     * Prevents upload(s) from immediately uploading upon adding file(s).
     * When set, you must manually trigger uploads using the <code>uploadFiles</code> method
     */
    @JSProperty("noAuto")
    void setNoAuto(boolean value);

    // !wca! get nodrop: boolean
    /**
     * Define whether the element supports dropping files on it for uploading.
     * By default it's enabled in desktop and disabled in touch devices
     * because mobile devices do not support drag events in general. Setting
     * it false means that drop is enabled even in touch-devices, and true
     * disables drop in all devices.
     */
    @JSProperty("nodrop")
    boolean isNodrop();

    // !wca! set nodrop: boolean
    /**
     * Define whether the element supports dropping files on it for uploading.
     * By default it's enabled in desktop and disabled in touch devices
     * because mobile devices do not support drag events in general. Setting
     * it false means that drop is enabled even in touch-devices, and true
     * disables drop in all devices.
     */
    @JSProperty("nodrop")
    void setNodrop(boolean value);

    // !wca! get target: string
    /**
     * The server URL. The default value is an empty string, which means that
     * <em>window.location</em> will be used.
     */
    @JSProperty("target")
    String getTarget();

    // !wca! set target: string
    /**
     * The server URL. The default value is an empty string, which means that
     * <em>window.location</em> will be used.
     */
    @JSProperty("target")
    void setTarget(String value);

    // !wca! get theme: string | null | undefined

    // !wca! get timeout: number
    /**
     * Max time in milliseconds for the entire upload process, if exceeded the
     * request will be aborted. Zero means that there is no timeout.
     */
    @JSProperty("timeout")
    int getTimeout();

    // !wca! set timeout: number
    /**
     * Max time in milliseconds for the entire upload process, if exceeded the
     * request will be aborted. Zero means that there is no timeout.
     */
    @JSProperty("timeout")
    void setTimeout(int value);

    // !wca! get withCredentials: boolean
    /**
     * Set the withCredentials flag on the request.
     */
    @JSProperty("withCredentials")
    boolean isWithCredentials();

    // !wca! set withCredentials: boolean
    /**
     * Set the withCredentials flag on the request.
     */
    @JSProperty("withCredentials")
    void setWithCredentials(boolean value);
}
