package js.lang.external.vaadin.vaadin_login;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.external.polymer.PolymerElement;
import js.lang.external.vaadin.vaadin_element_mixin.ElementMixin;
import js.lang.external.vaadin.vaadin_themable_mixin.ThemableMixin;
import org.teavm.jso.JSProperty;

/**
 * <code>&lt;vaadin-login-overlay&gt;</code> is a wrapper of the <code>&lt;vaadin-login-form&gt;</code> which opens a login form in an overlay and
 * having an additional <code>brand</code> part for application title and description. Using <code>&lt;vaadin-login-overlay&gt;</code> allows
 * password managers to work with login form.
 *
 * <pre><code>&lt;vaadin-login-overlay opened&gt;&lt;/vaadin-login-overlay&gt;
 * </code></pre>
 * <h3>Styling</h3>
 * To style the element check: <a href="#/elements/vaadin-login-overlay-wrapper"><code>&lt;vaadin-login-overlay-wrapper&gt;</code></a>,
 * <a href="#/elements/vaadin-login-form-wrapper"><code>&lt;vaadin-login-form-wrapper&gt;</code></a>, <a href="#/elements/vaadin-login-form"><code>&lt;vaadin-login-form&gt;</code></a>
 * and <code>&lt;vaadin-overlay&gt;</code> elements
 *
 */
@NpmPackage(
    name = "@vaadin/vaadin-login",
    version = "^1.2.0-alpha2"
)
@Import(
    module = "@vaadin/vaadin-login/src/vaadin-login-overlay.js"
)
public interface LoginOverlayElement extends PolymerElement, LoginMixin, ThemableMixin, ElementMixin {
  /**
   * Defines the application description
   *
   */
  @JSProperty("description")
  String getDescription();

  /**
   * Defines the application description
   *
   */
  @JSProperty("description")
  void setDescription(String value);

  /**
   * True if the overlay is currently displayed.
   *
   */
  @JSProperty("opened")
  boolean getOpened();

  /**
   * True if the overlay is currently displayed.
   *
   */
  @JSProperty("opened")
  void setOpened(boolean value);

  /**
   * Defines the application title
   *
   */
  @JSProperty("title")
  String getTitle();

  /**
   * Defines the application title
   *
   */
  @JSProperty("title")
  void setTitle(String value);

  void ready();
}
