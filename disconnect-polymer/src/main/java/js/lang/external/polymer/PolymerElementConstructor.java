package js.lang.external.polymer;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import js.lang.JsFunction;
import js.lang.Unknown;
import js.web.dom.HTMLElement;
import js.web.webcomponents.HTMLTemplateElement;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSIndexer;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

@NpmPackage(
    name = "@polymer/polymer",
    version = "^3.4.1"
)
@Import(
    symbols = {"PolymerElementConstructor as PolymerElementConstructor_PolymerElementConstructor"},
    module = "@polymer/polymer/polymer-element.js"
)
public interface PolymerElementConstructor extends Any {
  @JSBody(
      script = "return new PolymerElementConstructor_PolymerElementConstructor()"
  )
  static HTMLElement create() {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  @JSProperty("is")
  @Nullable
  String getIs();

  @JSProperty("is")
  void setIs(@Nullable String value);

  @JSProperty("extends")
  @Nullable
  String getExtendsValue();

  @JSProperty("extends")
  void setExtendsValue(@Nullable String value);

  @JSProperty("properties")
  @Nullable
  Properties getProperties();

  @JSProperty("properties")
  void setProperties(@Nullable Properties value);

  @JSProperty("observers")
  @Nullable
  String[] getObservers();

  @JSProperty("observers")
  void setObservers(String[] value);

  @JSProperty("template")
  @Nullable
  Unknown getTemplate();

  @JSProperty("template")
  void setTemplate(@Nullable String value);

  @JSProperty("template")
  void setTemplate(@Nullable HTMLTemplateElement value);

  interface Properties extends Any {
    @JSIndexer
    Unknown get(String key);

    @JSIndexer
    void set(String key, PolymerElementPropertiesMeta value);

    @JSIndexer
    void set(String key, JsFunction value);

    class Builder {
      private final Properties object = Any.empty();

      public Properties build() {
        return object;
      }

      public Builder set(String key, PolymerElementPropertiesMeta value) {
        object.set(key, value);
        return this;
      }

      public Builder set(String key, JsFunction value) {
        object.set(key, value);
        return this;
      }
    }
  }
}
