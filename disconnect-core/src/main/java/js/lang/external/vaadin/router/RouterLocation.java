package js.lang.external.vaadin.router;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

@NpmPackage(
    name = "@vaadin/router",
    version = "^1.7.2"
)
@Import(
    module = "@vaadin/router/dist/vaadin-router.js"
)
public interface RouterLocation extends Any {
  @JSProperty("baseUrl")
  String getBaseUrl();

  @JSProperty("baseUrl")
  void setBaseUrl(String value);

  @JSProperty("params")
  Params getParams();

  @JSProperty("params")
  void setParams(Params value);

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

  @JSProperty("redirectFrom")
  @Nullable
  String getRedirectFrom();

  @JSProperty("redirectFrom")
  void setRedirectFrom(@Nullable String value);

  @JSProperty("route")
  @Nullable
  Route getRoute();

  @JSProperty("route")
  void setRoute(@Nullable Route value);

  @JSProperty("routes")
  Route[] getRoutes();

  @JSProperty("routes")
  void setRoutes(Route... value);

  String getUrl(String[] params);

  String getUrl(@Nullable Params params);

  /**
   *
   */
  String getUrl();

}
