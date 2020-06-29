package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.UnsupportedOperationException;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/**
 * The object wrapper for plot lines and plot bands
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    symbols = {"PlotLineOrBand as PlotLineOrBand_PlotLineOrBand"},
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface PlotLineOrBand extends Any {
  /**
   * The object wrapper for plot lines and plot bands
   *
   */
  @JSBody(
      params = {"axis", "options"},
      script = "return new PlotLineOrBand_PlotLineOrBand(axis, options)"
  )
  static PlotLineOrBand create(Axis axis, @Nullable ZAxisPlotLinesOptions options) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * The object wrapper for plot lines and plot bands
   *
   */
  @JSBody(
      params = {"axis", "options"},
      script = "return new PlotLineOrBand_PlotLineOrBand(axis, options)"
  )
  static PlotLineOrBand create(Axis axis, @Nullable YAxisPlotLinesOptions options) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * The object wrapper for plot lines and plot bands
   *
   */
  @JSBody(
      params = {"axis", "options"},
      script = "return new PlotLineOrBand_PlotLineOrBand(axis, options)"
  )
  static PlotLineOrBand create(Axis axis, @Nullable XAxisPlotLinesOptions options) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * The object wrapper for plot lines and plot bands
   *
   */
  @JSBody(
      params = {"axis", "options"},
      script = "return new PlotLineOrBand_PlotLineOrBand(axis, options)"
  )
  static PlotLineOrBand create(Axis axis, @Nullable ZAxisPlotBandsOptions options) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * The object wrapper for plot lines and plot bands
   *
   */
  @JSBody(
      params = {"axis", "options"},
      script = "return new PlotLineOrBand_PlotLineOrBand(axis, options)"
  )
  static PlotLineOrBand create(Axis axis, @Nullable YAxisPlotBandsOptions options) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * The object wrapper for plot lines and plot bands
   *
   */
  @JSBody(
      params = {"axis", "options"},
      script = "return new PlotLineOrBand_PlotLineOrBand(axis, options)"
  )
  static PlotLineOrBand create(Axis axis, @Nullable XAxisPlotBandsOptions options) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * The object wrapper for plot lines and plot bands
   *
   */
  @JSBody(
      params = {"axis"},
      script = "return new PlotLineOrBand_PlotLineOrBand(axis)"
  )
  static PlotLineOrBand create(Axis axis) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * SVG element of the label.
   *
   */
  @JSProperty("label")
  SVGElement getLabel();

  /**
   * SVG element of the label.
   *
   */
  @JSProperty("label")
  void setLabel(SVGElement value);

  /**
   * SVG element of the plot line or band.
   *
   */
  @JSProperty("svgElement")
  SVGElement getSvgElement();

  /**
   * SVG element of the plot line or band.
   *
   */
  @JSProperty("svgElement")
  void setSvgElement(SVGElement value);

  /**
   * Remove the plot line or band.
   *
   */
  void destroy();
}
