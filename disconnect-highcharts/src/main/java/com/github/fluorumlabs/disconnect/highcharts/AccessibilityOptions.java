package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.FunctionalInterface;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown;
import org.teavm.jso.JSFunctor;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Highmaps) Options for configuring accessibility for
 * the chart. Requires the accessibility module to be loaded. For a description
 * of the module and information on its features, see Highcharts Accessibility.
 *
 * @see <a href="https://api.highcharts.com/highcharts/accessibility">https://api.highcharts.com/highcharts/accessibility</a>
 * @see <a href="https://api.highcharts.com/highstock/accessibility">https://api.highcharts.com/highstock/accessibility</a>
 * @see <a href="https://api.highcharts.com/highmaps/accessibility">https://api.highcharts.com/highmaps/accessibility</a>
 *
 */
public interface AccessibilityOptions extends Any {
  /**
   * (Highcharts, Highstock, Highmaps) Whether or not to add series
   * descriptions to charts with a single series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/accessibility.describeSingleSeries">https://api.highcharts.com/highcharts/accessibility.describeSingleSeries</a>
   * @see <a href="https://api.highcharts.com/highstock/accessibility.describeSingleSeries">https://api.highcharts.com/highstock/accessibility.describeSingleSeries</a>
   * @see <a href="https://api.highcharts.com/highmaps/accessibility.describeSingleSeries">https://api.highcharts.com/highmaps/accessibility.describeSingleSeries</a>
   *
   * @implspec describeSingleSeries?: boolean;
   *
   */
  @JSProperty("describeSingleSeries")
  boolean getDescribeSingleSeries();

  /**
   * (Highcharts, Highstock, Highmaps) Whether or not to add series
   * descriptions to charts with a single series.
   *
   * @see <a href="https://api.highcharts.com/highcharts/accessibility.describeSingleSeries">https://api.highcharts.com/highcharts/accessibility.describeSingleSeries</a>
   * @see <a href="https://api.highcharts.com/highstock/accessibility.describeSingleSeries">https://api.highcharts.com/highstock/accessibility.describeSingleSeries</a>
   * @see <a href="https://api.highcharts.com/highmaps/accessibility.describeSingleSeries">https://api.highcharts.com/highmaps/accessibility.describeSingleSeries</a>
   *
   * @implspec describeSingleSeries?: boolean;
   *
   */
  @JSProperty("describeSingleSeries")
  void setDescribeSingleSeries(boolean value);

  /**
   * (Highcharts, Highstock, Highmaps) Enable accessibility features for the
   * chart.
   *
   * @see <a href="https://api.highcharts.com/highcharts/accessibility.enabled">https://api.highcharts.com/highcharts/accessibility.enabled</a>
   * @see <a href="https://api.highcharts.com/highstock/accessibility.enabled">https://api.highcharts.com/highstock/accessibility.enabled</a>
   * @see <a href="https://api.highcharts.com/highmaps/accessibility.enabled">https://api.highcharts.com/highmaps/accessibility.enabled</a>
   *
   * @implspec enabled?: boolean;
   *
   */
  @JSProperty("enabled")
  boolean getEnabled();

  /**
   * (Highcharts, Highstock, Highmaps) Enable accessibility features for the
   * chart.
   *
   * @see <a href="https://api.highcharts.com/highcharts/accessibility.enabled">https://api.highcharts.com/highcharts/accessibility.enabled</a>
   * @see <a href="https://api.highcharts.com/highstock/accessibility.enabled">https://api.highcharts.com/highstock/accessibility.enabled</a>
   * @see <a href="https://api.highcharts.com/highmaps/accessibility.enabled">https://api.highcharts.com/highmaps/accessibility.enabled</a>
   *
   * @implspec enabled?: boolean;
   *
   */
  @JSProperty("enabled")
  void setEnabled(boolean value);

  /**
   * (Highcharts, Highstock, Highmaps) Options for keyboard navigation.
   *
   * @see <a href="https://api.highcharts.com/highcharts/accessibility.keyboardNavigation">https://api.highcharts.com/highcharts/accessibility.keyboardNavigation</a>
   * @see <a href="https://api.highcharts.com/highstock/accessibility.keyboardNavigation">https://api.highcharts.com/highstock/accessibility.keyboardNavigation</a>
   * @see <a href="https://api.highcharts.com/highmaps/accessibility.keyboardNavigation">https://api.highcharts.com/highmaps/accessibility.keyboardNavigation</a>
   *
   * @implspec keyboardNavigation?: AccessibilityKeyboardNavigationOptions;
   *
   */
  @JSProperty("keyboardNavigation")
  @Nullable
  AccessibilityKeyboardNavigationOptions getKeyboardNavigation();

