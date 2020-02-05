package com.github.fluorumlabs.disconnect.vaadin;

import com.github.fluorumlabs.disconnect.polymer.types.StringPropertyChangeEvent;
import com.github.fluorumlabs.disconnect.vaadin.elements.RichTextEditorElement;
import com.github.fluorumlabs.disconnect.vaadin.i18n.RichTextEditorI18n;
import com.github.fluorumlabs.disconnect.vaadin.mixins.HasElementMixin;
import com.github.fluorumlabs.disconnect.vaadin.mixins.HasThemableMixin;
import com.github.fluorumlabs.disconnect.zero.component.AbstractComponent;
import com.github.fluorumlabs.disconnect.zero.component.Component;
import com.github.fluorumlabs.disconnect.zero.component.HasComponents;
import com.github.fluorumlabs.disconnect.zero.observable.ObservableEvent;
import js.web.dom.Event;

import javax.annotation.Nullable;
import javax.annotation.Untainted;

/**
 * `<vaadin-rich-text-editor>` is a Web Component for rich text editing.
 * It provides a set of toolbar controls to apply formatting on the content,
 * which is stored and can be accessed as HTML5 or JSON string.
 * <p>
 * ```
 * <vaadin-rich-text-editor></vaadin-rich-text-editor>
 * ```
 * <p>
 * Vaadin Rich Text Editor focuses on the structure, not the styling of content.
 * Therefore, the semantic HTML5 tags such as <h1>, <strong> and <ul> are used,
 * and CSS usage is limited to most common cases, like horizontal text alignment.
 * <p>
 * ### Styling
 * <p>
 * The following state attributes are available for styling:
 * <p>
 * Attribute    | Description | Part name
 * -------------|-------------|------------
 * `disabled`   | Set to a disabled text editor | :host
 * `readonly`   | Set to a readonly text editor | :host
 * `on`         | Set to a toolbar button applied to the selected text | toolbar-button
 * <p>
 * The following shadow DOM parts are available for styling:
 * <p>
 * Part name                            | Description
 * -------------------------------------|----------------
 * `content`                            | The content wrapper
 * `toolbar`                            | The toolbar wrapper
 * `toolbar-group`                      | The group for toolbar controls
 * `toolbar-group-history`              | The group for histroy controls
 * `toolbar-group-emphasis`             | The group for emphasis controls
 * `toolbar-group-heading`              | The group for heading controls
 * `toolbar-group-glyph-transformation` | The group for glyph transformation controls
 * `toolbar-group-group-list`           | The group for group list controls
 * `toolbar-group-alignment`            | The group for alignment controls
 * `toolbar-group-rich-text`            | The group for rich text controls
 * `toolbar-group-block`                | The group for preformatted block controls
 * `toolbar-group-format`               | The group for format controls
 * `toolbar-button`                     | The toolbar button (applies to all buttons)
 * `toolbar-button-undo`                | The "undo" button
 * `toolbar-button-redo`                | The "redo" button
 * `toolbar-button-bold`                | The "bold" button
 * `toolbar-button-italic`              | The "italic" button
 * `toolbar-button-underline`           | The "underline" button
 * `toolbar-button-strike`              | The "strike-through" button
 * `toolbar-button-h1`                  | The "header 1" button
 * `toolbar-button-h2`                  | The "header 2" button
 * `toolbar-button-h3`                  | The "header 3" button
 * `toolbar-button-subscript`           | The "subscript" button
 * `toolbar-button-superscript`         | The "superscript" button
 * `toolbar-button-list-ordered`        | The "ordered list" button
 * `toolbar-button-list-bullet`         | The "bullet list" button
 * `toolbar-button-align-left`          | The "left align" button
 * `toolbar-button-align-center`        | The "center align" button
 * `toolbar-button-align-right`         | The "right align" button
 * `toolbar-button-image`               | The "image" button
 * `toolbar-button-link`                | The "link" button
 * `toolbar-button-blockquote`          | The "blockquote" button
 * `toolbar-button-code-block`          | The "code block" button
 * `toolbar-button-clean`               | The "clean formatting" button
 * <p>
 * See [ThemableMixin – how to apply styles for shadow parts](https://github.com/vaadin/vaadin-themable-mixin/wiki)
 */
