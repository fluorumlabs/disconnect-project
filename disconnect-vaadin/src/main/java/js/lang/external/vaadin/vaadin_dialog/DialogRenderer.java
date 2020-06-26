package js.lang.external.vaadin.vaadin_dialog;

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
    name = "@vaadin/vaadin-dialog",
    version = "^2.5.0-alpha4"
)
@Import(
    module = "@vaadin/vaadin-dialog/vaadin-dialog.js"
)
public interface DialogRenderer extends Any {
  void apply(HTMLElement root, @Nullable DialogElement dialog);
}