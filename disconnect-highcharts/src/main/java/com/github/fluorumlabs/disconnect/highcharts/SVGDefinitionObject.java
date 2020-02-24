package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown;
import js.util.collections.Array;
import org.teavm.jso.JSIndexer;
import org.teavm.jso.JSProperty;

/**
 * Serialized form of an SVG definition, including children. Some key property
 * names are reserved: tagName, textContent, and children.
 *
 */
public interface SVGDefinitionObject extends Any {
  /**
   * @implspec [key: string]: (number|string|Array<SVGDefinitionObject>|undefined);
   *
   */
  @JSIndexer
  Unknown get(String key);

  /**
   * @implspec [key: string]: (number|string|Array<SVGDefinitionObject>|undefined);
   *
   */
  @JSIndexer
  void set(String key, Array<SVGDefinitionObject> value);

  /**
   * @implspec [key: string]: (number|string|Array<SVGDefinitionObject>|undefined);
   *
   */
  @JSIndexer
  void set(String key, double value);

  /**
   * @implspec [key: string]: (number|string|Array<SVGDefinitionObject>|undefined);
   *
   */
  @JSIndexer
  void set(String key, String value);

  /**
   * @implspec children?: Array<SVGDefinitionObject>;
   *
   */
  @JSProperty("children")
  @Nullable
  Array<SVGDefinitionObject> getChildren();

  /**
   * @implspec children?: Array<SVGDefinitionObject>;
   *
   */
  @JSProperty("children")
  void setChildren(Array<SVGDefinitionObject> value);

  /**
   * @implspec tagName?: string;
   *
   */
  @JSProperty("tagName")
  @Nullable
  String getTagName();

  /**
   * @implspec tagName?: string;
   *
   */
  @JSProperty("tagName")
  void setTagName(String value);

  /**
   * @implspec textContent?: string;
   *
   */
  @JSProperty("textContent")
  @Nullable
  String getTextContent();

  /**
   * @implspec textContent?: string;
   *
   */
  @JSProperty("textContent")
  void setTextContent(String value);
}
