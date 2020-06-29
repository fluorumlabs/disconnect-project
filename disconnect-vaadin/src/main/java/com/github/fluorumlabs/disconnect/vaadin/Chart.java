package com.github.fluorumlabs.disconnect.vaadin;

import com.github.fluorumlabs.disconnect.core.annotations.CustomElement;
import com.github.fluorumlabs.disconnect.core.components.Component;
import com.github.fluorumlabs.disconnect.core.components.HtmlComponent;
import js.lang.Unknown;
import js.lang.external.highcharts.Options;
import js.lang.external.vaadin.vaadin_charts.ChartCategoryPosition;
import js.lang.external.vaadin.vaadin_charts.ChartElement;
import js.lang.external.vaadin.vaadin_charts.ChartStacking;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * Created by Artem Godin on 6/29/2020.
 */
@CustomElement(tagName = "vaadin-chart", external = true)
public class Chart extends HtmlComponent<ChartElement> {
    public Chart() {
        super();
    }

    public Chart(Component<?>... components) {
        super(components);
    }

    public Options getOptions() {
        return getElement().getOptions();
    }

    /**
     * Configuration object that exposes the JS Api to configure the chart.
     *
     * Most important methods are:
     *
     * <ul>
     * <li><code>addSeries (Object options, [Boolean redraw], [Mixed animation])</code></li>
     * <li><code>addAxis (Object options, [Boolean isX], [Boolean redraw], [Mixed animation])</code></li>
     * <li><code>setTitle (Object title, object subtitle, Boolean redraw)</code></li>
     * </ul>
     * Most important properties are:
     *
     * <ul>
     * <li><code>configuration.series</code>: An array of the chart's series. Detailed API for Series object is
     * available in <a href="http://api.highcharts.com/class-reference/Highcharts.Series">API Site</a></li>
     * <li><code>configuration.xAxis</code>: An array of the chart's x axes. Detailed API for Axis object is
     * available in <a href="http://api.highcharts.com/class-reference/Highcharts.Axis">API Site</a></li>
     * <li><code>configuration.yAxis</code>: An array of the chart's y axes. Detailed API for Axis object is
     * available in <a href="http://api.highcharts.com/class-reference/Highcharts.Axis">API Site</a></li>
     * <li><code>configuration.title</code>: The chart title.</li>
     * </ul>
     * For detailed documentation of available API check the <a href="http://api.highcharts.com/class-reference/classes.list">API site</a>
     *
     */
    @Nullable
    public js.lang.external.highcharts.Chart getConfiguration() {
        return getElement().getConfiguration();
    }

    /**
     * Configuration object that exposes the JS Api to configure the chart.
     *
     * Most important methods are:
     *
     * <ul>
     * <li><code>addSeries (Object options, [Boolean redraw], [Mixed animation])</code></li>
     * <li><code>addAxis (Object options, [Boolean isX], [Boolean redraw], [Mixed animation])</code></li>
     * <li><code>setTitle (Object title, object subtitle, Boolean redraw)</code></li>
     * </ul>
     * Most important properties are:
     *
     * <ul>
     * <li><code>configuration.series</code>: An array of the chart's series. Detailed API for Series object is
     * available in <a href="http://api.highcharts.com/class-reference/Highcharts.Series">API Site</a></li>
     * <li><code>configuration.xAxis</code>: An array of the chart's x axes. Detailed API for Axis object is
     * available in <a href="http://api.highcharts.com/class-reference/Highcharts.Axis">API Site</a></li>
     * <li><code>configuration.yAxis</code>: An array of the chart's y axes. Detailed API for Axis object is
     * available in <a href="http://api.highcharts.com/class-reference/Highcharts.Axis">API Site</a></li>
     * <li><code>configuration.title</code>: The chart title.</li>
     * </ul>
     * For detailed documentation of available API check the <a href="http://api.highcharts.com/class-reference/classes.list">API site</a>
     *
     * @param value
     */
    public void setConfiguration(@Nullable js.lang.external.highcharts.Chart value) {
        getElement().setConfiguration(value);
    }

    /**
     * If categories are present names are used instead of numbers for the category axis.
     * The format of categories can be an <code>Array</code> with a list of categories, such as <code>['2010', '2011', '2012']</code>
     * or a mapping <code>Object</code>, like <code>{0:'1',9:'Target (10)', 15: 'Max'}</code>.
     *
     */
    @Nullable
    
    public Unknown getCategories() {
        return getElement().getCategories();
    }

