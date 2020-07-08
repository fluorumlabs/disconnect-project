package js.lang.external.vaadin.charts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Unknown;
import js.lang.external.highcharts.Chart;
import js.lang.external.highcharts.Options;
import js.web.dom.HTMLElement;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

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
@NpmPackage(name = "@vaadin/vaadin-charts", version = "^7.0.0-alpha8")
@Import(module = "@vaadin/vaadin-charts/vaadin-chart.js")
public interface ChartElement extends HTMLElement {

    // !wca! get additionalOptions: Options | undefined
    /**
     * Represents additional JSON configuration.
     */
    @JSProperty("additionalOptions")
    @Nullable
    Options getAdditionalOptions();

    // !wca! set additionalOptions: Options | undefined
    /**
     * Represents additional JSON configuration.
     */
    @JSProperty("additionalOptions")
    void setAdditionalOptions(@Nullable Options value);

    // !wca! get categories: ChartCategories | undefined
    /**
     * If categories are present names are used instead of numbers for the category axis.
     * The format of categories can be an <code>Array</code> with a list of categories, such as <code>['2010', '2011', '2012']</code>
     * or a mapping <code>Object</code>, like <code>{0:'1',9:'Target (10)', 15: 'Max'}</code>.
     */
    @JSProperty("categories")
    @Nullable
    Unknown getCategories();

    // !wca! set categories: ChartCategories | undefined
    /**
     * If categories are present names are used instead of numbers for the category axis.
     * The format of categories can be an <code>Array</code> with a list of categories, such as <code>['2010', '2011', '2012']</code>
     * or a mapping <code>Object</code>, like <code>{0:'1',9:'Target (10)', 15: 'Max'}</code>.
     */
    @JSProperty("categories")
    void setCategories(@Nullable Unknown value);

    // !wca! get categoryMax: number
    /**
     * Category-axis maximum value. Defaults to <code>undefined</code>.
     */
    @JSProperty("categoryMax")
    double getCategoryMax();

    // !wca! set categoryMax: number
    /**
     * Category-axis maximum value. Defaults to <code>undefined</code>.
     */
    @JSProperty("categoryMax")
    void setCategoryMax(double value);

    // !wca! get categoryMin: number
    /**
     * Category-axis minimum value. Defaults to <code>undefined</code>.
     */
    @JSProperty("categoryMin")
    double getCategoryMin();

    // !wca! set categoryMin: number
    /**
     * Category-axis minimum value. Defaults to <code>undefined</code>.
     */
    @JSProperty("categoryMin")
    void setCategoryMin(double value);

    // !wca! get categoryPosition: ChartCategoryPosition | undefined
    /**
     * The position of the category axis. Acceptable values are <code>left</code>, <code>right</code>, <code>top</code> and <code>bottom</code>
     * except for bar charts which only accept <code>left</code> and <code>right</code>.
     * With the default value, charts appear as though they have <code>category-position="bottom"</code>
     * except for bar charts that appear as though they have <code>category-position="left"</code>.
     *
     * Defaults to <code>undefined</code>
     */
    @JSProperty("categoryPosition")
    @Nullable
    String getCategoryPosition();

    // !wca! set categoryPosition: ChartCategoryPosition | undefined
    /**
     * The position of the category axis. Acceptable values are <code>left</code>, <code>right</code>, <code>top</code> and <code>bottom</code>
     * except for bar charts which only accept <code>left</code> and <code>right</code>.
     * With the default value, charts appear as though they have <code>category-position="bottom"</code>
     * except for bar charts that appear as though they have <code>category-position="left"</code>.
     *
     * Defaults to <code>undefined</code>
     */
    @JSProperty("categoryPosition")
    void setCategoryPosition(@Nullable String value);

    // !wca! get chart3d: boolean
    /**
     * Specifies whether to show chart in 3 or in 2 dimensions.
     * Some display angles are added by default to the "chart.options3d" (<code>{alpha: 15, beta: 15, depth: 50}</code>).
     * 3D display options can be modified via <code>additionalOptions</code>.
     * The thickness of a Pie chart can be set on <code>additionalOptions</code> through <code>plotOptions.pie.depth</code>.
     * 3D is supported by Bar, Column, Pie and Scatter3D charts.
     * More info available at <a href="https://www.highcharts.com/docs/chart-concepts/3d-charts">Highcharts</a>.
     */
    @JSProperty("chart3d")
    boolean isChart3d();

