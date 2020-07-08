package com.github.fluorumlabs.disconnect.vaadin.richtexteditor;

import com.github.fluorumlabs.disconnect.core.annotations.CustomElement;
import com.github.fluorumlabs.disconnect.core.components.Component;
import com.github.fluorumlabs.disconnect.core.components.HtmlComponent;
import com.github.fluorumlabs.disconnect.core.observables.ObservableEvent;
import com.github.fluorumlabs.disconnect.core.observables.ObservableValue;
import com.github.fluorumlabs.disconnect.vaadin.theme.Themable;
import com.github.fluorumlabs.disconnect.vaadin.theme.ThemeVariant;
import js.lang.external.vaadin.richtexteditor.RichTextEditorElement;
import js.lang.external.vaadin.richtexteditor.RichTextEditorI18n;
import js.web.dom.Event;

/**
 * <code>&lt;vaadin-rich-text-editor&gt;</code> is a Web Component for rich text editing. It provides a set of toolbar controls to apply formatting on the content, which is stored and can be accessed as HTML5 or JSON string.
 *
 * <pre><code>&lt;vaadin-rich-text-editor&gt;&lt;/vaadin-rich-text-editor&gt;
 * </code></pre>
 * Vaadin Rich Text Editor focuses on the structure, not the styling of content. Therefore, the semantic HTML5 tags such as
 *
 * <h1>, <strong> and
 *   <ul>
 *     are used, and CSS usage is limited to most common cases, like horizontal text alignment.
 *
 *    <h3>Styling</h3>
 *    The following state attributes are available for styling:
 *
 *    <table>
 *     <thead>
 *      <tr>
 *       <th>Attribute</th>
 *       <th>Description</th>
 *       <th>Part name</th>
 *      </tr>
 *     </thead>
 *     <tbody>
 *      <tr>
 *       <td><code>disabled</code></td>
 *       <td>Set to a disabled text editor</td>
 *       <td>:host</td>
 *      </tr>
 *      <tr>
 *       <td><code>readonly</code></td>
 *       <td>Set to a readonly text editor</td>
 *       <td>:host</td>
 *      </tr>
 *      <tr>
 *       <td><code>on</code></td>
 *       <td>Set to a toolbar button applied to the selected text</td>
 *       <td>toolbar-button</td>
 *      </tr>
 *     </tbody>
 *    </table>
 *    The following shadow DOM parts are available for styling:
 *
 *    <table>
 *     <thead>
 *      <tr>
 *       <th>Part name</th>
 *       <th>Description</th>
 *      </tr>
 *     </thead>
 *     <tbody>
 *      <tr>
 *       <td><code>content</code></td>
 *       <td>The content wrapper</td>
 *      </tr>
 *      <tr>
 *       <td><code>toolbar</code></td>
 *       <td>The toolbar wrapper</td>
 *      </tr>
 *      <tr>
 *       <td><code>toolbar-group</code></td>
 *       <td>The group for toolbar controls</td>
 *      </tr>
 *      <tr>
 *       <td><code>toolbar-group-history</code></td>
 *       <td>The group for histroy controls</td>
 *      </tr>
 *      <tr>
 *       <td><code>toolbar-group-emphasis</code></td>
 *       <td>The group for emphasis controls</td>
 *      </tr>
 *      <tr>
 *       <td><code>toolbar-group-heading</code></td>
 *       <td>The group for heading controls</td>
 *      </tr>
 *      <tr>
 *       <td><code>toolbar-group-glyph-transformation</code></td>
 *       <td>The group for glyph transformation controls</td>
 *      </tr>
 *      <tr>
 *       <td><code>toolbar-group-group-list</code></td>
 *       <td>The group for group list controls</td>
 *      </tr>
 *      <tr>
 *       <td><code>toolbar-group-alignment</code></td>
 *       <td>The group for alignment controls</td>
 *      </tr>
 *      <tr>
 *       <td><code>toolbar-group-rich-text</code></td>
 *       <td>The group for rich text controls</td>
 *      </tr>
 *      <tr>
 *       <td><code>toolbar-group-block</code></td>
 *       <td>The group for preformatted block controls</td>
 *      </tr>
 *      <tr>
 *       <td><code>toolbar-group-format</code></td>
 *       <td>The group for format controls</td>
 *      </tr>
 *      <tr>
 *       <td><code>toolbar-button</code></td>
 *       <td>The toolbar button (applies to all buttons)</td>
 *      </tr>
 *      <tr>
 *       <td><code>toolbar-button-undo</code></td>
 *       <td>The "undo" button</td>
 *      </tr>
 *      <tr>
 *       <td><code>toolbar-button-redo</code></td>
 *       <td>The "redo" button</td>
 *      </tr>
 *      <tr>
 *       <td><code>toolbar-button-bold</code></td>
 *       <td>The "bold" button</td>
 *      </tr>
 *      <tr>
 *       <td><code>toolbar-button-italic</code></td>
 *       <td>The "italic" button</td>
 *      </tr>
 *      <tr>
 *       <td><code>toolbar-button-underline</code></td>
 *       <td>The "underline" button</td>
 *      </tr>
 *      <tr>
 *       <td><code>toolbar-button-strike</code></td>
 *       <td>The "strike-through" button</td>
 *      </tr>
 *      <tr>
 *       <td><code>toolbar-button-h1</code></td>
 *       <td>The "header 1" button</td>
 *      </tr>
 *      <tr>
 *       <td><code>toolbar-button-h2</code></td>
 *       <td>The "header 2" button</td>
 *      </tr>
 *      <tr>
 *       <td><code>toolbar-button-h3</code></td>
 *       <td>The "header 3" button</td>
 *      </tr>
 *      <tr>
 *       <td><code>toolbar-button-subscript</code></td>
 *       <td>The "subscript" button</td>
 *      </tr>
 *      <tr>
 *       <td><code>toolbar-button-superscript</code></td>
 *       <td>The "superscript" button</td>
 *      </tr>
 *      <tr>
 *       <td><code>toolbar-button-list-ordered</code></td>
 *       <td>The "ordered list" button</td>
 *      </tr>
 *      <tr>
 *       <td><code>toolbar-button-list-bullet</code></td>
 *       <td>The "bullet list" button</td>
 *      </tr>
 *      <tr>
 *       <td><code>toolbar-button-align-left</code></td>
 *       <td>The "left align" button</td>
 *      </tr>
 *      <tr>
 *       <td><code>toolbar-button-align-center</code></td>
 *       <td>The "center align" button</td>
 *      </tr>
 *      <tr>
 *       <td><code>toolbar-button-align-right</code></td>
 *       <td>The "right align" button</td>
 *      </tr>
 *      <tr>
 *       <td><code>toolbar-button-image</code></td>
 *       <td>The "image" button</td>
 *      </tr>
 *      <tr>
 *       <td><code>toolbar-button-link</code></td>
 *       <td>The "link" button</td>
 *      </tr>
 *      <tr>
 *       <td><code>toolbar-button-blockquote</code></td>
 *       <td>The "blockquote" button</td>
 *      </tr>
 *      <tr>
 *       <td><code>toolbar-button-code-block</code></td>
 *       <td>The "code block" button</td>
 *      </tr>
 *      <tr>
 *       <td><code>toolbar-button-clean</code></td>
 *       <td>The "clean formatting" button</td>
 *      </tr>
 *     </tbody>
 *    </table>
 *    See <a href="https://github.com/vaadin/vaadin-themable-mixin/wiki">ThemableMixin â€“ how to apply styles for shadow parts</a>
 *
 *    <strong>Mixins:</strong> ElementMixin, ThemableMixin, ElementMixin
 *
 *    <h2>Example</h2>
 *    <pre><code class="language-javascript">demo/index.html
 * </code></pre>
 *   </ul></strong></h1>
 */