    /**
     * If categories are present names are used instead of numbers for the category axis.
     * The format of categories can be an <code>Array</code> with a list of categories, such as <code>['2010', '2011', '2012']</code>
     * or a mapping <code>Object</code>, like <code>{0:'1',9:'Target (10)', 15: 'Max'}</code>.
     *
     * @param value
     */
    
    public void setCategories(@Nullable ChartElement.Categories value) {
        getElement().setCategories(value);
    }

    /**
     * If categories are present names are used instead of numbers for the category axis.
     * The format of categories can be an <code>Array</code> with a list of categories, such as <code>['2010', '2011', '2012']</code>
     * or a mapping <code>Object</code>, like <code>{0:'1',9:'Target (10)', 15: 'Max'}</code>.
     *
     * @param value
     */
    
    public void setCategories(String[] value) {
        getElement().setCategories(value);
    }

    /**
     * Category-axis maximum value. Defaults to <code>undefined</code>.
     *
     */
    
    public double getCategoryMax() {
        return getElement().getCategoryMax();
    }

    /**
     * Category-axis maximum value. Defaults to <code>undefined</code>.
     *
     * @param value
     */
    
    public void setCategoryMax(double value) {
        getElement().setCategoryMax(value);
    }

    /**
     * Category-axis minimum value. Defaults to <code>undefined</code>.
     *
     */
    
    public double getCategoryMin() {
        return getElement().getCategoryMin();
    }

    /**
     * Category-axis minimum value. Defaults to <code>undefined</code>.
     *
     * @param value
     */
    
    public void setCategoryMin(double value) {
        getElement().setCategoryMin(value);
    }

    /**
     * The position of the category axis. Acceptable values are <code>left</code>, <code>right</code>, <code>top</code> and <code>bottom</code>
     * except for bar charts which only accept <code>left</code> and <code>right</code>.
     * With the default value, charts appear as though they have <code>category-position=&quot;bottom&quot;</code>
     * except for bar charts that appear as though they have <code>category-position=&quot;left&quot;</code>.
     *
     * Defaults to <code>undefined</code>
     *
     */
    @Nullable
    
    public ChartCategoryPosition getCategoryPosition() {
        return getElement().getCategoryPosition();
    }

    /**
     * The position of the category axis. Acceptable values are <code>left</code>, <code>right</code>, <code>top</code> and <code>bottom</code>
     * except for bar charts which only accept <code>left</code> and <code>right</code>.
     * With the default value, charts appear as though they have <code>category-position=&quot;bottom&quot;</code>
     * except for bar charts that appear as though they have <code>category-position=&quot;left&quot;</code>.
     *
     * Defaults to <code>undefined</code>
     *
     * @param value
     */
    
    public void setCategoryPosition(@Nullable ChartCategoryPosition value) {
        getElement().setCategoryPosition(value);
    }

    /**
     * Specifies whether to hide legend or show.
     * Legend configuration can be set up via additionalOptions property
     *
     */
    
    public boolean getNoLegend() {
        return getElement().getNoLegend();
    }

    /**
     * Specifies whether to hide legend or show.
     * Legend configuration can be set up via additionalOptions property
     *
     * @param value
     */
    
    public void setNoLegend(boolean value) {
        getElement().setNoLegend(value);
    }

    /**
     * Specifies how series are stacked on top of each other.
     * Possible values are null, &quot;normal&quot; or &quot;percent&quot;.
     * If &quot;stack&quot; property is not defined on the vaadin-chart-series elements, then series will be put into
     * the default stack.
     *
     */
    @Nullable
    
    public ChartStacking getStacking() {
        return getElement().getStacking();
    }

    /**
     * Specifies how series are stacked on top of each other.
     * Possible values are null, &quot;normal&quot; or &quot;percent&quot;.
     * If &quot;stack&quot; property is not defined on the vaadin-chart-series elements, then series will be put into
     * the default stack.
     *
     * @param value
     */
    
    public void setStacking(@Nullable ChartStacking value) {
        getElement().setStacking(value);
    }

    /**
     * Specifies whether the chart is a normal chart or a timeline chart.
     *
     */
    
    public boolean getTimeline() {
        return getElement().getTimeline();
    }

    /**
     * Specifies whether the chart is a normal chart or a timeline chart.
     *
     * @param value
     */
    
    public void setTimeline(boolean value) {
        getElement().setTimeline(value);
    }

    /**
     * Represents the title of the chart.
     *
     */
    
    public String getTitle() {
        return getElement().getTitle();
    }

