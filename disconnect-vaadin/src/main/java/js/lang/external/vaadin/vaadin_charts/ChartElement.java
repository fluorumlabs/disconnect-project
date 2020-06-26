package js.lang.external.vaadin.vaadin_charts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import js.lang.Unknown;
import js.lang.external.highcharts.Chart;
import js.lang.external.highcharts.Options;
import js.lang.external.polymer.PolymerElement;
import js.lang.external.vaadin.vaadin_element_mixin.ElementMixin;
import js.lang.external.vaadin.vaadin_themable_mixin.ThemableMixin;
import org.teavm.jso.JSIndexer;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * <code>&lt;vaadin-chart&gt;</code> is a Web Component for creating high quality charts.
 *
 * <h3>Basic use</h3>
 * There are two ways of configuring your <code>&lt;vaadin-chart&gt;</code> element: <strong>HTML API</strong>, <strong>JS API</strong> and <strong>JSON API</strong>.
 * Note that you can make use of all APIs in your element.
 *
 * <h4>Configuring your chart using HTML API</h4>
 * <code>vaadin-chart</code> has a set of attributes to make it easier for you to customize your chart.
 *
 * <pre><code class="language-html"> &lt;vaadin-chart title=&quot;The chart title&quot; subtitle=&quot;The chart subtitle&quot;&gt;
 *    &lt;vaadin-chart-series
 *          type=&quot;column&quot;
 *          title=&quot;The series title&quot;
 *          values=&quot;[10,20,30]&quot;&gt;
 *    &lt;/vaadin-chart-series&gt;
 *  &lt;/vaadin-chart&gt;
 * </code></pre>
 * <blockquote>
 * Note that while you can set type for each series individually, for some types, such as <code>'bar'</code>, <code>'gauge'</code> and <code>'solidgauge'</code>, you
 * have to set it as the default series type on <code>&lt;vaadin-chart&gt;</code> in order to work properly.
 *
 * </blockquote>
 * <h4>Configuring your chart using JS API</h4>
 * <ol>
 * <li>Set an id for the <code>&lt;vaadin-chart&gt;</code> in the template</li>
 * </ol>
 * <pre><code class="language-html">    &lt;vaadin-chart id=&quot;mychart&quot;&gt;&lt;/vaadin-chart&gt;
 * </code></pre>
 * <ol>
 * <li>Add a function that uses <code>configuration</code> property (JS Api) to set chart title, categories and data</li>
 * </ol>
 * <pre><code class="language-js">initChartWithJSApi() {
 *     Polymer.RenderStatus.beforeNextRender(this, () =&gt; {
 *        const configuration = this.$.mychart.configuration;
 *        configuration.setTitle({ text: 'The chart title' });
 *        // By default there is one x axis, it is referenced by configuration.xAxis[0].
 *        configuration.xAxis[0].setCategories(['Jan', 'Feb', 'Mar', 'Apr', 'May', 'Jun', 'Jul', 'Aug', 'Sep', 'Oct', 'Nov', 'Dec']);
 *        configuration.addSeries({
 *            type: 'column',
 *            data: [29.9, 71.5, 106.4, 129.2, 144.0, 176.0, 135.6, 148.5, 216.4, 194.1, 95.6, 54.4]
 *        });
 *     });
 * }
 * </code></pre>
 * <ol>
 * <li>Call that function from connectedCallback (when the element is added to a document)</li>
 * </ol>
 * <pre><code class="language-js">connectedCallback() {
 *     super.connectedCallback();
 *     this.initChartWithJSApi();
 * }
 * </code></pre>
 * <h4>Configuring your chart using JS JSON API</h4>
 * JS JSON API is a simple alternative to the JS API.
 *
 * <ol>
 * <li>Set an id for the <code>&lt;vaadin-chart&gt;</code> in the template</li>
 * </ol>
 * <pre><code class="language-html">    &lt;vaadin-chart id=&quot;mychart&quot;&gt;&lt;/vaadin-chart&gt;
 * </code></pre>
 * <ol>
 * <li>Add a function that uses <code>update</code> method (JS JSON Api) to set chart title, categories and data</li>
 * </ol>
 * <pre><code class="language-js">initChartWithJSJSONApi() {
 *     this.$.mychart.update({
 *       title: {
 *         text: 'The chart title'
 *       },
 *       subtitle: {
 *         text: 'Subtitle'
 *       },
 *       xAxis: {
 *         categories: ['Jan', 'Feb', 'Mar', 'Apr', 'May', 'Jun', 'Jul', 'Aug', 'Sep', 'Oct', 'Nov', 'Dec']
 *       },
 *       series: [{
 *         type: 'column',
 *         data: [29.9, 71.5, 106.4, 129.2, 144.0, 176.0, 135.6, 148.5, 216.4, 194.1, 95.6, 54.4]
 *       }]
 *     });
 * }
 * </code></pre>
 * <ol>
 * <li>Call that function from connectedCallback (when the element is added to a document)</li>
 * </ol>
 * <pre><code class="language-js">connectedCallback() {
 *     super.connectedCallback();
 *     this.initChartWithJSJSONApi();
 * }
 * </code></pre>
 * It should be noted that chart style customization cannot be done via the JS or JSON API.
 * Styling properties in the JSON configuration will be ignored. The following section discusses chart styling.
 *
 * <h3>CSS Styling</h3>
 * Chart appearance is primarily controlled by CSS style rules.
 * A comprehensive list of the supported style classes can be found at
 * <a href="https://www.highcharts.com/docs/chart-design-and-style/style-by-css">https://www.highcharts.com/docs/chart-design-and-style/style-by-css</a>
 *
 * <h3>Steps for styling a chart</h3>
 * <ol>
 * <li>Create a theme file (for example <code>shared-styles.html</code>). The theme's dom-module must declare <code>theme-for=vaadin-chart</code>.</li>
 * <li>Import <code>vaadin-chart-default-theme.html</code> and declare <code>include=&quot;vaadin-chart-default-theme&quot;</code>
 * on the theme module's style tag to customize Chart's default theme. If there are multiple theme
 * modules <em>only one</em> of them should declare this <code>include</code>.</li>
 * <li>Specify the desired CSS rules in the theme file.</li>
 * <li>If multiple charts are present, each one can be specifically targeted using the host selector e.g <code>:host(.my-chart-class)</code>.</li>
 * <li>Import the theme file.</li>
 * </ol>
 * <h3>Example: Two Charts with a Red Title but only one with a Blue Subtitle</h3>
 * <pre><code class="language-html">&lt;link rel=&quot;import&quot; href=&quot;shared-styles.html&quot;&gt;
 * ...
 * &lt;vaadin-chart title=&quot;Red Title&quot; subtitle=&quot;Not Styled&quot;&gt;
 *   &lt;vaadin-chart-series values=&quot;[19,12,9,24,5]&quot;&gt;&lt;/vaadin-chart-series&gt;
 * &lt;/vaadin-chart&gt;
 *
 * &lt;vaadin-chart class=&quot;blue-subtitle&quot; title=&quot;Red Title&quot; subtitle=&quot;Blue Subtitle&quot;&gt;
 *   &lt;vaadin-chart-series values=&quot;[19,12,9,24,5]&quot;&gt;&lt;/vaadin-chart-series&gt;
 * &lt;/vaadin-chart&gt;
 * </code></pre>
 * shared-styles.html
 *
 * <pre><code class="language-html">&lt;link rel=&quot;import&quot; href=&quot;../bower_components/vaadin-charts/theme/vaadin-chart-default-theme.html&quot;&gt;
 *
 * &lt;dom-module id=&quot;css-style-example&quot; theme-for=&quot;vaadin-chart&quot;&gt;
 *    &lt;template&gt;
 *      &lt;style include=&quot;vaadin-chart-default-theme&quot;&gt;
 *        .highcharts-title {
 *          fill: red;
 *          font-size: xx-large;
 *        }
 *
 *        :host(.blue-subtitle) .highcharts-subtitle {
 *          fill: blue;
 *        }
 *      &lt;/style&gt;
 *    &lt;/template&gt;
 * &lt;/dom-module&gt;
 * </code></pre>
 * <h3>RTL support</h3>
 * <code>vaadin-charts</code> as well as <a href="https://www.highcharts.com/">Highcharts</a> by itself are not adjusting the layout
 * based on the <code>dir</code> attribute. In order to make <code>vaadin-charts</code> display RTL content properly additional
 * JSON configuration should be used.
 * Each chart should be updated based on the specific needs, but general recommendations are:
 *
 * <ol>
 * <li>Set <code>reversed</code> to true for xAxis (<a href="https://api.highcharts.com/highcharts/xAxis.reversed">https://api.highcharts.com/highcharts/xAxis.reversed</a>).</li>
 * <li>Set <code>useHTML</code> to true for text elements, i.e. <code>tooltip</code> (<a href="https://api.highcharts.com/highcharts/tooltip.useHTML">https://api.highcharts.com/highcharts/tooltip.useHTML</a>).</li>
 * <li>Set <code>rtl</code> to true for <code>legend</code> (<a href="https://api.highcharts.com/highcharts/legend.rtl">https://api.highcharts.com/highcharts/legend.rtl</a>).</li>
 * </ol>
 * Using as a base the project created with in Quick Start and an <code>additionalOptions</code> in order to make RTL adjustments:
 *
 * <pre><code class="language-html"> &lt;vaadin-chart title=&quot;۱- عنوان نمودار&quot; subtitle=&quot;۲- عنوان فرعی نمودار&quot;
 *    additional-options='{&quot;title&quot;: {&quot;useHTML&quot;: true}, &quot;tooltip&quot;: {&quot;useHTML&quot;: true}, &quot;subtitle&quot;: {&quot;useHTML&quot;: true},
 *    &quot;legend&quot;: {&quot;rtl&quot;: true}, &quot;yAxis&quot;: [{&quot;id&quot;: &quot;۴- مقادیر&quot;, &quot;title&quot;: {&quot;text&quot;: &quot;۴- مقادیر&quot;, &quot;useHTML&quot;: true}}],
 *    &quot;xAxis&quot;: {&quot;reversed&quot;: true}}'&gt;
 *    &lt;vaadin-chart-series
 *          type= &quot;column&quot;
 *          title=&quot;۳- عنوان ردیف&quot;
 *          unit=&quot;۴- مقادیر&quot;
 *          values=&quot;[10,20,30]&quot;&gt;
 *    &lt;/vaadin-chart-series&gt;
 *  &lt;/vaadin-chart&gt;
 * </code></pre>
 * <h3>Setting colors</h3>
 * Although charts can be styled as described above, there is a simpler way for setting colors.
 * Colors can be set using CSS custom properties <code>--vaadin-charts-color-{n}</code> (where <code>n</code> goes from <code>0 - 9</code>).
 *
 * For example <code>--vaadin-charts-color-0</code> sets the color of the first series on a chart.
 *
 * <h3>Validating your License</h3>
 * When using Vaadin Charts in a development environment, you will see a pop-up that asks you
 * to validate your license by signing in to vaadin.com.
 *
 */
@NpmPackage(
    name = "@vaadin/vaadin-charts",
    version = "^7.0.0-alpha6"
)
@Import(
    symbols = {"ChartElement as ChartElement_ChartElement"},
    module = "@vaadin/vaadin-charts/vaadin-chart.js"
)
@Import(
    module = "@vaadin/vaadin-charts/vaadin-chart.js"
)
public interface ChartElement extends PolymerElement, ThemableMixin, ElementMixin {
  @JSProperty("options")
  Options getOptions();

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
  @JSProperty("configuration")
  @Nullable
  Chart getConfiguration();

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
  @JSProperty("configuration")
  void setConfiguration(@Nullable Chart value);

  /**
   * If categories are present names are used instead of numbers for the category axis.
   * The format of categories can be an <code>Array</code> with a list of categories, such as <code>['2010', '2011', '2012']</code>
   * or a mapping <code>Object</code>, like <code>{0:'1',9:'Target (10)', 15: 'Max'}</code>.
   *
   */
  @JSProperty("categories")
  @Nullable
  Unknown /* ChartCategories | null | undefined */ getCategories();

  /**
   * If categories are present names are used instead of numbers for the category axis.
   * The format of categories can be an <code>Array</code> with a list of categories, such as <code>['2010', '2011', '2012']</code>
   * or a mapping <code>Object</code>, like <code>{0:'1',9:'Target (10)', 15: 'Max'}</code>.
   *
   */
  @JSProperty("categories")
  void setCategories(@Nullable Categories value);

  /**
   * If categories are present names are used instead of numbers for the category axis.
   * The format of categories can be an <code>Array</code> with a list of categories, such as <code>['2010', '2011', '2012']</code>
   * or a mapping <code>Object</code>, like <code>{0:'1',9:'Target (10)', 15: 'Max'}</code>.
   *
   */
  @JSProperty("categories")
  void setCategories(String[] value);

  /**
   * Category-axis maximum value. Defaults to <code>undefined</code>.
   *
   */
  @JSProperty("categoryMax")
  double getCategoryMax();

  /**
   * Category-axis maximum value. Defaults to <code>undefined</code>.
   *
   */
  @JSProperty("categoryMax")
  void setCategoryMax(double value);

  /**
   * Category-axis minimum value. Defaults to <code>undefined</code>.
   *
   */
  @JSProperty("categoryMin")
  double getCategoryMin();

  /**
   * Category-axis minimum value. Defaults to <code>undefined</code>.
   *
   */
  @JSProperty("categoryMin")
  void setCategoryMin(double value);

  /**
   * The position of the category axis. Acceptable values are <code>left</code>, <code>right</code>, <code>top</code> and <code>bottom</code>
   * except for bar charts which only accept <code>left</code> and <code>right</code>.
   * With the default value, charts appear as though they have <code>category-position=&quot;bottom&quot;</code>
   * except for bar charts that appear as though they have <code>category-position=&quot;left&quot;</code>.
   *
   * Defaults to <code>undefined</code>
   *
   */
  @JSProperty("categoryPosition")
  @Nullable
  ChartCategoryPosition getCategoryPosition();

  /**
   * The position of the category axis. Acceptable values are <code>left</code>, <code>right</code>, <code>top</code> and <code>bottom</code>
   * except for bar charts which only accept <code>left</code> and <code>right</code>.
   * With the default value, charts appear as though they have <code>category-position=&quot;bottom&quot;</code>
   * except for bar charts that appear as though they have <code>category-position=&quot;left&quot;</code>.
   *
   * Defaults to <code>undefined</code>
   *
   */
  @JSProperty("categoryPosition")
  void setCategoryPosition(@Nullable ChartCategoryPosition value);

  /**
   * Specifies whether to hide legend or show.
   * Legend configuration can be set up via additionalOptions property
   *
   */
  @JSProperty("noLegend")
  boolean getNoLegend();

  /**
   * Specifies whether to hide legend or show.
   * Legend configuration can be set up via additionalOptions property
   *
   */
  @JSProperty("noLegend")
  void setNoLegend(boolean value);

  /**
   * Specifies how series are stacked on top of each other.
   * Possible values are null, &quot;normal&quot; or &quot;percent&quot;.
   * If &quot;stack&quot; property is not defined on the vaadin-chart-series elements, then series will be put into
   * the default stack.
   *
   */
  @JSProperty("stacking")
  @Nullable
  ChartStacking getStacking();

  /**
   * Specifies how series are stacked on top of each other.
   * Possible values are null, &quot;normal&quot; or &quot;percent&quot;.
   * If &quot;stack&quot; property is not defined on the vaadin-chart-series elements, then series will be put into
   * the default stack.
   *
   */
  @JSProperty("stacking")
  void setStacking(@Nullable ChartStacking value);

  /**
   * Specifies whether the chart is a normal chart or a timeline chart.
   *
   */
  @JSProperty("timeline")
  boolean getTimeline();

  /**
   * Specifies whether the chart is a normal chart or a timeline chart.
   *
   */
  @JSProperty("timeline")
  void setTimeline(boolean value);

  /**
   * Represents the title of the chart.
   *
   */
  @JSProperty("title")
  String getTitle();

  /**
   * Represents the title of the chart.
   *
   */
  @JSProperty("title")
  void setTitle(String title);

  /**
   * Whether or not to show tooltip when hovering data points.
   *
   */
  @JSProperty("tooltip")
  boolean getTooltip();

  /**
   * Whether or not to show tooltip when hovering data points.
   *
   */
  @JSProperty("tooltip")
  void setTooltip(boolean value);

  /**
   * Represents the subtitle of the chart.
   *
   */
  @JSProperty("subtitle")
  @Nullable
  String getSubtitle();

  /**
   * Represents the subtitle of the chart.
   *
   */
  @JSProperty("subtitle")
  void setSubtitle(@Nullable String value);

  /**
   * Specifies whether to show chart in 3 or in 2 dimensions.
   * Some display angles are added by default to the &quot;chart.options3d&quot; (<code>{alpha: 15, beta: 15, depth: 50}</code>).
   * 3D display options can be modified via <code>additionalOptions</code>.
   * The thickness of a Pie chart can be set on <code>additionalOptions</code> through <code>plotOptions.pie.depth</code>.
   * 3D is supported by Bar, Column, Pie and Scatter3D charts.
   * More info available at <a href="https://www.highcharts.com/docs/chart-concepts/3d-charts">Highcharts</a>.
   *
   */
  @JSProperty("chart3d")
  boolean getChart3d();

  /**
   * Specifies whether to show chart in 3 or in 2 dimensions.
   * Some display angles are added by default to the &quot;chart.options3d&quot; (<code>{alpha: 15, beta: 15, depth: 50}</code>).
   * 3D display options can be modified via <code>additionalOptions</code>.
   * The thickness of a Pie chart can be set on <code>additionalOptions</code> through <code>plotOptions.pie.depth</code>.
   * 3D is supported by Bar, Column, Pie and Scatter3D charts.
   * More info available at <a href="https://www.highcharts.com/docs/chart-concepts/3d-charts">Highcharts</a>.
   *
   */
  @JSProperty("chart3d")
  void setChart3d(boolean value);

  /**
   * Specifies the message displayed on a chart without displayable data.
   *
   */
  @JSProperty("emptyText")
  String getEmptyText();

  /**
   * Specifies the message displayed on a chart without displayable data.
   *
   */
  @JSProperty("emptyText")
  void setEmptyText(String value);

  /**
   * Represents additional JSON configuration.
   *
   */
  @JSProperty("additionalOptions")
  @Nullable
  Options getAdditionalOptions();

  /**
   * Represents additional JSON configuration.
   *
   */
  @JSProperty("additionalOptions")
  void setAdditionalOptions(@Nullable Options value);

  /**
   * When present, cartesian charts like line, spline, area and column are transformed
   * into the polar coordinate system.
   *
   */
  @JSProperty("polar")
  boolean getPolar();

  /**
   * When present, cartesian charts like line, spline, area and column are transformed
   * into the polar coordinate system.
   *
   */
  @JSProperty("polar")
  void setPolar(boolean value);

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
   * @param resetConfiguration Optional boolean that should be set to true if no other chart configuration was set before or
   * if existing configuration should be discarded.</li>
   * </ul>
   */
  void update(Options jsonConfiguration, boolean resetConfiguration);

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
  void update(Options jsonConfiguration);

  interface Categories extends Any {
    @JSIndexer
    String get(int key);

    @JSIndexer
    void set(int key, String value);

    class Builder {
      private final Categories object = Any.empty();

      public Categories build() {
        return object;
      }

      public Categories.Builder set(int key, String value) {
        object.set(key, value);
        return this;
      }
    }
  }
}
