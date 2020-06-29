package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.extras.JsEnum;
import js.lang.Any;
import js.lang.Unknown;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * (Highcharts, Highstock, Highmaps, Gantt) Options for the exporting module.
 * For an overview on the matter, see the docs.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface ExportingOptions extends Any {
  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Accessibility options for the
   * exporting menu. Requires the Accessibility module.
   *
   */
  @JSProperty("accessibility")
  @Nullable
  ExportingAccessibilityOptions getAccessibility();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Accessibility options for the
   * exporting menu. Requires the Accessibility module.
   *
   */
  @JSProperty("accessibility")
  void setAccessibility(@Nullable ExportingAccessibilityOptions value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Experimental setting to allow
   * HTML inside the chart (added through the <code>useHTML</code> options), directly in
   * the exported image. This allows you to preserve complicated HTML
   * structures like tables or bi-directional text in exported charts.
   *
   * Disclaimer: The HTML is rendered in a <code>foreignObject</code> tag in the
   * generated SVG. The official export server is based on PhantomJS, which
   * supports this, but other SVG clients, like Batik, does not support it.
   * This also applies to downloaded SVG that you want to open in a desktop
   * client.
   *
   */
  @JSProperty("allowHTML")
  boolean getAllowHTML();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Experimental setting to allow
   * HTML inside the chart (added through the <code>useHTML</code> options), directly in
   * the exported image. This allows you to preserve complicated HTML
   * structures like tables or bi-directional text in exported charts.
   *
   * Disclaimer: The HTML is rendered in a <code>foreignObject</code> tag in the
   * generated SVG. The official export server is based on PhantomJS, which
   * supports this, but other SVG clients, like Batik, does not support it.
   * This also applies to downloaded SVG that you want to open in a desktop
   * client.
   *
   */
  @JSProperty("allowHTML")
  void setAllowHTML(boolean value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Options for the export related
   * buttons, print and export. In addition to the default buttons listed
   * here, custom buttons can be added. See navigation.buttonOptions for
   * general options.
   *
   */
  @JSProperty("buttons")
  @Nullable
  Unknown /* ( ExportingButtonsOptions | Dictionary < ExportingButtonsOptionsObject > ) */ getButtons(
      );

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Options for the export related
   * buttons, print and export. In addition to the default buttons listed
   * here, custom buttons can be added. See navigation.buttonOptions for
   * general options.
   *
   */
  @JSProperty("buttons")
  void setButtons(@Nullable ExportingButtonsOptions value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Options for the export related
   * buttons, print and export. In addition to the default buttons listed
   * here, custom buttons can be added. See navigation.buttonOptions for
   * general options.
   *
   */
  @JSProperty("buttons")
  void setButtons(@Nullable Dictionary<ExportingButtonsOptionsObject> value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Additional chart options to be
   * merged into the chart before exporting to an image format. This does not
   * apply to printing the chart via the export menu.
   *
   * For example, a common use case is to add data labels to improve
   * readability of the exported chart, or to add a printer-friendly color
   * scheme to exported PDFs.
   *
   */
  @JSProperty("chartOptions")
  @Nullable
  Options getChartOptions();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Additional chart options to be
   * merged into the chart before exporting to an image format. This does not
   * apply to printing the chart via the export menu.
   *
   * For example, a common use case is to add data labels to improve
   * readability of the exported chart, or to add a printer-friendly color
   * scheme to exported PDFs.
   *
   */
  @JSProperty("chartOptions")
  void setChartOptions(@Nullable Options value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Options for exporting data to
   * CSV or ExCel, or displaying the data in a HTML table or a JavaScript
   * structure.
   *
   * This module adds data export options to the export menu and provides
   * functions like <code>Chart.getCSV</code>, <code>Chart.getTable</code>, <code>Chart.getDataRows</code> and
   * <code>Chart.viewData</code>.
   *
   * The XLS converter is limited and only creates a HTML string that is
   * passed for download, which works but creates a warning before opening.
   * The workaround for this is to use a third party XLSX converter, as
   * demonstrated in the sample below.
   *
   */
  @JSProperty("csv")
  @Nullable
  ExportingCsvOptions getCsv();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Options for exporting data to
   * CSV or ExCel, or displaying the data in a HTML table or a JavaScript
   * structure.
   *
   * This module adds data export options to the export menu and provides
   * functions like <code>Chart.getCSV</code>, <code>Chart.getTable</code>, <code>Chart.getDataRows</code> and
   * <code>Chart.viewData</code>.
   *
   * The XLS converter is limited and only creates a HTML string that is
   * passed for download, which works but creates a warning before opening.
   * The workaround for this is to use a third party XLSX converter, as
   * demonstrated in the sample below.
   *
   */
  @JSProperty("csv")
  void setCsv(@Nullable ExportingCsvOptions value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Whether to enable the exporting
   * module. Disabling the module will hide the context button, but API
   * methods will still be available.
   *
   */
  @JSProperty("enabled")
  boolean getEnabled();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Whether to enable the exporting
   * module. Disabling the module will hide the context button, but API
   * methods will still be available.
   *
   */
  @JSProperty("enabled")
  void setEnabled(boolean value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Function to call if the
   * offline-exporting module fails to export a chart on the client side, and
   * fallbackToExportServer is disabled. If left undefined, an exception is
   * thrown instead. Receives two parameters, the exporting options, and the
   * error from the module.
   *
   */
  @JSProperty("error")
  @Nullable
  ExportingErrorCallbackFunction getError();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Function to call if the
   * offline-exporting module fails to export a chart on the client side, and
   * fallbackToExportServer is disabled. If left undefined, an exception is
   * thrown instead. Receives two parameters, the exporting options, and the
   * error from the module.
   *
   */
  @JSProperty("error")
  void setError(@Nullable ExportingErrorCallbackFunction value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Whether or not to fall back to
   * the export server if the offline-exporting module is unable to export the
   * chart on the client side. This happens for certain browsers, and certain
   * features (e.g. allowHTML), depending on the image type exporting to. For
   * very complex charts, it is possible that export can fail in browsers that
   * don't support Blob objects, due to data URL length limits. It is
   * recommended to define the exporting.error handler if disabling fallback,
   * in order to notify users in case export fails.
   *
   */
  @JSProperty("fallbackToExportServer")
  boolean getFallbackToExportServer();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Whether or not to fall back to
   * the export server if the offline-exporting module is unable to export the
   * chart on the client side. This happens for certain browsers, and certain
   * features (e.g. allowHTML), depending on the image type exporting to. For
   * very complex charts, it is possible that export can fail in browsers that
   * don't support Blob objects, due to data URL length limits. It is
   * recommended to define the exporting.error handler if disabling fallback,
   * in order to notify users in case export fails.
   *
   */
  @JSProperty("fallbackToExportServer")
  void setFallbackToExportServer(boolean value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The filename, without extension,
   * to use for the exported chart.
   *
   */
  @JSProperty("filename")
  @Nullable
  String getFilename();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The filename, without extension,
   * to use for the exported chart.
   *
   */
  @JSProperty("filename")
  void setFilename(@Nullable String value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) An object containing additional
   * key value data for the POST form that sends the SVG to the export server.
   * For example, a <code>target</code> can be set to make sure the generated image is
   * received in another frame, or a custom <code>enctype</code> or <code>encoding</code> can be
   * set.
   *
   */
  @JSProperty("formAttributes")
  @Nullable
  Unknown /* HTMLAttributes */ getFormAttributes();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) An object containing additional
   * key value data for the POST form that sends the SVG to the export server.
   * For example, a <code>target</code> can be set to make sure the generated image is
   * received in another frame, or a custom <code>enctype</code> or <code>encoding</code> can be
   * set.
   *
   */
  @JSProperty("formAttributes")
  void setFormAttributes(@Nullable Dictionary<Unknown /* boolean */> value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Path where Highcharts will look
   * for export module dependencies to load on demand if they don't already
   * exist on <code>window</code>. Should currently point to location of CanVG library,
   * RGBColor.js, jsPDF and svg2pdf.js, required for client side export in
   * certain browsers.
   *
   */
  @JSProperty("libURL")
  @Nullable
  String getLibURL();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Path where Highcharts will look
   * for export module dependencies to load on demand if they don't already
   * exist on <code>window</code>. Should currently point to location of CanVG library,
   * RGBColor.js, jsPDF and svg2pdf.js, required for client side export in
   * certain browsers.
   *
   */
  @JSProperty("libURL")
  void setLibURL(@Nullable String value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) An object consisting of
   * definitions for the menu items in the context menu. Each key value pair
   * has a <code>key</code> that is referenced in the menuItems setting, and a <code>value</code>,
   * which is an object with the following properties:
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
   * Custom text for the &quot;exitFullScreen&quot; can be set only in lang options (it
   * is not a separate button).
   *
   */
  @JSProperty("menuItemDefinitions")
  @Nullable
  Dictionary<ExportingMenuObject> getMenuItemDefinitions();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) An object consisting of
   * definitions for the menu items in the context menu. Each key value pair
   * has a <code>key</code> that is referenced in the menuItems setting, and a <code>value</code>,
   * which is an object with the following properties:
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
   * Custom text for the &quot;exitFullScreen&quot; can be set only in lang options (it
   * is not a separate button).
   *
   */
  @JSProperty("menuItemDefinitions")
  void setMenuItemDefinitions(@Nullable Dictionary<ExportingMenuObject> value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) When printing the chart from the
   * menu item in the burger menu, if the on-screen chart exceeds this width,
   * it is resized. After printing or cancelled, it is restored. The default
   * width makes the chart fit into typical paper format. Note that this does
   * not affect the chart when printing the web page as a whole.
   *
   */
  @JSProperty("printMaxWidth")
  double getPrintMaxWidth();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) When printing the chart from the
   * menu item in the burger menu, if the on-screen chart exceeds this width,
   * it is resized. After printing or cancelled, it is restored. The default
   * width makes the chart fit into typical paper format. Note that this does
   * not affect the chart when printing the web page as a whole.
   *
   */
  @JSProperty("printMaxWidth")
  void setPrintMaxWidth(double value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Defines the scale or zoom factor
   * for the exported image compared to the on-screen display. While for
   * instance a 600px wide chart may look good on a website, it will look bad
   * in print. The default scale of 2 makes this chart export to a 1200px PNG
   * or JPG.
   *
   */
  @JSProperty("scale")
  double getScale();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Defines the scale or zoom factor
   * for the exported image compared to the on-screen display. While for
   * instance a 600px wide chart may look good on a website, it will look bad
   * in print. The default scale of 2 makes this chart export to a 1200px PNG
   * or JPG.
   *
   */
  @JSProperty("scale")
  void setScale(double value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Show a HTML table below the
   * chart with the chart's current data.
   *
   */
  @JSProperty("showTable")
  boolean getShowTable();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Show a HTML table below the
   * chart with the chart's current data.
   *
   */
  @JSProperty("showTable")
  void setShowTable(boolean value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Analogous to sourceWidth.
   *
   */
  @JSProperty("sourceHeight")
  double getSourceHeight();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Analogous to sourceWidth.
   *
   */
  @JSProperty("sourceHeight")
  void setSourceHeight(double value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The width of the original chart
   * when exported, unless an explicit chart.width is set, or a pixel width is
   * set on the container. The width exported raster image is then multiplied
   * by scale.
   *
   */
  @JSProperty("sourceWidth")
  double getSourceWidth();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The width of the original chart
   * when exported, unless an explicit chart.width is set, or a pixel width is
   * set on the container. The width exported raster image is then multiplied
   * by scale.
   *
   */
  @JSProperty("sourceWidth")
  void setSourceWidth(double value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Caption for the data table. Same
   * as chart title by default. Set to <code>false</code> to disable.
   *
   */
  @JSProperty("tableCaption")
  @Nullable
  Unknown /* ( boolean | string ) */ getTableCaption();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Caption for the data table. Same
   * as chart title by default. Set to <code>false</code> to disable.
   *
   */
  @JSProperty("tableCaption")
  void setTableCaption(boolean value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Caption for the data table. Same
   * as chart title by default. Set to <code>false</code> to disable.
   *
   */
  @JSProperty("tableCaption")
  void setTableCaption(@Nullable String value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Default MIME type for exporting
   * if <code>chart.exportChart()</code> is called without specifying a <code>type</code> option.
   * Possible values are <code>image/png</code>, <code>image/jpeg</code>, <code>application/pdf</code> and
   * <code>image/svg+xml</code>.
   *
   */
  @JSProperty("type")
  @Nullable
  Type getType();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Default MIME type for exporting
   * if <code>chart.exportChart()</code> is called without specifying a <code>type</code> option.
   * Possible values are <code>image/png</code>, <code>image/jpeg</code>, <code>application/pdf</code> and
   * <code>image/svg+xml</code>.
   *
   */
  @JSProperty("type")
  void setType(@Nullable Type value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The URL for the server module
   * converting the SVG string to an image format. By default this points to
   * Highchart's free web service.
   *
   */
  @JSProperty("url")
  @Nullable
  String getUrl();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The URL for the server module
   * converting the SVG string to an image format. By default this points to
   * Highchart's free web service.
   *
   */
  @JSProperty("url")
  void setUrl(@Nullable String value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Use multi level headers in data
   * table. If csv.columnHeaderFormatter is defined, it has to return objects
   * in order for multi level headers to work.
   *
   */
  @JSProperty("useMultiLevelHeaders")
  boolean getUseMultiLevelHeaders();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Use multi level headers in data
   * table. If csv.columnHeaderFormatter is defined, it has to return objects
   * in order for multi level headers to work.
   *
   */
  @JSProperty("useMultiLevelHeaders")
  void setUseMultiLevelHeaders(boolean value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) If using multi level table
   * headers, use rowspans for headers that have only one level.
   *
   */
  @JSProperty("useRowspanHeaders")
  boolean getUseRowspanHeaders();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) If using multi level table
   * headers, use rowspans for headers that have only one level.
   *
   */
  @JSProperty("useRowspanHeaders")
  void setUseRowspanHeaders(boolean value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The pixel width of charts
   * exported to PNG or JPG. As of Highcharts 3.0, the default pixel width is
   * a function of the chart.width or exporting.sourceWidth and the
   * exporting.scale.
   *
   */
  @JSProperty("width")
  double getWidth();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) The pixel width of charts
   * exported to PNG or JPG. As of Highcharts 3.0, the default pixel width is
   * a function of the chart.width or exporting.sourceWidth and the
   * exporting.scale.
   *
   */
  @JSProperty("width")
  void setWidth(double value);

  static Builder builder() {
    return new Builder();
  }

  abstract class Type extends JsEnum {
    public static final Type APPLICATION_PDF = JsEnum.of("application/pdf");

    public static final Type IMAGE_JPEG = JsEnum.of("image/jpeg");

    public static final Type IMAGE_PNG = JsEnum.of("image/png");

    public static final Type IMAGE_SVG_XML = JsEnum.of("image/svg+xml");
  }

  final class Builder {
    private final ExportingOptions object = Any.empty();

    private Builder() {
    }

    public ExportingOptions build() {
      return object;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Accessibility options for the
     * exporting menu. Requires the Accessibility module.
     *
     */
    public Builder accessibility(@Nullable ExportingAccessibilityOptions value) {
      object.setAccessibility(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Experimental setting to allow
     * HTML inside the chart (added through the <code>useHTML</code> options), directly in
     * the exported image. This allows you to preserve complicated HTML
     * structures like tables or bi-directional text in exported charts.
     *
     * Disclaimer: The HTML is rendered in a <code>foreignObject</code> tag in the
     * generated SVG. The official export server is based on PhantomJS, which
     * supports this, but other SVG clients, like Batik, does not support it.
     * This also applies to downloaded SVG that you want to open in a desktop
     * client.
     *
     */
    public Builder allowHTML(boolean value) {
      object.setAllowHTML(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Options for the export related
     * buttons, print and export. In addition to the default buttons listed
     * here, custom buttons can be added. See navigation.buttonOptions for
     * general options.
     *
     */
    public Builder buttons(@Nullable ExportingButtonsOptions value) {
      object.setButtons(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Options for the export related
     * buttons, print and export. In addition to the default buttons listed
     * here, custom buttons can be added. See navigation.buttonOptions for
     * general options.
     *
     */
    public Builder buttons(@Nullable Dictionary<ExportingButtonsOptionsObject> value) {
      object.setButtons(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Additional chart options to be
     * merged into the chart before exporting to an image format. This does not
     * apply to printing the chart via the export menu.
     *
     * For example, a common use case is to add data labels to improve
     * readability of the exported chart, or to add a printer-friendly color
     * scheme to exported PDFs.
     *
     */
    public Builder chartOptions(@Nullable Options value) {
      object.setChartOptions(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Options for exporting data to
     * CSV or ExCel, or displaying the data in a HTML table or a JavaScript
     * structure.
     *
     * This module adds data export options to the export menu and provides
     * functions like <code>Chart.getCSV</code>, <code>Chart.getTable</code>, <code>Chart.getDataRows</code> and
     * <code>Chart.viewData</code>.
     *
     * The XLS converter is limited and only creates a HTML string that is
     * passed for download, which works but creates a warning before opening.
     * The workaround for this is to use a third party XLSX converter, as
     * demonstrated in the sample below.
     *
     */
    public Builder csv(@Nullable ExportingCsvOptions value) {
      object.setCsv(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Whether to enable the exporting
     * module. Disabling the module will hide the context button, but API
     * methods will still be available.
     *
     */
    public Builder enabled(boolean value) {
      object.setEnabled(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Function to call if the
     * offline-exporting module fails to export a chart on the client side, and
     * fallbackToExportServer is disabled. If left undefined, an exception is
     * thrown instead. Receives two parameters, the exporting options, and the
     * error from the module.
     *
     */
    public Builder error(@Nullable ExportingErrorCallbackFunction value) {
      object.setError(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Whether or not to fall back to
     * the export server if the offline-exporting module is unable to export the
     * chart on the client side. This happens for certain browsers, and certain
     * features (e.g. allowHTML), depending on the image type exporting to. For
     * very complex charts, it is possible that export can fail in browsers that
     * don't support Blob objects, due to data URL length limits. It is
     * recommended to define the exporting.error handler if disabling fallback,
     * in order to notify users in case export fails.
     *
     */
    public Builder fallbackToExportServer(boolean value) {
      object.setFallbackToExportServer(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The filename, without extension,
     * to use for the exported chart.
     *
     */
    public Builder filename(@Nullable String value) {
      object.setFilename(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) An object containing additional
     * key value data for the POST form that sends the SVG to the export server.
     * For example, a <code>target</code> can be set to make sure the generated image is
     * received in another frame, or a custom <code>enctype</code> or <code>encoding</code> can be
     * set.
     *
     */
    public Builder formAttributes(@Nullable Dictionary<Unknown> value) {
      object.setFormAttributes(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Path where Highcharts will look
     * for export module dependencies to load on demand if they don't already
     * exist on <code>window</code>. Should currently point to location of CanVG library,
     * RGBColor.js, jsPDF and svg2pdf.js, required for client side export in
     * certain browsers.
     *
     */
    public Builder libURL(@Nullable String value) {
      object.setLibURL(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) An object consisting of
     * definitions for the menu items in the context menu. Each key value pair
     * has a <code>key</code> that is referenced in the menuItems setting, and a <code>value</code>,
     * which is an object with the following properties:
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
     * Custom text for the &quot;exitFullScreen&quot; can be set only in lang options (it
     * is not a separate button).
     *
     */
    public Builder menuItemDefinitions(@Nullable Dictionary<ExportingMenuObject> value) {
      object.setMenuItemDefinitions(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) When printing the chart from the
     * menu item in the burger menu, if the on-screen chart exceeds this width,
     * it is resized. After printing or cancelled, it is restored. The default
     * width makes the chart fit into typical paper format. Note that this does
     * not affect the chart when printing the web page as a whole.
     *
     */
    public Builder printMaxWidth(double value) {
      object.setPrintMaxWidth(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Defines the scale or zoom factor
     * for the exported image compared to the on-screen display. While for
     * instance a 600px wide chart may look good on a website, it will look bad
     * in print. The default scale of 2 makes this chart export to a 1200px PNG
     * or JPG.
     *
     */
    public Builder scale(double value) {
      object.setScale(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Show a HTML table below the
     * chart with the chart's current data.
     *
     */
    public Builder showTable(boolean value) {
      object.setShowTable(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Analogous to sourceWidth.
     *
     */
    public Builder sourceHeight(double value) {
      object.setSourceHeight(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The width of the original chart
     * when exported, unless an explicit chart.width is set, or a pixel width is
     * set on the container. The width exported raster image is then multiplied
     * by scale.
     *
     */
    public Builder sourceWidth(double value) {
      object.setSourceWidth(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Caption for the data table. Same
     * as chart title by default. Set to <code>false</code> to disable.
     *
     */
    public Builder tableCaption(boolean value) {
      object.setTableCaption(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Caption for the data table. Same
     * as chart title by default. Set to <code>false</code> to disable.
     *
     */
    public Builder tableCaption(@Nullable String value) {
      object.setTableCaption(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Default MIME type for exporting
     * if <code>chart.exportChart()</code> is called without specifying a <code>type</code> option.
     * Possible values are <code>image/png</code>, <code>image/jpeg</code>, <code>application/pdf</code> and
     * <code>image/svg+xml</code>.
     *
     */
    public Builder type(@Nullable Type value) {
      object.setType(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The URL for the server module
     * converting the SVG string to an image format. By default this points to
     * Highchart's free web service.
     *
     */
    public Builder url(@Nullable String value) {
      object.setUrl(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Use multi level headers in data
     * table. If csv.columnHeaderFormatter is defined, it has to return objects
     * in order for multi level headers to work.
     *
     */
    public Builder useMultiLevelHeaders(boolean value) {
      object.setUseMultiLevelHeaders(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) If using multi level table
     * headers, use rowspans for headers that have only one level.
     *
     */
    public Builder useRowspanHeaders(boolean value) {
      object.setUseRowspanHeaders(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) The pixel width of charts
     * exported to PNG or JPG. As of Highcharts 3.0, the default pixel width is
     * a function of the chart.width or exporting.sourceWidth and the
     * exporting.scale.
     *
     */
    public Builder width(double value) {
      object.setWidth(value);
      return this;
    }
  }
}
