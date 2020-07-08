package js.lang.external.vaadin.progressbar;

import javax.annotation.Nullable;
import org.teavm.jso.JSProperty;
import org.teavm.jso.JSMethod;
import js.web.dom.HTMLElement;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.core.annotations.Import;

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
@NpmPackage(name = "@vaadin/vaadin-progress-bar", version = "^1.3.0-alpha1")
@Import(module = "@vaadin/vaadin-progress-bar/vaadin-progress-bar.js")
public interface ProgressBarElement extends HTMLElement {

    // !wca! get indeterminate: boolean
    /**
     * Indeterminate state of the progress bar.
     * This property takes precedence over other state properties (min, max, value).
     */
    @JSProperty("indeterminate")
    boolean isIndeterminate();

    // !wca! set indeterminate: boolean
    /**
     * Indeterminate state of the progress bar.
     * This property takes precedence over other state properties (min, max, value).
     */
    @JSProperty("indeterminate")
    void setIndeterminate(boolean value);

    // !wca! get max: number
    /**
     * Maximum bound of the progress bar.
     */
    @JSProperty("max")
    double getMax();

    // !wca! set max: number
    /**
     * Maximum bound of the progress bar.
     */
    @JSProperty("max")
    void setMax(double value);

    // !wca! get min: number
    /**
     * Minimum bound of the progress bar.
     */
    @JSProperty("min")
    double getMin();

    // !wca! set min: number
    /**
     * Minimum bound of the progress bar.
     */
    @JSProperty("min")
    void setMin(double value);

    // !wca! get theme: string | null | undefined

    // !wca! get value: number | null | undefined
    /**
     * Current progress value.
     */
    @JSProperty("value")
    double getValue();

    // !wca! set value: number | null | undefined
    /**
     * Current progress value.
     */
    @JSProperty("value")
    void setValue(double value);
}
