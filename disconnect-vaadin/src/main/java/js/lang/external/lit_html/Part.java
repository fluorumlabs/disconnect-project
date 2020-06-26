package js.lang.external.lit_html;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.UnsupportedOperationException;
import js.lang.Any;
import js.lang.Any /* { } */;
import js.lang.Unknown /* unknown */;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/**
 * The Part interface represents a dynamic part of a template instance rendered
 * by lit-html.
 *
 */
@NpmPackage(
    name = "lit-html",
    version = "^1.2.1"
)
@Import(
    symbols = {"noChange as Part_noChange", "nothing as Part_nothing"},
    module = "lit-html/lib/part.js"
)
@Import(
    module = "lit-html/lib/part.js"
)
public interface Part extends Any {
  @JSProperty("value")
  Unknown /* unknown */ getValue();

  /**
   * Sets the current part value, but does not write it to the DOM.
   * @param value The value that will be committed.
   *
   */
  void setValue(Unknown /* unknown */ value);

  /**
   * Commits the current part value, causing it to actually be written to the
   * DOM.
   *
   * Directives are run at the start of <code>commit</code>, so that if they call
   * <code>part.setValue(...)</code> synchronously that value will be used in the current
   * commit, and there's no need to call <code>part.commit()</code> within the directive.
   * If directives set a part value asynchronously, then they must call
   * <code>part.commit()</code> manually.
   *
   */
  void commit();

  /**
   * A sentinel value that signals that a value was handled by a directive and
   * should not be written to the DOM.
   *
   */
  @JSBody(
      script = "return Part_noChange"
  )
  static Any /* { } */ noChange() {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * A sentinel value that signals a NodePart to fully clear its content.
   *
   */
  @JSBody(
      script = "return Part_nothing"
  )
  static Any /* { } */ nothing() {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }
}
