package js.lang.external.vaadin.vaadin_themable_mixin;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

@NpmPackage(
    name = "@vaadin/vaadin-themable-mixin",
    version = "^1.6.1"
)
@Import(
    module = "@vaadin/vaadin-themable-mixin/vaadin-theme-property-mixin.js"
)
public interface ThemePropertyMixin extends Any {
  /**
   * Helper property with theme attribute value facilitating propagation
   * in shadow DOM.
   *
   * Enables the component implementation to propagate the <code>theme</code>
   * attribute value to the subcomponents in Shadow DOM by binding
   * the subcomponent’s &quot;theme&quot; attribute to the <code>theme</code> property of
   * the host.
   *
   * <strong>NOTE:</strong> Extending the mixin only provides the property for binding,
   * and does not make the propagation alone.
   *
   * See <a href="https://github.com/vaadin/vaadin-themable-mixin/wiki/5.-Theme-Attribute-and-Subcomponents">Theme Attribute and Subcomponents</a>.
   * page for more information.
   *
   */
  @JSProperty("theme")
  @Nullable
  String getTheme();
}
