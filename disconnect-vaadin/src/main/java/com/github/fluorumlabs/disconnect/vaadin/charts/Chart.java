package com.github.fluorumlabs.disconnect.vaadin.charts;

import com.github.fluorumlabs.disconnect.core.annotations.CustomElement;
import com.github.fluorumlabs.disconnect.core.components.HtmlComponent;
import com.github.fluorumlabs.disconnect.core.utils.LowerCase;
import com.github.fluorumlabs.disconnect.vaadin.theme.Themable;
import js.lang.JsObject;
import js.lang.Unknown;
import js.lang.external.highcharts.Highcharts;
import js.lang.external.highcharts.Options;
import js.lang.external.vaadin.charts.ChartElement;
import js.util.collections.Array;
import js.web.dom.Window;

import javax.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;

/**
 * <code>&lt;vaadin-chart&gt;</code> is a Web Component for creating high quality charts.
 *
 * <h3>Basic use</h3>
 * There are two ways of configuring your <code>&lt;vaadin-chart&gt;</code> element: <strong>HTML API</strong>, <strong>JS API</strong> and <strong>JSON API</strong>. Note that you can make use of all APIs in your element.
 *
 * <h4>Configuring your chart using HTML API</h4>
 * <code>vaadin-chart</code> has a set of attributes to make it easier for you to customize your chart.
 *
 * <pre><code class="language-html">  &lt;vaadin-chart title="The chart title" subtitle="The chart subtitle"&gt;
 *     &lt;vaadin-chart-series
 *           type="column"
 *           title="The series title"
 *           values="[10,20,30]"&gt;
 *     &lt;/vaadin-chart-series&gt;
 *   &lt;/vaadin-chart&gt;
 * </code></pre>
 * <blockquote>
 *  Note that while you can set type for each series individually, for some types, such as <code>'bar'</code>, <code>'gauge'</code> and <code>'solidgauge'</code>, you have to set it as the default series type on <code>&lt;vaadin-chart&gt;</code> in order to work properly.
 *
 * </blockquote>
 * <h4>Configuring your chart using JS API</h4>
 * <ol>
 *  <li>Set an id for the <code>&lt;vaadin-chart&gt;</code> in the template</li>
 * </ol>
 * <pre><code class="language-html">     &lt;vaadin-chart id="mychart"&gt;&lt;/vaadin-chart&gt;
 * </code></pre>
 * <ol>
 *  <li>Add a function that uses <code>configuration</code> property (JS Api) to set chart title, categories and data</li>
 * </ol>
 * <pre><code class="language-js">initChartWithJSApi() {
 *      Polymer.RenderStatus.beforeNextRender(this, () =&gt; {
 *         const configuration = this.$.mychart.configuration;
 *         configuration.setTitle({ text: 'The chart title' });
 *         // By default there is one x axis, it is referenced by configuration.xAxis[0].
 *         configuration.xAxis[0].setCategories(['Jan', 'Feb', 'Mar', 'Apr', 'May', 'Jun', 'Jul', 'Aug', 'Sep', 'Oct', 'Nov', 'Dec']);
 *         configuration.addSeries({
 *             type: 'column',
 *             data: [29.9, 71.5, 106.4, 129.2, 144.0, 176.0, 135.6, 148.5, 216.4, 194.1, 95.6, 54.4]
 *         });
 *      });
 * }
 * </code></pre>
 * <ol>
 *  <li>Call that function from connectedCallback (when the element is added to a document)</li>
 * </ol>
 * <pre><code class="language-js">connectedCallback() {
 *      super.connectedCallback();
 *      this.initChartWithJSApi();
 * }
 * </code></pre>
 * <h4>Configuring your chart using JS JSON API</h4>
 * JS JSON API is a simple alternative to the JS API.
 *
 * <ol>
 *  <li>Set an id for the <code>&lt;vaadin-chart&gt;</code> in the template</li>
 * </ol>
 * <pre><code class="language-html">     &lt;vaadin-chart id="mychart"&gt;&lt;/vaadin-chart&gt;
 * </code></pre>
 * <ol>
 *  <li>Add a function that uses <code>update</code> method (JS JSON Api) to set chart title, categories and data</li>
 * </ol>
 * <pre><code class="language-js">initChartWithJSJSONApi() {
 *      this.$.mychart.update({
 *        title: {
 *          text: 'The chart title'
 *        },
 *        subtitle: {
 *          text: 'Subtitle'
 *        },
 *        xAxis: {
 *          categories: ['Jan', 'Feb', 'Mar', 'Apr', 'May', 'Jun', 'Jul', 'Aug', 'Sep', 'Oct', 'Nov', 'Dec']
 *        },
 *        series: [{
 *          type: 'column',
 *          data: [29.9, 71.5, 106.4, 129.2, 144.0, 176.0, 135.6, 148.5, 216.4, 194.1, 95.6, 54.4]
 *        }]
 *      });
 * }
 * </code></pre>
 * <ol>
 *  <li>Call that function from connectedCallback (when the element is added to a document)</li>
 * </ol>
 * <pre><code class="language-js">connectedCallback() {
 *      super.connectedCallback();
 *      this.initChartWithJSJSONApi();
 * }
 * </code></pre>
 * It should be noted that chart style customization cannot be done via the JS or JSON API. Styling properties in the JSON configuration will be ignored. The following section discusses chart styling.
 *
 * <h3>CSS Styling</h3>
 * Chart appearance is primarily controlled by CSS style rules. A comprehensive list of the supported style classes can be found at <a href="https://www.highcharts.com/docs/chart-design-and-style/style-by-css">https://www.highcharts.com/docs/chart-design-and-style/style-by-css</a>
 *
 * <h3>Steps for styling a chart</h3>
 * <ol>
 *  <li>Create a theme file (for example <code>shared-styles.html</code>). The theme's dom-module must declare <code>theme-for=vaadin-chart</code>.</li>
 *  <li>Import <code>vaadin-chart-default-theme.html</code> and declare <code>include="vaadin-chart-default-theme"</code> on the theme module's style tag to customize Chart's default theme. If there are multiple theme modules <em>only one</em> of them should declare this <code>include</code>.</li>
 *  <li>Specify the desired CSS rules in the theme file.</li>
 *  <li>If multiple charts are present, each one can be specifically targeted using the host selector e.g <code>:host(.my-chart-class)</code>.</li>
 *  <li>Import the theme file.</li>
 * </ol>
 * <h3>Example: Two Charts with a Red Title but only one with a Blue Subtitle</h3>
 * <pre><code class="language-html">&lt;link rel="import" href="shared-styles.html"&gt;
 * ...
 * &lt;vaadin-chart title="Red Title" subtitle="Not Styled"&gt;
 *    &lt;vaadin-chart-series values="[19,12,9,24,5]"&gt;&lt;/vaadin-chart-series&gt;
 * &lt;/vaadin-chart&gt;
 *
 * &lt;vaadin-chart class="blue-subtitle" title="Red Title" subtitle="Blue Subtitle"&gt;
 *    &lt;vaadin-chart-series values="[19,12,9,24,5]"&gt;&lt;/vaadin-chart-series&gt;
 * &lt;/vaadin-chart&gt;
 * </code></pre>
 * shared-styles.html
 *
 * <pre><code class="language-html">&lt;link rel="import" href="../bower_components/vaadin-charts/theme/vaadin-chart-default-theme.html"&gt;
 *
 * &lt;dom-module id="css-style-example" theme-for="vaadin-chart"&gt;
 *     &lt;template&gt;
 *       &lt;style include="vaadin-chart-default-theme"&gt;
 *         .highcharts-title {
 *           fill: red;
 *           font-size: xx-large;
 *         }
 *
 *         :host(.blue-subtitle) .highcharts-subtitle {
 *           fill: blue;
 *         }
 *       &lt;/style&gt;
 *     &lt;/template&gt;
 * &lt;/dom-module&gt;
 * </code></pre>
 * <h3>RTL support</h3>
 * <code>vaadin-charts</code> as well as <a href="https://www.highcharts.com/">Highcharts</a> by itself are not adjusting the layout based on the <code>dir</code> attribute. In order to make <code>vaadin-charts</code> display RTL content properly additional JSON configuration should be used. Each chart should be updated based on the specific needs, but general recommendations are:
 *
 * <ol>
 *  <li>Set <code>reversed</code> to true for xAxis (<a href="https://api.highcharts.com/highcharts/xAxis.reversed">https://api.highcharts.com/highcharts/xAxis.reversed</a>).</li>
 *  <li>Set <code>useHTML</code> to true for text elements, i.e. <code>tooltip</code> (<a href="https://api.highcharts.com/highcharts/tooltip.useHTML">https://api.highcharts.com/highcharts/tooltip.useHTML</a>).</li>
 *  <li>Set <code>rtl</code> to true for <code>legend</code> (<a href="https://api.highcharts.com/highcharts/legend.rtl">https://api.highcharts.com/highcharts/legend.rtl</a>).</li>
 * </ol>
 * Using as a base the project created with in Quick Start and an <code>additionalOptions</code> in order to make RTL adjustments:
 *
 * <pre><code class="language-html">  &lt;vaadin-chart title="Û±- Ø¹Ù†ÙˆØ§Ù† Ù†Ù…ÙˆØ¯Ø§Ø±" subtitle="Û²- Ø¹Ù†ÙˆØ§Ù† Ù�Ø±Ø¹ÛŒ Ù†Ù…ÙˆØ¯Ø§Ø±"
 *     additional-options='{"title": {"useHTML": true}, "tooltip": {"useHTML": true}, "subtitle": {"useHTML": true},
 *     "legend": {"rtl": true}, "yAxis": [{"id": "Û´- Ù…Ù‚Ø§Ø¯ÛŒØ±", "title": {"text": "Û´- Ù…Ù‚Ø§Ø¯ÛŒØ±", "useHTML": true}}],
 *     "xAxis": {"reversed": true}}'&gt;
 *     &lt;vaadin-chart-series
 *           type= "column"
 *           title="Û³- Ø¹Ù†ÙˆØ§Ù† Ø±Ø¯ÛŒÙ�"
 *           unit="Û´- Ù…Ù‚Ø§Ø¯ÛŒØ±"
 *           values="[10,20,30]"&gt;
 *     &lt;/vaadin-chart-series&gt;
 *   &lt;/vaadin-chart&gt;
 * </code></pre>
 * <h3>Setting colors</h3>
 * Although charts can be styled as described above, there is a simpler way for setting colors. Colors can be set using CSS custom properties <code>--vaadin-charts-color-{n}</code> (where <code>n</code> goes from <code>0 - 9</code>).
 *
 * For example <code>--vaadin-charts-color-0</code> sets the color of the first series on a chart.
 *
 * <h3>Validating your License</h3>
 * When using Vaadin Charts in a development environment, you will see a pop-up that asks you to validate your license by signing in to vaadin.com.
 *
 * <strong>Mixins:</strong> ElementMixin, ThemableMixin, ElementMixin
 *
 * <h2>Example</h2>
 * <pre><code class="language-javascript">demo/index.html
 * </code></pre>
 */
