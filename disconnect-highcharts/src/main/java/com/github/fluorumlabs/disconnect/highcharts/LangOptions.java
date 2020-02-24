package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Highmaps) Language object. The language object is
 * global and it can't be set on each chart initiation. Instead, use
 * <code>Highcharts.setOptions</code> to set it before any chart is initialized.
 *
 * (see online documentation for example)
 *
 * @see <a href="https://api.highcharts.com/highcharts/lang">https://api.highcharts.com/highcharts/lang</a>
 * @see <a href="https://api.highcharts.com/highstock/lang">https://api.highcharts.com/highstock/lang</a>
 * @see <a href="https://api.highcharts.com/highmaps/lang">https://api.highcharts.com/highmaps/lang</a>
 *
 */
public interface LangOptions extends Any {
  /**
   * (Highcharts, Highstock, Highmaps) Configure the accessibility strings in
   * the chart. Requires the accessibility module to be loaded. For a
   * description of the module and information on its features, see Highcharts
   * Accessibility.
   *
   * For more dynamic control over the accessibility functionality, see
   * accessibility.pointDescriptionFormatter,
   * accessibility.seriesDescriptionFormatter, and
   * accessibility.screenReaderSectionFormatter.
   *
   * @see <a href="https://api.highcharts.com/highcharts/lang.accessibility">https://api.highcharts.com/highcharts/lang.accessibility</a>
   * @see <a href="https://api.highcharts.com/highstock/lang.accessibility">https://api.highcharts.com/highstock/lang.accessibility</a>
   * @see <a href="https://api.highcharts.com/highmaps/lang.accessibility">https://api.highcharts.com/highmaps/lang.accessibility</a>
   *
   * @implspec accessibility?: LangAccessibilityOptions;
   *
   */
  @JSProperty("accessibility")
  @Nullable
  LangAccessibilityOptions getAccessibility();

  /**
   * (Highcharts, Highstock, Highmaps) Configure the accessibility strings in
   * the chart. Requires the accessibility module to be loaded. For a
   * description of the module and information on its features, see Highcharts
   * Accessibility.
   *
   * For more dynamic control over the accessibility functionality, see
   * accessibility.pointDescriptionFormatter,
   * accessibility.seriesDescriptionFormatter, and
   * accessibility.screenReaderSectionFormatter.
   *
   * @see <a href="https://api.highcharts.com/highcharts/lang.accessibility">https://api.highcharts.com/highcharts/lang.accessibility</a>
   * @see <a href="https://api.highcharts.com/highstock/lang.accessibility">https://api.highcharts.com/highstock/lang.accessibility</a>
   * @see <a href="https://api.highcharts.com/highmaps/lang.accessibility">https://api.highcharts.com/highmaps/lang.accessibility</a>
   *
   * @implspec accessibility?: LangAccessibilityOptions;
   *
   */
  @JSProperty("accessibility")
  void setAccessibility(LangAccessibilityOptions value);

  /**
   * (Highcharts, Highstock, Highmaps) Exporting module menu. The tooltip
   * title for the context menu holding print and export menu items.
   *
   * @see <a href="https://api.highcharts.com/highcharts/lang.contextButtonTitle">https://api.highcharts.com/highcharts/lang.contextButtonTitle</a>
   * @see <a href="https://api.highcharts.com/highstock/lang.contextButtonTitle">https://api.highcharts.com/highstock/lang.contextButtonTitle</a>
   * @see <a href="https://api.highcharts.com/highmaps/lang.contextButtonTitle">https://api.highcharts.com/highmaps/lang.contextButtonTitle</a>
   *
   * @implspec contextButtonTitle?: string;
   *
   */
  @JSProperty("contextButtonTitle")
  @Nullable
  String getContextButtonTitle();

  /**
   * (Highcharts, Highstock, Highmaps) Exporting module menu. The tooltip
   * title for the context menu holding print and export menu items.
   *
   * @see <a href="https://api.highcharts.com/highcharts/lang.contextButtonTitle">https://api.highcharts.com/highcharts/lang.contextButtonTitle</a>
   * @see <a href="https://api.highcharts.com/highstock/lang.contextButtonTitle">https://api.highcharts.com/highstock/lang.contextButtonTitle</a>
   * @see <a href="https://api.highcharts.com/highmaps/lang.contextButtonTitle">https://api.highcharts.com/highmaps/lang.contextButtonTitle</a>
   *
   * @implspec contextButtonTitle?: string;
   *
   */
  @JSProperty("contextButtonTitle")
  void setContextButtonTitle(String value);

  /**
   * (Highcharts, Highstock, Highmaps) The default decimal point used in the
   * <code>Highcharts.numberFormat</code> method unless otherwise specified in the
   * function arguments.
   *
   * @see <a href="https://api.highcharts.com/highcharts/lang.decimalPoint">https://api.highcharts.com/highcharts/lang.decimalPoint</a>
   * @see <a href="https://api.highcharts.com/highstock/lang.decimalPoint">https://api.highcharts.com/highstock/lang.decimalPoint</a>
   * @see <a href="https://api.highcharts.com/highmaps/lang.decimalPoint">https://api.highcharts.com/highmaps/lang.decimalPoint</a>
   *
   * @implspec decimalPoint?: string;
   *
   */
  @JSProperty("decimalPoint")
  @Nullable
  String getDecimalPoint();

