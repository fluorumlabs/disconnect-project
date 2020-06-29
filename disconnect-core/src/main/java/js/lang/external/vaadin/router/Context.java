package js.lang.external.vaadin.router;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import js.lang.Unknown;
import org.teavm.jso.JSProperty;

@NpmPackage(
    name = "@vaadin/router",
    version = "^1.7.2"
)
@Import(
    module = "@vaadin/router/dist/vaadin-router.js"
)
public interface Context extends Any {
  @JSProperty("pathname")
  String getPathname();

  @JSProperty("pathname")
  void setPathname(String value);

  @JSProperty("search")
  String getSearch();

  @JSProperty("search")
  void setSearch(String value);

  @JSProperty("hash")
  String getHash();

  @JSProperty("hash")
  void setHash(String value);

  @JSProperty("params")
  Params getParams();

  @JSProperty("params")
  void setParams(Params value);

  @JSProperty("route")
  Route getRoute();

  @JSProperty("route")
  void setRoute(Route value);

  Unknown /* Promise < ActionResult > */ next();
}