@CustomElement(tagName = "vaadin-chart", external = true)
public class Chart extends HtmlComponent<ChartElement> implements Themable<ChartElement> {
    static {
        Window.WINDOW.<JsObject>cast().set("Highcharts", Highcharts.INSTANCE());
    }

    public Chart() {
    }

    public Chart(ChartSeries... components) {
        super(components);
    }

    // !wca! get additionalOptions: Options | undefined
    /**
     * Represents additional JSON configuration.
     */
    @Nullable
    public Options getAdditionalOptions() {
        return getElement().getAdditionalOptions();
    }

    // !wca! set additionalOptions: Options | undefined
    /**
     * Represents additional JSON configuration.
     */
    public void setAdditionalOptions(@Nullable Options value) {
        getElement().setAdditionalOptions(value);
    }

    // !wca! observe additionalOptions: Options | undefined

    // !wca! get categories: ChartCategories | undefined
    /**
     * If categories are present names are used instead of numbers for the category axis.
     * The format of categories can be an <code>Array</code> with a list of categories, such as <code>['2010', '2011', '2012']</code>
     * or a mapping <code>Object</code>, like <code>{0:'1',9:'Target (10)', 15: 'Max'}</code>.
     */
    @Nullable
    public Map<Integer, String> getCategories() {
        Array<Unknown> categories = JsObject.assign(Array.create(), getElement().getCategories());
        Map<Integer, String> result = new HashMap<>();
        categories.forEach(((value, key, parent) -> result.put(key, value.stringValue())));
        return result;
    }

