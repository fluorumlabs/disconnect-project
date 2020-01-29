package js.web.permissions;

import org.teavm.jso.JSProperty;


public interface MidiPermissionDescriptor extends PermissionDescriptor {
    @JSProperty
    boolean isSysex();

    @JSProperty
    void setSysex(boolean sysex);

}
