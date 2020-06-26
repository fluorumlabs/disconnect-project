package js.lang.external.polymer.legacy;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.UnsupportedOperationException;
import js.lang.Any;
import js.web.dom.EventTarget;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/**
 * Event API wrapper class returned from <code>dom.(target)</code> when
 * <code>target</code> is an <code>Event</code>.
 *
 */
@NpmPackage(
    name = "@polymer/polymer",
    version = "^3.4.1"
)
@Import(
    symbols = {"EventApi as EventApi_EventApi"},
    module = "@polymer/polymer/lib/legacy/polymer.dom.js"
)
@Import(
    module = "@polymer/polymer/lib/legacy/polymer.dom.js"
)
public interface EventApi extends Any {
  /**
   * Returns the first node on the <code>composedPath</code> of this event.
   *
   */
  @JSProperty("rootTarget")
  EventTarget getRootTarget();

  /**
   * Returns the local (re-targeted) target for this event.
   *
   */
  @JSProperty("localTarget")
  EventTarget getLocalTarget();

  /**
   * Returns the <code>composedPath</code> for this event.
   *
   */
  @JSProperty("path")
  EventTarget[] getPath();

  @JSBody(
      params = {"event"},
      script = "return new EventApi_EventApi(event)"
  )
  static EventApi create(Any event) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }
}
