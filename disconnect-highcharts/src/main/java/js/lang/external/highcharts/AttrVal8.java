package js.lang.external.highcharts;

import js.extras.JsEnum;
import js.lang.Any;
import org.teavm.jso.JSBody;

public interface AttrVal8 extends Any {
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

  static AttrVal8.Builder builder() {
    return new AttrVal8.Builder();
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
    private final AttrVal8 object = Any.empty();

    private Builder() {
    }

    public AttrVal8 build() {
      return object;
    }

    public AttrVal8.Builder value0(Value0 value) {
      object.setValue0(value);
      return this;
    }

    public AttrVal8.Builder value1(double value) {
      object.setValue1(value);
      return this;
    }

    public AttrVal8.Builder value2(double value) {
      object.setValue2(value);
      return this;
    }

    public AttrVal8.Builder value3(double value) {
      object.setValue3(value);
      return this;
    }

    public AttrVal8.Builder value4(double value) {
      object.setValue4(value);
      return this;
    }

    public AttrVal8.Builder value5(double value) {
      object.setValue5(value);
      return this;
    }

    public AttrVal8.Builder value6(double value) {
      object.setValue6(value);
      return this;
    }

    public AttrVal8.Builder value7(double value) {
      object.setValue7(value);
      return this;
    }
  }
}