  /**
   * (Highcharts, Highstock, Highmaps) Options for keyboard navigation.
   *
   * @see <a href="https://api.highcharts.com/highcharts/accessibility.keyboardNavigation">https://api.highcharts.com/highcharts/accessibility.keyboardNavigation</a>
   * @see <a href="https://api.highcharts.com/highstock/accessibility.keyboardNavigation">https://api.highcharts.com/highstock/accessibility.keyboardNavigation</a>
   * @see <a href="https://api.highcharts.com/highmaps/accessibility.keyboardNavigation">https://api.highcharts.com/highmaps/accessibility.keyboardNavigation</a>
   *
   * @implspec keyboardNavigation?: AccessibilityKeyboardNavigationOptions;
   *
   */
  @JSProperty("keyboardNavigation")
  void setKeyboardNavigation(AccessibilityKeyboardNavigationOptions value);

  /**
   * (Highcharts, Highstock, Highmaps) Function to run upon clicking the &quot;View
   * as Data Table&quot; link in the screen reader region.
   *
   * By default Highcharts will insert and set focus to a data table
   * representation of the chart.
   *
   * @see <a href="https://api.highcharts.com/highcharts/accessibility.onTableAnchorClick">https://api.highcharts.com/highcharts/accessibility.onTableAnchorClick</a>
   * @see <a href="https://api.highcharts.com/highstock/accessibility.onTableAnchorClick">https://api.highcharts.com/highstock/accessibility.onTableAnchorClick</a>
   * @see <a href="https://api.highcharts.com/highmaps/accessibility.onTableAnchorClick">https://api.highcharts.com/highmaps/accessibility.onTableAnchorClick</a>
   *
   * @implspec onTableAnchorClick?: () =&gt; void;
   *
   */
  @JSProperty("onTableAnchorClick")
  @Nullable
  OnTableAnchorClick getOnTableAnchorClick();

  /**
   * (Highcharts, Highstock, Highmaps) Function to run upon clicking the &quot;View
   * as Data Table&quot; link in the screen reader region.
   *
   * By default Highcharts will insert and set focus to a data table
   * representation of the chart.
   *
   * @see <a href="https://api.highcharts.com/highcharts/accessibility.onTableAnchorClick">https://api.highcharts.com/highcharts/accessibility.onTableAnchorClick</a>
   * @see <a href="https://api.highcharts.com/highstock/accessibility.onTableAnchorClick">https://api.highcharts.com/highstock/accessibility.onTableAnchorClick</a>
   * @see <a href="https://api.highcharts.com/highmaps/accessibility.onTableAnchorClick">https://api.highcharts.com/highmaps/accessibility.onTableAnchorClick</a>
   *
   * @implspec onTableAnchorClick?: () =&gt; void;
   *
   */
  @JSProperty("onTableAnchorClick")
  void setOnTableAnchorClick(OnTableAnchorClick value);

  /**
   * (Highcharts, Highstock, Highmaps) Date format to use for points on
   * datetime axes when describing them to screen reader users.
   *
   * Defaults to the same format as in tooltip.
   *
   * For an overview of the replacement codes, see dateFormat.
   *
   * @see <a href="https://api.highcharts.com/highcharts/accessibility.pointDateFormat">https://api.highcharts.com/highcharts/accessibility.pointDateFormat</a>
   * @see <a href="https://api.highcharts.com/highstock/accessibility.pointDateFormat">https://api.highcharts.com/highstock/accessibility.pointDateFormat</a>
   * @see <a href="https://api.highcharts.com/highmaps/accessibility.pointDateFormat">https://api.highcharts.com/highmaps/accessibility.pointDateFormat</a>
   *
   * @implspec pointDateFormat?: string;
   *
   */
  @JSProperty("pointDateFormat")
  @Nullable
  String getPointDateFormat();