  /**
   * (Highcharts, Highstock, Highmaps) The default decimal point used in the
   * <code>Highcharts.numberFormat</code> method unless otherwise specified in the
   * function arguments.
   *
   * @see <a href="https://api.highcharts.com/highcharts/lang.decimalPoint">https://api.highcharts.com/highcharts/lang.decimalPoint</a>
   * @see <a href="https://api.highcharts.com/highstock/lang.decimalPoint">https://api.highcharts.com/highstock/lang.decimalPoint</a>
   * @see <a href="https://api.highcharts.com/highmaps/lang.decimalPoint">https://api.highcharts.com/highmaps/lang.decimalPoint</a>
   *
   * @implspec decimalPoint?: string;
   *
   */
  @JSProperty("decimalPoint")
  void setDecimalPoint(String value);

  /**
   * (Highcharts, Highstock, Highmaps) Export-data module only. The text for
   * the menu item.
   *
   * @see <a href="https://api.highcharts.com/highcharts/lang.downloadCSV">https://api.highcharts.com/highcharts/lang.downloadCSV</a>
   * @see <a href="https://api.highcharts.com/highstock/lang.downloadCSV">https://api.highcharts.com/highstock/lang.downloadCSV</a>
   * @see <a href="https://api.highcharts.com/highmaps/lang.downloadCSV">https://api.highcharts.com/highmaps/lang.downloadCSV</a>
   *
   * @implspec downloadCSV?: string;
   *
   */
  @JSProperty("downloadCSV")
  @Nullable
  String getDownloadCSV();

  /**
   * (Highcharts, Highstock, Highmaps) Export-data module only. The text for
   * the menu item.
   *
   * @see <a href="https://api.highcharts.com/highcharts/lang.downloadCSV">https://api.highcharts.com/highcharts/lang.downloadCSV</a>
   * @see <a href="https://api.highcharts.com/highstock/lang.downloadCSV">https://api.highcharts.com/highstock/lang.downloadCSV</a>
   * @see <a href="https://api.highcharts.com/highmaps/lang.downloadCSV">https://api.highcharts.com/highmaps/lang.downloadCSV</a>
   *
   * @implspec downloadCSV?: string;
   *
   */
  @JSProperty("downloadCSV")
  void setDownloadCSV(String value);

  /**
   * (Highcharts, Highstock, Highmaps) Exporting module only. The text for the
   * JPEG download menu item.
   *
   * @see <a href="https://api.highcharts.com/highcharts/lang.downloadJPEG">https://api.highcharts.com/highcharts/lang.downloadJPEG</a>
   * @see <a href="https://api.highcharts.com/highstock/lang.downloadJPEG">https://api.highcharts.com/highstock/lang.downloadJPEG</a>
   * @see <a href="https://api.highcharts.com/highmaps/lang.downloadJPEG">https://api.highcharts.com/highmaps/lang.downloadJPEG</a>
   *
   * @implspec downloadJPEG?: string;
   *
   */
  @JSProperty("downloadJPEG")
  @Nullable
  String getDownloadJPEG();

  /**
   * (Highcharts, Highstock, Highmaps) Exporting module only. The text for the
   * JPEG download menu item.
   *
   * @see <a href="https://api.highcharts.com/highcharts/lang.downloadJPEG">https://api.highcharts.com/highcharts/lang.downloadJPEG</a>
   * @see <a href="https://api.highcharts.com/highstock/lang.downloadJPEG">https://api.highcharts.com/highstock/lang.downloadJPEG</a>
   * @see <a href="https://api.highcharts.com/highmaps/lang.downloadJPEG">https://api.highcharts.com/highmaps/lang.downloadJPEG</a>
   *
   * @implspec downloadJPEG?: string;
   *
   */
  @JSProperty("downloadJPEG")
  void setDownloadJPEG(String value);

  /**
   * (Highcharts, Highstock, Highmaps) Exporting module only. The text for the
   * PDF download menu item.
   *
   * @see <a href="https://api.highcharts.com/highcharts/lang.downloadPDF">https://api.highcharts.com/highcharts/lang.downloadPDF</a>
   * @see <a href="https://api.highcharts.com/highstock/lang.downloadPDF">https://api.highcharts.com/highstock/lang.downloadPDF</a>
   * @see <a href="https://api.highcharts.com/highmaps/lang.downloadPDF">https://api.highcharts.com/highmaps/lang.downloadPDF</a>
   *
   * @implspec downloadPDF?: string;
   *
   */
  @JSProperty("downloadPDF")
  @Nullable
  String getDownloadPDF();

  /**
   * (Highcharts, Highstock, Highmaps) Exporting module only. The text for the
   * PDF download menu item.
   *
   * @see <a href="https://api.highcharts.com/highcharts/lang.downloadPDF">https://api.highcharts.com/highcharts/lang.downloadPDF</a>
   * @see <a href="https://api.highcharts.com/highstock/lang.downloadPDF">https://api.highcharts.com/highstock/lang.downloadPDF</a>
   * @see <a href="https://api.highcharts.com/highmaps/lang.downloadPDF">https://api.highcharts.com/highmaps/lang.downloadPDF</a>
   *
   * @implspec downloadPDF?: string;
   *
   */
  @JSProperty("downloadPDF")
  void setDownloadPDF(String value);

