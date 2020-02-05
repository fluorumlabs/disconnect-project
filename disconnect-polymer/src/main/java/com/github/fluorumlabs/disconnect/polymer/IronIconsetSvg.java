package com.github.fluorumlabs.disconnect.polymer;

import com.github.fluorumlabs.disconnect.polymer.elements.IronIconsetSvgElement;
import com.github.fluorumlabs.disconnect.zero.component.AbstractComponent;
import com.github.fluorumlabs.disconnect.zero.component.Component;
import com.github.fluorumlabs.disconnect.zero.component.HasComponent;
import js.web.dom.Element;
import js.web.dom.svg.SVGSVGElement;

import javax.annotation.Nullable;

/**
 * The `iron-iconset-svg` element allows users to define their own icon sets
 * that contain svg icons. The svg icon elements should be children of the
 * `iron-iconset-svg` element. Multiple icons should be given distinct id's.
 * <p>
 * Using svg elements to create icons has a few advantages over traditional
 * bitmap graphics like jpg or png. Icons that use svg are vector based so
 * they are resolution independent and should look good on any device. They
 * are stylable via css. Icons can be themed, colorized, and even animated.
 * <p>
 * Example:
 * <p>
 * <iron-iconset-svg name="my-svg-icons" size="24">
 * <svg>
 * <defs>
 * <g id="shape">
 * <rect x="12" y="0" width="12" height="24" />
 * <circle cx="12" cy="12" r="12" />
 * </g>
 * </defs>
 * </svg>
 * </iron-iconset-svg>
 * <p>
 * This will automatically register the icon set "my-svg-icons" to the iconset
 * database.  To use these icons from within another element, make a
 * `iron-iconset` element and call the `byId` method
 * to retrieve a given iconset. To apply a particular icon inside an
 * element use the `applyIcon` method. For example:
 * <p>
 * iconset.applyIcon(iconNode, 'car');
 */
public class IronIconsetSvg
		extends AbstractComponent<IronIconsetSvgElement>
		implements HasComponent<IronIconsetSvgElement, IronIconsetSvg, Component<SVGSVGElement>> {
	public IronIconsetSvg() {
		super("iron-iconset-svg");
	}

	/**
	 * The name of the iconset.
	 */
	@Nullable
	public String name() {
		return getNode().getName();
	}

	/**
	 * The name of the iconset.
	 */
	public IronIconsetSvg name(String name) {
		getNode().setName(name);
		return this;
	}

	/**
	 * The size of an individual icon. Note that icons must be square.
	 */
	public double size() {
		return getNode().getSize();
	}

	/**
	 * The size of an individual icon. Note that icons must be square.
	 */
	public IronIconsetSvg size(double size) {
		getNode().setSize(size);
		return this;
	}

	/**
	 * Set to true to enable mirroring of icons where specified when they are
	 * stamped. Icons that should be mirrored should be decorated with a
	 * `mirror-in-rtl` attribute.
	 * <p>
	 * NOTE: For performance reasons, direction will be resolved once per
	 * document per iconset, so moving icons in and out of RTL subtrees will
	 * not cause their mirrored state to change.
	 */
	public boolean rtlMirroring() {
		return getNode().isRtlMirroring();
	}

	/**
	 * Set to true to enable mirroring of icons where specified when they are
	 * stamped. Icons that should be mirrored should be decorated with a
	 * `mirror-in-rtl` attribute.
	 * <p>
	 * NOTE: For performance reasons, direction will be resolved once per
	 * document per iconset, so moving icons in and out of RTL subtrees will
	 * not cause their mirrored state to change.
	 */
	public IronIconsetSvg rtlMirroring(boolean rtlMirroring) {
		getNode().setRtlMirroring(rtlMirroring);
		return this;
	}

	/**
	 * Set to true to measure RTL based on the dir attribute on the body or
	 * html elements (measured on document.body or document.documentElement as
	 * available).
	 */
	public boolean useGlobalRtlAttribute() {
		return getNode().isUseGlobalRtlAttribute();
	}

	/**
	 * Set to true to measure RTL based on the dir attribute on the body or
	 * html elements (measured on document.body or document.documentElement as
	 * available).
	 */
	public IronIconsetSvg useGlobalRtlAttribute(boolean useGlobalRtlAttribute) {
		getNode().setUseGlobalRtlAttribute(useGlobalRtlAttribute);
		return this;
	}

	/**
	 * Construct an array of all icon names in this iconset.
	 *
	 * @return Array of icon names.
	 */
	public String[] getIconNames() {
		return getNode().getIconNames();
	}

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
	public Element applyIcon(Element element, String iconName) {
		return getNode().applyIcon(element, iconName);
	}

	/**
	 * Remove an icon from the given element by undoing the changes effected
	 * by `applyIcon`.
	 *
	 * @param element The element from which the icon is removed.
	 */
	public void removeIcon(Element element) {
		getNode().removeIcon(element);
	}
}
