package js.lang.external.vaadin.vaadin_combo_box;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.FunctionalInterface;
import js.lang.Any;
import js.web.dom.HTMLElement;
import org.teavm.jso.JSFunctor;

@FunctionalInterface
@JSFunctor
@NpmPackage(
    name = "@vaadin/vaadin-combo-box",
    version = "^5.3.0-alpha4"
)
@Import(
    module = "@vaadin/vaadin-combo-box/vaadin-combo-box.js"
)
public interface ComboBoxRenderer extends Any {
  void apply(HTMLElement root, ComboBoxElement comboBox, ComboBoxItemModel model);
}
