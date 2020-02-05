package com.github.fluorumlabs.disconnect.vaadin;

import com.github.fluorumlabs.disconnect.vaadin.constants.AxisPosition;
import com.github.fluorumlabs.disconnect.vaadin.constants.Stacking;
import com.github.fluorumlabs.disconnect.vaadin.elements.ChartElement;
import com.github.fluorumlabs.disconnect.zero.component.AbstractComponent;
import com.github.fluorumlabs.disconnect.zero.component.Component;
import com.github.fluorumlabs.disconnect.zero.component.HasComponents;
import com.github.fluorumlabs.disconnect.zero.observable.ObservableEvent;
import js.lang.Unknown;
import js.web.dom.CustomEvent;

import javax.annotation.Nullable;

/**
 * `<vaadin-chart>` is a Web Component for creating high quality charts.
 * <p>
 * ### Quick Start
 * <p>
 * #### Polymer 2 App
 * <p>
 * 1. Create a Polymer application using [Polymer CLI](https://www.polymer-project.org/2.0/docs/tools/polymer-cli)
 * ```
 * mkdir my-app
 * cd my-app
 * polymer init
 * select `polymer-2-application`
 * ```
 * 1. Install Vaadin Charts
 * ```
 * bower install --save vaadin-charts#6.2.4
 * ```
 * 1. Import `<vaadin-chart>` to your app
 * Edit the file `src/my-app/my-app.html` and add the following snipped before the `<dom-module>` tag
 * ```html
 * <link rel="import" href="../../bower_components/vaadin-charts/vaadin-chart.html">
 * ```
 * 1. Add your first `<vaadin-chart>`
 * Also in `my-app.html` add the following snippet before the `</template>` closing tag
 * ```html
 * <vaadin-chart></vaadin-chart>
 * ```
 * 1. Run your app with:
 * ```
 * polymer serve --open
 * ```
 * <p>
 * #### Polymer 3 App
 * <p>
 * * 1. Create a Polymer application using [Polymer CLI](https://www.polymer-project.org/3.0/docs/tools/polymer-cli)
 * ```
 * mkdir my-app
 * cd my-app
 * polymer init
 * select `polymer-3-application`
 * ```
 * 1. Install Vaadin Charts
 * ```
 * npm i @vaadin/vaadin-charts@6.2.3 --save
 * ```
 * 1. Import `<vaadin-chart>` to your app
 * Edit the file `src/my-app/my-app.js` and add the following snipped on the top, after the first `import` declaration
 * ```js
 * import '@vaadin/vaadin-charts';
 * ```
 * 1. Add your first `<vaadin-chart>`
 * Also in `my-app.js`, at the template getter, add the following snippet after the `</h2>` closing tag
 * ```html
 * <vaadin-chart></vaadin-chart>
 * ```
 * 1. Run your app with:
 * ```
 * polymer serve --npm --open
 * ```
 * <p>
 * Congratulations! You have your first Vaadin Chart setup.
 * <p>
 * ### Basic use
 * <p>
 * Now that we covered the basic steps to create an empty chart, let us show how you can configure it.
 * <p>
 * There are two ways of configuring your `<vaadin-chart>` element: **HTML API**, **JS API** and **JSON API**.
 * Note that you can make use of all APIs in your element.
 * <p>
 * #### Configuring your chart using HTML API
 * <p>
 * `vaadin-chart` has a set of attributes to make it easier for you to customize your chart.
 * Using as a base the project created with in Quick Start:
 * <p>
 * ```html
 * <vaadin-chart title="The chart title" subtitle="The chart subtitle">
 * <vaadin-chart-series
 * type="column"
 * title="The series title"
 * values="[10,20,30]">
 * </vaadin-chart-series>
 * </vaadin-chart>
 * ```
 * <p>
 * > Note that while you can set type for each series individually, for some types, such as `'bar'`, `'gauge'` and
 * `'solidgauge'`, you
 * > have to set it as the default series type on `<vaadin-chart>` in order to work properly.
 * <p>
 * #### Configuring your chart using JS API
 * <p>
 * Using as a base the project created with in Quick Start
 * <p>
 * Do the following changes in `my-app.html`
 * <p>
 * 1. Set and id for the `<vaadin-chart>` in the template
 * ```html
 * <vaadin-chart id="mychart"></vaadin-chart>
 * ```
 * 1. Add a function that uses `configuration` property (JS Api) to set chart title, categories and data
 * ```js
 * initChartWithJSApi() {
 * Polymer.RenderStatus.beforeNextRender(this, () => {
 * const configuration = this.$.mychart.configuration;
 * configuration.setTitle({ text: 'The chart title' });
 * // By default there is one x axis, it is referenced by configuration.xAxis[0].
 * configuration.xAxis[0].setCategories(['Jan', 'Feb', 'Mar', 'Apr', 'May', 'Jun', 'Jul', 'Aug', 'Sep', 'Oct', 'Nov',
 * 'Dec']);
 * configuration.addSeries({
 * type: 'column',
 * data: [29.9, 71.5, 106.4, 129.2, 144.0, 176.0, 135.6, 148.5, 216.4, 194.1, 95.6, 54.4]
 * });
 * });
 * }
 * ```
 * 1. Call that function from connectedCallback (when the element is added to a document)
 * ```js
 * connectedCallback() {
 * super.connectedCallback();
 * this.initChartWithJSApi();
 * }
 * ```
 * 1. And finally run your app with:
 * ```
 * polymer serve --open
 * ```
 * <p>
 * <p>
 * #### Configuring your chart using JS JSON API
 * <p>
 * JS JSON API is a simple alternative to the JS API.
 * <p>
 * Using as a base the project created with in Quick Start
 * <p>
 * Do the following changes in `my-app.html`
 * <p>
 * 1. Set and id for the `<vaadin-chart>` in the template
 * ```html
 * <vaadin-chart id="mychart"></vaadin-chart>
 * ```
 * 1. Add a function that uses `update` method (JS JSON Api) to set chart title, categories and data
 * ```js
 * initChartWithJSJSONApi() {
 * this.$.mychart.update({
 * title: {
 * text: 'The chart title'
 * },
 * subtitle: {
 * text: 'Subtitle'
 * },
 * xAxis: {
 * categories: ['Jan', 'Feb', 'Mar', 'Apr', 'May', 'Jun', 'Jul', 'Aug', 'Sep', 'Oct', 'Nov', 'Dec']
 * },
 * series: [{
 * type: 'column',
 * data: [29.9, 71.5, 106.4, 129.2, 144.0, 176.0, 135.6, 148.5, 216.4, 194.1, 95.6, 54.4]
 * }]
 * });
 * }
 * ```
 * 1. Call that function from connectedCallback (when the element is added to a document)
 * ```js
 * connectedCallback() {
 * super.connectedCallback();
 * this.initChartWithJSJSONApi();
 * }
 * ```
 * 1. And finally run your app with:
 * ```
 * polymer serve --open
 * ```
 * <p>
 * It should be noted that chart style customization cannot be done via the JS or JSON API.
 * Styling properties in the JSON configuration will be ignored. The following section discusses chart styling.
 * <p>
 * <p>
 * ### CSS Styling
 * Chart appearance is primarily controlled by CSS style rules.
 * A comprehensive list of the supported style classes can be found at
 * https://www.highcharts.com/docs/chart-design-and-style/style-by-css
 * <p>
 * <p>
 * ### Steps for styling a chart
 * <p>
 * 1. Create a theme file (for example `shared-styles.html`). The theme's dom-module must declare
 * `theme-for=vaadin-chart`.
 * 2. Import `vaadin-chart-default-theme.html` and declare `include="vaadin-chart-default-theme"`
 * on the theme module's style tag to customize Chart's default theme. If there are multiple theme
 * modules *only one* of them should declare this `include`.
 * 3. Specify the desired CSS rules in the theme file.
 * 4. If multiple charts are present, each one can be specifically targeted using the host selector e.g `:host(
 * .my-chart-class)`.
 * 5. Import the theme file.
 * <p>
 * <p>
 * ### Example: Two Charts with a Red Title but only one with a Blue Subtitle
 * <p>
 * ```html
 * <link rel="import" href="shared-styles.html">
 * ...
 * <vaadin-chart title="Red Title" subtitle="Not Styled">
 * <vaadin-chart-series values="[19,12,9,24,5]"></vaadin-chart-series>
 * </vaadin-chart>
 * <p>
 * <vaadin-chart class="blue-subtitle" title="Red Title" subtitle="Blue Subtitle">
 * <vaadin-chart-series values="[19,12,9,24,5]"></vaadin-chart-series>
 * </vaadin-chart>
 * ```
 * <p>
 * shared-styles.html
 * <p>
 * ```html
 * <link rel="import" href="../bower_components/vaadin-charts/theme/vaadin-chart-default-theme.html">
 * <p>
 * <dom-module id="css-style-example" theme-for="vaadin-chart">
 * <template>
 * <style include="vaadin-chart-default-theme">
 * .highcharts-title {
 * fill: red;
 * font-size: xx-large;
 * }
 * <p>
 * :host(.blue-subtitle) .highcharts-subtitle {
 * fill: blue;
 * }
 * </style>
 * </template>
 * </dom-module>
 * ```
 * <p>
 * ### Setting colors
 * <p>
 * Although charts can be styled as described above, there is a simpler way for setting colors.
 * Colors can be set using CSS custom properties `--vaadin-charts-color-{n}` (where `n` goes from `0 - 9`).
 * <p>
 * For example `--vaadin-charts-color-0` sets the color of the first series on a chart.
 * <p>
 * ### Validating your License
 * After one day using Vaadin Charts in a development environment you will see a pop-up that asks you
 * to validate your license by signing in to vaadin.com.
 */
