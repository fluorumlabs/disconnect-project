package com.github.fluorumlabs.disconnect.polymer.elements;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.polymer.Polymer;
import js.web.dom.HTMLElement;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * The <code>iron-icon</code> element displays an icon. By default an icon renders as a 24px
 * square.
 * <p>
 * Example using src:
 *
 * <pre><code>&lt;iron-icon src=&quot;star.png&quot;&gt;&lt;/iron-icon&gt;
 * </code></pre>
 * Example setting size to 32px x 32px:
 *
 * <pre><code>&lt;iron-icon class=&quot;big&quot; src=&quot;big_star.png&quot;&gt;&lt;/iron-icon&gt;
 *
 * &lt;style is=&quot;custom-style&quot;&gt;
 *   .big {
 *     --iron-icon-height: 32px;
 *     --iron-icon-width: 32px;
 *   }
 * &lt;/style&gt;
 * </code></pre>
 * The iron elements include several sets of icons. To use the default set of
 * icons, import <code>iron-icons.js</code> and use the <code>icon</code> attribute to specify an icon:
 *
 * <pre><code>&lt;script type=&quot;module&quot;&gt;
 *   import &quot;@polymer/iron-icons/iron-icons.js&quot;;
 * &lt;/script&gt;
 *
 * &lt;iron-icon icon=&quot;menu&quot;&gt;&lt;/iron-icon&gt;
 * </code></pre>
 * To use a different built-in set of icons, import the specific
 * <code>iron-icons/&lt;iconset&gt;-icons.js</code>, and specify the icon as <code>&lt;iconset&gt;:&lt;icon&gt;</code>.
 * For example, to use a communication icon, you would use:
 *
 * <pre><code>&lt;script type=&quot;module&quot;&gt;
 *   import &quot;@polymer/iron-icons/communication-icons.js&quot;;
 * &lt;/script&gt;
 *
 * &lt;iron-icon icon=&quot;communication:email&quot;&gt;&lt;/iron-icon&gt;
 * </code></pre>
 * You can also create custom icon sets of bitmap or SVG icons.
 * <p>
 * Example of using an icon named <code>cherry</code> from a custom iconset with the ID
 * <code>fruit</code>:
 *
 * <pre><code>&lt;iron-icon icon=&quot;fruit:cherry&quot;&gt;&lt;/iron-icon&gt;
 * </code></pre>
 * See <code>&lt;iron-iconset&gt;</code> and <code>&lt;iron-iconset-svg&gt;</code> for more information about how to
 * create a custom iconset.
 * <p>
 * See the <code>iron-icons</code> demo to see the icons available in the various iconsets.
 *
 * <h3>Styling</h3>
 * The following custom properties are available for styling:
 *
 * <table>
 * <thead>
 * <tr><th>Custom property</th><th>Description</th><th>Default</th></tr>
 * </thead>
 * <tbody>
 * <tr><td><code>--iron-icon</code></td><td>Mixin applied to the icon</td><td>{}</td></tr>
 * <tr><td><code>--iron-icon-width</code></td><td>Width of the icon</td><td><code>24px</code></td></tr>
 * <tr><td><code>--iron-icon-height</code></td><td>Height of the icon</td><td><code>24px</code></td></tr>
 * <tr><td><code>--iron-icon-fill-color</code></td><td>Fill color of the svg
 * icon</td><td><code>currentcolor</code></td></tr>
 * <tr><td><code>--iron-icon-stroke-color</code></td><td>Stroke color of the svg icon</td><td>none</td></tr>
 * </tbody>
 * </table>
 */
@NpmPackage(
		name = "@polymer/polymer",
		version = Polymer.VERSION
)
@Import(
		symbols = "IronIcon",
		module = "@polymer/iron-icon/iron-icon.js"
)
public interface IronIconElement extends HTMLElement {
	String TAGNAME = "iron-icon";
	/**
	 * The name of the icon to use. The name should be of the form:
	 * <code>iconset_name:icon_name</code>.
	 */
	@Nullable
	@JSProperty
	String getIcon();

	/**
	 * The name of the icon to use. The name should be of the form:
	 * <code>iconset_name:icon_name</code>.
	 */
	@JSProperty
	void setIcon(String icon);

	/**
	 * The name of the theme to used, if one is specified by the
	 * iconset.
	 */
	@Nullable
	@JSProperty
	String getTheme();

	/**
	 * The name of the theme to used, if one is specified by the
	 * iconset.
	 */
	@JSProperty
	void setTheme(String theme);

	/**
	 * If using iron-icon without an iconset, you can set the src to be
	 * the URL of an individual icon image file. Note that this will take
	 * precedence over a given icon attribute.
	 */
	@Nullable
	@JSProperty
	String getSrc();

	/**
	 * If using iron-icon without an iconset, you can set the src to be
	 * the URL of an individual icon image file. Note that this will take
	 * precedence over a given icon attribute.
	 */
	@JSProperty
	void setSrc(String src);
}
