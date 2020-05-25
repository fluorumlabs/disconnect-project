package com.github.fluorumlabs.disconnect.vaadin;

import com.github.fluorumlabs.disconnect.core.annotations.WebComponent;
import com.github.fluorumlabs.disconnect.vaadin.constants.Markers;
import com.github.fluorumlabs.disconnect.vaadin.elements.ChartSeriesElement;
import com.github.fluorumlabs.disconnect.zero.component.AbstractComponent;
import com.github.fluorumlabs.disconnect.core.components.HasElement;
import com.github.fluorumlabs.disconnect.zero.component.HasComponents;
import com.github.fluorumlabs.disconnect.zero.component.HasStyle;
import js.lang.Any;
import js.lang.Unknown;
import js.util.collections.Array;

import javax.annotation.Nullable;

/**
 * <code>&lt;vaadin-chart-series&gt;</code> is a custom element for creating series for Vaadin Charts.
 *
 * <h3>Basic use</h3>
 * To use <code>&lt;vaadin-chart-series&gt;</code>, simply add it inside a <code>&lt;vaadin-chart&gt;</code> element:
 *
 * <pre><code class="language-html"> &lt;vaadin-chart&gt;
 *    &lt;vaadin-chart-series&gt;&lt;/vaadin-chart-series&gt;
 *  &lt;/vaadin-chart&gt;
 * </code></pre>
 * <code>&lt;vaadin-chart-series&gt;</code> accepts <code>values</code> as an array attribute, so you can add it to
 * your element definition:
 *
 * <pre><code class="language-html"> &lt;vaadin-chart-series values=&quot;[10,20,30,40,50]&quot;&gt;&lt;
 * /vaadin-chart-series&gt;
 * </code></pre>
 * which will add a new line series, where each value will be a data point.
 * Look for the Properties session to see all available attributes.
 *
 * <h3>Dynamically adding and removing series</h3>
 * You are also able to add and remove series by using DOM API.
 * <p>
 * To create a new series, simply call <code>document.createElement('vaadin-chart-series')</code> and append it to
 * your <code>&lt;vaadin-chart&gt;</code>:
 *
 * <pre><code class="language-js"> const chart = \* a &lt;vaadin-chart&gt; reference *\
 *  const newSeries = document.createElement('vaadin-chart-series');
 *  newSeries.values = [10,20,30,40,50];
 *  chart.appendChild(newSeries);
 * </code></pre>
 * In order to remove it, you should use the series to be removed as a reference for the <code>#removeChild()</code>
 * call:
 *
 * <pre><code class="language-js"> const chart = \* a &lt;vaadin-chart&gt; reference *\
 *  const seriesToBeRemoved = \* a &lt;vaadin-chart-series&gt; reference to remove*\
 *  chart.removeChild(seriesToBeRemoved);
 * </code></pre>
 * (There's an issue with <code>#remove()</code> method on Firefox, so we advice to remove the element from its parent)
 */
