package js.lang.external.vaadin.charts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Unknown;
import js.lang.external.highcharts.Series;
import js.lang.external.highcharts.SeriesOptions;
import js.util.collections.Array;
import js.web.dom.HTMLElement;
import org.teavm.jso.JSMethod;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * <code>&lt;vaadin-chart-series&gt;</code> is a custom element for creating series for Vaadin Charts.
 *
 * <h3>Basic use</h3>
 * To use <code>&lt;vaadin-chart-series&gt;</code>, add it inside a <code>&lt;vaadin-chart&gt;</code> element:
 *
 * <pre><code class="language-html">  &lt;vaadin-chart&gt;
 *     &lt;vaadin-chart-series&gt;&lt;/vaadin-chart-series&gt;
 *   &lt;/vaadin-chart&gt;
 * </code></pre>
 * <code>&lt;vaadin-chart-series&gt;</code> accepts <code>values</code> as an array attribute, so you can add it to your element definition:
 *
 * <pre><code class="language-html">  &lt;vaadin-chart-series values="[10,20,30,40,50]"&gt;&lt;/vaadin-chart-series&gt;
 * </code></pre>
 * which will add a new line series, where each value will be a data point. Look for the Properties session to see all available attributes.
 *
 * <h3>Dynamically adding and removing series</h3>
 * You are also able to add and remove series by using DOM API.
 *
 * To create a new series, call <code>document.createElement('vaadin-chart-series')</code> and append it to your <code>&lt;vaadin-chart&gt;</code>:
 *
 * <pre><code class="language-js">  const chart = \* a &lt;vaadin-chart&gt; reference *\
 *   const newSeries = document.createElement('vaadin-chart-series');
 *   newSeries.values = [10,20,30,40,50];
 *   chart.appendChild(newSeries);
 * </code></pre>
 * In order to remove it, you should use the series to be removed as a reference for the <code>#removeChild()</code> call:
 *
 * <pre><code class="language-js">  const chart = \* a &lt;vaadin-chart&gt; reference *\
 *   const seriesToBeRemoved = \* a &lt;vaadin-chart-series&gt; reference to remove*\
 *   chart.removeChild(seriesToBeRemoved);
 * </code></pre>
 * <strong>Mixins:</strong> ElementMixin
 *
 * <h2>Example</h2>
 * <pre><code class="language-javascript">demo/index.html
 * </code></pre>
 */
@NpmPackage(name = "@vaadin/vaadin-charts", version = "^7.0.0-alpha8")
@Import(module = "@vaadin/vaadin-charts/src/vaadin-chart-series.js")
public interface ChartSeriesElement extends HTMLElement {

    // !wca! setSeries: (series: !Series): void
    /**
     * Method to attach a series object of type <code>Highcharts.Series</code>.
     *
     * <strong>series</strong>: Object of type <code>Highcharts.Series</code>
     */
    @JSMethod("setSeries")
    void setSeries(Series series);

    // !wca! get additionalOptions: SeriesOptionsType | undefined
    /**
     * Represents additional JSON configuration.
     */
    @JSProperty("additionalOptions")
    @Nullable
    SeriesOptions getAdditionalOptions();

    // !wca! set additionalOptions: SeriesOptionsType | undefined
    /**
     * Represents additional JSON configuration.
     */
    @JSProperty("additionalOptions")
    void setAdditionalOptions(@Nullable SeriesOptions value);

    // !wca! get markers: ChartSeriesMarkers | undefined
    /**
     * Shows/hides data-point markers for line-like series.
     * Acceptable input are:
     *  - <code>shown</code>: markers are always visible
     *  - <code>hidden</code>: markers are always hidden
     *  - <code>auto</code>: markers are visible for widespread data and hidden, when data is dense <em>(default)</em>
     */
    @JSProperty("markers")
    @Nullable
    String getMarkers();

    // !wca! set markers: ChartSeriesMarkers | undefined
    /**
     * Shows/hides data-point markers for line-like series.
     * Acceptable input are:
     *  - <code>shown</code>: markers are always visible
     *  - <code>hidden</code>: markers are always hidden
     *  - <code>auto</code>: markers are visible for widespread data and hidden, when data is dense <em>(default)</em>
     */
    @JSProperty("markers")
    void setMarkers(@Nullable String value);

    // !wca! get neckPosition: number | string
    /**
     * The height of the neck, the lower part of the funnel.
     * A number defines pixel width, a percentage string defines a percentage of the plot area height. Defaults to 30%.
     * Note that this property only applies for "funnel" charts.
     */
    @JSProperty("neckPosition")
    Unknown getNeckPosition();

    // !wca! set neckPosition: number | string
    /**
     * The height of the neck, the lower part of the funnel.
     * A number defines pixel width, a percentage string defines a percentage of the plot area height. Defaults to 30%.
     * Note that this property only applies for "funnel" charts.
     */
    @JSProperty("neckPosition")
    void setNeckPosition(Unknown value);

