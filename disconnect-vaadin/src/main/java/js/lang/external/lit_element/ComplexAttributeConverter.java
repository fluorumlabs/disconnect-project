package js.lang.external.lit_element;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown /* unknown */;

/**
 * Converts property values to and from attribute values.
 *
 */
@NpmPackage(
    name = "lit-element",
    version = "^2.3.1"
)
@Import(
    module = "lit-element/lib/updating-element.js"
)
public interface ComplexAttributeConverter<Type extends Any, TypeHint extends Any> extends Any {
  /**
   * Function called to convert an attribute value to a property
   * value.
   *
   */
  Type fromAttribute(@Nullable String value, @Nullable TypeHint type);

  /**
   * Function called to convert an attribute value to a property
   * value.
   *
   */
  Type fromAttribute(@Nullable String value);

  /**
   * Function called to convert an attribute value to a property
   * value.
   *
   */
  Type fromAttribute();

  /**
   * Function called to convert a property value to an attribute
   * value.
   *
   * It returns unknown instead of string, to be compatible with
   * <a href="https://github.com/WICG/trusted-types">https://github.com/WICG/trusted-types</a> (and similar efforts).
   *
   */
  Unknown /* unknown */ toAttribute(Type value, @Nullable TypeHint type);

  /**
   * Function called to convert a property value to an attribute
   * value.
   *
   * It returns unknown instead of string, to be compatible with
   * <a href="https://github.com/WICG/trusted-types">https://github.com/WICG/trusted-types</a> (and similar efforts).
   *
   */
  Unknown /* unknown */ toAttribute(Type value);
}