  /**
   * (Highcharts, Highstock, Highmaps) Date format to use for points on
   * datetime axes when describing them to screen reader users.
   *
   * Defaults to the same format as in tooltip.
   *
   * For an overview of the replacement codes, see dateFormat.
   *
   * @see <a href="https://api.highcharts.com/highcharts/accessibility.pointDateFormat">https://api.highcharts.com/highcharts/accessibility.pointDateFormat</a>
   * @see <a href="https://api.highcharts.com/highstock/accessibility.pointDateFormat">https://api.highcharts.com/highstock/accessibility.pointDateFormat</a>
   * @see <a href="https://api.highcharts.com/highmaps/accessibility.pointDateFormat">https://api.highcharts.com/highmaps/accessibility.pointDateFormat</a>
   *
   * @implspec pointDateFormat?: string;
   *
   */
  @JSProperty("pointDateFormat")
  void setPointDateFormat(String value);

  /**
   * (Highcharts, Highstock, Highmaps) Formatter function to determine the
   * date/time format used with points on datetime axes when describing them
   * to screen reader users. Receives one argument, <code>point</code>, referring to the
   * point to describe. Should return a date format string compatible with
   * dateFormat.
   *
   * @see <a href="https://api.highcharts.com/highcharts/accessibility.pointDateFormatter">https://api.highcharts.com/highcharts/accessibility.pointDateFormatter</a>
   * @see <a href="https://api.highcharts.com/highstock/accessibility.pointDateFormatter">https://api.highcharts.com/highstock/accessibility.pointDateFormatter</a>
   * @see <a href="https://api.highcharts.com/highmaps/accessibility.pointDateFormatter">https://api.highcharts.com/highmaps/accessibility.pointDateFormatter</a>
   *
   * @implspec pointDateFormatter?: () =&gt; void;
   *
   */
  @JSProperty("pointDateFormatter")
  @Nullable
  PointDateFormatter getPointDateFormatter();

  /**
   * (Highcharts, Highstock, Highmaps) Formatter function to determine the
   * date/time format used with points on datetime axes when describing them
   * to screen reader users. Receives one argument, <code>point</code>, referring to the
   * point to describe. Should return a date format string compatible with
   * dateFormat.
   *
   * @see <a href="https://api.highcharts.com/highcharts/accessibility.pointDateFormatter">https://api.highcharts.com/highcharts/accessibility.pointDateFormatter</a>
   * @see <a href="https://api.highcharts.com/highstock/accessibility.pointDateFormatter">https://api.highcharts.com/highstock/accessibility.pointDateFormatter</a>
   * @see <a href="https://api.highcharts.com/highmaps/accessibility.pointDateFormatter">https://api.highcharts.com/highmaps/accessibility.pointDateFormatter</a>
   *
   * @implspec pointDateFormatter?: () =&gt; void;
   *
   */
  @JSProperty("pointDateFormatter")
  void setPointDateFormatter(PointDateFormatter value);

  /**
   * (Highcharts, Highstock, Highmaps) Formatter function to use instead of
   * the default for point descriptions. Receives one argument, <code>point</code>,
   * referring to the point to describe. Should return a String with the
   * description of the point for a screen reader user.
   *
   * @see <a href="https://api.highcharts.com/highcharts/accessibility.pointDescriptionFormatter">https://api.highcharts.com/highcharts/accessibility.pointDescriptionFormatter</a>
   * @see <a href="https://api.highcharts.com/highstock/accessibility.pointDescriptionFormatter">https://api.highcharts.com/highstock/accessibility.pointDescriptionFormatter</a>
   * @see <a href="https://api.highcharts.com/highmaps/accessibility.pointDescriptionFormatter">https://api.highcharts.com/highmaps/accessibility.pointDescriptionFormatter</a>
   *
   * @implspec pointDescriptionFormatter?: () =&gt; void;
   *
   */
  @JSProperty("pointDescriptionFormatter")
  @Nullable
  PointDescriptionFormatter getPointDescriptionFormatter();

