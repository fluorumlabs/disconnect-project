package com.github.fluorumlabs.disconnect.highcharts;

import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Highmaps) Configure the accessibility strings in the
 * chart. Requires the accessibility module to be loaded. For a description of
 * the module and information on its features, see Highcharts Accessibility.
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
 */
public interface LangAccessibilityOptions extends Any {
  /**
   * (Highcharts, Highstock, Highmaps) Axis description format strings.
   *
   * @see <a href="https://api.highcharts.com/highcharts/lang.accessibility.axis">https://api.highcharts.com/highcharts/lang.accessibility.axis</a>
   * @see <a href="https://api.highcharts.com/highstock/lang.accessibility.axis">https://api.highcharts.com/highstock/lang.accessibility.axis</a>
   * @see <a href="https://api.highcharts.com/highmaps/lang.accessibility.axis">https://api.highcharts.com/highmaps/lang.accessibility.axis</a>
   *
   * @implspec axis?: LangAccessibilityAxisOptions;
   *
   */
  @JSProperty("axis")
  @Nullable
  LangAccessibilityAxisOptions getAxis();

  /**
   * (Highcharts, Highstock, Highmaps) Axis description format strings.
   *
   * @see <a href="https://api.highcharts.com/highcharts/lang.accessibility.axis">https://api.highcharts.com/highcharts/lang.accessibility.axis</a>
   * @see <a href="https://api.highcharts.com/highstock/lang.accessibility.axis">https://api.highcharts.com/highstock/lang.accessibility.axis</a>
   * @see <a href="https://api.highcharts.com/highmaps/lang.accessibility.axis">https://api.highcharts.com/highmaps/lang.accessibility.axis</a>
   *
   * @implspec axis?: LangAccessibilityAxisOptions;
   *
   */
  @JSProperty("axis")
  void setAxis(LangAccessibilityAxisOptions value);

  /**
   * @implspec chartContainerLabel?: string;
   *
   */
  @JSProperty("chartContainerLabel")
  @Nullable
  String getChartContainerLabel();

  /**
   * @implspec chartContainerLabel?: string;
   *
   */
  @JSProperty("chartContainerLabel")
  void setChartContainerLabel(String value);

  /**
   * @implspec chartHeading?: string;
   *
   */
  @JSProperty("chartHeading")
  @Nullable
  String getChartHeading();

  /**
   * @implspec chartHeading?: string;
   *
   */
  @JSProperty("chartHeading")
  void setChartHeading(String value);

  /**
   * (Highcharts, Highstock, Highmaps) Chart type description strings. This is
   * added to the chart information region.
   *
   * If there is only a single series type used in the chart, we use the
   * format string for the series type, or default if missing. There is one
   * format string for cases where there is only a single series in the chart,
   * and one for multiple series of the same type.
   *
   * @see <a href="https://api.highcharts.com/highcharts/lang.accessibility.chartTypes">https://api.highcharts.com/highcharts/lang.accessibility.chartTypes</a>
   * @see <a href="https://api.highcharts.com/highstock/lang.accessibility.chartTypes">https://api.highcharts.com/highstock/lang.accessibility.chartTypes</a>
   * @see <a href="https://api.highcharts.com/highmaps/lang.accessibility.chartTypes">https://api.highcharts.com/highmaps/lang.accessibility.chartTypes</a>
   *
   * @implspec chartTypes?: LangAccessibilityChartTypesOptions;
   *
   */
  @JSProperty("chartTypes")
  @Nullable
  LangAccessibilityChartTypesOptions getChartTypes();

  /**
   * (Highcharts, Highstock, Highmaps) Chart type description strings. This is
   * added to the chart information region.
   *
   * If there is only a single series type used in the chart, we use the
   * format string for the series type, or default if missing. There is one
   * format string for cases where there is only a single series in the chart,
   * and one for multiple series of the same type.
   *
   * @see <a href="https://api.highcharts.com/highcharts/lang.accessibility.chartTypes">https://api.highcharts.com/highcharts/lang.accessibility.chartTypes</a>
   * @see <a href="https://api.highcharts.com/highstock/lang.accessibility.chartTypes">https://api.highcharts.com/highstock/lang.accessibility.chartTypes</a>
   * @see <a href="https://api.highcharts.com/highmaps/lang.accessibility.chartTypes">https://api.highcharts.com/highmaps/lang.accessibility.chartTypes</a>
   *
   * @implspec chartTypes?: LangAccessibilityChartTypesOptions;
   *
   */
  @JSProperty("chartTypes")
  void setChartTypes(LangAccessibilityChartTypesOptions value);

