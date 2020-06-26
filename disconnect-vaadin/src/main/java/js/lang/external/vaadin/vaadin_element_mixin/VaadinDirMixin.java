package js.lang.external.vaadin.vaadin_element_mixin;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.UnsupportedOperationException;
import js.lang.Any;
import js.lang.JsFunction;
import org.teavm.jso.JSBody;

@NpmPackage(
    name = "@vaadin/vaadin-element-mixin",
    version = "^2.4.1"
)
@Import(
    symbols = {"DirMixin as VaadinDirMixin_DirMixin"},
    module = "@vaadin/vaadin-element-mixin/vaadin-dir-mixin.js"
)
@Import(
    module = "@vaadin/vaadin-element-mixin/vaadin-dir-mixin.js"
)
public interface VaadinDirMixin extends Any {
  /**
   * DO NOT EDIT
   *
   * This file was automatically generated by
   * <a href="https://github.com/Polymer/tools/tree/master/packages/gen-typescript-declarations">https://github.com/Polymer/tools/tree/master/packages/gen-typescript-declarations</a>
   *
   * To modify these typings, edit the source file(s):
   * vaadin-dir-mixin.js
   *
   */
  @JSBody(
      params = {"base"},
      script = "return VaadinDirMixin_DirMixin(base)"
  )
  static <T extends JsFunction> Any DirMixin(T base) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }
}