  /**
   * (Highcharts, Highstock, Highmaps) Formatter function to use instead of
   * the default for point descriptions. Receives one argument, <code>point</code>,
   * referring to the point to describe. Should return a String with the
   * description of the point for a screen reader user.
   *
   * @see <a href="https://api.highcharts.com/highcharts/accessibility.pointDescriptionFormatter">https://api.highcharts.com/highcharts/accessibility.pointDescriptionFormatter</a>
   * @see <a href="https://api.highcharts.com/highstock/accessibility.pointDescriptionFormatter">https://api.highcharts.com/highstock/accessibility.pointDescriptionFormatter</a>
   * @see <a href="https://api.highcharts.com/highmaps/accessibility.pointDescriptionFormatter">https://api.highcharts.com/highmaps/accessibility.pointDescriptionFormatter</a>
   *
   * @implspec pointDescriptionFormatter?: () =&gt; void;
   *
   */
  @JSProperty("pointDescriptionFormatter")
  void setPointDescriptionFormatter(PointDescriptionFormatter value);

  /**
   * (Highcharts, Highstock, Highmaps) When a series contains more points than
   * this, we no longer expose information about individual points to screen
   * readers.
   *
   * Set to <code>false</code> to disable.
   *
   * @see <a href="https://api.highcharts.com/highcharts/accessibility.pointDescriptionThreshold">https://api.highcharts.com/highcharts/accessibility.pointDescriptionThreshold</a>
   * @see <a href="https://api.highcharts.com/highstock/accessibility.pointDescriptionThreshold">https://api.highcharts.com/highstock/accessibility.pointDescriptionThreshold</a>
   * @see <a href="https://api.highcharts.com/highmaps/accessibility.pointDescriptionThreshold">https://api.highcharts.com/highmaps/accessibility.pointDescriptionThreshold</a>
   *
   * @implspec pointDescriptionThreshold?: (false|number);
   *
   */
  @JSProperty("pointDescriptionThreshold")
  @Nullable
  Unknown getPointDescriptionThreshold();

  /**
   * (Highcharts, Highstock, Highmaps) When a series contains more points than
   * this, we no longer expose information about individual points to screen
   * readers.
   *
   * Set to <code>false</code> to disable.
   *
   * @see <a href="https://api.highcharts.com/highcharts/accessibility.pointDescriptionThreshold">https://api.highcharts.com/highcharts/accessibility.pointDescriptionThreshold</a>
   * @see <a href="https://api.highcharts.com/highstock/accessibility.pointDescriptionThreshold">https://api.highcharts.com/highstock/accessibility.pointDescriptionThreshold</a>
   * @see <a href="https://api.highcharts.com/highmaps/accessibility.pointDescriptionThreshold">https://api.highcharts.com/highmaps/accessibility.pointDescriptionThreshold</a>
   *
   * @implspec pointDescriptionThreshold?: (false|number);
   *
   */
  @JSProperty("pointDescriptionThreshold")
  void setPointDescriptionThreshold(boolean value);

  /**
   * (Highcharts, Highstock, Highmaps) When a series contains more points than
   * this, we no longer expose information about individual points to screen
   * readers.
   *
   * Set to <code>false</code> to disable.
   *
   * @see <a href="https://api.highcharts.com/highcharts/accessibility.pointDescriptionThreshold">https://api.highcharts.com/highcharts/accessibility.pointDescriptionThreshold</a>
   * @see <a href="https://api.highcharts.com/highstock/accessibility.pointDescriptionThreshold">https://api.highcharts.com/highstock/accessibility.pointDescriptionThreshold</a>
   * @see <a href="https://api.highcharts.com/highmaps/accessibility.pointDescriptionThreshold">https://api.highcharts.com/highmaps/accessibility.pointDescriptionThreshold</a>
   *
   * @implspec pointDescriptionThreshold?: (false|number);
   *
   */
  @JSProperty("pointDescriptionThreshold")
  void setPointDescriptionThreshold(double value);

  /**
   * (Highcharts, Highstock, Highmaps) A formatter function to create the HTML
   * contents of the hidden screen reader information region. Receives one
   * argument, <code>chart</code>, referring to the chart object. Should return a String
   * with the HTML content of the region.
   *
   * The link to view the chart as a data table will be added automatically
   * after the custom HTML content.
   *
   * @see <a href="https://api.highcharts.com/highcharts/accessibility.screenReaderSectionFormatter">https://api.highcharts.com/highcharts/accessibility.screenReaderSectionFormatter</a>
   * @see <a href="https://api.highcharts.com/highstock/accessibility.screenReaderSectionFormatter">https://api.highcharts.com/highstock/accessibility.screenReaderSectionFormatter</a>
   * @see <a href="https://api.highcharts.com/highmaps/accessibility.screenReaderSectionFormatter">https://api.highcharts.com/highmaps/accessibility.screenReaderSectionFormatter</a>
   *
   * @implspec screenReaderSectionFormatter?: () =&gt; void;
   *
   */
  @JSProperty("screenReaderSectionFormatter")
  @Nullable
  ScreenReaderSectionFormatter getScreenReaderSectionFormatter();

