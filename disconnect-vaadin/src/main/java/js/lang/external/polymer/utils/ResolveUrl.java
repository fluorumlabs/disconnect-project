package js.lang.external.polymer.utils;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import java.lang.UnsupportedOperationException;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSBody;

@NpmPackage(
    name = "@polymer/polymer",
    version = "^3.4.1"
)
@Import(
    symbols = {"pathFromUrl as ResolveUrl_pathFromUrl", "resolveUrl as ResolveUrl_resolveUrl", "resolveCss as ResolveUrl_resolveCss"},
    module = "@polymer/polymer/lib/utils/resolve-url.js"
)
@Import(
    module = "@polymer/polymer/lib/utils/resolve-url.js"
)
public interface ResolveUrl extends Any {
  /**
   * Resolves the given URL against the provided `baseUri'.
   *
   * Note that this function performs no resolution for URLs that start
   * with <code>/</code> (absolute URLs) or <code>#</code> (hash identifiers).  For general purpose
   * URL resolution, use <code>window.URL</code>.
   *
   * @return resolved URL
   *
   */
  @JSBody(
      params = {"url", "baseURI"},
      script = "return ResolveUrl_resolveUrl(url, baseURI)"
  )
  static String resolveUrl(String url, @Nullable String baseURI) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Resolves the given URL against the provided `baseUri'.
   *
   * Note that this function performs no resolution for URLs that start
   * with <code>/</code> (absolute URLs) or <code>#</code> (hash identifiers).  For general purpose
   * URL resolution, use <code>window.URL</code>.
   *
   * @return resolved URL
   *
   */
  @JSBody(
      params = {"url"},
      script = "return ResolveUrl_resolveUrl(url)"
  )
  static String resolveUrl(String url) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Resolves any relative URL's in the given CSS text against the provided
   * <code>ownerDocument</code>'s <code>baseURI</code>.
   *
   * @return Processed CSS text with resolved URL's
   *
   */
  @JSBody(
      params = {"cssText", "baseURI"},
      script = "return ResolveUrl_resolveCss(cssText, baseURI)"
  )
  static String resolveCss(String cssText, String baseURI) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Returns a path from a given <code>url</code>. The path includes the trailing
   * <code>/</code> from the url.
   *
   * @return resolved path
   *
   */
  @JSBody(
      params = {"url"},
      script = "return ResolveUrl_pathFromUrl(url)"
  )
  static String pathFromUrl(String url) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }
}
