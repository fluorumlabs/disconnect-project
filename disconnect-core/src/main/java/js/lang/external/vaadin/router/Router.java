package js.lang.external.vaadin.router;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Promise;
import js.web.dom.Node;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * A simple client-side router for single-page applications. It uses
 * express-style middleware and has a first-class support for Web Components and
 * lazy-loading. Works great in Polymer and non-Polymer apps.
 *
 * Use <code>new Router(outlet, options)</code> to create a new Router instance.
 *
 * <ul>
 * <li>
 * The <code>outlet</code> parameter is a reference to the DOM node to render
 * the content into.
 *
 * </li>
 * <li>
 * The <code>options</code> parameter is an optional object with options. The following
 * keys are supported:
 *
 * <ul>
 * <li><code>baseUrl</code> — the initial value for <a href="#/classes/Router#property-baseUrl">
 * the <code>baseUrl</code> property
 * </a></li>
 * </ul>
 * </li>
 * </ul>
 * The Router instance is automatically subscribed to navigation events
 * on <code>window</code>.
 *
 * See <a href="#/classes/Router/demos/demo/index.html">Live Examples</a> for the detailed usage demo and code snippets.
 *
 * See also detailed API docs for the following methods, for the advanced usage:
 *
 * <ul>
 * <li><a href="#/classes/Router#method-setOutlet">setOutlet</a> – should be used to configure the outlet.</li>
 * <li><a href="#/classes/Router#method-setTriggers">setTriggers</a> – should be used to configure the navigation events.</li>
 * <li><a href="#/classes/Router#method-setRoutes">setRoutes</a> – should be used to configure the routes.</li>
 * </ul>
 * Only <code>setRoutes</code> has to be called manually, others are automatically invoked when creating a new instance.
 *
 */
@NpmPackage(
    name = "@vaadin/router",
    version = "^1.7.2"
)
@Import(
    symbols = {"Router as Router_Router"},
    module = "@vaadin/router/dist/vaadin-router.js"
)
public interface Router extends Resolver {
  /**
   * The base URL for all routes in the router instance. By default,
   * if the base element exists in the <code>&lt;head&gt;</code>, vaadin-router
   * takes the <code>&lt;base href&gt;</code> attribute value, resolves against current <code>document.URL</code>
   * and gets the <code>pathname</code> from the result.
   *
   */
  @JSProperty("baseUrl")
  String getBaseUrl();

  /**
   * The base URL for all routes in the router instance. By default,
   * if the base element exists in the <code>&lt;head&gt;</code>, vaadin-router
   * takes the <code>&lt;base href&gt;</code> attribute value, resolves against current <code>document.URL</code>
   * and gets the <code>pathname</code> from the result.
   *
   */
  @JSProperty("baseUrl")
  void setBaseUrl(String value);

  /**
   * A promise that is settled after the current render cycle completes. If
   * there is no render cycle in progress the promise is immediately settled
   * with the last render cycle result.
   *
   */
  @JSProperty("ready")
  Promise < RouterLocation > getReady();

  /**
   * A promise that is settled after the current render cycle completes. If
   * there is no render cycle in progress the promise is immediately settled
   * with the last render cycle result.
   *
   */
  @JSProperty("ready")
  void setReady(Promise < RouterLocation > value);

  /**
   * Contains read-only information about the current router location:
   * pathname, active routes, parameters. See the
   * <a href="#/classes/RouterLocation">Location type declaration</a>
   * for more details.
   *
   */
  @JSProperty("location")
  RouterLocation getLocation();

  /**
   * Contains read-only information about the current router location:
   * pathname, active routes, parameters. See the
   * <a href="#/classes/RouterLocation">Location type declaration</a>
   * for more details.
   *
   */
  @JSProperty("location")
  void setLocation(RouterLocation value);

