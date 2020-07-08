package com.github.fluorumlabs.disconnect.vaadin.progressbar;

import com.github.fluorumlabs.disconnect.core.annotations.CustomElement;
import com.github.fluorumlabs.disconnect.core.components.Component;
import com.github.fluorumlabs.disconnect.core.components.HtmlComponent;
import com.github.fluorumlabs.disconnect.vaadin.theme.Themable;
import com.github.fluorumlabs.disconnect.vaadin.theme.ThemeVariant;
import js.lang.external.vaadin.progressbar.ProgressBarElement;

/**
 * <code>&lt;vaadin-progress-bar&gt;</code> is a Web Component for progress bars.
 *
 * <pre><code class="language-html">&lt;vaadin-progress-bar min="0" max="1" value="0.5"&gt;
 * &lt;/vaadin-progress-bar&gt;
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
 *    <td><code>bar</code></td>
 *    <td>Progress-bar's background</td>
 *   </tr>
 *   <tr>
 *    <td><code>value</code></td>
 *    <td>Progress-bar's foreground</td>
 *   </tr>
 *  </tbody>
 * </table>
 * See <a href="https://github.com/vaadin/vaadin-themable-mixin/wiki">ThemableMixin â€“ how to apply styles for shadow parts</a>
 *
 * The following custom properties are available:
 *
 * <table>
 *  <thead>
 *   <tr>
 *    <th>Custom property</th>
 *    <th>Description</th>
 *    <th>Default</th>
 *   </tr>
 *  </thead>
 *  <tbody>
 *   <tr>
 *    <td><code>--vaadin-progress-value</code></td>
 *    <td>current progress value (between 0 and 1)</td>
 *    <td>0</td>
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
 *    <td><code>indeterminate</code></td>
 *    <td>Set to an indeterminate progress bar</td>
 *    <td>:host</td>
 *   </tr>
 *  </tbody>
 * </table>
 * <strong>Mixins:</strong> ElementMixin, ThemableMixin, ProgressMixin, ElementMixin
 *
 * <h2>Example</h2>
 * <pre><code class="language-javascript">demo/index.html
 * </code></pre>
 */
@CustomElement(tagName = "vaadin-progress-bar", external = true)
public class ProgressBar extends HtmlComponent<ProgressBarElement> implements Themable<ProgressBarElement> {

    public ProgressBar() {
    }

    public ProgressBar(String textContent) {
        super(textContent);
    }

    public ProgressBar(Component<?>... components) {
        super(components);
    }

    // !wca! get indeterminate: boolean
    /**
     * Indeterminate state of the progress bar.
     * This property takes precedence over other state properties (min, max, value).
     */
    public boolean isIndeterminate() {
        return getElement().isIndeterminate();
    }

    // !wca! set indeterminate: boolean
    /**
     * Indeterminate state of the progress bar.
     * This property takes precedence over other state properties (min, max, value).
     */
    public void setIndeterminate(boolean value) {
        getElement().setIndeterminate(value);
    }

    // !wca! observe indeterminate: boolean

    // !wca! get max: number
    /**
     * Maximum bound of the progress bar.
     */
    public double getMax() {
        return getElement().getMax();
    }

    // !wca! set max: number
    /**
     * Maximum bound of the progress bar.
     */
    public void setMax(double value) {
        getElement().setMax(value);
    }

    // !wca! observe max: number

    // !wca! get min: number
    /**
     * Minimum bound of the progress bar.
     */
    public double getMin() {
        return getElement().getMin();
    }

    // !wca! set min: number
    /**
     * Minimum bound of the progress bar.
     */
    public void setMin(double value) {
        getElement().setMin(value);
    }

    // !wca! observe min: number

    // !wca! get theme: string | null | undefined

    // !wca! observe theme: string | null | undefined

    // !wca! get value: number | null | undefined
    /**
     * Current progress value.
     */
    public double getValue() {
        return getElement().getValue();
    }

    // !wca! set value: number | null | undefined
    /**
     * Current progress value.
     */
    public void setValue(double value) {
        getElement().setValue(value);
    }

    // !wca! observe value: number | null | undefined

    public enum Variant implements ThemeVariant {
        CONTRAST,
        ERROR,
        SUCCESS
    }
}
