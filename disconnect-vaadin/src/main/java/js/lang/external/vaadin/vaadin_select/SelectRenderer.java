package js.lang.external.vaadin.vaadin_select;

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
    name = "@vaadin/vaadin-select",
    version = "^2.3.0-alpha4"
)
@Import(
    module = "@vaadin/vaadin-select/vaadin-select.js"
)
public interface SelectRenderer extends Any {
  void apply(HTMLElement root, @Nullable SelectElement select);
}
