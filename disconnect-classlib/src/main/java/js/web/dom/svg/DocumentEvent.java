package js.web.dom.svg;

import js.lang.Any;
import js.web.dom.Event;


public interface DocumentEvent extends Any {
    Event createEvent(String eventInterface);
}
