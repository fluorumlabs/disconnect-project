package js.lang.external.vaadin.vaadin_app_layout;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.external.polymer.PolymerElement;
import js.lang.external.vaadin.vaadin_element_mixin.ElementMixin;
import js.lang.external.vaadin.vaadin_themable_mixin.ThemableMixin;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/**
 * <code>&lt;vaadin-app-layout&gt;</code> is a Web Component providing a quick and easy way to get a common application layout structure done.
 *
 * <pre><code>&lt;vaadin-app-layout primary-section=&quot;navbar|drawer&quot;&gt;
 *  &lt;vaadin-drawer-toggle slot=&quot;navbar [touch-optimized]&quot;&gt;&lt;/vaadin-drawer-toggle&gt;
 *  &lt;h3 slot=&quot;navbar [touch-optimized]&quot;&gt;Company Name&lt;/h3&gt;
 *  &lt;vaadin-tabs orientation=&quot;vertical&quot; slot=&quot;drawer&quot;&gt;
 *    &lt;vaadin-tab&gt;Menu item 1&lt;/vaadin-tab&gt;
 *  &lt;/vaadin-tabs&gt;
 *  &lt;!-- Everything else will be the page content --&gt;
 *  &lt;div&gt;
 *    &lt;h3&gt;Page title&lt;/h3&gt;
 *    &lt;p&gt;Page content&lt;/p&gt;
 *  &lt;/div&gt;
 * &lt;/vaadin-app-layout&gt;
 * </code></pre>
 * For best results, the component should be added to the root level of your application (i.e., as a direct child of <code>&lt;body&gt;</code>).
 *
 * The page should include a viewport meta tag which contains <code>viewport-fit=cover</code>, like the following:
 *
 * <pre><code>&lt;meta name=&quot;viewport&quot; content=&quot;width=device-width, initial-scale=1, viewport-fit=cover&quot;&gt;
 * </code></pre>
 * This causes the viewport to be scaled to fill the device display.
 * To ensure that important content is displayed, use the provided css variables.
 *
 * <pre><code>--safe-area-inset-top
 * --safe-area-inset-right
 * --safe-area-inset-bottom
 * --safe-area-inset-left
 * </code></pre>
 * <h3>Styling</h3>
 * The following Shadow DOM parts of the <code>&lt;vaadin-app-layout&gt;</code> are available for styling:
 *
 * <table>
 * <thead>
 * <tr><th>Part name</th><th>Description</th></tr>
 * </thead>
 * <tbody>
 * <tr><td><code>navbar</code></td><td>Container for the navigation bar</td></tr>
 * <tr><td><code>drawer</code></td><td>Container for the drawer area</td></tr>
 * <tr><td><code>content</code></td><td>Container for page content.</td></tr>
 * </tbody>
 * </table>
 * See <a href="https://github.com/vaadin/vaadin-themable-mixin/wiki">ThemableMixin – how to apply styles for shadow parts</a>
 *
 * <h3>Component's slots</h3>
 * The following slots are available to be set
 *
 * <table>
 * <thead>
 * <tr><th>Slot name</th><th>Description</th></tr>
 * </thead>
 * <tbody>
 * <tr><td>no name</td><td>Default container for the page content</td></tr>
 * <tr><td><code>navbar</code></td><td>Container for the top navbar area</td></tr>
 * <tr><td><code>drawer</code></td><td>Container for an application menu</td></tr>
 * <tr><td><code>touch-optimized</code></td><td>Container for the bottom navbar area (only visible for mobile devices)</td></tr>
 * </tbody>
 * </table>
 * See examples of setting the content into slots in the live demos.
 *
 * <h4>Touch optimized</h4>
 * App Layout has a pseudo-slot <code>touch-optimized</code> in order to give more control of the presentation of
 * elements with <code>slot[navbar]</code>. Internally, when the user is interacting with App Layout from a
 * touchscreen device, the component will search for elements with <code>slot[navbar touch-optimized]</code> and move
 * them to the bottom of the page.
 *
 * <h3>Navigation</h3>
 * As the drawer opens as an overlay in small devices, it makes sense to close it once a navigation happens.
 *
 * In order to do so, there are two options:
 *
 * <ul>
 * <li>If the <code>vaadin-app-layout</code> instance is available, then <code>drawerOpened</code> can be set to <code>false</code></li>
 * <li>If not, a custom event <code>close-overlay-drawer</code> can be dispatched either by calling
 * <code>window.dispatchEvent(new CustomEvent('close-overlay-drawer'))</code> or by calling
 * <code>Vaadin.AppLayoutElement.dispatchCloseOverlayDrawerEvent()</code></li>
 * </ul>
 * <h3>Scrolling areas</h3>
 * By default, the component will act with the &quot;body scrolling&quot;, so on mobile (iOS Safari and Android Chrome),
 * the toolbars will collapse when a scroll happens.
 *
 * To use the &quot;content scrolling&quot;, in case of the content of the page relies on a pre-defined height (for instance,
 * it has a <code>height:100%</code>), then the developer can set <code>height: 100%</code> to both <code>html</code> and <code>body</code>.
 * That will make the <code>[content]</code> element of app layout scrollable.
 * On this case, the toolbars on mobile device won't collapse.
 *
 */