  /**
   * (Highcharts, Highstock, Highmaps) Exporting module only. The text for the
   * PNG download menu item.
   *
   * @see <a href="https://api.highcharts.com/highcharts/lang.downloadPNG">https://api.highcharts.com/highcharts/lang.downloadPNG</a>
   * @see <a href="https://api.highcharts.com/highstock/lang.downloadPNG">https://api.highcharts.com/highstock/lang.downloadPNG</a>
   * @see <a href="https://api.highcharts.com/highmaps/lang.downloadPNG">https://api.highcharts.com/highmaps/lang.downloadPNG</a>
   *
   * @implspec downloadPNG?: string;
   *
   */
  @JSProperty("downloadPNG")
  @Nullable
  String getDownloadPNG();

  /**
   * (Highcharts, Highstock, Highmaps) Exporting module only. The text for the
   * PNG download menu item.
   *
   * @see <a href="https://api.highcharts.com/highcharts/lang.downloadPNG">https://api.highcharts.com/highcharts/lang.downloadPNG</a>
   * @see <a href="https://api.highcharts.com/highstock/lang.downloadPNG">https://api.highcharts.com/highstock/lang.downloadPNG</a>
   * @see <a href="https://api.highcharts.com/highmaps/lang.downloadPNG">https://api.highcharts.com/highmaps/lang.downloadPNG</a>
   *
   * @implspec downloadPNG?: string;
   *
   */
  @JSProperty("downloadPNG")
  void setDownloadPNG(String value);

  /**
   * (Highcharts, Highstock, Highmaps) Exporting module only. The text for the
   * SVG download menu item.
   *
   * @see <a href="https://api.highcharts.com/highcharts/lang.downloadSVG">https://api.highcharts.com/highcharts/lang.downloadSVG</a>
   * @see <a href="https://api.highcharts.com/highstock/lang.downloadSVG">https://api.highcharts.com/highstock/lang.downloadSVG</a>
   * @see <a href="https://api.highcharts.com/highmaps/lang.downloadSVG">https://api.highcharts.com/highmaps/lang.downloadSVG</a>
   *
   * @implspec downloadSVG?: string;
   *
   */
  @JSProperty("downloadSVG")
  @Nullable
  String getDownloadSVG();

  /**
   * (Highcharts, Highstock, Highmaps) Exporting module only. The text for the
   * SVG download menu item.
   *
   * @see <a href="https://api.highcharts.com/highcharts/lang.downloadSVG">https://api.highcharts.com/highcharts/lang.downloadSVG</a>
   * @see <a href="https://api.highcharts.com/highstock/lang.downloadSVG">https://api.highcharts.com/highstock/lang.downloadSVG</a>
   * @see <a href="https://api.highcharts.com/highmaps/lang.downloadSVG">https://api.highcharts.com/highmaps/lang.downloadSVG</a>
   *
   * @implspec downloadSVG?: string;
   *
   */
  @JSProperty("downloadSVG")
  void setDownloadSVG(String value);

  /**
   * (Highcharts, Highstock, Highmaps) Export-data module only. The text for
   * the menu item.
   *
   * @see <a href="https://api.highcharts.com/highcharts/lang.downloadXLS">https://api.highcharts.com/highcharts/lang.downloadXLS</a>
   * @see <a href="https://api.highcharts.com/highstock/lang.downloadXLS">https://api.highcharts.com/highstock/lang.downloadXLS</a>
   * @see <a href="https://api.highcharts.com/highmaps/lang.downloadXLS">https://api.highcharts.com/highmaps/lang.downloadXLS</a>
   *
   * @implspec downloadXLS?: string;
   *
   */
  @JSProperty("downloadXLS")
  @Nullable
  String getDownloadXLS();

  /**
   * (Highcharts, Highstock, Highmaps) Export-data module only. The text for
   * the menu item.
   *
   * @see <a href="https://api.highcharts.com/highcharts/lang.downloadXLS">https://api.highcharts.com/highcharts/lang.downloadXLS</a>
   * @see <a href="https://api.highcharts.com/highstock/lang.downloadXLS">https://api.highcharts.com/highstock/lang.downloadXLS</a>
   * @see <a href="https://api.highcharts.com/highmaps/lang.downloadXLS">https://api.highcharts.com/highmaps/lang.downloadXLS</a>
   *
   * @implspec downloadXLS?: string;
   *
   */
  @JSProperty("downloadXLS")
  void setDownloadXLS(String value);

  /**
   * (Highcharts, Highmaps) The text for the button that appears when drilling
   * down, linking back to the parent series. The parent series' name is
   * inserted for <code>{series.name}</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/lang.drillUpText">https://api.highcharts.com/highcharts/lang.drillUpText</a>
   * @see <a href="https://api.highcharts.com/highmaps/lang.drillUpText">https://api.highcharts.com/highmaps/lang.drillUpText</a>
   *
   * @implspec drillUpText?: string;
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
   * @see <a href="https://api.highcharts.com/highcharts/lang.drillUpText">https://api.highcharts.com/highcharts/lang.drillUpText</a>
   * @see <a href="https://api.highcharts.com/highmaps/lang.drillUpText">https://api.highcharts.com/highmaps/lang.drillUpText</a>
   *
   * @implspec drillUpText?: string;
   *
   */
  @JSProperty("drillUpText")
  void setDrillUpText(String value);

