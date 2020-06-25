package js.lang.external.polymer.mixins;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import org.teavm.jso.JSProperty;

@NpmPackage(
    name = "@polymer/polymer",
    version = "^3.4.1"
)
@Import(
    module = "@polymer/polymer/lib/mixins/mutable-data.js"
)
public interface OptionalMutableData extends Any {
  /**
   * Instance-level flag for configuring the dirty-checking strategy
   * for this element.  When true, Objects and Arrays will skip dirty
   * checking, otherwise strict equality checking will be used.
   *
   */
  @JSProperty("mutableData")
  boolean getMutableData();

  /**
   * Instance-level flag for configuring the dirty-checking strategy
   * for this element.  When true, Objects and Arrays will skip dirty
   * checking, otherwise strict equality checking will be used.
   *
   */
  @JSProperty("mutableData")
  void setMutableData(boolean value);
}