@NpmPackage(
    name = "@vaadin/vaadin-app-layout",
    version = "^2.2.0-alpha1"
)
@Import(
    symbols = {"AppLayoutElement as AppLayoutElement_AppLayoutElement"},
    module = "@vaadin/vaadin-app-layout/src/vaadin-app-layout.js"
)
@Import(
    module = "@vaadin/vaadin-app-layout/src/vaadin-app-layout.js"
)
public interface AppLayoutElement extends PolymerElement, ThemableMixin, ElementMixin {
  /**
   * Defines whether navbar or drawer will come first visually.
   *
   * <ul>
   * <li>By default (<code>primary-section=&quot;navbar&quot;</code>), the navbar takes the full available width and moves the drawer down.</li>
   * <li>If <code>primary-section=&quot;drawer&quot;</code> is set, then the drawer will move the navbar, taking the full available height.</li>
   * </ul>
   */
  @JSProperty("primarySection")
  PrimarySection getPrimarySection();

  /**
   * Defines whether navbar or drawer will come first visually.
   *
   * <ul>
   * <li>By default (<code>primary-section=&quot;navbar&quot;</code>), the navbar takes the full available width and moves the drawer down.</li>
   * <li>If <code>primary-section=&quot;drawer&quot;</code> is set, then the drawer will move the navbar, taking the full available height.</li>
   * </ul>
   */
  @JSProperty("primarySection")
  void setPrimarySection(PrimarySection value);

  /**
   * Controls whether the drawer is opened (visible) or not.
   * Its default value depends on the viewport:
   *
   * <ul>
   * <li><code>true</code>, for desktop size views</li>
   * <li><code>false</code>, for mobile size views</li>
   * </ul>
   */
  @JSProperty("drawerOpened")
  boolean getDrawerOpened();

  /**
   * Controls whether the drawer is opened (visible) or not.
   * Its default value depends on the viewport:
   *
   * <ul>
   * <li><code>true</code>, for desktop size views</li>
   * <li><code>false</code>, for mobile size views</li>
   * </ul>
   */
  @JSProperty("drawerOpened")
  void setDrawerOpened(boolean value);

  /**
   * Drawer is an overlay on top of the content
   * Controlled via CSS using <code>--vaadin-app-layout-drawer-overlay: true|false</code>;
   *
   */
  @JSProperty("overlay")
  boolean getOverlay();

  /**
   * Helper static method that dispatches a <code>close-overlay-drawer</code> event
   *
   */
  @JSBody(
      script = "AppLayoutElement_AppLayoutElement.dispatchCloseOverlayDrawerEvent()"
  )
  static void dispatchCloseOverlayDrawerEvent() {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }
}