  /**
   * (Highcharts, Highstock, Highmaps) A formatter function to create the HTML
   * contents of the hidden screen reader information region. Receives one
   * argument, <code>chart</code>, referring to the chart object. Should return a String
   * with the HTML content of the region.
   *
   * The link to view the chart as a data table will be added automatically
   * after the custom HTML content.
   *
   * @see <a href="https://api.highcharts.com/highcharts/accessibility.screenReaderSectionFormatter">https://api.highcharts.com/highcharts/accessibility.screenReaderSectionFormatter</a>
   * @see <a href="https://api.highcharts.com/highstock/accessibility.screenReaderSectionFormatter">https://api.highcharts.com/highstock/accessibility.screenReaderSectionFormatter</a>
   * @see <a href="https://api.highcharts.com/highmaps/accessibility.screenReaderSectionFormatter">https://api.highcharts.com/highmaps/accessibility.screenReaderSectionFormatter</a>
   *
   * @implspec screenReaderSectionFormatter?: () =&gt; void;
   *
   */
  @JSProperty("screenReaderSectionFormatter")
  void setScreenReaderSectionFormatter(ScreenReaderSectionFormatter value);

  /**
   * (Highcharts, Highstock, Highmaps) Formatter function to use instead of
   * the default for series descriptions. Receives one argument, <code>series</code>,
   * referring to the series to describe. Should return a String with the
   * description of the series for a screen reader user.
   *
   * @see <a href="https://api.highcharts.com/highcharts/accessibility.seriesDescriptionFormatter">https://api.highcharts.com/highcharts/accessibility.seriesDescriptionFormatter</a>
   * @see <a href="https://api.highcharts.com/highstock/accessibility.seriesDescriptionFormatter">https://api.highcharts.com/highstock/accessibility.seriesDescriptionFormatter</a>
   * @see <a href="https://api.highcharts.com/highmaps/accessibility.seriesDescriptionFormatter">https://api.highcharts.com/highmaps/accessibility.seriesDescriptionFormatter</a>
   *
   * @implspec seriesDescriptionFormatter?: () =&gt; void;
   *
   */
  @JSProperty("seriesDescriptionFormatter")
  @Nullable
  SeriesDescriptionFormatter getSeriesDescriptionFormatter();

  /**
   * (Highcharts, Highstock, Highmaps) Formatter function to use instead of
   * the default for series descriptions. Receives one argument, <code>series</code>,
   * referring to the series to describe. Should return a String with the
   * description of the series for a screen reader user.
   *
   * @see <a href="https://api.highcharts.com/highcharts/accessibility.seriesDescriptionFormatter">https://api.highcharts.com/highcharts/accessibility.seriesDescriptionFormatter</a>
   * @see <a href="https://api.highcharts.com/highstock/accessibility.seriesDescriptionFormatter">https://api.highcharts.com/highstock/accessibility.seriesDescriptionFormatter</a>
   * @see <a href="https://api.highcharts.com/highmaps/accessibility.seriesDescriptionFormatter">https://api.highcharts.com/highmaps/accessibility.seriesDescriptionFormatter</a>
   *
   * @implspec seriesDescriptionFormatter?: () =&gt; void;
   *
   */
  @JSProperty("seriesDescriptionFormatter")
  void setSeriesDescriptionFormatter(SeriesDescriptionFormatter value);

  /**
   */
  @JSFunctor
  @FunctionalInterface
  interface OnTableAnchorClick extends Any {
    void apply();
  }

  /**
   */
  @JSFunctor
  @FunctionalInterface
  interface PointDateFormatter extends Any {
    void apply();
  }

  /**
   */
  @JSFunctor
  @FunctionalInterface
  interface PointDescriptionFormatter extends Any {
    void apply();
  }

  /**
   */
  @JSFunctor
  @FunctionalInterface
  interface ScreenReaderSectionFormatter extends Any {
    void apply();
  }

  /**
   */
  @JSFunctor
  @FunctionalInterface
  interface SeriesDescriptionFormatter extends Any {
    void apply();
  }
}