  /**
   * @implspec defaultChartTitle?: string;
   *
   */
  @JSProperty("defaultChartTitle")
  @Nullable
  String getDefaultChartTitle();

  /**
   * @implspec defaultChartTitle?: string;
   *
   */
  @JSProperty("defaultChartTitle")
  void setDefaultChartTitle(String value);

  /**
   * (Highcharts, Highstock, Highmaps) Exporting menu format strings for
   * accessibility module.
   *
   * @see <a href="https://api.highcharts.com/highcharts/lang.accessibility.exporting">https://api.highcharts.com/highcharts/lang.accessibility.exporting</a>
   * @see <a href="https://api.highcharts.com/highstock/lang.accessibility.exporting">https://api.highcharts.com/highstock/lang.accessibility.exporting</a>
   * @see <a href="https://api.highcharts.com/highmaps/lang.accessibility.exporting">https://api.highcharts.com/highmaps/lang.accessibility.exporting</a>
   *
   * @implspec exporting?: LangAccessibilityExportingOptions;
   *
   */
  @JSProperty("exporting")
  @Nullable
  LangAccessibilityExportingOptions getExporting();

  /**
   * (Highcharts, Highstock, Highmaps) Exporting menu format strings for
   * accessibility module.
   *
   * @see <a href="https://api.highcharts.com/highcharts/lang.accessibility.exporting">https://api.highcharts.com/highcharts/lang.accessibility.exporting</a>
   * @see <a href="https://api.highcharts.com/highstock/lang.accessibility.exporting">https://api.highcharts.com/highstock/lang.accessibility.exporting</a>
   * @see <a href="https://api.highcharts.com/highmaps/lang.accessibility.exporting">https://api.highcharts.com/highmaps/lang.accessibility.exporting</a>
   *
   * @implspec exporting?: LangAccessibilityExportingOptions;
   *
   */
  @JSProperty("exporting")
  void setExporting(LangAccessibilityExportingOptions value);

  /**
   * @implspec legendItem?: string;
   *
   */
  @JSProperty("legendItem")
  @Nullable
  String getLegendItem();

  /**
   * @implspec legendItem?: string;
   *
   */
  @JSProperty("legendItem")
  void setLegendItem(String value);

  /**
   * @implspec longDescriptionHeading?: string;
   *
   */
  @JSProperty("longDescriptionHeading")
  @Nullable
  String getLongDescriptionHeading();

  /**
   * @implspec longDescriptionHeading?: string;
   *
   */
  @JSProperty("longDescriptionHeading")
  void setLongDescriptionHeading(String value);

  /**
   * @implspec mapZoomIn?: string;
   *
   */
  @JSProperty("mapZoomIn")
  @Nullable
  String getMapZoomIn();

  /**
   * @implspec mapZoomIn?: string;
   *
   */
  @JSProperty("mapZoomIn")
  void setMapZoomIn(String value);

  /**
   * @implspec mapZoomOut?: string;
   *
   */
  @JSProperty("mapZoomOut")
  @Nullable
  String getMapZoomOut();

  /**
   * @implspec mapZoomOut?: string;
   *
   */
  @JSProperty("mapZoomOut")
  void setMapZoomOut(String value);

  /**
   * @implspec navigationHint?: string;
   *
   */
  @JSProperty("navigationHint")
  @Nullable
  String getNavigationHint();

  /**
   * @implspec navigationHint?: string;
   *
   */
  @JSProperty("navigationHint")
  void setNavigationHint(String value);

  /**
   * @implspec noDescription?: string;
   *
   */
  @JSProperty("noDescription")
  @Nullable
  String getNoDescription();

  /**
   * @implspec noDescription?: string;
   *
   */
  @JSProperty("noDescription")
  void setNoDescription(String value);

