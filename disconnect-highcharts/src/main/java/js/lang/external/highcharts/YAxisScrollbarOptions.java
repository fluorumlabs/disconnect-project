package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown /* ( ColorString | GradientColorObject | PatternObject ) */;
import org.teavm.jso.JSProperty;

/**
 * (Highstock) An optional scrollbar to display on the Y axis in response to
 * limiting the minimum an maximum of the axis values.
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
public interface YAxisScrollbarOptions extends Any {
  /**
   * (Highstock) The background color of the scrollbar itself.
   *
   */
  @JSProperty("barBackgroundColor")
  @Nullable
  Unknown /* ( ColorString | GradientColorObject | PatternObject ) */ getBarBackgroundColor();

  /**
   * (Highstock) The background color of the scrollbar itself.
   *
   */
  @JSProperty("barBackgroundColor")
  void setBarBackgroundColor(@Nullable PatternObject value);

  /**
   * (Highstock) The background color of the scrollbar itself.
   *
   */
  @JSProperty("barBackgroundColor")
  void setBarBackgroundColor(@Nullable String value);

  /**
   * (Highstock) The background color of the scrollbar itself.
   *
   */
  @JSProperty("barBackgroundColor")
  void setBarBackgroundColor(@Nullable GradientColorObject value);

  /**
   * (Highstock) The color of the scrollbar's border.
   *
   */
  @JSProperty("barBorderColor")
  @Nullable
  Unknown /* ( ColorString | GradientColorObject | PatternObject ) */ getBarBorderColor();

  /**
   * (Highstock) The color of the scrollbar's border.
   *
   */
  @JSProperty("barBorderColor")
  void setBarBorderColor(@Nullable PatternObject value);

  /**
   * (Highstock) The color of the scrollbar's border.
   *
   */
  @JSProperty("barBorderColor")
  void setBarBorderColor(@Nullable String value);

  /**
   * (Highstock) The color of the scrollbar's border.
   *
   */
  @JSProperty("barBorderColor")
  void setBarBorderColor(@Nullable GradientColorObject value);

  /**
   * (Highstock) The border rounding radius of the bar.
   *
   */
  @JSProperty("barBorderRadius")
  double getBarBorderRadius();

  /**
   * (Highstock) The border rounding radius of the bar.
   *
   */
  @JSProperty("barBorderRadius")
  void setBarBorderRadius(double value);

  /**
   * (Highstock) The width of the bar's border.
   *
   */
  @JSProperty("barBorderWidth")
  double getBarBorderWidth();

  /**
   * (Highstock) The width of the bar's border.
   *
   */
  @JSProperty("barBorderWidth")
  void setBarBorderWidth(double value);

  /**
   * (Highstock) The color of the small arrow inside the scrollbar buttons.
   *
   */
  @JSProperty("buttonArrowColor")
  @Nullable
  Unknown /* ( ColorString | GradientColorObject | PatternObject ) */ getButtonArrowColor();

  /**
   * (Highstock) The color of the small arrow inside the scrollbar buttons.
   *
   */
  @JSProperty("buttonArrowColor")
  void setButtonArrowColor(@Nullable PatternObject value);

  /**
   * (Highstock) The color of the small arrow inside the scrollbar buttons.
   *
   */
  @JSProperty("buttonArrowColor")
  void setButtonArrowColor(@Nullable String value);

  /**
   * (Highstock) The color of the small arrow inside the scrollbar buttons.
   *
   */
  @JSProperty("buttonArrowColor")
  void setButtonArrowColor(@Nullable GradientColorObject value);

  /**
   * (Highstock) The color of scrollbar buttons.
   *
   */
  @JSProperty("buttonBackgroundColor")
  @Nullable
  Unknown /* ( ColorString | GradientColorObject | PatternObject ) */ getButtonBackgroundColor();

  /**
   * (Highstock) The color of scrollbar buttons.
   *
   */
  @JSProperty("buttonBackgroundColor")
  void setButtonBackgroundColor(@Nullable PatternObject value);

  /**
   * (Highstock) The color of scrollbar buttons.
   *
   */
  @JSProperty("buttonBackgroundColor")
  void setButtonBackgroundColor(@Nullable String value);

  /**
   * (Highstock) The color of scrollbar buttons.
   *
   */
  @JSProperty("buttonBackgroundColor")
  void setButtonBackgroundColor(@Nullable GradientColorObject value);

  /**
   * (Highstock) The color of the border of the scrollbar buttons.
   *
   */
  @JSProperty("buttonBorderColor")
  @Nullable
  Unknown /* ( ColorString | GradientColorObject | PatternObject ) */ getButtonBorderColor();

  /**
   * (Highstock) The color of the border of the scrollbar buttons.
   *
   */
  @JSProperty("buttonBorderColor")
  void setButtonBorderColor(@Nullable PatternObject value);

  /**
   * (Highstock) The color of the border of the scrollbar buttons.
   *
   */
  @JSProperty("buttonBorderColor")
  void setButtonBorderColor(@Nullable String value);

  /**
   * (Highstock) The color of the border of the scrollbar buttons.
   *
   */
  @JSProperty("buttonBorderColor")
  void setButtonBorderColor(@Nullable GradientColorObject value);

  /**
   * (Highstock) The corner radius of the scrollbar buttons.
   *
   */
  @JSProperty("buttonBorderRadius")
  double getButtonBorderRadius();

  /**
   * (Highstock) The corner radius of the scrollbar buttons.
   *
   */
  @JSProperty("buttonBorderRadius")
  void setButtonBorderRadius(double value);

  /**
   * (Highstock) The border width of the scrollbar buttons.
   *
   */
  @JSProperty("buttonBorderWidth")
  double getButtonBorderWidth();

  /**
   * (Highstock) The border width of the scrollbar buttons.
   *
   */
  @JSProperty("buttonBorderWidth")
  void setButtonBorderWidth(double value);

  /**
   * (Highstock) Enable the scrollbar on the Y axis.
   *
   */
  @JSProperty("enabled")
  boolean getEnabled();

  /**
   * (Highstock) Enable the scrollbar on the Y axis.
   *
   */
  @JSProperty("enabled")
  void setEnabled(boolean value);

  /**
   * (Highstock) Whether to redraw the main chart as the scrollbar or the
   * navigator zoomed window is moved. Defaults to <code>true</code> for modern browsers
   * and <code>false</code> for legacy IE browsers as well as mobile devices.
   *
   */
  @JSProperty("liveRedraw")
  boolean getLiveRedraw();

  /**
   * (Highstock) Whether to redraw the main chart as the scrollbar or the
   * navigator zoomed window is moved. Defaults to <code>true</code> for modern browsers
   * and <code>false</code> for legacy IE browsers as well as mobile devices.
   *
   */
  @JSProperty("liveRedraw")
  void setLiveRedraw(boolean value);

  /**
   * (Highstock) Pixel margin between the scrollbar and the axis elements.
   *
   */
  @JSProperty("margin")
  double getMargin();

  /**
   * (Highstock) Pixel margin between the scrollbar and the axis elements.
   *
   */
  @JSProperty("margin")
  void setMargin(double value);

  /**
   * (Highstock) The minimum width of the scrollbar.
   *
   */
  @JSProperty("minWidth")
  double getMinWidth();

  /**
   * (Highstock) The minimum width of the scrollbar.
   *
   */
  @JSProperty("minWidth")
  void setMinWidth(double value);

  /**
   * (Highstock) The color of the small rifles in the middle of the scrollbar.
   *
   */
  @JSProperty("rifleColor")
  @Nullable
  Unknown /* ( ColorString | GradientColorObject | PatternObject ) */ getRifleColor();

  /**
   * (Highstock) The color of the small rifles in the middle of the scrollbar.
   *
   */
  @JSProperty("rifleColor")
  void setRifleColor(@Nullable PatternObject value);

  /**
   * (Highstock) The color of the small rifles in the middle of the scrollbar.
   *
   */
  @JSProperty("rifleColor")
  void setRifleColor(@Nullable String value);

  /**
   * (Highstock) The color of the small rifles in the middle of the scrollbar.
   *
   */
  @JSProperty("rifleColor")
  void setRifleColor(@Nullable GradientColorObject value);

  /**
   * (Highstock) Whether to show the scrollbar when it is fully zoomed out at
   * max range. Setting it to <code>false</code> on the Y axis makes the scrollbar stay
   * hidden until the user zooms in, like common in browsers.
   *
   */
  @JSProperty("showFull")
  boolean getShowFull();

  /**
   * (Highstock) Whether to show the scrollbar when it is fully zoomed out at
   * max range. Setting it to <code>false</code> on the Y axis makes the scrollbar stay
   * hidden until the user zooms in, like common in browsers.
   *
   */
  @JSProperty("showFull")
  void setShowFull(boolean value);

  /**
   * (Highstock) The width of a vertical scrollbar or height of a horizontal
   * scrollbar. Defaults to 20 on touch devices.
   *
   */
  @JSProperty("size")
  double getSize();

  /**
   * (Highstock) The width of a vertical scrollbar or height of a horizontal
   * scrollbar. Defaults to 20 on touch devices.
   *
   */
  @JSProperty("size")
  void setSize(double value);

  @JSProperty("step")
  double getStep();

  @JSProperty("step")
  void setStep(double value);

  /**
   * (Highstock) The color of the track background.
   *
   */
  @JSProperty("trackBackgroundColor")
  @Nullable
  Unknown /* ( ColorString | GradientColorObject | PatternObject ) */ getTrackBackgroundColor();

  /**
   * (Highstock) The color of the track background.
   *
   */
  @JSProperty("trackBackgroundColor")
  void setTrackBackgroundColor(@Nullable PatternObject value);

  /**
   * (Highstock) The color of the track background.
   *
   */
  @JSProperty("trackBackgroundColor")
  void setTrackBackgroundColor(@Nullable String value);

  /**
   * (Highstock) The color of the track background.
   *
   */
  @JSProperty("trackBackgroundColor")
  void setTrackBackgroundColor(@Nullable GradientColorObject value);

  /**
   * (Highstock) The color of the border of the scrollbar track.
   *
   */
  @JSProperty("trackBorderColor")
  @Nullable
  Unknown /* ( ColorString | GradientColorObject | PatternObject ) */ getTrackBorderColor();

  /**
   * (Highstock) The color of the border of the scrollbar track.
   *
   */
  @JSProperty("trackBorderColor")
  void setTrackBorderColor(@Nullable PatternObject value);

  /**
   * (Highstock) The color of the border of the scrollbar track.
   *
   */
  @JSProperty("trackBorderColor")
  void setTrackBorderColor(@Nullable String value);

  /**
   * (Highstock) The color of the border of the scrollbar track.
   *
   */
  @JSProperty("trackBorderColor")
  void setTrackBorderColor(@Nullable GradientColorObject value);

  /**
   * (Highstock) The corner radius of the border of the scrollbar track.
   *
   */
  @JSProperty("trackBorderRadius")
  double getTrackBorderRadius();

  /**
   * (Highstock) The corner radius of the border of the scrollbar track.
   *
   */
  @JSProperty("trackBorderRadius")
  void setTrackBorderRadius(double value);

  /**
   * (Highstock) The width of the border of the scrollbar track.
   *
   */
  @JSProperty("trackBorderWidth")
  double getTrackBorderWidth();

  /**
   * (Highstock) The width of the border of the scrollbar track.
   *
   */
  @JSProperty("trackBorderWidth")
  void setTrackBorderWidth(double value);

  /**
   * (Highstock) Z index of the scrollbar elements.
   *
   */
  @JSProperty("zIndex")
  double getZIndex();

  /**
   * (Highstock) Z index of the scrollbar elements.
   *
   */
  @JSProperty("zIndex")
  void setZIndex(double value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final YAxisScrollbarOptions object = Any.empty();

    private Builder() {
    }

    public YAxisScrollbarOptions build() {
      return object;
    }

    /**
     * (Highstock) The background color of the scrollbar itself.
     *
     */
    public Builder barBackgroundColor(@Nullable PatternObject value) {
      object.setBarBackgroundColor(value);
      return this;
    }

    /**
     * (Highstock) The background color of the scrollbar itself.
     *
     */
    public Builder barBackgroundColor(@Nullable String value) {
      object.setBarBackgroundColor(value);
      return this;
    }

    /**
     * (Highstock) The background color of the scrollbar itself.
     *
     */
    public Builder barBackgroundColor(@Nullable GradientColorObject value) {
      object.setBarBackgroundColor(value);
      return this;
    }

    /**
     * (Highstock) The color of the scrollbar's border.
     *
     */
    public Builder barBorderColor(@Nullable PatternObject value) {
      object.setBarBorderColor(value);
      return this;
    }

    /**
     * (Highstock) The color of the scrollbar's border.
     *
     */
    public Builder barBorderColor(@Nullable String value) {
      object.setBarBorderColor(value);
      return this;
    }

    /**
     * (Highstock) The color of the scrollbar's border.
     *
     */
    public Builder barBorderColor(@Nullable GradientColorObject value) {
      object.setBarBorderColor(value);
      return this;
    }

    /**
     * (Highstock) The border rounding radius of the bar.
     *
     */
    public Builder barBorderRadius(double value) {
      object.setBarBorderRadius(value);
      return this;
    }

    /**
     * (Highstock) The width of the bar's border.
     *
     */
    public Builder barBorderWidth(double value) {
      object.setBarBorderWidth(value);
      return this;
    }

    /**
     * (Highstock) The color of the small arrow inside the scrollbar buttons.
     *
     */
    public Builder buttonArrowColor(@Nullable PatternObject value) {
      object.setButtonArrowColor(value);
      return this;
    }

    /**
     * (Highstock) The color of the small arrow inside the scrollbar buttons.
     *
     */
    public Builder buttonArrowColor(@Nullable String value) {
      object.setButtonArrowColor(value);
      return this;
    }

    /**
     * (Highstock) The color of the small arrow inside the scrollbar buttons.
     *
     */
    public Builder buttonArrowColor(@Nullable GradientColorObject value) {
      object.setButtonArrowColor(value);
      return this;
    }

    /**
     * (Highstock) The color of scrollbar buttons.
     *
     */
    public Builder buttonBackgroundColor(@Nullable PatternObject value) {
      object.setButtonBackgroundColor(value);
      return this;
    }

    /**
     * (Highstock) The color of scrollbar buttons.
     *
     */
    public Builder buttonBackgroundColor(@Nullable String value) {
      object.setButtonBackgroundColor(value);
      return this;
    }

    /**
     * (Highstock) The color of scrollbar buttons.
     *
     */
    public Builder buttonBackgroundColor(@Nullable GradientColorObject value) {
      object.setButtonBackgroundColor(value);
      return this;
    }

    /**
     * (Highstock) The color of the border of the scrollbar buttons.
     *
     */
    public Builder buttonBorderColor(@Nullable PatternObject value) {
      object.setButtonBorderColor(value);
      return this;
    }

    /**
     * (Highstock) The color of the border of the scrollbar buttons.
     *
     */
    public Builder buttonBorderColor(@Nullable String value) {
      object.setButtonBorderColor(value);
      return this;
    }

    /**
     * (Highstock) The color of the border of the scrollbar buttons.
     *
     */
    public Builder buttonBorderColor(@Nullable GradientColorObject value) {
      object.setButtonBorderColor(value);
      return this;
    }

    /**
     * (Highstock) The corner radius of the scrollbar buttons.
     *
     */
    public Builder buttonBorderRadius(double value) {
      object.setButtonBorderRadius(value);
      return this;
    }

    /**
     * (Highstock) The border width of the scrollbar buttons.
     *
     */
    public Builder buttonBorderWidth(double value) {
      object.setButtonBorderWidth(value);
      return this;
    }

    /**
     * (Highstock) Enable the scrollbar on the Y axis.
     *
     */
    public Builder enabled(boolean value) {
      object.setEnabled(value);
      return this;
    }

    /**
     * (Highstock) Whether to redraw the main chart as the scrollbar or the
     * navigator zoomed window is moved. Defaults to <code>true</code> for modern browsers
     * and <code>false</code> for legacy IE browsers as well as mobile devices.
     *
     */
    public Builder liveRedraw(boolean value) {
      object.setLiveRedraw(value);
      return this;
    }

    /**
     * (Highstock) Pixel margin between the scrollbar and the axis elements.
     *
     */
    public Builder margin(double value) {
      object.setMargin(value);
      return this;
    }

    /**
     * (Highstock) The minimum width of the scrollbar.
     *
     */
    public Builder minWidth(double value) {
      object.setMinWidth(value);
      return this;
    }

    /**
     * (Highstock) The color of the small rifles in the middle of the scrollbar.
     *
     */
    public Builder rifleColor(@Nullable PatternObject value) {
      object.setRifleColor(value);
      return this;
    }

    /**
     * (Highstock) The color of the small rifles in the middle of the scrollbar.
     *
     */
    public Builder rifleColor(@Nullable String value) {
      object.setRifleColor(value);
      return this;
    }

    /**
     * (Highstock) The color of the small rifles in the middle of the scrollbar.
     *
     */
    public Builder rifleColor(@Nullable GradientColorObject value) {
      object.setRifleColor(value);
      return this;
    }

    /**
     * (Highstock) Whether to show the scrollbar when it is fully zoomed out at
     * max range. Setting it to <code>false</code> on the Y axis makes the scrollbar stay
     * hidden until the user zooms in, like common in browsers.
     *
     */
    public Builder showFull(boolean value) {
      object.setShowFull(value);
      return this;
    }

    /**
     * (Highstock) The width of a vertical scrollbar or height of a horizontal
     * scrollbar. Defaults to 20 on touch devices.
     *
     */
    public Builder size(double value) {
      object.setSize(value);
      return this;
    }

    public Builder step(double value) {
      object.setStep(value);
      return this;
    }

    /**
     * (Highstock) The color of the track background.
     *
     */
    public Builder trackBackgroundColor(@Nullable PatternObject value) {
      object.setTrackBackgroundColor(value);
      return this;
    }

    /**
     * (Highstock) The color of the track background.
     *
     */
    public Builder trackBackgroundColor(@Nullable String value) {
      object.setTrackBackgroundColor(value);
      return this;
    }

    /**
     * (Highstock) The color of the track background.
     *
     */
    public Builder trackBackgroundColor(@Nullable GradientColorObject value) {
      object.setTrackBackgroundColor(value);
      return this;
    }

    /**
     * (Highstock) The color of the border of the scrollbar track.
     *
     */
    public Builder trackBorderColor(@Nullable PatternObject value) {
      object.setTrackBorderColor(value);
      return this;
    }

    /**
     * (Highstock) The color of the border of the scrollbar track.
     *
     */
    public Builder trackBorderColor(@Nullable String value) {
      object.setTrackBorderColor(value);
      return this;
    }

    /**
     * (Highstock) The color of the border of the scrollbar track.
     *
     */
    public Builder trackBorderColor(@Nullable GradientColorObject value) {
      object.setTrackBorderColor(value);
      return this;
    }

    /**
     * (Highstock) The corner radius of the border of the scrollbar track.
     *
     */
    public Builder trackBorderRadius(double value) {
      object.setTrackBorderRadius(value);
      return this;
    }

    /**
     * (Highstock) The width of the border of the scrollbar track.
     *
     */
    public Builder trackBorderWidth(double value) {
      object.setTrackBorderWidth(value);
      return this;
    }

    /**
     * (Highstock) Z index of the scrollbar elements.
     *
     */
    public Builder zIndex(double value) {
      object.setZIndex(value);
      return this;
    }
  }
}
