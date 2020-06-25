package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.extras.JsEnum;
import js.lang.Any;
import js.lang.Unknown;
import org.teavm.jso.JSIndexer;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * An object of key-value pairs for SVG attributes. Attributes in Highcharts
 * elements for the most parts correspond to SVG, but some are specific to
 * Highcharts, like <code>zIndex</code>, <code>rotation</code>, <code>rotationOriginX</code>, <code>rotationOriginY</code>,
 * <code>translateX</code>, <code>translateY</code>, <code>scaleX</code> and <code>scaleY</code>. SVG attributes containing
 * a hyphen are <em>not</em> camel-cased, they should be quoted to preserve the hyphen.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface SVGAttributes extends Any {
  @JSIndexer
  Any get(String key);

  @JSIndexer
  void set(String key, Any value);

  @JSProperty("d")
  @Nullable
  Unknown /* ( string | SVGPathArray ) */ getD();

  @JSProperty("d")
  void setD(double[] value);

  @JSProperty("d")
  void setD(@Nullable D value);

  @JSProperty("d")
  void setD(@Nullable String value);

  @JSProperty("fill")
  @Nullable
  Unknown /* ( ColorString | GradientColorObject | PatternObject ) */ getFill();

  @JSProperty("fill")
  void setFill(@Nullable PatternObject value);

  @JSProperty("fill")
  void setFill(@Nullable String value);

  @JSProperty("fill")
  void setFill(@Nullable GradientColorObject value);

  @JSProperty("inverted")
  boolean getInverted();

  @JSProperty("inverted")
  void setInverted(boolean value);

  @JSProperty("matrix")
  @Nullable
  double[] getMatrix();

  @JSProperty("matrix")
  void setMatrix(double[] value);

  @JSProperty("rotation")
  double getRotation();

  @JSProperty("rotation")
  void setRotation(double value);

  @JSProperty("rotationOriginX")
  double getRotationOriginX();

  @JSProperty("rotationOriginX")
  void setRotationOriginX(double value);

  @JSProperty("rotationOriginY")
  double getRotationOriginY();

  @JSProperty("rotationOriginY")
  void setRotationOriginY(double value);

  @JSProperty("scaleX")
  double getScaleX();

  @JSProperty("scaleX")
  void setScaleX(double value);

  @JSProperty("scaleY")
  double getScaleY();

  @JSProperty("scaleY")
  void setScaleY(double value);

  @JSProperty("stroke")
  @Nullable
  Unknown /* ( ColorString | GradientColorObject | PatternObject ) */ getStroke();

  @JSProperty("stroke")
  void setStroke(@Nullable PatternObject value);

  @JSProperty("stroke")
  void setStroke(@Nullable String value);

  @JSProperty("stroke")
  void setStroke(@Nullable GradientColorObject value);

  @JSProperty("style")
  @Nullable
  Unknown /* ( string | CSSObject ) */ getStyle();

  @JSProperty("style")
  void setStyle(@Nullable CSSObject value);

  @JSProperty("style")
  void setStyle(@Nullable String value);

  @JSProperty("translateX")
  double getTranslateX();

  @JSProperty("translateX")
  void setTranslateX(double value);

  @JSProperty("translateY")
  double getTranslateY();

  @JSProperty("translateY")
  void setTranslateY(double value);

  @JSProperty("zIndex")
  double getZIndex();

  @JSProperty("zIndex")
  void setZIndex(double value);

  abstract class D extends JsEnum {
    public static final D A = JsEnum.of("a");

    public static final D C = JsEnum.of("c");

    public static final D H = JsEnum.of("h");

    public static final D L = JsEnum.of("l");

    public static final D M = JsEnum.of("m");

    public static final D Q = JsEnum.of("q");

    public static final D S = JsEnum.of("s");

    public static final D T = JsEnum.of("t");

    public static final D V = JsEnum.of("v");

    public static final D Z = JsEnum.of("z");

    public static final D CAPITAL_A = JsEnum.of("A");

    public static final D CAPITAL_C = JsEnum.of("C");

    public static final D CAPITAL_H = JsEnum.of("H");

    public static final D CAPITAL_L = JsEnum.of("L");

    public static final D CAPITAL_M = JsEnum.of("M");

    public static final D CAPITAL_Q = JsEnum.of("Q");

    public static final D CAPITAL_S = JsEnum.of("S");

    public static final D CAPITAL_T = JsEnum.of("T");

    public static final D CAPITAL_V = JsEnum.of("V");

    public static final D CAPITAL_Z = JsEnum.of("Z");
  }

  class Builder {
    private final SVGAttributes object = Any.empty();

    public SVGAttributes build() {
      return object;
    }

    public Builder set(String key, Any value) {
      object.set(key, value);
      return this;
    }

    public Builder d(double[] value) {
      object.setD(value);
      return this;
    }

    public Builder d(@Nullable D value) {
      object.setD(value);
      return this;
    }

    public Builder d(@Nullable String value) {
      object.setD(value);
      return this;
    }

    public Builder fill(@Nullable PatternObject value) {
      object.setFill(value);
      return this;
    }

    public Builder fill(@Nullable String value) {
      object.setFill(value);
      return this;
    }

    public Builder fill(@Nullable GradientColorObject value) {
      object.setFill(value);
      return this;
    }

    public Builder inverted(boolean value) {
      object.setInverted(value);
      return this;
    }

    public Builder matrix(double[] value) {
      object.setMatrix(value);
      return this;
    }

    public Builder rotation(double value) {
      object.setRotation(value);
      return this;
    }

    public Builder rotationOriginX(double value) {
      object.setRotationOriginX(value);
      return this;
    }

    public Builder rotationOriginY(double value) {
      object.setRotationOriginY(value);
      return this;
    }

    public Builder scaleX(double value) {
      object.setScaleX(value);
      return this;
    }

    public Builder scaleY(double value) {
      object.setScaleY(value);
      return this;
    }

    public Builder stroke(@Nullable PatternObject value) {
      object.setStroke(value);
      return this;
    }

    public Builder stroke(@Nullable String value) {
      object.setStroke(value);
      return this;
    }

    public Builder stroke(@Nullable GradientColorObject value) {
      object.setStroke(value);
      return this;
    }

    public Builder style(@Nullable CSSObject value) {
      object.setStyle(value);
      return this;
    }

    public Builder style(@Nullable String value) {
      object.setStyle(value);
      return this;
    }

    public Builder translateX(double value) {
      object.setTranslateX(value);
      return this;
    }

    public Builder translateY(double value) {
      object.setTranslateY(value);
      return this;
    }

    public Builder zIndex(double value) {
      object.setZIndex(value);
      return this;
    }
  }
}
