package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.String;
import javax.annotation.Nullable;
import js.extras.JsEnum;
import js.lang.Any;
import js.lang.Unknown;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Highmaps) Options for the exporting module. For an
 * overview on the matter, see the docs.
 *
 * @see <a href="https://api.highcharts.com/highcharts/exporting">https://api.highcharts.com/highcharts/exporting</a>
 * @see <a href="https://api.highcharts.com/highstock/exporting">https://api.highcharts.com/highstock/exporting</a>
 * @see <a href="https://api.highcharts.com/highmaps/exporting">https://api.highcharts.com/highmaps/exporting</a>
 *
 */
public interface ExportingOptions extends Any {
  /**
   * (Highcharts, Highstock, Highmaps) Experimental setting to allow HTML
   * inside the chart (added through the <code>useHTML</code> options), directly in the
   * exported image. This allows you to preserve complicated HTML structures
   * like tables or bi-directional text in exported charts.
   *
   * Disclaimer: The HTML is rendered in a <code>foreignObject</code> tag in the
   * generated SVG. The official export server is based on PhantomJS, which
   * supports this, but other SVG clients, like Batik, does not support it.
   * This also applies to downloaded SVG that you want to open in a desktop
   * client.
   *
   * @see <a href="https://api.highcharts.com/highcharts/exporting.allowHTML">https://api.highcharts.com/highcharts/exporting.allowHTML</a>
   * @see <a href="https://api.highcharts.com/highstock/exporting.allowHTML">https://api.highcharts.com/highstock/exporting.allowHTML</a>
   * @see <a href="https://api.highcharts.com/highmaps/exporting.allowHTML">https://api.highcharts.com/highmaps/exporting.allowHTML</a>
   *
   * @implspec allowHTML?: boolean;
   *
   */
  @JSProperty("allowHTML")
  boolean getAllowHTML();

  /**
   * (Highcharts, Highstock, Highmaps) Experimental setting to allow HTML
   * inside the chart (added through the <code>useHTML</code> options), directly in the
   * exported image. This allows you to preserve complicated HTML structures
   * like tables or bi-directional text in exported charts.
   *
   * Disclaimer: The HTML is rendered in a <code>foreignObject</code> tag in the
   * generated SVG. The official export server is based on PhantomJS, which
   * supports this, but other SVG clients, like Batik, does not support it.
   * This also applies to downloaded SVG that you want to open in a desktop
   * client.
   *
   * @see <a href="https://api.highcharts.com/highcharts/exporting.allowHTML">https://api.highcharts.com/highcharts/exporting.allowHTML</a>
   * @see <a href="https://api.highcharts.com/highstock/exporting.allowHTML">https://api.highcharts.com/highstock/exporting.allowHTML</a>
   * @see <a href="https://api.highcharts.com/highmaps/exporting.allowHTML">https://api.highcharts.com/highmaps/exporting.allowHTML</a>
   *
   * @implspec allowHTML?: boolean;
   *
   */
  @JSProperty("allowHTML")
  void setAllowHTML(boolean value);

  /**
   * (Highcharts, Highstock, Highmaps) Options for the export related buttons,
   * print and export. In addition to the default buttons listed here, custom
   * buttons can be added. See navigation.buttonOptions for general options.
   *
   * @see <a href="https://api.highcharts.com/highcharts/exporting.buttons">https://api.highcharts.com/highcharts/exporting.buttons</a>
   * @see <a href="https://api.highcharts.com/highstock/exporting.buttons">https://api.highcharts.com/highstock/exporting.buttons</a>
   * @see <a href="https://api.highcharts.com/highmaps/exporting.buttons">https://api.highcharts.com/highmaps/exporting.buttons</a>
   *
   * @implspec buttons?: Dictionary<ExportingButtonsOptions>;
   *
   */
  @JSProperty("buttons")
  @Nullable
  Dictionary<ExportingButtonsOptions> getButtons();

  /**
   * (Highcharts, Highstock, Highmaps) Options for the export related buttons,
   * print and export. In addition to the default buttons listed here, custom
   * buttons can be added. See navigation.buttonOptions for general options.
   *
   * @see <a href="https://api.highcharts.com/highcharts/exporting.buttons">https://api.highcharts.com/highcharts/exporting.buttons</a>
   * @see <a href="https://api.highcharts.com/highstock/exporting.buttons">https://api.highcharts.com/highstock/exporting.buttons</a>
   * @see <a href="https://api.highcharts.com/highmaps/exporting.buttons">https://api.highcharts.com/highmaps/exporting.buttons</a>
   *
   * @implspec buttons?: Dictionary<ExportingButtonsOptions>;
   *
   */
  @JSProperty("buttons")
  void setButtons(Dictionary<ExportingButtonsOptions> value);

  /**
   * (Highcharts, Highstock, Highmaps) Additional chart options to be merged
   * into an exported chart. For example, a common use case is to add data
   * labels to improve readability of the exported chart, or to add a
   * printer-friendly color scheme.
   *
   * @see <a href="https://api.highcharts.com/highcharts/exporting.chartOptions">https://api.highcharts.com/highcharts/exporting.chartOptions</a>
   * @see <a href="https://api.highcharts.com/highstock/exporting.chartOptions">https://api.highcharts.com/highstock/exporting.chartOptions</a>
   * @see <a href="https://api.highcharts.com/highmaps/exporting.chartOptions">https://api.highcharts.com/highmaps/exporting.chartOptions</a>
   *
   * @implspec chartOptions?: Options;
   *
   */
  @JSProperty("chartOptions")
  @Nullable
  Options getChartOptions();

