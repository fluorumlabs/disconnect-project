package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown /* double */;
import js.util.collections.Array;
import org.teavm.jso.JSProperty;

/**
 * Time ticks.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface AxisTickPositionsArray extends Array<Unknown /* double */> {
  @JSProperty("info")
  @Nullable
  TimeTicksInfoObject getInfo();

  @JSProperty("info")
  void setInfo(@Nullable TimeTicksInfoObject value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final AxisTickPositionsArray object = Any.empty();

    private Builder() {
    }

    public AxisTickPositionsArray build() {
      return object;
    }

    public Builder info(@Nullable TimeTicksInfoObject value) {
      object.setInfo(value);
      return this;
    }
  }
}
