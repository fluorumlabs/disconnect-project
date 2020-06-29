package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown /* ( AnnotationsOptions | NavigationAnnotationsOptions ) */;
import js.lang.Unknown /* ( NavigationBindingsOptions | Dictionary < NavigationBindingsOptionsObject > ) */;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Highmaps, Gantt) A collection of options for buttons
 * and menus appearing in the exporting module.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface NavigationOptions extends Any {
  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Additional options to be merged
   * into all annotations.
   *
   */
  @JSProperty("annotationsOptions")
  @Nullable
  Unknown /* ( AnnotationsOptions | NavigationAnnotationsOptions ) */ getAnnotationsOptions();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Additional options to be merged
   * into all annotations.
   *
   */
  @JSProperty("annotationsOptions")
  void setAnnotationsOptions(@Nullable AnnotationsOptions value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Additional options to be merged
   * into all annotations.
   *
   */
  @JSProperty("annotationsOptions")
  void setAnnotationsOptions(@Nullable NavigationAnnotationsOptions value);

  /**
   * (Highcharts, Highstock) Bindings definitions for custom HTML buttons.
   * Each binding implements simple event-driven interface:
   *
   * <ul>
   * <li>
   * <code>className</code>: classname used to bind event to
   *
   * </li>
   * <li>
   * <code>init</code>: initial event, fired on button click
   *
   * </li>
   * <li>
   * <code>start</code>: fired on first click on a chart
   *
   * </li>
   * <li>
   * <code>steps</code>: array of sequential events fired one after another on each of
   * users clicks
   *
   * </li>
   * <li>
   * <code>end</code>: last event to be called after last step event
   *
   * </li>
   * </ul>
   */
  @JSProperty("bindings")
  @Nullable
  Unknown /* ( NavigationBindingsOptions | Dictionary < NavigationBindingsOptionsObject > ) */ getBindings(
      );

  /**
   * (Highcharts, Highstock) Bindings definitions for custom HTML buttons.
   * Each binding implements simple event-driven interface:
   *
   * <ul>
   * <li>
   * <code>className</code>: classname used to bind event to
   *
   * </li>
   * <li>
   * <code>init</code>: initial event, fired on button click
   *
   * </li>
   * <li>
   * <code>start</code>: fired on first click on a chart
   *
   * </li>
   * <li>
   * <code>steps</code>: array of sequential events fired one after another on each of
   * users clicks
   *
   * </li>
   * <li>
   * <code>end</code>: last event to be called after last step event
   *
   * </li>
   * </ul>
   */
  @JSProperty("bindings")
  void setBindings(@Nullable NavigationBindingsOptions value);

  /**
   * (Highcharts, Highstock) Bindings definitions for custom HTML buttons.
   * Each binding implements simple event-driven interface:
   *
   * <ul>
   * <li>
   * <code>className</code>: classname used to bind event to
   *
   * </li>
   * <li>
   * <code>init</code>: initial event, fired on button click
   *
   * </li>
   * <li>
   * <code>start</code>: fired on first click on a chart
   *
   * </li>
   * <li>
   * <code>steps</code>: array of sequential events fired one after another on each of
   * users clicks
   *
   * </li>
   * <li>
   * <code>end</code>: last event to be called after last step event
   *
   * </li>
   * </ul>
   */
  @JSProperty("bindings")
  void setBindings(@Nullable Dictionary<NavigationBindingsOptionsObject> value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) A CSS class name where all
   * bindings will be attached to. Multiple charts on the same page should
   * have separate class names to prevent duplicating events.
   *
   * Default value of versions &lt; 7.0.4 <code>highcharts-bindings-wrapper</code>
   *
   */
  @JSProperty("bindingsClassName")
  @Nullable
  String getBindingsClassName();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) A CSS class name where all
   * bindings will be attached to. Multiple charts on the same page should
   * have separate class names to prevent duplicating events.
   *
   * Default value of versions &lt; 7.0.4 <code>highcharts-bindings-wrapper</code>
   *
   */
  @JSProperty("bindingsClassName")
  void setBindingsClassName(@Nullable String value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) A collection of options for
   * buttons appearing in the exporting module.
   *
   * In styled mode, the buttons are styled with the
   * <code>.highcharts-contextbutton</code> and <code>.highcharts-button-symbol</code> classes.
   *
   */
  @JSProperty("buttonOptions")
  @Nullable
  NavigationButtonOptions getButtonOptions();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) A collection of options for
   * buttons appearing in the exporting module.
   *
   * In styled mode, the buttons are styled with the
   * <code>.highcharts-contextbutton</code> and <code>.highcharts-button-symbol</code> classes.
   *
   */
  @JSProperty("buttonOptions")
  void setButtonOptions(@Nullable NavigationButtonOptions value);

  /**
   * (Highcharts, Highstock) Events to communicate between Stock Tools and
   * custom GUI.
   *
   */
  @JSProperty("events")
  @Nullable
  NavigationEventsOptions getEvents();

  /**
   * (Highcharts, Highstock) Events to communicate between Stock Tools and
   * custom GUI.
   *
   */
  @JSProperty("events")
  void setEvents(@Nullable NavigationEventsOptions value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Path where Highcharts will look
   * for icons. Change this to use icons from a different server.
   *
   */
  @JSProperty("iconsURL")
  @Nullable
  String getIconsURL();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) Path where Highcharts will look
   * for icons. Change this to use icons from a different server.
   *
   */
  @JSProperty("iconsURL")
  void setIconsURL(@Nullable String value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) CSS styles for the hover state
   * of the individual items within the popup menu appearing by default when
   * the export icon is clicked. The menu items are rendered in HTML.
   *
   */
  @JSProperty("menuItemHoverStyle")
  @Nullable
  CSSObject getMenuItemHoverStyle();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) CSS styles for the hover state
   * of the individual items within the popup menu appearing by default when
   * the export icon is clicked. The menu items are rendered in HTML.
   *
   */
  @JSProperty("menuItemHoverStyle")
  void setMenuItemHoverStyle(@Nullable CSSObject value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) CSS styles for the individual
   * items within the popup menu appearing by default when the export icon is
   * clicked. The menu items are rendered in HTML. Font size defaults to
   * <code>11px</code> on desktop and <code>14px</code> on touch devices.
   *
   */
  @JSProperty("menuItemStyle")
  @Nullable
  CSSObject getMenuItemStyle();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) CSS styles for the individual
   * items within the popup menu appearing by default when the export icon is
   * clicked. The menu items are rendered in HTML. Font size defaults to
   * <code>11px</code> on desktop and <code>14px</code> on touch devices.
   *
   */
  @JSProperty("menuItemStyle")
  void setMenuItemStyle(@Nullable CSSObject value);

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) CSS styles for the popup menu
   * appearing by default when the export icon is clicked. This menu is
   * rendered in HTML.
   *
   */
  @JSProperty("menuStyle")
  @Nullable
  CSSObject getMenuStyle();

  /**
   * (Highcharts, Highstock, Highmaps, Gantt) CSS styles for the popup menu
   * appearing by default when the export icon is clicked. This menu is
   * rendered in HTML.
   *
   */
  @JSProperty("menuStyle")
  void setMenuStyle(@Nullable CSSObject value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final NavigationOptions object = Any.empty();

    private Builder() {
    }

    public NavigationOptions build() {
      return object;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Additional options to be merged
     * into all annotations.
     *
     */
    public Builder annotationsOptions(@Nullable AnnotationsOptions value) {
      object.setAnnotationsOptions(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Additional options to be merged
     * into all annotations.
     *
     */
    public Builder annotationsOptions(@Nullable NavigationAnnotationsOptions value) {
      object.setAnnotationsOptions(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) Bindings definitions for custom HTML buttons.
     * Each binding implements simple event-driven interface:
     *
     * <ul>
     * <li>
     * <code>className</code>: classname used to bind event to
     *
     * </li>
     * <li>
     * <code>init</code>: initial event, fired on button click
     *
     * </li>
     * <li>
     * <code>start</code>: fired on first click on a chart
     *
     * </li>
     * <li>
     * <code>steps</code>: array of sequential events fired one after another on each of
     * users clicks
     *
     * </li>
     * <li>
     * <code>end</code>: last event to be called after last step event
     *
     * </li>
     * </ul>
     */
    public Builder bindings(@Nullable NavigationBindingsOptions value) {
      object.setBindings(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) Bindings definitions for custom HTML buttons.
     * Each binding implements simple event-driven interface:
     *
     * <ul>
     * <li>
     * <code>className</code>: classname used to bind event to
     *
     * </li>
     * <li>
     * <code>init</code>: initial event, fired on button click
     *
     * </li>
     * <li>
     * <code>start</code>: fired on first click on a chart
     *
     * </li>
     * <li>
     * <code>steps</code>: array of sequential events fired one after another on each of
     * users clicks
     *
     * </li>
     * <li>
     * <code>end</code>: last event to be called after last step event
     *
     * </li>
     * </ul>
     */
    public Builder bindings(@Nullable Dictionary<NavigationBindingsOptionsObject> value) {
      object.setBindings(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) A CSS class name where all
     * bindings will be attached to. Multiple charts on the same page should
     * have separate class names to prevent duplicating events.
     *
     * Default value of versions &lt; 7.0.4 <code>highcharts-bindings-wrapper</code>
     *
     */
    public Builder bindingsClassName(@Nullable String value) {
      object.setBindingsClassName(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) A collection of options for
     * buttons appearing in the exporting module.
     *
     * In styled mode, the buttons are styled with the
     * <code>.highcharts-contextbutton</code> and <code>.highcharts-button-symbol</code> classes.
     *
     */
    public Builder buttonOptions(@Nullable NavigationButtonOptions value) {
      object.setButtonOptions(value);
      return this;
    }

    /**
     * (Highcharts, Highstock) Events to communicate between Stock Tools and
     * custom GUI.
     *
     */
    public Builder events(@Nullable NavigationEventsOptions value) {
      object.setEvents(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) Path where Highcharts will look
     * for icons. Change this to use icons from a different server.
     *
     */
    public Builder iconsURL(@Nullable String value) {
      object.setIconsURL(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) CSS styles for the hover state
     * of the individual items within the popup menu appearing by default when
     * the export icon is clicked. The menu items are rendered in HTML.
     *
     */
    public Builder menuItemHoverStyle(@Nullable CSSObject value) {
      object.setMenuItemHoverStyle(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) CSS styles for the individual
     * items within the popup menu appearing by default when the export icon is
     * clicked. The menu items are rendered in HTML. Font size defaults to
     * <code>11px</code> on desktop and <code>14px</code> on touch devices.
     *
     */
    public Builder menuItemStyle(@Nullable CSSObject value) {
      object.setMenuItemStyle(value);
      return this;
    }

    /**
     * (Highcharts, Highstock, Highmaps, Gantt) CSS styles for the popup menu
     * appearing by default when the export icon is clicked. This menu is
     * rendered in HTML.
     *
     */
    public Builder menuStyle(@Nullable CSSObject value) {
      object.setMenuStyle(value);
      return this;
    }
  }
}
