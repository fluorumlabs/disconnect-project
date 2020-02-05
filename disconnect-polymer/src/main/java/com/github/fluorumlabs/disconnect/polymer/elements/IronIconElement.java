package com.github.fluorumlabs.disconnect.polymer.elements;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.polymer.Polymer;
import js.web.dom.HTMLElement;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * The `iron-icon` element displays an icon. By default an icon renders as a 24px
 * square.
 * <p>
 * Example using src:
 * <p>
 * <iron-icon src="star.png"></iron-icon>
 * <p>
 * Example setting size to 32px x 32px:
 * <p>
 * <iron-icon class="big" src="big_star.png"></iron-icon>
 *
 * <style is="custom-style">
 * .big {
 * --iron-icon-height: 32px;
 * --iron-icon-width: 32px;
 * }
 * </style>
 * <p>
 * The iron elements include several sets of icons. To use the default set of
 * icons, import `iron-icons.js` and use the `icon` attribute to specify an icon:
 *
 * <script type="module">
 * import "@polymer/iron-icons/iron-icons.js";
 * </script>
 * <p>
 * <iron-icon icon="menu"></iron-icon>
 * <p>
 * To use a different built-in set of icons, import the specific
 * `iron-icons/<iconset>-icons.js`, and specify the icon as `<iconset>:<icon>`.
 * For example, to use a communication icon, you would use:
 *
 * <script type="module">
 * import "@polymer/iron-icons/communication-icons.js";
 * </script>
 * <p>
 * <iron-icon icon="communication:email"></iron-icon>
 * <p>
 * You can also create custom icon sets of bitmap or SVG icons.
 * <p>
 * Example of using an icon named `cherry` from a custom iconset with the ID
 * `fruit`:
 * <p>
 * <iron-icon icon="fruit:cherry"></iron-icon>
 * <p>
 * See `<iron-iconset>` and `<iron-iconset-svg>` for more information about how to
 * create a custom iconset.
 * <p>
 * See the `iron-icons` demo to see the icons available in the various iconsets.
 * <p>
 * ### Styling
 * <p>
 * The following custom properties are available for styling:
 * <p>
 * Custom property | Description | Default
 * ----------------|-------------|----------
 * `--iron-icon` | Mixin applied to the icon | {}
 * `--iron-icon-width` | Width of the icon | `24px`
 * `--iron-icon-height` | Height of the icon | `24px`
 * `--iron-icon-fill-color` | Fill color of the svg icon | `currentcolor`
 * `--iron-icon-stroke-color` | Stroke color of the svg icon | none
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
	/**
	 * The name of the icon to use. The name should be of the form:
	 * `iconset_name:icon_name`.
	 */
	@Nullable
	@JSProperty
	String getIcon();

	/**
	 * The name of the icon to use. The name should be of the form:
	 * `iconset_name:icon_name`.
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