    // !wca! set categories: ChartCategories | undefined
    /**
     * If categories are present names are used instead of numbers for the category axis.
     * The format of categories can be an <code>Array</code> with a list of categories, such as <code>['2010', '2011', '2012']</code>
     * or a mapping <code>Object</code>, like <code>{0:'1',9:'Target (10)', 15: 'Max'}</code>.
     */
    public void setCategories(@Nullable Map<Integer, String> value) {
        if (value == null) {
            getElement().setCategories(null);
        } else {
            Array<Unknown> categories = Array.create();
            for (Map.Entry<Integer, String> integerStringEntry : value.entrySet()) {
                categories.set(integerStringEntry.getKey(), Unknown.of(integerStringEntry.getValue()));
            }
            getElement().setCategories(categories.cast());
        }
    }

    // !wca! observe categories: ChartCategories | undefined

    // !wca! get categoryMax: number
    /**
     * Category-axis maximum value. Defaults to <code>undefined</code>.
     */
    public double getCategoryMax() {
        return getElement().getCategoryMax();
    }

    // !wca! set categoryMax: number
    /**
     * Category-axis maximum value. Defaults to <code>undefined</code>.
     */
    public void setCategoryMax(double value) {
        getElement().setCategoryMax(value);
    }

    // !wca! observe categoryMax: number

