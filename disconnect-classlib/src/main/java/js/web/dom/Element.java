package js.web.dom;

import js.lang.Unknown;
import js.lang.VoidPromise;
import js.web.webanimations.Animatable;
import js.web.webcomponents.HTMLSlotElement;
import js.web.webcomponents.ShadowRoot;
import js.web.webcomponents.ShadowRootInit;
import js.web.webcomponents.Slotable;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * Element is the most general base class from which all objects in a Document inherit. It only has methods and properties common to all kinds of elements. More specific classes inherit from Element.
 */
public interface Element extends Node, Animatable, ChildNode, InnerHTML, NonDocumentTypeChildNode, ParentNode, Slotable {
    @JSBody(script = "return Element.prototype")
    static Element prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new Element()")
    static Element create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    @Nullable
    HTMLSlotElement getAssignedSlot();

    @JSProperty
    NamedNodeMap getAttributes();

    /**
     * Allows for manipulation of element's class content attribute as a set of whitespace-separated tokens through a DOMTokenList object.
     */
    @JSProperty
    DOMTokenList getClassList();

    /**
     * Returns the value of element's class content attribute. Can be set to change it.
     */
    @JSProperty
    String getClassName();

    @JSProperty
    void setClassName(String className);

    @JSProperty
    double getClientHeight();

    @JSProperty
    double getClientLeft();

    @JSProperty
    double getClientTop();

    @JSProperty
    double getClientWidth();

    /**
     * Returns the value of element's id content attribute. Can be set to change it.
     */
    @JSProperty
    String getId();

    @JSProperty
    void setId(String id);

    /**
     * Returns the local name.
     */
    @JSProperty
    String getLocalName();

    /**
     * Returns the namespace.
     */
    @JSProperty
    @Nullable
    String getNamespaceURI();

    @JSProperty
    @Nullable
    EventListener<Event> getOnfullscreenchange();

    @JSProperty
    void setOnfullscreenchange(EventListener<Event> onfullscreenchange);

