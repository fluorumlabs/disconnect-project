package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.extras.JsEnum;
import js.lang.Any;
import js.lang.Unknown /* ( string | HTMLDOMElement ) */;
import js.web.dom.HTMLElement;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Highmaps, Gantt) Options for configuring
 * accessibility for the chart. Requires the accessibility module to be loaded.
 * For a description of the module and information on its features, see
 * Highcharts Accessibility.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface AccessibilityOptions extends Any {
  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Options for announcing new data
   * to screen reader users. Useful for dynamic data applications and
   * drilldown.
   *
   * Keep in mind that frequent announcements will not be useful to users, as
   * they won't have time to explore the new data. For these applications,
   * consider making snapshots of the data accessible, and do the
   * announcements in batches.
   *
   */
  @JSProperty("announceNewData")
  @Nullable
  AccessibilityAnnounceNewDataOptionsObject getAnnounceNewData();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Options for announcing new data
   * to screen reader users. Useful for dynamic data applications and
   * drilldown.
   *
   * Keep in mind that frequent announcements will not be useful to users, as
   * they won't have time to explore the new data. For these applications,
   * consider making snapshots of the data accessible, and do the
   * announcements in batches.
   *
   */
  @JSProperty("announceNewData")
  void setAnnounceNewData(@Nullable AccessibilityAnnounceNewDataOptionsObject value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) A hook for adding custom
   * components to the accessibility module. Should be an object mapping
   * component names to instances of classes inheriting from the
   * Highcharts.AccessibilityComponent base class. Remember to add the
   * component to the keyboardNavigation.order for the keyboard navigation to
   * be usable.
   *
   */
  @JSProperty("customComponents")
  @Nullable
  Any getCustomComponents();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) A hook for adding custom
   * components to the accessibility module. Should be an object mapping
   * component names to instances of classes inheriting from the
   * Highcharts.AccessibilityComponent base class. Remember to add the
   * component to the keyboardNavigation.order for the keyboard navigation to
   * be usable.
   *
   */
  @JSProperty("customComponents")
  void setCustomComponents(@Nullable Any value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) A text description of the chart.
   *
   * <strong>Note: Prefer using linkedDescription or caption instead.</strong>
   *
   * If the Accessibility module is loaded, this option is included by default
   * as a long description of the chart in the hidden screen reader
   * information region.
   *
   * Note: Since Highcharts now supports captions and linked descriptions, it
   * is preferred to define the description using those methods, as a visible
   * caption/description benefits all users. If the
   * <code>accessibility.description</code> option is defined, the linked description is
   * ignored, and the caption is hidden from screen reader users.
   *
   */
  @JSProperty("description")
  @Nullable
  String getDescription();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) A text description of the chart.
   *
   * <strong>Note: Prefer using linkedDescription or caption instead.</strong>
   *
   * If the Accessibility module is loaded, this option is included by default
   * as a long description of the chart in the hidden screen reader
   * information region.
   *
   * Note: Since Highcharts now supports captions and linked descriptions, it
   * is preferred to define the description using those methods, as a visible
   * caption/description benefits all users. If the
   * <code>accessibility.description</code> option is defined, the linked description is
   * ignored, and the caption is hidden from screen reader users.
   *
   */
  @JSProperty("description")
  void setDescription(@Nullable String value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Enable accessibility
   * functionality for the chart.
   *
   */
  @JSProperty("enabled")
  boolean getEnabled();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Enable accessibility
   * functionality for the chart.
   *
   */
  @JSProperty("enabled")
  void setEnabled(boolean value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Theme to apply to the chart when
   * Windows High Contrast Mode is detected. By default, a high contrast theme
   * matching the high contrast system system colors is used.
   *
   */
  @JSProperty("highContrastTheme")
  @Nullable
  Any getHighContrastTheme();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Theme to apply to the chart when
   * Windows High Contrast Mode is detected. By default, a high contrast theme
   * matching the high contrast system system colors is used.
   *
   */
  @JSProperty("highContrastTheme")
  void setHighContrastTheme(@Nullable Any value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Options for keyboard navigation.
   *
   */
  @JSProperty("keyboardNavigation")
  @Nullable
  KeyboardNavigationOptionsObject getKeyboardNavigation();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Options for keyboard navigation.
   *
   */
  @JSProperty("keyboardNavigation")
  void setKeyboardNavigation(@Nullable KeyboardNavigationOptionsObject value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Amount of landmarks/regions to
   * create for screen reader users. More landmarks can make navigation with
   * screen readers easier, but can be distracting if there are lots of charts
   * on the page. Three modes are available:
   *
   * <ul>
   * <li>
   * <code>all</code>: Adds regions for all series, legend, menu, information region.
   *
   * </li>
   * <li>
   * <code>one</code>: Adds a single landmark per chart.
   *
   * </li>
   * <li>
   * <code>disabled</code>: No landmarks are added.
   *
   * </li>
   * </ul>
   */
  @JSProperty("landmarkVerbosity")
  @Nullable
  LandmarkVerbosity getLandmarkVerbosity();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Amount of landmarks/regions to
   * create for screen reader users. More landmarks can make navigation with
   * screen readers easier, but can be distracting if there are lots of charts
   * on the page. Three modes are available:
   *
   * <ul>
   * <li>
   * <code>all</code>: Adds regions for all series, legend, menu, information region.
   *
   * </li>
   * <li>
   * <code>one</code>: Adds a single landmark per chart.
   *
   * </li>
   * <li>
   * <code>disabled</code>: No landmarks are added.
   *
   * </li>
   * </ul>
   */
  @JSProperty("landmarkVerbosity")
  void setLandmarkVerbosity(@Nullable LandmarkVerbosity value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Link the chart to an HTML
   * element describing the contents of the chart.
   *
   * It is always recommended to describe charts using visible text, to
   * improve SEO as well as accessibility for users with disabilities. This
   * option lets an HTML element with a description be linked to the chart, so
   * that screen reader users can connect the two.
   *
   * By setting this option to a string, Highcharts runs the string as an HTML
   * selector query on the entire document. If there is only a single match,
   * this element is linked to the chart. The content of the linked element
   * will be included in the chart description for screen reader users.
   *
   * By default, the chart looks for an adjacent sibling element with the
   * <code>highcharts-description</code> class.
   *
   * The feature can be disabled by setting the option to an empty string, or
   * overridden by providing the accessibility.description option.
   * Alternatively, the HTML element to link can be passed in directly as an
   * HTML node.
   *
   * If you need the description to be part of the exported image, consider
   * using the caption feature.
   *
   * If you need the description to be hidden visually, use the
   * accessibility.description option.
   *
   */
  @JSProperty("linkedDescription")
  @Nullable
  Unknown /* ( string | HTMLDOMElement ) */ getLinkedDescription();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Link the chart to an HTML
   * element describing the contents of the chart.
   *
   * It is always recommended to describe charts using visible text, to
   * improve SEO as well as accessibility for users with disabilities. This
   * option lets an HTML element with a description be linked to the chart, so
   * that screen reader users can connect the two.
   *
   * By setting this option to a string, Highcharts runs the string as an HTML
   * selector query on the entire document. If there is only a single match,
   * this element is linked to the chart. The content of the linked element
   * will be included in the chart description for screen reader users.
   *
   * By default, the chart looks for an adjacent sibling element with the
   * <code>highcharts-description</code> class.
   *
   * The feature can be disabled by setting the option to an empty string, or
   * overridden by providing the accessibility.description option.
   * Alternatively, the HTML element to link can be passed in directly as an
   * HTML node.
   *
   * If you need the description to be part of the exported image, consider
   * using the caption feature.
   *
   * If you need the description to be hidden visually, use the
   * accessibility.description option.
   *
   */
  @JSProperty("linkedDescription")
  void setLinkedDescription(@Nullable HTMLElement value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Link the chart to an HTML
   * element describing the contents of the chart.
   *
   * It is always recommended to describe charts using visible text, to
   * improve SEO as well as accessibility for users with disabilities. This
   * option lets an HTML element with a description be linked to the chart, so
   * that screen reader users can connect the two.
   *
   * By setting this option to a string, Highcharts runs the string as an HTML
   * selector query on the entire document. If there is only a single match,
   * this element is linked to the chart. The content of the linked element
   * will be included in the chart description for screen reader users.
   *
   * By default, the chart looks for an adjacent sibling element with the
   * <code>highcharts-description</code> class.
   *
   * The feature can be disabled by setting the option to an empty string, or
   * overridden by providing the accessibility.description option.
   * Alternatively, the HTML element to link can be passed in directly as an
   * HTML node.
   *
   * If you need the description to be part of the exported image, consider
   * using the caption feature.
   *
   * If you need the description to be hidden visually, use the
   * accessibility.description option.
   *
   */
  @JSProperty("linkedDescription")
  void setLinkedDescription(@Nullable String value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Options for descriptions of
   * individual data points.
   *
   */
  @JSProperty("point")
  @Nullable
  AccessibilityPointOptions getPoint();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Options for descriptions of
   * individual data points.
   *
   */
  @JSProperty("point")
  void setPoint(@Nullable AccessibilityPointOptions value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Accessibility options for the
   * screen reader information sections added before and after the chart.
   *
   */
  @JSProperty("screenReaderSection")
  @Nullable
  AccessibilityScreenReaderSectionOptions getScreenReaderSection();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Accessibility options for the
   * screen reader information sections added before and after the chart.
   *
   */
  @JSProperty("screenReaderSection")
  void setScreenReaderSection(@Nullable AccessibilityScreenReaderSectionOptions value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Accessibility options global to
   * all data series. Individual series can also have specific accessibility
   * options set.
   *
   */
  @JSProperty("series")
  @Nullable
  AccessibilitySeriesOptions getSeries();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Accessibility options global to
   * all data series. Individual series can also have specific accessibility
   * options set.
   *
   */
  @JSProperty("series")
  void setSeries(@Nullable AccessibilitySeriesOptions value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) A text description of the chart
   * type.
   *
   * If the Accessibility module is loaded, this will be included in the
   * description of the chart in the screen reader information region.
   *
   * Highcharts will by default attempt to guess the chart type, but for more
   * complex charts it is recommended to specify this property for clarity.
   *
   */
  @JSProperty("typeDescription")
  @Nullable
  String getTypeDescription();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) A text description of the chart
   * type.
   *
   * If the Accessibility module is loaded, this will be included in the
   * description of the chart in the screen reader information region.
   *
   * Highcharts will by default attempt to guess the chart type, but for more
   * complex charts it is recommended to specify this property for clarity.
   *
   */
  @JSProperty("typeDescription")
  void setTypeDescription(@Nullable String value);

  abstract class LandmarkVerbosity extends JsEnum {
    public static final LandmarkVerbosity ALL = JsEnum.of("all");

    public static final LandmarkVerbosity DISABLED = JsEnum.of("disabled");

    public static final LandmarkVerbosity ONE = JsEnum.of("one");
  }

  class Builder {
    private final AccessibilityOptions object = Any.empty();

    public AccessibilityOptions build() {
      return object;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Options for announcing new data
     * to screen reader users. Useful for dynamic data applications and
     * drilldown.
     *
     * Keep in mind that frequent announcements will not be useful to users, as
     * they won't have time to explore the new data. For these applications,
     * consider making snapshots of the data accessible, and do the
     * announcements in batches.
     *
     */
    public Builder announceNewData(@Nullable AccessibilityAnnounceNewDataOptionsObject value) {
      object.setAnnounceNewData(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) A hook for adding custom
     * components to the accessibility module. Should be an object mapping
     * component names to instances of classes inheriting from the
     * Highcharts.AccessibilityComponent base class. Remember to add the
     * component to the keyboardNavigation.order for the keyboard navigation to
     * be usable.
     *
     */
    public Builder customComponents(@Nullable Any value) {
      object.setCustomComponents(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) A text description of the chart.
     *
     * <strong>Note: Prefer using linkedDescription or caption instead.</strong>
     *
     * If the Accessibility module is loaded, this option is included by default
     * as a long description of the chart in the hidden screen reader
     * information region.
     *
     * Note: Since Highcharts now supports captions and linked descriptions, it
     * is preferred to define the description using those methods, as a visible
     * caption/description benefits all users. If the
     * <code>accessibility.description</code> option is defined, the linked description is
     * ignored, and the caption is hidden from screen reader users.
     *
     */
    public Builder description(@Nullable String value) {
      object.setDescription(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Enable accessibility
     * functionality for the chart.
     *
     */
    public Builder enabled(boolean value) {
      object.setEnabled(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Theme to apply to the chart when
     * Windows High Contrast Mode is detected. By default, a high contrast theme
     * matching the high contrast system system colors is used.
     *
     */
    public Builder highContrastTheme(@Nullable Any value) {
      object.setHighContrastTheme(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Options for keyboard navigation.
     *
     */
    public Builder keyboardNavigation(@Nullable KeyboardNavigationOptionsObject value) {
      object.setKeyboardNavigation(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Amount of landmarks/regions to
     * create for screen reader users. More landmarks can make navigation with
     * screen readers easier, but can be distracting if there are lots of charts
     * on the page. Three modes are available:
     *
     * <ul>
     * <li>
     * <code>all</code>: Adds regions for all series, legend, menu, information region.
     *
     * </li>
     * <li>
     * <code>one</code>: Adds a single landmark per chart.
     *
     * </li>
     * <li>
     * <code>disabled</code>: No landmarks are added.
     *
     * </li>
     * </ul>
     */
    public Builder landmarkVerbosity(@Nullable LandmarkVerbosity value) {
      object.setLandmarkVerbosity(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Link the chart to an HTML
     * element describing the contents of the chart.
     *
     * It is always recommended to describe charts using visible text, to
     * improve SEO as well as accessibility for users with disabilities. This
     * option lets an HTML element with a description be linked to the chart, so
     * that screen reader users can connect the two.
     *
     * By setting this option to a string, Highcharts runs the string as an HTML
     * selector query on the entire document. If there is only a single match,
     * this element is linked to the chart. The content of the linked element
     * will be included in the chart description for screen reader users.
     *
     * By default, the chart looks for an adjacent sibling element with the
     * <code>highcharts-description</code> class.
     *
     * The feature can be disabled by setting the option to an empty string, or
     * overridden by providing the accessibility.description option.
     * Alternatively, the HTML element to link can be passed in directly as an
     * HTML node.
     *
     * If you need the description to be part of the exported image, consider
     * using the caption feature.
     *
     * If you need the description to be hidden visually, use the
     * accessibility.description option.
     *
     */
    public Builder linkedDescription(@Nullable HTMLElement value) {
      object.setLinkedDescription(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Link the chart to an HTML
     * element describing the contents of the chart.
     *
     * It is always recommended to describe charts using visible text, to
     * improve SEO as well as accessibility for users with disabilities. This
     * option lets an HTML element with a description be linked to the chart, so
     * that screen reader users can connect the two.
     *
     * By setting this option to a string, Highcharts runs the string as an HTML
     * selector query on the entire document. If there is only a single match,
     * this element is linked to the chart. The content of the linked element
     * will be included in the chart description for screen reader users.
     *
     * By default, the chart looks for an adjacent sibling element with the
     * <code>highcharts-description</code> class.
     *
     * The feature can be disabled by setting the option to an empty string, or
     * overridden by providing the accessibility.description option.
     * Alternatively, the HTML element to link can be passed in directly as an
     * HTML node.
     *
     * If you need the description to be part of the exported image, consider
     * using the caption feature.
     *
     * If you need the description to be hidden visually, use the
     * accessibility.description option.
     *
     */
    public Builder linkedDescription(@Nullable String value) {
      object.setLinkedDescription(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Options for descriptions of
     * individual data points.
     *
     */
    public Builder point(@Nullable AccessibilityPointOptions value) {
      object.setPoint(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Accessibility options for the
     * screen reader information sections added before and after the chart.
     *
     */
    public Builder screenReaderSection(@Nullable AccessibilityScreenReaderSectionOptions value) {
      object.setScreenReaderSection(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Accessibility options global to
     * all data series. Individual series can also have specific accessibility
     * options set.
     *
     */
    public Builder series(@Nullable AccessibilitySeriesOptions value) {
      object.setSeries(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) A text description of the chart
     * type.
     *
     * If the Accessibility module is loaded, this will be included in the
     * description of the chart in the screen reader information region.
     *
     * Highcharts will by default attempt to guess the chart type, but for more
     * complex charts it is recommended to specify this property for clarity.
     *
     */
    public Builder typeDescription(@Nullable String value) {
      object.setTypeDescription(value);
      return this;
    }
  }
}
