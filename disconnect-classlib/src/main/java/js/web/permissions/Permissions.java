package js.web.permissions;

import org.teavm.jso.JSBody;

import js.lang.Any;
import js.lang.Promise;


public interface Permissions extends Any {
        Promise<PermissionStatus> query(PermissionDescriptor permissionDesc);

        @JSBody(script = "return Permissions.prototype")
        static Permissions prototype() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(script = "return new Permissions()")
        static Permissions create() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        }
