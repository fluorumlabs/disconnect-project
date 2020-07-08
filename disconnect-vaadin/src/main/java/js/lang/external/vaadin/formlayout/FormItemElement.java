package js.lang.external.vaadin.formlayout;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.web.dom.HTMLElement;

/**
 * <code>&lt;vaadin-form-item&gt;</code> is a Web Component providing labelled form item wrapper for using inside <code>&lt;vaadin-form-layout&gt;</code>.
 *
 * <code>&lt;vaadin-form-item&gt;</code> accepts any number of children as the input content, and also has a separate named <code>label</code> slot:
 *
 * <pre><code class="language-html">&lt;vaadin-form-item&gt;
 *    &lt;label slot="label"&gt;Label aside&lt;/label&gt;
 *    &lt;input&gt;
 * &lt;/vaadin-form-item&gt;
 * </code></pre>
 * Any content can be used. For instance, you can have multiple input elements with surrounding text. The label can be an element of any type:
 *
 * <pre><code class="language-html">&lt;vaadin-form-item&gt;
 *    &lt;span slot="label"&gt;Date of Birth&lt;/span&gt;
 *    &lt;input placeholder="YYYY" size="4"&gt; -
 *    &lt;input placeholder="MM" size="2"&gt; -
 *    &lt;input placeholder="DD" size="2"&gt;&lt;br&gt;
 *    &lt;em&gt;Example: 1900-01-01&lt;/em&gt;
 * &lt;/vaadin-form-item&gt;
 * </code></pre>
 * The label is optional and can be omitted:
 *
 * <pre><code class="language-html">&lt;vaadin-form-item&gt;
 *    &lt;input type="checkbox"&gt; Subscribe to our Newsletter
 * &lt;/vaadin-form-item&gt;
 * </code></pre>
 * By default, the <code>label</code> slot content is displayed aside of the input content. When <code>label-position="top"</code> is set, the <code>label</code> slot content is displayed on top:
 *
 * <pre><code class="language-html">&lt;vaadin-form-item label-position="top"&gt;
 *    &lt;label slot="label"&gt;Label on top&lt;/label&gt;
 *    &lt;input&gt;
 * &lt;/vaadin-form-item&gt;
 * </code></pre>
 * <strong>Note:</strong> Normally, <code>&lt;vaadin-form-item&gt;</code> is used as a child of a <code>&lt;vaadin-form-layout&gt;</code> element. Setting <code>label-position</code> is unnecessary, because the <code>label-position</code> attribute is triggered automatically by the parent <code>&lt;vaadin-form-layout&gt;</code>, depending on its width and responsive behavior.
 *
 * <h3>Input Width</h3>
 * By default, <code>&lt;vaadin-form-item&gt;</code> does not manipulate the width of the slotted input elements. Optionally you can stretch the child input element to fill the available width for the input content by adding the <code>full-width</code> class:
 *
 * <pre><code class="language-html">&lt;vaadin-form-item&gt;
 *    &lt;label slot="label"&gt;Label&lt;/label&gt;
 *    &lt;input class="full-width"&gt;
 * &lt;/vaadin-form-item&gt;
 * </code></pre>
 * <h3>Styling</h3>
 * The <code>label-position</code> host attribute can be used to target the label on top state:
 *
 * <pre><code>
 * &lt;dom-module id="my-form-item-theme" theme-for="vaadin-form-item"&gt;
 *    &lt;template&gt;
 *      &lt;style&gt;
 *        :host {
 *          /* default state styles, label aside * /
 *        }
 *
 *        :host([label-position="top"]) {
 *          /* label on top state styles * /
 *        }
 *      &lt;/style&gt;
 *    &lt;/template&gt;
 * &lt;/dom-module&gt;
 * </code></pre>
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
 *    <td>label</td>
 *    <td>The label slot container</td>
 *   </tr>
 *  </tbody>
 * </table>
 * <h3>Custom CSS Properties Reference</h3>
 * The following custom CSS properties are available on the <code>&lt;vaadin-form-item&gt;</code> element:
 *
 * <table>
 *  <thead>
 *   <tr>
 *    <th>Custom CSS property</th>
 *    <th>Description</th>
 *    <th>Default</th>
 *   </tr>
 *  </thead>
 *  <tbody>
 *   <tr>
 *    <td><code>--vaadin-form-item-label-width</code></td>
 *    <td>Width of the label column when the labels are aside</td>
 *    <td><code>8em</code></td>
 *   </tr>
 *   <tr>
 *    <td><code>--vaadin-form-item-label-spacing</code></td>
 *    <td>Spacing between the label column and the input column when the labels are aside</td>
 *    <td><code>1em</code></td>
 *   </tr>
 *   <tr>
 *    <td><code>--vaadin-form-item-row-spacing</code></td>
 *    <td>Height of the spacing between the form item elements</td>
 *    <td><code>1em</code></td>
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
@NpmPackage(name = "@vaadin/vaadin-form-layout", version = "^2.3.0-alpha1")
@Import(module = "@vaadin/vaadin-form-layout/vaadin-form-item.js")
public interface FormItemElement extends HTMLElement {

    // !wca! get theme: string | null | undefined
}
