package com.github.fluorumlabs.disconnect.vaadin.elements;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.vaadin.Vaadin;
import com.github.fluorumlabs.disconnect.vaadin.elements.mixins.ThemableMixin;
import com.github.fluorumlabs.disconnect.vaadin.types.UploadingFile;
import js.web.dom.HTMLElement;
import org.teavm.jso.JSProperty;

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
@NpmPackage(
		name = "@vaadin/vaadin",
		version = Vaadin.VERSION
)
@Import(
		symbols = "UploadFileElement",
		module = "@vaadin/vaadin-upload/vaadin-upload-file.js"
)
public interface UploadFileElement extends HTMLElement, ThemableMixin {
	String TAGNAME = "vaadin-upload-file";
	/**
	 *
	 */
	@Nullable
	@JSProperty
	UploadingFile getFile();

	/**
	 *
	 */
	@JSProperty
	void setFile(UploadingFile file);
}
