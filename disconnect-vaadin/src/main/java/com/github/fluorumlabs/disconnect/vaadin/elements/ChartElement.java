package com.github.fluorumlabs.disconnect.vaadin.elements;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.github.fluorumlabs.disconnect.vaadin.Vaadin;
import com.github.fluorumlabs.disconnect.vaadin.constants.AxisPosition;
import com.github.fluorumlabs.disconnect.vaadin.constants.Stacking;
import js.lang.Unknown;
import js.web.dom.HTMLElement;
import org.teavm.jso.JSByRef;
import org.teavm.jso.JSProperty;

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
@NpmPackage(
        name = "@vaadin/vaadin",
        version = Vaadin.VERSION
)
@Import(
        symbols = "ChartElement",
        module = "@vaadin/vaadin-charts/src/vaadin-chart.js"
)
public interface ChartElement extends HTMLElement {
    /**
     * FIXME type ?
     */
    @JSProperty
    Unknown getOptions();

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
    @JSProperty
    Unknown getConfiguration();

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
    @JSProperty
    void setConfiguration(Unknown configuration);

    /**
     * If categories are present names are used instead of numbers for the category axis.
     * The format of categories can be an `Array` with a list of categories, such as `['2010', '2011', '2012']`
     * or a mapping `Object`, like `{0:'1',9:'Target (10)', 15: 'Max'}`.
     */
    @Nullable
    @JSProperty
    String[] getCategories();

    /**
     * If categories are present names are used instead of numbers for the category axis.
     * The format of categories can be an `Array` with a list of categories, such as `['2010', '2011', '2012']`
     * or a mapping `Object`, like `{0:'1',9:'Target (10)', 15: 'Max'}`.
     */
    @JSProperty
    void setCategories(@JSByRef String... categories);

    /**
     * Category-axis maximum value. Defaults to `undefined`.
     */
    @JSProperty
    double getCategoryMax();

    /**
     * Category-axis maximum value. Defaults to `undefined`.
     */
    @JSProperty
    void setCategoryMax(double categoryMax);

    /**
     * Category-axis minimum value. Defaults to `undefined`.
     */
    @JSProperty
    double getCategoryMin();

    /**
     * Category-axis minimum value. Defaults to `undefined`.
     */
    @JSProperty
    void setCategoryMin(double categoryMin);

    /**
     * The position of the category axis. Acceptable values are `left`, `right`, `top` and `bottom`
     * except for bar charts which only accept `left` and `right`.
     * With the default value, charts appear as though they have `category-position="bottom"`
     * except for bar charts that appear as though they have `category-position="left"`.
     * <p>
     * Defaults to `undefined`
     */
    @Nullable
    @JSProperty
    AxisPosition getCategoryPosition();

    /**
     * The position of the category axis. Acceptable values are `left`, `right`, `top` and `bottom`
     * except for bar charts which only accept `left` and `right`.
     * With the default value, charts appear as though they have `category-position="bottom"`
     * except for bar charts that appear as though they have `category-position="left"`.
     * <p>
     * Defaults to `undefined`
     */
    @JSProperty
    void setCategoryPosition(AxisPosition categoryPosition);

    /**
     * Specifies whether to hide legend or show.
     * Legend configuration can be set up via additionalOptions property
     */
    @JSProperty
    boolean isNoLegend();

    /**
     * Specifies whether to hide legend or show.
     * Legend configuration can be set up via additionalOptions property
     */
    @JSProperty
    void setNoLegend(boolean noLegend);

    /**
     * Specifies how series are stacked on top of each other.
     * Possible values are null, "normal" or "percent".
     * If "stack" property is not defined on the vaadin-chart-series elements, then series will be put into
     * the default stack.
     */
    @Nullable
    @JSProperty
    Stacking getStacking();

    /**
     * Specifies how series are stacked on top of each other.
     * Possible values are null, "normal" or "percent".
     * If "stack" property is not defined on the vaadin-chart-series elements, then series will be put into
     * the default stack.
     */
    @JSProperty
    void setStacking(Stacking stacking);

    /**
     * Specifies whether the chart is a normal chart or a timeline chart.
     */
    @JSProperty
    boolean isTimeline();

    /**
     * Specifies whether the chart is a normal chart or a timeline chart.
     */
    @JSProperty
    void setTimeline(boolean timeline);

    /**
     * Whether or not to show tooltip when hovering data points.
     */
    @JSProperty
    boolean isTooltip();

    /**
     * Whether or not to show tooltip when hovering data points.
     */
    @JSProperty
    void setTooltip(boolean tooltip);

    /**
     * Sets the default series type of the chart.
     * Note that `'bar'`, `'gauge'` and `'solidgauge'` should be set as default series type.
     */
    @Nullable
    @JSProperty
    String getType();

    /**
     * Sets the default series type of the chart.
     * Note that `'bar'`, `'gauge'` and `'solidgauge'` should be set as default series type.
     */
    @JSProperty
    void setType(String type);

    /**
     * Represents the subtitle of the chart.
     */
    @Nullable
    @JSProperty
    String getSubtitle();

    /**
     * Represents the subtitle of the chart.
     */
    @JSProperty
    void setSubtitle(String subtitle);

    /**
     * Specifies whether to show chart in 3 or in 2 dimensions.
     * Some display angles are added by default to the "chart.options3d" (`{alpha: 15, beta: 15, depth: 50}`).
     * 3D display options can be modified via `additionalOptions`.
     * The thickness of a Pie chart can be set on `additionalOptions` through `plotOptions.pie.depth`.
     * 3D is supported by Bar, Column, Pie and Scatter3D charts.
     * More info available at [Highcharts](https://www.highcharts.com/docs/chart-concepts/3d-charts).
     */
    @JSProperty
    boolean isChart3d();

    /**
     * Specifies whether to show chart in 3 or in 2 dimensions.
     * Some display angles are added by default to the "chart.options3d" (`{alpha: 15, beta: 15, depth: 50}`).
     * 3D display options can be modified via `additionalOptions`.
     * The thickness of a Pie chart can be set on `additionalOptions` through `plotOptions.pie.depth`.
     * 3D is supported by Bar, Column, Pie and Scatter3D charts.
     * More info available at [Highcharts](https://www.highcharts.com/docs/chart-concepts/3d-charts).
     */
    @JSProperty
    void setChart3d(boolean chart3d);

    /**
     * Specifies the message displayed on a chart without displayable data.
     */
    @Nullable
    @JSProperty
    String getEmptyText();

    /**
     * Specifies the message displayed on a chart without displayable data.
     */
    @JSProperty
    void setEmptyText(String emptyText);

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
     * When present, cartesian charts like line, spline, area and column are transformed
     * into the polar coordinate system.
     */
    @JSProperty
    boolean isPolar();

    /**
     * When present, cartesian charts like line, spline, area and column are transformed
     * into the polar coordinate system.
     */
    @JSProperty
    void setPolar(boolean polar);

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
    void update(Unknown jsonConfiguration, Unknown resetConfiguration);
}
