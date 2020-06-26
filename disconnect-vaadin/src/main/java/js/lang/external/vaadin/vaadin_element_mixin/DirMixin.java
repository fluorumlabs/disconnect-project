package js.lang.external.vaadin.vaadin_element_mixin;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import js.web.dom.Dir;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

@NpmPackage(
    name = "@vaadin/vaadin-element-mixin",
    version = "^2.4.1"
)
@Import(
    module = "@vaadin/vaadin-element-mixin/vaadin-dir-mixin.js"
)
public interface DirMixin extends Any {
  @JSProperty("dir")
  @Nullable
  Dir getDir();
}
