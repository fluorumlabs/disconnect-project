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
@NpmPackage(
		name = "@vaadin/vaadin",
		version = Vaadin.VERSION
)
@Import(
		symbols = "UploadFileElement",
		module = "@vaadin/vaadin-upload/src/vaadin-upload-file.js"
)
public interface UploadFileElement extends HTMLElement, ThemableMixin {
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
