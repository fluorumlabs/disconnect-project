package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown /* ( string | SVGAttributes ) */;
import org.teavm.jso.JSProperty;

/**
 * Pattern options
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface PatternOptionsObject extends Any {
  /**
   * For automatically calculated width and height on images, it is possible
   * to set an aspect ratio. The image will be zoomed to fill the bounding
   * box, maintaining the aspect ratio defined.
   *
   */
  @JSProperty("aspectRatio")
  double getAspectRatio();

  /**
   * For automatically calculated width and height on images, it is possible
   * to set an aspect ratio. The image will be zoomed to fill the bounding
   * box, maintaining the aspect ratio defined.
   *
   */
  @JSProperty("aspectRatio")
  void setAspectRatio(double value);

  /**
   * Background color for the pattern if a <code>path</code> is set (not images).
   *
   */
  @JSProperty("backgroundColor")
  String getBackgroundColor();

  /**
   * Background color for the pattern if a <code>path</code> is set (not images).
   *
   */
  @JSProperty("backgroundColor")
  void setBackgroundColor(String value);

  /**
   * Pattern color, used as default path stroke.
   *
   */
  @JSProperty("color")
  String getColor();

  /**
   * Pattern color, used as default path stroke.
   *
   */
  @JSProperty("color")
  void setColor(String value);

  /**
   * Analogous to pattern.width.
   *
   */
  @JSProperty("height")
  double getHeight();

  /**
   * Analogous to pattern.width.
   *
   */
  @JSProperty("height")
  void setHeight(double value);

  /**
   * ID to assign to the pattern. This is automatically computed if not added,
   * and identical patterns are reused. To refer to an existing pattern for a
   * Highcharts color, use <code>color: &quot;url(#pattern-id)&quot;</code>.
   *
   */
  @JSProperty("id")
  @Nullable
  String getId();

  /**
   * ID to assign to the pattern. This is automatically computed if not added,
   * and identical patterns are reused. To refer to an existing pattern for a
   * Highcharts color, use <code>color: &quot;url(#pattern-id)&quot;</code>.
   *
   */
  @JSProperty("id")
  void setId(@Nullable String value);

  /**
   * URL to an image to use as the pattern.
   *
   */
  @JSProperty("image")
  String getImage();

  /**
   * URL to an image to use as the pattern.
   *
   */
  @JSProperty("image")
  void setImage(String value);

  /**
   * Opacity of the pattern as a float value from 0 to 1.
   *
   */
  @JSProperty("opacity")
  double getOpacity();

  /**
   * Opacity of the pattern as a float value from 0 to 1.
   *
   */
  @JSProperty("opacity")
  void setOpacity(double value);

  /**
   * Either an SVG path as string, or an object. As an object, supply the path
   * string in the <code>path.d</code> property. Other supported properties are standard
   * SVG attributes like <code>path.stroke</code> and <code>path.fill</code>. If a path is supplied
   * for the pattern, the <code>image</code> property is ignored.
   *
   */
  @JSProperty("path")
  Unknown /* ( string | SVGAttributes ) */ getPath();

  /**
   * Either an SVG path as string, or an object. As an object, supply the path
   * string in the <code>path.d</code> property. Other supported properties are standard
   * SVG attributes like <code>path.stroke</code> and <code>path.fill</code>. If a path is supplied
   * for the pattern, the <code>image</code> property is ignored.
   *
   */
  @JSProperty("path")
  void setPath(SVGAttributes value);

  /**
   * Either an SVG path as string, or an object. As an object, supply the path
   * string in the <code>path.d</code> property. Other supported properties are standard
   * SVG attributes like <code>path.stroke</code> and <code>path.fill</code>. If a path is supplied
   * for the pattern, the <code>image</code> property is ignored.
   *
   */
  @JSProperty("path")
  void setPath(String value);

  /**
   * SVG <code>patternTransform</code> to apply to the entire pattern.
   *
   */
  @JSProperty("patternTransform")
  String getPatternTransform();

  /**
   * SVG <code>patternTransform</code> to apply to the entire pattern.
   *
   */
  @JSProperty("patternTransform")
  void setPatternTransform(String value);

  /**
   * Width of the pattern. For images this is automatically set to the width
   * of the element bounding box if not supplied. For non-image patterns the
   * default is 32px. Note that automatic resizing of image patterns to fill a
   * bounding box dynamically is only supported for patterns with an
   * automatically calculated ID.
   *
   */
  @JSProperty("width")
  double getWidth();

  /**
   * Width of the pattern. For images this is automatically set to the width
   * of the element bounding box if not supplied. For non-image patterns the
   * default is 32px. Note that automatic resizing of image patterns to fill a
   * bounding box dynamically is only supported for patterns with an
   * automatically calculated ID.
   *
   */
  @JSProperty("width")
  void setWidth(double value);

  /**
   * Horizontal offset of the pattern. Defaults to 0.
   *
   */
  @JSProperty("x")
  double getX();

  /**
   * Horizontal offset of the pattern. Defaults to 0.
   *
   */
  @JSProperty("x")
  void setX(double value);

  /**
   * Vertical offset of the pattern. Defaults to 0.
   *
   */
  @JSProperty("y")
  double getY();

  /**
   * Vertical offset of the pattern. Defaults to 0.
   *
   */
  @JSProperty("y")
  void setY(double value);

  class Builder {
    private final PatternOptionsObject object = Any.empty();

    public PatternOptionsObject build() {
      return object;
    }

    /**
     * For automatically calculated width and height on images, it is possible
     * to set an aspect ratio. The image will be zoomed to fill the bounding
     * box, maintaining the aspect ratio defined.
     *
     */
    public Builder aspectRatio(double value) {
      object.setAspectRatio(value);
      return this;
    }

    /**
     * Background color for the pattern if a <code>path</code> is set (not images).
     *
     */
    public Builder backgroundColor(String value) {
      object.setBackgroundColor(value);
      return this;
    }

    /**
     * Pattern color, used as default path stroke.
     *
     */
    public Builder color(String value) {
      object.setColor(value);
      return this;
    }

    /**
     * Analogous to pattern.width.
     *
     */
    public Builder height(double value) {
      object.setHeight(value);
      return this;
    }

    /**
     * ID to assign to the pattern. This is automatically computed if not added,
     * and identical patterns are reused. To refer to an existing pattern for a
     * Highcharts color, use <code>color: &quot;url(#pattern-id)&quot;</code>.
     *
     */
    public Builder id(@Nullable String value) {
      object.setId(value);
      return this;
    }

    /**
     * URL to an image to use as the pattern.
     *
     */
    public Builder image(String value) {
      object.setImage(value);
      return this;
    }

    /**
     * Opacity of the pattern as a float value from 0 to 1.
     *
     */
    public Builder opacity(double value) {
      object.setOpacity(value);
      return this;
    }

    /**
     * Either an SVG path as string, or an object. As an object, supply the path
     * string in the <code>path.d</code> property. Other supported properties are standard
     * SVG attributes like <code>path.stroke</code> and <code>path.fill</code>. If a path is supplied
     * for the pattern, the <code>image</code> property is ignored.
     *
     */
    public Builder path(SVGAttributes value) {
      object.setPath(value);
      return this;
    }

    /**
     * Either an SVG path as string, or an object. As an object, supply the path
     * string in the <code>path.d</code> property. Other supported properties are standard
     * SVG attributes like <code>path.stroke</code> and <code>path.fill</code>. If a path is supplied
     * for the pattern, the <code>image</code> property is ignored.
     *
     */
    public Builder path(String value) {
      object.setPath(value);
      return this;
    }

    /**
     * SVG <code>patternTransform</code> to apply to the entire pattern.
     *
     */
    public Builder patternTransform(String value) {
      object.setPatternTransform(value);
      return this;
    }

    /**
     * Width of the pattern. For images this is automatically set to the width
     * of the element bounding box if not supplied. For non-image patterns the
     * default is 32px. Note that automatic resizing of image patterns to fill a
     * bounding box dynamically is only supported for patterns with an
     * automatically calculated ID.
     *
     */
    public Builder width(double value) {
      object.setWidth(value);
      return this;
    }

    /**
     * Horizontal offset of the pattern. Defaults to 0.
     *
     */
    public Builder x(double value) {
      object.setX(value);
      return this;
    }

    /**
     * Vertical offset of the pattern. Defaults to 0.
     *
     */
    public Builder y(double value) {
      object.setY(value);
      return this;
    }
  }
}
