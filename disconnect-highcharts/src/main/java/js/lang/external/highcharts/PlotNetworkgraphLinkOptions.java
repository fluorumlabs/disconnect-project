package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts) Link style options
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface PlotNetworkgraphLinkOptions extends Any {
  /**
   * (Highcharts) Color of the link between two nodes.
   *
   */
  @JSProperty("color")
  @Nullable
  String getColor();

  /**
   * (Highcharts) Color of the link between two nodes.
   *
   */
  @JSProperty("color")
  void setColor(@Nullable String value);

  /**
   * (Highcharts) A name for the dash style to use for links.
   *
   */
  @JSProperty("dashStyle")
  @Nullable
  String getDashStyle();

  /**
   * (Highcharts) A name for the dash style to use for links.
   *
   */
  @JSProperty("dashStyle")
  void setDashStyle(@Nullable String value);

  /**
   * (Highcharts) Width (px) of the link between two nodes.
   *
   */
  @JSProperty("width")
  double getWidth();

  /**
   * (Highcharts) Width (px) of the link between two nodes.
   *
   */
  @JSProperty("width")
  void setWidth(double value);

  class Builder {
    private final PlotNetworkgraphLinkOptions object = Any.empty();

    public PlotNetworkgraphLinkOptions build() {
      return object;
    }

    /**
     * (Highcharts) Color of the link between two nodes.
     *
     */
    public Builder color(@Nullable String value) {
      object.setColor(value);
      return this;
    }

    /**
     * (Highcharts) A name for the dash style to use for links.
     *
     */
    public Builder dashStyle(@Nullable String value) {
      object.setDashStyle(value);
      return this;
    }

    /**
     * (Highcharts) Width (px) of the link between two nodes.
     *
     */
    public Builder width(double value) {
      object.setWidth(value);
      return this;
    }
  }
}
