package com.github.fluorumlabs.disconnect.vaadin;

import com.github.fluorumlabs.disconnect.core.components.HtmlComponent;
import js.lang.Any;
import js.lang.Unknown;
import js.lang.external.highcharts.PointOptionsObject;
import js.lang.external.highcharts.Series;
import js.lang.external.vaadin.vaadin_charts.ChartSeriesConfig;
import js.lang.external.vaadin.vaadin_charts.ChartSeriesElement;
import js.lang.external.vaadin.vaadin_charts.ChartSeriesMarkers;

import javax.annotation.Nullable;

/**
 * Created by Artem Godin on 6/29/2020.
 */
public class ChartSeries extends HtmlComponent<ChartSeriesElement> {
    /**
     * Object with the configured options defined and used to create a series.
     *
     */
    
    public Any getOptions() {
        return getElement().getOptions();
    }

    /**
     * An array of data used by the series.
     * Format depends on the chart type and can be:
     *
     * <ul>
     * <li>An array of numerical values <code>[y0, y1, y2, y3,...]</code></li>
     * <li>An array of arrays with 2 values (<code>x</code>, <code>y</code>) <code>[ [x0, y0], [x1, y1], [x2, y2], ... ]</code></li>
     * <li>An array of objects, each one describing one point <code>[ {x: x0, y: y0, name: 'Point0', color: '#FF0000'}, {...}, ...]</code></li>
     * </ul>
     * See more in <a href="https://api.highcharts.com/highcharts/series">API Site</a>
     *
     * Note that you should always use <a href="https://www.polymer-project.org/2.0/docs/devguide/model-data#array-mutation">Polymer API</a>
     * to mutate the values array in order to make the component aware of the
     * change and be able to synchronize it.
     *
     */
    @Nullable
    
    public Unknown getValues() {
        return getElement().getValues();
    }

    /**
     * An array of data used by the series.
     * Format depends on the chart type and can be:
     *
     * <ul>
     * <li>An array of numerical values <code>[y0, y1, y2, y3,...]</code></li>
     * <li>An array of arrays with 2 values (<code>x</code>, <code>y</code>) <code>[ [x0, y0], [x1, y1], [x2, y2], ... ]</code></li>
     * <li>An array of objects, each one describing one point <code>[ {x: x0, y: y0, name: 'Point0', color: '#FF0000'}, {...}, ...]</code></li>
     * </ul>
     * See more in <a href="https://api.highcharts.com/highcharts/series">API Site</a>
     *
     * Note that you should always use <a href="https://www.polymer-project.org/2.0/docs/devguide/model-data#array-mutation">Polymer API</a>
     * to mutate the values array in order to make the component aware of the
     * change and be able to synchronize it.
     *
     * @param value
     */
    
    public void setValues(PointOptionsObject[] value) {
        getElement().setValues(value);
    }

    /**
     * An array of data used by the series.
     * Format depends on the chart type and can be:
     *
     * <ul>
     * <li>An array of numerical values <code>[y0, y1, y2, y3,...]</code></li>
     * <li>An array of arrays with 2 values (<code>x</code>, <code>y</code>) <code>[ [x0, y0], [x1, y1], [x2, y2], ... ]</code></li>
     * <li>An array of objects, each one describing one point <code>[ {x: x0, y: y0, name: 'Point0', color: '#FF0000'}, {...}, ...]</code></li>
     * </ul>
     * See more in <a href="https://api.highcharts.com/highcharts/series">API Site</a>
     *
     * Note that you should always use <a href="https://www.polymer-project.org/2.0/docs/devguide/model-data#array-mutation">Polymer API</a>
     * to mutate the values array in order to make the component aware of the
     * change and be able to synchronize it.
     *
     * @param value
     */
    
    public void setValues(double[] value) {
        getElement().setValues(value);
    }

    /**
     * Value-axis minimum-value.
     * Sets the value to a series bound by 'unit' property.
     * Otherwise sets the value to the first series.
     * Undefined by default (determined from data).
     *
     */
    
    public double getValueMin() {
        return getElement().getValueMin();
    }

    /**
     * Value-axis minimum-value.
     * Sets the value to a series bound by 'unit' property.
     * Otherwise sets the value to the first series.
     * Undefined by default (determined from data).
     *
     * @param value
     */
    
    public void setValueMin(double value) {
        getElement().setValueMin(value);
    }

    /**
     * Value-axis maximum-value.
     * See the 'valueMin'
     *
     */
    
    public double getValueMax() {
        return getElement().getValueMax();
    }

    /**
     * Value-axis maximum-value.
     * See the 'valueMin'
     *
     * @param value
     */
    
    public void setValueMax(double value) {
        getElement().setValueMax(value);
    }

    /**
     * The name of the series as shown in the legend, tooltip etc.
     *
     */
    
    public String getTitle() {
        return getElement().getTitle();
    }

    /**
     * The name of the series as shown in the legend, tooltip etc.
     *
     * @param value
     */
    
    public void setTitle(String value) {
        getElement().setTitle(value);
    }

    /**
     * Shows/hides data-point markers for line-like series.
     * Acceptable input are:
     *
     * <ul>
     * <li><code>shown</code>: markers are always visible</li>
     * <li><code>hidden</code>: markers are always hidden</li>
     * <li><code>auto</code>: markers are visible for widespread data and hidden, when data is dense <em>(default)</em></li>
     * </ul>
     */
    @Nullable
    
