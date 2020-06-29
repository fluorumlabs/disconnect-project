package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown /* ( DefsArrowOptions | SVGDefinitionObject ) */;
import js.lang.Unknown /* ( DefsReverseArrowOptions | SVGDefinitionObject ) */;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Highmaps, Gantt) Styled mode only. Configuration
 * object for adding SVG definitions for reusable elements. See gradients,
 * shadows and patterns for more information and code examples.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface DefsOptions extends Any {
  @JSProperty("arrow")
  @Nullable
  Unknown /* ( DefsArrowOptions | SVGDefinitionObject ) */ getArrow();

  @JSProperty("arrow")
  void setArrow(@Nullable DefsArrowOptions value);

  @JSProperty("arrow")
  void setArrow(@Nullable SVGDefinitionObject value);

  @JSBody(
      script = "return this['reverse-arrow']"
  )
  @Nullable
  Unknown /* ( DefsReverseArrowOptions | SVGDefinitionObject ) */ getReverseArrow();

  @JSBody(
      params = "value",
      script = "this['reverse-arrow'] = value"
  )
  void setReverseArrow(@Nullable DefsReverseArrowOptions value);

  @JSBody(
      params = "value",
      script = "this['reverse-arrow'] = value"
  )
  void setReverseArrow(@Nullable SVGDefinitionObject value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final DefsOptions object = Any.empty();

    private Builder() {
    }

    public DefsOptions build() {
      return object;
    }

    public Builder arrow(@Nullable DefsArrowOptions value) {
      object.setArrow(value);
      return this;
    }

    public Builder arrow(@Nullable SVGDefinitionObject value) {
      object.setArrow(value);
      return this;
    }

    public Builder reverseArrow(@Nullable DefsReverseArrowOptions value) {
      object.setReverseArrow(value);
      return this;
    }

    public Builder reverseArrow(@Nullable SVGDefinitionObject value) {
      object.setReverseArrow(value);
      return this;
    }
  }
}