  /**
   * (Highcharts, Highstock) What to show in a date field for invalid dates.
   * Defaults to an empty string.
   *
   * @see <a href="https://api.highcharts.com/highcharts/lang.invalidDate">https://api.highcharts.com/highcharts/lang.invalidDate</a>
   * @see <a href="https://api.highcharts.com/highstock/lang.invalidDate">https://api.highcharts.com/highstock/lang.invalidDate</a>
   *
   * @implspec invalidDate?: string;
   *
   */
  @JSProperty("invalidDate")
  @Nullable
  String getInvalidDate();

  /**
   * (Highcharts, Highstock) What to show in a date field for invalid dates.
   * Defaults to an empty string.
   *
   * @see <a href="https://api.highcharts.com/highcharts/lang.invalidDate">https://api.highcharts.com/highcharts/lang.invalidDate</a>
   * @see <a href="https://api.highcharts.com/highstock/lang.invalidDate">https://api.highcharts.com/highstock/lang.invalidDate</a>
   *
   * @implspec invalidDate?: string;
   *
   */
  @JSProperty("invalidDate")
  void setInvalidDate(String value);

  /**
   * (Highcharts, Highstock, Highmaps) The loading text that appears when the
   * chart is set into the loading state following a call to
   * <code>chart.showLoading</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/lang.loading">https://api.highcharts.com/highcharts/lang.loading</a>
   * @see <a href="https://api.highcharts.com/highstock/lang.loading">https://api.highcharts.com/highstock/lang.loading</a>
   * @see <a href="https://api.highcharts.com/highmaps/lang.loading">https://api.highcharts.com/highmaps/lang.loading</a>
   *
   * @implspec loading?: string;
   *
   */
  @JSProperty("loading")
  @Nullable
  String getLoading();

  /**
   * (Highcharts, Highstock, Highmaps) The loading text that appears when the
   * chart is set into the loading state following a call to
   * <code>chart.showLoading</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/lang.loading">https://api.highcharts.com/highcharts/lang.loading</a>
   * @see <a href="https://api.highcharts.com/highstock/lang.loading">https://api.highcharts.com/highstock/lang.loading</a>
   * @see <a href="https://api.highcharts.com/highmaps/lang.loading">https://api.highcharts.com/highmaps/lang.loading</a>
   *
   * @implspec loading?: string;
   *
   */
  @JSProperty("loading")
  void setLoading(String value);

  /**
   * (Highcharts, Highstock, Highmaps) An array containing the months names.
   * Corresponds to the <code>%B</code> format in <code>Highcharts.dateFormat()</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/lang.months">https://api.highcharts.com/highcharts/lang.months</a>
   * @see <a href="https://api.highcharts.com/highstock/lang.months">https://api.highcharts.com/highstock/lang.months</a>
   * @see <a href="https://api.highcharts.com/highmaps/lang.months">https://api.highcharts.com/highmaps/lang.months</a>
   *
   * @implspec months?: Array<string>;
   *
   */
  @JSProperty("months")
  @Nullable
  String[] getMonths();

  /**
   * (Highcharts, Highstock, Highmaps) An array containing the months names.
   * Corresponds to the <code>%B</code> format in <code>Highcharts.dateFormat()</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/lang.months">https://api.highcharts.com/highcharts/lang.months</a>
   * @see <a href="https://api.highcharts.com/highstock/lang.months">https://api.highcharts.com/highstock/lang.months</a>
   * @see <a href="https://api.highcharts.com/highmaps/lang.months">https://api.highcharts.com/highmaps/lang.months</a>
   *
   * @implspec months?: Array<string>;
   *
   */
  @JSProperty("months")
  void setMonths(String[] value);

  /**
   * (Highcharts, Highstock) The text to display when the chart contains no
   * data. Requires the no-data module, see noData.
   *
   * @see <a href="https://api.highcharts.com/highcharts/lang.noData">https://api.highcharts.com/highcharts/lang.noData</a>
   * @see <a href="https://api.highcharts.com/highstock/lang.noData">https://api.highcharts.com/highstock/lang.noData</a>
   *
   * @implspec noData?: string;
   *
   */
  @JSProperty("noData")
  @Nullable
  String getNoData();

  /**
   * (Highcharts, Highstock) The text to display when the chart contains no
   * data. Requires the no-data module, see noData.
   *
   * @see <a href="https://api.highcharts.com/highcharts/lang.noData">https://api.highcharts.com/highcharts/lang.noData</a>
   * @see <a href="https://api.highcharts.com/highstock/lang.noData">https://api.highcharts.com/highstock/lang.noData</a>
   *
   * @implspec noData?: string;
   *
   */
  @JSProperty("noData")
  void setNoData(String value);

  /**
   * (Highcharts, Highstock, Highmaps) The magnitude of numericSymbols
   * replacements. Use 10000 for Japanese, Korean and various Chinese locales,
   * which use symbols for 10^4, 10^8 and 10^12.
   *
   * @see <a href="https://api.highcharts.com/highcharts/lang.numericSymbolMagnitude">https://api.highcharts.com/highcharts/lang.numericSymbolMagnitude</a>
   * @see <a href="https://api.highcharts.com/highstock/lang.numericSymbolMagnitude">https://api.highcharts.com/highstock/lang.numericSymbolMagnitude</a>
   * @see <a href="https://api.highcharts.com/highmaps/lang.numericSymbolMagnitude">https://api.highcharts.com/highmaps/lang.numericSymbolMagnitude</a>
   *
   * @implspec numericSymbolMagnitude?: number;
   *
   */
  @JSProperty("numericSymbolMagnitude")
  double getNumericSymbolMagnitude();

