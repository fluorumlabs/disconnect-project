package js.lang.external.polymer.lib.legacy;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import js.lang.external.polymer.lib.utils.FlattenedNodesObserver;
import js.web.dom.*;
import js.web.webcomponents.HTMLSlotElement;
import org.teavm.jso.JSFunctor;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * Node API wrapper class returned from <code>Polymer.dom.(target)</code> when
 * <code>target</code> is a <code>Node</code>.
 *
 */
@NpmPackage(
    name = "@polymer/polymer",
    version = "^3.4.1"
)
@Import(
    module = "@polymer/polymer/lib/legacy/polymer.dom.js"
)
public interface DomApiNative extends Any {
  /**
   * For shadow roots, returns the currently focused element within this
   * shadow root.
   *
   * return {Node|undefined} Currently focused element
   *
   */
  @JSProperty("activeElement")
  Any getActiveElement();

  @JSProperty("parentNode")
  @Nullable
  Node getParentNode();

  @JSProperty("parentNode")
  void setParentNode(@Nullable Node value);

  @JSProperty("firstChild")
  @Nullable
  Node getFirstChild();

  @JSProperty("firstChild")
  void setFirstChild(@Nullable Node value);

  @JSProperty("lastChild")
  @Nullable
  Node getLastChild();

  @JSProperty("lastChild")
  void setLastChild(@Nullable Node value);

  @JSProperty("nextSibling")
  @Nullable
  Node getNextSibling();

  @JSProperty("nextSibling")
  void setNextSibling(@Nullable Node value);

  @JSProperty("previousSibling")
  @Nullable
  Node getPreviousSibling();

  @JSProperty("previousSibling")
  void setPreviousSibling(@Nullable Node value);

  @JSProperty("firstElementChild")
  @Nullable
  HTMLElement getFirstElementChild();

  @JSProperty("firstElementChild")
  void setFirstElementChild(@Nullable HTMLElement value);

  @JSProperty("lastElementChild")
  @Nullable
  HTMLElement getLastElementChild();

  @JSProperty("lastElementChild")
  void setLastElementChild(@Nullable HTMLElement value);

  @JSProperty("nextElementSibling")
  @Nullable
  HTMLElement getNextElementSibling();

  @JSProperty("nextElementSibling")
  void setNextElementSibling(@Nullable HTMLElement value);

  @JSProperty("previousElementSibling")
  @Nullable
  HTMLElement getPreviousElementSibling();

  @JSProperty("previousElementSibling")
  void setPreviousElementSibling(@Nullable HTMLElement value);

  @JSProperty("childNodes")
  Node[] getChildNodes();

  @JSProperty("childNodes")
  void setChildNodes(Node[] value);

  @JSProperty("children")
  HTMLElement[] getChildren();

  @JSProperty("children")
  void setChildren(HTMLElement[] value);

  @JSProperty("classList")
  @Nullable
  DOMTokenList getClassList();

  @JSProperty("classList")
  void setClassList(@Nullable DOMTokenList value);

  @JSProperty("textContent")
  String getTextContent();

  @JSProperty("textContent")
  void setTextContent(String value);

  @JSProperty("innerHTML")
  String getInnerHTML();

  @JSProperty("innerHTML")
  void setInnerHTML(String value);

  /**
   * Returns an instance of <code>FlattenedNodesObserver</code> that
   * listens for node changes on this element.
   *
   * @param callback Called when direct or distributed children
   * of this element changes
   * @return Observer instance
   *
   */
  FlattenedNodesObserver observeNodes(ObserveNodesCallback callback);

  /**
   * Disconnects an observer previously created via <code>observeNodes</code>
   *
   * @param observerHandle Observer instance
   * to disconnect.
   *
   */
  void unobserveNodes(FlattenedNodesObserver observerHandle);

  /**
   * Provided as a backwards-compatible API only.  This method does nothing.
   *
   */
  void notifyObserver();

  /**
   * Returns true if the provided node is contained with this element's
   * light-DOM children or shadow root, including any nested shadow roots
   * of children therein.
   *
   * @param node Node to test
   * @return Returns true if the given <code>node</code> is contained within
   * this element's light or shadow DOM.
   *
   */
  boolean deepContains(@Nullable Node node);

  /**
   * Returns true if the provided node is contained with this element's
   * light-DOM children or shadow root, including any nested shadow roots
   * of children therein.
   *
   * @return Returns true if the given <code>node</code> is contained within
   * this element's light or shadow DOM.
   *
   */
  boolean deepContains();

  /**
   * Returns the root node of this node.  Equivalent to <code>getRootNode()</code>.
   *
   * @return Top most element in the dom tree in which the node
   * exists. If the node is connected to a document this is either a
   * shadowRoot or the document; otherwise, it may be the node
   * itself or a node or document fragment containing it.
   *
   */
  Node getOwnerRoot();

  /**
   * For slot elements, returns the nodes assigned to the slot; otherwise
   * an empty array. It is equivalent to <code>&lt;slot&gt;.addignedNodes({flatten:true})</code>.
   *
   * @return Array of assigned nodes
   *
   */
  Node[] getDistributedNodes();

  /**
   * Returns an array of all slots this element was distributed to.
   *
   * @return Description
   *
   */
  HTMLSlotElement[] getDestinationInsertionPoints();

  /**
   * Calls <code>importNode</code> on the <code>ownerDocument</code> for this node.
   *
   * @param node Node to import
   * @param deep True if the node should be cloned deeply during
   * import
   * @return Clone of given node imported to this owner document
   *
   */
  @Nullable
  Node importNode(Node node, boolean deep);

  /**
   * @return Returns a flattened list of all child nodes and
   * nodes assigned to child slots.
   *
   */
  Node[] getEffectiveChildNodes();

  /**
   * Returns a filtered list of flattened child elements for this element based
   * on the given selector.
   *
   * @param selector Selector to filter nodes against
   * @return List of flattened child elements
   *
   */
  HTMLElement[] queryDistributedElements(String selector);

  Node cloneNode(boolean deep);

  /**
   *
   */
  Node cloneNode();

  Node appendChild(Node node);

  Node insertBefore(Node newChild, @Nullable Node refChild);

  /**
   *
   */
  Node insertBefore(Node newChild);

  Node removeChild(Node node);

  Node replaceChild(Node oldChild, Node newChild);

  void setAttribute(String name, String value);

  void removeAttribute(String name);

  @Nullable
  Element querySelector(String selector);

  NodeListOf< Element > querySelectorAll(String selector);

  @FunctionalInterface
  @JSFunctor
  interface ObserveNodesCallback extends Any {
    void apply(ApplyP0 p0);

    interface ApplyP0 extends Any {
      @JSProperty("target")
      HTMLElement getTarget();

      @JSProperty("target")
      void setTarget(HTMLElement value);

      @JSProperty("addedNodes")
      Element[] getAddedNodes();

      @JSProperty("addedNodes")
      void setAddedNodes(Element[] value);

      @JSProperty("removedNodes")
      Element[] getRemovedNodes();

      @JSProperty("removedNodes")
      void setRemovedNodes(Element[] value);

      class Builder {
        private final ApplyP0 object = Any.empty();

        public ApplyP0 build() {
          return object;
        }

        public Builder target(HTMLElement value) {
          object.setTarget(value);
          return this;
        }

        public Builder addedNodes(Element[] value) {
          object.setAddedNodes(value);
          return this;
        }

        public Builder removedNodes(Element[] value) {
          object.setRemovedNodes(value);
          return this;
        }
      }
    }
  }
}
