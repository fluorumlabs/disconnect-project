package js.lang.external.vaadin.vaadin_app_layout;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.external.vaadin.vaadin_button.ButtonElement;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * The Drawer Toggle component controls the drawer in App Layout component.
 *
 * <pre><code>&lt;vaadin-app-layout&gt;
 *   &lt;vaadin-drawer-toggle slot=&quot;navbar&quot;&gt;Toggle drawer&lt;/vaadin-drawer-toggle&gt;
 * &lt;/vaadin-app-layout&gt;
 * </code></pre>
 */
@NpmPackage(
    name = "@vaadin/vaadin-app-layout",
    version = "^2.2.0-alpha1"
)
@Import(
    module = "@vaadin/vaadin-app-layout/src/vaadin-drawer-toggle.js"
)
public interface DrawerToggleElement extends ButtonElement {
  @JSProperty("ariaLabel")
  @Nullable
  String getAriaLabel();

  @JSProperty("ariaLabel")
  void setAriaLabel(@Nullable String value);
}
