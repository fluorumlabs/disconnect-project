package js.lang.external.lit_html;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import js.lang.TemplateStringsArray;
import js.lang.Unknown;
import js.util.collections.JsMap;
import js.util.collections.WeakMap;
import org.teavm.jso.JSProperty;

/**
 * The first argument to JS template tags retain identity across multiple
 * calls to a tag for the same literal, so we can cache work done per literal
 * in a Map.
 *
 * Safari currently has a bug which occasionally breaks this behavior, so we
 * need to cache the Template at two levels. We first cache the
 * TemplateStringsArray, and if that fails, we cache a key constructed by
 * joining the strings array.
 *
 */
@NpmPackage(
    name = "lit-html",
    version = "^1.2.1"
)
@Import(
    module = "lit-html/lib/template-factory.js"
)
public interface TemplateCache extends Any {
  @JSProperty("stringsArray")
  WeakMap<TemplateStringsArray, Template> getStringsArray();

  @JSProperty("keyString")
  JsMap<Unknown /* string */, Template> getKeyString();

  class Builder {
    private final TemplateCache object = Any.empty();

    public TemplateCache build() {
      return object;
    }
  }
}
