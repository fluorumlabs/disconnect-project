package js.lang.external.polymer.utils;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.UnsupportedOperationException;
import js.lang.Any;
import org.teavm.jso.JSBody;

/**
 * Class that listens for changes (additions or removals) to
 * &quot;flattened nodes&quot; on a given <code>node</code>. The list of flattened nodes consists
 * of a node's children and, for any children that are <code>&lt;slot&gt;</code> elements,
 * the expanded flattened list of <code>assignedNodes</code>.
 * For example, if the observed node has children <code>&lt;a&gt;&lt;/a&gt;&lt;slot&gt;&lt;/slot&gt;&lt;b&gt;&lt;/b&gt;</code>
 * and the <code>&lt;slot&gt;</code> has one <code>&lt;div&gt;</code> assigned to it, then the flattened
 * nodes list is <code>&lt;a&gt;&lt;/a&gt;&lt;div&gt;&lt;/div&gt;&lt;b&gt;&lt;/b&gt;</code>. If the <code>&lt;slot&gt;</code> has other
 * <code>&lt;slot&gt;</code> elements assigned to it, these are flattened as well.
 *
 * The provided <code>callback</code> is called whenever any change to this list
 * of flattened nodes occurs, where an addition or removal of a node is
 * considered a change. The <code>callback</code> is called with one argument, an object
 * containing an array of any <code>addedNodes</code> and <code>removedNodes</code>.
 *
 * Note: the callback is called asynchronous to any changes
 * at a microtask checkpoint. This is because observation is performed using
 * <code>MutationObserver</code> and the <code>&lt;slot&gt;</code> element's <code>slotchange</code> event which
 * are asynchronous.
 *
 * An example:
 *
 * <pre><code class="language-js">class TestSelfObserve extends PolymerElement {
 *   static get is() { return 'test-self-observe';}
 *   connectedCallback() {
 *     super.connectedCallback();
 *     this._observer = new FlattenedNodesObserver(this, (info) =&gt; {
 *       this.info = info;
 *     });
 *   }
 *   disconnectedCallback() {
 *     super.disconnectedCallback();
 *     this._observer.disconnect();
 *   }
 * }
 * customElements.define(TestSelfObserve.is, TestSelfObserve);
 * </code></pre>
 */
@NpmPackage(
    name = "@polymer/polymer",
    version = "^3.4.1"
)
@Import(
    symbols = {"FlattenedNodesObserver as FlattenedNodesObserver_FlattenedNodesObserver"},
    module = "@polymer/polymer/lib/utils/flattened-nodes-observer.js"
)
public interface FlattenedNodesObserver extends Any {
  /**
   * eslint-disable-next-line
   *
   */
  @JSBody(
      params = {"target", "callback"},
      script = "return new FlattenedNodesObserver_FlattenedNodesObserver(target, callback)"
  )
  static FlattenedNodesObserver create(Any target, Any callback) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * eslint-disable-next-line
   *
   */
  @JSBody(
      params = {"node"},
      script = "return FlattenedNodesObserver_FlattenedNodesObserver.getFlattenedNodes(node)"
  )
  static Any getFlattenedNodes(Any node) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Activates an observer. This method is automatically called when
   * a <code>FlattenedNodesObserver</code> is created. It should only be called to
   * re-activate an observer that has been deactivated via the <code>disconnect</code> method.
   *
   */
  void connect();

  /**
   * Deactivates the flattened nodes observer. After calling this method
   * the observer callback will not be called when changes to flattened nodes
   * occur. The <code>connect</code> method may be subsequently called to reactivate
   * the observer.
   *
   */
  void disconnect();

  /**
   * Flushes the observer causing any pending changes to be immediately
   * delivered the observer callback. By default these changes are delivered
   * asynchronously at the next microtask checkpoint.
   *
   * @return Returns true if any pending changes caused the observer
   * callback to run.
   *
   */
  boolean flush();
}
