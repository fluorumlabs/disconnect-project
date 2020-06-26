package js.lang.external.lit_element;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import org.teavm.jso.JSProperty;

@NpmPackage(
    name = "lit-element",
    version = "^2.3.1"
)
@Import(
    module = "lit-element/src/env.js"
)
public interface Env extends Any {
  interface ShadowRoot extends Any {
    @JSProperty("prototype")
    js.web.webcomponents.ShadowRoot getPrototype();

    @JSProperty("prototype")
    void setPrototype(js.web.webcomponents.ShadowRoot value);
  }
}
