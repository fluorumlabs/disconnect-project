package js.lang.external.polymer;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * Not defined in the TypeScript DOM library.
 * See https:
 *
 */
@NpmPackage(
    name = "@polymer/polymer",
    version = "^3.4.1"
)
@Import(
    module = "@polymer/polymer/polymer-element.js"
)
public interface IdleDeadline extends Any {
  @JSProperty("didTimeout")
  boolean getDidTimeout();

  @JSProperty("didTimeout")
  void setDidTimeout(boolean value);

  int timeRemaining();
}
