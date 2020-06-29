package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface StockToolsGuiDefinitionsVerticalLabelsVerticalLabelOptions extends Any {
  /**
   * (Highstock) A predefined background symbol for the button.
   *
   */
  @JSProperty("symbol")
  @Nullable
  String getSymbol();

  /**
   * (Highstock) A predefined background symbol for the button.
   *
   */
  @JSProperty("symbol")
  void setSymbol(@Nullable String value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final StockToolsGuiDefinitionsVerticalLabelsVerticalLabelOptions object = Any.empty();

    private Builder() {
    }

    public StockToolsGuiDefinitionsVerticalLabelsVerticalLabelOptions build() {
      return object;
    }

    /**
     * (Highstock) A predefined background symbol for the button.
     *
     */
    public Builder symbol(@Nullable String value) {
      object.setSymbol(value);
      return this;
    }
  }
}