  /**
   * (Highcharts, Highstock, Highmaps) The magnitude of numericSymbols
   * replacements. Use 10000 for Japanese, Korean and various Chinese locales,
   * which use symbols for 10^4, 10^8 and 10^12.
   *
   * @see <a href="https://api.highcharts.com/highcharts/lang.numericSymbolMagnitude">https://api.highcharts.com/highcharts/lang.numericSymbolMagnitude</a>
   * @see <a href="https://api.highcharts.com/highstock/lang.numericSymbolMagnitude">https://api.highcharts.com/highstock/lang.numericSymbolMagnitude</a>
   * @see <a href="https://api.highcharts.com/highmaps/lang.numericSymbolMagnitude">https://api.highcharts.com/highmaps/lang.numericSymbolMagnitude</a>
   *
   * @implspec numericSymbolMagnitude?: number;
   *
   */
  @JSProperty("numericSymbolMagnitude")
  void setNumericSymbolMagnitude(double value);

  /**
   * (Highcharts, Highstock, Highmaps) Metric prefixes used to shorten high
   * numbers in axis labels. Replacing any of the positions with <code>null</code> causes
   * the full number to be written. Setting <code>numericSymbols</code> to <code>null</code>
   * disables shortening altogether.
   *
   * @see <a href="https://api.highcharts.com/highcharts/lang.numericSymbols">https://api.highcharts.com/highcharts/lang.numericSymbols</a>
   * @see <a href="https://api.highcharts.com/highstock/lang.numericSymbols">https://api.highcharts.com/highstock/lang.numericSymbols</a>
   * @see <a href="https://api.highcharts.com/highmaps/lang.numericSymbols">https://api.highcharts.com/highmaps/lang.numericSymbols</a>
   *
   * @implspec numericSymbols?: Array<string>;
   *
   */
  @JSProperty("numericSymbols")
  @Nullable
  String[] getNumericSymbols();

  /**
   * (Highcharts, Highstock, Highmaps) Metric prefixes used to shorten high
   * numbers in axis labels. Replacing any of the positions with <code>null</code> causes
   * the full number to be written. Setting <code>numericSymbols</code> to <code>null</code>
   * disables shortening altogether.
   *
   * @see <a href="https://api.highcharts.com/highcharts/lang.numericSymbols">https://api.highcharts.com/highcharts/lang.numericSymbols</a>
   * @see <a href="https://api.highcharts.com/highstock/lang.numericSymbols">https://api.highcharts.com/highstock/lang.numericSymbols</a>
   * @see <a href="https://api.highcharts.com/highmaps/lang.numericSymbols">https://api.highcharts.com/highmaps/lang.numericSymbols</a>
   *
   * @implspec numericSymbols?: Array<string>;
   *
   */
  @JSProperty("numericSymbols")
  void setNumericSymbols(String[] value);

  /**
   * (Highcharts, Highstock, Highmaps) Export-data module only. The text for
   * the menu item.
   *
   * @see <a href="https://api.highcharts.com/highcharts/lang.openInCloud">https://api.highcharts.com/highcharts/lang.openInCloud</a>
   * @see <a href="https://api.highcharts.com/highstock/lang.openInCloud">https://api.highcharts.com/highstock/lang.openInCloud</a>
   * @see <a href="https://api.highcharts.com/highmaps/lang.openInCloud">https://api.highcharts.com/highmaps/lang.openInCloud</a>
   *
   * @implspec openInCloud?: string;
   *
   */
  @JSProperty("openInCloud")
  @Nullable
  String getOpenInCloud();

  /**
   * (Highcharts, Highstock, Highmaps) Export-data module only. The text for
   * the menu item.
   *
   * @see <a href="https://api.highcharts.com/highcharts/lang.openInCloud">https://api.highcharts.com/highcharts/lang.openInCloud</a>
   * @see <a href="https://api.highcharts.com/highstock/lang.openInCloud">https://api.highcharts.com/highstock/lang.openInCloud</a>
   * @see <a href="https://api.highcharts.com/highmaps/lang.openInCloud">https://api.highcharts.com/highmaps/lang.openInCloud</a>
   *
   * @implspec openInCloud?: string;
   *
   */
  @JSProperty("openInCloud")
  void setOpenInCloud(String value);

  /**
   * (Highcharts, Highstock, Highmaps) Exporting module only. The text for the
   * menu item to print the chart.
   *
   * @see <a href="https://api.highcharts.com/highcharts/lang.printChart">https://api.highcharts.com/highcharts/lang.printChart</a>
   * @see <a href="https://api.highcharts.com/highstock/lang.printChart">https://api.highcharts.com/highstock/lang.printChart</a>
   * @see <a href="https://api.highcharts.com/highmaps/lang.printChart">https://api.highcharts.com/highmaps/lang.printChart</a>
   *
   * @implspec printChart?: string;
   *
   */
  @JSProperty("printChart")
  @Nullable
  String getPrintChart();