    // !wca! set chart3d: boolean
    /**
     * Specifies whether to show chart in 3 or in 2 dimensions.
     * Some display angles are added by default to the "chart.options3d" (<code>{alpha: 15, beta: 15, depth: 50}</code>).
     * 3D display options can be modified via <code>additionalOptions</code>.
     * The thickness of a Pie chart can be set on <code>additionalOptions</code> through <code>plotOptions.pie.depth</code>.
     * 3D is supported by Bar, Column, Pie and Scatter3D charts.
     * More info available at <a href="https://www.highcharts.com/docs/chart-concepts/3d-charts">Highcharts</a>.
     */
    @JSProperty("chart3d")
    void setChart3d(boolean value);

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
    @JSProperty("configuration")
    @Nullable
    Chart getConfiguration();

    // !wca! set configuration: !Chart | undefined

    // !wca! get emptyText: string
    /**
     * Specifies the message displayed on a chart without displayable data.
     */
    @JSProperty("emptyText")
    String getEmptyText();

    // !wca! set emptyText: string
    /**
     * Specifies the message displayed on a chart without displayable data.
     */
    @JSProperty("emptyText")
    void setEmptyText(String value);

    // !wca! get noLegend: boolean
    /**
     * Specifies whether to hide legend or show.
     * Legend configuration can be set up via additionalOptions property
     */
    @JSProperty("noLegend")
    boolean isNoLegend();

    // !wca! set noLegend: boolean
    /**
     * Specifies whether to hide legend or show.
     * Legend configuration can be set up via additionalOptions property
     */
    @JSProperty("noLegend")
    void setNoLegend(boolean value);

    // !wca! get options: ?

    // !wca! get polar: boolean
    /**
     * When present, cartesian charts like line, spline, area and column are transformed
     * into the polar coordinate system.
     */
    @JSProperty("polar")
    boolean isPolar();

    // !wca! set polar: boolean
    /**
     * When present, cartesian charts like line, spline, area and column are transformed
     * into the polar coordinate system.
     */
    @JSProperty("polar")
    void setPolar(boolean value);

    // !wca! get stacking: ChartStacking | undefined
    /**
     * Specifies how series are stacked on top of each other.
     * Possible values are null, "normal" or "percent".
     * If "stack" property is not defined on the vaadin-chart-series elements, then series will be put into
     * the default stack.
     */
    @JSProperty("stacking")
    @Nullable
    String getStacking();

    // !wca! set stacking: ChartStacking | undefined
    /**
     * Specifies how series are stacked on top of each other.
     * Possible values are null, "normal" or "percent".
     * If "stack" property is not defined on the vaadin-chart-series elements, then series will be put into
     * the default stack.
     */
    @JSProperty("stacking")
    void setStacking(@Nullable String value);

    // !wca! get subtitle: string | undefined
    /**
     * Represents the subtitle of the chart.
     */
    @JSProperty("subtitle")
    @Nullable
    String getSubtitle();

    // !wca! set subtitle: string | undefined
    /**
     * Represents the subtitle of the chart.
     */
    @JSProperty("subtitle")
    void setSubtitle(@Nullable String value);

    // !wca! get theme: string | null | undefined

    // !wca! get timeline: boolean
    /**
     * Specifies whether the chart is a normal chart or a timeline chart.
     */
    @JSProperty("timeline")
    boolean isTimeline();

    // !wca! set timeline: boolean
    /**
     * Specifies whether the chart is a normal chart or a timeline chart.
     */
    @JSProperty("timeline")
    void setTimeline(boolean value);

    // !wca! get title: string
    /**
     * Represents the title of the chart.
     */
    @JSProperty("title")
    String getTitle();

    // !wca! set title: string
    /**
     * Represents the title of the chart.
     */
    @JSProperty("title")
    void setTitle(String value);

    // !wca! get tooltip: boolean
    /**
     * Whether or not to show tooltip when hovering data points.
     */
    @JSProperty("tooltip")
    boolean isTooltip();

    // !wca! set tooltip: boolean
    /**
     * Whether or not to show tooltip when hovering data points.
     */
    @JSProperty("tooltip")
    void setTooltip(boolean value);

    // !wca! get type: string
    /**
     * Sets the default series type of the chart.
     * Note that <code>'bar'</code>, <code>'gauge'</code> and <code>'solidgauge'</code> should be set as default series type.
     */
    @JSProperty("type")
    String getType();

    // !wca! set type: string
    /**
     * Sets the default series type of the chart.
     * Note that <code>'bar'</code>, <code>'gauge'</code> and <code>'solidgauge'</code> should be set as default series type.
     */
    @JSProperty("type")
    void setType(String value);
}
