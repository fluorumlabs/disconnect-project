package js.lang.external.vaadin.vaadin_crud;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import js.lang.Unknown;
import js.lang.external.vaadin.vaadin_form_layout.FormLayoutElement;
import org.teavm.jso.JSIndexer;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * <code>&lt;vaadin-crud-form&gt;</code> is a <vaadin-form-layout> which automatically can configures all its items based
 * on the JSON structure of the first item set.
 *
 * You cannot manually configure fields but you can still style the layout as it's described in
 * <code>&lt;vaadin-form-layout&gt;</code> <a href="https://vaadin.com/components/vaadin-form-layout/html-api/elements/Vaadin.FormLayoutElement">Documentation</a>
 *
 */
@NpmPackage(
    name = "@vaadin/vaadin-crud",
    version = "^1.3.0-alpha2"
)
@Import(
    module = "@vaadin/vaadin-crud/src/vaadin-crud-form.js"
)
public interface CrudFormElement extends IncludedMixin, FormLayoutElement {
  /**
   * The item being edited.
   *
   */
  @JSProperty("item")
  @Nullable
  Item getItem();

  /**
   * The item being edited.
   *
   */
  @JSProperty("item")
  void setItem(@Nullable Item value);

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
}
