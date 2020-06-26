package js.lang.external.vaadin.vaadin_crud;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown /* string | RegExp | null */;
import js.lang.Unknown /* string | string [ ] | undefined */;
import js.util.RegExp;
import org.teavm.jso.JSProperty;

@NpmPackage(
    name = "@vaadin/vaadin-crud",
    version = "^1.3.0-alpha2"
)
@Import(
    module = "@vaadin/vaadin-crud/src/vaadin-crud-include-mixin.js"
)
public interface IncludedMixin extends Any {
  /**
   * A list of item fields that should not be mapped to form fields.
   *
   * When <a href="#/elements/vaadin-crud-form#property-include"><code>include</code></a> is defined, this property is ignored.
   *
   * Default is to exclude any private property.
   *
   */
  @JSProperty("exclude")
  @Nullable
  Unknown /* string | RegExp | null */ getExclude();

  /**
   * A list of item fields that should not be mapped to form fields.
   *
   * When <a href="#/elements/vaadin-crud-form#property-include"><code>include</code></a> is defined, this property is ignored.
   *
   * Default is to exclude any private property.
   *
   */
  @JSProperty("exclude")
  void setExclude(@Nullable RegExp value);

  /**
   * A list of item fields that should not be mapped to form fields.
   *
   * When <a href="#/elements/vaadin-crud-form#property-include"><code>include</code></a> is defined, this property is ignored.
   *
   * Default is to exclude any private property.
   *
   */
  @JSProperty("exclude")
  void setExclude(@Nullable String value);

  /**
   * A list of item properties that should be mapped to form fields.
   *
   * When it is defined <a href="#/elements/vaadin-crud-form#property-exclude"><code>exclude</code></a> is ignored.
   *
   */
  @JSProperty("include")
  @Nullable
  Unknown /* string | string [ ] | undefined */ getInclude();

  /**
   * A list of item properties that should be mapped to form fields.
   *
   * When it is defined <a href="#/elements/vaadin-crud-form#property-exclude"><code>exclude</code></a> is ignored.
   *
   */
  @JSProperty("include")
  void setInclude(@Nullable String value);

  /**
   * A list of item properties that should be mapped to form fields.
   *
   * When it is defined <a href="#/elements/vaadin-crud-form#property-exclude"><code>exclude</code></a> is ignored.
   *
   */
  @JSProperty("include")
  void setInclude(String[] value);

  class Builder {
    private final IncludedMixin object = Any.empty();

    public IncludedMixin build() {
      return object;
    }

    /**
     * A list of item fields that should not be mapped to form fields.
     *
     * When <a href="#/elements/vaadin-crud-form#property-include"><code>include</code></a> is defined, this property is ignored.
     *
     * Default is to exclude any private property.
     *
     */
    public Builder exclude(@Nullable RegExp value) {
      object.setExclude(value);
      return this;
    }

    /**
     * A list of item fields that should not be mapped to form fields.
     *
     * When <a href="#/elements/vaadin-crud-form#property-include"><code>include</code></a> is defined, this property is ignored.
     *
     * Default is to exclude any private property.
     *
     */
    public Builder exclude(@Nullable String value) {
      object.setExclude(value);
      return this;
    }

    /**
     * A list of item properties that should be mapped to form fields.
     *
     * When it is defined <a href="#/elements/vaadin-crud-form#property-exclude"><code>exclude</code></a> is ignored.
     *
     */
    public Builder include(@Nullable String value) {
      object.setInclude(value);
      return this;
    }

    /**
     * A list of item properties that should be mapped to form fields.
     *
     * When it is defined <a href="#/elements/vaadin-crud-form#property-exclude"><code>exclude</code></a> is ignored.
     *
     */
    public Builder include(String[] value) {
      object.setInclude(value);
      return this;
    }
  }
}
