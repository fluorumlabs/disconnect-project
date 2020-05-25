package com.github.fluorumlabs.disconnect.core.components;

import com.github.fluorumlabs.disconnect.core.containers.ArrayLikeBackedComponentList;
import com.github.fluorumlabs.disconnect.core.containers.ComponentList;
import com.github.fluorumlabs.disconnect.core.containers.ParentNodeBackedComponentList;
import com.github.fluorumlabs.disconnect.core.internals.ComponentReferenceHolder;
import com.github.fluorumlabs.disconnect.core.internals.TagRegistry;
import js.lang.Any;
import js.lang.VoidPromise;
import js.web.dom.*;
import js.web.webcomponents.ShadowRoot;
import js.web.webcomponents.ShadowRootInit;
import js.web.webcomponents.ShadowRootMode;

import java.util.Optional;

/**
 * Created by Artem Godin on 5/12/2020.
 */
public interface ElementApi<X extends Element> extends HasElement<X> {

    //TODO
    //@JSProperty
    //@Nullable
    //HTMLSlotElement getAssignedSlot();

    /**
     * Allows for manipulation of element's class content attribute as a set of whitespace-separated tokens through a DOMTokenList object.
     */
    default DOMTokenList getClassList() {
        return getElement().getClassList();
    }

    /**
     * Returns the value of element's class content attribute. Can be set to change it.
     */
    default String getClassName() {
        return getElement().getClassName();
    }

    default void setClassName(String className) {
        getElement().setClassName(className);
    }

    default DOMRectReadOnly getClientRect() {
        return DOMRectReadOnly.create(getElement().getClientLeft(), getElement().getClientTop(), getElement().getClientWidth(), getElement().getClientHeight());
    }

    /**
     * Returns the value of element's id content attribute. Can be set to change it.
     */
    default String getId() {
        return getElement().getId();
    }

    default void setId(String id) {
        getElement().setId(id);
    }

    default DOMRectReadOnly getScrollRect() {
        return DOMRectReadOnly.create(getElement().getScrollLeft(), getElement().getScrollTop(), getElement().getScrollWidth(), getElement().getScrollHeight());
    }

    default void setScrollLeft(double scrollLeft) {
        getElement().setScrollLeft(scrollLeft);
    }

    default void setScrollTop(double scrollTop) {
        getElement().setScrollTop(scrollTop);
    }


    /**
     * Returns element's shadow root, if any, and if shadow root's mode is "open", and null otherwise.
     */
    default Optional<ComponentList<Component<?>>> getShadowRoot() {
        ShadowRoot shadowRoot = getElement().getShadowRoot();
        if (shadowRoot == null) {
            return Optional.empty();
        } else {
            return Optional.of(new ParentNodeBackedComponentList<>(shadowRoot));
        }
    }

    /**
     * Returns the value of element's slot content attribute. Can be set to change it.
     */
    default String getSlot() {
        return getElement().getSlot();
    }

    default void setSlot(String slot) {
        getElement().setSlot(slot);
    }

    /**
     * Returns the HTML-uppercased qualified name.
     */
    default String getTagName() {
        return getElement().getTagName();
    }

    /**
     * Creates a shadow root for element and returns it.
     * @return
     */
    default ComponentList<Component<?>> attachShadow(boolean delegateFocus, boolean open) {
        ShadowRootInit init = Any.empty();
        init.setDelegatesFocus(delegateFocus);
        init.setMode(open ? ShadowRootMode.OPEN : ShadowRootMode.CLOSED);
        ShadowRoot shadowRoot = getElement().attachShadow(init);
        ComponentList<Component<?>> shadowRootComponentList = new ParentNodeBackedComponentList<>(shadowRoot);
        shadowRoot.<ComponentReferenceHolder>cast().set(shadowRootComponentList);
        return shadowRootComponentList;
    }

    default ComponentList<Component<?>> attachShadow() {
        return attachShadow(false, true);
    }

    default ComponentList<Component<?>> attachShadow(boolean delegateFocus) {
        return attachShadow(delegateFocus, true);
    }

    /**
     * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
     */
    default <E extends Component<?>> Optional<E> closest(String selector) {
        return Optional.ofNullable(TagRegistry.recover(getElement().closest(selector)));
    }

    /**
     * Returns element's first attribute whose qualified name is qualifiedName, and null if there is no such attribute otherwise.
     */
    default Optional<String> getAttribute(String qualifiedName) {
        return Optional.ofNullable(getElement().getAttribute(qualifiedName));
    }

    default DOMRectReadOnly getBoundingClientRect() {
        return getElement().getBoundingClientRect();
    }