  /**
   * (Highcharts, Highstock, Highmaps) Additional chart options to be merged
   * into an exported chart. For example, a common use case is to add data
   * labels to improve readability of the exported chart, or to add a
   * printer-friendly color scheme.
   *
   * @see <a href="https://api.highcharts.com/highcharts/exporting.chartOptions">https://api.highcharts.com/highcharts/exporting.chartOptions</a>
   * @see <a href="https://api.highcharts.com/highstock/exporting.chartOptions">https://api.highcharts.com/highstock/exporting.chartOptions</a>
   * @see <a href="https://api.highcharts.com/highmaps/exporting.chartOptions">https://api.highcharts.com/highmaps/exporting.chartOptions</a>
   *
   * @implspec chartOptions?: Options;
   *
   */
  @JSProperty("chartOptions")
  void setChartOptions(Options value);

  /**
   * (Highcharts, Highstock, Highmaps) Options for exporting data to CSV or
   * ExCel, or displaying the data in a HTML table or a JavaScript structure.
   * Requires the <code>export-data.js</code> module. This module adds data export
   * options to the export menu and provides functions like <code>Chart.getCSV</code>,
   * <code>Chart.getTable</code>, <code>Chart.getDataRows</code> and <code>Chart.viewData</code>.
   *
   * The XLS converter is limited and only creates a HTML string that is
   * passed for download, which works but creates a warning before opening.
   * The workaround for this is to use a third party XLSX converter, as
   * demonstrated in the sample below.
   *
   * @see <a href="https://api.highcharts.com/highcharts/exporting.csv">https://api.highcharts.com/highcharts/exporting.csv</a>
   * @see <a href="https://api.highcharts.com/highstock/exporting.csv">https://api.highcharts.com/highstock/exporting.csv</a>
   * @see <a href="https://api.highcharts.com/highmaps/exporting.csv">https://api.highcharts.com/highmaps/exporting.csv</a>
   *
   * @implspec csv?: ExportingCsvOptions;
   *
   */
  @JSProperty("csv")
  @Nullable
  ExportingCsvOptions getCsv();

  /**
   * (Highcharts, Highstock, Highmaps) Options for exporting data to CSV or
   * ExCel, or displaying the data in a HTML table or a JavaScript structure.
   * Requires the <code>export-data.js</code> module. This module adds data export
   * options to the export menu and provides functions like <code>Chart.getCSV</code>,
   * <code>Chart.getTable</code>, <code>Chart.getDataRows</code> and <code>Chart.viewData</code>.
   *
   * The XLS converter is limited and only creates a HTML string that is
   * passed for download, which works but creates a warning before opening.
   * The workaround for this is to use a third party XLSX converter, as
   * demonstrated in the sample below.
   *
   * @see <a href="https://api.highcharts.com/highcharts/exporting.csv">https://api.highcharts.com/highcharts/exporting.csv</a>
   * @see <a href="https://api.highcharts.com/highstock/exporting.csv">https://api.highcharts.com/highstock/exporting.csv</a>
   * @see <a href="https://api.highcharts.com/highmaps/exporting.csv">https://api.highcharts.com/highmaps/exporting.csv</a>
   *
   * @implspec csv?: ExportingCsvOptions;
   *
   */
  @JSProperty("csv")
  void setCsv(ExportingCsvOptions value);

  /**
   * (Highcharts, Highstock, Highmaps) Whether to enable the exporting module.
   * Disabling the module will hide the context button, but API methods will
   * still be available.
   *
   * @see <a href="https://api.highcharts.com/highcharts/exporting.enabled">https://api.highcharts.com/highcharts/exporting.enabled</a>
   * @see <a href="https://api.highcharts.com/highstock/exporting.enabled">https://api.highcharts.com/highstock/exporting.enabled</a>
   * @see <a href="https://api.highcharts.com/highmaps/exporting.enabled">https://api.highcharts.com/highmaps/exporting.enabled</a>
   *
   * @implspec enabled?: boolean;
   *
   */
  @JSProperty("enabled")
  boolean getEnabled();

  /**
   * (Highcharts, Highstock, Highmaps) Whether to enable the exporting module.
   * Disabling the module will hide the context button, but API methods will
   * still be available.
   *
   * @see <a href="https://api.highcharts.com/highcharts/exporting.enabled">https://api.highcharts.com/highcharts/exporting.enabled</a>
   * @see <a href="https://api.highcharts.com/highstock/exporting.enabled">https://api.highcharts.com/highstock/exporting.enabled</a>
   * @see <a href="https://api.highcharts.com/highmaps/exporting.enabled">https://api.highcharts.com/highmaps/exporting.enabled</a>
   *
   * @implspec enabled?: boolean;
   *
   */
  @JSProperty("enabled")
  void setEnabled(boolean value);

