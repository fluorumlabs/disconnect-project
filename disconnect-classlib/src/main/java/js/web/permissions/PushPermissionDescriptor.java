package js.web.permissions;


import org.teavm.jso.JSProperty;


public interface PushPermissionDescriptor extends PermissionDescriptor {
    @JSProperty
    boolean isUserVisibleOnly();

    @JSProperty
    void setUserVisibleOnly(boolean userVisibleOnly);

}
