package js.lang.external.vaadin.vaadin_combo_box;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import js.lang.Unknown;
import org.teavm.jso.JSIndexer;
import org.teavm.jso.JSProperty;

@NpmPackage(
    name = "@vaadin/vaadin-combo-box",
    version = "^5.3.0-alpha4"
)
@Import(
    module = "@vaadin/vaadin-combo-box/vaadin-combo-box.js"
)
public interface ComboBoxItemModel extends Any {
  @JSProperty("index")
  double getIndex();

  @JSProperty("index")
  void setIndex(double value);

  @JSProperty("item")
  Unknown /* ComboBoxItem | string */ getItem();

  @JSProperty("item")
  void setItem(Item value);

  @JSProperty("item")
  void setItem(String value);

  static Builder builder() {
    return new Builder();
  }

  interface Item extends Any {
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

  final class Builder {
    private final ComboBoxItemModel object = Any.empty();

    private Builder() {
    }

    public ComboBoxItemModel build() {
      return object;
    }

    public Builder index(double value) {
      object.setIndex(value);
      return this;
    }

    public Builder item(Item value) {
      object.setItem(value);
      return this;
    }

    public Builder item(String value) {
      object.setItem(value);
      return this;
    }
  }
}
