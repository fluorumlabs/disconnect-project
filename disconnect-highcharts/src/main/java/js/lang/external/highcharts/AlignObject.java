package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * Options to align the element relative to the chart or another box.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface AlignObject extends Any {
  /**
   * Horizontal alignment. Can be one of <code>left</code>, <code>center</code> and <code>right</code>.
   *
   */
  @JSProperty("align")
  @Nullable
  Align getAlign();

  /**
   * Horizontal alignment. Can be one of <code>left</code>, <code>center</code> and <code>right</code>.
   *
   */
  @JSProperty("align")
  void setAlign(@Nullable Align value);

  /**
   * Use the <code>transform</code> attribute with translateX and translateY custom
   * attributes to align this elements rather than <code>x</code> and <code>y</code> attributes.
   *
   */
  @JSProperty("alignByTranslate")
  boolean getAlignByTranslate();

  /**
   * Use the <code>transform</code> attribute with translateX and translateY custom
   * attributes to align this elements rather than <code>x</code> and <code>y</code> attributes.
   *
   */
  @JSProperty("alignByTranslate")
  void setAlignByTranslate(boolean value);

  /**
   * Vertical alignment. Can be one of <code>top</code>, <code>middle</code> and <code>bottom</code>.
   *
   */
  @JSProperty("verticalAlign")
  @Nullable
  VerticalAlign getVerticalAlign();

  /**
   * Vertical alignment. Can be one of <code>top</code>, <code>middle</code> and <code>bottom</code>.
   *
   */
  @JSProperty("verticalAlign")
  void setVerticalAlign(@Nullable VerticalAlign value);

  /**
   * Horizontal pixel offset from alignment.
   *
   */
  @JSProperty("x")
  double getX();

  /**
   * Horizontal pixel offset from alignment.
   *
   */
  @JSProperty("x")
  void setX(double value);

  /**
   * Vertical pixel offset from alignment.
   *
   */
  @JSProperty("y")
  double getY();

  /**
   * Vertical pixel offset from alignment.
   *
   */
  @JSProperty("y")
  void setY(double value);

  class Builder {
    private final AlignObject object = Any.empty();

    public AlignObject build() {
      return object;
    }

    /**
     * Horizontal alignment. Can be one of <code>left</code>, <code>center</code> and <code>right</code>.
     *
     */
    public Builder align(@Nullable Align value) {
      object.setAlign(value);
      return this;
    }

    /**
     * Use the <code>transform</code> attribute with translateX and translateY custom
     * attributes to align this elements rather than <code>x</code> and <code>y</code> attributes.
     *
     */
    public Builder alignByTranslate(boolean value) {
      object.setAlignByTranslate(value);
      return this;
    }

    /**
     * Vertical alignment. Can be one of <code>top</code>, <code>middle</code> and <code>bottom</code>.
     *
     */
    public Builder verticalAlign(@Nullable VerticalAlign value) {
      object.setVerticalAlign(value);
      return this;
    }

    /**
     * Horizontal pixel offset from alignment.
     *
     */
    public Builder x(double value) {
      object.setX(value);
      return this;
    }

    /**
     * Vertical pixel offset from alignment.
     *
     */
    public Builder y(double value) {
      object.setY(value);
      return this;
    }
  }
}
