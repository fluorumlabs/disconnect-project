package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown /* Array < ( number | string ) > */;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) Contains two arrays of axes that are controlled by control line
 * of the axis.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface YAxisResizeControlledAxisOptions extends Any {
  /**
   * (Highstock) Array of axes that should move out of the way of resizing
   * being done for the current axis. If not set, the next axis will be used.
   *
   */
  @JSProperty("next")
  @Nullable
  Unknown /* Array < ( number | string ) > */ getNext();

  /**
   * (Highstock) Array of axes that should move out of the way of resizing
   * being done for the current axis. If not set, the next axis will be used.
   *
   */
  @JSProperty("next")
  void setNext(double[] value);

  /**
   * (Highstock) Array of axes that should move out of the way of resizing
   * being done for the current axis. If not set, the next axis will be used.
   *
   */
  @JSProperty("next")
  void setNext(String[] value);

  /**
   * (Highstock) Array of axes that should move with the current axis while
   * resizing.
   *
   */
  @JSProperty("prev")
  @Nullable
  Unknown /* Array < ( number | string ) > */ getPrev();

  /**
   * (Highstock) Array of axes that should move with the current axis while
   * resizing.
   *
   */
  @JSProperty("prev")
  void setPrev(double[] value);

  /**
   * (Highstock) Array of axes that should move with the current axis while
   * resizing.
   *
   */
  @JSProperty("prev")
  void setPrev(String[] value);

  class Builder {
    private final YAxisResizeControlledAxisOptions object = Any.empty();

    public YAxisResizeControlledAxisOptions build() {
      return object;
    }

    /**
     * (Highstock) Array of axes that should move out of the way of resizing
     * being done for the current axis. If not set, the next axis will be used.
     *
     */
    public Builder next(double[] value) {
      object.setNext(value);
      return this;
    }

    /**
     * (Highstock) Array of axes that should move out of the way of resizing
     * being done for the current axis. If not set, the next axis will be used.
     *
     */
    public Builder next(String[] value) {
      object.setNext(value);
      return this;
    }

    /**
     * (Highstock) Array of axes that should move with the current axis while
     * resizing.
     *
     */
    public Builder prev(double[] value) {
      object.setPrev(value);
      return this;
    }

    /**
     * (Highstock) Array of axes that should move with the current axis while
     * resizing.
     *
     */
    public Builder prev(String[] value) {
      object.setPrev(value);
      return this;
    }
  }
}
