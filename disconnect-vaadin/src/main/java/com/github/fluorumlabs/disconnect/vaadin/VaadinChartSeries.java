package com.github.fluorumlabs.disconnect.vaadin;

import com.github.fluorumlabs.disconnect.vaadin.constants.Markers;
import com.github.fluorumlabs.disconnect.vaadin.elements.ChartSeriesElement;
import com.github.fluorumlabs.disconnect.zero.component.AbstractComponent;
import com.github.fluorumlabs.disconnect.zero.component.Component;
import com.github.fluorumlabs.disconnect.zero.component.HasComponents;
import js.lang.Unknown;
import js.util.collections.Array;

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
public class VaadinChartSeries extends AbstractComponent<ChartSeriesElement>
		implements HasComponents<ChartSeriesElement, VaadinChartSeries, Component<?>> {
	public VaadinChartSeries() {
		super("vaadin-chart-series");
	}

	/**
	 * FIXME type Object | null | undefined
	 * Object with the configured options defined and used to create a series.
	 */
	@Nullable
	public Unknown options() {
		return getNode().getOptions();
	}

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
	public Array<Unknown> values() {
		return getNode().getValues();
	}

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
	public VaadinChartSeries values(Unknown... values) {
		getNode().setValues(values);
		return this;
	}

	/**
	 * Value-axis minimum-value.
	 * Sets the value to a series bound by 'unit' property.
	 * Otherwise sets the value to the first series.
	 * Undefined by default (determined from data).
	 */
	public double valueMin() {
		return getNode().getValueMin();
	}

	/**
	 * Value-axis minimum-value.
	 * Sets the value to a series bound by 'unit' property.
	 * Otherwise sets the value to the first series.
	 * Undefined by default (determined from data).
	 */
	public VaadinChartSeries valueMin(double valueMin) {
		getNode().setValueMin(valueMin);
		return this;
	}

	/**
	 * Value-axis maximum-value.
	 * See the 'valueMin'
	 */
	public double valueMax() {
		return getNode().getValueMax();
	}

	/**
	 * Value-axis maximum-value.
	 * See the 'valueMin'
	 */
	public VaadinChartSeries valueMax(double valueMax) {
		getNode().setValueMax(valueMax);
		return this;
	}

	/**
	 * A string with the type of the series.
	 * Defaults to `'line'` in case no type is set for the chart.
	 * Note that `'bar'`, `'gauge'` and `'solidgauge'` should be set as default series type on `<vaadin-chart>`.
	 */
	@Nullable
	public String type() {
		return getNode().getType();
	}

	/**
	 * A string with the type of the series.
	 * Defaults to `'line'` in case no type is set for the chart.
	 * Note that `'bar'`, `'gauge'` and `'solidgauge'` should be set as default series type on `<vaadin-chart>`.
	 */
	public VaadinChartSeries type(String type) {
		getNode().setType(type);
		return this;
	}

	/**
	 * The name of the series as shown in the legend, tooltip etc.
	 */
	@Nullable
	public String title() {
		return getNode().getTitle();
	}

	/**
	 * The name of the series as shown in the legend, tooltip etc.
	 */
	public VaadinChartSeries title(String title) {
		getNode().setTitle(title);
		return this;
	}

	/**
	 * Shows/hides data-point markers for line-like series.
	 * Acceptable input are:
	 * - `shown`: markers are always visible
	 * - `hidden`: markers are always hidden
	 * - `auto`: markers are visible for widespread data and hidden, when data is dense *(default)*
	 */
	@Nullable
	public Markers markers() {
		return getNode().getMarkers();
	}

	/**
	 * Shows/hides data-point markers for line-like series.
	 * Acceptable input are:
	 * - `shown`: markers are always visible
	 * - `hidden`: markers are always hidden
	 * - `auto`: markers are visible for widespread data and hidden, when data is dense *(default)*
	 */
	public VaadinChartSeries markers(Markers markers) {
		getNode().setMarkers(markers);
		return this;
	}

	/**
	 * Used to connect the series to an axis; if multiple series have the same “unit”, they will share axis.
	 * Displayed as a title for the axis.
	 * If no unit is defined, then series will be connected to the first axis.
	 */
	@Nullable
	public String unit() {
		return getNode().getUnit();
	}

	/**
	 * Used to connect the series to an axis; if multiple series have the same “unit”, they will share axis.
	 * Displayed as a title for the axis.
	 * If no unit is defined, then series will be connected to the first axis.
	 */
	public VaadinChartSeries unit(String unit) {
		getNode().setUnit(unit);
		return this;
	}

	/**
	 * Used to group series in a different stacks.
	 * "stacking" property should be specified either for each series or in plotOptions.
	 * It is recommended to place series in a single stack, when they belong to the same yAxis.
	 */
	@Nullable
	public String stack() {
		return getNode().getStack();
	}

	/**
	 * Used to group series in a different stacks.
	 * "stacking" property should be specified either for each series or in plotOptions.
	 * It is recommended to place series in a single stack, when they belong to the same yAxis.
	 */
	public VaadinChartSeries stack(String stack) {
		getNode().setStack(stack);
		return this;
	}

	/**
	 * The height of the neck, the lower part of the funnel.
	 * A number defines pixel width, a percentage string defines a percentage of the plot area height. Defaults to 30%.
	 * Note that this property only applies for "funnel" charts.
	 */
	@Nullable
	public String neckPosition() {
		return getNode().getNeckPosition();
	}

	/**
	 * The height of the neck, the lower part of the funnel.
	 * A number defines pixel width, a percentage string defines a percentage of the plot area height. Defaults to 30%.
	 * Note that this property only applies for "funnel" charts.
	 */
	public VaadinChartSeries neckPosition(String neckPosition) {
		getNode().setNeckPosition(neckPosition);
		return this;
	}

	/**
	 * The width of the neck, the lower part of the funnel.
	 * A number defines pixel width, a percentage string defines a percentage of the plot area width. Defaults to 30%.
	 * Note that this property only applies for "funnel" charts.
	 */
	@Nullable
	public String neckWidth() {
		return getNode().getNeckWidth();
	}

	/**
	 * The width of the neck, the lower part of the funnel.
	 * A number defines pixel width, a percentage string defines a percentage of the plot area width. Defaults to 30%.
	 * Note that this property only applies for "funnel" charts.
	 */
	public VaadinChartSeries neckWidth(String neckWidth) {
		getNode().setNeckWidth(neckWidth);
		return this;
	}

	/**
	 * FIXME type Object | null | undefined
	 * Represents additional JSON configuration.
	 */
	@Nullable
	public Unknown additionalOptions() {
		return getNode().getAdditionalOptions();
	}

	/**
	 * FIXME type Object | null | undefined
	 * Represents additional JSON configuration.
	 */
	public VaadinChartSeries additionalOptions(Unknown additionalOptions) {
		getNode().setAdditionalOptions(additionalOptions);
		return this;
	}

	/**
	 * Method to attach a series object of type `Highcharts.Series`.
	 * FIXME param series: <unspecified>
	 *
	 * @param series Object of type `Highcharts.Series`
	 */
	public void setSeries(Unknown series) {
		getNode().setSeries(series);
	}
}