    /**
     * Returns a HTMLCollection of the elements in the object on which the method was invoked (a document or an element) that have all the classes given by classNames. The classNames argument is interpreted as a space-separated list of classes.
     */
    default ComponentList<Component<?>> getByClassName(String classNames) {
        return  new ArrayLikeBackedComponentList<>(getElement().getElementsByClassName(classNames));
    }
    default ComponentList<Component<?>> getByTagName(String qualifiedName) {
        return  new ArrayLikeBackedComponentList<>(getElement().getElementsByTagName(qualifiedName));
    }

    /**
     * Returns true if element has an attribute whose qualified name is qualifiedName, and false otherwise.
     */
    default boolean hasAttribute(String qualifiedName) {
        return getElement().hasAttribute(qualifiedName);
    }

    /**
     * Returns true if element has attributes, and false otherwise.
     */
    default boolean hasAttributes() {
        return getElement().hasAttributes();
    }

    default boolean hasPointerCapture(int pointerId) {
        return getElement().hasPointerCapture(pointerId);
    }

    /**
     * Returns true if matching selectors against element's root yields element, and false otherwise.
     */
    default boolean matches(String selectors) {
        return getElement().matches(selectors);
    }

    default void releasePointerCapture(int pointerId) {
        getElement().releasePointerCapture(pointerId);
    }

    /**
     * Removes element's first attribute whose qualified name is qualifiedName.
     */
    default void removeAttribute(String qualifiedName) {
        getElement().removeAttribute(qualifiedName);
    }

    /**
     * Displays element fullscreen and resolves promise when done.
     * <p>
     * When supplied, options's navigationUI member indicates whether showing navigation UI while in fullscreen is preferred or not. If set to "show", navigation simplicity is preferred over screen space, and if set to "hide", more screen space is preferred. User agents are always free to honor user preference over the application's. The default value "auto" indicates no application preference.
     */
    default VoidPromise requestFullscreen(FullscreenNavigationUI navigationUI) {
        FullscreenOptions options = Any.empty();
        options.setNavigationUI(navigationUI);
        return getElement().requestFullscreen(options);
    }

    default VoidPromise requestFullscreen() {
        return getElement().requestFullscreen();
    }

    default void requestPointerLock() {
        getElement().requestPointerLock();
    }

    default void scrollBy(Double x, Double y, ScrollBehavior behavior) {
        ScrollToOptions options = Any.empty();
        if (x != null) {
            options.setLeft(x);
        }
        if (y != null) {
            options.setTop(y);
        }
        options.setBehavior(behavior != null ? behavior : ScrollBehavior.AUTO);
        getElement().scrollBy(options);
    }

    default void scrollBy(Double x, Double y) {
        scrollBy(x,y,null);
    }

    default void scrollIntoView(ScrollLogicalPosition vertical, ScrollLogicalPosition horizontal, ScrollBehavior behavior) {
        ScrollIntoViewOptions options = Any.empty();
        options.setBlock(vertical!=null?vertical:ScrollLogicalPosition.START);
        options.setInline(horizontal!=null?horizontal:ScrollLogicalPosition.NEAREST);
        options.setBehavior(behavior != null ? behavior : ScrollBehavior.AUTO);
        getElement().scrollIntoView(options);
    }

    default void scrollIntoView(ScrollLogicalPosition vertical, ScrollLogicalPosition horizontal) {
        scrollIntoView(vertical, horizontal, null);
    }

    default void scrollIntoView() {
        getElement().scrollIntoView();
    }

    default void scrollTo(Double x, Double y, ScrollBehavior behavior) {
        ScrollToOptions options = Any.empty();
        if (x != null) {
            options.setLeft(x);
        }
        if (y != null) {
            options.setTop(y);
        }
        options.setBehavior(behavior != null ? behavior : ScrollBehavior.AUTO);
        getElement().scrollTo(options);
    }

    default void scrollTo(Double x, Double y) {
        scrollTo(x,y,null);
    }

    /**
     * Sets the value of element's first attribute whose qualified name is qualifiedName to value.
     */
    default void setAttribute(String qualifiedName, String value) {
        getElement().setAttribute(qualifiedName, value);
    }

    default void setPointerCapture(int pointerId) {
        getElement().setPointerCapture(pointerId);
    }

    /**
     * If force is not given, "toggles" qualifiedName, removing it if it is present and adding it if it is not present. If force is true, adds qualifiedName. If force is false, removes qualifiedName.
     * <p>
     * Returns true if qualifiedName is now present, and false otherwise.
     */
    default boolean toggleAttribute(String qualifiedName, boolean force) {
        return getElement().toggleAttribute(qualifiedName, force);
    }

    default boolean toggleAttribute(String qualifiedName) {
        return getElement().toggleAttribute(qualifiedName);
    }
}