public class VaadinRichTextEditor extends AbstractComponent<RichTextEditorElement>
		implements HasElementMixin<RichTextEditorElement, VaadinRichTextEditor>,
		HasThemableMixin<RichTextEditorElement, VaadinRichTextEditor>,
		HasComponents<RichTextEditorElement, VaadinRichTextEditor, Component<?>> {
	public VaadinRichTextEditor() {
		super("vaadin-rich-text-editor");
	}

	/**
	 * Value is a list of the operations which describe change to the document.
	 * Each of those operations describe the change at the current index.
	 * They can be an `insert`, `delete` or `retain`. The format is as follows:
	 * <p>
	 * ```js
	 * [
	 * { insert: 'Hello World' },
	 * { insert: '!', attributes: { bold: true }}
	 * ]
	 * ```
	 * <p>
	 * See also https://github.com/quilljs/delta for detailed documentation.
	 */
	@Nullable
	public String value() {
		return getNode().getValue();
	}

	/**
	 * Value is a list of the operations which describe change to the document.
	 * Each of those operations describe the change at the current index.
	 * They can be an `insert`, `delete` or `retain`. The format is as follows:
	 * <p>
	 * ```js
	 * [
	 * { insert: 'Hello World' },
	 * { insert: '!', attributes: { bold: true }}
	 * ]
	 * ```
	 * <p>
	 * See also https://github.com/quilljs/delta for detailed documentation.
	 */
	public VaadinRichTextEditor value(String value) {
		getNode().setValue(value);
		return this;
	}

	/**
	 * HTML representation of the rich text editor content.
	 */
	@Nullable
	public String htmlValue() {
		return getNode().getHtmlValue();
	}

	/**
	 * When true, the user can not modify, nor copy the editor content.
	 */
	public boolean disabled() {
		return getNode().isDisabled();
	}

	/**
	 * When true, the user can not modify, nor copy the editor content.
	 */
	public VaadinRichTextEditor disabled(boolean disabled) {
		getNode().setDisabled(disabled);
		return this;
	}

	/**
	 * When true, the user can not modify the editor content, but can copy it.
	 */
	public boolean readonly() {
		return getNode().isReadonly();
	}

	/**
	 * When true, the user can not modify the editor content, but can copy it.
	 */
	public VaadinRichTextEditor readonly(boolean readonly) {
		getNode().setReadonly(readonly);
		return this;
	}

	/**
	 * An object used to localize this component. The properties are used
	 * e.g. as the tooltips for the editor toolbar buttons.
	 */
	@Nullable
	public RichTextEditorI18n i18n() {
		return getNode().getI18n();
	}

	/**
	 * An object used to localize this component. The properties are used
	 * e.g. as the tooltips for the editor toolbar buttons.
	 */
	public VaadinRichTextEditor i18n(RichTextEditorI18n i18n) {
		getNode().setI18n(i18n);
		return this;
	}

	/**
	 * Sets content represented by HTML snippet into the editor.
	 * The snippet is interpreted by [Quill's Clipboard matchers](https://quilljs.com/docs/modules/clipboard
	 * /#matchers),
	 * which may not produce the exactly input HTML.
	 * <p>
	 * **NOTE:** Improper handling of HTML can lead to cross site scripting (XSS) and failure to sanitize
	 * properly is both notoriously error-prone and a leading cause of web vulnerabilities.
	 * This method is aptly named to ensure the developer has taken the necessary precautions.
	 */
	public void dangerouslySetHtmlValue(@Untainted String htmlValue) {
		getNode().dangerouslySetHtmlValue(htmlValue);
	}

	/**
	 * Fired when the user commits a value change.
	 */
	public ObservableEvent<Event> changeEvent() {
		return createEvent("change");
	}

	/**
	 * Fired when the `value` property changes.
	 */
	public ObservableEvent<StringPropertyChangeEvent> valueChangedEvent() {
		return createEvent("value-changed");
	}

	/**
	 * Fired when the `htmlValue` property changes.
	 */
	public ObservableEvent<StringPropertyChangeEvent> htmlValueChangedEvent() {
		return createEvent("html-value-changed");
	}
}
