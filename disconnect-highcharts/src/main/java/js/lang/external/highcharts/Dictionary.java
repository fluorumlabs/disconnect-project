package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import org.teavm.jso.JSIndexer;

/**
 * Generic dictionary in TypeScript notation. Use the native <code>Record&lt;string, any&gt;</code> instead.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface Dictionary<T extends Any> extends Any {
  @JSIndexer
  T get(String key);

  @JSIndexer
  void set(String key, T value);

  static <T extends Any> Builder<T> builder() {
    return new Builder<T>();
  }

  final class Builder<T extends Any> {
    private final Dictionary<T> object = Any.empty();

    private Builder() {
    }

    public Dictionary<T> build() {
      return object;
    }

    public Builder<T> set(String key, T value) {
      object.set(key, value);
      return this;
    }
  }
}
