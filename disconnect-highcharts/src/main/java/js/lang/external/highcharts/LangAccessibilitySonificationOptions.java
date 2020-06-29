package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Highmaps, Gantt) Language options for sonification.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface LangAccessibilitySonificationOptions extends Any {
  @JSProperty("playAsSoundButtonText")
  @Nullable
  String getPlayAsSoundButtonText();

  @JSProperty("playAsSoundButtonText")
  void setPlayAsSoundButtonText(@Nullable String value);

  @JSProperty("playAsSoundClickAnnouncement")
  @Nullable
  String getPlayAsSoundClickAnnouncement();

  @JSProperty("playAsSoundClickAnnouncement")
  void setPlayAsSoundClickAnnouncement(@Nullable String value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final LangAccessibilitySonificationOptions object = Any.empty();

    private Builder() {
    }

    public LangAccessibilitySonificationOptions build() {
      return object;
    }

    public Builder playAsSoundButtonText(@Nullable String value) {
      object.setPlayAsSoundButtonText(value);
      return this;
    }

    public Builder playAsSoundClickAnnouncement(@Nullable String value) {
      object.setPlayAsSoundClickAnnouncement(value);
      return this;
    }
  }
}
