package js.web.webvr;

import js.lang.Any;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/**
 * This WebVR API interface represents a field of view defined by 4 different degree values describing the view from a center point.
 */
public interface VRFieldOfView extends Any {
    @JSBody(script = "return VRFieldOfView.prototype")
    static VRFieldOfView prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new VRFieldOfView()")
    static VRFieldOfView create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    double getDownDegrees();

    @JSProperty
    double getLeftDegrees();

    @JSProperty
    double getRightDegrees();

    @JSProperty
    double getUpDegrees();

}