    public ChartSeriesMarkers getMarkers() {
        return getElement().getMarkers();
    }

    /**
     * Shows/hides data-point markers for line-like series.
     * Acceptable input are:
     *
     * <ul>
     * <li><code>shown</code>: markers are always visible</li>
     * <li><code>hidden</code>: markers are always hidden</li>
     * <li><code>auto</code>: markers are visible for widespread data and hidden, when data is dense <em>(default)</em></li>
     * </ul>
     * @param value
     */
    
    public void setMarkers(@Nullable ChartSeriesMarkers value) {
        getElement().setMarkers(value);
    }

    /**
     * Used to connect the series to an axis; if multiple series have the same “unit”, they will share axis.
     * Displayed as a title for the axis.
     * If no unit is defined, then series will be connected to the first axis.
     *
     */
    @Nullable
    
    public String getUnit() {
        return getElement().getUnit();
    }

    /**
     * Used to connect the series to an axis; if multiple series have the same “unit”, they will share axis.
     * Displayed as a title for the axis.
     * If no unit is defined, then series will be connected to the first axis.
     *
     * @param value
     */
    
    public void setUnit(@Nullable String value) {
        getElement().setUnit(value);
    }

    /**
     * Used to group series in a different stacks.
     * &quot;stacking&quot; property should be specified either for each series or in plotOptions.
     * It is recommended to place series in a single stack, when they belong to the same yAxis.
     *
     */
    
    public Unknown getStack() {
        return getElement().getStack();
    }

    /**
     * Used to group series in a different stacks.
     * &quot;stacking&quot; property should be specified either for each series or in plotOptions.
     * It is recommended to place series in a single stack, when they belong to the same yAxis.
     *
     * @param value
     */
    
    public void setStack(double value) {
        getElement().setStack(value);
    }

    /**
     * Used to group series in a different stacks.
     * &quot;stacking&quot; property should be specified either for each series or in plotOptions.
     * It is recommended to place series in a single stack, when they belong to the same yAxis.
     *
     * @param value
     */
    
    public void setStack(String value) {
        getElement().setStack(value);
    }

    /**
     * The height of the neck, the lower part of the funnel.
     * A number defines pixel width, a percentage string defines a percentage of the plot area height. Defaults to 30%.
     * Note that this property only applies for &quot;funnel&quot; charts.
     *
     */
    
    public Unknown getNeckPosition() {
        return getElement().getNeckPosition();
    }

    /**
     * The height of the neck, the lower part of the funnel.
     * A number defines pixel width, a percentage string defines a percentage of the plot area height. Defaults to 30%.
     * Note that this property only applies for &quot;funnel&quot; charts.
     *
     * @param value
     */
    
    public void setNeckPosition(double value) {
        getElement().setNeckPosition(value);
    }

    /**
     * The height of the neck, the lower part of the funnel.
     * A number defines pixel width, a percentage string defines a percentage of the plot area height. Defaults to 30%.
     * Note that this property only applies for &quot;funnel&quot; charts.
     *
     * @param value
     */
    
    public void setNeckPosition(String value) {
        getElement().setNeckPosition(value);
    }

    /**
     * The width of the neck, the lower part of the funnel.
     * A number defines pixel width, a percentage string defines a percentage of the plot area width. Defaults to 30%.
     * Note that this property only applies for &quot;funnel&quot; charts.
     *
     */
    
    public Unknown getNeckWidth() {
        return getElement().getNeckWidth();
    }

    /**
     * The width of the neck, the lower part of the funnel.
     * A number defines pixel width, a percentage string defines a percentage of the plot area width. Defaults to 30%.
     * Note that this property only applies for &quot;funnel&quot; charts.
     *
     * @param value
     */
    
    public void setNeckWidth(double value) {
        getElement().setNeckWidth(value);
    }

    /**
     * The width of the neck, the lower part of the funnel.
     * A number defines pixel width, a percentage string defines a percentage of the plot area width. Defaults to 30%.
     * Note that this property only applies for &quot;funnel&quot; charts.
     *
     * @param value
     */
    
    public void setNeckWidth(String value) {
        getElement().setNeckWidth(value);
    }

    /**
     * Represents additional JSON configuration.
     *
     */
    @Nullable
    
    public ChartSeriesConfig getAdditionalOptions() {
        return getElement().getAdditionalOptions();
    }

    /**
     * Represents additional JSON configuration.
     *
     * @param value
     */
    
    public void setAdditionalOptions(@Nullable ChartSeriesConfig value) {
        getElement().setAdditionalOptions(value);
    }

    /**
     * Method to attach a series object of type <code>Highcharts.Series</code>.
     *
     * @param series Object of type <code>Highcharts.Series</code>
     *
     */
    public void setSeries(Series series) {
        getElement().setSeries(series);
    }

    /**
     * A string with the type of the series.
     * Defaults to `'line'` in case no type is set for the chart.
     * Note that `'bar'`, `'gauge'` and `'solidgauge'` should be set as default series type on `<vaadin-chart>`.
     */
    
    public String getType() {
        return getElement().getType();
    }

    /**
     * A string with the type of the series.
     * Defaults to `'line'` in case no type is set for the chart.
     * Note that `'bar'`, `'gauge'` and `'solidgauge'` should be set as default series type on `<vaadin-chart>`.
     * @param value
     */
    
    public void setType(String value) {
        getElement().setType(value);
    }
}
