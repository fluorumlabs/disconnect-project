package js.lang.external.lit_element;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import java.lang.UnsupportedOperationException;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Symbol;
import js.lang.Unknown /* ( ) : CSSStyleSheet | null */;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

@NpmPackage(
    name = "lit-element",
    version = "^2.3.1"
)
@Import(
    symbols = {"CSSResult as CSSResult_CSSResult"},
    module = "lit-element/lib/css-tag.js"
)
@Import(
    module = "lit-element/lib/css-tag.js"
)
public interface CSSResult extends Any {
  @JSProperty("cssText")
  String getCssText();

  @JSBody(
      params = {"cssText", "safeToken"},
      script = "return new CSSResult_CSSResult(cssText, safeToken)"
  )
  static CSSResult create(String cssText, Symbol safeToken) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  @JSProperty("styleSheet")
  @Nullable
  Unknown /* ( ) : CSSStyleSheet | null */ getStyleSheet();

  String toString();
}
