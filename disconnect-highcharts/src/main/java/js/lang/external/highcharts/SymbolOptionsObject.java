package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * Additional options, depending on the actual symbol drawn.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface SymbolOptionsObject extends Any {
  /**
   * The anchor X position for the <code>callout</code> symbol. This is where the chevron
   * points to.
   *
   */
  @JSProperty("anchorX")
  double getAnchorX();

  /**
   * The anchor X position for the <code>callout</code> symbol. This is where the chevron
   * points to.
   *
   */
  @JSProperty("anchorX")
  void setAnchorX(double value);

  /**
   * The anchor Y position for the <code>callout</code> symbol. This is where the chevron
   * points to.
   *
   */
  @JSProperty("anchorY")
  double getAnchorY();

  /**
   * The anchor Y position for the <code>callout</code> symbol. This is where the chevron
   * points to.
   *
   */
  @JSProperty("anchorY")
  void setAnchorY(double value);

  /**
   * The end angle of an <code>arc</code> symbol.
   *
   */
  @JSProperty("end")
  double getEnd();

  /**
   * The end angle of an <code>arc</code> symbol.
   *
   */
  @JSProperty("end")
  void setEnd(double value);

  /**
   * Whether to draw <code>arc</code> symbol open or closed.
   *
   */
  @JSProperty("open")
  boolean getOpen();

  /**
   * Whether to draw <code>arc</code> symbol open or closed.
   *
   */
  @JSProperty("open")
  void setOpen(boolean value);

  /**
   * The radius of an <code>arc</code> symbol, or the border radius for the <code>callout</code>
   * symbol.
   *
   */
  @JSProperty("r")
  double getR();

  /**
   * The radius of an <code>arc</code> symbol, or the border radius for the <code>callout</code>
   * symbol.
   *
   */
  @JSProperty("r")
  void setR(double value);

  /**
   * The start angle of an <code>arc</code> symbol.
   *
   */
  @JSProperty("start")
  double getStart();

  /**
   * The start angle of an <code>arc</code> symbol.
   *
   */
  @JSProperty("start")
  void setStart(double value);

  class Builder {
    private final SymbolOptionsObject object = Any.empty();

    public SymbolOptionsObject build() {
      return object;
    }

    /**
     * The anchor X position for the <code>callout</code> symbol. This is where the chevron
     * points to.
     *
     */
    public Builder anchorX(double value) {
      object.setAnchorX(value);
      return this;
    }

    /**
     * The anchor Y position for the <code>callout</code> symbol. This is where the chevron
     * points to.
     *
     */
    public Builder anchorY(double value) {
      object.setAnchorY(value);
      return this;
    }

    /**
     * The end angle of an <code>arc</code> symbol.
     *
     */
    public Builder end(double value) {
      object.setEnd(value);
      return this;
    }

    /**
     * Whether to draw <code>arc</code> symbol open or closed.
     *
     */
    public Builder open(boolean value) {
      object.setOpen(value);
      return this;
    }

    /**
     * The radius of an <code>arc</code> symbol, or the border radius for the <code>callout</code>
     * symbol.
     *
     */
    public Builder r(double value) {
      object.setR(value);
      return this;
    }

    /**
     * The start angle of an <code>arc</code> symbol.
     *
     */
    public Builder start(double value) {
      object.setStart(value);
      return this;
    }
  }
}
