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
    symbols = {"flush as Flush_flush"},
    module = "@polymer/polymer/lib/utils/flush.js"
)
public interface Flush extends Any {
  /**
   * Forces several classes of asynchronously queued tasks to flush:
   *
   * <ul>
   * <li>Debouncers added via <code>enqueueDebouncer</code></li>
   * <li>ShadyDOM distribution</li>
   * </ul>
   */
  @JSBody(
      script = "Flush_flush()"
  )
  static void flush() {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }
}
