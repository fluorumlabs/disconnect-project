package js.lang.external.polymer.utils;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.UnsupportedOperationException;
import js.lang.Any;
import js.lang.external.polymer.PolymerElementConstructor;
import org.teavm.jso.JSBody;

@NpmPackage(
    name = "@polymer/polymer",
    version = "^3.4.1"
)
@Import(
    symbols = {"incrementInstanceCount as Telemetry_incrementInstanceCount", "dumpRegistrations as Telemetry_dumpRegistrations", "register as Telemetry_register"},
    module = "@polymer/polymer/lib/utils/telemetry.js"
)
public interface Telemetry extends Any {
  @JSBody(
      script = "Telemetry_incrementInstanceCount()"
  )
  static void incrementInstanceCount() {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Registers a class prototype for telemetry purposes.
   *
   */
  @JSBody(
      params = {"prototype"},
      script = "Telemetry_register(prototype)"
  )
  static void register(PolymerElementConstructor prototype) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Logs all elements registered with an <code>is</code> to the console.
   *
   */
  @JSBody(
      script = "Telemetry_dumpRegistrations()"
  )
  static void dumpRegistrations() {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }
}
