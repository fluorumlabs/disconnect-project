package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown;
import js.util.collections.Array;
import org.teavm.jso.JSProperty;

/**
 * Map data object.
 *
 */
public interface MapDataObject extends Any {
  /**
   * The name of the data.
   *
   * @implspec name?: string;
   *
   */
  @JSProperty("name")
  @Nullable
  String getName();

  /**
   * The name of the data.
   *
   * @implspec name?: string;
   *
   */
  @JSProperty("name")
  void setName(String value);

  /**
   * The SVG path.
   *
   * @implspec path: SVGPathArray;
   *
   */
  @JSProperty("path")
  Array<Unknown> getPath();

  /**
   * The SVG path.
   *
   * @implspec path: SVGPathArray;
   *
   */
  @JSProperty("path")
  void setPath(Array<Unknown> value);

  /**
   * The GeoJSON meta data.
   *
   * @implspec properties?: object;
   *
   */
  @JSProperty("properties")
  @Nullable
  Any getProperties();

  /**
   * The GeoJSON meta data.
   *
   * @implspec properties?: object;
   *
   */
  @JSProperty("properties")
  void setProperties(Any value);
}
