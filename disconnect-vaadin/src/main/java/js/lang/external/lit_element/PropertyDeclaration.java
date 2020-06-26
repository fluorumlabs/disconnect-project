package js.lang.external.lit_element;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import js.lang.Unknown;
import org.teavm.jso.JSFunctor;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * Defines options for a property accessor.
 *
 */
@NpmPackage(
    name = "lit-element",
    version = "^2.3.1"
)
@Import(
    module = "lit-element/lib/updating-element.js"
)
public interface PropertyDeclaration<Type extends Any, TypeHint extends Any> extends Any {
  /**
   * Indicates how and whether the property becomes an observed attribute.
   * If the value is <code>false</code>, the property is not added to <code>observedAttributes</code>.
   * If true or absent, the lowercased property name is observed (e.g. <code>fooBar</code>
   * becomes <code>foobar</code>). If a string, the string value is observed (e.g
   * <code>attribute: 'foo-bar'</code>).
   *
   */
  @JSProperty("attribute")
  @Nullable
  Unknown /* boolean | string */ getAttribute();

  /**
   * Indicates the type of the property. This is used only as a hint for the
   * <code>converter</code> to determine how to convert the attribute
   * to/from a property.
   *
   */
  @JSProperty("type")
  @Nullable
  TypeHint getType();

  /**
   * Indicates how to convert the attribute to/from a property. If this value
   * is a function, it is used to convert the attribute value a the property
   * value. If it's an object, it can have keys for <code>fromAttribute</code> and
   * <code>toAttribute</code>. If no <code>toAttribute</code> function is provided and
   * <code>reflect</code> is set to <code>true</code>, the property value is set directly to the
   * attribute. A default <code>converter</code> is used if none is provided; it supports
   * <code>Boolean</code>, <code>String</code>, <code>Number</code>, <code>Object</code>, and <code>Array</code>. Note,
   * when a property changes and the converter is used to update the attribute,
   * the property is never updated again as a result of the attribute changing,
   * and vice versa.
   *
   */
  @JSProperty("converter")
  @Nullable
  ConverterFunction < Type , TypeHint > getConverter();

  /**
   * Indicates if the property should reflect to an attribute.
   * If <code>true</code>, when the property is set, the attribute is set using the
   * attribute name determined according to the rules for the <code>attribute</code>
   * property option and the value of the property converted using the rules
   * from the <code>converter</code> property option.
   *
   */
  @JSProperty("reflect")
  boolean getReflect();

  /**
   * A function that indicates if a property should be considered changed when
   * it is set. The function should take the <code>newValue</code> and <code>oldValue</code> and
   * return <code>true</code> if an update should be requested.
   *
   */
  boolean hasChanged(Type value, Type oldValue);

  /**
   * Indicates whether an accessor will be created for this property. By
   * default, an accessor will be generated for this property that requests an
   * update when set. If this flag is <code>true</code>, no accessor will be created, and
   * it will be the user's responsibility to call
   * <code>this.requestUpdate(propertyName, oldValue)</code> to request an update when
   * the property changes.
   *
   */
  @JSProperty("noAccessor")
  boolean getNoAccessor();

  @FunctionalInterface
  @JSFunctor
  interface ConverterFunction<Type extends Any, TypeHint extends Any> extends Any {
    Type apply(@Nullable String value, @Nullable TypeHint type);
  }
}
