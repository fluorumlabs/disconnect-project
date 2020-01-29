package js.web.dom;

import js.extras.JsEnum;
import js.lang.Any;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/**
 * An abnormal event (called an exception) which occurs as a result of calling a method or accessing a property of a web API.
 */
public interface DOMException extends Any {
    @JSBody(script = "return DOMException.prototype")
    static DOMException prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = {"message", "name"}, script = "return new DOMException(message, name)")
    static DOMException create(String message, String name) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = "message", script = "return new DOMException(message)")
    static DOMException create(String message) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new DOMException()")
    static DOMException create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    Code getCode();

    @JSProperty
    String getMessage();

    @JSProperty
    String getName();

    abstract class Code extends JsEnum {
        public static final Code ABORT_ERR = JsEnum.from("return DOMException.ABORT_ERR");

        public static final Code DATA_CLONE_ERR = JsEnum.from("return DOMException.DATA_CLONE_ERR");

        public static final Code DOMSTRING_SIZE_ERR = JsEnum.from("return DOMException.DOMSTRING_SIZE_ERR");

        public static final Code HIERARCHY_REQUEST_ERR = JsEnum.from("return DOMException.HIERARCHY_REQUEST_ERR");

        public static final Code INDEX_SIZE_ERR = JsEnum.from("return DOMException.INDEX_SIZE_ERR");

        public static final Code INUSE_ATTRIBUTE_ERR = JsEnum.from("return DOMException.INUSE_ATTRIBUTE_ERR");

        public static final Code INVALID_ACCESS_ERR = JsEnum.from("return DOMException.INVALID_ACCESS_ERR");

        public static final Code INVALID_CHARACTER_ERR = JsEnum.from("return DOMException.INVALID_CHARACTER_ERR");

        public static final Code INVALID_MODIFICATION_ERR = JsEnum.from("return DOMException.INVALID_MODIFICATION_ERR");

        public static final Code INVALID_NODE_TYPE_ERR = JsEnum.from("return DOMException.INVALID_NODE_TYPE_ERR");

        public static final Code INVALID_STATE_ERR = JsEnum.from("return DOMException.INVALID_STATE_ERR");

        public static final Code NAMESPACE_ERR = JsEnum.from("return DOMException.NAMESPACE_ERR");

        public static final Code NETWORK_ERR = JsEnum.from("return DOMException.NETWORK_ERR");

        public static final Code NOT_FOUND_ERR = JsEnum.from("return DOMException.NOT_FOUND_ERR");

        public static final Code NOT_SUPPORTED_ERR = JsEnum.from("return DOMException.NOT_SUPPORTED_ERR");

        public static final Code NO_DATA_ALLOWED_ERR = JsEnum.from("return DOMException.NO_DATA_ALLOWED_ERR");

        public static final Code NO_MODIFICATION_ALLOWED_ERR = JsEnum.from("return DOMException.NO_MODIFICATION_ALLOWED_ERR");

        public static final Code QUOTA_EXCEEDED_ERR = JsEnum.from("return DOMException.QUOTA_EXCEEDED_ERR");

        public static final Code SECURITY_ERR = JsEnum.from("return DOMException.SECURITY_ERR");

        public static final Code SYNTAX_ERR = JsEnum.from("return DOMException.SYNTAX_ERR");

        public static final Code TIMEOUT_ERR = JsEnum.from("return DOMException.TIMEOUT_ERR");

        public static final Code TYPE_MISMATCH_ERR = JsEnum.from("return DOMException.TYPE_MISMATCH_ERR");

        public static final Code URL_MISMATCH_ERR = JsEnum.from("return DOMException.URL_MISMATCH_ERR");

        public static final Code VALIDATION_ERR = JsEnum.from("return DOMException.VALIDATION_ERR");

        public static final Code WRONG_DOCUMENT_ERR = JsEnum.from("return DOMException.WRONG_DOCUMENT_ERR");
    }

}
