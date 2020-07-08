package js.lang.external.polymer.ironicon;

import javax.annotation.Nullable;
import org.teavm.jso.JSProperty;
import org.teavm.jso.JSMethod;
import js.web.dom.HTMLElement;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.core.annotations.Import;

/**
 * The <code>iron-icon</code> element displays an icon. By default an icon renders as a 24px square.
 *
 * Example using src:
 *
 * <pre><code> &lt;iron-icon src="star.png"&gt;&lt;/iron-icon&gt;
 * </code></pre>
 * Example setting size to 32px x 32px:
 *
 * <pre><code> &lt;iron-icon class="big" src="big_star.png"&gt;&lt;/iron-icon&gt;
 *
 *  &lt;style is="custom-style"&gt;
 *    .big {
 *      --iron-icon-height: 32px;
 *      --iron-icon-width: 32px;
 *    }
 *  &lt;/style&gt;
 * </code></pre>
 * The iron elements include several sets of icons. To use the default set of icons, import <code>iron-icons.js</code> and use the <code>icon</code> attribute to specify an icon:
 *
 * <pre><code> &lt;script type="module"&gt;
 *    import "@polymer/iron-icons/iron-icons.js";
 *  &lt;/script&gt;
 *
 *  &lt;iron-icon icon="menu"&gt;&lt;/iron-icon&gt;
 * </code></pre>
 * To use a different built-in set of icons, import the specific <code>iron-icons/&lt;iconset&gt;-icons.js</code>, and specify the icon as <code>&lt;iconset&gt;:&lt;icon&gt;</code>. For example, to use a communication icon, you would use:
 *
 * <pre><code> &lt;script type="module"&gt;
 *    import "@polymer/iron-icons/communication-icons.js";
 *  &lt;/script&gt;
 *
 *  &lt;iron-icon icon="communication:email"&gt;&lt;/iron-icon&gt;
 * </code></pre>
 * You can also create custom icon sets of bitmap or SVG icons.
 *
 * Example of using an icon named <code>cherry</code> from a custom iconset with the ID <code>fruit</code>:
 *
 * <pre><code> &lt;iron-icon icon="fruit:cherry"&gt;&lt;/iron-icon&gt;
 * </code></pre>
 * See <code>&lt;iron-iconset&gt;</code> and <code>&lt;iron-iconset-svg&gt;</code> for more information about how to create a custom iconset.
 *
 * See the <code>iron-icons</code> demo to see the icons available in the various iconsets.
 *
 * <h3>Styling</h3>
 * The following custom properties are available for styling:
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
 *    <td><code>--iron-icon</code></td>
 *    <td>Mixin applied to the icon</td>
 *    <td>{}</td>
 *   </tr>
 *   <tr>
 *    <td><code>--iron-icon-width</code></td>
 *    <td>Width of the icon</td>
 *    <td><code>24px</code></td>
 *   </tr>
 *   <tr>
 *    <td><code>--iron-icon-height</code></td>
 *    <td>Height of the icon</td>
 *    <td><code>24px</code></td>
 *   </tr>
 *   <tr>
 *    <td><code>--iron-icon-fill-color</code></td>
 *    <td>Fill color of the svg icon</td>
 *    <td><code>currentcolor</code></td>
 *   </tr>
 *   <tr>
 *    <td><code>--iron-icon-stroke-color</code></td>
 *    <td>Stroke color of the svg icon</td>
 *    <td>none</td>
 *   </tr>
 *  </tbody>
 * </table>
 */
@NpmPackage(name = "@polymer/iron-icon", version = "^3.0.1")
@Import(module = "@polymer/iron-icon/iron-icon.js")
public interface IronIconElement extends HTMLElement {

    // !wca! get icon: string | null | undefined
    /**
     * The name of the icon to use. The name should be of the form:
     * <code>iconset_name:icon_name</code>.
     */
    @JSProperty("icon")
    @Nullable
    String getIcon();

    // !wca! set icon: string | null | undefined
    /**
     * The name of the icon to use. The name should be of the form:
     * <code>iconset_name:icon_name</code>.
     */
    @JSProperty("icon")
    void setIcon(@Nullable String value);

    // !wca! get src: string | null | undefined
    /**
     * If using iron-icon without an iconset, you can set the src to be
     * the URL of an individual icon image file. Note that this will take
     * precedence over a given icon attribute.
     */
    @JSProperty("src")
    @Nullable
    String getSrc();

    // !wca! set src: string | null | undefined
    /**
     * If using iron-icon without an iconset, you can set the src to be
     * the URL of an individual icon image file. Note that this will take
     * precedence over a given icon attribute.
     */
    @JSProperty("src")
    void setSrc(@Nullable String value);

    // !wca! get theme: string | null | undefined
    /**
     * The name of the theme to used, if one is specified by the
     * iconset.
     */
    @JSProperty("theme")
    @Nullable
    String getTheme();

    // !wca! set theme: string | null | undefined
    /**
     * The name of the theme to used, if one is specified by the
     * iconset.
     */
    @JSProperty("theme")
    void setTheme(@Nullable String value);
}
