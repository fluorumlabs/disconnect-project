package js.lang.external.vaadin.vaadin_overlay;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.FunctionalInterface;
import javax.annotation.Nullable;
import js.lang.Any;
import js.web.dom.HTMLElement;
import org.teavm.jso.JSFunctor;

@FunctionalInterface
@JSFunctor
@NpmPackage(
    name = "@vaadin/vaadin-overlay",
    version = "^3.5.1"
)
@Import(
    module = "@vaadin/vaadin-overlay/vaadin-overlay.js"
)
public interface OverlayRenderer extends Any {
  void apply(HTMLElement root, HTMLElement owner, @Nullable Any model);
}