  /**
   * (Highcharts, Highstock, Highmaps) Function to call if the
   * offline-exporting module fails to export a chart on the client side, and
   * fallbackToExportServer is disabled. If left undefined, an exception is
   * thrown instead. Receives two parameters, the exporting options, and the
   * error from the module.
   *
   * @see <a href="https://api.highcharts.com/highcharts/exporting.error">https://api.highcharts.com/highcharts/exporting.error</a>
   * @see <a href="https://api.highcharts.com/highstock/exporting.error">https://api.highcharts.com/highstock/exporting.error</a>
   * @see <a href="https://api.highcharts.com/highmaps/exporting.error">https://api.highcharts.com/highmaps/exporting.error</a>
   *
   * @implspec error?: ExportingErrorCallbackFunction;
   *
   */
  @JSProperty("error")
  @Nullable
  ExportingErrorCallbackFunction getError();

  /**
   * (Highcharts, Highstock, Highmaps) Function to call if the
   * offline-exporting module fails to export a chart on the client side, and
   * fallbackToExportServer is disabled. If left undefined, an exception is
   * thrown instead. Receives two parameters, the exporting options, and the
   * error from the module.
   *
   * @see <a href="https://api.highcharts.com/highcharts/exporting.error">https://api.highcharts.com/highcharts/exporting.error</a>
   * @see <a href="https://api.highcharts.com/highstock/exporting.error">https://api.highcharts.com/highstock/exporting.error</a>
   * @see <a href="https://api.highcharts.com/highmaps/exporting.error">https://api.highcharts.com/highmaps/exporting.error</a>
   *
   * @implspec error?: ExportingErrorCallbackFunction;
   *
   */
  @JSProperty("error")
  void setError(ExportingErrorCallbackFunction value);

  /**
   * (Highcharts, Highstock, Highmaps) Whether or not to fall back to the
   * export server if the offline-exporting module is unable to export the
   * chart on the client side. This happens for certain browsers, and certain
   * features (e.g. allowHTML), depending on the image type exporting to. For
   * very complex charts, it is possible that export can fail in browsers that
   * don't support Blob objects, due to data URL length limits. It is
   * recommended to define the exporting.error handler if disabling fallback,
   * in order to notify users in case export fails.
   *
   * @see <a href="https://api.highcharts.com/highcharts/exporting.fallbackToExportServer">https://api.highcharts.com/highcharts/exporting.fallbackToExportServer</a>
   * @see <a href="https://api.highcharts.com/highstock/exporting.fallbackToExportServer">https://api.highcharts.com/highstock/exporting.fallbackToExportServer</a>
   * @see <a href="https://api.highcharts.com/highmaps/exporting.fallbackToExportServer">https://api.highcharts.com/highmaps/exporting.fallbackToExportServer</a>
   *
   * @implspec fallbackToExportServer?: boolean;
   *
   */
  @JSProperty("fallbackToExportServer")
  boolean getFallbackToExportServer();

  /**
   * (Highcharts, Highstock, Highmaps) Whether or not to fall back to the
   * export server if the offline-exporting module is unable to export the
   * chart on the client side. This happens for certain browsers, and certain
   * features (e.g. allowHTML), depending on the image type exporting to. For
   * very complex charts, it is possible that export can fail in browsers that
   * don't support Blob objects, due to data URL length limits. It is
   * recommended to define the exporting.error handler if disabling fallback,
   * in order to notify users in case export fails.
   *
   * @see <a href="https://api.highcharts.com/highcharts/exporting.fallbackToExportServer">https://api.highcharts.com/highcharts/exporting.fallbackToExportServer</a>
   * @see <a href="https://api.highcharts.com/highstock/exporting.fallbackToExportServer">https://api.highcharts.com/highstock/exporting.fallbackToExportServer</a>
   * @see <a href="https://api.highcharts.com/highmaps/exporting.fallbackToExportServer">https://api.highcharts.com/highmaps/exporting.fallbackToExportServer</a>
   *
   * @implspec fallbackToExportServer?: boolean;
   *
   */
  @JSProperty("fallbackToExportServer")
  void setFallbackToExportServer(boolean value);

  /**
   * (Highcharts, Highstock, Highmaps) The filename, without extension, to use
   * for the exported chart.
   *
   * @see <a href="https://api.highcharts.com/highcharts/exporting.filename">https://api.highcharts.com/highcharts/exporting.filename</a>
   * @see <a href="https://api.highcharts.com/highstock/exporting.filename">https://api.highcharts.com/highstock/exporting.filename</a>
   * @see <a href="https://api.highcharts.com/highmaps/exporting.filename">https://api.highcharts.com/highmaps/exporting.filename</a>
   *
   * @implspec filename?: string;
   *
   */
  @JSProperty("filename")
  @Nullable
  String getFilename();

  /**
   * (Highcharts, Highstock, Highmaps) The filename, without extension, to use
   * for the exported chart.
   *
   * @see <a href="https://api.highcharts.com/highcharts/exporting.filename">https://api.highcharts.com/highcharts/exporting.filename</a>
   * @see <a href="https://api.highcharts.com/highstock/exporting.filename">https://api.highcharts.com/highstock/exporting.filename</a>
   * @see <a href="https://api.highcharts.com/highmaps/exporting.filename">https://api.highcharts.com/highmaps/exporting.filename</a>
   *
   * @implspec filename?: string;
   *
   */
  @JSProperty("filename")
  void setFilename(String value);

