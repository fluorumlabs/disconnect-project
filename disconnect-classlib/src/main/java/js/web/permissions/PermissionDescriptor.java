package js.web.permissions;

import js.lang.Any;
import org.teavm.jso.JSProperty;


public interface PermissionDescriptor extends Any {
    @JSProperty
    PermissionName getName();

    @JSProperty
    void setName(PermissionName device);

}
