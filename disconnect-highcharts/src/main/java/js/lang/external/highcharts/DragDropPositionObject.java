package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown /* number */;
import org.teavm.jso.JSProperty;

/**
 * Current drag and drop position.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface DragDropPositionObject extends Any {
  /**
   * Chart x position
   *
   */
  @JSProperty("chartX")
  double getChartX();

  /**
   * Chart x position
   *
   */
  @JSProperty("chartX")
  void setChartX(double value);

  /**
   * Chart y position
   *
   */
  @JSProperty("chartY")
  double getChartY();

  /**
   * Chart y position
   *
   */
  @JSProperty("chartY")
  void setChartY(double value);

  /**
   * Drag and drop guide box.
   *
   */
  @JSProperty("guideBox")
  @Nullable
  BBoxObject getGuideBox();

  /**
   * Drag and drop guide box.
   *
   */
  @JSProperty("guideBox")
  void setGuideBox(@Nullable BBoxObject value);

  /**
   * Updated point data.
   *
   */
  @JSProperty("points")
  Dictionary<Dictionary<Unknown /* number */>> getPoints();

  /**
   * Updated point data.
   *
   */
  @JSProperty("points")
  void setPoints(Dictionary<Dictionary<Unknown /* number */>> value);

  /**
   * Delta of previous x position.
   *
   */
  @JSProperty("prevdX")
  double getPrevdX();

  /**
   * Delta of previous x position.
   *
   */
  @JSProperty("prevdX")
  void setPrevdX(double value);

  /**
   * Delta of previous y position.
   *
   */
  @JSProperty("prevdY")
  double getPrevdY();

  /**
   * Delta of previous y position.
   *
   */
  @JSProperty("prevdY")
  void setPrevdY(double value);

  class Builder {
    private final DragDropPositionObject object = Any.empty();

    public DragDropPositionObject build() {
      return object;
    }

    /**
     * Chart x position
     *
     */
    public Builder chartX(double value) {
      object.setChartX(value);
      return this;
    }

    /**
     * Chart y position
     *
     */
    public Builder chartY(double value) {
      object.setChartY(value);
      return this;
    }

    /**
     * Drag and drop guide box.
     *
     */
    public Builder guideBox(@Nullable BBoxObject value) {
      object.setGuideBox(value);
      return this;
    }

    /**
     * Updated point data.
     *
     */
    public Builder points(Dictionary<Dictionary<Unknown /* number */>> value) {
      object.setPoints(value);
      return this;
    }

    /**
     * Delta of previous x position.
     *
     */
    public Builder prevdX(double value) {
      object.setPrevdX(value);
      return this;
    }

    /**
     * Delta of previous y position.
     *
     */
    public Builder prevdY(double value) {
      object.setPrevdY(value);
      return this;
    }
  }
}
