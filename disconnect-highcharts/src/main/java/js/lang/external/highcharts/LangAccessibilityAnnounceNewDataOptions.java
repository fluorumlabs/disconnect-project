package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Highmaps, Gantt) Default announcement for new data in
 * charts. If addPoint or addSeries is used, and only one series/point is added,
 * the <code>newPointAnnounce</code> and <code>newSeriesAnnounce</code> strings are used. The
 * <code>...Single</code> versions will be used if there is only one chart on the page, and
 * the <code>...Multiple</code> versions will be used if there are multiple charts on the
 * page. For all other new data events, the <code>newDataAnnounce</code> string will be
 * used.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface LangAccessibilityAnnounceNewDataOptions extends Any {
  @JSProperty("newDataAnnounce")
  @Nullable
  String getNewDataAnnounce();

  @JSProperty("newDataAnnounce")
  void setNewDataAnnounce(@Nullable String value);

  @JSProperty("newPointAnnounceMultiple")
  @Nullable
  String getNewPointAnnounceMultiple();

  @JSProperty("newPointAnnounceMultiple")
  void setNewPointAnnounceMultiple(@Nullable String value);

  @JSProperty("newPointAnnounceSingle")
  @Nullable
  String getNewPointAnnounceSingle();

  @JSProperty("newPointAnnounceSingle")
  void setNewPointAnnounceSingle(@Nullable String value);

  @JSProperty("newSeriesAnnounceMultiple")
  @Nullable
  String getNewSeriesAnnounceMultiple();

  @JSProperty("newSeriesAnnounceMultiple")
  void setNewSeriesAnnounceMultiple(@Nullable String value);

  @JSProperty("newSeriesAnnounceSingle")
  @Nullable
  String getNewSeriesAnnounceSingle();

  @JSProperty("newSeriesAnnounceSingle")
  void setNewSeriesAnnounceSingle(@Nullable String value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final LangAccessibilityAnnounceNewDataOptions object = Any.empty();

    private Builder() {
    }

    public LangAccessibilityAnnounceNewDataOptions build() {
      return object;
    }

    public Builder newDataAnnounce(@Nullable String value) {
      object.setNewDataAnnounce(value);
      return this;
    }

    public Builder newPointAnnounceMultiple(@Nullable String value) {
      object.setNewPointAnnounceMultiple(value);
      return this;
    }

    public Builder newPointAnnounceSingle(@Nullable String value) {
      object.setNewPointAnnounceSingle(value);
      return this;
    }

    public Builder newSeriesAnnounceMultiple(@Nullable String value) {
      object.setNewSeriesAnnounceMultiple(value);
      return this;
    }

    public Builder newSeriesAnnounceSingle(@Nullable String value) {
      object.setNewSeriesAnnounceSingle(value);
      return this;
    }
  }
}
