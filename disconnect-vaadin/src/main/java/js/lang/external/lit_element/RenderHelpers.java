package js.lang.external.lit_element;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import java.lang.UnsupportedOperationException;
import js.lang.Any;
import js.lang.Unknown /* string | boolean | number */;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSIndexer;

@NpmPackage(
    name = "lit-element",
    version = "^2.3.1"
)
@Import(
    symbols = {"classString as RenderHelpers_classString", "styleString as RenderHelpers_styleString"},
    module = "lit-element/lib/render-helpers.js"
)
@Import(
    module = "lit-element/lib/render-helpers.js"
)
public interface RenderHelpers extends Any {
  /**
   * Returns a string of CSS class names formed by taking the properties
   * in the <code>classInfo</code> object and appending the property name to the string of
   * class names if the property value is truthy.
   * @param classInfo
   *
   */
  @JSBody(
      params = {"classInfo"},
      script = "return RenderHelpers_classString(classInfo)"
  )
  static String classString(ClassStringClassInfo classInfo) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Returns a CSS style string formed from the <code>styleInfo</code> object. Property names
   * are automatically converted from <em>camelCase</em> to <em>dash-case</em>, so that you can use
   * unquoted names like <code>backgroundColor</code>. The property values are formatted
   * as css. For example <code>{backgroundColor: 'red', borderTop: '5px'}</code> becomes
   * <code>background-color: red; border-top: 5px;</code>.
   * @param styleInfo
   *
   */
  @JSBody(
      params = {"styleInfo"},
      script = "return RenderHelpers_styleString(styleInfo)"
  )
  static String styleString(StyleStringStyleInfo styleInfo) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  interface ClassStringClassInfo extends Any {
    @JSIndexer
    Unknown /* string | boolean | number */ get(String name);

    @JSIndexer
    void set(String name, String value);

    @JSIndexer
    void set(String name, boolean value);

    @JSIndexer
    void set(String name, double value);

    class Builder {
      private final ClassStringClassInfo object = Any.empty();

      public ClassStringClassInfo build() {
        return object;
      }

      public ClassStringClassInfo.Builder set(String name, String value) {
        object.set(name, value);
        return this;
      }

      public ClassStringClassInfo.Builder set(String name, boolean value) {
        object.set(name, value);
        return this;
      }

      public ClassStringClassInfo.Builder set(String name, double value) {
        object.set(name, value);
        return this;
      }
    }
  }

  interface StyleStringStyleInfo extends Any {
    @JSIndexer
    Unknown /* string | boolean | number */ get(String name);

    @JSIndexer
    void set(String name, String value);

    @JSIndexer
    void set(String name, boolean value);

    @JSIndexer
    void set(String name, double value);

    class Builder {
      private final StyleStringStyleInfo object = Any.empty();

      public StyleStringStyleInfo build() {
        return object;
      }

      public StyleStringStyleInfo.Builder set(String name, String value) {
        object.set(name, value);
        return this;
      }

      public StyleStringStyleInfo.Builder set(String name, boolean value) {
        object.set(name, value);
        return this;
      }

      public StyleStringStyleInfo.Builder set(String name, double value) {
        object.set(name, value);
        return this;
      }
    }
  }
}
