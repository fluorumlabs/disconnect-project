package js.lang.external.polymer;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * Not defined in the TypeScript DOM library.
 * See <a href="https://developer.mozilla.org/en-US/docs/Web/API/IdleDeadline">https://developer.mozilla.org/en-US/docs/Web/API/IdleDeadline</a>
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

  double timeRemaining();
}
