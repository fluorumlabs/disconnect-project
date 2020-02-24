package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown;
import js.util.collections.Array;
import org.teavm.jso.JSIndexer;
import org.teavm.jso.JSProperty;

/**
 * An object of key-value pairs for SVG attributes. Attributes in Highcharts
 * elements for the most parts correspond to SVG, but some are specific to
 * Highcharts, like <code>zIndex</code>, <code>rotation</code>, <code>rotationOriginX</code>, <code>rotationOriginY</code>,
 * <code>translateX</code>, <code>translateY</code>, <code>scaleX</code> and <code>scaleY</code>. SVG attributes containing
 * a hyphen are <em>not</em> camel-cased, they should be quoted to preserve the hyphen.
 *
 */
public interface SVGAttributes extends Any {
  /**
   * @implspec [key: string]: (boolean|number|string|Array&lt;(number|string)&gt;|undefined);
   *
   */
  @JSIndexer
  Unknown get(String key);

  /**
   * @implspec [key: string]: (boolean|number|string|Array&lt;(number|string)&gt;|undefined);
   *
   */
  @JSIndexer
  void set(String key, boolean value);

  /**
   * @implspec [key: string]: (boolean|number|string|Array&lt;(number|string)&gt;|undefined);
   *
   */
  @JSIndexer
  void set(String key, double value);

  /**
   * @implspec [key: string]: (boolean|number|string|Array&lt;(number|string)&gt;|undefined);
   *
   */
  @JSIndexer
  void set(String key, String value);

  /**
   * @implspec [key: string]: (boolean|number|string|Array&lt;(number|string)&gt;|undefined);
   *
   */
  @JSIndexer
  void set(String key, Array<Unknown> value);

  /**
   * @implspec d?: (string|SVGPathArray);
   *
   */
  @JSProperty("d")
  @Nullable
  Unknown getD();

  /**
   * @implspec d?: (string|SVGPathArray);
   *
   */
  @JSProperty("d")
  void setD(String value);

  /**
   * @implspec d?: (string|SVGPathArray);
   *
   */
  @JSProperty("d")
  void setD(Array<Unknown> value);

  /**
   * @implspec inverted?: boolean;
   *
   */
  @JSProperty("inverted")
  boolean getInverted();

  /**
   * @implspec inverted?: boolean;
   *
   */
  @JSProperty("inverted")
  void setInverted(boolean value);

  /**
   * @implspec matrix?: Array<number>;
   *
   */
  @JSProperty("matrix")
  @Nullable
  double[] getMatrix();

  /**
   * @implspec matrix?: Array<number>;
   *
   */
  @JSProperty("matrix")
  void setMatrix(double[] value);

  /**
   * @implspec rotation?: string;
   *
   */
  @JSProperty("rotation")
  @Nullable
  String getRotation();

  /**
   * @implspec rotation?: string;
   *
   */
  @JSProperty("rotation")
  void setRotation(String value);

  /**
   * @implspec rotationOriginX?: number;
   *
   */
  @JSProperty("rotationOriginX")
  double getRotationOriginX();

  /**
   * @implspec rotationOriginX?: number;
   *
   */
  @JSProperty("rotationOriginX")
  void setRotationOriginX(double value);

  /**
   * @implspec rotationOriginY?: number;
   *
   */
  @JSProperty("rotationOriginY")
  double getRotationOriginY();

  /**
   * @implspec rotationOriginY?: number;
   *
   */
  @JSProperty("rotationOriginY")
  void setRotationOriginY(double value);

  /**
   * @implspec scaleX?: number;
   *
   */
  @JSProperty("scaleX")
  double getScaleX();

  /**
   * @implspec scaleX?: number;
   *
   */
  @JSProperty("scaleX")
  void setScaleX(double value);

  /**
   * @implspec scaleY?: number;
   *
   */
  @JSProperty("scaleY")
  double getScaleY();

  /**
   * @implspec scaleY?: number;
   *
   */
  @JSProperty("scaleY")
  void setScaleY(double value);

  /**
   * @implspec stroke?: ColorString;
   *
   */
  @JSProperty("stroke")
  @Nullable
  String getStroke();

  /**
   * @implspec stroke?: ColorString;
   *
   */
  @JSProperty("stroke")
  void setStroke(String value);

  /**
   * @implspec translateX?: number;
   *
   */
  @JSProperty("translateX")
  double getTranslateX();

  /**
   * @implspec translateX?: number;
   *
   */
  @JSProperty("translateX")
  void setTranslateX(double value);

  /**
   * @implspec translateY?: number;
   *
   */
  @JSProperty("translateY")
  double getTranslateY();

  /**
   * @implspec translateY?: number;
   *
   */
  @JSProperty("translateY")
  void setTranslateY(double value);

  /**
   * @implspec zIndex?: number;
   *
   */
  @JSProperty("zIndex")
  double getZIndex();

  /**
   * @implspec zIndex?: number;
   *
   */
  @JSProperty("zIndex")
  void setZIndex(double value);
}
