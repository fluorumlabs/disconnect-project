package js.lang.external.vaadin.router;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import js.lang.Unknown;
import org.teavm.jso.JSIndexer;

@NpmPackage(
    name = "@vaadin/router",
    version = "^1.7.2"
)
@Import(
    module = "@vaadin/router/dist/vaadin-router.js"
)
public interface Params extends Any {
  @JSIndexer
  Unknown /* ParamValue */ get(String key);

  @JSIndexer
  void set(String key, String value);

  @JSIndexer
  void set(String key, String[] value);

  @JSIndexer
  Unknown /* ParamValue */ get(double key);

  @JSIndexer
  void set(double key, String value);

  @JSIndexer
  void set(double key, String[] value);

  static Params.Builder builder() {
    return new Params.Builder();
  }

  final class Builder {
    private final Params object = Any.empty();

    private Builder() {
    }

    public Params build() {
      return object;
    }

    public Params.Builder set(String key, String value) {
      object.set(key, value);
      return this;
    }

    public Params.Builder set(String key, String[] value) {
      object.set(key, value);
      return this;
    }

    public Params.Builder set(double key, String value) {
      object.set(key, value);
      return this;
    }

    public Params.Builder set(double key, String[] value) {
      object.set(key, value);
      return this;
    }
  }
}
