package com.github.fluorumlabs.disconnect.vaadin.upload;

import com.github.fluorumlabs.disconnect.core.annotations.CustomElement;
import com.github.fluorumlabs.disconnect.core.components.Component;
import com.github.fluorumlabs.disconnect.core.components.HtmlComponent;
import com.github.fluorumlabs.disconnect.core.observables.ObservableEvent;
import com.github.fluorumlabs.disconnect.vaadin.theme.Themable;
import js.lang.external.vaadin.upload.UploadFileElement;
import js.web.dom.Event;

/**
 * <code>&lt;vaadin-upload-file&gt;</code> element represents a file in the file list of <code>&lt;vaadin-upload&gt;</code>.
 *
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
 *    <td><code>row</code></td>
 *    <td>File container</td>
 *   </tr>
 *   <tr>
 *    <td><code>info</code></td>
 *    <td>Container for file status icon, file name, status and error messages</td>
 *   </tr>
 *   <tr>
 *    <td><code>done-icon</code></td>
 *    <td>File done status icon</td>
 *   </tr>
 *   <tr>
 *    <td><code>warning-icon</code></td>
 *    <td>File warning status icon</td>
 *   </tr>
 *   <tr>
 *    <td><code>meta</code></td>
 *    <td>Container for file name, status and error messages</td>
 *   </tr>
 *   <tr>
 *    <td><code>name</code></td>
 *    <td>File name</td>
 *   </tr>
 *   <tr>
 *    <td><code>error</code></td>
 *    <td>Error message, shown when error happens</td>
 *   </tr>
 *   <tr>
 *    <td><code>status</code></td>
 *    <td>Status message</td>
 *   </tr>
 *   <tr>
 *    <td><code>commands</code></td>
 *    <td>Container for file command icons</td>
 *   </tr>
 *   <tr>
 *    <td><code>start-button</code></td>
 *    <td>Start file upload button</td>
 *   </tr>
 *   <tr>
 *    <td><code>retry-button</code></td>
 *    <td>Retry file upload button</td>
 *   </tr>
 *   <tr>
 *    <td><code>clear-button</code></td>
 *    <td>Clear file button</td>
 *   </tr>
 *   <tr>
 *    <td><code>progress</code></td>
 *    <td>Progress bar</td>
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
 *    <td><code>error</code></td>
 *    <td>An error has happened during uploading</td>
 *    <td><code>:host</code></td>
 *   </tr>
 *   <tr>
 *    <td><code>indeterminate</code></td>
 *    <td>Uploading is in progress, but the progress value is unknown</td>
 *    <td><code>:host</code></td>
 *   </tr>
 *   <tr>
 *    <td><code>uploading</code></td>
 *    <td>Uploading is in progress</td>
 *    <td><code>:host</code></td>
 *   </tr>
 *   <tr>
 *    <td><code>complete</code></td>
 *    <td>Uploading has finished successfully</td>
 *    <td><code>:host</code></td>
 *   </tr>
 *  </tbody>
 * </table>
 * See <a href="https://github.com/vaadin/vaadin-themable-mixin/wiki">ThemableMixin â€“ how to apply styles for shadow parts</a>
 *
 * <strong>Mixins:</strong> ThemableMixin, ElementMixin
 *
 * <h2>Example</h2>
 * <pre><code class="language-javascript">demo/index.html
 * </code></pre>
 */
@CustomElement(tagName = "vaadin-upload-file", external = true)
public class UploadFile extends HtmlComponent<UploadFileElement> implements Themable<UploadFileElement> {

    public UploadFile() {
    }

    public UploadFile(String textContent) {
        super(textContent);
    }

    public UploadFile(Component<?>... components) {
        super(components);
    }

    // !wca! get file: object

    // !wca! set file: object

    // !wca! observe file: object

    // !wca! get theme: string | null | undefined

    // !wca! observe theme: string | null | undefined

    // !wca! event file-remove: ?
    public ObservableEvent<Event> fileRemoveEvent() {
        return createEvent("file-remove");
    }
}