  /**
   * (Highcharts, Highstock, Highmaps) An object containing additional key
   * value data for the POST form that sends the SVG to the export server. For
   * example, a <code>target</code> can be set to make sure the generated image is
   * received in another frame, or a custom <code>enctype</code> or <code>encoding</code> can be
   * set.
   *
   * @see <a href="https://api.highcharts.com/highcharts/exporting.formAttributes">https://api.highcharts.com/highcharts/exporting.formAttributes</a>
   * @see <a href="https://api.highcharts.com/highstock/exporting.formAttributes">https://api.highcharts.com/highstock/exporting.formAttributes</a>
   * @see <a href="https://api.highcharts.com/highmaps/exporting.formAttributes">https://api.highcharts.com/highmaps/exporting.formAttributes</a>
   *
   * @implspec formAttributes?: any;
   *
   */
  @JSProperty("formAttributes")
  @Nullable
  Any getFormAttributes();

  /**
   * (Highcharts, Highstock, Highmaps) An object containing additional key
   * value data for the POST form that sends the SVG to the export server. For
   * example, a <code>target</code> can be set to make sure the generated image is
   * received in another frame, or a custom <code>enctype</code> or <code>encoding</code> can be
   * set.
   *
   * @see <a href="https://api.highcharts.com/highcharts/exporting.formAttributes">https://api.highcharts.com/highcharts/exporting.formAttributes</a>
   * @see <a href="https://api.highcharts.com/highstock/exporting.formAttributes">https://api.highcharts.com/highstock/exporting.formAttributes</a>
   * @see <a href="https://api.highcharts.com/highmaps/exporting.formAttributes">https://api.highcharts.com/highmaps/exporting.formAttributes</a>
   *
   * @implspec formAttributes?: any;
   *
   */
  @JSProperty("formAttributes")
  void setFormAttributes(Any value);

  /**
   * (Highcharts, Highstock, Highmaps) Path where Highcharts will look for
   * export module dependencies to load on demand if they don't already exist
   * on <code>window</code>. Should currently point to location of CanVG library,
   * RGBColor.js, jsPDF and svg2pdf.js, required for client side export in
   * certain browsers.
   *
   * @see <a href="https://api.highcharts.com/highcharts/exporting.libURL">https://api.highcharts.com/highcharts/exporting.libURL</a>
   * @see <a href="https://api.highcharts.com/highstock/exporting.libURL">https://api.highcharts.com/highstock/exporting.libURL</a>
   * @see <a href="https://api.highcharts.com/highmaps/exporting.libURL">https://api.highcharts.com/highmaps/exporting.libURL</a>
   *
   * @implspec libURL?: string;
   *
   */
  @JSProperty("libURL")
  @Nullable
  String getLibURL();

  /**
   * (Highcharts, Highstock, Highmaps) Path where Highcharts will look for
   * export module dependencies to load on demand if they don't already exist
   * on <code>window</code>. Should currently point to location of CanVG library,
   * RGBColor.js, jsPDF and svg2pdf.js, required for client side export in
   * certain browsers.
   *
   * @see <a href="https://api.highcharts.com/highcharts/exporting.libURL">https://api.highcharts.com/highcharts/exporting.libURL</a>
   * @see <a href="https://api.highcharts.com/highstock/exporting.libURL">https://api.highcharts.com/highstock/exporting.libURL</a>
   * @see <a href="https://api.highcharts.com/highmaps/exporting.libURL">https://api.highcharts.com/highmaps/exporting.libURL</a>
   *
   * @implspec libURL?: string;
   *
   */
  @JSProperty("libURL")
  void setLibURL(String value);

  /**
   * (Highcharts, Highstock, Highmaps) An object consisting of definitions for
   * the menu items in the context menu. Each key value pair has a <code>key</code> that
   * is referenced in the menuItems setting, and a <code>value</code>, which is an object
   * with the following properties:
   *
   * <ul>
   * <li>
   * <strong>onclick:</strong> The click handler for the menu item
   *
   * </li>
   * <li>
   * <strong>text:</strong> The text for the menu item
   *
   * </li>
   * <li>
   * <strong>textKey:</strong> If internationalization is required, the key to a language
   * string
   *
   * </li>
   * </ul>
   * @see <a href="https://api.highcharts.com/highcharts/exporting.menuItemDefinitions">https://api.highcharts.com/highcharts/exporting.menuItemDefinitions</a>
   * @see <a href="https://api.highcharts.com/highstock/exporting.menuItemDefinitions">https://api.highcharts.com/highstock/exporting.menuItemDefinitions</a>
   * @see <a href="https://api.highcharts.com/highmaps/exporting.menuItemDefinitions">https://api.highcharts.com/highmaps/exporting.menuItemDefinitions</a>
   *
   * @implspec menuItemDefinitions?: Dictionary<ExportingMenuObject>;
   *
   */
  @JSProperty("menuItemDefinitions")
  @Nullable
  Dictionary<ExportingMenuObject> getMenuItemDefinitions();

