package js.lang.external.polymer.utils;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.UnsupportedOperationException;
import js.lang.Any;
import org.teavm.jso.JSBody;

@NpmPackage(
    name = "@polymer/polymer",
    version = "^3.4.1"
)
@Import(
    symbols = {"enqueueDebouncer as Debounce_enqueueDebouncer", "flushDebouncers as Debounce_flushDebouncers"},
    module = "@polymer/polymer/lib/utils/debounce.js"
)
@Import(
    module = "@polymer/polymer/lib/utils/debounce.js"
)
public interface Debounce extends Any {
  /**
   * Adds a <code>Debouncer</code> to a list of globally flushable tasks.
   *
   */
  @JSBody(
      params = {"debouncer"},
      script = "Debounce_enqueueDebouncer(debouncer)"
  )
  static void enqueueDebouncer(Debouncer debouncer) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Flushes any enqueued debouncers
   *
   * @return Returns whether any debouncers were flushed
   *
   */
  @JSBody(
      script = "return Debounce_flushDebouncers()"
  )
  static boolean flushDebouncers() {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }
}