    default void addFullscreenChangeEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
        addEventListener("fullscreenchange", listener, options);
    }

    default void addFullscreenChangeEventListener(EventListener<Event> listener, boolean options) {
        addEventListener("fullscreenchange", listener, options);
    }

    default void addFullscreenChangeEventListener(EventListener<Event> listener) {
        addEventListener("fullscreenchange", listener);
    }

    default void removeFullscreenChangeEventListener(EventListener<Event> listener, EventListenerOptions options) {
        removeEventListener("fullscreenchange", listener, options);
    }

    default void removeFullscreenChangeEventListener(EventListener<Event> listener, boolean options) {
        removeEventListener("fullscreenchange", listener, options);
    }

    default void removeFullscreenChangeEventListener(EventListener<Event> listener) {
        removeEventListener("fullscreenchange", listener);
    }

    @JSProperty
    @Nullable
    EventListener<Event> getOnfullscreenerror();

    @JSProperty
    void setOnfullscreenerror(EventListener<Event> onfullscreenerror);

    default void addFullscreenErrorEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
        addEventListener("fullscreenerror", listener, options);
    }

    default void addFullscreenErrorEventListener(EventListener<Event> listener, boolean options) {
        addEventListener("fullscreenerror", listener, options);
    }

    default void addFullscreenErrorEventListener(EventListener<Event> listener) {
        addEventListener("fullscreenerror", listener);
    }

    default void removeFullscreenErrorEventListener(EventListener<Event> listener, EventListenerOptions options) {
        removeEventListener("fullscreenerror", listener, options);
    }

    default void removeFullscreenErrorEventListener(EventListener<Event> listener, boolean options) {
        removeEventListener("fullscreenerror", listener, options);
    }

    default void removeFullscreenErrorEventListener(EventListener<Event> listener) {
        removeEventListener("fullscreenerror", listener);
    }

    @JSProperty
    String getOuterHTML();

    @JSProperty
    void setOuterHTML(String outerHTML);

    /**
     * Returns the namespace prefix.
     */
    @JSProperty
    @Nullable
    String getPrefix();

    @JSProperty
    double getScrollHeight();

    @JSProperty
    double getScrollLeft();

    @JSProperty
    void setScrollLeft(double scrollLeft);

    @JSProperty
    double getScrollTop();

    @JSProperty
    void setScrollTop(double scrollTop);

    @JSProperty
    double getScrollWidth();

    /**
     * Returns element's shadow root, if any, and if shadow root's mode is "open", and null otherwise.
     */
    @JSProperty
    @Nullable
    ShadowRoot getShadowRoot();

    /**
     * Returns the value of element's slot content attribute. Can be set to change it.
     */
    @JSProperty
    String getSlot();

    @JSProperty
    void setSlot(String slot);

    /**
     * Returns the HTML-uppercased qualified name.
     */
    @JSProperty
    String getTagName();

    /**
     * Creates a shadow root for element and returns it.
     */
    ShadowRoot attachShadow(ShadowRootInit init);

    /**
     * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
     */
    <E extends Element> E closest(String selector);

    /**
     * Returns element's first attribute whose qualified name is qualifiedName, and null if there is no such attribute otherwise.
     */
    @Nullable
    String getAttribute(String qualifiedName);

    /**
     * Returns element's attribute whose namespace is namespace and local name is localName, and null if there is no such attribute otherwise.
     */
    @Nullable
    String getAttributeNS(@Nullable String namespace, String localName);

    /**
     * Returns the qualified names of all element's attributes. Can contain duplicates.
     */
    String[] getAttributeNames();

    @Nullable
    Attr getAttributeNode(String name);

    @Nullable
    Attr getAttributeNodeNS(String namespaceURI, String localName);

    DOMRect getBoundingClientRect();

    DOMRectList getClientRects();

    /**
     * Returns a HTMLCollection of the elements in the object on which the method was invoked (a document or an element) that have all the classes given by classNames. The classNames argument is interpreted as a space-separated list of classes.
     */
    HTMLCollectionOf<Element> getElementsByClassName(String classNames);

    <E extends Element> HTMLCollectionOf<E> getElementsByTagName(String qualifiedName);

    <E extends Element> HTMLCollectionOf<E> getElementsByTagNameNS(String namespaceURI, String localName);

    /**
     * Returns true if element has an attribute whose qualified name is qualifiedName, and false otherwise.
     */
    boolean hasAttribute(String qualifiedName);

    /**
     * Returns true if element has an attribute whose namespace is namespace and local name is localName.
     */
    boolean hasAttributeNS(@Nullable String namespace, String localName);

    /**
     * Returns true if element has attributes, and false otherwise.
     */
    boolean hasAttributes();

    boolean hasPointerCapture(int pointerId);

    @Nullable
    Element insertAdjacentElement(InsertPosition position, Element insertedElement);

    void insertAdjacentHTML(InsertPosition where, String html);

    void insertAdjacentText(InsertPosition where, String text);

    /**
     * Returns true if matching selectors against element's root yields element, and false otherwise.
     */
    boolean matches(String selectors);

    Unknown msGetRegionContent();

    void releasePointerCapture(int pointerId);

    /**
     * Removes element's first attribute whose qualified name is qualifiedName.
     */
    void removeAttribute(String qualifiedName);

    /**
     * Removes element's attribute whose namespace is namespace and local name is localName.
     */
    void removeAttributeNS(@Nullable String namespace, String localName);

    Attr removeAttributeNode(Attr attr);

    /**
     * Displays element fullscreen and resolves promise when done.
     * <p>
     * When supplied, options's navigationUI member indicates whether showing navigation UI while in fullscreen is preferred or not. If set to "show", navigation simplicity is preferred over screen space, and if set to "hide", more screen space is preferred. User agents are always free to honor user preference over the application's. The default value "auto" indicates no application preference.
     */
    VoidPromise requestFullscreen(FullscreenOptions options);

    VoidPromise requestFullscreen();

    void requestPointerLock();

    void scroll(ScrollToOptions options);

    void scroll();

    void scroll(double x, double y);

    void scrollBy(ScrollToOptions options);

    void scrollBy();

    void scrollBy(double x, double y);

    void scrollIntoView(ScrollIntoViewOptions arg);

    void scrollIntoView(boolean arg);

    void scrollIntoView();

    void scrollTo(ScrollToOptions options);

    void scrollTo();

    void scrollTo(double x, double y);

    /**
     * Sets the value of element's first attribute whose qualified name is qualifiedName to value.
     */
    void setAttribute(String qualifiedName, String value);

    /**
     * Sets the value of element's attribute whose namespace is namespace and local name is localName to value.
     */
    void setAttributeNS(@Nullable String namespace, String qualifiedName, String value);

    @Nullable
    Attr setAttributeNode(Attr attr);

    @Nullable
    Attr setAttributeNodeNS(Attr attr);

    void setPointerCapture(int pointerId);

    /**
     * If force is not given, "toggles" qualifiedName, removing it if it is present and adding it if it is not present. If force is true, adds qualifiedName. If force is false, removes qualifiedName.
     * <p>
     * Returns true if qualifiedName is now present, and false otherwise.
     */
    boolean toggleAttribute(String qualifiedName, boolean force);

    boolean toggleAttribute(String qualifiedName);

    boolean webkitMatchesSelector(String selectors);

}