@CustomElement(tagName = "vaadin-rich-text-editor", external = true)
public class RichTextEditor extends HtmlComponent<RichTextEditorElement> implements Themable<RichTextEditorElement> {

    public RichTextEditor() {
    }

    public RichTextEditor(String textContent) {
        super(textContent);
    }

    public RichTextEditor(Component<?>... components) {
        super(components);
    }

    // !wca! dangerouslySetHtmlValue: (htmlValue: string): void
    /**
     * Sets content represented by HTML snippet into the editor.
     * The snippet is interpreted by <a href="https://quilljs.com/docs/modules/clipboard/#matchers">Quill's Clipboard matchers</a>,
     * which may not produce the exactly input HTML.
     *
     * <strong>NOTE:</strong> Improper handling of HTML can lead to cross site scripting (XSS) and failure to sanitize
     * properly is both notoriously error-prone and a leading cause of web vulnerabilities.
     * This method is aptly named to ensure the developer has taken the necessary precautions.
     */
    public void dangerouslySetHtmlValue(String htmlValue) {
        getElement().dangerouslySetHtmlValue(htmlValue);
    }

    // !wca! get disabled: boolean
    /**
     * When true, the user can not modify, nor copy the editor content.
     */
    public boolean isDisabled() {
        return getElement().isDisabled();
    }

