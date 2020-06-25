package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highmaps) General options for the map navigation buttons. Individual options
 * can be given from the mapNavigation.buttons option set.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface MapNavigationButtonOptions extends Any {
  /**
   * (Highmaps) The alignment of the navigation buttons.
   *
   */
  @JSProperty("align")
  @Nullable
  Align getAlign();

  /**
   * (Highmaps) The alignment of the navigation buttons.
   *
   */
  @JSProperty("align")
  void setAlign(@Nullable Align value);

  /**
   * (Highmaps) What box to align the buttons to. Possible values are
   * <code>plotBox</code> and <code>spacingBox</code>.
   *
   */
  @JSProperty("alignTo")
  @Nullable
  AlignTo getAlignTo();

  /**
   * (Highmaps) What box to align the buttons to. Possible values are
   * <code>plotBox</code> and <code>spacingBox</code>.
   *
   */
  @JSProperty("alignTo")
  void setAlignTo(@Nullable AlignTo value);

  /**
   * (Highmaps) The pixel height of the map navigation buttons.
   *
   */
  @JSProperty("height")
  double getHeight();

  /**
   * (Highmaps) The pixel height of the map navigation buttons.
   *
   */
  @JSProperty("height")
  void setHeight(double value);

  /**
   * (Highmaps) Padding for the navigation buttons.
   *
   */
  @JSProperty("padding")
  double getPadding();

  /**
   * (Highmaps) Padding for the navigation buttons.
   *
   */
  @JSProperty("padding")
  void setPadding(double value);

  /**
   * (Highmaps) Text styles for the map navigation buttons.
   *
   */
  @JSProperty("style")
  @Nullable
  CSSObject getStyle();

  /**
   * (Highmaps) Text styles for the map navigation buttons.
   *
   */
  @JSProperty("style")
  void setStyle(@Nullable CSSObject value);

  /**
   * (Highmaps) A configuration object for the button theme. The object
   * accepts SVG properties like <code>stroke-width</code>, <code>stroke</code> and <code>fill</code>.
   * Tri-state button styles are supported by the <code>states.hover</code> and
   * <code>states.select</code> objects.
   *
   */
  @JSProperty("theme")
  @Nullable
  SVGAttributes getTheme();

  /**
   * (Highmaps) A configuration object for the button theme. The object
   * accepts SVG properties like <code>stroke-width</code>, <code>stroke</code> and <code>fill</code>.
   * Tri-state button styles are supported by the <code>states.hover</code> and
   * <code>states.select</code> objects.
   *
   */
  @JSProperty("theme")
  void setTheme(@Nullable SVGAttributes value);

  /**
   * (Highmaps) The vertical alignment of the buttons. Individual alignment
   * can be adjusted by each button's <code>y</code> offset.
   *
   */
  @JSProperty("verticalAlign")
  @Nullable
  VerticalAlign getVerticalAlign();

  /**
   * (Highmaps) The vertical alignment of the buttons. Individual alignment
   * can be adjusted by each button's <code>y</code> offset.
   *
   */
  @JSProperty("verticalAlign")
  void setVerticalAlign(@Nullable VerticalAlign value);

  /**
   * (Highmaps) The width of the map navigation buttons.
   *
   */
  @JSProperty("width")
  double getWidth();

  /**
   * (Highmaps) The width of the map navigation buttons.
   *
   */
  @JSProperty("width")
  void setWidth(double value);

  /**
   * (Highmaps) The X offset of the buttons relative to its <code>align</code> setting.
   *
   */
  @JSProperty("x")
  double getX();

  /**
   * (Highmaps) The X offset of the buttons relative to its <code>align</code> setting.
   *
   */
  @JSProperty("x")
  void setX(double value);

  class Builder {
    private final MapNavigationButtonOptions object = Any.empty();

    public MapNavigationButtonOptions build() {
      return object;
    }

    /**
     * (Highmaps) The alignment of the navigation buttons.
     *
     */
    public Builder align(@Nullable Align value) {
      object.setAlign(value);
      return this;
    }

    /**
     * (Highmaps) What box to align the buttons to. Possible values are
     * <code>plotBox</code> and <code>spacingBox</code>.
     *
     */
    public Builder alignTo(@Nullable AlignTo value) {
      object.setAlignTo(value);
      return this;
    }

    /**
     * (Highmaps) The pixel height of the map navigation buttons.
     *
     */
    public Builder height(double value) {
      object.setHeight(value);
      return this;
    }

    /**
     * (Highmaps) Padding for the navigation buttons.
     *
     */
    public Builder padding(double value) {
      object.setPadding(value);
      return this;
    }

    /**
     * (Highmaps) Text styles for the map navigation buttons.
     *
     */
    public Builder style(@Nullable CSSObject value) {
      object.setStyle(value);
      return this;
    }

    /**
     * (Highmaps) A configuration object for the button theme. The object
     * accepts SVG properties like <code>stroke-width</code>, <code>stroke</code> and <code>fill</code>.
     * Tri-state button styles are supported by the <code>states.hover</code> and
     * <code>states.select</code> objects.
     *
     */
    public Builder theme(@Nullable SVGAttributes value) {
      object.setTheme(value);
      return this;
    }

    /**
     * (Highmaps) The vertical alignment of the buttons. Individual alignment
     * can be adjusted by each button's <code>y</code> offset.
     *
     */
    public Builder verticalAlign(@Nullable VerticalAlign value) {
      object.setVerticalAlign(value);
      return this;
    }

    /**
     * (Highmaps) The width of the map navigation buttons.
     *
     */
    public Builder width(double value) {
      object.setWidth(value);
      return this;
    }

    /**
     * (Highmaps) The X offset of the buttons relative to its <code>align</code> setting.
     *
     */
    public Builder x(double value) {
      object.setX(value);
      return this;
    }
  }
}