  /**
   * (Highcharts, Highstock, Highmaps) An object consisting of definitions for
   * the menu items in the context menu. Each key value pair has a <code>key</code> that
   * is referenced in the menuItems setting, and a <code>value</code>, which is an object
   * with the following properties:
   *
   * <ul>
   * <li>
   * <strong>onclick:</strong> The click handler for the menu item
   *
   * </li>
   * <li>
   * <strong>text:</strong> The text for the menu item
   *
   * </li>
   * <li>
   * <strong>textKey:</strong> If internationalization is required, the key to a language
   * string
   *
   * </li>
   * </ul>
   * @see <a href="https://api.highcharts.com/highcharts/exporting.menuItemDefinitions">https://api.highcharts.com/highcharts/exporting.menuItemDefinitions</a>
   * @see <a href="https://api.highcharts.com/highstock/exporting.menuItemDefinitions">https://api.highcharts.com/highstock/exporting.menuItemDefinitions</a>
   * @see <a href="https://api.highcharts.com/highmaps/exporting.menuItemDefinitions">https://api.highcharts.com/highmaps/exporting.menuItemDefinitions</a>
   *
   * @implspec menuItemDefinitions?: Dictionary<ExportingMenuObject>;
   *
   */
  @JSProperty("menuItemDefinitions")
  void setMenuItemDefinitions(Dictionary<ExportingMenuObject> value);

  /**
   * (Highcharts, Highstock, Highmaps) When printing the chart from the menu
   * item in the burger menu, if the on-screen chart exceeds this width, it is
   * resized. After printing or cancelled, it is restored. The default width
   * makes the chart fit into typical paper format. Note that this does not
   * affect the chart when printing the web page as a whole.
   *
   * @see <a href="https://api.highcharts.com/highcharts/exporting.printMaxWidth">https://api.highcharts.com/highcharts/exporting.printMaxWidth</a>
   * @see <a href="https://api.highcharts.com/highstock/exporting.printMaxWidth">https://api.highcharts.com/highstock/exporting.printMaxWidth</a>
   * @see <a href="https://api.highcharts.com/highmaps/exporting.printMaxWidth">https://api.highcharts.com/highmaps/exporting.printMaxWidth</a>
   *
   * @implspec printMaxWidth?: number;
   *
   */
  @JSProperty("printMaxWidth")
  double getPrintMaxWidth();

  /**
   * (Highcharts, Highstock, Highmaps) When printing the chart from the menu
   * item in the burger menu, if the on-screen chart exceeds this width, it is
   * resized. After printing or cancelled, it is restored. The default width
   * makes the chart fit into typical paper format. Note that this does not
   * affect the chart when printing the web page as a whole.
   *
   * @see <a href="https://api.highcharts.com/highcharts/exporting.printMaxWidth">https://api.highcharts.com/highcharts/exporting.printMaxWidth</a>
   * @see <a href="https://api.highcharts.com/highstock/exporting.printMaxWidth">https://api.highcharts.com/highstock/exporting.printMaxWidth</a>
   * @see <a href="https://api.highcharts.com/highmaps/exporting.printMaxWidth">https://api.highcharts.com/highmaps/exporting.printMaxWidth</a>
   *
   * @implspec printMaxWidth?: number;
   *
   */
  @JSProperty("printMaxWidth")
  void setPrintMaxWidth(double value);

  /**
   * (Highcharts, Highstock, Highmaps) Defines the scale or zoom factor for
   * the exported image compared to the on-screen display. While for instance
   * a 600px wide chart may look good on a website, it will look bad in print.
   * The default scale of 2 makes this chart export to a 1200px PNG or JPG.
   *
   * @see <a href="https://api.highcharts.com/highcharts/exporting.scale">https://api.highcharts.com/highcharts/exporting.scale</a>
   * @see <a href="https://api.highcharts.com/highstock/exporting.scale">https://api.highcharts.com/highstock/exporting.scale</a>
   * @see <a href="https://api.highcharts.com/highmaps/exporting.scale">https://api.highcharts.com/highmaps/exporting.scale</a>
   *
   * @implspec scale?: number;
   *
   */
  @JSProperty("scale")
  double getScale();

  /**
   * (Highcharts, Highstock, Highmaps) Defines the scale or zoom factor for
   * the exported image compared to the on-screen display. While for instance
   * a 600px wide chart may look good on a website, it will look bad in print.
   * The default scale of 2 makes this chart export to a 1200px PNG or JPG.
   *
   * @see <a href="https://api.highcharts.com/highcharts/exporting.scale">https://api.highcharts.com/highcharts/exporting.scale</a>
   * @see <a href="https://api.highcharts.com/highstock/exporting.scale">https://api.highcharts.com/highstock/exporting.scale</a>
   * @see <a href="https://api.highcharts.com/highmaps/exporting.scale">https://api.highcharts.com/highmaps/exporting.scale</a>
   *
   * @implspec scale?: number;
   *
   */
  @JSProperty("scale")
  void setScale(double value);

