package js.lang.external.lit_html;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Unknown;
import js.web.dom.AddEventListenerOptions;
import js.web.dom.Element;
import js.web.dom.Event;
import js.web.dom.EventTarget;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

@NpmPackage(
    name = "lit-html",
    version = "^1.2.1"
)
@Import(
    symbols = {"EventPart as EventPart_EventPart"},
    module = "lit-html/lib/parts.js"
)
@Import(
    module = "lit-html/lib/parts.js"
)
public interface EventPart extends Part {
  @JSProperty("element")
  Element getElement();

  @JSProperty("eventName")
  String getEventName();

  @JSProperty("eventContext")
  @Nullable
  EventTarget getEventContext();

  @JSProperty("value")
  @Nullable
  Unknown getValue();

  @JSBody(
      params = {"element", "eventName", "eventContext"},
      script = "return new EventPart_EventPart(element, eventName, eventContext)"
  )
  static EventPart create(Element element, String eventName, @Nullable EventTarget eventContext) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   *
   */
  @JSBody(
      params = {"element", "eventName"},
      script = "return new EventPart_EventPart(element, eventName)"
  )
  static EventPart create(Element element, String eventName) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  void setValue(@Nullable AddEventListenerOptions value);

  /**
   *
   */
  void setValue();

  void commit();

  void handleEvent(Event event);
}
