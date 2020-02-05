package com.github.fluorumlabs.disconnect.polymer.elements;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.polymer.Polymer;
import js.web.dom.Element;
import js.web.dom.HTMLElement;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * The <code>iron-iconset-svg</code> element allows users to define their own icon sets
 * that contain svg icons. The svg icon elements should be children of the
 * <code>iron-iconset-svg</code> element. Multiple icons should be given distinct id's.
 * <p>
 * Using svg elements to create icons has a few advantages over traditional
 * bitmap graphics like jpg or png. Icons that use svg are vector based so
 * they are resolution independent and should look good on any device. They
 * are stylable via css. Icons can be themed, colorized, and even animated.
 * <p>
 * Example:
 *
 * <pre><code>&lt;iron-iconset-svg name=&quot;my-svg-icons&quot; size=&quot;24&quot;&gt;
 *   &lt;svg&gt;
 *     &lt;defs&gt;
 *       &lt;g id=&quot;shape&quot;&gt;
 *         &lt;rect x=&quot;12&quot; y=&quot;0&quot; width=&quot;12&quot; height=&quot;24&quot; /&gt;
 *         &lt;circle cx=&quot;12&quot; cy=&quot;12&quot; r=&quot;12&quot; /&gt;
 *       &lt;/g&gt;
 *     &lt;/defs&gt;
 *   &lt;/svg&gt;
 * &lt;/iron-iconset-svg&gt;
 * </code></pre>
 * This will automatically register the icon set &quot;my-svg-icons&quot; to the iconset
 * database.  To use these icons from within another element, make a
 * <code>iron-iconset</code> element and call the <code>byId</code> method
 * to retrieve a given iconset. To apply a particular icon inside an
 * element use the <code>applyIcon</code> method. For example:
 *
 * <pre><code>iconset.applyIcon(iconNode, 'car');
 * </code></pre>
 */
@NpmPackage(
		name = "@polymer/polymer",
		version = Polymer.VERSION
)
@Import(
		symbols = "IronIconsetSvg",
		module = "@polymer/iron-iconset-svg/iron-iconset-svg.js"
)
public interface IronIconsetSvgElement extends HTMLElement {
	/**
	 * The name of the iconset.
	 */
	@Nullable
	@JSProperty
	String getName();

	/**
	 * The name of the iconset.
	 */
	@JSProperty
	void setName(String name);

	/**
	 * The size of an individual icon. Note that icons must be square.
	 */
	@JSProperty
	double getSize();

	/**
	 * The size of an individual icon. Note that icons must be square.
	 */
	@JSProperty
	void setSize(double size);

	/**
	 * Set to true to enable mirroring of icons where specified when they are
	 * stamped. Icons that should be mirrored should be decorated with a
	 * <code>mirror-in-rtl</code> attribute.
	 * <p>
	 * NOTE: For performance reasons, direction will be resolved once per
	 * document per iconset, so moving icons in and out of RTL subtrees will
	 * not cause their mirrored state to change.
	 */
	@JSProperty
	boolean isRtlMirroring();

	/**
	 * Set to true to enable mirroring of icons where specified when they are
	 * stamped. Icons that should be mirrored should be decorated with a
	 * <code>mirror-in-rtl</code> attribute.
	 * <p>
	 * NOTE: For performance reasons, direction will be resolved once per
	 * document per iconset, so moving icons in and out of RTL subtrees will
	 * not cause their mirrored state to change.
	 */
	@JSProperty
	void setRtlMirroring(boolean rtlMirroring);

	/**
	 * Set to true to measure RTL based on the dir attribute on the body or
	 * html elements (measured on document.body or document.documentElement as
	 * available).
	 */
	@JSProperty
	boolean isUseGlobalRtlAttribute();

	/**
	 * Set to true to measure RTL based on the dir attribute on the body or
	 * html elements (measured on document.body or document.documentElement as
	 * available).
	 */
	@JSProperty
	void setUseGlobalRtlAttribute(boolean useGlobalRtlAttribute);

	/**
	 * Construct an array of all icon names in this iconset.
	 *
	 * @return Array of icon names.
	 */
	String[] getIconNames();

	/**
	 * Applies an icon to the given element.
	 * <p>
	 * An svg icon is prepended to the element's shadowRoot if it exists,
	 * otherwise to the element itself.
	 * <p>
	 * If RTL mirroring is enabled, and the icon is marked to be mirrored in
	 * RTL, the element will be tested (once and only once ever for each
	 * iconset) to determine the direction of the subtree the element is in.
	 * This direction will apply to all future icon applications, although only
	 * icons marked to be mirrored will be affected.
	 *
	 * @param element  Element to which the icon is applied.
	 * @param iconName Name of the icon to apply.
	 *
	 * @return The svg element which renders the icon.
	 */
	Element applyIcon(Element element, String iconName);

	/**
	 * Remove an icon from the given element by undoing the changes effected
	 * by `applyIcon`.
	 *
	 * @param element The element from which the icon is removed.
	 */
	void removeIcon(Element element);
}
