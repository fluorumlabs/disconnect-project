package js.lang.external.vaadin.router;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import js.lang.Promise;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

@NpmPackage(
    name = "@vaadin/router",
    version = "^1.7.2"
)
@Import(
    symbols = {"Resolver as Resolver_Resolver"},
    module = "@vaadin/router/dist/vaadin-router.js"
)
public interface Resolver extends Any {
  @JSBody(
      params = {"routes", "options"},
      script = "return new Resolver_Resolver(routes, options)"
  )
  static Resolver create(Any routes, @Nullable Any options) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   *
   */
  @JSBody(
      params = {"routes", "options"},
      script = "return new Resolver_Resolver(routes, options)"
  )
  static Resolver create(Any routes) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Returns the current list of routes (as a shallow copy). Adding / removing
   * routes to / from the returned array does not affect the routing config,
   * but modifying the route objects does.
   *
   */
  Route[] getRoutes();

  /**
   * Sets the routing config (replacing the existing one).
   *
   * @param routes a single route or an array of those
   * (the array is shallow copied)
   *
   */
  Any setRoutes(Route routes);

  /**
   * Sets the routing config (replacing the existing one).
   *
   * @param routes a single route or an array of those
   * (the array is shallow copied)
   *
   */
  Any setRoutes(Route[] routes);

  /**
   * Appends one or several routes to the routing config and returns the
   * effective routing config after the operation.
   *
   * @param routes a single route or an array of those
   * (the array is shallow copied)
   *
   */
  Route[] addRoutes(Route routes);

  /**
   * Appends one or several routes to the routing config and returns the
   * effective routing config after the operation.
   *
   * @param routes a single route or an array of those
   * (the array is shallow copied)
   *
   */
  Route[] addRoutes(Route[] routes);

  /**
   * Removes all existing routes from the routing config.
   *
   */
  void removeRoutes();

  /**
   * Asynchronously resolves the given pathname, i.e. finds all routes matching
   * the pathname and tries resolving them one after another in the order they
   * are listed in the routes config until the first non-null result.
   *
   * Returns a promise that is fulfilled with the return value of an object that consists of the first
   * route handler result that returns something other than <code>null</code> or <code>undefined</code> and context used to get this result.
   *
   * If no route handlers return a non-null result, or if no route matches the
   * given pathname the returned promise is rejected with a 'page not found'
   * <code>Error</code>.
   *
   * @param pathnameOrContext the pathname to
   * resolve or a context object with a <code>pathname</code> property and other
   * properties to pass to the route resolver functions.
   *
   */
  Promise < Any > resolve(ResolvePathnameOrContext pathnameOrContext);

  /**
   * Asynchronously resolves the given pathname, i.e. finds all routes matching
   * the pathname and tries resolving them one after another in the order they
   * are listed in the routes config until the first non-null result.
   *
   * Returns a promise that is fulfilled with the return value of an object that consists of the first
   * route handler result that returns something other than <code>null</code> or <code>undefined</code> and context used to get this result.
   *
   * If no route handlers return a non-null result, or if no route matches the
   * given pathname the returned promise is rejected with a 'page not found'
   * <code>Error</code>.
   *
   * @param pathnameOrContext the pathname to
   * resolve or a context object with a <code>pathname</code> property and other
   * properties to pass to the route resolver functions.
   *
   */
  Promise < Any > resolve(String pathnameOrContext);

  interface ResolvePathnameOrContext extends Any {
    @JSProperty("pathname")
    String getPathname();

    @JSProperty("pathname")
    void setPathname(String value);

    class Builder {
      private final ResolvePathnameOrContext object = Any.empty();

      public ResolvePathnameOrContext build() {
        return object;
      }

      public Builder pathname(String value) {
        object.setPathname(value);
        return this;
      }
    }
  }
}
