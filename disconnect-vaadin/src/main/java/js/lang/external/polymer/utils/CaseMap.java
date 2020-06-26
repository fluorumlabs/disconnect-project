package js.lang.external.polymer.utils;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import java.lang.UnsupportedOperationException;
import js.lang.Any;
import org.teavm.jso.JSBody;

@NpmPackage(
    name = "@polymer/polymer",
    version = "^3.4.1"
)
@Import(
    symbols = {"camelToDashCase as CaseMap_camelToDashCase", "dashToCamelCase as CaseMap_dashToCamelCase"},
    module = "@polymer/polymer/lib/utils/case-map.js"
)
@Import(
    module = "@polymer/polymer/lib/utils/case-map.js"
)
public interface CaseMap extends Any {
  /**
   * Converts &quot;dash-case&quot; identifier (e.g. <code>foo-bar-baz</code>) to &quot;camelCase&quot;
   * (e.g. <code>fooBarBaz</code>).
   *
   * @return Camel-case representation of the identifier
   *
   */
  @JSBody(
      params = {"dash"},
      script = "return CaseMap_dashToCamelCase(dash)"
  )
  static String dashToCamelCase(String dash) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Converts &quot;camelCase&quot; identifier (e.g. <code>fooBarBaz</code>) to &quot;dash-case&quot;
   * (e.g. <code>foo-bar-baz</code>).
   *
   * @return Dash-case representation of the identifier
   *
   */
  @JSBody(
      params = {"camel"},
      script = "return CaseMap_camelToDashCase(camel)"
  )
  static String camelToDashCase(String camel) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }
}
