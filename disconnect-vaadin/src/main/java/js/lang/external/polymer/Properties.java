package js.lang.external.polymer;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import js.lang.Any;
import js.lang.JsFunction;
import js.lang.Unknown /* PolymerElementPropertiesMeta | Function */;
import org.teavm.jso.JSIndexer;

@NpmPackage(
    name = "@polymer/polymer",
    version = "^3.4.1"
)
@Import(
    module = "@polymer/polymer/polymer-element.js"
)
public interface Properties extends Any {
  @JSIndexer
  Unknown /* PolymerElementPropertiesMeta | Function */ get(String key);

  @JSIndexer
  void set(String key, PolymerElementPropertiesMeta value);

  @JSIndexer
  void set(String key, JsFunction value);

  class Builder {
    private final Properties object = Any.empty();

    public Properties build() {
      return object;
    }

    public Properties.Builder set(String key, PolymerElementPropertiesMeta value) {
      object.set(key, value);
      return this;
    }

    public Properties.Builder set(String key, JsFunction value) {
      object.set(key, value);
      return this;
    }
  }
}
