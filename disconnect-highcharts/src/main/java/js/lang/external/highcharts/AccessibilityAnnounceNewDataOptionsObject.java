package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Highmaps, Gantt) Options for announcing new data to
 * screen reader users. Useful for dynamic data applications and drilldown.
 *
 * Keep in mind that frequent announcements will not be useful to users, as they
 * won't have time to explore the new data. For these applications, consider
 * making snapshots of the data accessible, and do the announcements in batches.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface AccessibilityAnnounceNewDataOptionsObject extends Any {
  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Optional formatter callback for
   * the announcement. Receives up to three arguments. The first argument is
   * always an array of all series that received updates. If an announcement
   * is already queued, the series that received updates for that announcement
   * are also included in this array. The second argument is provided if
   * <code>chart.addSeries</code> was called, and there is a new series. In that case,
   * this argument is a reference to the new series. The third argument,
   * similarly, is provided if <code>series.addPoint</code> was called, and there is a
   * new point. In that case, this argument is a reference to the new point.
   *
   * The function should return a string with the text to announce to the
   * user. Return empty string to not announce anything. Return <code>false</code> to use
   * the default announcement format.
   *
   */
  @JSProperty("announcementFormatter")
  @Nullable
  AccessibilityAnnouncementFormatter getAnnouncementFormatter();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Optional formatter callback for
   * the announcement. Receives up to three arguments. The first argument is
   * always an array of all series that received updates. If an announcement
   * is already queued, the series that received updates for that announcement
   * are also included in this array. The second argument is provided if
   * <code>chart.addSeries</code> was called, and there is a new series. In that case,
   * this argument is a reference to the new series. The third argument,
   * similarly, is provided if <code>series.addPoint</code> was called, and there is a
   * new point. In that case, this argument is a reference to the new point.
   *
   * The function should return a string with the text to announce to the
   * user. Return empty string to not announce anything. Return <code>false</code> to use
   * the default announcement format.
   *
   */
  @JSProperty("announcementFormatter")
  void setAnnouncementFormatter(@Nullable AccessibilityAnnouncementFormatter value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Enable announcing new data to
   * screen reader users
   *
   */
  @JSProperty("enabled")
  boolean getEnabled();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Enable announcing new data to
   * screen reader users
   *
   */
  @JSProperty("enabled")
  void setEnabled(boolean value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Choose whether or not the
   * announcements should interrupt the screen reader. If not enabled, the
   * user will be notified once idle. It is recommended not to enable this
   * setting unless there is a specific reason to do so.
   *
   */
  @JSProperty("interruptUser")
  boolean getInterruptUser();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Choose whether or not the
   * announcements should interrupt the screen reader. If not enabled, the
   * user will be notified once idle. It is recommended not to enable this
   * setting unless there is a specific reason to do so.
   *
   */
  @JSProperty("interruptUser")
  void setInterruptUser(boolean value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Minimum interval between
   * announcements in milliseconds. If new data arrives before this amount of
   * time has passed, it is queued for announcement. If another new data event
   * happens while an announcement is queued, the queued announcement is
   * dropped, and the latest announcement is queued instead. Set to 0 to allow
   * all announcements, but be warned that frequent announcements are
   * disturbing to users.
   *
   */
  @JSProperty("minAnnounceInterval")
  double getMinAnnounceInterval();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Minimum interval between
   * announcements in milliseconds. If new data arrives before this amount of
   * time has passed, it is queued for announcement. If another new data event
   * happens while an announcement is queued, the queued announcement is
   * dropped, and the latest announcement is queued instead. Set to 0 to allow
   * all announcements, but be warned that frequent announcements are
   * disturbing to users.
   *
   */
  @JSProperty("minAnnounceInterval")
  void setMinAnnounceInterval(double value);

  class Builder {
    private final AccessibilityAnnounceNewDataOptionsObject object = Any.empty();

    public AccessibilityAnnounceNewDataOptionsObject build() {
      return object;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Optional formatter callback for
     * the announcement. Receives up to three arguments. The first argument is
     * always an array of all series that received updates. If an announcement
     * is already queued, the series that received updates for that announcement
     * are also included in this array. The second argument is provided if
     * <code>chart.addSeries</code> was called, and there is a new series. In that case,
     * this argument is a reference to the new series. The third argument,
     * similarly, is provided if <code>series.addPoint</code> was called, and there is a
     * new point. In that case, this argument is a reference to the new point.
     *
     * The function should return a string with the text to announce to the
     * user. Return empty string to not announce anything. Return <code>false</code> to use
     * the default announcement format.
     *
     */
    public Builder announcementFormatter(@Nullable AccessibilityAnnouncementFormatter value) {
      object.setAnnouncementFormatter(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Enable announcing new data to
     * screen reader users
     *
     */
    public Builder enabled(boolean value) {
      object.setEnabled(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Choose whether or not the
     * announcements should interrupt the screen reader. If not enabled, the
     * user will be notified once idle. It is recommended not to enable this
     * setting unless there is a specific reason to do so.
     *
     */
    public Builder interruptUser(boolean value) {
      object.setInterruptUser(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Minimum interval between
     * announcements in milliseconds. If new data arrives before this amount of
     * time has passed, it is queued for announcement. If another new data event
     * happens while an announcement is queued, the queued announcement is
     * dropped, and the latest announcement is queued instead. Set to 0 to allow
     * all announcements, but be warned that frequent announcements are
     * disturbing to users.
     *
     */
    public Builder minAnnounceInterval(double value) {
      object.setMinAnnounceInterval(value);
      return this;
    }
  }
}
