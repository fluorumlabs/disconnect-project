package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * Additonal time tick information.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface TimeTicksInfoObject extends TimeNormalizedObject {
  @JSProperty("higherRanks")
  String[] getHigherRanks();

  @JSProperty("higherRanks")
  void setHigherRanks(String... value);

  @JSProperty("totalRange")
  double getTotalRange();

  @JSProperty("totalRange")
  void setTotalRange(double value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final TimeTicksInfoObject object = Any.empty();

    private Builder() {
    }

    public TimeTicksInfoObject build() {
      return object;
    }

    public Builder higherRanks(String... value) {
      object.setHigherRanks(value);
      return this;
    }

    public Builder totalRange(double value) {
      object.setTotalRange(value);
      return this;
    }
  }
}
