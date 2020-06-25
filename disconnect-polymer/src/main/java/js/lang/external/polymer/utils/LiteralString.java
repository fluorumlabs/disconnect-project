package js.lang.external.polymer.utils;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * Class representing a static string value which can be used to filter
 * strings by asseting that they have been created via this class. The
 * <code>value</code> property returns the string passed to the constructor.
 *
 */
@NpmPackage(
    name = "@polymer/polymer",
    version = "^3.4.1"
)
@Import(
    module = "@polymer/polymer/lib/utils/html-tag.js"
)
public interface LiteralString extends Any {
  @JSProperty("value")
  String getValue();

  @JSProperty("value")
  void setValue(String value);

  /**
   * @return LiteralString string value
   *
   */
  String toString();
}
