package com.github.fluorumlabs.disconnect.vaadin.elements;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.polymer.elements.PolymerElement;
import com.github.fluorumlabs.disconnect.vaadin.Vaadin;
import com.github.fluorumlabs.disconnect.vaadin.constants.Markers;
import js.lang.Unknown;
import js.util.collections.Array;
import org.teavm.jso.JSByRef;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * `<vaadin-chart-series>` is a custom element for creating series for Vaadin Charts.
 * <p>
 * ### Basic use
 * <p>
 * To use `<vaadin-chart-series>`, simply add it inside a `<vaadin-chart>` element:
 * <p>
 * ```html
 * <vaadin-chart>
 * <vaadin-chart-series></vaadin-chart-series>
 * </vaadin-chart>
 * ```
 * <p>
 * `<vaadin-chart-series>` accepts `values` as an array attribute, so you can add it to your element definition:
 * <p>
 * ```html
 * <vaadin-chart-series values="[10,20,30,40,50]"></vaadin-chart-series>
 * ```
 * <p>
 * which will add a new line series, where each value will be a data point.
 * Look for the Properties session to see all available attributes.
 * <p>
 * ### Dynamically adding and removing series
 * <p>
 * You are also able to add and remove series by using DOM API.
 * <p>
 * To create a new series, simply call `document.createElement('vaadin-chart-series')` and append it to your
 * `<vaadin-chart>`:
 * <p>
 * ```js
 * const chart = \* a <vaadin-chart> reference *\
 * const newSeries = document.createElement('vaadin-chart-series');
 * newSeries.values = [10,20,30,40,50];
 * chart.appendChild(newSeries);
 * ```
 * <p>
 * In order to remove it, you should use the series to be removed as a reference for the `#removeChild()` call:
 * <p>
 * ```js
 * const chart = \* a <vaadin-chart> reference *\
 * const seriesToBeRemoved = \* a <vaadin-chart-series> reference to remove*\
 * chart.removeChild(seriesToBeRemoved);
 * ```
 * <p>
 * (There's an issue with `#remove()` method on Firefox, so we advice to remove the element from its parent)
 */
@NpmPackage(
        name = "@vaadin/vaadin",
        version = Vaadin.VERSION
)
@Import(
        symbols = "ChartSeriesElement",
        module = "@vaadin/vaadin-charts/src/vaadin-chart-series.js"
)
public interface ChartSeriesElement extends PolymerElement {
    /**
     * FIXME type Object | null | undefined
     * Object with the configured options defined and used to create a series.
     */
    @Nullable
    @JSProperty
    Unknown getOptions();

    /**
     * An array of data used by the series.
     * Format depends on the chart type and can be:
     * - An array of numerical values `[y0, y1, y2, y3,...]`
     * - An array of arrays with 2 values (`x`, `y`) `[ [x0, y0], [x1, y1], [x2, y2], ... ]`
     * - An array of objects, each one describing one point `[ {x: x0, y: y0, name: 'Point0', color: '#FF0000'}, {...
     * }, ...]`
     * <p>
     * See more in [API Site](https://api.highcharts.com/highcharts/series)
     * <p>
     * Note that you should always use [Polymer API](https://www.polymer-project.org/2
     * .0/docs/devguide/model-data#array-mutation)
     * to mutate the values array in order to make the component aware of the
     * change and be able to synchronize it.
     */
    @Nullable
    @JSProperty
    Array<Unknown> getValues();

    /**
     * An array of data used by the series.
     * Format depends on the chart type and can be:
     * - An array of numerical values `[y0, y1, y2, y3,...]`
     * - An array of arrays with 2 values (`x`, `y`) `[ [x0, y0], [x1, y1], [x2, y2], ... ]`
     * - An array of objects, each one describing one point `[ {x: x0, y: y0, name: 'Point0', color: '#FF0000'}, {...
     * }, ...]`
     * <p>
     * See more in [API Site](https://api.highcharts.com/highcharts/series)
     * <p>
     * Note that you should always use [Polymer API](https://www.polymer-project.org/2
     * .0/docs/devguide/model-data#array-mutation)
     * to mutate the values array in order to make the component aware of the
     * change and be able to synchronize it.
     */
    @JSProperty
    void setValues(@JSByRef Unknown... values);

    /**
     * Value-axis minimum-value.
     * Sets the value to a series bound by 'unit' property.
     * Otherwise sets the value to the first series.
     * Undefined by default (determined from data).
     */
    @JSProperty
    double getValueMin();

    /**
     * Value-axis minimum-value.
     * Sets the value to a series bound by 'unit' property.
     * Otherwise sets the value to the first series.
     * Undefined by default (determined from data).
     */
    @JSProperty
    void setValueMin(double valueMin);

    /**
     * Value-axis maximum-value.
     * See the 'valueMin'
     */
    @JSProperty
    double getValueMax();

    /**
     * Value-axis maximum-value.
     * See the 'valueMin'
     */
    @JSProperty
    void setValueMax(double valueMax);

    /**
     * A string with the type of the series.
     * Defaults to `'line'` in case no type is set for the chart.
     * Note that `'bar'`, `'gauge'` and `'solidgauge'` should be set as default series type on `<vaadin-chart>`.
     */
    @Nullable
    @JSProperty
    String getType();

    /**
     * A string with the type of the series.
     * Defaults to `'line'` in case no type is set for the chart.
     * Note that `'bar'`, `'gauge'` and `'solidgauge'` should be set as default series type on `<vaadin-chart>`.
     */
    @JSProperty
    void setType(String type);

    /**
     * Shows/hides data-point markers for line-like series.
     * Acceptable input are:
     * - `shown`: markers are always visible
     * - `hidden`: markers are always hidden
     * - `auto`: markers are visible for widespread data and hidden, when data is dense *(default)*
     */
    @Nullable
    @JSProperty
    Markers getMarkers();

    /**
     * Shows/hides data-point markers for line-like series.
     * Acceptable input are:
     * - `shown`: markers are always visible
     * - `hidden`: markers are always hidden
     * - `auto`: markers are visible for widespread data and hidden, when data is dense *(default)*
     */
    @JSProperty
    void setMarkers(Markers markers);

    /**
     * Used to connect the series to an axis; if multiple series have the same “unit”, they will share axis.
     * Displayed as a title for the axis.
     * If no unit is defined, then series will be connected to the first axis.
     */
    @Nullable
    @JSProperty
    String getUnit();

    /**
     * Used to connect the series to an axis; if multiple series have the same “unit”, they will share axis.
     * Displayed as a title for the axis.
     * If no unit is defined, then series will be connected to the first axis.
     */
    @JSProperty
    void setUnit(String unit);

    /**
     * Used to group series in a different stacks.
     * "stacking" property should be specified either for each series or in plotOptions.
     * It is recommended to place series in a single stack, when they belong to the same yAxis.
     */
    @Nullable
    @JSProperty
    String getStack();

    /**
     * Used to group series in a different stacks.
     * "stacking" property should be specified either for each series or in plotOptions.
     * It is recommended to place series in a single stack, when they belong to the same yAxis.
     */
    @JSProperty
    void setStack(String stack);

    /**
     * The height of the neck, the lower part of the funnel.
     * A number defines pixel width, a percentage string defines a percentage of the plot area height. Defaults to 30%.
     * Note that this property only applies for "funnel" charts.
     */
    @Nullable
    @JSProperty
    String getNeckPosition();

    /**
     * The height of the neck, the lower part of the funnel.
     * A number defines pixel width, a percentage string defines a percentage of the plot area height. Defaults to 30%.
     * Note that this property only applies for "funnel" charts.
     */
    @JSProperty
    void setNeckPosition(String neckPosition);

    /**
     * The width of the neck, the lower part of the funnel.
     * A number defines pixel width, a percentage string defines a percentage of the plot area width. Defaults to 30%.
     * Note that this property only applies for "funnel" charts.
     */
    @Nullable
    @JSProperty
    String getNeckWidth();

    /**
     * The width of the neck, the lower part of the funnel.
     * A number defines pixel width, a percentage string defines a percentage of the plot area width. Defaults to 30%.
     * Note that this property only applies for "funnel" charts.
     */
    @JSProperty
    void setNeckWidth(String neckWidth);

    /**
     * FIXME type Object | null | undefined
     * Represents additional JSON configuration.
     */
    @Nullable
    @JSProperty
    Unknown getAdditionalOptions();

    /**
     * FIXME type Object | null | undefined
     * Represents additional JSON configuration.
     */
    @JSProperty
    void setAdditionalOptions(Unknown additionalOptions);

    /**
     * Method to attach a series object of type `Highcharts.Series`.
     * FIXME param series: <unspecified>
     *
     * @param series Object of type `Highcharts.Series`
     */
    void setSeries(Unknown series);
}