  /**
   * @implspec rangeSelectorButton?: string;
   *
   */
  @JSProperty("rangeSelectorButton")
  @Nullable
  String getRangeSelectorButton();

  /**
   * @implspec rangeSelectorButton?: string;
   *
   */
  @JSProperty("rangeSelectorButton")
  void setRangeSelectorButton(String value);

  /**
   * @implspec rangeSelectorMaxInput?: string;
   *
   */
  @JSProperty("rangeSelectorMaxInput")
  @Nullable
  String getRangeSelectorMaxInput();

  /**
   * @implspec rangeSelectorMaxInput?: string;
   *
   */
  @JSProperty("rangeSelectorMaxInput")
  void setRangeSelectorMaxInput(String value);

  /**
   * @implspec rangeSelectorMinInput?: string;
   *
   */
  @JSProperty("rangeSelectorMinInput")
  @Nullable
  String getRangeSelectorMinInput();

  /**
   * @implspec rangeSelectorMinInput?: string;
   *
   */
  @JSProperty("rangeSelectorMinInput")
  void setRangeSelectorMinInput(String value);

  /**
   * @implspec screenReaderRegionLabel?: string;
   *
   */
  @JSProperty("screenReaderRegionLabel")
  @Nullable
  String getScreenReaderRegionLabel();

  /**
   * @implspec screenReaderRegionLabel?: string;
   *
   */
  @JSProperty("screenReaderRegionLabel")
  void setScreenReaderRegionLabel(String value);

  /**
   * (Highcharts, Highstock, Highmaps) Lang configuration for different series
   * types. For more dynamic control over the series element descriptions, see
   * accessibility.seriesDescriptionFormatter.
   *
   * @see <a href="https://api.highcharts.com/highcharts/lang.accessibility.series">https://api.highcharts.com/highcharts/lang.accessibility.series</a>
   * @see <a href="https://api.highcharts.com/highstock/lang.accessibility.series">https://api.highcharts.com/highstock/lang.accessibility.series</a>
   * @see <a href="https://api.highcharts.com/highmaps/lang.accessibility.series">https://api.highcharts.com/highmaps/lang.accessibility.series</a>
   *
   * @implspec series?: LangAccessibilitySeriesOptions;
   *
   */
  @JSProperty("series")
  @Nullable
  LangAccessibilitySeriesOptions getSeries();

  /**
   * (Highcharts, Highstock, Highmaps) Lang configuration for different series
   * types. For more dynamic control over the series element descriptions, see
   * accessibility.seriesDescriptionFormatter.
   *
   * @see <a href="https://api.highcharts.com/highcharts/lang.accessibility.series">https://api.highcharts.com/highcharts/lang.accessibility.series</a>
   * @see <a href="https://api.highcharts.com/highstock/lang.accessibility.series">https://api.highcharts.com/highstock/lang.accessibility.series</a>
   * @see <a href="https://api.highcharts.com/highmaps/lang.accessibility.series">https://api.highcharts.com/highmaps/lang.accessibility.series</a>
   *
   * @implspec series?: LangAccessibilitySeriesOptions;
   *
   */
  @JSProperty("series")
  void setSeries(LangAccessibilitySeriesOptions value);

  /**
   * (Highcharts, Highstock, Highmaps) Descriptions of lesser known series
   * types. The relevant description is added to the screen reader information
   * region when these series types are used.
   *
   * @see <a href="https://api.highcharts.com/highcharts/lang.accessibility.seriesTypeDescriptions">https://api.highcharts.com/highcharts/lang.accessibility.seriesTypeDescriptions</a>
   * @see <a href="https://api.highcharts.com/highstock/lang.accessibility.seriesTypeDescriptions">https://api.highcharts.com/highstock/lang.accessibility.seriesTypeDescriptions</a>
   * @see <a href="https://api.highcharts.com/highmaps/lang.accessibility.seriesTypeDescriptions">https://api.highcharts.com/highmaps/lang.accessibility.seriesTypeDescriptions</a>
   *
   * @implspec seriesTypeDescriptions?: LangAccessibilitySeriesTypeDescriptionsOptions;
   *
   */
  @JSProperty("seriesTypeDescriptions")
  @Nullable
  LangAccessibilitySeriesTypeDescriptionsOptions getSeriesTypeDescriptions();