  /**
   * (Highcharts, Highstock, Highmaps) Export-data module required. Show a
   * HTML table below the chart with the chart's current data.
   *
   * @see <a href="https://api.highcharts.com/highcharts/exporting.showTable">https://api.highcharts.com/highcharts/exporting.showTable</a>
   * @see <a href="https://api.highcharts.com/highstock/exporting.showTable">https://api.highcharts.com/highstock/exporting.showTable</a>
   * @see <a href="https://api.highcharts.com/highmaps/exporting.showTable">https://api.highcharts.com/highmaps/exporting.showTable</a>
   *
   * @implspec showTable?: boolean;
   *
   */
  @JSProperty("showTable")
  boolean getShowTable();

  /**
   * (Highcharts, Highstock, Highmaps) Export-data module required. Show a
   * HTML table below the chart with the chart's current data.
   *
   * @see <a href="https://api.highcharts.com/highcharts/exporting.showTable">https://api.highcharts.com/highcharts/exporting.showTable</a>
   * @see <a href="https://api.highcharts.com/highstock/exporting.showTable">https://api.highcharts.com/highstock/exporting.showTable</a>
   * @see <a href="https://api.highcharts.com/highmaps/exporting.showTable">https://api.highcharts.com/highmaps/exporting.showTable</a>
   *
   * @implspec showTable?: boolean;
   *
   */
  @JSProperty("showTable")
  void setShowTable(boolean value);

  /**
   * (Highcharts, Highstock, Highmaps) Analogous to sourceWidth.
   *
   * @see <a href="https://api.highcharts.com/highcharts/exporting.sourceHeight">https://api.highcharts.com/highcharts/exporting.sourceHeight</a>
   * @see <a href="https://api.highcharts.com/highstock/exporting.sourceHeight">https://api.highcharts.com/highstock/exporting.sourceHeight</a>
   * @see <a href="https://api.highcharts.com/highmaps/exporting.sourceHeight">https://api.highcharts.com/highmaps/exporting.sourceHeight</a>
   *
   * @implspec sourceHeight?: number;
   *
   */
  @JSProperty("sourceHeight")
  double getSourceHeight();

  /**
   * (Highcharts, Highstock, Highmaps) Analogous to sourceWidth.
   *
   * @see <a href="https://api.highcharts.com/highcharts/exporting.sourceHeight">https://api.highcharts.com/highcharts/exporting.sourceHeight</a>
   * @see <a href="https://api.highcharts.com/highstock/exporting.sourceHeight">https://api.highcharts.com/highstock/exporting.sourceHeight</a>
   * @see <a href="https://api.highcharts.com/highmaps/exporting.sourceHeight">https://api.highcharts.com/highmaps/exporting.sourceHeight</a>
   *
   * @implspec sourceHeight?: number;
   *
   */
  @JSProperty("sourceHeight")
  void setSourceHeight(double value);

  /**
   * (Highcharts, Highstock, Highmaps) The width of the original chart when
   * exported, unless an explicit chart.width is set, or a pixel width is set
   * on the container. The width exported raster image is then multiplied by
   * scale.
   *
   * @see <a href="https://api.highcharts.com/highcharts/exporting.sourceWidth">https://api.highcharts.com/highcharts/exporting.sourceWidth</a>
   * @see <a href="https://api.highcharts.com/highstock/exporting.sourceWidth">https://api.highcharts.com/highstock/exporting.sourceWidth</a>
   * @see <a href="https://api.highcharts.com/highmaps/exporting.sourceWidth">https://api.highcharts.com/highmaps/exporting.sourceWidth</a>
   *
   * @implspec sourceWidth?: number;
   *
   */
  @JSProperty("sourceWidth")
  double getSourceWidth();

  /**
   * (Highcharts, Highstock, Highmaps) The width of the original chart when
   * exported, unless an explicit chart.width is set, or a pixel width is set
   * on the container. The width exported raster image is then multiplied by
   * scale.
   *
   * @see <a href="https://api.highcharts.com/highcharts/exporting.sourceWidth">https://api.highcharts.com/highcharts/exporting.sourceWidth</a>
   * @see <a href="https://api.highcharts.com/highstock/exporting.sourceWidth">https://api.highcharts.com/highstock/exporting.sourceWidth</a>
   * @see <a href="https://api.highcharts.com/highmaps/exporting.sourceWidth">https://api.highcharts.com/highmaps/exporting.sourceWidth</a>
   *
   * @implspec sourceWidth?: number;
   *
   */
  @JSProperty("sourceWidth")
  void setSourceWidth(double value);

  /**
   * (Highcharts, Highstock, Highmaps) Export-data module required. Caption
   * for the data table. Same as chart title by default. Set to <code>false</code> to
   * disable.
   *
   * @see <a href="https://api.highcharts.com/highcharts/exporting.tableCaption">https://api.highcharts.com/highcharts/exporting.tableCaption</a>
   * @see <a href="https://api.highcharts.com/highstock/exporting.tableCaption">https://api.highcharts.com/highstock/exporting.tableCaption</a>
   * @see <a href="https://api.highcharts.com/highmaps/exporting.tableCaption">https://api.highcharts.com/highmaps/exporting.tableCaption</a>
   *
   * @implspec tableCaption?: (boolean|string);
   *
   */
  @JSProperty("tableCaption")
  @Nullable
  Unknown getTableCaption();

