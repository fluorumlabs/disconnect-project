package com.github.fluorumlabs.disconnect.vaadin;

import com.github.fluorumlabs.disconnect.core.annotations.WebComponent;
import com.github.fluorumlabs.disconnect.vaadin.constants.AxisPosition;
import com.github.fluorumlabs.disconnect.vaadin.constants.Stacking;
import com.github.fluorumlabs.disconnect.vaadin.elements.ChartElement;
import com.github.fluorumlabs.disconnect.zero.component.AbstractComponent;
import com.github.fluorumlabs.disconnect.zero.component.Component;
import com.github.fluorumlabs.disconnect.zero.component.HasComponents;
import com.github.fluorumlabs.disconnect.zero.component.HasStyle;
import com.github.fluorumlabs.disconnect.zero.observable.ObservableEvent;
import js.lang.Unknown;
import js.web.dom.CustomEvent;

import javax.annotation.Nullable;

/**
 * <code>&lt;vaadin-chart&gt;</code> is a Web Component for creating high quality charts.
 *
 * <h3>Quick Start</h3>
 * <h4>Polymer 2 App</h4>
 * <ol>
 * <li>Create a Polymer application using
 * <a href="https://www.polymer-project.org/2.0/docs/tools/polymer-cli">Polymer CLI</a></li>
 * </ol>
 * <pre><code>mkdir my-app
 * cd my-app
 * polymer init
 * select `polymer-2-application`
 * </code></pre>
 * <ol>
 * <li>Install Vaadin Charts</li>
 * </ol>
 * <pre><code>bower install --save vaadin-charts#6.2.4
 * </code></pre>
 * <ol>
 * <li>Import <code>&lt;vaadin-chart&gt;</code> to your app
 * Edit the file <code>src/my-app/my-app.html</code> and add the following snipped before the <code>&lt;
 * dom-module&gt;</code> tag</li>
 * </ol>
 * <pre><code class="language-html">&lt;link rel=&quot;import&quot; href=&quot;../.
 * ./bower_components/vaadin-charts/vaadin-chart.html&quot;&gt;
 * </code></pre>
 * <ol>
 * <li>Add your first <code>&lt;vaadin-chart&gt;</code>
 * Also in <code>my-app.html</code> add the following snippet before the <code>&lt;/template&gt;</code> closing tag</li>
 * </ol>
 * <pre><code class="language-html">&lt;vaadin-chart&gt;&lt;/vaadin-chart&gt;
 * </code></pre>
 * <ol>
 * <li>Run your app with:</li>
 * </ol>
 * <pre><code>polymer serve --open
 * </code></pre>
 * <h4>Polymer 3 App</h4>
 * <ul>
 * <li>
 * <ol>
 * <li>Create a Polymer application using
 * <a href="https://www.polymer-project.org/3.0/docs/tools/polymer-cli">Polymer CLI</a></li>
 * </ol>
 * </li>
 * </ul>
 * <pre><code>mkdir my-app
 * cd my-app
 * polymer init
 * select `polymer-3-application`
 * </code></pre>
 * <ol>
 * <li>Install Vaadin Charts</li>
 * </ol>
 * <pre><code>npm i @vaadin/vaadin-charts@6.2.3 --save
 * </code></pre>
 * <ol>
 * <li>Import <code>&lt;vaadin-chart&gt;</code> to your app
 * Edit the file <code>src/my-app/my-app.js</code> and add the following snipped on the top, after the first
 * <code>import</code> declaration</li>
 * </ol>
 * <pre><code class="language-js">import '@vaadin/vaadin-charts';
 * </code></pre>
 * <ol>
 * <li>Add your first <code>&lt;vaadin-chart&gt;</code>
 * Also in <code>my-app.js</code>, at the template getter, add the following snippet after the <code>&lt;/h2&gt;
 * </code> closing tag</li>
 * </ol>
 * <pre><code class="language-html">&lt;vaadin-chart&gt;&lt;/vaadin-chart&gt;
 * </code></pre>
 * <ol>
 * <li>Run your app with:</li>
 * </ol>
 * <pre><code>polymer serve --npm --open
 * </code></pre>
 * Congratulations! You have your first Vaadin Chart setup.
 *
 * <h3>Basic use</h3>
 * Now that we covered the basic steps to create an empty chart, let us show how you can configure it.
 * <p>
 * There are two ways of configuring your <code>&lt;vaadin-chart&gt;</code> element: <strong>HTML API</strong>,
 * <strong>JS API</strong> and <strong>JSON API</strong>.
 * Note that you can make use of all APIs in your element.
 *
 * <h4>Configuring your chart using HTML API</h4>
 * <code>vaadin-chart</code> has a set of attributes to make it easier for you to customize your chart.
 * Using as a base the project created with in Quick Start:
 *
 * <pre><code class="language-html"> &lt;vaadin-chart title=&quot;The chart title&quot; subtitle=&quot;The chart
 * subtitle&quot;&gt;
 *    &lt;vaadin-chart-series
 *          type=&quot;column&quot;
 *          title=&quot;The series title&quot;
 *          values=&quot;[10,20,30]&quot;&gt;
 *    &lt;/vaadin-chart-series&gt;
 *  &lt;/vaadin-chart&gt;
 * </code></pre>
 * <blockquote>
 * Note that while you can set type for each series individually, for some types, such as <code>'bar'</code>,
 * <code>'gauge'</code> and <code>'solidgauge'</code>, you
 * have to set it as the default series type on <code>&lt;vaadin-chart&gt;</code> in order to work properly.
 *
 * </blockquote>
 * <h4>Configuring your chart using JS API</h4>
 * Using as a base the project created with in Quick Start
 * <p>
 * Do the following changes in <code>my-app.html</code>
 *
 * <ol>
 * <li>Set and id for the <code>&lt;vaadin-chart&gt;</code> in the template</li>
 * </ol>
 * <pre><code class="language-html">    &lt;vaadin-chart id=&quot;mychart&quot;&gt;&lt;/vaadin-chart&gt;
 * </code></pre>
 * <ol>
 * <li>Add a function that uses <code>configuration</code> property (JS Api) to set chart title, categories and
 * data</li>
 * </ol>
 * <pre><code class="language-js">initChartWithJSApi() {
 *     Polymer.RenderStatus.beforeNextRender(this, () =&gt; {
 *        const configuration = this.$.mychart.configuration;
 *        configuration.setTitle({ text: 'The chart title' });
 *        // By default there is one x axis, it is referenced by configuration.xAxis[0].
 *        configuration.xAxis[0].setCategories(['Jan', 'Feb', 'Mar', 'Apr', 'May', 'Jun', 'Jul', 'Aug', 'Sep', 'Oct',
 *        'Nov', 'Dec']);
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
 * <ol>
 * <li>And finally run your app with:</li>
 * </ol>
 * <pre><code>polymer serve --open
 * </code></pre>
 * <h4>Configuring your chart using JS JSON API</h4>
 * JS JSON API is a simple alternative to the JS API.
 * <p>
 * Using as a base the project created with in Quick Start
 * <p>
 * Do the following changes in <code>my-app.html</code>
 *
 * <ol>
 * <li>Set and id for the <code>&lt;vaadin-chart&gt;</code> in the template</li>
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
 * <ol>
 * <li>And finally run your app with:</li>
 * </ol>
 * <pre><code>polymer serve --open
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
 * <li>Create a theme file (for example <code>shared-styles.html</code>). The theme's dom-module must declare
 * <code>theme-for=vaadin-chart</code>.</li>
 * <li>Import <code>vaadin-chart-default-theme.html</code> and declare <code>include=&quot;
 * vaadin-chart-default-theme&quot;</code>
 * on the theme module's style tag to customize Chart's default theme. If there are multiple theme
 * modules <em>only one</em> of them should declare this <code>include</code>.</li>
 * <li>Specify the desired CSS rules in the theme file.</li>
 * <li>If multiple charts are present, each one can be specifically targeted using the host selector e.g <code>:host(
 * .my-chart-class)</code>.</li>
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
 * <pre><code class="language-html">&lt;link rel=&quot;import&quot; href=&quot;.
 * ./bower_components/vaadin-charts/theme/vaadin-chart-default-theme.html&quot;&gt;
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
 * <h3>Setting colors</h3>
 * Although charts can be styled as described above, there is a simpler way for setting colors.
 * Colors can be set using CSS custom properties <code>--vaadin-charts-color-{n}</code> (where <code>n</code> goes
 * from <code>0 - 9</code>).
 * <p>
 * For example <code>--vaadin-charts-color-0</code> sets the color of the first series on a chart.
 *
 * <h3>Validating your License</h3>
 * After one day using Vaadin Charts in a development environment you will see a pop-up that asks you
 * to validate your license by signing in to vaadin.com.
 */
