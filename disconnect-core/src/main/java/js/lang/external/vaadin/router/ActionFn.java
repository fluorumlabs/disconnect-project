package js.lang.external.vaadin.router;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import org.teavm.jso.JSFunctor;

import javax.annotation.Nullable;

@NpmPackage(
    name = "@vaadin/router",
    version = "^1.7.2"
)
@Import(
    module = "@vaadin/router/dist/vaadin-router.js"
)
@JSFunctor
@FunctionalInterface
public interface ActionFn extends Any {
  @Nullable
  Any apply(Context context, Commands commands);
}