  /**
   * (Highcharts, Highstock, Highmaps) Export-data module required. Caption
   * for the data table. Same as chart title by default. Set to <code>false</code> to
   * disable.
   *
   * @see <a href="https://api.highcharts.com/highcharts/exporting.tableCaption">https://api.highcharts.com/highcharts/exporting.tableCaption</a>
   * @see <a href="https://api.highcharts.com/highstock/exporting.tableCaption">https://api.highcharts.com/highstock/exporting.tableCaption</a>
   * @see <a href="https://api.highcharts.com/highmaps/exporting.tableCaption">https://api.highcharts.com/highmaps/exporting.tableCaption</a>
   *
   * @implspec tableCaption?: (boolean|string);
   *
   */
  @JSProperty("tableCaption")
  void setTableCaption(boolean value);

  /**
   * (Highcharts, Highstock, Highmaps) Export-data module required. Caption
   * for the data table. Same as chart title by default. Set to <code>false</code> to
   * disable.
   *
   * @see <a href="https://api.highcharts.com/highcharts/exporting.tableCaption">https://api.highcharts.com/highcharts/exporting.tableCaption</a>
   * @see <a href="https://api.highcharts.com/highstock/exporting.tableCaption">https://api.highcharts.com/highstock/exporting.tableCaption</a>
   * @see <a href="https://api.highcharts.com/highmaps/exporting.tableCaption">https://api.highcharts.com/highmaps/exporting.tableCaption</a>
   *
   * @implspec tableCaption?: (boolean|string);
   *
   */
  @JSProperty("tableCaption")
  void setTableCaption(String value);

  /**
   * (Highcharts, Highstock, Highmaps) Default MIME type for exporting if
   * <code>chart.exportChart()</code> is called without specifying a <code>type</code> option.
   * Possible values are <code>image/png</code>, <code>image/jpeg</code>, <code>application/pdf</code> and
   * <code>image/svg+xml</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/exporting.type">https://api.highcharts.com/highcharts/exporting.type</a>
   * @see <a href="https://api.highcharts.com/highstock/exporting.type">https://api.highcharts.com/highstock/exporting.type</a>
   * @see <a href="https://api.highcharts.com/highmaps/exporting.type">https://api.highcharts.com/highmaps/exporting.type</a>
   *
   * @implspec type?: (&quot;application/pdf&quot;|&quot;image/jpeg&quot;|&quot;image/png&quot;|&quot;image/svg+xml&quot;);
   *
   */
  @JSProperty("type")
  @Nullable
  Type getType();

  /**
   * (Highcharts, Highstock, Highmaps) Default MIME type for exporting if
   * <code>chart.exportChart()</code> is called without specifying a <code>type</code> option.
   * Possible values are <code>image/png</code>, <code>image/jpeg</code>, <code>application/pdf</code> and
   * <code>image/svg+xml</code>.
   *
   * @see <a href="https://api.highcharts.com/highcharts/exporting.type">https://api.highcharts.com/highcharts/exporting.type</a>
   * @see <a href="https://api.highcharts.com/highstock/exporting.type">https://api.highcharts.com/highstock/exporting.type</a>
   * @see <a href="https://api.highcharts.com/highmaps/exporting.type">https://api.highcharts.com/highmaps/exporting.type</a>
   *
   * @implspec type?: (&quot;application/pdf&quot;|&quot;image/jpeg&quot;|&quot;image/png&quot;|&quot;image/svg+xml&quot;);
   *
   */
  @JSProperty("type")
  void setType(Type value);

  /**
   * (Highcharts, Highstock, Highmaps) The URL for the server module
   * converting the SVG string to an image format. By default this points to
   * Highchart's free web service.
   *
   * @see <a href="https://api.highcharts.com/highcharts/exporting.url">https://api.highcharts.com/highcharts/exporting.url</a>
   * @see <a href="https://api.highcharts.com/highstock/exporting.url">https://api.highcharts.com/highstock/exporting.url</a>
   * @see <a href="https://api.highcharts.com/highmaps/exporting.url">https://api.highcharts.com/highmaps/exporting.url</a>
   *
   * @implspec url?: string;
   *
   */
  @JSProperty("url")
  @Nullable
  String getUrl();

  /**
   * (Highcharts, Highstock, Highmaps) The URL for the server module
   * converting the SVG string to an image format. By default this points to
   * Highchart's free web service.
   *
   * @see <a href="https://api.highcharts.com/highcharts/exporting.url">https://api.highcharts.com/highcharts/exporting.url</a>
   * @see <a href="https://api.highcharts.com/highstock/exporting.url">https://api.highcharts.com/highstock/exporting.url</a>
   * @see <a href="https://api.highcharts.com/highmaps/exporting.url">https://api.highcharts.com/highmaps/exporting.url</a>
   *
   * @implspec url?: string;
   *
   */
  @JSProperty("url")
  void setUrl(String value);

