package js.lang.external.lit_html.directives;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.FunctionalInterface;
import java.lang.UnsupportedOperationException;
import js.lang.Any;
import js.lang.Unknown /* unknown */;
import js.lang.external.lit_html.Part;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSFunctor;

@NpmPackage(
    name = "lit-html",
    version = "^1.2.1"
)
@Import(
    symbols = {"ifDefined as IfDefined_ifDefined"},
    module = "lit-html/directives/if-defined.js"
)
@Import(
    module = "lit-html/directives/if-defined.js"
)
public interface IfDefined extends Any {
  /**
   * For AttributeParts, sets the attribute if the value is defined and removes
   * the attribute if the value is undefined.
   *
   * For other part types, this directive is a no-op.
   *
   */
  @JSBody(
      params = {"value"},
      script = "return IfDefined_ifDefined(value)"
  )
  static IfDefinedResultFunction ifDefined(Unknown /* unknown */ value) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  @FunctionalInterface
  @JSFunctor
  interface IfDefinedResultFunction extends Any {
    void apply(Part part);
  }
}
