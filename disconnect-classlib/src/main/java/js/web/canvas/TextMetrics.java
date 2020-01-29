package js.web.canvas;

import js.annotations.Experimental;
import js.lang.Any;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/**
 * The dimensions of a piece of text in the canvas, as created by the CanvasRenderingContext2D.measureText() method.
 */
@Experimental
public interface TextMetrics extends Any {
    @JSBody(script = "return TextMetrics.prototype")
    static TextMetrics prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new TextMetrics()")
    static TextMetrics create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    /**
     * Returns the measurement described below.
     */
    @JSProperty
    double getActualBoundingBoxAscent();

    /**
     * Returns the measurement described below.
     */
    @JSProperty
    double getActualBoundingBoxDescent();

    /**
     * Returns the measurement described below.
     */
    @JSProperty
    double getActualBoundingBoxLeft();

    /**
     * Returns the measurement described below.
     */
    @JSProperty
    double getActualBoundingBoxRight();

    /**
     * Returns the measurement described below.
     */
    @JSProperty
    double getAlphabeticBaseline();

    /**
     * Returns the measurement described below.
     */
    @JSProperty
    double getEmHeightAscent();

    /**
     * Returns the measurement described below.
     */
    @JSProperty
    double getEmHeightDescent();

    /**
     * Returns the measurement described below.
     */
    @JSProperty
    double getFontBoundingBoxAscent();

    /**
     * Returns the measurement described below.
     */
    @JSProperty
    double getFontBoundingBoxDescent();

    /**
     * Returns the measurement described below.
     */
    @JSProperty
    double getHangingBaseline();

    /**
     * Returns the measurement described below.
     */
    @JSProperty
    double getIdeographicBaseline();

    /**
     * Returns the measurement described below.
     */
    @JSProperty
    double getWidth();

}
