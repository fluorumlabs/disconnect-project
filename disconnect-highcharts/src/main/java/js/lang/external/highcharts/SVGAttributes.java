package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.extras.JsEnum;
import js.lang.Any;
import js.lang.Unknown;
import org.teavm.jso.JSBody;
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
    version = "^8.1.2"
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
  void setD(D8... value);

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
  void setMatrix(double... value);

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

  static Builder builder() {
    return new Builder();
  }

  interface D8 extends Any {
    @JSBody(
        script = "return this[0]"
    )
    Value0 getValue0();

    @JSBody(
        params = "value",
        script = "this[0] = value"
    )
    void setValue0(Value0 value);

    @JSBody(
        script = "return this[1]"
    )
    double getValue1();

    @JSBody(
        params = "value",
        script = "this[1] = value"
    )
    void setValue1(double value);

    @JSBody(
        script = "return this[2]"
    )
    double getValue2();

    @JSBody(
        params = "value",
        script = "this[2] = value"
    )
    void setValue2(double value);

    @JSBody(
        script = "return this[3]"
    )
    double getValue3();

    @JSBody(
        params = "value",
        script = "this[3] = value"
    )
    void setValue3(double value);

    @JSBody(
        script = "return this[4]"
    )
    double getValue4();

    @JSBody(
        params = "value",
        script = "this[4] = value"
    )
    void setValue4(double value);

    @JSBody(
        script = "return this[5]"
    )
    double getValue5();

    @JSBody(
        params = "value",
        script = "this[5] = value"
    )
    void setValue5(double value);

    @JSBody(
        script = "return this[6]"
    )
    double getValue6();

    @JSBody(
        params = "value",
        script = "this[6] = value"
    )
    void setValue6(double value);

    @JSBody(
        script = "return this[7]"
    )
    double getValue7();

    @JSBody(
        params = "value",
        script = "this[7] = value"
    )
    void setValue7(double value);

    static D8.Builder builder() {
      return new D8.Builder();
    }

    abstract class Value0 extends JsEnum {
      public static final Value0 A = JsEnum.of("a");

      public static final Value0 C = JsEnum.of("c");

      public static final Value0 H = JsEnum.of("h");

      public static final Value0 L = JsEnum.of("l");

      public static final Value0 M = JsEnum.of("m");

      public static final Value0 Q = JsEnum.of("q");

      public static final Value0 S = JsEnum.of("s");

      public static final Value0 T = JsEnum.of("t");

      public static final Value0 V = JsEnum.of("v");

      public static final Value0 Z = JsEnum.of("z");

      public static final Value0 CAPITAL_A = JsEnum.of("A");

      public static final Value0 CAPITAL_C = JsEnum.of("C");

      public static final Value0 CAPITAL_H = JsEnum.of("H");

      public static final Value0 CAPITAL_L = JsEnum.of("L");

      public static final Value0 CAPITAL_M = JsEnum.of("M");

      public static final Value0 CAPITAL_Q = JsEnum.of("Q");

      public static final Value0 CAPITAL_S = JsEnum.of("S");

      public static final Value0 CAPITAL_T = JsEnum.of("T");

      public static final Value0 CAPITAL_V = JsEnum.of("V");

      public static final Value0 CAPITAL_Z = JsEnum.of("Z");
    }

    final class Builder {
      private final D8 object = Any.empty();

      private Builder() {
      }

      public D8 build() {
        return object;
      }

      public D8.Builder value0(Value0 value) {
        object.setValue0(value);
        return this;
      }

      public D8.Builder value1(double value) {
        object.setValue1(value);
        return this;
      }

      public D8.Builder value2(double value) {
        object.setValue2(value);
        return this;
      }

      public D8.Builder value3(double value) {
        object.setValue3(value);
        return this;
      }

      public D8.Builder value4(double value) {
        object.setValue4(value);
        return this;
      }

      public D8.Builder value5(double value) {
        object.setValue5(value);
        return this;
      }

      public D8.Builder value6(double value) {
        object.setValue6(value);
        return this;
      }

      public D8.Builder value7(double value) {
        object.setValue7(value);
        return this;
      }
    }
  }

  final class Builder {
    private final SVGAttributes object = Any.empty();

    private Builder() {
    }

    public SVGAttributes build() {
      return object;
    }

    public Builder set(String key, Any value) {
      object.set(key, value);
      return this;
    }

    public Builder d(D8... value) {
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

    public Builder matrix(double... value) {
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