    /**
     * Represents the title of the chart.
     *
     * @param title
     */
    
    public void setTitle(String title) {
        getElement().setTitle(title);
    }

    /**
     * Whether or not to show tooltip when hovering data points.
     *
     */
    
    public boolean getTooltip() {
        return getElement().getTooltip();
    }

    /**
     * Whether or not to show tooltip when hovering data points.
     *
     * @param value
     */
    
    public void setTooltip(boolean value) {
        getElement().setTooltip(value);
    }

    /**
     * Represents the subtitle of the chart.
     *
     */
    @Nullable
    
    public String getSubtitle() {
        return getElement().getSubtitle();
    }

    /**
     * Represents the subtitle of the chart.
     *
     * @param value
     */
    
    public void setSubtitle(@Nullable String value) {
        getElement().setSubtitle(value);
    }

    /**
     * Specifies whether to show chart in 3 or in 2 dimensions.
     * Some display angles are added by default to the &quot;chart.options3d&quot; (<code>{alpha: 15, beta: 15, depth: 50}</code>).
     * 3D display options can be modified via <code>additionalOptions</code>.
     * The thickness of a Pie chart can be set on <code>additionalOptions</code> through <code>plotOptions.pie.depth</code>.
     * 3D is supported by Bar, Column, Pie and Scatter3D charts.
     * More info available at <a href="https://www.highcharts.com/docs/chart-concepts/3d-charts">Highcharts</a>.
     *
     */
    
    public boolean getChart3d() {
        return getElement().getChart3d();
    }

    /**
     * Specifies whether to show chart in 3 or in 2 dimensions.
     * Some display angles are added by default to the &quot;chart.options3d&quot; (<code>{alpha: 15, beta: 15, depth: 50}</code>).
     * 3D display options can be modified via <code>additionalOptions</code>.
     * The thickness of a Pie chart can be set on <code>additionalOptions</code> through <code>plotOptions.pie.depth</code>.
     * 3D is supported by Bar, Column, Pie and Scatter3D charts.
     * More info available at <a href="https://www.highcharts.com/docs/chart-concepts/3d-charts">Highcharts</a>.
     *
     * @param value
     */
    
    public void setChart3d(boolean value) {
        getElement().setChart3d(value);
    }

    /**
     * Specifies the message displayed on a chart without displayable data.
     *
     */
    
    public String getEmptyText() {
        return getElement().getEmptyText();
    }

    /**
     * Specifies the message displayed on a chart without displayable data.
     *
     * @param value
     */
    
    public void setEmptyText(String value) {
        getElement().setEmptyText(value);
    }

    /**
     * Represents additional JSON configuration.
     *
     */
    @Nullable
    
    public Options getAdditionalOptions() {
        return getElement().getAdditionalOptions();
    }

    /**
     * Represents additional JSON configuration.
     *
     * @param value
     */
    
    public void setAdditionalOptions(@Nullable Options value) {
        getElement().setAdditionalOptions(value);
    }

    /**
     * When present, cartesian charts like line, spline, area and column are transformed
     * into the polar coordinate system.
     *
     */
    
    public boolean getPolar() {
        return getElement().getPolar();
    }

    /**
     * When present, cartesian charts like line, spline, area and column are transformed
     * into the polar coordinate system.
     *
     * @param value
     */
    
    public void setPolar(boolean value) {
        getElement().setPolar(value);
    }