    // !wca! get categoryMin: number
    /**
     * Category-axis minimum value. Defaults to <code>undefined</code>.
     */
    public double getCategoryMin() {
        return getElement().getCategoryMin();
    }

    // !wca! set categoryMin: number
    /**
     * Category-axis minimum value. Defaults to <code>undefined</code>.
     */
    public void setCategoryMin(double value) {
        getElement().setCategoryMin(value);
    }

    // !wca! observe categoryMin: number

    // !wca! get categoryPosition: ChartCategoryPosition | undefined
    /**
     * The position of the category axis. Acceptable values are <code>left</code>, <code>right</code>, <code>top</code> and <code>bottom</code>
     * except for bar charts which only accept <code>left</code> and <code>right</code>.
     * With the default value, charts appear as though they have <code>category-position="bottom"</code>
     * except for bar charts that appear as though they have <code>category-position="left"</code>.
     *
     * Defaults to <code>undefined</code>
     */
    @Nullable
    public CategoryPosition getCategoryPosition() {
        return LowerCase.parse(CategoryPosition.class, getElement().getCategoryPosition());
    }

    // !wca! set categoryPosition: ChartCategoryPosition | undefined
    /**
     * The position of the category axis. Acceptable values are <code>left</code>, <code>right</code>, <code>top</code> and <code>bottom</code>
     * except for bar charts which only accept <code>left</code> and <code>right</code>.
     * With the default value, charts appear as though they have <code>category-position="bottom"</code>
     * except for bar charts that appear as though they have <code>category-position="left"</code>.
     *
     * Defaults to <code>undefined</code>
     */
    public void setCategoryPosition(@Nullable CategoryPosition value) {
        getElement().setCategoryPosition(LowerCase.of(value));
    }