@WebComponent
public class ChartSeries extends AbstractComponent<ChartSeriesElement>
		implements HasStyle<ChartSeriesElement, ChartSeries>, HasComponents<ChartSeriesElement, ChartSeries, HasElement<?>> {
	public ChartSeries() {
		super(ChartSeriesElement.TAGNAME());
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
	 *
	 * <ul>
	 * <li>An array of numerical values <code>[y0, y1, y2, y3,...]</code></li>
	 * <li>An array of arrays with 2 values (<code>x</code>, <code>y</code>) <code>[ [x0, y0], [x1, y1], [x2, y2], ..
	 * . ]</code></li>
	 * <li>An array of objects, each one describing one point <code>[ {x: x0, y: y0, name: 'Point0', color: '#FF0000'
	 * }, {...}, ...]</code></li>
	 * </ul>
	 * See more in <a href="https://api.highcharts.com/highcharts/series">API Site</a>
	 * <p>
	 * Note that you should always use
	 * <a href="https://www.polymer-project.org/2.0/docs/devguide/model-data#array-mutation">Polymer API</a>
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
	 *
	 * <ul>
	 * <li>An array of numerical values <code>[y0, y1, y2, y3,...]</code></li>
	 * <li>An array of arrays with 2 values (<code>x</code>, <code>y</code>) <code>[ [x0, y0], [x1, y1], [x2, y2], ..
	 * . ]</code></li>
	 * <li>An array of objects, each one describing one point <code>[ {x: x0, y: y0, name: 'Point0', color: '#FF0000'
	 * }, {...}, ...]</code></li>
	 * </ul>
	 * See more in <a href="https://api.highcharts.com/highcharts/series">API Site</a>
	 * <p>
	 * Note that you should always use
	 * <a href="https://www.polymer-project.org/2.0/docs/devguide/model-data#array-mutation">Polymer API</a>
	 * to mutate the values array in order to make the component aware of the
	 * change and be able to synchronize it.
	 */
	public ChartSeries values(double... values) {
		getNode().setValues(values);
		return this;
	}

	/**
	 * An array of data used by the series.
	 * Format depends on the chart type and can be:
	 *
	 * <ul>
	 * <li>An array of numerical values <code>[y0, y1, y2, y3,...]</code></li>
	 * <li>An array of arrays with 2 values (<code>x</code>, <code>y</code>) <code>[ [x0, y0], [x1, y1], [x2, y2], ..
	 * . ]</code></li>
	 * <li>An array of objects, each one describing one point <code>[ {x: x0, y: y0, name: 'Point0', color: '#FF0000'
	 * }, {...}, ...]</code></li>
	 * </ul>
	 * See more in <a href="https://api.highcharts.com/highcharts/series">API Site</a>
	 * <p>
	 * Note that you should always use
	 * <a href="https://www.polymer-project.org/2.0/docs/devguide/model-data#array-mutation">Polymer API</a>
	 * to mutate the values array in order to make the component aware of the
	 * change and be able to synchronize it.
	 */
	public ChartSeries values(Double... values) {
		Unknown[] data = new Unknown[values.length];
		for (int i = 0; i < values.length; i++) {
			if (values[i] == null) {
				data[i] = null;
			} else {
				data[i] = Unknown.of(values[i]);
			}
		}
		getNode().setValues(data);
		return this;
	}

	/**
	 * An array of data used by the series.
	 * Format depends on the chart type and can be:
	 *
	 * <ul>
	 * <li>An array of numerical values <code>[y0, y1, y2, y3,...]</code></li>
	 * <li>An array of arrays with 2 values (<code>x</code>, <code>y</code>) <code>[ [x0, y0], [x1, y1], [x2, y2], ..
	 * . ]</code></li>
	 * <li>An array of objects, each one describing one point <code>[ {x: x0, y: y0, name: 'Point0', color: '#FF0000'
	 * }, {...}, ...]</code></li>
	 * </ul>
	 * See more in <a href="https://api.highcharts.com/highcharts/series">API Site</a>
	 * <p>
	 * Note that you should always use
	 * <a href="https://www.polymer-project.org/2.0/docs/devguide/model-data#array-mutation">Polymer API</a>
	 * to mutate the values array in order to make the component aware of the
	 * change and be able to synchronize it.
	 */
	public ChartSeries values(Any... values) {
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
	public ChartSeries valueMin(double valueMin) {
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
	public ChartSeries valueMax(double valueMax) {
		getNode().setValueMax(valueMax);
		return this;
	}

	/**
	 * A string with the type of the series.
	 * Defaults to <code>'line'</code> in case no type is set for the chart.
	 * Note that <code>'bar'</code>, <code>'gauge'</code> and <code>'solidgauge'</code> should be set as default
	 * series type on <code>&lt;vaadin-chart&gt;</code>.
	 */
	@Nullable
	public String type() {
		return getNode().getType();
	}

	/**
	 * A string with the type of the series.
	 * Defaults to <code>'line'</code> in case no type is set for the chart.
	 * Note that <code>'bar'</code>, <code>'gauge'</code> and <code>'solidgauge'</code> should be set as default
	 * series type on <code>&lt;vaadin-chart&gt;</code>.
	 */
	public ChartSeries type(String type) {
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
	public ChartSeries title(String title) {
		getNode().setTitle(title);
		return this;
	}

	/**
	 * Shows/hides data-point markers for line-like series.
	 * Acceptable input are:
	 *
	 * <ul>
	 * <li><code>shown</code>: markers are always visible</li>
	 * <li><code>hidden</code>: markers are always hidden</li>
	 * <li><code>auto</code>: markers are visible for widespread data and hidden, when data is dense <em>(default)
	 * </em></li>
	 * </ul>
	 */
	@Nullable
	public Markers markers() {
		return getNode().getMarkers();
	}

	/**
	 * Shows/hides data-point markers for line-like series.
	 * Acceptable input are:
	 *
	 * <ul>
	 * <li><code>shown</code>: markers are always visible</li>
	 * <li><code>hidden</code>: markers are always hidden</li>
	 * <li><code>auto</code>: markers are visible for widespread data and hidden, when data is dense <em>(default)
	 * </em></li>
	 * </ul>
	 */
	public ChartSeries markers(Markers markers) {
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
	public ChartSeries unit(String unit) {
		getNode().setUnit(unit);
		return this;
	}

	/**
	 * Used to group series in a different stacks.
	 * &quot;stacking&quot; property should be specified either for each series or in plotOptions.
	 * It is recommended to place series in a single stack, when they belong to the same yAxis.
	 */
	@Nullable
	public String stack() {
		return getNode().getStack();
	}

	/**
	 * Used to group series in a different stacks.
	 * &quot;stacking&quot; property should be specified either for each series or in plotOptions.
	 * It is recommended to place series in a single stack, when they belong to the same yAxis.
	 */
	public ChartSeries stack(String stack) {
		getNode().setStack(stack);
		return this;
	}

	/**
	 * The height of the neck, the lower part of the funnel.
	 * A number defines pixel width, a percentage string defines a percentage of the plot area height. Defaults to 30%.
	 * Note that this property only applies for &quot;funnel&quot; charts.
	 */
	@Nullable
	public String neckPosition() {
		return getNode().getNeckPosition();
	}

	/**
	 * The height of the neck, the lower part of the funnel.
	 * A number defines pixel width, a percentage string defines a percentage of the plot area height. Defaults to 30%.
	 * Note that this property only applies for &quot;funnel&quot; charts.
	 */
	public ChartSeries neckPosition(String neckPosition) {
		getNode().setNeckPosition(neckPosition);
		return this;
	}

	/**
	 * The width of the neck, the lower part of the funnel.
	 * A number defines pixel width, a percentage string defines a percentage of the plot area width. Defaults to 30%.
	 * Note that this property only applies for &quot;funnel&quot; charts.
	 */
	@Nullable
	public String neckWidth() {
		return getNode().getNeckWidth();
	}

	/**
	 * The width of the neck, the lower part of the funnel.
	 * A number defines pixel width, a percentage string defines a percentage of the plot area width. Defaults to 30%.
	 * Note that this property only applies for &quot;funnel&quot; charts.
	 */
	public ChartSeries neckWidth(String neckWidth) {
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
	public ChartSeries additionalOptions(Unknown additionalOptions) {
		getNode().setAdditionalOptions(additionalOptions);
		return this;
	}

	/**
	 * FIXME param series: <unspecified>Method to attach a series object of type <code>Highcharts.Series</code>.
	 *
	 * @param series Object of type <code>Highcharts.Series</code>
	 */
	public void setSeries(Unknown series) {
		getNode().setSeries(series);
	}
}