  /**
   * (Highcharts, Highstock, Highmaps) Exporting module only. The text for the
   * menu item to print the chart.
   *
   * @see <a href="https://api.highcharts.com/highcharts/lang.printChart">https://api.highcharts.com/highcharts/lang.printChart</a>
   * @see <a href="https://api.highcharts.com/highstock/lang.printChart">https://api.highcharts.com/highstock/lang.printChart</a>
   * @see <a href="https://api.highcharts.com/highmaps/lang.printChart">https://api.highcharts.com/highmaps/lang.printChart</a>
   *
   * @implspec printChart?: string;
   *
   */
  @JSProperty("printChart")
  void setPrintChart(String value);

  /**
   * (Highstock) The text for the label for the &quot;from&quot; input box in the range
   * selector.
   *
   * @see <a href="https://api.highcharts.com/highstock/lang.rangeSelectorFrom">https://api.highcharts.com/highstock/lang.rangeSelectorFrom</a>
   *
   * @implspec rangeSelectorFrom?: string;
   *
   */
  @JSProperty("rangeSelectorFrom")
  @Nullable
  String getRangeSelectorFrom();

  /**
   * (Highstock) The text for the label for the &quot;from&quot; input box in the range
   * selector.
   *
   * @see <a href="https://api.highcharts.com/highstock/lang.rangeSelectorFrom">https://api.highcharts.com/highstock/lang.rangeSelectorFrom</a>
   *
   * @implspec rangeSelectorFrom?: string;
   *
   */
  @JSProperty("rangeSelectorFrom")
  void setRangeSelectorFrom(String value);

  /**
   * (Highstock) The text for the label for the &quot;to&quot; input box in the range
   * selector.
   *
   * @see <a href="https://api.highcharts.com/highstock/lang.rangeSelectorTo">https://api.highcharts.com/highstock/lang.rangeSelectorTo</a>
   *
   * @implspec rangeSelectorTo?: string;
   *
   */
  @JSProperty("rangeSelectorTo")
  @Nullable
  String getRangeSelectorTo();

  /**
   * (Highstock) The text for the label for the &quot;to&quot; input box in the range
   * selector.
   *
   * @see <a href="https://api.highcharts.com/highstock/lang.rangeSelectorTo">https://api.highcharts.com/highstock/lang.rangeSelectorTo</a>
   *
   * @implspec rangeSelectorTo?: string;
   *
   */
  @JSProperty("rangeSelectorTo")
  void setRangeSelectorTo(String value);

  /**
   * (Highstock) The text for the label for the range selector buttons.
   *
   * @see <a href="https://api.highcharts.com/highstock/lang.rangeSelectorZoom">https://api.highcharts.com/highstock/lang.rangeSelectorZoom</a>
   *
   * @implspec rangeSelectorZoom?: string;
   *
   */
  @JSProperty("rangeSelectorZoom")
  @Nullable
  String getRangeSelectorZoom();

  /**
   * (Highstock) The text for the label for the range selector buttons.
   *
   * @see <a href="https://api.highcharts.com/highstock/lang.rangeSelectorZoom">https://api.highcharts.com/highstock/lang.rangeSelectorZoom</a>
   *
   * @implspec rangeSelectorZoom?: string;
   *
   */
  @JSProperty("rangeSelectorZoom")
  void setRangeSelectorZoom(String value);

  /**
   * (Highcharts, Highstock, Highmaps) The text for the label appearing when a
   * chart is zoomed.
   *
   * @see <a href="https://api.highcharts.com/highcharts/lang.resetZoom">https://api.highcharts.com/highcharts/lang.resetZoom</a>
   * @see <a href="https://api.highcharts.com/highstock/lang.resetZoom">https://api.highcharts.com/highstock/lang.resetZoom</a>
   * @see <a href="https://api.highcharts.com/highmaps/lang.resetZoom">https://api.highcharts.com/highmaps/lang.resetZoom</a>
   *
   * @implspec resetZoom?: string;
   *
   */
  @JSProperty("resetZoom")
  @Nullable
  String getResetZoom();

  /**
   * (Highcharts, Highstock, Highmaps) The text for the label appearing when a
   * chart is zoomed.
   *
   * @see <a href="https://api.highcharts.com/highcharts/lang.resetZoom">https://api.highcharts.com/highcharts/lang.resetZoom</a>
   * @see <a href="https://api.highcharts.com/highstock/lang.resetZoom">https://api.highcharts.com/highstock/lang.resetZoom</a>
   * @see <a href="https://api.highcharts.com/highmaps/lang.resetZoom">https://api.highcharts.com/highmaps/lang.resetZoom</a>
   *
   * @implspec resetZoom?: string;
   *
   */
  @JSProperty("resetZoom")
  void setResetZoom(String value);

  /**
   * (Highcharts, Highstock, Highmaps) The tooltip title for the label
   * appearing when a chart is zoomed.
   *
   * @see <a href="https://api.highcharts.com/highcharts/lang.resetZoomTitle">https://api.highcharts.com/highcharts/lang.resetZoomTitle</a>
   * @see <a href="https://api.highcharts.com/highstock/lang.resetZoomTitle">https://api.highcharts.com/highstock/lang.resetZoomTitle</a>
   * @see <a href="https://api.highcharts.com/highmaps/lang.resetZoomTitle">https://api.highcharts.com/highmaps/lang.resetZoomTitle</a>
   *
   * @implspec resetZoomTitle?: string;
   *
   */
  @JSProperty("resetZoomTitle")
  @Nullable
  String getResetZoomTitle();

