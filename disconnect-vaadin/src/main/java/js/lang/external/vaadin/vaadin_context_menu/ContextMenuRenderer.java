package js.lang.external.vaadin.vaadin_context_menu;

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
    name = "@vaadin/vaadin-context-menu",
    version = "^4.5.0-alpha2"
)
@Import(
    module = "@vaadin/vaadin-context-menu/vaadin-context-menu.js"
)
public interface ContextMenuRenderer extends Any {
  void apply(HTMLElement root, @Nullable ContextMenuElement contextMenu,
      @Nullable ContextMenuRendererContext context);
}