  /**
   * Creates a new Router instance with a given outlet, and
   * automatically subscribes it to navigation events on the <code>window</code>.
   * Using a constructor argument or a setter for outlet is equivalent:
   *
   * <pre><code>const router = new Router();
   * router.setOutlet(outlet);
   * </code></pre>
   */
  @JSBody(
      params = {"outlet", "options"},
      script = "return new Router_Router(outlet, options)"
  )
  static Router create(@Nullable Node outlet, @Nullable RouterOptions options) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Creates a new Router instance with a given outlet, and
   * automatically subscribes it to navigation events on the <code>window</code>.
   * Using a constructor argument or a setter for outlet is equivalent:
   *
   * <pre><code>const router = new Router();
   * router.setOutlet(outlet);
   * </code></pre>
   */
  @JSBody(
      params = {"outlet"},
      script = "return new Router_Router(outlet)"
  )
  static Router create(@Nullable Node outlet) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Creates a new Router instance with a given outlet, and
   * automatically subscribes it to navigation events on the <code>window</code>.
   * Using a constructor argument or a setter for outlet is equivalent:
   *
   * <pre><code>const router = new Router();
   * router.setOutlet(outlet);
   * </code></pre>
   */
  @JSBody(
      params = {},
      script = "return new Router_Router()"
  )
  static Router create() {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Configures what triggers Router navigation events:
   *
   * <ul>
   * <li><code>POPSTATE</code>: popstate events on the current <code>window</code></li>
   * <li><code>CLICK</code>: click events on <code>&lt;a&gt;</code> links leading to the current page</li>
   * </ul>
   * This method is invoked with the pre-configured values when creating a new Router instance.
   * By default, both <code>POPSTATE</code> and <code>CLICK</code> are enabled. This setup is expected to cover most of the use cases.
   *
   * See the <code>router-config.js</code> for the default navigation triggers config. Based on it, you can
   * create the own one and only import the triggers you need, instead of pulling in all the code,
   * e.g. if you want to handle <code>click</code> differently.
   *
   * See also <strong>Navigation Triggers</strong> section in <a href="#/classes/Router/demos/demo/index.html">Live Examples</a>.
   *
   */
  @JSBody(
      params = {"triggers"},
      script = "Router_Router.setTriggers.apply(null, triggers)"
  )
  static void setTriggers(NavigationTrigger... triggers) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Triggers navigation to a new path. Returns a boolean without waiting until
   * the navigation is complete. Returns <code>true</code> if at least one <code>Router</code>
   * has handled the navigation (was subscribed and had <code>baseUrl</code> matching
   * the <code>path</code> argument), otherwise returns <code>false</code>.
   *
   * @param path a new in-app path string, or an URL-like object with <code>pathname</code>
   * string property, and optional <code>search</code> and <code>hash</code> string properties.
   *
   */
  @JSBody(
      params = {"path"},
      script = "return Router_Router.go(path)"
  )
  static boolean go(UrlLike path) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Triggers navigation to a new path. Returns a boolean without waiting until
   * the navigation is complete. Returns <code>true</code> if at least one <code>Router</code>
   * has handled the navigation (was subscribed and had <code>baseUrl</code> matching
   * the <code>path</code> argument), otherwise returns <code>false</code>.
   *
   * @param path a new in-app path string, or an URL-like object with <code>pathname</code>
   * string property, and optional <code>search</code> and <code>hash</code> string properties.
   *
   */
  @JSBody(
      params = {"path"},
      script = "return Router_Router.go(path)"
  )
  static boolean go(String path) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Sets the routing config (replacing the existing one) and triggers a
   * navigation event so that the router outlet is refreshed according to the
   * current <code>window.location</code> and the new routing config.
   *
   * Each route object may have the following properties, listed here in the processing order:
   *
   * <ul>
   * <li>
   * <code>path</code> – the route path (relative to the parent route if any) in the
   * [express.js syntax](https:   *
   *
   * </li>
   * <li>
   * <code>children</code> – an array of nested routes or a function that provides this
   * array at the render time. The function can be synchronous or asynchronous:
   * in the latter case the render is delayed until the returned promise is
   * resolved. The <code>children</code> function is executed every time when this route is
   * being rendered. This allows for dynamic route structures (e.g. backend-defined),
   * but it might have a performance impact as well. In order to avoid calling
   * the function on subsequent renders, you can override the <code>children</code> property
   * of the route object and save the calculated array there
   * (via <code>context.route.children = [ route1, route2, ...];</code>).
   * Parent routes are fully resolved before resolving the children. Children
   * 'path' values are relative to the parent ones.
   *
   * </li>
   * <li>
   * <code>action</code> – the action that is executed before the route is resolved.
   * The value for this property should be a function, accepting <code>context</code>
   * and <code>commands</code> parameters described below. If present, this function is
   * always invoked first, disregarding of the other properties' presence.
   * The action can return a result directly or within a <code>Promise</code>, which
   * resolves to the result. If the action result is an <code>HTMLElement</code> instance,
   * a <code>commands.component(name)</code> result, a <code>commands.redirect(path)</code> result,
   * or a <code>context.next()</code> result, the current route resolution is finished,
   * and other route config properties are ignored.
   * See also <strong>Route Actions</strong> section in <a href="#/classes/Router/demos/demo/index.html">Live Examples</a>.
   *
   * </li>
   * <li>
   * <code>redirect</code> – other route's path to redirect to. Passes all route parameters to the redirect target.
   * The target route should also be defined.
   * See also <strong>Redirects</strong> section in <a href="#/classes/Router/demos/demo/index.html">Live Examples</a>.
   *
   * </li>
   * <li>
   * <code>bundle</code> – string containing the path to <code>.js</code> or <code>.mjs</code> bundle to load before resolving the route,
   * or the object with &quot;module&quot; and &quot;nomodule&quot; keys referring to different bundles.
   * Each bundle is only loaded once. If &quot;module&quot; and &quot;nomodule&quot; are set, only one bundle is loaded,
   * depending on whether the browser supports ES modules or not.
   * The property is ignored when either an <code>action</code> returns the result or <code>redirect</code> property is present.
   * Any error, e.g. 404 while loading bundle will cause route resolution to throw.
   * See also <strong>Code Splitting</strong> section in <a href="#/classes/Router/demos/demo/index.html">Live Examples</a>.
   *
   * </li>
   * <li>
   * <code>component</code> – the tag name of the Web Component to resolve the route to.
   * The property is ignored when either an <code>action</code> returns the result or <code>redirect</code> property is present.
   * If route contains the <code>component</code> property (or an action that return a component)
   * and its child route also contains the <code>component</code> property, child route's component
   * will be rendered as a light dom child of a parent component.
   *
   * </li>
   * <li>
   * <code>name</code> – the string name of the route to use in the
   * <a href="#/classes/Router#method-urlForName"><code>router.urlForName(name, params)</code></a>
   * navigation helper method.
   *
   * </li>
   * </ul>
   * For any route function (<code>action</code>, <code>children</code>) defined, the corresponding <code>route</code> object is available inside the callback
   * through the <code>this</code> reference. If you need to access it, make sure you define the callback as a non-arrow function
   * because arrow functions do not have their own <code>this</code> reference.
   *
   * <code>context</code> object that is passed to <code>action</code> function holds the following properties:
   *
   * <ul>
   * <li>
   * <code>context.pathname</code> – string with the pathname being resolved
   *
   * </li>
   * <li>
   * <code>context.search</code> – search query string
   *
   * </li>
   * <li>
   * <code>context.hash</code> – hash string
   *
   * </li>
   * <li>
   * <code>context.params</code> – object with route parameters
   *
   * </li>
   * <li>
   * <code>context.route</code> – object that holds the route that is currently being rendered.
   *
   * </li>
   * <li>
   * <code>context.next()</code> – function for asynchronously getting the next route
   * contents from the resolution chain (if any)
   *
   * </li>
   * </ul>
   * <code>commands</code> object that is passed to <code>action</code> function has
   * the following methods:
   *
   * <ul>
   * <li>
   * <code>commands.redirect(path)</code> – function that creates a redirect data
   * for the path specified.
   *
   * </li>
   * <li>
   * <code>commands.component(component)</code> – function that creates a new HTMLElement
   * with current context. Note: the component created by this function is reused if visiting the same path twice in row.
   *
   * </li>
   * </ul>
   * @param routes a single route or an array of those
   * @param skipRender configure the router but skip rendering the
   * route corresponding to the current <code>window.location</code> values
   *
   */
  Promise < Node > setRoutes(Route routes, boolean skipRender);

  /**
   * Sets the routing config (replacing the existing one) and triggers a
   * navigation event so that the router outlet is refreshed according to the
   * current <code>window.location</code> and the new routing config.
   *
   * Each route object may have the following properties, listed here in the processing order:
   *
   * <ul>
   * <li>
   * <code>path</code> – the route path (relative to the parent route if any) in the
   * [express.js syntax](https:   *
   *
   * </li>
   * <li>
   * <code>children</code> – an array of nested routes or a function that provides this
   * array at the render time. The function can be synchronous or asynchronous:
   * in the latter case the render is delayed until the returned promise is
   * resolved. The <code>children</code> function is executed every time when this route is
   * being rendered. This allows for dynamic route structures (e.g. backend-defined),
   * but it might have a performance impact as well. In order to avoid calling
   * the function on subsequent renders, you can override the <code>children</code> property
   * of the route object and save the calculated array there
   * (via <code>context.route.children = [ route1, route2, ...];</code>).
   * Parent routes are fully resolved before resolving the children. Children
   * 'path' values are relative to the parent ones.
   *
   * </li>
   * <li>
   * <code>action</code> – the action that is executed before the route is resolved.
   * The value for this property should be a function, accepting <code>context</code>
   * and <code>commands</code> parameters described below. If present, this function is
   * always invoked first, disregarding of the other properties' presence.
   * The action can return a result directly or within a <code>Promise</code>, which
   * resolves to the result. If the action result is an <code>HTMLElement</code> instance,
   * a <code>commands.component(name)</code> result, a <code>commands.redirect(path)</code> result,
   * or a <code>context.next()</code> result, the current route resolution is finished,
   * and other route config properties are ignored.
   * See also <strong>Route Actions</strong> section in <a href="#/classes/Router/demos/demo/index.html">Live Examples</a>.
   *
   * </li>
   * <li>
   * <code>redirect</code> – other route's path to redirect to. Passes all route parameters to the redirect target.
   * The target route should also be defined.
   * See also <strong>Redirects</strong> section in <a href="#/classes/Router/demos/demo/index.html">Live Examples</a>.
   *
   * </li>
   * <li>
   * <code>bundle</code> – string containing the path to <code>.js</code> or <code>.mjs</code> bundle to load before resolving the route,
   * or the object with &quot;module&quot; and &quot;nomodule&quot; keys referring to different bundles.
   * Each bundle is only loaded once. If &quot;module&quot; and &quot;nomodule&quot; are set, only one bundle is loaded,
   * depending on whether the browser supports ES modules or not.
   * The property is ignored when either an <code>action</code> returns the result or <code>redirect</code> property is present.
   * Any error, e.g. 404 while loading bundle will cause route resolution to throw.
   * See also <strong>Code Splitting</strong> section in <a href="#/classes/Router/demos/demo/index.html">Live Examples</a>.
   *
   * </li>
   * <li>
   * <code>component</code> – the tag name of the Web Component to resolve the route to.
   * The property is ignored when either an <code>action</code> returns the result or <code>redirect</code> property is present.
   * If route contains the <code>component</code> property (or an action that return a component)
   * and its child route also contains the <code>component</code> property, child route's component
   * will be rendered as a light dom child of a parent component.
   *
   * </li>
   * <li>
   * <code>name</code> – the string name of the route to use in the
   * <a href="#/classes/Router#method-urlForName"><code>router.urlForName(name, params)</code></a>
   * navigation helper method.
   *
   * </li>
   * </ul>
   * For any route function (<code>action</code>, <code>children</code>) defined, the corresponding <code>route</code> object is available inside the callback
   * through the <code>this</code> reference. If you need to access it, make sure you define the callback as a non-arrow function
   * because arrow functions do not have their own <code>this</code> reference.
   *
   * <code>context</code> object that is passed to <code>action</code> function holds the following properties:
   *
   * <ul>
   * <li>
   * <code>context.pathname</code> – string with the pathname being resolved
   *
   * </li>
   * <li>
   * <code>context.search</code> – search query string
   *
   * </li>
   * <li>
   * <code>context.hash</code> – hash string
   *
   * </li>
   * <li>
   * <code>context.params</code> – object with route parameters
   *
   * </li>
   * <li>
   * <code>context.route</code> – object that holds the route that is currently being rendered.
   *
   * </li>
   * <li>
   * <code>context.next()</code> – function for asynchronously getting the next route
   * contents from the resolution chain (if any)
   *
   * </li>
   * </ul>
   * <code>commands</code> object that is passed to <code>action</code> function has
   * the following methods:
   *
   * <ul>
   * <li>
   * <code>commands.redirect(path)</code> – function that creates a redirect data
   * for the path specified.
   *
   * </li>
   * <li>
   * <code>commands.component(component)</code> – function that creates a new HTMLElement
   * with current context. Note: the component created by this function is reused if visiting the same path twice in row.
   *
   * </li>
   * </ul>
   * @param routes a single route or an array of those
   * @param skipRender configure the router but skip rendering the
   * route corresponding to the current <code>window.location</code> values
   *
   */
  Promise < Node > setRoutes(Route[] routes, boolean skipRender);

  /**
   * Sets the routing config (replacing the existing one) and triggers a
   * navigation event so that the router outlet is refreshed according to the
   * current <code>window.location</code> and the new routing config.
   *
   * Each route object may have the following properties, listed here in the processing order:
   *
   * <ul>
   * <li>
   * <code>path</code> – the route path (relative to the parent route if any) in the
   * [express.js syntax](https:   *
   *
   * </li>
   * <li>
   * <code>children</code> – an array of nested routes or a function that provides this
   * array at the render time. The function can be synchronous or asynchronous:
   * in the latter case the render is delayed until the returned promise is
   * resolved. The <code>children</code> function is executed every time when this route is
   * being rendered. This allows for dynamic route structures (e.g. backend-defined),
   * but it might have a performance impact as well. In order to avoid calling
   * the function on subsequent renders, you can override the <code>children</code> property
   * of the route object and save the calculated array there
   * (via <code>context.route.children = [ route1, route2, ...];</code>).
   * Parent routes are fully resolved before resolving the children. Children
   * 'path' values are relative to the parent ones.
   *
   * </li>
   * <li>
   * <code>action</code> – the action that is executed before the route is resolved.
   * The value for this property should be a function, accepting <code>context</code>
   * and <code>commands</code> parameters described below. If present, this function is
   * always invoked first, disregarding of the other properties' presence.
   * The action can return a result directly or within a <code>Promise</code>, which
   * resolves to the result. If the action result is an <code>HTMLElement</code> instance,
   * a <code>commands.component(name)</code> result, a <code>commands.redirect(path)</code> result,
   * or a <code>context.next()</code> result, the current route resolution is finished,
   * and other route config properties are ignored.
   * See also <strong>Route Actions</strong> section in <a href="#/classes/Router/demos/demo/index.html">Live Examples</a>.
   *
   * </li>
   * <li>
   * <code>redirect</code> – other route's path to redirect to. Passes all route parameters to the redirect target.
   * The target route should also be defined.
   * See also <strong>Redirects</strong> section in <a href="#/classes/Router/demos/demo/index.html">Live Examples</a>.
   *
   * </li>
   * <li>
   * <code>bundle</code> – string containing the path to <code>.js</code> or <code>.mjs</code> bundle to load before resolving the route,
   * or the object with &quot;module&quot; and &quot;nomodule&quot; keys referring to different bundles.
   * Each bundle is only loaded once. If &quot;module&quot; and &quot;nomodule&quot; are set, only one bundle is loaded,
   * depending on whether the browser supports ES modules or not.
   * The property is ignored when either an <code>action</code> returns the result or <code>redirect</code> property is present.
   * Any error, e.g. 404 while loading bundle will cause route resolution to throw.
   * See also <strong>Code Splitting</strong> section in <a href="#/classes/Router/demos/demo/index.html">Live Examples</a>.
   *
   * </li>
   * <li>
   * <code>component</code> – the tag name of the Web Component to resolve the route to.
   * The property is ignored when either an <code>action</code> returns the result or <code>redirect</code> property is present.
   * If route contains the <code>component</code> property (or an action that return a component)
   * and its child route also contains the <code>component</code> property, child route's component
   * will be rendered as a light dom child of a parent component.
   *
   * </li>
   * <li>
   * <code>name</code> – the string name of the route to use in the
   * <a href="#/classes/Router#method-urlForName"><code>router.urlForName(name, params)</code></a>
   * navigation helper method.
   *
   * </li>
   * </ul>
   * For any route function (<code>action</code>, <code>children</code>) defined, the corresponding <code>route</code> object is available inside the callback
   * through the <code>this</code> reference. If you need to access it, make sure you define the callback as a non-arrow function
   * because arrow functions do not have their own <code>this</code> reference.
   *
   * <code>context</code> object that is passed to <code>action</code> function holds the following properties:
   *
   * <ul>
   * <li>
   * <code>context.pathname</code> – string with the pathname being resolved
   *
   * </li>
   * <li>
   * <code>context.search</code> – search query string
   *
   * </li>
   * <li>
   * <code>context.hash</code> – hash string
   *
   * </li>
   * <li>
   * <code>context.params</code> – object with route parameters
   *
   * </li>
   * <li>
   * <code>context.route</code> – object that holds the route that is currently being rendered.
   *
   * </li>
   * <li>
   * <code>context.next()</code> – function for asynchronously getting the next route
   * contents from the resolution chain (if any)
   *
   * </li>
   * </ul>
   * <code>commands</code> object that is passed to <code>action</code> function has
   * the following methods:
   *
   * <ul>
   * <li>
   * <code>commands.redirect(path)</code> – function that creates a redirect data
   * for the path specified.
   *
   * </li>
   * <li>
   * <code>commands.component(component)</code> – function that creates a new HTMLElement
   * with current context. Note: the component created by this function is reused if visiting the same path twice in row.
   *
   * </li>
   * </ul>
   * @param routes a single route or an array of those
   */
  Promise < Node > setRoutes(Route routes);

  /**
   * Sets the routing config (replacing the existing one) and triggers a
   * navigation event so that the router outlet is refreshed according to the
   * current <code>window.location</code> and the new routing config.
   *
   * Each route object may have the following properties, listed here in the processing order:
   *
   * <ul>
   * <li>
   * <code>path</code> – the route path (relative to the parent route if any) in the
   * [express.js syntax](https:   *
   *
   * </li>
   * <li>
   * <code>children</code> – an array of nested routes or a function that provides this
   * array at the render time. The function can be synchronous or asynchronous:
   * in the latter case the render is delayed until the returned promise is
   * resolved. The <code>children</code> function is executed every time when this route is
   * being rendered. This allows for dynamic route structures (e.g. backend-defined),
   * but it might have a performance impact as well. In order to avoid calling
   * the function on subsequent renders, you can override the <code>children</code> property
   * of the route object and save the calculated array there
   * (via <code>context.route.children = [ route1, route2, ...];</code>).
   * Parent routes are fully resolved before resolving the children. Children
   * 'path' values are relative to the parent ones.
   *
   * </li>
   * <li>
   * <code>action</code> – the action that is executed before the route is resolved.
   * The value for this property should be a function, accepting <code>context</code>
   * and <code>commands</code> parameters described below. If present, this function is
   * always invoked first, disregarding of the other properties' presence.
   * The action can return a result directly or within a <code>Promise</code>, which
   * resolves to the result. If the action result is an <code>HTMLElement</code> instance,
   * a <code>commands.component(name)</code> result, a <code>commands.redirect(path)</code> result,
   * or a <code>context.next()</code> result, the current route resolution is finished,
   * and other route config properties are ignored.
   * See also <strong>Route Actions</strong> section in <a href="#/classes/Router/demos/demo/index.html">Live Examples</a>.
   *
   * </li>
   * <li>
   * <code>redirect</code> – other route's path to redirect to. Passes all route parameters to the redirect target.
   * The target route should also be defined.
   * See also <strong>Redirects</strong> section in <a href="#/classes/Router/demos/demo/index.html">Live Examples</a>.
   *
   * </li>
   * <li>
   * <code>bundle</code> – string containing the path to <code>.js</code> or <code>.mjs</code> bundle to load before resolving the route,
   * or the object with &quot;module&quot; and &quot;nomodule&quot; keys referring to different bundles.
   * Each bundle is only loaded once. If &quot;module&quot; and &quot;nomodule&quot; are set, only one bundle is loaded,
   * depending on whether the browser supports ES modules or not.
   * The property is ignored when either an <code>action</code> returns the result or <code>redirect</code> property is present.
   * Any error, e.g. 404 while loading bundle will cause route resolution to throw.
   * See also <strong>Code Splitting</strong> section in <a href="#/classes/Router/demos/demo/index.html">Live Examples</a>.
   *
   * </li>
   * <li>
   * <code>component</code> – the tag name of the Web Component to resolve the route to.
   * The property is ignored when either an <code>action</code> returns the result or <code>redirect</code> property is present.
   * If route contains the <code>component</code> property (or an action that return a component)
   * and its child route also contains the <code>component</code> property, child route's component
   * will be rendered as a light dom child of a parent component.
   *
   * </li>
   * <li>
   * <code>name</code> – the string name of the route to use in the
   * <a href="#/classes/Router#method-urlForName"><code>router.urlForName(name, params)</code></a>
   * navigation helper method.
   *
   * </li>
   * </ul>
   * For any route function (<code>action</code>, <code>children</code>) defined, the corresponding <code>route</code> object is available inside the callback
   * through the <code>this</code> reference. If you need to access it, make sure you define the callback as a non-arrow function
   * because arrow functions do not have their own <code>this</code> reference.
   *
   * <code>context</code> object that is passed to <code>action</code> function holds the following properties:
   *
   * <ul>
   * <li>
   * <code>context.pathname</code> – string with the pathname being resolved
   *
   * </li>
   * <li>
   * <code>context.search</code> – search query string
   *
   * </li>
   * <li>
   * <code>context.hash</code> – hash string
   *
   * </li>
   * <li>
   * <code>context.params</code> – object with route parameters
   *
   * </li>
   * <li>
   * <code>context.route</code> – object that holds the route that is currently being rendered.
   *
   * </li>
   * <li>
   * <code>context.next()</code> – function for asynchronously getting the next route
   * contents from the resolution chain (if any)
   *
   * </li>
   * </ul>
   * <code>commands</code> object that is passed to <code>action</code> function has
   * the following methods:
   *
   * <ul>
   * <li>
   * <code>commands.redirect(path)</code> – function that creates a redirect data
   * for the path specified.
   *
   * </li>
   * <li>
   * <code>commands.component(component)</code> – function that creates a new HTMLElement
   * with current context. Note: the component created by this function is reused if visiting the same path twice in row.
   *
   * </li>
   * </ul>
   * @param routes a single route or an array of those
   */
  Promise < Node > setRoutes(Route[] routes);

  /**
   * Sets the router outlet (the DOM node where the content for the current
   * route is inserted). Any content pre-existing in the router outlet is
   * removed at the end of each render pass.
   *
   * NOTE: this method is automatically invoked first time when creating a new Router instance.
   *
   * @param outlet the DOM node where the content for the current route
   * is inserted.
   *
   */
  void setOutlet(@Nullable Node outlet);

  /**
   * Sets the router outlet (the DOM node where the content for the current
   * route is inserted). Any content pre-existing in the router outlet is
   * removed at the end of each render pass.
   *
   * NOTE: this method is automatically invoked first time when creating a new Router instance.
   *
   */
  void setOutlet();

  /**
   * Returns the current router outlet. The initial value is <code>undefined</code>.
   *
   * @return the current router outlet (or <code>undefined</code>)
   *
   */
  @Nullable
  Node getOutlet();

  /**
   * Asynchronously resolves the given pathname and renders the resolved route
   * component into the router outlet. If no router outlet is set at the time of
   * calling this method, or at the time when the route resolution is completed,
   * a <code>TypeError</code> is thrown.
   *
   * Returns a promise that is fulfilled with the router outlet DOM Node after
   * the route component is created and inserted into the router outlet, or
   * rejected if no route matches the given path.
   *
   * If another render pass is started before the previous one is completed, the
   * result of the previous render pass is ignored.
   *
   * @param pathnameOrContext the pathname to render or a context object with a <code>pathname</code> property,
   * optional <code>search</code> and <code>hash</code> properties, and other properties
   * to pass to the resolver.
   * @param shouldUpdateHistory update browser history with the rendered location
   *
   */
  Promise < Node > render(UrlLike pathnameOrContext, boolean shouldUpdateHistory);

  /**
   * Asynchronously resolves the given pathname and renders the resolved route
   * component into the router outlet. If no router outlet is set at the time of
   * calling this method, or at the time when the route resolution is completed,
   * a <code>TypeError</code> is thrown.
   *
   * Returns a promise that is fulfilled with the router outlet DOM Node after
   * the route component is created and inserted into the router outlet, or
   * rejected if no route matches the given path.
   *
   * If another render pass is started before the previous one is completed, the
   * result of the previous render pass is ignored.
   *
   * @param pathnameOrContext the pathname to render or a context object with a <code>pathname</code> property,
   * optional <code>search</code> and <code>hash</code> properties, and other properties
   * to pass to the resolver.
   * @param shouldUpdateHistory update browser history with the rendered location
   *
   */
  Promise < Node > render(String pathnameOrContext, boolean shouldUpdateHistory);

  /**
   * Asynchronously resolves the given pathname and renders the resolved route
   * component into the router outlet. If no router outlet is set at the time of
   * calling this method, or at the time when the route resolution is completed,
   * a <code>TypeError</code> is thrown.
   *
   * Returns a promise that is fulfilled with the router outlet DOM Node after
   * the route component is created and inserted into the router outlet, or
   * rejected if no route matches the given path.
   *
   * If another render pass is started before the previous one is completed, the
   * result of the previous render pass is ignored.
   *
   * @param pathnameOrContext the pathname to render or a context object with a <code>pathname</code> property,
   * optional <code>search</code> and <code>hash</code> properties, and other properties
   * to pass to the resolver.
   */
  Promise < Node > render(UrlLike pathnameOrContext);

  /**
   * Asynchronously resolves the given pathname and renders the resolved route
   * component into the router outlet. If no router outlet is set at the time of
   * calling this method, or at the time when the route resolution is completed,
   * a <code>TypeError</code> is thrown.
   *
   * Returns a promise that is fulfilled with the router outlet DOM Node after
   * the route component is created and inserted into the router outlet, or
   * rejected if no route matches the given path.
   *
   * If another render pass is started before the previous one is completed, the
   * result of the previous render pass is ignored.
   *
   * @param pathnameOrContext the pathname to render or a context object with a <code>pathname</code> property,
   * optional <code>search</code> and <code>hash</code> properties, and other properties
   * to pass to the resolver.
   */
  Promise < Node > render(String pathnameOrContext);

  /**
   * Subscribes this instance to navigation events on the <code>window</code>.
   *
   * NOTE: beware of resource leaks. For as long as a router instance is
   * subscribed to navigation events, it won't be garbage collected.
   *
   */
  void subscribe();

  /**
   * Removes the subscription to navigation events created in the <code>subscribe()</code>
   * method.
   *
   */
  void unsubscribe();

  /**
   * Generates a URL for the route with the given name, optionally performing
   * substitution of parameters.
   *
   * The route is searched in all the Router instances subscribed to
   * navigation events.
   *
   * <strong>Note:</strong> For child route names, only array children are considered.
   * It is not possible to generate URLs using a name for routes set with
   * a children function.
   *
   * @param name the route name or the route’s <code>component</code> name.
   * @param params Optional object with route path parameters.
   * Named parameters are passed by name (<code>params[name] = value</code>), unnamed
   * parameters are passed by index (<code>params[index] = value</code>).
   *
   */
  String urlForName(String name, String[] params);

  /**
   * Generates a URL for the route with the given name, optionally performing
   * substitution of parameters.
   *
   * The route is searched in all the Router instances subscribed to
   * navigation events.
   *
   * <strong>Note:</strong> For child route names, only array children are considered.
   * It is not possible to generate URLs using a name for routes set with
   * a children function.
   *
   * @param name the route name or the route’s <code>component</code> name.
   * @param params Optional object with route path parameters.
   * Named parameters are passed by name (<code>params[name] = value</code>), unnamed
   * parameters are passed by index (<code>params[index] = value</code>).
   *
   */
  String urlForName(String name, @Nullable Params params);

  /**
   * Generates a URL for the route with the given name, optionally performing
   * substitution of parameters.
   *
   * The route is searched in all the Router instances subscribed to
   * navigation events.
   *
   * <strong>Note:</strong> For child route names, only array children are considered.
   * It is not possible to generate URLs using a name for routes set with
   * a children function.
   *
   * @param name the route name or the route’s <code>component</code> name.
   */
  String urlForName(String name);

  /**
   * Generates a URL for the given route path, optionally performing
   * substitution of parameters.
   *
   * @param path string route path declared in [express.js syntax](https:   * @param params Optional object with route path parameters.
   * Named parameters are passed by name (<code>params[name] = value</code>), unnamed
   * parameters are passed by index (<code>params[index] = value</code>).
   *
   */
  String urlForPath(String path, String[] params);

  /**
   * Generates a URL for the given route path, optionally performing
   * substitution of parameters.
   *
   * @param path string route path declared in [express.js syntax](https:   * @param params Optional object with route path parameters.
   * Named parameters are passed by name (<code>params[name] = value</code>), unnamed
   * parameters are passed by index (<code>params[index] = value</code>).
   *
   */
  String urlForPath(String path, @Nullable Params params);

  /**
   * Generates a URL for the given route path, optionally performing
   * substitution of parameters.
   *
   * @param path string route path declared in [express.js syntax](https:   * 
   */
  String urlForPath(String path);

}