  /**
   * (Highcharts, Highstock, Highmaps) Descriptions of lesser known series
   * types. The relevant description is added to the screen reader information
   * region when these series types are used.
   *
   * @see <a href="https://api.highcharts.com/highcharts/lang.accessibility.seriesTypeDescriptions">https://api.highcharts.com/highcharts/lang.accessibility.seriesTypeDescriptions</a>
   * @see <a href="https://api.highcharts.com/highstock/lang.accessibility.seriesTypeDescriptions">https://api.highcharts.com/highstock/lang.accessibility.seriesTypeDescriptions</a>
   * @see <a href="https://api.highcharts.com/highmaps/lang.accessibility.seriesTypeDescriptions">https://api.highcharts.com/highmaps/lang.accessibility.seriesTypeDescriptions</a>
   *
   * @implspec seriesTypeDescriptions?: LangAccessibilitySeriesTypeDescriptionsOptions;
   *
   */
  @JSProperty("seriesTypeDescriptions")
  void setSeriesTypeDescriptions(LangAccessibilitySeriesTypeDescriptionsOptions value);

  /**
   * @implspec structureHeading?: string;
   *
   */
  @JSProperty("structureHeading")
  @Nullable
  String getStructureHeading();

  /**
   * @implspec structureHeading?: string;
   *
   */
  @JSProperty("structureHeading")
  void setStructureHeading(String value);

  /**
   * (Highcharts, Highstock, Highmaps) Title element text for the chart SVG
   * element. Leave this empty to disable adding the title element. Browsers
   * will display this content when hovering over elements in the chart.
   * Assistive technology may use this element to label the chart.
   *
   * @see <a href="https://api.highcharts.com/highcharts/lang.accessibility.svgContainerTitle">https://api.highcharts.com/highcharts/lang.accessibility.svgContainerTitle</a>
   * @see <a href="https://api.highcharts.com/highstock/lang.accessibility.svgContainerTitle">https://api.highcharts.com/highstock/lang.accessibility.svgContainerTitle</a>
   * @see <a href="https://api.highcharts.com/highmaps/lang.accessibility.svgContainerTitle">https://api.highcharts.com/highmaps/lang.accessibility.svgContainerTitle</a>
   *
   * @implspec svgContainerTitle?: string;
   *
   */
  @JSProperty("svgContainerTitle")
  @Nullable
  String getSvgContainerTitle();

  /**
   * (Highcharts, Highstock, Highmaps) Title element text for the chart SVG
   * element. Leave this empty to disable adding the title element. Browsers
   * will display this content when hovering over elements in the chart.
   * Assistive technology may use this element to label the chart.
   *
   * @see <a href="https://api.highcharts.com/highcharts/lang.accessibility.svgContainerTitle">https://api.highcharts.com/highcharts/lang.accessibility.svgContainerTitle</a>
   * @see <a href="https://api.highcharts.com/highstock/lang.accessibility.svgContainerTitle">https://api.highcharts.com/highstock/lang.accessibility.svgContainerTitle</a>
   * @see <a href="https://api.highcharts.com/highmaps/lang.accessibility.svgContainerTitle">https://api.highcharts.com/highmaps/lang.accessibility.svgContainerTitle</a>
   *
   * @implspec svgContainerTitle?: string;
   *
   */
  @JSProperty("svgContainerTitle")
  void setSvgContainerTitle(String value);

  /**
   * @implspec tableSummary?: string;
   *
   */
  @JSProperty("tableSummary")
  @Nullable
  String getTableSummary();

  /**
   * @implspec tableSummary?: string;
   *
   */
  @JSProperty("tableSummary")
  void setTableSummary(String value);

  /**
   * @implspec viewAsDataTable?: string;
   *
   */
  @JSProperty("viewAsDataTable")
  @Nullable
  String getViewAsDataTable();

  /**
   * @implspec viewAsDataTable?: string;
   *
   */
  @JSProperty("viewAsDataTable")
  void setViewAsDataTable(String value);
}
