package js.lang.external.polymer.ironiconsetsvg;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.web.dom.Element;
import js.web.dom.HTMLElement;
import org.teavm.jso.JSMethod;
import org.teavm.jso.JSProperty;
import javax.annotation.Nullable;

/**
 * The <code>iron-iconset-svg</code> element allows users to define their own icon sets that contain svg icons. The svg icon elements should be children of the <code>iron-iconset-svg</code> element. Multiple icons should be given distinct id's.
 *
 * Using svg elements to create icons has a few advantages over traditional bitmap graphics like jpg or png. Icons that use svg are vector based so they are resolution independent and should look good on any device. They are stylable via css. Icons can be themed, colorized, and even animated.
 *
 * Example:
 *
 * <pre><code> &lt;iron-iconset-svg name="my-svg-icons" size="24"&gt;
 *    &lt;svg&gt;
 *      &lt;defs&gt;
 *        &lt;g id="shape"&gt;
 *          &lt;rect x="12" y="0" width="12" height="24" /&gt;
 *          &lt;circle cx="12" cy="12" r="12" /&gt;
 *        &lt;/g&gt;
 *      &lt;/defs&gt;
 *    &lt;/svg&gt;
 *  &lt;/iron-iconset-svg&gt;
 * </code></pre>
 * This will automatically register the icon set "my-svg-icons" to the iconset database. To use these icons from within another element, make a <code>iron-iconset</code> element and call the <code>byId</code> method to retrieve a given iconset. To apply a particular icon inside an element use the <code>applyIcon</code> method. For example:
 *
 * <pre><code> iconset.applyIcon(iconNode, 'car');
 * </code></pre>
 */
@NpmPackage(name = "@polymer/iron-iconset-svg", version = "^3.0.1")
@Import(module = "@polymer/iron-iconset-svg/iron-iconset-svg.js")
public interface IronIconsetSvgElement extends HTMLElement {

    // !wca! applyIcon: (element: Element | null, iconName: string): Element | null
    /**
     * Applies an icon to the given element.
     *
     * An svg icon is prepended to the element's shadowRoot if it exists,
     * otherwise to the element itself.
     *
     * If RTL mirroring is enabled, and the icon is marked to be mirrored in
     * RTL, the element will be tested (once and only once ever for each
     * iconset) to determine the direction of the subtree the element is in.
     * This direction will apply to all future icon applications, although only
     * icons marked to be mirrored will be affected.
     *
     * <strong>element</strong>: Element to which the icon is applied.
     * <strong>iconName</strong>: Name of the icon to apply.
     */
    @JSMethod("applyIcon")
    @Nullable
    Element applyIcon(@Nullable Element element, String iconName);

    // !wca! getIconNames: (): any[]
    /**
     * Construct an array of all icon names in this iconset.
     */
    @JSMethod("getIconNames")
    String[] getIconNames();

    // !wca! removeIcon: (element: Element | null): void
    /**
     * Remove an icon from the given element by undoing the changes effected
     * by <code>applyIcon</code>.
     *
     * <strong>element</strong>: The element from which the icon is removed.
     */
    @JSMethod("removeIcon")
    void removeIcon(@Nullable Element element);

    // !wca! get name: string | null | undefined
    /**
     * The name of the iconset.
     */
    @JSProperty("name")
    @Nullable
    String getName();

    // !wca! set name: string | null | undefined
    /**
     * The name of the iconset.
     */
    @JSProperty("name")
    void setName(@Nullable String value);

    // !wca! get rtlMirroring: boolean | null | undefined
    /**
     * Set to true to enable mirroring of icons where specified when they are
     * stamped. Icons that should be mirrored should be decorated with a
     * <code>mirror-in-rtl</code> attribute.
     *
     * NOTE: For performance reasons, direction will be resolved once per
     * document per iconset, so moving icons in and out of RTL subtrees will
     * not cause their mirrored state to change.
     */
    @JSProperty("rtlMirroring")
    boolean isRtlMirroring();

    // !wca! set rtlMirroring: boolean | null | undefined
    /**
     * Set to true to enable mirroring of icons where specified when they are
     * stamped. Icons that should be mirrored should be decorated with a
     * <code>mirror-in-rtl</code> attribute.
     *
     * NOTE: For performance reasons, direction will be resolved once per
     * document per iconset, so moving icons in and out of RTL subtrees will
     * not cause their mirrored state to change.
     */
    @JSProperty("rtlMirroring")
    void setRtlMirroring(boolean value);

    // !wca! get size: number | null | undefined
    /**
     * The size of an individual icon. Note that icons must be square.
     */
    @JSProperty("size")
    double getSize();

    // !wca! set size: number | null | undefined
    /**
     * The size of an individual icon. Note that icons must be square.
     */
    @JSProperty("size")
    void setSize(double value);

    // !wca! get useGlobalRtlAttribute: boolean | null | undefined
    /**
     * Set to true to measure RTL based on the dir attribute on the body or
     * html elements (measured on document.body or document.documentElement as
     * available).
     */
    @JSProperty("useGlobalRtlAttribute")
    boolean isUseGlobalRtlAttribute();

    // !wca! set useGlobalRtlAttribute: boolean | null | undefined
    /**
     * Set to true to measure RTL based on the dir attribute on the body or
     * html elements (measured on document.body or document.documentElement as
     * available).
     */
    @JSProperty("useGlobalRtlAttribute")
    void setUseGlobalRtlAttribute(boolean value);
}
