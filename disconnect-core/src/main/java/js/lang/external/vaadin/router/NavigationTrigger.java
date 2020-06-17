package js.lang.external.vaadin.router;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;

@NpmPackage(
    name = "@vaadin/router",
    version = "^1.7.2"
)
@Import(
    module = "@vaadin/router/dist/vaadin-router.js"
)
public interface NavigationTrigger extends Any {
  void activate();

  void inactivate();
}
