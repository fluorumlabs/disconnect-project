package js.lang.external.polymer.legacy;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import java.lang.UnsupportedOperationException;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown /* DomApiNative | EventApi */;
import js.web.dom.Event;
import js.web.dom.Node;
import org.teavm.jso.JSBody;

@NpmPackage(
    name = "@polymer/polymer",
    version = "^3.4.1"
)
@Import(
    symbols = {"dom as Polymer_dom", "matchesSelector as Polymer_matchesSelector"},
    module = "@polymer/polymer/lib/legacy/polymer.dom.js"
)
@Import(
    module = "@polymer/polymer/lib/legacy/polymer.dom.js"
)
public interface Polymer extends Any {
  /**
   * Cross-platform <code>element.matches</code> shim.
   *
   * @return True if node matched selector
   *
   */
  @JSBody(
      params = {"node", "selector"},
      script = "return Polymer_matchesSelector(node, selector)"
  )
  static boolean matchesSelector(Node node, String selector) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Legacy DOM and Event manipulation API wrapper factory used to abstract
   * differences between native Shadow DOM and &quot;Shady DOM&quot; when polyfilling on
   * older browsers.
   *
   * Note that in Polymer 2.x use of <code>Polymer.dom</code> is no longer required and
   * in the majority of cases simply facades directly to the standard native
   * API.
   *
   * @return Wrapper providing either node API or event API
   *
   */
  @JSBody(
      params = {"obj"},
      script = "return Polymer_dom(obj)"
  )
  static Unknown /* DomApiNative | EventApi */ dom(@Nullable EventApi obj) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Legacy DOM and Event manipulation API wrapper factory used to abstract
   * differences between native Shadow DOM and &quot;Shady DOM&quot; when polyfilling on
   * older browsers.
   *
   * Note that in Polymer 2.x use of <code>Polymer.dom</code> is no longer required and
   * in the majority of cases simply facades directly to the standard native
   * API.
   *
   * @return Wrapper providing either node API or event API
   *
   */
  @JSBody(
      params = {"obj"},
      script = "return Polymer_dom(obj)"
  )
  static Unknown /* DomApiNative | EventApi */ dom(@Nullable DomApiNative obj) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Legacy DOM and Event manipulation API wrapper factory used to abstract
   * differences between native Shadow DOM and &quot;Shady DOM&quot; when polyfilling on
   * older browsers.
   *
   * Note that in Polymer 2.x use of <code>Polymer.dom</code> is no longer required and
   * in the majority of cases simply facades directly to the standard native
   * API.
   *
   * @return Wrapper providing either node API or event API
   *
   */
  @JSBody(
      params = {"obj"},
      script = "return Polymer_dom(obj)"
  )
  static Unknown /* DomApiNative | EventApi */ dom(@Nullable Event obj) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Legacy DOM and Event manipulation API wrapper factory used to abstract
   * differences between native Shadow DOM and &quot;Shady DOM&quot; when polyfilling on
   * older browsers.
   *
   * Note that in Polymer 2.x use of <code>Polymer.dom</code> is no longer required and
   * in the majority of cases simply facades directly to the standard native
   * API.
   *
   * @return Wrapper providing either node API or event API
   *
   */
  @JSBody(
      params = {"obj"},
      script = "return Polymer_dom(obj)"
  )
  static Unknown /* DomApiNative | EventApi */ dom(@Nullable Node obj) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Legacy DOM and Event manipulation API wrapper factory used to abstract
   * differences between native Shadow DOM and &quot;Shady DOM&quot; when polyfilling on
   * older browsers.
   *
   * Note that in Polymer 2.x use of <code>Polymer.dom</code> is no longer required and
   * in the majority of cases simply facades directly to the standard native
   * API.
   *
   * @return Wrapper providing either node API or event API
   *
   */
  @JSBody(
      params = {},
      script = "return Polymer_dom()"
  )
  static Unknown /* DomApiNative | EventApi */ dom() {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }
}
