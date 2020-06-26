package js.lang.external.lit_html.directives;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.FunctionalInterface;
import java.lang.UnsupportedOperationException;
import js.lang.Any;
import js.lang.external.lit_html.Part;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSFunctor;

@NpmPackage(
    name = "lit-html",
    version = "^1.2.1"
)
@Import(
    symbols = {"classMap as ClassMap_classMap"},
    module = "lit-html/directives/class-map.js"
)
@Import(
    module = "lit-html/directives/class-map.js"
)
public interface ClassMap extends Any {
  /**
   * A directive that applies CSS classes. This must be used in the <code>class</code>
   * attribute and must be the only part used in the attribute. It takes each
   * property in the <code>classInfo</code> argument and adds the property name to the
   * element's <code>class</code> if the property value is truthy; if the property value is
   * falsey, the property name is removed from the element's <code>class</code>. For example
   * <code>{foo: bar}</code> applies the class <code>foo</code> if the value of <code>bar</code> is truthy.
   * @param classInfo {ClassInfo}
   *
   */
  @JSBody(
      params = {"classInfo"},
      script = "return ClassMap_classMap(classInfo)"
  )
  static ClassMapResultFunction classMap(ClassInfo classInfo) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  @FunctionalInterface
  @JSFunctor
  interface ClassMapResultFunction extends Any {
    void apply(Part part);
  }
}
