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
  @JSProperty("pathname")
  String getPathname();

  @JSProperty("search")
  @Nullable
  String getSearch();

  @JSProperty("hash")
  @Nullable
  String getHash();

  @JSProperty("baseUrl")
  String getBaseUrl();

  @JSProperty("params")
  Params getParams();

  @JSProperty("redirectFrom")
  @Nullable
  String getRedirectFrom();

  @JSProperty("route")
  @Nullable
  Route getRoute();

  @JSProperty("routes")
  Route[] getRoutes();

  String getUrl(String[] params);

  String getUrl(@Nullable Params params);

  /**
   *
   */
  String getUrl();
}
