package js.web.permissions;

import js.lang.Any;
import js.lang.Promise;
import org.teavm.jso.JSBody;


public interface Permissions extends Any {
    @JSBody(script = "return Permissions.prototype")
    static Permissions prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new Permissions()")
    static Permissions create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    Promise<PermissionStatus> query(PermissionDescriptor permissionDesc);

}