    // !wca! get neckWidth: number | string
    /**
     * The width of the neck, the lower part of the funnel.
     * A number defines pixel width, a percentage string defines a percentage of the plot area width. Defaults to 30%.
     * Note that this property only applies for "funnel" charts.
     */
    @JSProperty("neckWidth")
    Unknown getNeckWidth();

    // !wca! set neckWidth: number | string
    /**
     * The width of the neck, the lower part of the funnel.
     * A number defines pixel width, a percentage string defines a percentage of the plot area width. Defaults to 30%.
     * Note that this property only applies for "funnel" charts.
     */
    @JSProperty("neckWidth")
    void setNeckWidth(Unknown value);

    // !wca! get options: !ChartSeriesOptions

    // !wca! get stack: number | string
    /**
     * Used to group series in a different stacks.
     * "stacking" property should be specified either for each series or in plotOptions.
     * It is recommended to place series in a single stack, when they belong to the same yAxis.
     */
    @JSProperty("stack")
    Unknown getStack();

    // !wca! set stack: number | string
    /**
     * Used to group series in a different stacks.
     * "stacking" property should be specified either for each series or in plotOptions.
     * It is recommended to place series in a single stack, when they belong to the same yAxis.
     */
    @JSProperty("stack")
    void setStack(Unknown value);

    // !wca! get title: string
    /**
     * The name of the series as shown in the legend, tooltip etc.
     */
    @JSProperty("title")
    String getTitle();

    // !wca! set title: string
    /**
     * The name of the series as shown in the legend, tooltip etc.
     */
    @JSProperty("title")
    void setTitle(String value);

    // !wca! get type: string
    /**
     * A string with the type of the series.
     * Defaults to <code>'line'</code> in case no type is set for the chart.
     * Note that <code>'bar'</code>, <code>'gauge'</code> and <code>'solidgauge'</code> should be set as default series type on <code>&lt;vaadin-chart&gt;</code>.
     */
    @JSProperty("type")
    String getType();

    // !wca! set type: string
    /**
     * A string with the type of the series.
     * Defaults to <code>'line'</code> in case no type is set for the chart.
     * Note that <code>'bar'</code>, <code>'gauge'</code> and <code>'solidgauge'</code> should be set as default series type on <code>&lt;vaadin-chart&gt;</code>.
     */
    @JSProperty("type")
    void setType(String value);

    // !wca! get unit: string
    /**
     * Used to connect the series to an axis; if multiple series have the same â€œunitâ€�, they will share axis.
     * Displayed as a title for the axis.
     * If no unit is defined, then series will be connected to the first axis.
     */
    @JSProperty("unit")
    String getUnit();

    // !wca! set unit: string
    /**
     * Used to connect the series to an axis; if multiple series have the same â€œunitâ€�, they will share axis.
     * Displayed as a title for the axis.
     * If no unit is defined, then series will be connected to the first axis.
     */
    @JSProperty("unit")
    void setUnit(String value);

    // !wca! get valueMax: number
    /**
     * Value-axis maximum-value.
     * See the 'valueMin'
     */
    @JSProperty("valueMax")
    double getValueMax();

    // !wca! set valueMax: number
    /**
     * Value-axis maximum-value.
     * See the 'valueMin'
     */
    @JSProperty("valueMax")
    void setValueMax(double value);

    // !wca! get valueMin: number
    /**
     * Value-axis minimum-value.
     * Sets the value to a series bound by 'unit' property.
     * Otherwise sets the value to the first series.
     * Undefined by default (determined from data).
     */
    @JSProperty("valueMin")
    double getValueMin();

    // !wca! set valueMin: number
    /**
     * Value-axis minimum-value.
     * Sets the value to a series bound by 'unit' property.
     * Otherwise sets the value to the first series.
     * Undefined by default (determined from data).
     */
    @JSProperty("valueMin")
    void setValueMin(double value);

    // !wca! get values: ChartSeriesValues

    // !wca! set values: ChartSeriesValues
    /**
     * An array of data used by the series.
     * Format depends on the chart type and can be:
     *  - An array of numerical values <code>[y0, y1, y2, y3,...]</code>
     *  - An array of arrays with 2 values (<code>x</code>, <code>y</code>) <code>[ [x0, y0], [x1, y1], [x2, y2], ... ]</code>
     *  - An array of objects, each one describing one point <code>[ {x: x0, y: y0, name: 'Point0', color: '#FF0000'}, {...}, ...]</code>
     *
     *  See more in <a href="https://api.highcharts.com/highcharts/series">API Site</a>
     *
     * Note that you should always use <a href="https://www.polymer-project.org/2.0/docs/devguide/model-data#array-mutation">Polymer API</a>
     * to mutate the values array in order to make the component aware of the
     * change and be able to synchronize it.
     */
    @JSProperty("values")
    void setValues(Array<Unknown> value);
}