  /**
   * (Highcharts, Highstock, Highmaps) The tooltip title for the label
   * appearing when a chart is zoomed.
   *
   * @see <a href="https://api.highcharts.com/highcharts/lang.resetZoomTitle">https://api.highcharts.com/highcharts/lang.resetZoomTitle</a>
   * @see <a href="https://api.highcharts.com/highstock/lang.resetZoomTitle">https://api.highcharts.com/highstock/lang.resetZoomTitle</a>
   * @see <a href="https://api.highcharts.com/highmaps/lang.resetZoomTitle">https://api.highcharts.com/highmaps/lang.resetZoomTitle</a>
   *
   * @implspec resetZoomTitle?: string;
   *
   */
  @JSProperty("resetZoomTitle")
  void setResetZoomTitle(String value);

  /**
   * (Highcharts, Highstock, Highmaps) An array containing the months names in
   * abbreviated form. Corresponds to the <code>%b</code> format in
   * <code>Highcharts.dateFormat()</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/lang.shortMonths">https://api.highcharts.com/highcharts/lang.shortMonths</a>
   * @see <a href="https://api.highcharts.com/highstock/lang.shortMonths">https://api.highcharts.com/highstock/lang.shortMonths</a>
   * @see <a href="https://api.highcharts.com/highmaps/lang.shortMonths">https://api.highcharts.com/highmaps/lang.shortMonths</a>
   *
   * @implspec shortMonths?: Array<string>;
   *
   */
  @JSProperty("shortMonths")
  @Nullable
  String[] getShortMonths();

  /**
   * (Highcharts, Highstock, Highmaps) An array containing the months names in
   * abbreviated form. Corresponds to the <code>%b</code> format in
   * <code>Highcharts.dateFormat()</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/lang.shortMonths">https://api.highcharts.com/highcharts/lang.shortMonths</a>
   * @see <a href="https://api.highcharts.com/highstock/lang.shortMonths">https://api.highcharts.com/highstock/lang.shortMonths</a>
   * @see <a href="https://api.highcharts.com/highmaps/lang.shortMonths">https://api.highcharts.com/highmaps/lang.shortMonths</a>
   *
   * @implspec shortMonths?: Array<string>;
   *
   */
  @JSProperty("shortMonths")
  void setShortMonths(String[] value);

  /**
   * (Highcharts, Highstock, Highmaps) Short week days, starting Sunday. If
   * not specified, Highcharts uses the first three letters of the
   * <code>lang.weekdays</code> option.
   *
   * @see <a href="https://api.highcharts.com/highcharts/lang.shortWeekdays">https://api.highcharts.com/highcharts/lang.shortWeekdays</a>
   * @see <a href="https://api.highcharts.com/highstock/lang.shortWeekdays">https://api.highcharts.com/highstock/lang.shortWeekdays</a>
   * @see <a href="https://api.highcharts.com/highmaps/lang.shortWeekdays">https://api.highcharts.com/highmaps/lang.shortWeekdays</a>
   *
   * @implspec shortWeekdays?: Array<string>;
   *
   */
  @JSProperty("shortWeekdays")
  @Nullable
  String[] getShortWeekdays();

  /**
   * (Highcharts, Highstock, Highmaps) Short week days, starting Sunday. If
   * not specified, Highcharts uses the first three letters of the
   * <code>lang.weekdays</code> option.
   *
   * @see <a href="https://api.highcharts.com/highcharts/lang.shortWeekdays">https://api.highcharts.com/highcharts/lang.shortWeekdays</a>
   * @see <a href="https://api.highcharts.com/highstock/lang.shortWeekdays">https://api.highcharts.com/highstock/lang.shortWeekdays</a>
   * @see <a href="https://api.highcharts.com/highmaps/lang.shortWeekdays">https://api.highcharts.com/highmaps/lang.shortWeekdays</a>
   *
   * @implspec shortWeekdays?: Array<string>;
   *
   */
  @JSProperty("shortWeekdays")
  void setShortWeekdays(String[] value);

  /**
   * (Highcharts, Highstock, Highmaps) The default thousands separator used in
   * the <code>Highcharts.numberFormat</code> method unless otherwise specified in the
   * function arguments. Defaults to a single space character, which is
   * recommended in ISO 31-0 and works across Anglo-American and continental
   * European languages.
   *
   * @see <a href="https://api.highcharts.com/highcharts/lang.thousandsSep">https://api.highcharts.com/highcharts/lang.thousandsSep</a>
   * @see <a href="https://api.highcharts.com/highstock/lang.thousandsSep">https://api.highcharts.com/highstock/lang.thousandsSep</a>
   * @see <a href="https://api.highcharts.com/highmaps/lang.thousandsSep">https://api.highcharts.com/highmaps/lang.thousandsSep</a>
   *
   * @implspec thousandsSep?: string;
   *
   */
  @JSProperty("thousandsSep")
  @Nullable
  String getThousandsSep();