  /**
   * (Highcharts, Highstock, Highmaps) Export-data module required. Use multi
   * level headers in data table. If csv.columnHeaderFormatter is defined, it
   * has to return objects in order for multi level headers to work.
   *
   * @see <a href="https://api.highcharts.com/highcharts/exporting.useMultiLevelHeaders">https://api.highcharts.com/highcharts/exporting.useMultiLevelHeaders</a>
   * @see <a href="https://api.highcharts.com/highstock/exporting.useMultiLevelHeaders">https://api.highcharts.com/highstock/exporting.useMultiLevelHeaders</a>
   * @see <a href="https://api.highcharts.com/highmaps/exporting.useMultiLevelHeaders">https://api.highcharts.com/highmaps/exporting.useMultiLevelHeaders</a>
   *
   * @implspec useMultiLevelHeaders?: boolean;
   *
   */
  @JSProperty("useMultiLevelHeaders")
  boolean getUseMultiLevelHeaders();

  /**
   * (Highcharts, Highstock, Highmaps) Export-data module required. Use multi
   * level headers in data table. If csv.columnHeaderFormatter is defined, it
   * has to return objects in order for multi level headers to work.
   *
   * @see <a href="https://api.highcharts.com/highcharts/exporting.useMultiLevelHeaders">https://api.highcharts.com/highcharts/exporting.useMultiLevelHeaders</a>
   * @see <a href="https://api.highcharts.com/highstock/exporting.useMultiLevelHeaders">https://api.highcharts.com/highstock/exporting.useMultiLevelHeaders</a>
   * @see <a href="https://api.highcharts.com/highmaps/exporting.useMultiLevelHeaders">https://api.highcharts.com/highmaps/exporting.useMultiLevelHeaders</a>
   *
   * @implspec useMultiLevelHeaders?: boolean;
   *
   */
  @JSProperty("useMultiLevelHeaders")
  void setUseMultiLevelHeaders(boolean value);

  /**
   * (Highcharts, Highstock, Highmaps) Export-data module required. If using
   * multi level table headers, use rowspans for headers that have only one
   * level.
   *
   * @see <a href="https://api.highcharts.com/highcharts/exporting.useRowspanHeaders">https://api.highcharts.com/highcharts/exporting.useRowspanHeaders</a>
   * @see <a href="https://api.highcharts.com/highstock/exporting.useRowspanHeaders">https://api.highcharts.com/highstock/exporting.useRowspanHeaders</a>
   * @see <a href="https://api.highcharts.com/highmaps/exporting.useRowspanHeaders">https://api.highcharts.com/highmaps/exporting.useRowspanHeaders</a>
   *
   * @implspec useRowspanHeaders?: boolean;
   *
   */
  @JSProperty("useRowspanHeaders")
  boolean getUseRowspanHeaders();

  /**
   * (Highcharts, Highstock, Highmaps) Export-data module required. If using
   * multi level table headers, use rowspans for headers that have only one
   * level.
   *
   * @see <a href="https://api.highcharts.com/highcharts/exporting.useRowspanHeaders">https://api.highcharts.com/highcharts/exporting.useRowspanHeaders</a>
   * @see <a href="https://api.highcharts.com/highstock/exporting.useRowspanHeaders">https://api.highcharts.com/highstock/exporting.useRowspanHeaders</a>
   * @see <a href="https://api.highcharts.com/highmaps/exporting.useRowspanHeaders">https://api.highcharts.com/highmaps/exporting.useRowspanHeaders</a>
   *
   * @implspec useRowspanHeaders?: boolean;
   *
   */
  @JSProperty("useRowspanHeaders")
  void setUseRowspanHeaders(boolean value);

  /**
   * (Highcharts, Highstock, Highmaps) The pixel width of charts exported to
   * PNG or JPG. As of Highcharts 3.0, the default pixel width is a function
   * of the chart.width or exporting.sourceWidth and the exporting.scale.
   *
   * @see <a href="https://api.highcharts.com/highcharts/exporting.width">https://api.highcharts.com/highcharts/exporting.width</a>
   * @see <a href="https://api.highcharts.com/highstock/exporting.width">https://api.highcharts.com/highstock/exporting.width</a>
   * @see <a href="https://api.highcharts.com/highmaps/exporting.width">https://api.highcharts.com/highmaps/exporting.width</a>
   *
   * @implspec width?: number;
   *
   */
  @JSProperty("width")
  double getWidth();

  /**
   * (Highcharts, Highstock, Highmaps) The pixel width of charts exported to
   * PNG or JPG. As of Highcharts 3.0, the default pixel width is a function
   * of the chart.width or exporting.sourceWidth and the exporting.scale.
   *
   * @see <a href="https://api.highcharts.com/highcharts/exporting.width">https://api.highcharts.com/highcharts/exporting.width</a>
   * @see <a href="https://api.highcharts.com/highstock/exporting.width">https://api.highcharts.com/highstock/exporting.width</a>
   * @see <a href="https://api.highcharts.com/highmaps/exporting.width">https://api.highcharts.com/highmaps/exporting.width</a>
   *
   * @implspec width?: number;
   *
   */
  @JSProperty("width")
  void setWidth(double value);

  /**
   */
  abstract class Type extends JsEnum {
    public static final Type APPLICATION_PDF = JsEnum.of("application/pdf");

    public static final Type IMAGE_JPEG = JsEnum.of("image/jpeg");

    public static final Type IMAGE_PNG = JsEnum.of("image/png");

    public static final Type IMAGE_SVG_XML = JsEnum.of("image/svg+xml");
  }
}
