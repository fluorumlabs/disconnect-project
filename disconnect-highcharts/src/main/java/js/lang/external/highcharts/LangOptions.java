package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Highmaps, Gantt) Language object. The language object
 * is global and it can't be set on each chart initialization. Instead, use
 * <code>Highcharts.setOptions</code> to set it before any chart is initialized. (see
 * online documentation for example)
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface LangOptions extends Any {
  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Configure the accessibility
   * strings in the chart. Requires the accessibility module to be loaded. For
   * a description of the module and information on its features, see
   * Highcharts Accessibility.
   *
   * For more dynamic control over the accessibility functionality, see
   * accessibility.pointDescriptionFormatter,
   * accessibility.seriesDescriptionFormatter, and
   * accessibility.screenReaderSectionFormatter.
   *
   */
  @JSProperty("accessibility")
  @Nullable
  LangAccessibilityOptions getAccessibility();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Configure the accessibility
   * strings in the chart. Requires the accessibility module to be loaded. For
   * a description of the module and information on its features, see
   * Highcharts Accessibility.
   *
   * For more dynamic control over the accessibility functionality, see
   * accessibility.pointDescriptionFormatter,
   * accessibility.seriesDescriptionFormatter, and
   * accessibility.screenReaderSectionFormatter.
   *
   */
  @JSProperty("accessibility")
  void setAccessibility(@Nullable LangAccessibilityOptions value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Exporting module menu. The
   * tooltip title for the context menu holding print and export menu items.
   *
   */
  @JSProperty("contextButtonTitle")
  @Nullable
  String getContextButtonTitle();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Exporting module menu. The
   * tooltip title for the context menu holding print and export menu items.
   *
   */
  @JSProperty("contextButtonTitle")
  void setContextButtonTitle(@Nullable String value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The default decimal point used
   * in the <code>Highcharts.numberFormat</code> method unless otherwise specified in the
   * function arguments.
   *
   */
  @JSProperty("decimalPoint")
  @Nullable
  String getDecimalPoint();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The default decimal point used
   * in the <code>Highcharts.numberFormat</code> method unless otherwise specified in the
   * function arguments.
   *
   */
  @JSProperty("decimalPoint")
  void setDecimalPoint(@Nullable String value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The text for the menu item.
   *
   */
  @JSProperty("downloadCSV")
  @Nullable
  String getDownloadCSV();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The text for the menu item.
   *
   */
  @JSProperty("downloadCSV")
  void setDownloadCSV(@Nullable String value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Exporting module only. The text
   * for the JPEG download menu item.
   *
   */
  @JSProperty("downloadJPEG")
  @Nullable
  String getDownloadJPEG();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Exporting module only. The text
   * for the JPEG download menu item.
   *
   */
  @JSProperty("downloadJPEG")
  void setDownloadJPEG(@Nullable String value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Exporting module only. The text
   * for the PDF download menu item.
   *
   */
  @JSProperty("downloadPDF")
  @Nullable
  String getDownloadPDF();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Exporting module only. The text
   * for the PDF download menu item.
   *
   */
  @JSProperty("downloadPDF")
  void setDownloadPDF(@Nullable String value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Exporting module only. The text
   * for the PNG download menu item.
   *
   */
  @JSProperty("downloadPNG")
  @Nullable
  String getDownloadPNG();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Exporting module only. The text
   * for the PNG download menu item.
   *
   */
  @JSProperty("downloadPNG")
  void setDownloadPNG(@Nullable String value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Exporting module only. The text
   * for the SVG download menu item.
   *
   */
  @JSProperty("downloadSVG")
  @Nullable
  String getDownloadSVG();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Exporting module only. The text
   * for the SVG download menu item.
   *
   */
  @JSProperty("downloadSVG")
  void setDownloadSVG(@Nullable String value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The text for the menu item.
   *
   */
  @JSProperty("downloadXLS")
  @Nullable
  String getDownloadXLS();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The text for the menu item.
   *
   */
  @JSProperty("downloadXLS")
  void setDownloadXLS(@Nullable String value);

  /**
   * (Highcharts, Highmaps) The text for the button that appears when drilling
   * down, linking back to the parent series. The parent series' name is
   * inserted for <code>{series.name}</code>.
   *
   */
  @JSProperty("drillUpText")
  @Nullable
  String getDrillUpText();

  /**
   * (Highcharts, Highmaps) The text for the button that appears when drilling
   * down, linking back to the parent series. The parent series' name is
   * inserted for <code>{series.name}</code>.
   *
   */
  @JSProperty("drillUpText")
  void setDrillUpText(@Nullable String value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Exporting module only. The text
   * for the menu item to exit the chart from full screen.
   *
   */
  @JSProperty("exitFullscreen")
  @Nullable
  String getExitFullscreen();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Exporting module only. The text
   * for the menu item to exit the chart from full screen.
   *
   */
  @JSProperty("exitFullscreen")
  void setExitFullscreen(@Nullable String value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The text for exported table.
   *
   */
  @JSProperty("exportData")
  @Nullable
  LangExportDataOptions getExportData();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The text for exported table.
   *
   */
  @JSProperty("exportData")
  void setExportData(@Nullable LangExportDataOptions value);

  /**
   * (Highcharts, Highstock) What to show in a date field for invalid dates.
   * Defaults to an empty string.
   *
   */
  @JSProperty("invalidDate")
  @Nullable
  String getInvalidDate();

  /**
   * (Highcharts, Highstock) What to show in a date field for invalid dates.
   * Defaults to an empty string.
   *
   */
  @JSProperty("invalidDate")
  void setInvalidDate(@Nullable String value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The loading text that appears
   * when the chart is set into the loading state following a call to
   * <code>chart.showLoading</code>.
   *
   */
  @JSProperty("loading")
  @Nullable
  String getLoading();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The loading text that appears
   * when the chart is set into the loading state following a call to
   * <code>chart.showLoading</code>.
   *
   */
  @JSProperty("loading")
  void setLoading(@Nullable String value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) An array containing the months
   * names. Corresponds to the <code>%B</code> format in <code>Highcharts.dateFormat()</code>.
   *
   */
  @JSProperty("months")
  @Nullable
  String[] getMonths();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) An array containing the months
   * names. Corresponds to the <code>%B</code> format in <code>Highcharts.dateFormat()</code>.
   *
   */
  @JSProperty("months")
  void setMonths(String[] value);

  /**
   * (Highcharts, Highstock) Configure the Popup strings in the chart.
   * Requires the <code>annotations.js</code> or <code>annotations-advanced.src.js</code> module to
   * be loaded.
   *
   */
  @JSProperty("navigation")
  @Nullable
  LangNavigationOptions getNavigation();

  /**
   * (Highcharts, Highstock) Configure the Popup strings in the chart.
   * Requires the <code>annotations.js</code> or <code>annotations-advanced.src.js</code> module to
   * be loaded.
   *
   */
  @JSProperty("navigation")
  void setNavigation(@Nullable LangNavigationOptions value);

  /**
   * (Highcharts, Highstock) The text to display when the chart contains no
   * data.
   *
   */
  @JSProperty("noData")
  @Nullable
  String getNoData();

  /**
   * (Highcharts, Highstock) The text to display when the chart contains no
   * data.
   *
   */
  @JSProperty("noData")
  void setNoData(@Nullable String value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The magnitude of numericSymbols
   * replacements. Use 10000 for Japanese, Korean and various Chinese locales,
   * which use symbols for 10^4, 10^8 and 10^12.
   *
   */
  @JSProperty("numericSymbolMagnitude")
  double getNumericSymbolMagnitude();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The magnitude of numericSymbols
   * replacements. Use 10000 for Japanese, Korean and various Chinese locales,
   * which use symbols for 10^4, 10^8 and 10^12.
   *
   */
  @JSProperty("numericSymbolMagnitude")
  void setNumericSymbolMagnitude(double value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Metric prefixes used to shorten
   * high numbers in axis labels. Replacing any of the positions with <code>null</code>
   * causes the full number to be written. Setting <code>numericSymbols</code> to <code>null</code>
   * disables shortening altogether.
   *
   */
  @JSProperty("numericSymbols")
  @Nullable
  String[] getNumericSymbols();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Metric prefixes used to shorten
   * high numbers in axis labels. Replacing any of the positions with <code>null</code>
   * causes the full number to be written. Setting <code>numericSymbols</code> to <code>null</code>
   * disables shortening altogether.
   *
   */
  @JSProperty("numericSymbols")
  void setNumericSymbols(String[] value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Exporting module only. The text
   * for the menu item to print the chart.
   *
   */
  @JSProperty("printChart")
  @Nullable
  String getPrintChart();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Exporting module only. The text
   * for the menu item to print the chart.
   *
   */
  @JSProperty("printChart")
  void setPrintChart(@Nullable String value);

  /**
   * (Highstock, Gantt) The text for the label for the &quot;from&quot; input box in the
   * range selector.
   *
   */
  @JSProperty("rangeSelectorFrom")
  @Nullable
  String getRangeSelectorFrom();

  /**
   * (Highstock, Gantt) The text for the label for the &quot;from&quot; input box in the
   * range selector.
   *
   */
  @JSProperty("rangeSelectorFrom")
  void setRangeSelectorFrom(@Nullable String value);

  /**
   * (Highstock, Gantt) The text for the label for the &quot;to&quot; input box in the
   * range selector.
   *
   */
  @JSProperty("rangeSelectorTo")
  @Nullable
  String getRangeSelectorTo();

  /**
   * (Highstock, Gantt) The text for the label for the &quot;to&quot; input box in the
   * range selector.
   *
   */
  @JSProperty("rangeSelectorTo")
  void setRangeSelectorTo(@Nullable String value);

  /**
   * (Highstock, Gantt) The text for the label for the range selector buttons.
   *
   */
  @JSProperty("rangeSelectorZoom")
  @Nullable
  String getRangeSelectorZoom();

  /**
   * (Highstock, Gantt) The text for the label for the range selector buttons.
   *
   */
  @JSProperty("rangeSelectorZoom")
  void setRangeSelectorZoom(@Nullable String value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The text for the label appearing
   * when a chart is zoomed.
   *
   */
  @JSProperty("resetZoom")
  @Nullable
  String getResetZoom();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The text for the label appearing
   * when a chart is zoomed.
   *
   */
  @JSProperty("resetZoom")
  void setResetZoom(@Nullable String value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The tooltip title for the label
   * appearing when a chart is zoomed.
   *
   */
  @JSProperty("resetZoomTitle")
  @Nullable
  String getResetZoomTitle();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The tooltip title for the label
   * appearing when a chart is zoomed.
   *
   */
  @JSProperty("resetZoomTitle")
  void setResetZoomTitle(@Nullable String value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) An array containing the months
   * names in abbreviated form. Corresponds to the <code>%b</code> format in
   * <code>Highcharts.dateFormat()</code>.
   *
   */
  @JSProperty("shortMonths")
  @Nullable
  String[] getShortMonths();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) An array containing the months
   * names in abbreviated form. Corresponds to the <code>%b</code> format in
   * <code>Highcharts.dateFormat()</code>.
   *
   */
  @JSProperty("shortMonths")
  void setShortMonths(String[] value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Short week days, starting
   * Sunday. If not specified, Highcharts uses the first three letters of the
   * <code>lang.weekdays</code> option.
   *
   */
  @JSProperty("shortWeekdays")
  @Nullable
  String[] getShortWeekdays();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Short week days, starting
   * Sunday. If not specified, Highcharts uses the first three letters of the
   * <code>lang.weekdays</code> option.
   *
   */
  @JSProperty("shortWeekdays")
  void setShortWeekdays(String[] value);

  /**
   * (Highstock) Configure the stockTools GUI titles(hints) in the chart.
   * Requires the <code>stock-tools.js</code> module to be loaded.
   *
   */
  @JSProperty("stockTools")
  @Nullable
  LangStockToolsOptions getStockTools();

  /**
   * (Highstock) Configure the stockTools GUI titles(hints) in the chart.
   * Requires the <code>stock-tools.js</code> module to be loaded.
   *
   */
  @JSProperty("stockTools")
  void setStockTools(@Nullable LangStockToolsOptions value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The default thousands separator
   * used in the <code>Highcharts.numberFormat</code> method unless otherwise specified
   * in the function arguments. Defaults to a single space character, which is
   * recommended in ISO 31-0 and works across Anglo-American and continental
   * European languages.
   *
   */
  @JSProperty("thousandsSep")
  @Nullable
  String getThousandsSep();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The default thousands separator
   * used in the <code>Highcharts.numberFormat</code> method unless otherwise specified
   * in the function arguments. Defaults to a single space character, which is
   * recommended in ISO 31-0 and works across Anglo-American and continental
   * European languages.
   *
   */
  @JSProperty("thousandsSep")
  void setThousandsSep(@Nullable String value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The text for the menu item.
   *
   */
  @JSProperty("viewData")
  @Nullable
  String getViewData();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The text for the menu item.
   *
   */
  @JSProperty("viewData")
  void setViewData(@Nullable String value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Exporting module only. The text
   * for the menu item to view the chart in full screen.
   *
   */
  @JSProperty("viewFullscreen")
  @Nullable
  String getViewFullscreen();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Exporting module only. The text
   * for the menu item to view the chart in full screen.
   *
   */
  @JSProperty("viewFullscreen")
  void setViewFullscreen(@Nullable String value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) An array containing the weekday
   * names.
   *
   */
  @JSProperty("weekdays")
  @Nullable
  String[] getWeekdays();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) An array containing the weekday
   * names.
   *
   */
  @JSProperty("weekdays")
  void setWeekdays(String[] value);

  /**
   * (Highmaps) The title appearing on hovering the zoom in button. The text
   * itself defaults to &quot;+&quot; and can be changed in the button options.
   *
   */
  @JSProperty("zoomIn")
  @Nullable
  String getZoomIn();

  /**
   * (Highmaps) The title appearing on hovering the zoom in button. The text
   * itself defaults to &quot;+&quot; and can be changed in the button options.
   *
   */
  @JSProperty("zoomIn")
  void setZoomIn(@Nullable String value);

  /**
   * (Highmaps) The title appearing on hovering the zoom out button. The text
   * itself defaults to &quot;-&quot; and can be changed in the button options.
   *
   */
  @JSProperty("zoomOut")
  @Nullable
  String getZoomOut();

  /**
   * (Highmaps) The title appearing on hovering the zoom out button. The text
   * itself defaults to &quot;-&quot; and can be changed in the button options.
   *
   */
  @JSProperty("zoomOut")
  void setZoomOut(@Nullable String value);

  class Builder {
    private final LangOptions object = Any.empty();

    public LangOptions build() {
      return object;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Configure the accessibility
     * strings in the chart. Requires the accessibility module to be loaded. For
     * a description of the module and information on its features, see
     * Highcharts Accessibility.
     *
     * For more dynamic control over the accessibility functionality, see
     * accessibility.pointDescriptionFormatter,
     * accessibility.seriesDescriptionFormatter, and
     * accessibility.screenReaderSectionFormatter.
     *
     */
    public Builder accessibility(@Nullable LangAccessibilityOptions value) {
      object.setAccessibility(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Exporting module menu. The
     * tooltip title for the context menu holding print and export menu items.
     *
     */
    public Builder contextButtonTitle(@Nullable String value) {
      object.setContextButtonTitle(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The default decimal point used
     * in the <code>Highcharts.numberFormat</code> method unless otherwise specified in the
     * function arguments.
     *
     */
    public Builder decimalPoint(@Nullable String value) {
      object.setDecimalPoint(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The text for the menu item.
     *
     */
    public Builder downloadCSV(@Nullable String value) {
      object.setDownloadCSV(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Exporting module only. The text
     * for the JPEG download menu item.
     *
     */
    public Builder downloadJPEG(@Nullable String value) {
      object.setDownloadJPEG(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Exporting module only. The text
     * for the PDF download menu item.
     *
     */
    public Builder downloadPDF(@Nullable String value) {
      object.setDownloadPDF(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Exporting module only. The text
     * for the PNG download menu item.
     *
     */
    public Builder downloadPNG(@Nullable String value) {
      object.setDownloadPNG(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Exporting module only. The text
     * for the SVG download menu item.
     *
     */
    public Builder downloadSVG(@Nullable String value) {
      object.setDownloadSVG(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The text for the menu item.
     *
     */
    public Builder downloadXLS(@Nullable String value) {
      object.setDownloadXLS(value);
      return this;
    }

    /**
     * (Highcharts, Highmaps) The text for the button that appears when drilling
     * down, linking back to the parent series. The parent series' name is
     * inserted for <code>{series.name}</code>.
     *
     */
    public Builder drillUpText(@Nullable String value) {
      object.setDrillUpText(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Exporting module only. The text
     * for the menu item to exit the chart from full screen.
     *
     */
    public Builder exitFullscreen(@Nullable String value) {
      object.setExitFullscreen(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The text for exported table.
     *
     */
    public Builder exportData(@Nullable LangExportDataOptions value) {
      object.setExportData(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) What to show in a date field for invalid dates.
     * Defaults to an empty string.
     *
     */
    public Builder invalidDate(@Nullable String value) {
      object.setInvalidDate(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The loading text that appears
     * when the chart is set into the loading state following a call to
     * <code>chart.showLoading</code>.
     *
     */
    public Builder loading(@Nullable String value) {
      object.setLoading(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) An array containing the months
     * names. Corresponds to the <code>%B</code> format in <code>Highcharts.dateFormat()</code>.
     *
     */
    public Builder months(String[] value) {
      object.setMonths(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) Configure the Popup strings in the chart.
     * Requires the <code>annotations.js</code> or <code>annotations-advanced.src.js</code> module to
     * be loaded.
     *
     */
    public Builder navigation(@Nullable LangNavigationOptions value) {
      object.setNavigation(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) The text to display when the chart contains no
     * data.
     *
     */
    public Builder noData(@Nullable String value) {
      object.setNoData(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The magnitude of numericSymbols
     * replacements. Use 10000 for Japanese, Korean and various Chinese locales,
     * which use symbols for 10^4, 10^8 and 10^12.
     *
     */
    public Builder numericSymbolMagnitude(double value) {
      object.setNumericSymbolMagnitude(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Metric prefixes used to shorten
     * high numbers in axis labels. Replacing any of the positions with <code>null</code>
     * causes the full number to be written. Setting <code>numericSymbols</code> to <code>null</code>
     * disables shortening altogether.
     *
     */
    public Builder numericSymbols(String[] value) {
      object.setNumericSymbols(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Exporting module only. The text
     * for the menu item to print the chart.
     *
     */
    public Builder printChart(@Nullable String value) {
      object.setPrintChart(value);
      return this;
    }

    /**
     * (Highstock, Gantt) The text for the label for the &quot;from&quot; input box in the
     * range selector.
     *
     */
    public Builder rangeSelectorFrom(@Nullable String value) {
      object.setRangeSelectorFrom(value);
      return this;
    }

    /**
     * (Highstock, Gantt) The text for the label for the &quot;to&quot; input box in the
     * range selector.
     *
     */
    public Builder rangeSelectorTo(@Nullable String value) {
      object.setRangeSelectorTo(value);
      return this;
    }

    /**
     * (Highstock, Gantt) The text for the label for the range selector buttons.
     *
     */
    public Builder rangeSelectorZoom(@Nullable String value) {
      object.setRangeSelectorZoom(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The text for the label appearing
     * when a chart is zoomed.
     *
     */
    public Builder resetZoom(@Nullable String value) {
      object.setResetZoom(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The tooltip title for the label
     * appearing when a chart is zoomed.
     *
     */
    public Builder resetZoomTitle(@Nullable String value) {
      object.setResetZoomTitle(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) An array containing the months
     * names in abbreviated form. Corresponds to the <code>%b</code> format in
     * <code>Highcharts.dateFormat()</code>.
     *
     */
    public Builder shortMonths(String[] value) {
      object.setShortMonths(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Short week days, starting
     * Sunday. If not specified, Highcharts uses the first three letters of the
     * <code>lang.weekdays</code> option.
     *
     */
    public Builder shortWeekdays(String[] value) {
      object.setShortWeekdays(value);
      return this;
    }

    /**
     * (Highstock) Configure the stockTools GUI titles(hints) in the chart.
     * Requires the <code>stock-tools.js</code> module to be loaded.
     *
     */
    public Builder stockTools(@Nullable LangStockToolsOptions value) {
      object.setStockTools(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The default thousands separator
     * used in the <code>Highcharts.numberFormat</code> method unless otherwise specified
     * in the function arguments. Defaults to a single space character, which is
     * recommended in ISO 31-0 and works across Anglo-American and continental
     * European languages.
     *
     */
    public Builder thousandsSep(@Nullable String value) {
      object.setThousandsSep(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The text for the menu item.
     *
     */
    public Builder viewData(@Nullable String value) {
      object.setViewData(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Exporting module only. The text
     * for the menu item to view the chart in full screen.
     *
     */
    public Builder viewFullscreen(@Nullable String value) {
      object.setViewFullscreen(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) An array containing the weekday
     * names.
     *
     */
    public Builder weekdays(String[] value) {
      object.setWeekdays(value);
      return this;
    }

    /**
     * (Highmaps) The title appearing on hovering the zoom in button. The text
     * itself defaults to &quot;+&quot; and can be changed in the button options.
     *
     */
    public Builder zoomIn(@Nullable String value) {
      object.setZoomIn(value);
      return this;
    }

    /**
     * (Highmaps) The title appearing on hovering the zoom out button. The text
     * itself defaults to &quot;-&quot; and can be changed in the button options.
     *
     */
    public Builder zoomOut(@Nullable String value) {
      object.setZoomOut(value);
      return this;
    }
  }
}
