package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Highmaps, Gantt) Configure the accessibility strings
 * in the chart. Requires the accessibility module to be loaded. For a
 * description of the module and information on its features, see Highcharts
 * Accessibility.
 *
 * For more dynamic control over the accessibility functionality, see
 * accessibility.pointDescriptionFormatter,
 * accessibility.seriesDescriptionFormatter, and
 * accessibility.screenReaderSectionFormatter.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface LangAccessibilityOptions extends Any {
  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Default announcement for new
   * data in charts. If addPoint or addSeries is used, and only one
   * series/point is added, the <code>newPointAnnounce</code> and <code>newSeriesAnnounce</code>
   * strings are used. The <code>...Single</code> versions will be used if there is only
   * one chart on the page, and the <code>...Multiple</code> versions will be used if
   * there are multiple charts on the page. For all other new data events, the
   * <code>newDataAnnounce</code> string will be used.
   *
   */
  @JSProperty("announceNewData")
  @Nullable
  LangAccessibilityAnnounceNewDataOptions getAnnounceNewData();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Default announcement for new
   * data in charts. If addPoint or addSeries is used, and only one
   * series/point is added, the <code>newPointAnnounce</code> and <code>newSeriesAnnounce</code>
   * strings are used. The <code>...Single</code> versions will be used if there is only
   * one chart on the page, and the <code>...Multiple</code> versions will be used if
   * there are multiple charts on the page. For all other new data events, the
   * <code>newDataAnnounce</code> string will be used.
   *
   */
  @JSProperty("announceNewData")
  void setAnnounceNewData(@Nullable LangAccessibilityAnnounceNewDataOptions value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Axis description format strings.
   *
   */
  @JSProperty("axis")
  @Nullable
  LangAccessibilityAxisOptions getAxis();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Axis description format strings.
   *
   */
  @JSProperty("axis")
  void setAxis(@Nullable LangAccessibilityAxisOptions value);

  @JSProperty("chartContainerLabel")
  @Nullable
  String getChartContainerLabel();

  @JSProperty("chartContainerLabel")
  void setChartContainerLabel(@Nullable String value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Chart type description strings.
   * This is added to the chart information region.
   *
   * If there is only a single series type used in the chart, we use the
   * format string for the series type, or default if missing. There is one
   * format string for cases where there is only a single series in the chart,
   * and one for multiple series of the same type.
   *
   */
  @JSProperty("chartTypes")
  @Nullable
  LangAccessibilityChartTypesOptions getChartTypes();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Chart type description strings.
   * This is added to the chart information region.
   *
   * If there is only a single series type used in the chart, we use the
   * format string for the series type, or default if missing. There is one
   * format string for cases where there is only a single series in the chart,
   * and one for multiple series of the same type.
   *
   */
  @JSProperty("chartTypes")
  void setChartTypes(@Nullable LangAccessibilityChartTypesOptions value);

  @JSProperty("credits")
  @Nullable
  String getCredits();

  @JSProperty("credits")
  void setCredits(@Nullable String value);

  @JSProperty("defaultChartTitle")
  @Nullable
  String getDefaultChartTitle();

  @JSProperty("defaultChartTitle")
  void setDefaultChartTitle(@Nullable String value);

  @JSProperty("drillUpButton")
  @Nullable
  String getDrillUpButton();

  @JSProperty("drillUpButton")
  void setDrillUpButton(@Nullable String value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Exporting menu format strings
   * for accessibility module.
   *
   */
  @JSProperty("exporting")
  @Nullable
  LangAccessibilityExportingOptions getExporting();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Exporting menu format strings
   * for accessibility module.
   *
   */
  @JSProperty("exporting")
  void setExporting(@Nullable LangAccessibilityExportingOptions value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Set a label on the container
   * wrapping the SVG.
   *
   */
  @JSProperty("graphicContainerLabel")
  @Nullable
  String getGraphicContainerLabel();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Set a label on the container
   * wrapping the SVG.
   *
   */
  @JSProperty("graphicContainerLabel")
  void setGraphicContainerLabel(@Nullable String value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Language options for
   * accessibility of the legend.
   *
   */
  @JSProperty("legend")
  @Nullable
  LangAccessibilityLegendOptions getLegend();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Language options for
   * accessibility of the legend.
   *
   */
  @JSProperty("legend")
  void setLegend(@Nullable LangAccessibilityLegendOptions value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Range selector language options
   * for accessibility.
   *
   */
  @JSProperty("rangeSelector")
  @Nullable
  LangAccessibilityRangeSelectorOptions getRangeSelector();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Range selector language options
   * for accessibility.
   *
   */
  @JSProperty("rangeSelector")
  void setRangeSelector(@Nullable LangAccessibilityRangeSelectorOptions value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Language options for the screen
   * reader information sections added before and after the charts.
   *
   */
  @JSProperty("screenReaderSection")
  @Nullable
  LangAccessibilityScreenReaderSectionOptions getScreenReaderSection();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Language options for the screen
   * reader information sections added before and after the charts.
   *
   */
  @JSProperty("screenReaderSection")
  void setScreenReaderSection(@Nullable LangAccessibilityScreenReaderSectionOptions value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Lang configuration for different
   * series types. For more dynamic control over the series element
   * descriptions, see accessibility.seriesDescriptionFormatter.
   *
   */
  @JSProperty("series")
  @Nullable
  LangAccessibilitySeriesOptions getSeries();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Lang configuration for different
   * series types. For more dynamic control over the series element
   * descriptions, see accessibility.seriesDescriptionFormatter.
   *
   */
  @JSProperty("series")
  void setSeries(@Nullable LangAccessibilitySeriesOptions value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Descriptions of lesser known
   * series types. The relevant description is added to the screen reader
   * information region when these series types are used.
   *
   */
  @JSProperty("seriesTypeDescriptions")
  @Nullable
  LangAccessibilitySeriesTypeDescriptionsOptions getSeriesTypeDescriptions();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Descriptions of lesser known
   * series types. The relevant description is added to the screen reader
   * information region when these series types are used.
   *
   */
  @JSProperty("seriesTypeDescriptions")
  void setSeriesTypeDescriptions(@Nullable LangAccessibilitySeriesTypeDescriptionsOptions value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Language options for
   * sonification.
   *
   */
  @JSProperty("sonification")
  @Nullable
  LangAccessibilitySonificationOptions getSonification();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Language options for
   * sonification.
   *
   */
  @JSProperty("sonification")
  void setSonification(@Nullable LangAccessibilitySonificationOptions value);

  @JSProperty("svgContainerLabel")
  @Nullable
  String getSvgContainerLabel();

  @JSProperty("svgContainerLabel")
  void setSvgContainerLabel(@Nullable String value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Title element text for the chart
   * SVG element. Leave this empty to disable adding the title element.
   * Browsers will display this content when hovering over elements in the
   * chart. Assistive technology may use this element to label the chart.
   *
   */
  @JSProperty("svgContainerTitle")
  @Nullable
  String getSvgContainerTitle();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Title element text for the chart
   * SVG element. Leave this empty to disable adding the title element.
   * Browsers will display this content when hovering over elements in the
   * chart. Assistive technology may use this element to label the chart.
   *
   */
  @JSProperty("svgContainerTitle")
  void setSvgContainerTitle(@Nullable String value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Accessibility language options
   * for the data table.
   *
   */
  @JSProperty("table")
  @Nullable
  LangAccessibilityTableOptions getTable();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Accessibility language options
   * for the data table.
   *
   */
  @JSProperty("table")
  void setTable(@Nullable LangAccessibilityTableOptions value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Thousands separator to use when
   * formatting numbers for screen readers. Note that many screen readers will
   * not handle space as a thousands separator, and will consider &quot;11 700&quot; as
   * two numbers.
   *
   * Set to <code>null</code> to use the separator defined in lang.thousandsSep.
   *
   */
  @JSProperty("thousandsSep")
  @Nullable
  String getThousandsSep();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Thousands separator to use when
   * formatting numbers for screen readers. Note that many screen readers will
   * not handle space as a thousands separator, and will consider &quot;11 700&quot; as
   * two numbers.
   *
   * Set to <code>null</code> to use the separator defined in lang.thousandsSep.
   *
   */
  @JSProperty("thousandsSep")
  void setThousandsSep(@Nullable String value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Chart and map zoom accessibility
   * language options.
   *
   */
  @JSProperty("zoom")
  @Nullable
  LangAccessibilityZoomOptions getZoom();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Chart and map zoom accessibility
   * language options.
   *
   */
  @JSProperty("zoom")
  void setZoom(@Nullable LangAccessibilityZoomOptions value);

  class Builder {
    private final LangAccessibilityOptions object = Any.empty();

    public LangAccessibilityOptions build() {
      return object;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Default announcement for new
     * data in charts. If addPoint or addSeries is used, and only one
     * series/point is added, the <code>newPointAnnounce</code> and <code>newSeriesAnnounce</code>
     * strings are used. The <code>...Single</code> versions will be used if there is only
     * one chart on the page, and the <code>...Multiple</code> versions will be used if
     * there are multiple charts on the page. For all other new data events, the
     * <code>newDataAnnounce</code> string will be used.
     *
     */
    public Builder announceNewData(@Nullable LangAccessibilityAnnounceNewDataOptions value) {
      object.setAnnounceNewData(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Axis description format strings.
     *
     */
    public Builder axis(@Nullable LangAccessibilityAxisOptions value) {
      object.setAxis(value);
      return this;
    }

    public Builder chartContainerLabel(@Nullable String value) {
      object.setChartContainerLabel(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Chart type description strings.
     * This is added to the chart information region.
     *
     * If there is only a single series type used in the chart, we use the
     * format string for the series type, or default if missing. There is one
     * format string for cases where there is only a single series in the chart,
     * and one for multiple series of the same type.
     *
     */
    public Builder chartTypes(@Nullable LangAccessibilityChartTypesOptions value) {
      object.setChartTypes(value);
      return this;
    }

    public Builder credits(@Nullable String value) {
      object.setCredits(value);
      return this;
    }

    public Builder defaultChartTitle(@Nullable String value) {
      object.setDefaultChartTitle(value);
      return this;
    }

    public Builder drillUpButton(@Nullable String value) {
      object.setDrillUpButton(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Exporting menu format strings
     * for accessibility module.
     *
     */
    public Builder exporting(@Nullable LangAccessibilityExportingOptions value) {
      object.setExporting(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Set a label on the container
     * wrapping the SVG.
     *
     */
    public Builder graphicContainerLabel(@Nullable String value) {
      object.setGraphicContainerLabel(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Language options for
     * accessibility of the legend.
     *
     */
    public Builder legend(@Nullable LangAccessibilityLegendOptions value) {
      object.setLegend(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Range selector language options
     * for accessibility.
     *
     */
    public Builder rangeSelector(@Nullable LangAccessibilityRangeSelectorOptions value) {
      object.setRangeSelector(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Language options for the screen
     * reader information sections added before and after the charts.
     *
     */
    public Builder screenReaderSection(
        @Nullable LangAccessibilityScreenReaderSectionOptions value) {
      object.setScreenReaderSection(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Lang configuration for different
     * series types. For more dynamic control over the series element
     * descriptions, see accessibility.seriesDescriptionFormatter.
     *
     */
    public Builder series(@Nullable LangAccessibilitySeriesOptions value) {
      object.setSeries(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Descriptions of lesser known
     * series types. The relevant description is added to the screen reader
     * information region when these series types are used.
     *
     */
    public Builder seriesTypeDescriptions(
        @Nullable LangAccessibilitySeriesTypeDescriptionsOptions value) {
      object.setSeriesTypeDescriptions(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Language options for
     * sonification.
     *
     */
    public Builder sonification(@Nullable LangAccessibilitySonificationOptions value) {
      object.setSonification(value);
      return this;
    }

    public Builder svgContainerLabel(@Nullable String value) {
      object.setSvgContainerLabel(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Title element text for the chart
     * SVG element. Leave this empty to disable adding the title element.
     * Browsers will display this content when hovering over elements in the
     * chart. Assistive technology may use this element to label the chart.
     *
     */
    public Builder svgContainerTitle(@Nullable String value) {
      object.setSvgContainerTitle(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Accessibility language options
     * for the data table.
     *
     */
    public Builder table(@Nullable LangAccessibilityTableOptions value) {
      object.setTable(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Thousands separator to use when
     * formatting numbers for screen readers. Note that many screen readers will
     * not handle space as a thousands separator, and will consider &quot;11 700&quot; as
     * two numbers.
     *
     * Set to <code>null</code> to use the separator defined in lang.thousandsSep.
     *
     */
    public Builder thousandsSep(@Nullable String value) {
      object.setThousandsSep(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Chart and map zoom accessibility
     * language options.
     *
     */
    public Builder zoom(@Nullable LangAccessibilityZoomOptions value) {
      object.setZoom(value);
      return this;
    }
  }
}