    // !wca! observe categoryPosition: ChartCategoryPosition | undefined

    // !wca! get chart3d: boolean
    /**
     * Specifies whether to show chart in 3 or in 2 dimensions.
     * Some display angles are added by default to the "chart.options3d" (<code>{alpha: 15, beta: 15, depth: 50}</code>).
     * 3D display options can be modified via <code>additionalOptions</code>.
     * The thickness of a Pie chart can be set on <code>additionalOptions</code> through <code>plotOptions.pie.depth</code>.
     * 3D is supported by Bar, Column, Pie and Scatter3D charts.
     * More info available at <a href="https://www.highcharts.com/docs/chart-concepts/3d-charts">Highcharts</a>.
     */
    public boolean isChart3d() {
        return getElement().isChart3d();
    }

    // !wca! set chart3d: boolean
    /**
     * Specifies whether to show chart in 3 or in 2 dimensions.
     * Some display angles are added by default to the "chart.options3d" (<code>{alpha: 15, beta: 15, depth: 50}</code>).
     * 3D display options can be modified via <code>additionalOptions</code>.
     * The thickness of a Pie chart can be set on <code>additionalOptions</code> through <code>plotOptions.pie.depth</code>.
     * 3D is supported by Bar, Column, Pie and Scatter3D charts.
     * More info available at <a href="https://www.highcharts.com/docs/chart-concepts/3d-charts">Highcharts</a>.
     */
    public void setChart3d(boolean value) {
        getElement().setChart3d(value);
    }

    // !wca! observe chart3d: boolean

    // !wca! get configuration: !Chart | undefined
    /**
     * Configuration object that exposes the JS Api to configure the chart.
     *
     * Most important methods are:
     * - <code>addSeries (Object options, [Boolean redraw], [Mixed animation])</code>
     * - <code>addAxis (Object options, [Boolean isX], [Boolean redraw], [Mixed animation])</code>
     * - <code>setTitle (Object title, object subtitle, Boolean redraw)</code>
     *
     * Most important properties are:
     * - <code>configuration.series</code>: An array of the chart's series. Detailed API for Series object is
     *  available in <a href="http://api.highcharts.com/class-reference/Highcharts.Series">API Site</a>
     * - <code>configuration.xAxis</code>: An array of the chart's x axes. Detailed API for Axis object is
     *  available in <a href="http://api.highcharts.com/class-reference/Highcharts.Axis">API Site</a>
     * - <code>configuration.yAxis</code>: An array of the chart's y axes. Detailed API for Axis object is
     *  available in <a href="http://api.highcharts.com/class-reference/Highcharts.Axis">API Site</a>
     * - <code>configuration.title</code>: The chart title.
     *
     * For detailed documentation of available API check the <a href="http://api.highcharts.com/class-reference/classes.list">API site</a>
     */
    @Nullable
    public js.lang.external.highcharts.Chart getConfiguration() {
        return getElement().getConfiguration();
    }

    // !wca! set configuration: !Chart | undefined

    // !wca! observe configuration: !Chart | undefined

    // !wca! get emptyText: string
    /**
     * Specifies the message displayed on a chart without displayable data.
     */
    public String getEmptyText() {
        return getElement().getEmptyText();
    }

    // !wca! set emptyText: string
    /**
     * Specifies the message displayed on a chart without displayable data.
     */
    public void setEmptyText(String value) {
        getElement().setEmptyText(value);
    }

    // !wca! observe emptyText: string

    // !wca! get noLegend: boolean
    /**
     * Specifies whether to hide legend or show.
     * Legend configuration can be set up via additionalOptions property
     */
    public boolean isNoLegend() {
        return getElement().isNoLegend();
    }

