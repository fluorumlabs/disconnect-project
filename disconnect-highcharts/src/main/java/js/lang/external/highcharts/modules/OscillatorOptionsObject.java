package js.lang.external.highcharts.modules;

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
    module = "highcharts/es-modules/masters/modules/sonification.src.js"
)
public interface OscillatorOptionsObject extends Any {
  /**
   * The waveform shape to use for oscillator instruments. Defaults to
   * <code>sine</code>.
   *
   */
  @JSProperty("waveformShape")
  @Nullable
  String getWaveformShape();

  /**
   * The waveform shape to use for oscillator instruments. Defaults to
   * <code>sine</code>.
   *
   */
  @JSProperty("waveformShape")
  void setWaveformShape(@Nullable String value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final OscillatorOptionsObject object = Any.empty();

    private Builder() {
    }

    public OscillatorOptionsObject build() {
      return object;
    }

    /**
     * The waveform shape to use for oscillator instruments. Defaults to
     * <code>sine</code>.
     *
     */
    public Builder waveformShape(@Nullable String value) {
      object.setWaveformShape(value);
      return this;
    }
  }
}