    /**
     * Update the chart configuration.
     * This JSON API provides a simple single-argument alternative to the configuration property.
     *
     * Styling properties specified in this configuration will be ignored. To learn about chart styling
     * please see the CSS Styling section above.
     *  @param jsonConfiguration Object chart configuration. Most important properties are:
     *
     * <ul>
     * <li>chart <code>Object</code> with options regarding the chart area and plot area as well as general chart options.
     * Detailed API for chart object is available in <a href="http://api.highcharts.com/highcharts/chart">API Site</a></li>
     * <li>credits <code>Object</code> with options regarding the chart area and plot area as well as general chart options.
     * Detailed API for credits object is available in <a href="http://api.highcharts.com/highcharts/credits">API Site</a></li>
     * <li>labels <code>Object[]</code> with HTML labels that can be positioned anywhere in the chart area
     * Detailed API for labels object is available in <a href="http://api.highcharts.com/highcharts/labels">API Site</a></li>
     * <li>plotOptions <code>Object</code> wrapper for config objects for each series type.
     * Detailed API for plotOptions object is available in <a href="http://api.highcharts.com/highcharts/plotOptions">API Site</a></li>
     * <li>series <code>Object[]</code> the actual series to append to the chart.
     * Detailed API for series object is available in <a href="http://api.highcharts.com/highcharts/series">API Site</a></li>
     * <li>subtitle <code>Object</code> the chart's subtitle.
     * Detailed API for subtitle object is available in <a href="http://api.highcharts.com/highcharts/subtitle">API Site</a></li>
     * <li>title <code>Object</code> the chart's main title.
     * Detailed API for title object is available in <a href="http://api.highcharts.com/highcharts/title">API Site</a></li>
     * <li>tooltip <code>Object</code> Options for the tooltip that appears when the user hovers over a series or point.
     * Detailed API for tooltip object is available in <a href="http://api.highcharts.com/highcharts/tooltip">API Site</a></li>
     * <li>xAxis <code>Object[]</code> The X axis or category axis. Normally this is the horizontal axis.
     * Detailed API for xAxis object is available in <a href="http://api.highcharts.com/highcharts/xAxis">API Site</a></li>
     * <li>yAxis <code>Object[]</code> The Y axis or value axis. Normally this is the vertical axis.
     * Detailed API for yAxis object is available in <a href="http://api.highcharts.com/highcharts/yAxis">API Site</a></li>
     * <li>zAxis <code>Object[]</code> The Z axis or depth axis for 3D plots.
     * Detailed API for zAxis object is available in <a href="http://api.highcharts.com/highcharts/zAxis">API Site</a>
     * @param resetConfiguration Optional boolean that should be set to true if no other chart configuration was set before or
     * if existing configuration should be discarded.</li>
     */
    public void update(Options jsonConfiguration, boolean resetConfiguration) {
        getElement().update(jsonConfiguration, resetConfiguration);
    }

    /**
     * Update the chart configuration.
     * This JSON API provides a simple single-argument alternative to the configuration property.
     *
     * Styling properties specified in this configuration will be ignored. To learn about chart styling
     * please see the CSS Styling section above.
     *
     * @param jsonConfiguration Object chart configuration. Most important properties are:
     *
     * <ul>
     * <li>chart <code>Object</code> with options regarding the chart area and plot area as well as general chart options.
     * Detailed API for chart object is available in <a href="http://api.highcharts.com/highcharts/chart">API Site</a></li>
     * <li>credits <code>Object</code> with options regarding the chart area and plot area as well as general chart options.
     * Detailed API for credits object is available in <a href="http://api.highcharts.com/highcharts/credits">API Site</a></li>
     * <li>labels <code>Object[]</code> with HTML labels that can be positioned anywhere in the chart area
     * Detailed API for labels object is available in <a href="http://api.highcharts.com/highcharts/labels">API Site</a></li>
     * <li>plotOptions <code>Object</code> wrapper for config objects for each series type.
     * Detailed API for plotOptions object is available in <a href="http://api.highcharts.com/highcharts/plotOptions">API Site</a></li>
     * <li>series <code>Object[]</code> the actual series to append to the chart.
     * Detailed API for series object is available in <a href="http://api.highcharts.com/highcharts/series">API Site</a></li>
     * <li>subtitle <code>Object</code> the chart's subtitle.
     * Detailed API for subtitle object is available in <a href="http://api.highcharts.com/highcharts/subtitle">API Site</a></li>
     * <li>title <code>Object</code> the chart's main title.
     * Detailed API for title object is available in <a href="http://api.highcharts.com/highcharts/title">API Site</a></li>
     * <li>tooltip <code>Object</code> Options for the tooltip that appears when the user hovers over a series or point.
     * Detailed API for tooltip object is available in <a href="http://api.highcharts.com/highcharts/tooltip">API Site</a></li>
     * <li>xAxis <code>Object[]</code> The X axis or category axis. Normally this is the horizontal axis.
     * Detailed API for xAxis object is available in <a href="http://api.highcharts.com/highcharts/xAxis">API Site</a></li>
     * <li>yAxis <code>Object[]</code> The Y axis or value axis. Normally this is the vertical axis.
     * Detailed API for yAxis object is available in <a href="http://api.highcharts.com/highcharts/yAxis">API Site</a></li>
     * <li>zAxis <code>Object[]</code> The Z axis or depth axis for 3D plots.
     * Detailed API for zAxis object is available in <a href="http://api.highcharts.com/highcharts/zAxis">API Site</a>
     */
    public void update(Options jsonConfiguration) {
        getElement().update(jsonConfiguration);
    }
}
