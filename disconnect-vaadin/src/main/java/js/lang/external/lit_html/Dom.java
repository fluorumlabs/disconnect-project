package js.lang.external.lit_html;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.UnsupportedOperationException;
import javax.annotation.Nullable;
import js.lang.Any;
import js.web.dom.Node;
import org.teavm.jso.JSBody;

@NpmPackage(
    name = "lit-html",
    version = "^1.2.1"
)
@Import(
    symbols = {"isCEPolyfill as Dom_isCEPolyfill", "removeNodes as Dom_removeNodes", "reparentNodes as Dom_reparentNodes"},
    module = "lit-html/lib/dom.js"
)
@Import(
    module = "lit-html/lib/dom.js"
)
public interface Dom extends Any {
  /**
   * True if the custom elements polyfill is in use.
   *
   */
  @JSBody(
      script = "return Dom_isCEPolyfill"
  )
  static boolean isCEPolyfill() {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Reparents nodes, starting from <code>start</code> (inclusive) to <code>end</code> (exclusive),
   * into another container (could be the same container), before <code>before</code>. If
   * <code>before</code> is null, it appends the nodes to the container.
   *
   */
  @JSBody(
      params = {"container", "start", "end", "before"},
      script = "Dom_reparentNodes(container, start, end, before)"
  )
  static void reparentNodes(Node container, @Nullable Node start, @Nullable Node end,
      @Nullable Node before) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Reparents nodes, starting from <code>start</code> (inclusive) to <code>end</code> (exclusive),
   * into another container (could be the same container), before <code>before</code>. If
   * <code>before</code> is null, it appends the nodes to the container.
   *
   */
  @JSBody(
      params = {"container", "start", "end"},
      script = "Dom_reparentNodes(container, start, end)"
  )
  static void reparentNodes(Node container, @Nullable Node start, @Nullable Node end) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Reparents nodes, starting from <code>start</code> (inclusive) to <code>end</code> (exclusive),
   * into another container (could be the same container), before <code>before</code>. If
   * <code>before</code> is null, it appends the nodes to the container.
   *
   */
  @JSBody(
      params = {"container", "start"},
      script = "Dom_reparentNodes(container, start)"
  )
  static void reparentNodes(Node container, @Nullable Node start) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Reparents nodes, starting from <code>start</code> (inclusive) to <code>end</code> (exclusive),
   * into another container (could be the same container), before <code>before</code>. If
   * <code>before</code> is null, it appends the nodes to the container.
   *
   */
  @JSBody(
      params = {"container"},
      script = "Dom_reparentNodes(container)"
  )
  static void reparentNodes(Node container) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Removes nodes, starting from <code>start</code> (inclusive) to <code>end</code> (exclusive), from
   * <code>container</code>.
   *
   */
  @JSBody(
      params = {"container", "start", "end"},
      script = "Dom_removeNodes(container, start, end)"
  )
  static void removeNodes(Node container, @Nullable Node start, @Nullable Node end) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Removes nodes, starting from <code>start</code> (inclusive) to <code>end</code> (exclusive), from
   * <code>container</code>.
   *
   */
  @JSBody(
      params = {"container", "start"},
      script = "Dom_removeNodes(container, start)"
  )
  static void removeNodes(Node container, @Nullable Node start) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Removes nodes, starting from <code>start</code> (inclusive) to <code>end</code> (exclusive), from
   * <code>container</code>.
   *
   */
  @JSBody(
      params = {"container"},
      script = "Dom_removeNodes(container)"
  )
  static void removeNodes(Node container) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }
}
