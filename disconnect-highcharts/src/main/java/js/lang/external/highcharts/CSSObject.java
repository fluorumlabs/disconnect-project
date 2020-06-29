package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.extras.JsEnum;
import js.lang.Any;
import js.lang.Unknown /* ( 'contrast' | ColorString ) */;
import js.lang.Unknown /* ( boolean | number | string | undefined ) */;
import org.teavm.jso.JSIndexer;
import org.teavm.jso.JSProperty;

/**
 * A style object with camel case property names to define visual appearance of
 * a SVG element or HTML element. The properties can be whatever styles are
 * supported on the given SVG or HTML element.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface CSSObject extends Any {
  @JSIndexer
  @Nullable
  Unknown /* ( boolean | number | string | undefined ) */ get(String key);

  @JSIndexer
  void set(String key, boolean value);

  @JSIndexer
  void set(String key, double value);

  @JSIndexer
  void set(String key, @Nullable String value);

  /**
   * Background style for the element.
   *
   */
  @JSProperty("background")
  @Nullable
  String getBackground();

  /**
   * Background style for the element.
   *
   */
  @JSProperty("background")
  void setBackground(@Nullable String value);

  /**
   * Background color of the element.
   *
   */
  @JSProperty("backgroundColor")
  @Nullable
  String getBackgroundColor();

  /**
   * Background color of the element.
   *
   */
  @JSProperty("backgroundColor")
  void setBackgroundColor(@Nullable String value);

  /**
   * Border style for the element.
   *
   */
  @JSProperty("border")
  @Nullable
  String getBorder();

  /**
   * Border style for the element.
   *
   */
  @JSProperty("border")
  void setBorder(@Nullable String value);

  /**
   * Radius of the element border.
   *
   */
  @JSProperty("borderRadius")
  double getBorderRadius();

  /**
   * Radius of the element border.
   *
   */
  @JSProperty("borderRadius")
  void setBorderRadius(double value);

  /**
   * Color used in the element. The 'contrast' option is a Highcharts custom
   * property that results in black or white, depending on the background of
   * the element.
   *
   */
  @JSProperty("color")
  @Nullable
  Unknown /* ( 'contrast' | ColorString ) */ getColor();

  /**
   * Color used in the element. The 'contrast' option is a Highcharts custom
   * property that results in black or white, depending on the background of
   * the element.
   *
   */
  @JSProperty("color")
  void setColor(@Nullable Color value);

  /**
   * Color used in the element. The 'contrast' option is a Highcharts custom
   * property that results in black or white, depending on the background of
   * the element.
   *
   */
  @JSProperty("color")
  void setColor(@Nullable String value);

  /**
   * Style of the mouse cursor when resting over the element.
   *
   */
  @JSProperty("cursor")
  @Nullable
  Cursor getCursor();

  /**
   * Style of the mouse cursor when resting over the element.
   *
   */
  @JSProperty("cursor")
  void setCursor(@Nullable Cursor value);

  /**
   * Font family of the element text. Multiple values have to be in decreasing
   * preference order and separated by comma.
   *
   */
  @JSProperty("fontFamily")
  @Nullable
  String getFontFamily();

  /**
   * Font family of the element text. Multiple values have to be in decreasing
   * preference order and separated by comma.
   *
   */
  @JSProperty("fontFamily")
  void setFontFamily(@Nullable String value);

  /**
   * Font size of the element text.
   *
   */
  @JSProperty("fontSize")
  @Nullable
  String getFontSize();

  /**
   * Font size of the element text.
   *
   */
  @JSProperty("fontSize")
  void setFontSize(@Nullable String value);

  /**
   * Font weight of the element text.
   *
   */
  @JSProperty("fontWeight")
  @Nullable
  String getFontWeight();

  /**
   * Font weight of the element text.
   *
   */
  @JSProperty("fontWeight")
  void setFontWeight(@Nullable String value);

  /**
   * Height of the element.
   *
   */
  @JSProperty("height")
  double getHeight();

  /**
   * Height of the element.
   *
   */
  @JSProperty("height")
  void setHeight(double value);

  /**
   * Width of the element border.
   *
   */
  @JSProperty("lineWidth")
  double getLineWidth();

  /**
   * Width of the element border.
   *
   */
  @JSProperty("lineWidth")
  void setLineWidth(double value);

  /**
   * Opacity of the element.
   *
   */
  @JSProperty("opacity")
  double getOpacity();

  /**
   * Opacity of the element.
   *
   */
  @JSProperty("opacity")
  void setOpacity(double value);

  /**
   * Space around the element content.
   *
   */
  @JSProperty("padding")
  @Nullable
  String getPadding();

  /**
   * Space around the element content.
   *
   */
  @JSProperty("padding")
  void setPadding(@Nullable String value);

  /**
   * Behaviour of the element when the mouse cursor rests over it.
   *
   */
  @JSProperty("pointerEvents")
  @Nullable
  String getPointerEvents();

  /**
   * Behaviour of the element when the mouse cursor rests over it.
   *
   */
  @JSProperty("pointerEvents")
  void setPointerEvents(@Nullable String value);

  /**
   * Positioning of the element.
   *
   */
  @JSProperty("position")
  @Nullable
  String getPosition();

  /**
   * Positioning of the element.
   *
   */
  @JSProperty("position")
  void setPosition(@Nullable String value);

  /**
   * Alignment of the element text.
   *
   */
  @JSProperty("textAlign")
  @Nullable
  String getTextAlign();

  /**
   * Alignment of the element text.
   *
   */
  @JSProperty("textAlign")
  void setTextAlign(@Nullable String value);

  /**
   * Additional decoration of the element text.
   *
   */
  @JSProperty("textDecoration")
  @Nullable
  String getTextDecoration();

  /**
   * Additional decoration of the element text.
   *
   */
  @JSProperty("textDecoration")
  void setTextDecoration(@Nullable String value);

  /**
   * Outline style of the element text.
   *
   */
  @JSProperty("textOutline")
  @Nullable
  String getTextOutline();

  /**
   * Outline style of the element text.
   *
   */
  @JSProperty("textOutline")
  void setTextOutline(@Nullable String value);

  /**
   * Line break style of the element text. Highcharts SVG elements support
   * <code>ellipsis</code> when a <code>width</code> is set.
   *
   */
  @JSProperty("textOverflow")
  @Nullable
  String getTextOverflow();

  /**
   * Line break style of the element text. Highcharts SVG elements support
   * <code>ellipsis</code> when a <code>width</code> is set.
   *
   */
  @JSProperty("textOverflow")
  void setTextOverflow(@Nullable String value);

  /**
   * Top spacing of the element relative to the parent element.
   *
   */
  @JSProperty("top")
  @Nullable
  String getTop();

  /**
   * Top spacing of the element relative to the parent element.
   *
   */
  @JSProperty("top")
  void setTop(@Nullable String value);

  /**
   * Animated transition of selected element properties.
   *
   */
  @JSProperty("transition")
  @Nullable
  String getTransition();

  /**
   * Animated transition of selected element properties.
   *
   */
  @JSProperty("transition")
  void setTransition(@Nullable String value);

  /**
   * Line break style of the element text.
   *
   */
  @JSProperty("whiteSpace")
  @Nullable
  String getWhiteSpace();

  /**
   * Line break style of the element text.
   *
   */
  @JSProperty("whiteSpace")
  void setWhiteSpace(@Nullable String value);

  /**
   * Width of the element.
   *
   */
  @JSProperty("width")
  double getWidth();

  /**
   * Width of the element.
   *
   */
  @JSProperty("width")
  void setWidth(double value);

  static Builder builder() {
    return new Builder();
  }

  abstract class Color extends JsEnum {
    public static final Color CONTRAST = JsEnum.of("contrast");
  }

  final class Builder {
    private final CSSObject object = Any.empty();

    private Builder() {
    }

    public CSSObject build() {
      return object;
    }

    public Builder set(String key, boolean value) {
      object.set(key, value);
      return this;
    }

    public Builder set(String key, double value) {
      object.set(key, value);
      return this;
    }

    public Builder set(String key, @Nullable String value) {
      object.set(key, value);
      return this;
    }

    /**
     * Background style for the element.
     *
     */
    public Builder background(@Nullable String value) {
      object.setBackground(value);
      return this;
    }

    /**
     * Background color of the element.
     *
     */
    public Builder backgroundColor(@Nullable String value) {
      object.setBackgroundColor(value);
      return this;
    }

    /**
     * Border style for the element.
     *
     */
    public Builder border(@Nullable String value) {
      object.setBorder(value);
      return this;
    }

    /**
     * Radius of the element border.
     *
     */
    public Builder borderRadius(double value) {
      object.setBorderRadius(value);
      return this;
    }

    /**
     * Color used in the element. The 'contrast' option is a Highcharts custom
     * property that results in black or white, depending on the background of
     * the element.
     *
     */
    public Builder color(@Nullable Color value) {
      object.setColor(value);
      return this;
    }

    /**
     * Color used in the element. The 'contrast' option is a Highcharts custom
     * property that results in black or white, depending on the background of
     * the element.
     *
     */
    public Builder color(@Nullable String value) {
      object.setColor(value);
      return this;
    }

    /**
     * Style of the mouse cursor when resting over the element.
     *
     */
    public Builder cursor(@Nullable Cursor value) {
      object.setCursor(value);
      return this;
    }

    /**
     * Font family of the element text. Multiple values have to be in decreasing
     * preference order and separated by comma.
     *
     */
    public Builder fontFamily(@Nullable String value) {
      object.setFontFamily(value);
      return this;
    }

    /**
     * Font size of the element text.
     *
     */
    public Builder fontSize(@Nullable String value) {
      object.setFontSize(value);
      return this;
    }

    /**
     * Font weight of the element text.
     *
     */
    public Builder fontWeight(@Nullable String value) {
      object.setFontWeight(value);
      return this;
    }

    /**
     * Height of the element.
     *
     */
    public Builder height(double value) {
      object.setHeight(value);
      return this;
    }

    /**
     * Width of the element border.
     *
     */
    public Builder lineWidth(double value) {
      object.setLineWidth(value);
      return this;
    }

    /**
     * Opacity of the element.
     *
     */
    public Builder opacity(double value) {
      object.setOpacity(value);
      return this;
    }

    /**
     * Space around the element content.
     *
     */
    public Builder padding(@Nullable String value) {
      object.setPadding(value);
      return this;
    }

    /**
     * Behaviour of the element when the mouse cursor rests over it.
     *
     */
    public Builder pointerEvents(@Nullable String value) {
      object.setPointerEvents(value);
      return this;
    }

    /**
     * Positioning of the element.
     *
     */
    public Builder position(@Nullable String value) {
      object.setPosition(value);
      return this;
    }

    /**
     * Alignment of the element text.
     *
     */
    public Builder textAlign(@Nullable String value) {
      object.setTextAlign(value);
      return this;
    }

    /**
     * Additional decoration of the element text.
     *
     */
    public Builder textDecoration(@Nullable String value) {
      object.setTextDecoration(value);
      return this;
    }

    /**
     * Outline style of the element text.
     *
     */
    public Builder textOutline(@Nullable String value) {
      object.setTextOutline(value);
      return this;
    }

    /**
     * Line break style of the element text. Highcharts SVG elements support
     * <code>ellipsis</code> when a <code>width</code> is set.
     *
     */
    public Builder textOverflow(@Nullable String value) {
      object.setTextOverflow(value);
      return this;
    }

    /**
     * Top spacing of the element relative to the parent element.
     *
     */
    public Builder top(@Nullable String value) {
      object.setTop(value);
      return this;
    }

    /**
     * Animated transition of selected element properties.
     *
     */
    public Builder transition(@Nullable String value) {
      object.setTransition(value);
      return this;
    }

    /**
     * Line break style of the element text.
     *
     */
    public Builder whiteSpace(@Nullable String value) {
      object.setWhiteSpace(value);
      return this;
    }

    /**
     * Width of the element.
     *
     */
    public Builder width(double value) {
      object.setWidth(value);
      return this;
    }
  }
}
