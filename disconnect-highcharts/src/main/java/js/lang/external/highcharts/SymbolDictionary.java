package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.JsFunction;
import org.teavm.jso.JSIndexer;
import org.teavm.jso.JSProperty;

/**
 * An extendable collection of functions for defining symbol paths. Symbols are
 * used internally for point markers, button and label borders and backgrounds,
 * or custom shapes. Extendable by adding to SVGRenderer#symbols.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface SymbolDictionary extends Any {
  @JSIndexer
  @Nullable
  JsFunction get(String key);

  @JSIndexer
  void set(String key, @Nullable JsFunction value);

  @JSProperty("arc")
  @Nullable
  JsFunction getArc();

  @JSProperty("arc")
  void setArc(@Nullable JsFunction value);

  @JSProperty("callout")
  @Nullable
  JsFunction getCallout();

  @JSProperty("callout")
  void setCallout(@Nullable JsFunction value);

  @JSProperty("circle")
  @Nullable
  JsFunction getCircle();

  @JSProperty("circle")
  void setCircle(@Nullable JsFunction value);

  @JSProperty("diamond")
  @Nullable
  JsFunction getDiamond();

  @JSProperty("diamond")
  void setDiamond(@Nullable JsFunction value);

  @JSProperty("square")
  @Nullable
  JsFunction getSquare();

  @JSProperty("square")
  void setSquare(@Nullable JsFunction value);

  @JSProperty("triangle")
  @Nullable
  JsFunction getTriangle();

  @JSProperty("triangle")
  void setTriangle(@Nullable JsFunction value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final SymbolDictionary object = Any.empty();

    private Builder() {
    }

    public SymbolDictionary build() {
      return object;
    }

    public Builder set(String key, @Nullable JsFunction value) {
      object.set(key, value);
      return this;
    }

    public Builder arc(@Nullable JsFunction value) {
      object.setArc(value);
      return this;
    }

    public Builder callout(@Nullable JsFunction value) {
      object.setCallout(value);
      return this;
    }

    public Builder circle(@Nullable JsFunction value) {
      object.setCircle(value);
      return this;
    }

    public Builder diamond(@Nullable JsFunction value) {
      object.setDiamond(value);
      return this;
    }

    public Builder square(@Nullable JsFunction value) {
      object.setSquare(value);
      return this;
    }

    public Builder triangle(@Nullable JsFunction value) {
      object.setTriangle(value);
      return this;
    }
  }
}