    // !wca! set disabled: boolean
    /**
     * When true, the user can not modify, nor copy the editor content.
     */
    public void setDisabled(boolean value) {
        getElement().setDisabled(value);
    }

    // !wca! observe disabled: boolean

    // !wca! get htmlValue: string
    /**
     * HTML representation of the rich text editor content.
     */
    public String getHtmlValue() {
        return getElement().getHtmlValue();
    }

    // !wca! set htmlValue: string
    /**
     * HTML representation of the rich text editor content.
     */
    public void setHtmlValue(String value) {
        getElement().setHtmlValue(value);
    }

    // !wca! observe htmlValue: string
    /**
     * HTML representation of the rich text editor content.
     */
    public ObservableValue<String> htmlValue() {
        return createObservableValue(this::getHtmlValue, this::setHtmlValue, "html-value-changed");
    }

    // !wca! get i18n: !RichTextEditorI18n

    // !wca! set i18n: !RichTextEditorI18n
    /**
     * An object used to localize this component. The properties are used
     * e.g. as the tooltips for the editor toolbar buttons.
     * @param value
     */
    public void setI18n(RichTextEditorI18n value) {
        getElement().setI18n(value);
    }

    // !wca! observe i18n: !RichTextEditorI18n

    // !wca! get readonly: boolean
    /**
     * When true, the user can not modify the editor content, but can copy it.
     */
    public boolean isReadonly() {
        return getElement().isReadonly();
    }

    // !wca! set readonly: boolean
    /**
     * When true, the user can not modify the editor content, but can copy it.
     */
    public void setReadonly(boolean value) {
        getElement().setReadonly(value);
    }

    // !wca! observe readonly: boolean

    // !wca! get theme: string | null | undefined

    // !wca! observe theme: string | null | undefined

    // !wca! get value: string
    /**
     * Value is a list of the operations which describe change to the document.
     * Each of those operations describe the change at the current index.
     * They can be an <code>insert</code>, <code>delete</code> or <code>retain</code>. The format is as follows:
     *
     * <code>js&lt;br /&gt; [&lt;br /&gt; { insert: 'Hello World' },&lt;br /&gt; { insert: '!', attributes: { bold: true }}&lt;br /&gt; ]&lt;br /&gt;</code>
     *
     * See also <a href="https://github.com/quilljs/delta">https://github.com/quilljs/delta</a> for detailed documentation.
     */
    public String getValue() {
        return getElement().getValue();
    }

    // !wca! set value: string
    /**
     * Value is a list of the operations which describe change to the document.
     * Each of those operations describe the change at the current index.
     * They can be an <code>insert</code>, <code>delete</code> or <code>retain</code>. The format is as follows:
     *
     * <code>js&lt;br /&gt; [&lt;br /&gt; { insert: 'Hello World' },&lt;br /&gt; { insert: '!', attributes: { bold: true }}&lt;br /&gt; ]&lt;br /&gt;</code>
     *
     * See also <a href="https://github.com/quilljs/delta">https://github.com/quilljs/delta</a> for detailed documentation.
     */
    public void setValue(String value) {
        getElement().setValue(value);
    }

    // !wca! observe value: string
    /**
     * Value is a list of the operations which describe change to the document.
     * Each of those operations describe the change at the current index.
     * They can be an <code>insert</code>, <code>delete</code> or <code>retain</code>. The format is as follows:
     *
     * <code>js&lt;br /&gt; [&lt;br /&gt; { insert: 'Hello World' },&lt;br /&gt; { insert: '!', attributes: { bold: true }}&lt;br /&gt; ]&lt;br /&gt;</code>
     *
     * See also <a href="https://github.com/quilljs/delta">https://github.com/quilljs/delta</a> for detailed documentation.
     */
    public ObservableValue<String> value() {
        return createObservableValue(this::getValue, this::setValue, "value-changed");
    }

    // !wca! event change: ?
    public ObservableEvent<Event> changeEvent() {
        return createEvent("change");
    }

    public enum Variant implements ThemeVariant {
        NO_BORDER,
        COMPACT
    }
}
