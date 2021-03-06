package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown /* ( ColorString | GradientColorObject | PatternObject ) */;
import org.teavm.jso.JSProperty;

/**
 * (Highstock, Gantt) The scrollbar is a means of panning over the X axis of a
 * stock chart. Scrollbars can also be applied to other types of axes.
 *
 * Another approach to scrollable charts is the chart.scrollablePlotArea option
 * that is especially suitable for simpler cartesian charts on mobile.
 *
 * In styled mode, all the presentational options for the scrollbar are replaced
 * by the classes <code>.highcharts-scrollbar-thumb</code>, <code>.highcharts-scrollbar-arrow</code>,
 * <code>.highcharts-scrollbar-button</code>, <code>.highcharts-scrollbar-rifles</code> and
 * <code>.highcharts-scrollbar-track</code>.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface ScrollbarOptions extends Any {
  /**
   * (Highstock, Gantt) The background color of the scrollbar itself.
   *
   */
  @JSProperty("barBackgroundColor")
  @Nullable
  Unknown /* ( ColorString | GradientColorObject | PatternObject ) */ getBarBackgroundColor();

  /**
   * (Highstock, Gantt) The background color of the scrollbar itself.
   *
   */
  @JSProperty("barBackgroundColor")
  void setBarBackgroundColor(@Nullable PatternObject value);

  /**
   * (Highstock, Gantt) The background color of the scrollbar itself.
   *
   */
  @JSProperty("barBackgroundColor")
  void setBarBackgroundColor(@Nullable String value);

  /**
   * (Highstock, Gantt) The background color of the scrollbar itself.
   *
   */
  @JSProperty("barBackgroundColor")
  void setBarBackgroundColor(@Nullable GradientColorObject value);

  /**
   * (Highstock, Gantt) The color of the scrollbar's border.
   *
   */
  @JSProperty("barBorderColor")
  @Nullable
  Unknown /* ( ColorString | GradientColorObject | PatternObject ) */ getBarBorderColor();

  /**
   * (Highstock, Gantt) The color of the scrollbar's border.
   *
   */
  @JSProperty("barBorderColor")
  void setBarBorderColor(@Nullable PatternObject value);

  /**
   * (Highstock, Gantt) The color of the scrollbar's border.
   *
   */
  @JSProperty("barBorderColor")
  void setBarBorderColor(@Nullable String value);

  /**
   * (Highstock, Gantt) The color of the scrollbar's border.
   *
   */
  @JSProperty("barBorderColor")
  void setBarBorderColor(@Nullable GradientColorObject value);

  /**
   * (Highstock, Gantt) The border rounding radius of the bar.
   *
   */
  @JSProperty("barBorderRadius")
  double getBarBorderRadius();

  /**
   * (Highstock, Gantt) The border rounding radius of the bar.
   *
   */
  @JSProperty("barBorderRadius")
  void setBarBorderRadius(double value);

  /**
   * (Highstock, Gantt) The width of the bar's border.
   *
   */
  @JSProperty("barBorderWidth")
  double getBarBorderWidth();

  /**
   * (Highstock, Gantt) The width of the bar's border.
   *
   */
  @JSProperty("barBorderWidth")
  void setBarBorderWidth(double value);

  /**
   * (Highstock, Gantt) The color of the small arrow inside the scrollbar
   * buttons.
   *
   */
  @JSProperty("buttonArrowColor")
  @Nullable
  Unknown /* ( ColorString | GradientColorObject | PatternObject ) */ getButtonArrowColor();

  /**
   * (Highstock, Gantt) The color of the small arrow inside the scrollbar
   * buttons.
   *
   */
  @JSProperty("buttonArrowColor")
  void setButtonArrowColor(@Nullable PatternObject value);

  /**
   * (Highstock, Gantt) The color of the small arrow inside the scrollbar
   * buttons.
   *
   */
  @JSProperty("buttonArrowColor")
  void setButtonArrowColor(@Nullable String value);

  /**
   * (Highstock, Gantt) The color of the small arrow inside the scrollbar
   * buttons.
   *
   */
  @JSProperty("buttonArrowColor")
  void setButtonArrowColor(@Nullable GradientColorObject value);

  /**
   * (Highstock, Gantt) The color of scrollbar buttons.
   *
   */
  @JSProperty("buttonBackgroundColor")
  @Nullable
  Unknown /* ( ColorString | GradientColorObject | PatternObject ) */ getButtonBackgroundColor();

  /**
   * (Highstock, Gantt) The color of scrollbar buttons.
   *
   */
  @JSProperty("buttonBackgroundColor")
  void setButtonBackgroundColor(@Nullable PatternObject value);

  /**
   * (Highstock, Gantt) The color of scrollbar buttons.
   *
   */
  @JSProperty("buttonBackgroundColor")
  void setButtonBackgroundColor(@Nullable String value);

  /**
   * (Highstock, Gantt) The color of scrollbar buttons.
   *
   */
  @JSProperty("buttonBackgroundColor")
  void setButtonBackgroundColor(@Nullable GradientColorObject value);

  /**
   * (Highstock, Gantt) The color of the border of the scrollbar buttons.
   *
   */
  @JSProperty("buttonBorderColor")
  @Nullable
  Unknown /* ( ColorString | GradientColorObject | PatternObject ) */ getButtonBorderColor();

  /**
   * (Highstock, Gantt) The color of the border of the scrollbar buttons.
   *
   */
  @JSProperty("buttonBorderColor")
  void setButtonBorderColor(@Nullable PatternObject value);

  /**
   * (Highstock, Gantt) The color of the border of the scrollbar buttons.
   *
   */
  @JSProperty("buttonBorderColor")
  void setButtonBorderColor(@Nullable String value);

  /**
   * (Highstock, Gantt) The color of the border of the scrollbar buttons.
   *
   */
  @JSProperty("buttonBorderColor")
  void setButtonBorderColor(@Nullable GradientColorObject value);

  /**
   * (Highstock, Gantt) The corner radius of the scrollbar buttons.
   *
   */
  @JSProperty("buttonBorderRadius")
  double getButtonBorderRadius();

  /**
   * (Highstock, Gantt) The corner radius of the scrollbar buttons.
   *
   */
  @JSProperty("buttonBorderRadius")
  void setButtonBorderRadius(double value);

  /**
   * (Highstock, Gantt) The border width of the scrollbar buttons.
   *
   */
  @JSProperty("buttonBorderWidth")
  double getButtonBorderWidth();

  /**
   * (Highstock, Gantt) The border width of the scrollbar buttons.
   *
   */
  @JSProperty("buttonBorderWidth")
  void setButtonBorderWidth(double value);

  /**
   * (Highstock, Gantt) Enable or disable the scrollbar.
   *
   */
  @JSProperty("enabled")
  boolean getEnabled();

  /**
   * (Highstock, Gantt) Enable or disable the scrollbar.
   *
   */
  @JSProperty("enabled")
  void setEnabled(boolean value);

  /**
   * (Highstock, Gantt) The height of the scrollbar. The height also applies
   * to the width of the scroll arrows so that they are always squares.
   * Defaults to 20 for touch devices and 14 for mouse devices.
   *
   */
  @JSProperty("height")
  double getHeight();

  /**
   * (Highstock, Gantt) The height of the scrollbar. The height also applies
   * to the width of the scroll arrows so that they are always squares.
   * Defaults to 20 for touch devices and 14 for mouse devices.
   *
   */
  @JSProperty("height")
  void setHeight(double value);

  /**
   * (Highstock, Gantt) Whether to redraw the main chart as the scrollbar or
   * the navigator zoomed window is moved. Defaults to <code>true</code> for modern
   * browsers and <code>false</code> for legacy IE browsers as well as mobile devices.
   *
   */
  @JSProperty("liveRedraw")
  boolean getLiveRedraw();

  /**
   * (Highstock, Gantt) Whether to redraw the main chart as the scrollbar or
   * the navigator zoomed window is moved. Defaults to <code>true</code> for modern
   * browsers and <code>false</code> for legacy IE browsers as well as mobile devices.
   *
   */
  @JSProperty("liveRedraw")
  void setLiveRedraw(boolean value);

  /**
   * (Highstock, Gantt) The margin between the scrollbar and its axis when the
   * scrollbar is applied directly to an axis.
   *
   */
  @JSProperty("margin")
  double getMargin();

  /**
   * (Highstock, Gantt) The margin between the scrollbar and its axis when the
   * scrollbar is applied directly to an axis.
   *
   */
  @JSProperty("margin")
  void setMargin(double value);

  /**
   * (Highstock, Gantt) The minimum width of the scrollbar.
   *
   */
  @JSProperty("minWidth")
  double getMinWidth();

  /**
   * (Highstock, Gantt) The minimum width of the scrollbar.
   *
   */
  @JSProperty("minWidth")
  void setMinWidth(double value);

  /**
   * (Highstock, Gantt) The color of the small rifles in the middle of the
   * scrollbar.
   *
   */
  @JSProperty("rifleColor")
  @Nullable
  Unknown /* ( ColorString | GradientColorObject | PatternObject ) */ getRifleColor();

  /**
   * (Highstock, Gantt) The color of the small rifles in the middle of the
   * scrollbar.
   *
   */
  @JSProperty("rifleColor")
  void setRifleColor(@Nullable PatternObject value);

  /**
   * (Highstock, Gantt) The color of the small rifles in the middle of the
   * scrollbar.
   *
   */
  @JSProperty("rifleColor")
  void setRifleColor(@Nullable String value);

  /**
   * (Highstock, Gantt) The color of the small rifles in the middle of the
   * scrollbar.
   *
   */
  @JSProperty("rifleColor")
  void setRifleColor(@Nullable GradientColorObject value);

  /**
   * (Highstock, Gantt) Whether to show or hide the scrollbar when the
   * scrolled content is zoomed out to it full extent.
   *
   */
  @JSProperty("showFull")
  boolean getShowFull();

  /**
   * (Highstock, Gantt) Whether to show or hide the scrollbar when the
   * scrolled content is zoomed out to it full extent.
   *
   */
  @JSProperty("showFull")
  void setShowFull(boolean value);

  @JSProperty("step")
  double getStep();

  @JSProperty("step")
  void setStep(double value);

  /**
   * (Highstock, Gantt) The color of the track background.
   *
   */
  @JSProperty("trackBackgroundColor")
  @Nullable
  Unknown /* ( ColorString | GradientColorObject | PatternObject ) */ getTrackBackgroundColor();

  /**
   * (Highstock, Gantt) The color of the track background.
   *
   */
  @JSProperty("trackBackgroundColor")
  void setTrackBackgroundColor(@Nullable PatternObject value);

  /**
   * (Highstock, Gantt) The color of the track background.
   *
   */
  @JSProperty("trackBackgroundColor")
  void setTrackBackgroundColor(@Nullable String value);

  /**
   * (Highstock, Gantt) The color of the track background.
   *
   */
  @JSProperty("trackBackgroundColor")
  void setTrackBackgroundColor(@Nullable GradientColorObject value);

  /**
   * (Highstock, Gantt) The color of the border of the scrollbar track.
   *
   */
  @JSProperty("trackBorderColor")
  @Nullable
  Unknown /* ( ColorString | GradientColorObject | PatternObject ) */ getTrackBorderColor();

  /**
   * (Highstock, Gantt) The color of the border of the scrollbar track.
   *
   */
  @JSProperty("trackBorderColor")
  void setTrackBorderColor(@Nullable PatternObject value);

  /**
   * (Highstock, Gantt) The color of the border of the scrollbar track.
   *
   */
  @JSProperty("trackBorderColor")
  void setTrackBorderColor(@Nullable String value);

  /**
   * (Highstock, Gantt) The color of the border of the scrollbar track.
   *
   */
  @JSProperty("trackBorderColor")
  void setTrackBorderColor(@Nullable GradientColorObject value);

  /**
   * (Highstock, Gantt) The corner radius of the border of the scrollbar
   * track.
   *
   */
  @JSProperty("trackBorderRadius")
  double getTrackBorderRadius();

  /**
   * (Highstock, Gantt) The corner radius of the border of the scrollbar
   * track.
   *
   */
  @JSProperty("trackBorderRadius")
  void setTrackBorderRadius(double value);

  /**
   * (Highstock, Gantt) The width of the border of the scrollbar track.
   *
   */
  @JSProperty("trackBorderWidth")
  double getTrackBorderWidth();

  /**
   * (Highstock, Gantt) The width of the border of the scrollbar track.
   *
   */
  @JSProperty("trackBorderWidth")
  void setTrackBorderWidth(double value);

  /**
   * (Highstock, Gantt) The z index of the scrollbar group.
   *
   */
  @JSProperty("zIndex")
  double getZIndex();

  /**
   * (Highstock, Gantt) The z index of the scrollbar group.
   *
   */
  @JSProperty("zIndex")
  void setZIndex(double value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final ScrollbarOptions object = Any.empty();

    private Builder() {
    }

    public ScrollbarOptions build() {
      return object;
    }

    /**
     * (Highstock, Gantt) The background color of the scrollbar itself.
     *
     */
    public Builder barBackgroundColor(@Nullable PatternObject value) {
      object.setBarBackgroundColor(value);
      return this;
    }

    /**
     * (Highstock, Gantt) The background color of the scrollbar itself.
     *
     */
    public Builder barBackgroundColor(@Nullable String value) {
      object.setBarBackgroundColor(value);
      return this;
    }

    /**
     * (Highstock, Gantt) The background color of the scrollbar itself.
     *
     */
    public Builder barBackgroundColor(@Nullable GradientColorObject value) {
      object.setBarBackgroundColor(value);
      return this;
    }

    /**
     * (Highstock, Gantt) The color of the scrollbar's border.
     *
     */
    public Builder barBorderColor(@Nullable PatternObject value) {
      object.setBarBorderColor(value);
      return this;
    }

    /**
     * (Highstock, Gantt) The color of the scrollbar's border.
     *
     */
    public Builder barBorderColor(@Nullable String value) {
      object.setBarBorderColor(value);
      return this;
    }

    /**
     * (Highstock, Gantt) The color of the scrollbar's border.
     *
     */
    public Builder barBorderColor(@Nullable GradientColorObject value) {
      object.setBarBorderColor(value);
      return this;
    }

    /**
     * (Highstock, Gantt) The border rounding radius of the bar.
     *
     */
    public Builder barBorderRadius(double value) {
      object.setBarBorderRadius(value);
      return this;
    }

    /**
     * (Highstock, Gantt) The width of the bar's border.
     *
     */
    public Builder barBorderWidth(double value) {
      object.setBarBorderWidth(value);
      return this;
    }

    /**
     * (Highstock, Gantt) The color of the small arrow inside the scrollbar
     * buttons.
     *
     */
    public Builder buttonArrowColor(@Nullable PatternObject value) {
      object.setButtonArrowColor(value);
      return this;
    }

    /**
     * (Highstock, Gantt) The color of the small arrow inside the scrollbar
     * buttons.
     *
     */
    public Builder buttonArrowColor(@Nullable String value) {
      object.setButtonArrowColor(value);
      return this;
    }

    /**
     * (Highstock, Gantt) The color of the small arrow inside the scrollbar
     * buttons.
     *
     */
    public Builder buttonArrowColor(@Nullable GradientColorObject value) {
      object.setButtonArrowColor(value);
      return this;
    }

    /**
     * (Highstock, Gantt) The color of scrollbar buttons.
     *
     */
    public Builder buttonBackgroundColor(@Nullable PatternObject value) {
      object.setButtonBackgroundColor(value);
      return this;
    }

    /**
     * (Highstock, Gantt) The color of scrollbar buttons.
     *
     */
    public Builder buttonBackgroundColor(@Nullable String value) {
      object.setButtonBackgroundColor(value);
      return this;
    }

    /**
     * (Highstock, Gantt) The color of scrollbar buttons.
     *
     */
    public Builder buttonBackgroundColor(@Nullable GradientColorObject value) {
      object.setButtonBackgroundColor(value);
      return this;
    }

    /**
     * (Highstock, Gantt) The color of the border of the scrollbar buttons.
     *
     */
    public Builder buttonBorderColor(@Nullable PatternObject value) {
      object.setButtonBorderColor(value);
      return this;
    }

    /**
     * (Highstock, Gantt) The color of the border of the scrollbar buttons.
     *
     */
    public Builder buttonBorderColor(@Nullable String value) {
      object.setButtonBorderColor(value);
      return this;
    }

    /**
     * (Highstock, Gantt) The color of the border of the scrollbar buttons.
     *
     */
    public Builder buttonBorderColor(@Nullable GradientColorObject value) {
      object.setButtonBorderColor(value);
      return this;
    }

    /**
     * (Highstock, Gantt) The corner radius of the scrollbar buttons.
     *
     */
    public Builder buttonBorderRadius(double value) {
      object.setButtonBorderRadius(value);
      return this;
    }

    /**
     * (Highstock, Gantt) The border width of the scrollbar buttons.
     *
     */
    public Builder buttonBorderWidth(double value) {
      object.setButtonBorderWidth(value);
      return this;
    }

    /**
     * (Highstock, Gantt) Enable or disable the scrollbar.
     *
     */
    public Builder enabled(boolean value) {
      object.setEnabled(value);
      return this;
    }

    /**
     * (Highstock, Gantt) The height of the scrollbar. The height also applies
     * to the width of the scroll arrows so that they are always squares.
     * Defaults to 20 for touch devices and 14 for mouse devices.
     *
     */
    public Builder height(double value) {
      object.setHeight(value);
      return this;
    }

    /**
     * (Highstock, Gantt) Whether to redraw the main chart as the scrollbar or
     * the navigator zoomed window is moved. Defaults to <code>true</code> for modern
     * browsers and <code>false</code> for legacy IE browsers as well as mobile devices.
     *
     */
    public Builder liveRedraw(boolean value) {
      object.setLiveRedraw(value);
      return this;
    }

    /**
     * (Highstock, Gantt) The margin between the scrollbar and its axis when the
     * scrollbar is applied directly to an axis.
     *
     */
    public Builder margin(double value) {
      object.setMargin(value);
      return this;
    }

    /**
     * (Highstock, Gantt) The minimum width of the scrollbar.
     *
     */
    public Builder minWidth(double value) {
      object.setMinWidth(value);
      return this;
    }

    /**
     * (Highstock, Gantt) The color of the small rifles in the middle of the
     * scrollbar.
     *
     */
    public Builder rifleColor(@Nullable PatternObject value) {
      object.setRifleColor(value);
      return this;
    }

    /**
     * (Highstock, Gantt) The color of the small rifles in the middle of the
     * scrollbar.
     *
     */
    public Builder rifleColor(@Nullable String value) {
      object.setRifleColor(value);
      return this;
    }

    /**
     * (Highstock, Gantt) The color of the small rifles in the middle of the
     * scrollbar.
     *
     */
    public Builder rifleColor(@Nullable GradientColorObject value) {
      object.setRifleColor(value);
      return this;
    }

    /**
     * (Highstock, Gantt) Whether to show or hide the scrollbar when the
     * scrolled content is zoomed out to it full extent.
     *
     */
    public Builder showFull(boolean value) {
      object.setShowFull(value);
      return this;
    }

    public Builder step(double value) {
      object.setStep(value);
      return this;
    }

    /**
     * (Highstock, Gantt) The color of the track background.
     *
     */
    public Builder trackBackgroundColor(@Nullable PatternObject value) {
      object.setTrackBackgroundColor(value);
      return this;
    }

    /**
     * (Highstock, Gantt) The color of the track background.
     *
     */
    public Builder trackBackgroundColor(@Nullable String value) {
      object.setTrackBackgroundColor(value);
      return this;
    }

    /**
     * (Highstock, Gantt) The color of the track background.
     *
     */
    public Builder trackBackgroundColor(@Nullable GradientColorObject value) {
      object.setTrackBackgroundColor(value);
      return this;
    }

    /**
     * (Highstock, Gantt) The color of the border of the scrollbar track.
     *
     */
    public Builder trackBorderColor(@Nullable PatternObject value) {
      object.setTrackBorderColor(value);
      return this;
    }

    /**
     * (Highstock, Gantt) The color of the border of the scrollbar track.
     *
     */
    public Builder trackBorderColor(@Nullable String value) {
      object.setTrackBorderColor(value);
      return this;
    }

    /**
     * (Highstock, Gantt) The color of the border of the scrollbar track.
     *
     */
    public Builder trackBorderColor(@Nullable GradientColorObject value) {
      object.setTrackBorderColor(value);
      return this;
    }

    /**
     * (Highstock, Gantt) The corner radius of the border of the scrollbar
     * track.
     *
     */
    public Builder trackBorderRadius(double value) {
      object.setTrackBorderRadius(value);
      return this;
    }

    /**
     * (Highstock, Gantt) The width of the border of the scrollbar track.
     *
     */
    public Builder trackBorderWidth(double value) {
      object.setTrackBorderWidth(value);
      return this;
    }

    /**
     * (Highstock, Gantt) The z index of the scrollbar group.
     *
     */
    public Builder zIndex(double value) {
      object.setZIndex(value);
      return this;
    }
  }
}