@WebComponent
public class Chart extends AbstractComponent<ChartElement>
		implements HasStyle<ChartElement, Chart>, HasComponents<ChartElement, Chart, Component<?>> {
	public Chart() {
		super(ChartElement.TAGNAME());
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
	 * For detailed documentation of available API check the
	 * <a href="http://api.highcharts.com/class-reference/classes.list">API site</a>
	 */
	public Unknown configuration() {
		return getNode().getConfiguration();
	}

	/**
	 * FIXME type Object
	 * Configuration object that exposes the JS Api to configure the chart.
	 * <p>
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
	 * For detailed documentation of available API check the
	 * <a href="http://api.highcharts.com/class-reference/classes.list">API site</a>
	 */
	public Chart configuration(Unknown configuration) {
		getNode().setConfiguration(configuration);
		return this;
	}

	/**
	 * If categories are present names are used instead of numbers for the category axis.
	 * The format of categories can be an <code>Array</code> with a list of categories, such as <code>['2010',
	 * '2011', '2012']</code>
	 * or a mapping <code>Object</code>, like <code>{0:'1',9:'Target (10)', 15: 'Max'}</code>.
	 */
	@Nullable
	public String[] categories() {
		return getNode().getCategories();
	}

	/**
	 * If categories are present names are used instead of numbers for the category axis.
	 * The format of categories can be an <code>Array</code> with a list of categories, such as <code>['2010',
	 * '2011', '2012']</code>
	 * or a mapping <code>Object</code>, like <code>{0:'1',9:'Target (10)', 15: 'Max'}</code>.
	 */
	public Chart categories(String... categories) {
		getNode().setCategories(categories);
		return this;
	}

	/**
	 * Category-axis maximum value. Defaults to <code>undefined</code>.
	 */
	public double categoryMax() {
		return getNode().getCategoryMax();
	}

	/**
	 * Category-axis maximum value. Defaults to <code>undefined</code>.
	 */
	public Chart categoryMax(double categoryMax) {
		getNode().setCategoryMax(categoryMax);
		return this;
	}

	/**
	 * Category-axis minimum value. Defaults to <code>undefined</code>.
	 */
	public double categoryMin() {
		return getNode().getCategoryMin();
	}

	/**
	 * Category-axis minimum value. Defaults to <code>undefined</code>.
	 */
	public Chart categoryMin(double categoryMin) {
		getNode().setCategoryMin(categoryMin);
		return this;
	}

	/**
	 * The position of the category axis. Acceptable values are <code>left</code>, <code>right</code>,
	 * <code>top</code> and <code>bottom</code>
	 * except for bar charts which only accept <code>left</code> and <code>right</code>.
	 * With the default value, charts appear as though they have <code>category-position=&quot;bottom&quot;</code>
	 * except for bar charts that appear as though they have <code>category-position=&quot;left&quot;</code>.
	 * <p>
	 * Defaults to <code>undefined</code>
	 */
	@Nullable
	public AxisPosition categoryPosition() {
		return getNode().getCategoryPosition();
	}

	/**
	 * The position of the category axis. Acceptable values are <code>left</code>, <code>right</code>,
	 * <code>top</code> and <code>bottom</code>
	 * except for bar charts which only accept <code>left</code> and <code>right</code>.
	 * With the default value, charts appear as though they have <code>category-position=&quot;bottom&quot;</code>
	 * except for bar charts that appear as though they have <code>category-position=&quot;left&quot;</code>.
	 * <p>
	 * Defaults to <code>undefined</code>
	 */
	public Chart categoryPosition(AxisPosition categoryPosition) {
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
	public Chart noLegend(boolean noLegend) {
		getNode().setNoLegend(noLegend);
		return this;
	}

	/**
	 * Specifies how series are stacked on top of each other.
	 * Possible values are null, &quot;normal&quot; or &quot;percent&quot;.
	 * If &quot;stack&quot; property is not defined on the vaadin-chart-series elements, then series will be put into
	 * the default stack.
	 */
	@Nullable
	public Stacking stacking() {
		return getNode().getStacking();
	}

	/**
	 * Specifies how series are stacked on top of each other.
	 * Possible values are null, &quot;normal&quot; or &quot;percent&quot;.
	 * If &quot;stack&quot; property is not defined on the vaadin-chart-series elements, then series will be put into
	 * the default stack.
	 */
	public Chart stacking(Stacking stacking) {
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
	public Chart timeline(boolean timeline) {
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
	public Chart title(String title) {
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
	public Chart tooltip(boolean tooltip) {
		getNode().setTooltip(tooltip);
		return this;
	}

	/**
	 * Sets the default series type of the chart.
	 * Note that <code>'bar'</code>, <code>'gauge'</code> and <code>'solidgauge'</code> should be set as default
	 * series type.
	 */
	@Nullable
	public String type() {
		return getNode().getType();
	}

	/**
	 * Sets the default series type of the chart.
	 * Note that <code>'bar'</code>, <code>'gauge'</code> and <code>'solidgauge'</code> should be set as default
	 * series type.
	 */
	public Chart type(String type) {
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
	public Chart subtitle(String subtitle) {
		getNode().setSubtitle(subtitle);
		return this;
	}

	/**
	 * Specifies whether to show chart in 3 or in 2 dimensions.
	 * Some display angles are added by default to the &quot;chart.options3d&quot; (<code>{alpha: 15, beta: 15,
	 * depth: 50}</code>).
	 * 3D display options can be modified via <code>additionalOptions</code>.
	 * The thickness of a Pie chart can be set on <code>additionalOptions</code> through <code>plotOptions.pie
	 * .depth</code>.
	 * 3D is supported by Bar, Column, Pie and Scatter3D charts.
	 * More info available at <a href="https://www.highcharts.com/docs/chart-concepts/3d-charts">Highcharts</a>.
	 */
	public boolean chart3d() {
		return getNode().isChart3d();
	}

	/**
	 * Specifies whether to show chart in 3 or in 2 dimensions.
	 * Some display angles are added by default to the &quot;chart.options3d&quot; (<code>{alpha: 15, beta: 15,
	 * depth: 50}</code>).
	 * 3D display options can be modified via <code>additionalOptions</code>.
	 * The thickness of a Pie chart can be set on <code>additionalOptions</code> through <code>plotOptions.pie
	 * .depth</code>.
	 * 3D is supported by Bar, Column, Pie and Scatter3D charts.
	 * More info available at <a href="https://www.highcharts.com/docs/chart-concepts/3d-charts">Highcharts</a>.
	 */
	public Chart chart3d(boolean chart3d) {
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
	public Chart emptyText(String emptyText) {
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
	public Chart additionalOptions(Unknown additionalOptions) {
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
	public Chart polar(boolean polar) {
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
	 *
	 *                           <ul>
	 *                           <li>chart <code>Object</code> with options regarding the chart area and plot area as
	 *                           well as general chart options.
	 *                           Detailed API for chart object is available in
	 *                           <a href="http://api.highcharts.com/highcharts/chart">API Site</a></li>
	 *                           <li>credits <code>Object</code> with options regarding the chart area and plot area
	 *                           as well as general chart options.
	 *                           Detailed API for credits object is available in
	 *                           <a href="http://api.highcharts.com/highcharts/credits">API Site</a></li>
	 *                           <li>labels <code>Object[]</code> with HTML labels that can be positioned anywhere in
	 *                           the chart area
	 *                           Detailed API for labels object is available in
	 *                           <a href="http://api.highcharts.com/highcharts/labels">API Site</a></li>
	 *                           <li>plotOptions <code>Object</code> wrapper for config objects for each series type.
	 *                           Detailed API for plotOptions object is available in
	 *                           <a href="http://api.highcharts.com/highcharts/plotOptions">API Site</a></li>
	 *                           <li>series <code>Object[]</code> the actual series to append to the chart.
	 *                           Detailed API for series object is available in
	 *                           <a href="http://api.highcharts.com/highcharts/series">API Site</a></li>
	 *                           <li>subtitle <code>Object</code> the chart's subtitle.
	 *                           Detailed API for subtitle object is available in
	 *                           <a href="http://api.highcharts.com/highcharts/subtitle">API Site</a></li>
	 *                           <li>title <code>Object</code> the chart's main title.
	 *                           Detailed API for title object is available in
	 *                           <a href="http://api.highcharts.com/highcharts/title">API Site</a></li>
	 *                           <li>tooltip <code>Object</code> Options for the tooltip that appears when the user
	 *                           hovers over a series or point.
	 *                           Detailed API for tooltip object is available in
	 *                           <a href="http://api.highcharts.com/highcharts/tooltip">API Site</a></li>
	 *                           <li>xAxis <code>Object[]</code> The X axis or category axis. Normally this is the
	 *                           horizontal axis.
	 *                           Detailed API for xAxis object is available in
	 *                           <a href="http://api.highcharts.com/highcharts/xAxis">API Site</a></li>
	 *                           <li>yAxis <code>Object[]</code> The Y axis or value axis. Normally this is the
	 *                           vertical axis.
	 *                           Detailed API for yAxis object is available in
	 *                           <a href="http://api.highcharts.com/highcharts/yAxis">API Site</a></li>
	 *                           <li>zAxis <code>Object[]</code> The Z axis or depth axis for 3D plots.
	 *                           Detailed API for zAxis object is available in
	 *                           <a href="http://api.highcharts.com/highcharts/zAxis">API Site</a></li>
	 *                           </ul>
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
	 * chart-redraw  Fired when the chart is redraw. Can be called after a <code>Chart.configuration.redraw()</code>
	 * or after an axis, series or point is modified with the <code>redraw</code> option set to <code>true</code>
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
	 * point-update  Fired when the point is updated programmatically through <code>.update()</code> method
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
