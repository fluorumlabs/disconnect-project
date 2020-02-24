package com.github.fluorumlabs.disconnect.vaadin.elements;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.polymer.elements.PolymerElement;
import com.github.fluorumlabs.disconnect.vaadin.Vaadin;
import com.github.fluorumlabs.disconnect.vaadin.constants.Markers;
import js.lang.Any;
import js.lang.Unknown;
import js.util.collections.Array;
import org.teavm.jso.JSProperty;

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
@NpmPackage(
		name = "@vaadin/vaadin",
		version = Vaadin.VERSION
)
@Import(
		module = "@vaadin/vaadin-charts/src/vaadin-chart-series.js"
)
public interface ChartSeriesElement extends PolymerElement {
	static String TAGNAME() {
		return "vaadin-chart-series";
	}

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
	@JSProperty
	Array<Unknown> getValues();

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
	@JSProperty
	void setValues(double... values);

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
	@JSProperty
	void setValues(Any... values);

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
	 * Defaults to <code>'line'</code> in case no type is set for the chart.
	 * Note that <code>'bar'</code>, <code>'gauge'</code> and <code>'solidgauge'</code> should be set as default
	 * series type on <code>&lt;vaadin-chart&gt;</code>.
	 */
	@Nullable
	@JSProperty
	String getType();

	/**
	 * A string with the type of the series.
	 * Defaults to <code>'line'</code> in case no type is set for the chart.
	 * Note that <code>'bar'</code>, <code>'gauge'</code> and <code>'solidgauge'</code> should be set as default
	 * series type on <code>&lt;vaadin-chart&gt;</code>.
	 */
	@JSProperty
	void setType(String type);

	/**
	 * The name of the series as shown in the legend, tooltip etc.
	 */
	@Nullable
	@JSProperty
	String getTitle();

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
	@JSProperty
	Markers getMarkers();

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
	 * &quot;stacking&quot; property should be specified either for each series or in plotOptions.
	 * It is recommended to place series in a single stack, when they belong to the same yAxis.
	 */
	@Nullable
	@JSProperty
	String getStack();

	/**
	 * Used to group series in a different stacks.
	 * &quot;stacking&quot; property should be specified either for each series or in plotOptions.
	 * It is recommended to place series in a single stack, when they belong to the same yAxis.
	 */
	@JSProperty
	void setStack(String stack);

	/**
	 * The height of the neck, the lower part of the funnel.
	 * A number defines pixel width, a percentage string defines a percentage of the plot area height. Defaults to 30%.
	 * Note that this property only applies for &quot;funnel&quot; charts.
	 */
	@Nullable
	@JSProperty
	String getNeckPosition();

	/**
	 * The height of the neck, the lower part of the funnel.
	 * A number defines pixel width, a percentage string defines a percentage of the plot area height. Defaults to 30%.
	 * Note that this property only applies for &quot;funnel&quot; charts.
	 */
	@JSProperty
	void setNeckPosition(String neckPosition);

	/**
	 * The width of the neck, the lower part of the funnel.
	 * A number defines pixel width, a percentage string defines a percentage of the plot area width. Defaults to 30%.
	 * Note that this property only applies for &quot;funnel&quot; charts.
	 */
	@Nullable
	@JSProperty
	String getNeckWidth();

	/**
	 * The width of the neck, the lower part of the funnel.
	 * A number defines pixel width, a percentage string defines a percentage of the plot area width. Defaults to 30%.
	 * Note that this property only applies for &quot;funnel&quot; charts.
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
	 * @param series Object of type <code>Highcharts.Series</code>
	 */
	void setSeries(Unknown series);
}
