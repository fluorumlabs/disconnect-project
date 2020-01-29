package js.web.webcomponents;

import js.lang.Any;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;


public interface Slotable extends Any {
    @JSProperty
    @Nullable
    HTMLSlotElement getAssignedSlot();

}
