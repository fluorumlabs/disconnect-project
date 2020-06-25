package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * Options for <code>dataSorting</code>.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface DataSortingOptionsObject extends Any {
  /**
   * Enable or disable data sorting for the series.
   *
   */
  @JSProperty("enabled")
  boolean getEnabled();

  /**
   * Enable or disable data sorting for the series.
   *
   */
  @JSProperty("enabled")
  void setEnabled(boolean value);

  /**
   * Whether to allow matching points by name in an update.
   *
   */
  @JSProperty("matchByName")
  boolean getMatchByName();

  /**
   * Whether to allow matching points by name in an update.
   *
   */
  @JSProperty("matchByName")
  void setMatchByName(boolean value);

  /**
   * Determines what data value should be used to sort by.
   *
   */
  @JSProperty("sortKey")
  @Nullable
  String getSortKey();

  /**
   * Determines what data value should be used to sort by.
   *
   */
  @JSProperty("sortKey")
  void setSortKey(@Nullable String value);

  class Builder {
    private final DataSortingOptionsObject object = Any.empty();

    public DataSortingOptionsObject build() {
      return object;
    }

    /**
     * Enable or disable data sorting for the series.
     *
     */
    public Builder enabled(boolean value) {
      object.setEnabled(value);
      return this;
    }

    /**
     * Whether to allow matching points by name in an update.
     *
     */
    public Builder matchByName(boolean value) {
      object.setMatchByName(value);
      return this;
    }

    /**
     * Determines what data value should be used to sort by.
     *
     */
    public Builder sortKey(@Nullable String value) {
      object.setSortKey(value);
      return this;
    }
  }
}
