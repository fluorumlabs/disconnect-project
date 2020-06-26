package js.lang.external.vaadin.vaadin_list_mixin;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.UnsupportedOperationException;
import js.lang.Any;
import org.teavm.jso.JSBody;

@NpmPackage(
    name = "@vaadin/vaadin-list-mixin",
    version = "^2.5.0"
)
@Import(
    symbols = {"ListMixinConstructor as ListMixinConstructor_ListMixinConstructor"},
    module = "@vaadin/vaadin-list-mixin/vaadin-list-mixin.js"
)
@Import(
    module = "@vaadin/vaadin-list-mixin/vaadin-list-mixin.js"
)
public interface ListMixinConstructor extends Any {
  @JSBody(
      params = {"args"},
      script = "return ListMixinConstructor_ListMixinConstructor.apply(null, args)"
  )
  static ListMixin create(Any... args) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }
}
