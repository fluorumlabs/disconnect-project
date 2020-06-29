package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) Styles for a bottom line.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface PlotBbBottomLineStylesOptions extends Any {
  /**
   * (Highstock) Color of the line. If not set, it's inherited from
   * plotOptions.bb.color.
   *
   */
  @JSProperty("lineColor")
  @Nullable
  String getLineColor();

  /**
   * (Highstock) Color of the line. If not set, it's inherited from
   * plotOptions.bb.color.
   *
   */
  @JSProperty("lineColor")
  void setLineColor(@Nullable String value);

  /**
   * (Highstock) Pixel width of the line.
   *
   */
  @JSProperty("lineWidth")
  double getLineWidth();

  /**
   * (Highstock) Pixel width of the line.
   *
   */
  @JSProperty("lineWidth")
  void setLineWidth(double value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final PlotBbBottomLineStylesOptions object = Any.empty();

    private Builder() {
    }

    public PlotBbBottomLineStylesOptions build() {
      return object;
    }

    /**
     * (Highstock) Color of the line. If not set, it's inherited from
     * plotOptions.bb.color.
     *
     */
    public Builder lineColor(@Nullable String value) {
      object.setLineColor(value);
      return this;
    }

    /**
     * (Highstock) Pixel width of the line.
     *
     */
    public Builder lineWidth(double value) {
      object.setLineWidth(value);
      return this;
    }
  }
}