    // !wca! set noLegend: boolean
    /**
     * Specifies whether to hide legend or show.
     * Legend configuration can be set up via additionalOptions property
     */
    public void setNoLegend(boolean value) {
        getElement().setNoLegend(value);
    }

    // !wca! observe noLegend: boolean

    // !wca! get options: ?

    // !wca! observe options: ?

    // !wca! get polar: boolean
    /**
     * When present, cartesian charts like line, spline, area and column are transformed
     * into the polar coordinate system.
     */
    public boolean isPolar() {
        return getElement().isPolar();
    }

    // !wca! set polar: boolean
    /**
     * When present, cartesian charts like line, spline, area and column are transformed
     * into the polar coordinate system.
     */
    public void setPolar(boolean value) {
        getElement().setPolar(value);
    }

    // !wca! observe polar: boolean

    // !wca! get stacking: ChartStacking | undefined
    /**
     * Specifies how series are stacked on top of each other.
     * Possible values are null, "normal" or "percent".
     * If "stack" property is not defined on the vaadin-chart-series elements, then series will be put into
     * the default stack.
     */
    @Nullable
    public Stacking getStacking() {
        return LowerCase.parse(Stacking.class, getElement().getStacking());
    }

    // !wca! set stacking: ChartStacking | undefined
    /**
     * Specifies how series are stacked on top of each other.
     * Possible values are null, "normal" or "percent".
     * If "stack" property is not defined on the vaadin-chart-series elements, then series will be put into
     * the default stack.
     */
    public void setStacking(@Nullable Stacking value) {
        getElement().setStacking(LowerCase.of(value));
    }

    // !wca! observe stacking: ChartStacking | undefined

    // !wca! get subtitle: string | undefined
    /**
     * Represents the subtitle of the chart.
     */
    @Nullable
    public String getSubtitle() {
        return getElement().getSubtitle();
    }

    // !wca! set subtitle: string | undefined
    /**
     * Represents the subtitle of the chart.
     */
    public void setSubtitle(@Nullable String value) {
        getElement().setSubtitle(value);
    }

    // !wca! observe subtitle: string | undefined

    // !wca! get theme: string | null | undefined

    // !wca! observe theme: string | null | undefined

    // !wca! get timeline: boolean
    /**
     * Specifies whether the chart is a normal chart or a timeline chart.
     */
    public boolean isTimeline() {
        return getElement().isTimeline();
    }

    // !wca! set timeline: boolean
    /**
     * Specifies whether the chart is a normal chart or a timeline chart.
     */
    public void setTimeline(boolean value) {
        getElement().setTimeline(value);
    }

    // !wca! observe timeline: boolean

    // !wca! get title: string
    /**
     * Represents the title of the chart.
     */
    public String getTitle() {
        return getElement().getTitle();
    }

    // !wca! set title: string
    /**
     * Represents the title of the chart.
     */
    public void setTitle(String value) {
        getElement().setTitle(value);
    }

    // !wca! observe title: string

    // !wca! get tooltip: boolean
    /**
     * Whether or not to show tooltip when hovering data points.
     */
    public boolean isTooltip() {
        return getElement().isTooltip();
    }

    // !wca! set tooltip: boolean
    /**
     * Whether or not to show tooltip when hovering data points.
     */
    public void setTooltip(boolean value) {
        getElement().setTooltip(value);
    }

    // !wca! observe tooltip: boolean

    // !wca! get type: string
    /**
     * Sets the default series type of the chart.
     * Note that <code>'bar'</code>, <code>'gauge'</code> and <code>'solidgauge'</code> should be set as default series type.
     */
    public String getType() {
        return getElement().getType();
    }

    // !wca! set type: string
    /**
     * Sets the default series type of the chart.
     * Note that <code>'bar'</code>, <code>'gauge'</code> and <code>'solidgauge'</code> should be set as default series type.
     */
    public void setType(String value) {
        getElement().setType(value);
    }

    // !wca! observe type: string

}