public class VaadinChart extends AbstractComponent<ChartElement>
        implements HasComponents<ChartElement, VaadinChart, Component<?>> {
    public VaadinChart() {
        super("vaadin-chart");
    }

    /**
     * FIXME type ?
     */
    public Unknown options() {
        return getNode().getOptions();
    }

    /**
     * FIXME type Object
     * Configuration object that exposes the JS Api to configure the chart.
     * <p>
     * Most important methods are:
     * - `addSeries (Object options, [Boolean redraw], [Mixed animation])`
     * - `addAxis (Object options, [Boolean isX], [Boolean redraw], [Mixed animation])`
     * - `setTitle (Object title, object subtitle, Boolean redraw)`
     * <p>
     * Most important properties are:
     * - `configuration.series`: An array of the chart's series. Detailed API for Series object is
     * available in [API Site](http://api.highcharts.com/class-reference/Highcharts.Series)
     * - `configuration.xAxis`: An array of the chart's x axes. Detailed API for Axis object is
     * available in [API Site](http://api.highcharts.com/class-reference/Highcharts.Axis)
     * - `configuration.yAxis`: An array of the chart's y axes. Detailed API for Axis object is
     * available in [API Site](http://api.highcharts.com/class-reference/Highcharts.Axis)
     * - `configuration.title`: The chart title.
     * <p>
     * For detailed documentation of available API check the [API site](http://api.highcharts
     * .com/class-reference/classes.list)
     */
    public Unknown configuration() {
        return getNode().getConfiguration();
    }

    /**
     * FIXME type Object
     * Configuration object that exposes the JS Api to configure the chart.
     * <p>
     * Most important methods are:
     * - `addSeries (Object options, [Boolean redraw], [Mixed animation])`
     * - `addAxis (Object options, [Boolean isX], [Boolean redraw], [Mixed animation])`
     * - `setTitle (Object title, object subtitle, Boolean redraw)`
     * <p>
     * Most important properties are:
     * - `configuration.series`: An array of the chart's series. Detailed API for Series object is
     * available in [API Site](http://api.highcharts.com/class-reference/Highcharts.Series)
     * - `configuration.xAxis`: An array of the chart's x axes. Detailed API for Axis object is
     * available in [API Site](http://api.highcharts.com/class-reference/Highcharts.Axis)
     * - `configuration.yAxis`: An array of the chart's y axes. Detailed API for Axis object is
     * available in [API Site](http://api.highcharts.com/class-reference/Highcharts.Axis)
     * - `configuration.title`: The chart title.
     * <p>
     * For detailed documentation of available API check the [API site](http://api.highcharts
     * .com/class-reference/classes.list)
     */
    public VaadinChart configuration(Unknown configuration) {
        getNode().setConfiguration(configuration);
        return this;
    }

    /**
     * If categories are present names are used instead of numbers for the category axis.
     * The format of categories can be an `Array` with a list of categories, such as `['2010', '2011', '2012']`
     * or a mapping `Object`, like `{0:'1',9:'Target (10)', 15: 'Max'}`.
     */
    @Nullable
    public String[] categories() {
        return getNode().getCategories();
    }

    /**
     * If categories are present names are used instead of numbers for the category axis.
     * The format of categories can be an `Array` with a list of categories, such as `['2010', '2011', '2012']`
     * or a mapping `Object`, like `{0:'1',9:'Target (10)', 15: 'Max'}`.
     */
    public VaadinChart categories(String... categories) {
        getNode().setCategories(categories);
        return this;
    }

    /**
     * Category-axis maximum value. Defaults to `undefined`.
     */
    public double categoryMax() {
        return getNode().getCategoryMax();
    }

    /**
     * Category-axis maximum value. Defaults to `undefined`.
     */
    public VaadinChart categoryMax(double categoryMax) {
        getNode().setCategoryMax(categoryMax);
        return this;
    }

    /**
     * Category-axis minimum value. Defaults to `undefined`.
     */
    public double categoryMin() {
        return getNode().getCategoryMin();
    }

    /**
     * Category-axis minimum value. Defaults to `undefined`.
     */
    public VaadinChart categoryMin(double categoryMin) {
        getNode().setCategoryMin(categoryMin);
        return this;
    }

    /**
     * The position of the category axis. Acceptable values are `left`, `right`, `top` and `bottom`
     * except for bar charts which only accept `left` and `right`.
     * With the default value, charts appear as though they have `category-position="bottom"`
     * except for bar charts that appear as though they have `category-position="left"`.
     * <p>
     * Defaults to `undefined`
     */
    @Nullable
    public AxisPosition categoryPosition() {
        return getNode().getCategoryPosition();
    }

    /**
     * The position of the category axis. Acceptable values are `left`, `right`, `top` and `bottom`
     * except for bar charts which only accept `left` and `right`.
     * With the default value, charts appear as though they have `category-position="bottom"`
     * except for bar charts that appear as though they have `category-position="left"`.
     * <p>
     * Defaults to `undefined`
     */
    public VaadinChart categoryPosition(AxisPosition categoryPosition) {
        getNode().setCategoryPosition(categoryPosition);
        return this;
    }

    /**
     * Specifies whether to hide legend or show.
     * Legend configuration can be set up via additionalOptions property
     */
    public boolean noLegend() {
        return getNode().isNoLegend();
    }

    /**
     * Specifies whether to hide legend or show.
     * Legend configuration can be set up via additionalOptions property
     */
    public VaadinChart noLegend(boolean noLegend) {
        getNode().setNoLegend(noLegend);
        return this;
    }

    /**
     * Specifies how series are stacked on top of each other.
     * Possible values are null, "normal" or "percent".
     * If "stack" property is not defined on the vaadin-chart-series elements, then series will be put into
     * the default stack.
     */
    @Nullable
    public Stacking stacking() {
        return getNode().getStacking();
    }

    /**
     * Specifies how series are stacked on top of each other.
     * Possible values are null, "normal" or "percent".
     * If "stack" property is not defined on the vaadin-chart-series elements, then series will be put into
     * the default stack.
     */
    public VaadinChart stacking(Stacking stacking) {
        getNode().setStacking(stacking);
        return this;
    }

    /**
     * Specifies whether the chart is a normal chart or a timeline chart.
     */
    public boolean timeline() {
        return getNode().isTimeline();
    }

    /**
     * Specifies whether the chart is a normal chart or a timeline chart.
     */
    public VaadinChart timeline(boolean timeline) {
        getNode().setTimeline(timeline);
        return this;
    }

    /**
     * Represents the title of the chart.
     */
    @Nullable
    public String title() {
        return getNode().getTitle();
    }

    /**
     * Represents the title of the chart.
     */
    public VaadinChart title(String title) {
        getNode().setTitle(title);
        return this;
    }

    /**
     * Whether or not to show tooltip when hovering data points.
     */
    public boolean tooltip() {
        return getNode().isTooltip();
    }

    /**
     * Whether or not to show tooltip when hovering data points.
     */
    public VaadinChart tooltip(boolean tooltip) {
        getNode().setTooltip(tooltip);
        return this;
    }

    /**
     * Sets the default series type of the chart.
     * Note that `'bar'`, `'gauge'` and `'solidgauge'` should be set as default series type.
     */
    @Nullable
    public String type() {
        return getNode().getType();
    }

    /**
     * Sets the default series type of the chart.
     * Note that `'bar'`, `'gauge'` and `'solidgauge'` should be set as default series type.
     */
    public VaadinChart type(String type) {
        getNode().setType(type);
        return this;
    }

    /**
     * Represents the subtitle of the chart.
     */
    @Nullable
    public String subtitle() {
        return getNode().getSubtitle();
    }

    /**
     * Represents the subtitle of the chart.
     */
    public VaadinChart subtitle(String subtitle) {
        getNode().setSubtitle(subtitle);
        return this;
    }

    /**
     * Specifies whether to show chart in 3 or in 2 dimensions.
     * Some display angles are added by default to the "chart.options3d" (`{alpha: 15, beta: 15, depth: 50}`).
     * 3D display options can be modified via `additionalOptions`.
     * The thickness of a Pie chart can be set on `additionalOptions` through `plotOptions.pie.depth`.
     * 3D is supported by Bar, Column, Pie and Scatter3D charts.
     * More info available at [Highcharts](https://www.highcharts.com/docs/chart-concepts/3d-charts).
     */
    public boolean chart3d() {
        return getNode().isChart3d();
    }

    /**
     * Specifies whether to show chart in 3 or in 2 dimensions.
     * Some display angles are added by default to the "chart.options3d" (`{alpha: 15, beta: 15, depth: 50}`).
     * 3D display options can be modified via `additionalOptions`.
     * The thickness of a Pie chart can be set on `additionalOptions` through `plotOptions.pie.depth`.
     * 3D is supported by Bar, Column, Pie and Scatter3D charts.
     * More info available at [Highcharts](https://www.highcharts.com/docs/chart-concepts/3d-charts).
     */
    public VaadinChart chart3d(boolean chart3d) {
        getNode().setChart3d(chart3d);
        return this;
    }

    /**
     * Specifies the message displayed on a chart without displayable data.
     */
    @Nullable
    public String emptyText() {
        return getNode().getEmptyText();
    }

    /**
     * Specifies the message displayed on a chart without displayable data.
     */
    public VaadinChart emptyText(String emptyText) {
        getNode().setEmptyText(emptyText);
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
    public VaadinChart additionalOptions(Unknown additionalOptions) {
        getNode().setAdditionalOptions(additionalOptions);
        return this;
    }

    /**
     * When present, cartesian charts like line, spline, area and column are transformed
     * into the polar coordinate system.
     */
    public boolean polar() {
        return getNode().isPolar();
    }

    /**
     * When present, cartesian charts like line, spline, area and column are transformed
     * into the polar coordinate system.
     */
    public VaadinChart polar(boolean polar) {
        getNode().setPolar(polar);
        return this;
    }

    /**
     * Update the chart configuration.
     * This JSON API provides a simple single-argument alternative to the configuration property.
     * <p>
     * Styling properties specified in this configuration will be ignored. To learn about chart styling
     * please see the CSS Styling section above.
     * FIXME param jsonConfiguration: Object
     *
     * @param jsonConfiguration  Object chart configuration. Most important properties are:
     *                           <p>
     *                           - chart `Object` with options regarding the chart area and plot area as well as
     *                           general chart options.
     *                           Detailed API for chart object is available in [API Site](http://api.highcharts
     *                           .com/highcharts/chart)
     *                           - credits `Object` with options regarding the chart area and plot area as well as
     *                           general chart options.
     *                           Detailed API for credits object is available in [API Site](http://api.highcharts
     *                           .com/highcharts/credits)
     *                           - labels `Object[]` with HTML labels that can be positioned anywhere in the chart area
     *                           Detailed API for labels object is available in [API Site](http://api.highcharts
     *                           .com/highcharts/labels)
     *                           - plotOptions `Object` wrapper for config objects for each series type.
     *                           Detailed API for plotOptions object is available in [API Site](http://api.highcharts
     *                           .com/highcharts/plotOptions)
     *                           - series `Object[]` the actual series to append to the chart.
     *                           Detailed API for series object is available in [API Site](http://api.highcharts
     *                           .com/highcharts/series)
     *                           - subtitle `Object` the chart's subtitle.
     *                           Detailed API for subtitle object is available in [API Site](http://api.highcharts
     *                           .com/highcharts/subtitle)
     *                           - title `Object` the chart's main title.
     *                           Detailed API for title object is available in [API Site](http://api.highcharts
     *                           .com/highcharts/title)
     *                           - tooltip `Object` Options for the tooltip that appears when the user hovers over a
     *                           series or point.
     *                           Detailed API for tooltip object is available in [API Site](http://api.highcharts
     *                           .com/highcharts/tooltip)
     *                           - xAxis `Object[]` The X axis or category axis. Normally this is the horizontal axis.
     *                           Detailed API for xAxis object is available in [API Site](http://api.highcharts
     *                           .com/highcharts/xAxis)
     *                           - yAxis `Object[]` The Y axis or value axis. Normally this is the vertical axis.
     *                           Detailed API for yAxis object is available in [API Site](http://api.highcharts
     *                           .com/highcharts/yAxis)
     *                           - zAxis `Object[]` The Z axis or depth axis for 3D plots.
     *                           Detailed API for zAxis object is available in [API Site](http://api.highcharts
     *                           .com/highcharts/zAxis)
     *                           FIXME param resetConfiguration: Boolean
     * @param resetConfiguration Optional boolean that should be set to true if no other chart configuration was set
     *                           before or
     *                           if existing configuration should be discarded.
     */
    public void update(Unknown jsonConfiguration, Unknown resetConfiguration) {
        getNode().update(jsonConfiguration, resetConfiguration);
    }

    /**
     * chart-add-series  Fired when a new series is added
     */
    public ObservableEvent<CustomEvent> chartAddSeriesEvent() {
        return createEvent("chart-add-series");
    }

    /**
     * chart-after-export  Fired after a chart is exported
     */
    public ObservableEvent<CustomEvent> chartAfterExportEvent() {
        return createEvent("chart-after-export");
    }

    /**
     * chart-after-print  Fired after a chart is printed
     */
    public ObservableEvent<CustomEvent> chartAfterPrintEvent() {
        return createEvent("chart-after-print");
    }

    /**
     * chart-before-export  Fired before a chart is exported
     */
    public ObservableEvent<CustomEvent> chartBeforeExportEvent() {
        return createEvent("chart-before-export");
    }

    /**
     * chart-before-print  Fired before a chart is printed
     */
    public ObservableEvent<CustomEvent> chartBeforePrintEvent() {
        return createEvent("chart-before-print");
    }

    /**
     * chart-click  Fired when clicking on the plot background
     */
    public ObservableEvent<CustomEvent> chartClickEvent() {
        return createEvent("chart-click");
    }

    /**
     * chart-drilldown  Fired when drilldown point is clicked
     */
    public ObservableEvent<CustomEvent> chartDrilldownEvent() {
        return createEvent("chart-drilldown");
    }

    /**
     * chart-drillup  Fired when drilling up from a drilldown series
     */
    public ObservableEvent<CustomEvent> chartDrillupEvent() {
        return createEvent("chart-drillup");
    }

    /**
     * chart-drillupall  Fired after all the series  has been drilled up
     * if chart has multiple drilldown series
     */
    public ObservableEvent<CustomEvent> chartDrillupallEvent() {
        return createEvent("chart-drillupall");
    }

    /**
     * chart-load  Fired when the chart is finished loading
     */
    public ObservableEvent<CustomEvent> chartLoadEvent() {
        return createEvent("chart-load");
    }

    /**
     * chart-redraw  Fired when the chart is redraw. Can be called after a `Chart.configuration.redraw()`
     * or after an axis, series or point is modified with the `redraw` option set to `true`
     */
    public ObservableEvent<CustomEvent> chartRedrawEvent() {
        return createEvent("chart-redraw");
    }

    /**
     * chart-selection  Fired when an area of the chart has been selected
     */
    public ObservableEvent<CustomEvent> chartSelectionEvent() {
        return createEvent("chart-selection");
    }

    /**
     * point-click  Fired when the point is clicked
     */
    public ObservableEvent<CustomEvent> pointClickEvent() {
        return createEvent("point-click");
    }

    /**
     * point-legend-item-click  Fired when the legend item belonging to the point is clicked
     */
    public ObservableEvent<CustomEvent> pointLegendItemClickEvent() {
        return createEvent("point-legend-item-click");
    }

    /**
     * point-mouse-out  Fired when the mouse leaves the area close to the point
     */
    public ObservableEvent<CustomEvent> pointMouseOutEvent() {
        return createEvent("point-mouse-out");
    }

    /**
     * point-mouse-over  Fired when the mouse enters the area close to the point
     */
    public ObservableEvent<CustomEvent> pointMouseOverEvent() {
        return createEvent("point-mouse-over");
    }

    /**
     * point-remove  Fired when the point is removed from the series
     */
    public ObservableEvent<CustomEvent> pointRemoveEvent() {
        return createEvent("point-remove");
    }

    /**
     * point-select  Fired when the point is selected etheir programmatically or by clicking on the point
     */
    public ObservableEvent<CustomEvent> pointSelectEvent() {
        return createEvent("point-select");
    }

    /**
     * point-unselect  Fired when the point is unselected etheir programmatically or by clicking on the point
     */
    public ObservableEvent<CustomEvent> pointUnselectEvent() {
        return createEvent("point-unselect");
    }

    /**
     * point-update  Fired when the point is updated programmatically through `.update()` method
     */
    public ObservableEvent<CustomEvent> pointUpdateEvent() {
        return createEvent("point-update");
    }

    /**
     * series-after-animate  Fired when the series has finished its initial animation
     */
    public ObservableEvent<CustomEvent> seriesAfterAnimateEvent() {
        return createEvent("series-after-animate");
    }

    /**
     * series-checkbox-click  Fired when the checkbox next to the series' name in the legend is clicked
     */
    public ObservableEvent<CustomEvent> seriesCheckboxClickEvent() {
        return createEvent("series-checkbox-click");
    }

    /**
     * series-click  Fired when the series is clicked
     */
    public ObservableEvent<CustomEvent> seriesClickEvent() {
        return createEvent("series-click");
    }

    /**
     * series-hide  Fired when the series is hidden after chart generation time
     */
    public ObservableEvent<CustomEvent> seriesHideEvent() {
        return createEvent("series-hide");
    }

    /**
     * series-legend-item-click  Fired when the legend item belonging to the series is clicked
     */
    public ObservableEvent<CustomEvent> seriesLegendItemClickEvent() {
        return createEvent("series-legend-item-click");
    }

    /**
     * series-mouse-out  Fired when the mouses leave the graph
     */
    public ObservableEvent<CustomEvent> seriesMouseOutEvent() {
        return createEvent("series-mouse-out");
    }

    /**
     * series-mouse-over  Fired when the mouse enters the graph
     */
    public ObservableEvent<CustomEvent> seriesMouseOverEvent() {
        return createEvent("series-mouse-over");
    }

    /**
     * series-show  Fired when the series is show after chart generation time
     */
    public ObservableEvent<CustomEvent> seriesShowEvent() {
        return createEvent("series-show");
    }

    /**
     * xaxes-extremes-set  Fired when when the minimum and maximum is set for the x axis
     */
    public ObservableEvent<CustomEvent> xaxesExtremesSetEvent() {
        return createEvent("xaxes-extremes-set");
    }

    /**
     * yaxes-extremes-set  Fired when when the minimum and maximum is set for the y axis
     */
    public ObservableEvent<CustomEvent> yaxesExtremesSetEvent() {
        return createEvent("yaxes-extremes-set");
    }
}
