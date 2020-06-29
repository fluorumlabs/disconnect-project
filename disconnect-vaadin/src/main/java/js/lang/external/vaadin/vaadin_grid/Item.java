package js.lang.external.vaadin.vaadin_grid;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import js.lang.Unknown;
import org.teavm.jso.JSIndexer;

@NpmPackage(
    name = "@vaadin/vaadin-grid",
    version = "^5.7.0-alpha4"
)
@Import(
    module = "@vaadin/vaadin-grid/vaadin-grid.js"
)
public interface Item extends Any {
  @JSIndexer
  Unknown /* unknown */ get(String key);

  @JSIndexer
  void set(String key, Unknown /* unknown */ value);

  static Item.Builder builder() {
    return new Item.Builder();
  }

  final class Builder {
    private final Item object = Any.empty();

    private Builder() {
    }

    public Item build() {
      return object;
    }

    public Item.Builder set(String key, Unknown /* unknown */ value) {
      object.set(key, value);
      return this;
    }
  }
}
