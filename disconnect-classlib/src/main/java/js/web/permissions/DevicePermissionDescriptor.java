package js.web.permissions;


import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;


public interface DevicePermissionDescriptor extends PermissionDescriptor {
    @JSProperty
    @Nullable
    String getDeviceId();

    @JSProperty
    void setDeviceId(String deviceId);
}
