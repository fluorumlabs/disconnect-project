package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.UnsupportedOperationException;
import js.lang.Any;
import js.lang.Unknown;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/**
 * The object wrapper for plot lines and plot bands
 *
 */
public interface PlotLineOrBand extends Any {
  /**
   * The object wrapper for plot lines and plot bands
   *
   * @implspec constructor(axis: Axis, options: (AxisPlotBandsOptions|AxisPlotLinesOptions));
   *
   */
  @JSBody(
      params = {"axis", "options"},
      script = "return new PlotLineOrBand(axis, options)"
  )
  static PlotLineOrBand create(Axis axis, Unknown options) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * SVG element of the label.
   *
   * @implspec label: SVGElement;
   *
   */
  @JSProperty("label")
  SVGElement getLabel();

  /**
   * SVG element of the label.
   *
   * @implspec label: SVGElement;
   *
   */
  @JSProperty("label")
  void setLabel(SVGElement value);

  /**
   * SVG element of the plot line or band.
   *
   * @implspec svgElement: SVGElement;
   *
   */
  @JSProperty("svgElement")
  SVGElement getSvgElement();

  /**
   * SVG element of the plot line or band.
   *
   * @implspec svgElement: SVGElement;
   *
   */
  @JSProperty("svgElement")
  void setSvgElement(SVGElement value);

  /**
   * Remove the plot line or band.
   *
   * @implspec destroy(): void;
   *
   */
  void destroy();
}
