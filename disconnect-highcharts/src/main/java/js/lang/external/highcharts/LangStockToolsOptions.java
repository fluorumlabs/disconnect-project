package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) Configure the stockTools GUI titles(hints) in the chart. Requires
 * the <code>stock-tools.js</code> module to be loaded.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface LangStockToolsOptions extends Any {
  @JSProperty("gui")
  @Nullable
  LangStockToolsGuiOptions getGui();

  @JSProperty("gui")
  void setGui(@Nullable LangStockToolsGuiOptions value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final LangStockToolsOptions object = Any.empty();

    private Builder() {
    }

    public LangStockToolsOptions build() {
      return object;
    }

    public Builder gui(@Nullable LangStockToolsGuiOptions value) {
      object.setGui(value);
      return this;
    }
  }
}
