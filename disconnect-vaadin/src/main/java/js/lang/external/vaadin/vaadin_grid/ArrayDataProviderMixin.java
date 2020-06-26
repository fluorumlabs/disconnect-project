package js.lang.external.vaadin.vaadin_grid;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown /* GridItem [ ] | null | undefined */;
import js.lang.Unknown /* unknown */;
import org.teavm.jso.JSIndexer;
import org.teavm.jso.JSProperty;

@NpmPackage(
    name = "@vaadin/vaadin-grid",
    version = "^5.7.0-alpha4"
)
@Import(
    module = "@vaadin/vaadin-grid/src/vaadin-grid-array-data-provider-mixin.js"
)
public interface ArrayDataProviderMixin extends Any {
  /**
   * An array containing the items which will be stamped to the column template
   * instances.
   *
   */
  @JSProperty("items")
  @Nullable
  Unknown /* GridItem [ ] | null | undefined */ getItems();

  /**
   * An array containing the items which will be stamped to the column template
   * instances.
   *
   */
  @JSProperty("items")
  void setItems(Items[] value);

  /**
   * An array containing the items which will be stamped to the column template
   * instances.
   *
   */
  @JSProperty("items")
  void setItems(String[] value);

  interface Items extends Any {
    @JSIndexer
    Unknown /* unknown */ get(String key);

    @JSIndexer
    void set(String key, Unknown /* unknown */ value);

    class Builder {
      private final Items object = Any.empty();

      public Items build() {
        return object;
      }

      public Items.Builder set(String key, Unknown /* unknown */ value) {
        object.set(key, value);
        return this;
      }
    }
  }
}
