package js.lang.external.polymer.utils;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.UnsupportedOperationException;
import javax.annotation.Nullable;
import js.lang.Any;
import js.web.dom.Element;
import js.web.dom.MutationObserver;
import org.teavm.jso.JSBody;

@NpmPackage(
    name = "@polymer/polymer",
    version = "^3.4.1"
)
@Import(
    symbols = {"scopeSubtree as ScopeSubtree_scopeSubtree"},
    module = "@polymer/polymer/lib/utils/scope-subtree.js"
)
@Import(
    module = "@polymer/polymer/lib/utils/scope-subtree.js"
)
public interface ScopeSubtree extends Any {
  /**
   * Ensure that elements in a ShadowDOM container are scoped correctly.
   * This function is only needed when ShadyDOM is used and unpatched DOM APIs are used in third party code.
   * This can happen in noPatch mode or when specialized APIs like ranges or tables are used to mutate DOM.
   *
   * @return Returns a new MutationObserver on <code>container</code> if <code>shouldObserve</code> is true.
   *
   */
  @JSBody(
      params = {"container", "shouldObserve"},
      script = "return ScopeSubtree_scopeSubtree(container, shouldObserve)"
  )
  @Nullable
  static MutationObserver scopeSubtree(Element container, boolean shouldObserve) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Ensure that elements in a ShadowDOM container are scoped correctly.
   * This function is only needed when ShadyDOM is used and unpatched DOM APIs are used in third party code.
   * This can happen in noPatch mode or when specialized APIs like ranges or tables are used to mutate DOM.
   *
   * @return Returns a new MutationObserver on <code>container</code> if <code>shouldObserve</code> is true.
   *
   */
  @JSBody(
      params = {"container"},
      script = "return ScopeSubtree_scopeSubtree(container)"
  )
  @Nullable
  static MutationObserver scopeSubtree(Element container) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }
}