  /**
   * (Highcharts, Highstock, Highmaps) The default thousands separator used in
   * the <code>Highcharts.numberFormat</code> method unless otherwise specified in the
   * function arguments. Defaults to a single space character, which is
   * recommended in ISO 31-0 and works across Anglo-American and continental
   * European languages.
   *
   * @see <a href="https://api.highcharts.com/highcharts/lang.thousandsSep">https://api.highcharts.com/highcharts/lang.thousandsSep</a>
   * @see <a href="https://api.highcharts.com/highstock/lang.thousandsSep">https://api.highcharts.com/highstock/lang.thousandsSep</a>
   * @see <a href="https://api.highcharts.com/highmaps/lang.thousandsSep">https://api.highcharts.com/highmaps/lang.thousandsSep</a>
   *
   * @implspec thousandsSep?: string;
   *
   */
  @JSProperty("thousandsSep")
  void setThousandsSep(String value);

  /**
   * (Highcharts, Highstock, Highmaps) Export-data module only. The text for
   * the menu item.
   *
   * @see <a href="https://api.highcharts.com/highcharts/lang.viewData">https://api.highcharts.com/highcharts/lang.viewData</a>
   * @see <a href="https://api.highcharts.com/highstock/lang.viewData">https://api.highcharts.com/highstock/lang.viewData</a>
   * @see <a href="https://api.highcharts.com/highmaps/lang.viewData">https://api.highcharts.com/highmaps/lang.viewData</a>
   *
   * @implspec viewData?: string;
   *
   */
  @JSProperty("viewData")
  @Nullable
  String getViewData();

  /**
   * (Highcharts, Highstock, Highmaps) Export-data module only. The text for
   * the menu item.
   *
   * @see <a href="https://api.highcharts.com/highcharts/lang.viewData">https://api.highcharts.com/highcharts/lang.viewData</a>
   * @see <a href="https://api.highcharts.com/highstock/lang.viewData">https://api.highcharts.com/highstock/lang.viewData</a>
   * @see <a href="https://api.highcharts.com/highmaps/lang.viewData">https://api.highcharts.com/highmaps/lang.viewData</a>
   *
   * @implspec viewData?: string;
   *
   */
  @JSProperty("viewData")
  void setViewData(String value);

  /**
   * (Highcharts, Highstock, Highmaps) An array containing the weekday names.
   *
   * @see <a href="https://api.highcharts.com/highcharts/lang.weekdays">https://api.highcharts.com/highcharts/lang.weekdays</a>
   * @see <a href="https://api.highcharts.com/highstock/lang.weekdays">https://api.highcharts.com/highstock/lang.weekdays</a>
   * @see <a href="https://api.highcharts.com/highmaps/lang.weekdays">https://api.highcharts.com/highmaps/lang.weekdays</a>
   *
   * @implspec weekdays?: Array<string>;
   *
   */
  @JSProperty("weekdays")
  @Nullable
  String[] getWeekdays();

  /**
   * (Highcharts, Highstock, Highmaps) An array containing the weekday names.
   *
   * @see <a href="https://api.highcharts.com/highcharts/lang.weekdays">https://api.highcharts.com/highcharts/lang.weekdays</a>
   * @see <a href="https://api.highcharts.com/highstock/lang.weekdays">https://api.highcharts.com/highstock/lang.weekdays</a>
   * @see <a href="https://api.highcharts.com/highmaps/lang.weekdays">https://api.highcharts.com/highmaps/lang.weekdays</a>
   *
   * @implspec weekdays?: Array<string>;
   *
   */
  @JSProperty("weekdays")
  void setWeekdays(String[] value);

  /**
   * (Highmaps) The title appearing on hovering the zoom in button. The text
   * itself defaults to &quot;+&quot; and can be changed in the button options.
   *
   * @see <a href="https://api.highcharts.com/highmaps/lang.zoomIn">https://api.highcharts.com/highmaps/lang.zoomIn</a>
   *
   * @implspec zoomIn?: string;
   *
   */
  @JSProperty("zoomIn")
  @Nullable
  String getZoomIn();

  /**
   * (Highmaps) The title appearing on hovering the zoom in button. The text
   * itself defaults to &quot;+&quot; and can be changed in the button options.
   *
   * @see <a href="https://api.highcharts.com/highmaps/lang.zoomIn">https://api.highcharts.com/highmaps/lang.zoomIn</a>
   *
   * @implspec zoomIn?: string;
   *
   */
  @JSProperty("zoomIn")
  void setZoomIn(String value);

  /**
   * (Highmaps) The title appearing on hovering the zoom out button. The text
   * itself defaults to &quot;-&quot; and can be changed in the button options.
   *
   * @see <a href="https://api.highcharts.com/highmaps/lang.zoomOut">https://api.highcharts.com/highmaps/lang.zoomOut</a>
   *
   * @implspec zoomOut?: string;
   *
   */
  @JSProperty("zoomOut")
  @Nullable
  String getZoomOut();

  /**
   * (Highmaps) The title appearing on hovering the zoom out button. The text
   * itself defaults to &quot;-&quot; and can be changed in the button options.
   *
   * @see <a href="https://api.highcharts.com/highmaps/lang.zoomOut">https://api.highcharts.com/highmaps/lang.zoomOut</a>
   *
   * @implspec zoomOut?: string;
   *
   */
  @JSProperty("zoomOut")
  void setZoomOut(String value);
}
