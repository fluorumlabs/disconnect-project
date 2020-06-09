package js.lang.external.polymer.lib.utils;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import java.lang.UnsupportedOperationException;
import javax.annotation.Nullable;
import js.lang.Any;
import js.web.dom.HTMLStyleElement;
import js.web.webcomponents.HTMLTemplateElement;
import org.teavm.jso.JSBody;

@NpmPackage(
    name = "@polymer/polymer",
    version = "^3.4.1"
)
@Import(
    symbols = {"stylesFromModule as StyleGather_stylesFromModule", "cssFromModules as StyleGather_cssFromModules", "cssFromModule as StyleGather_cssFromModule", "cssFromTemplate as StyleGather_cssFromTemplate", "cssFromModuleImports as StyleGather_cssFromModuleImports", "stylesFromModuleImports as StyleGather_stylesFromModuleImports", "stylesFromModules as StyleGather_stylesFromModules", "stylesFromTemplate as StyleGather_stylesFromTemplate"},
    module = "@polymer/polymer/lib/utils/style-gather.js"
)
public interface StyleGather extends Any {
  /**
   * Returns a list of <style> elements in a space-separated list of <code>dom-module</code>s.
   *
   * @return Array of contained <style> elements
   *
   */
  @JSBody(
      params = {"moduleIds"},
      script = "return StyleGather_stylesFromModules(moduleIds)"
  )
  static HTMLStyleElement[] stylesFromModules(String moduleIds) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Returns a list of <style> elements in a given <code>dom-module</code>.
   * Styles in a <code>dom-module</code> can come either from <code>&lt;style&gt;</code>s within the
   * first <code>&lt;template&gt;</code>, or else from one or more
   * <code>&lt;link rel=&quot;import&quot; type=&quot;css&quot;&gt;</code> links outside the template.
   *
   * @return Array of contained styles.
   *
   */
  @JSBody(
      params = {"moduleId"},
      script = "return StyleGather_stylesFromModule(moduleId)"
  )
  static HTMLStyleElement[] stylesFromModule(String moduleId) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Returns the <code>&lt;style&gt;</code> elements within a given template.
   *
   * @return Array of styles
   *
   */
  @JSBody(
      params = {"template", "baseURI"},
      script = "return StyleGather_stylesFromTemplate(template, baseURI)"
  )
  static HTMLStyleElement[] stylesFromTemplate(HTMLTemplateElement template,
      @Nullable String baseURI) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Returns the <code>&lt;style&gt;</code> elements within a given template.
   *
   * @return Array of styles
   *
   */
  @JSBody(
      params = {"template", "baseURI"},
      script = "return StyleGather_stylesFromTemplate(template, baseURI)"
  )
  static HTMLStyleElement[] stylesFromTemplate(HTMLTemplateElement template) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Returns a list of <style> elements  from stylesheets loaded via <code>&lt;link rel=&quot;import&quot; type=&quot;css&quot;&gt;</code> links within the specified <code>dom-module</code>.
   *
   * @return Array of contained styles.
   *
   */
  @JSBody(
      params = {"moduleId"},
      script = "return StyleGather_stylesFromModuleImports(moduleId)"
  )
  static HTMLStyleElement[] stylesFromModuleImports(String moduleId) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Returns CSS text of styles in a space-separated list of <code>dom-module</code>s.
   * Note: This method is deprecated, use <code>stylesFromModules</code> instead.
   *
   * @return Concatenated CSS content from specified <code>dom-module</code>s
   *
   */
  @JSBody(
      params = {"moduleIds"},
      script = "return StyleGather_cssFromModules(moduleIds)"
  )
  static String cssFromModules(String moduleIds) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Returns CSS text of styles in a given <code>dom-module</code>.  CSS in a <code>dom-module</code>
   * can come either from <code>&lt;style&gt;</code>s within the first <code>&lt;template&gt;</code>, or else
   * from one or more <code>&lt;link rel=&quot;import&quot; type=&quot;css&quot;&gt;</code> links outside the
   * template.
   *
   * Any <code>&lt;styles&gt;</code> processed are removed from their original location.
   * Note: This method is deprecated, use <code>styleFromModule</code> instead.
   *
   * @return Concatenated CSS content from specified <code>dom-module</code>
   *
   */
  @JSBody(
      params = {"moduleId"},
      script = "return StyleGather_cssFromModule(moduleId)"
  )
  static String cssFromModule(String moduleId) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Returns CSS text of <code>&lt;styles&gt;</code> within a given template.
   *
   * Any <code>&lt;styles&gt;</code> processed are removed from their original location.
   * Note: This method is deprecated, use <code>styleFromTemplate</code> instead.
   *
   * @return Concatenated CSS content from specified template
   *
   */
  @JSBody(
      params = {"template", "baseURI"},
      script = "return StyleGather_cssFromTemplate(template, baseURI)"
  )
  static String cssFromTemplate(HTMLTemplateElement template, String baseURI) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Returns CSS text from stylesheets loaded via <code>&lt;link rel=&quot;import&quot; type=&quot;css&quot;&gt;</code>
   * links within the specified <code>dom-module</code>.
   *
   * Note: This method is deprecated, use <code>stylesFromModuleImports</code> instead.
   *
   * @return Concatenated CSS content from links in specified <code>dom-module</code>
   *
   */
  @JSBody(
      params = {"moduleId"},
      script = "return StyleGather_cssFromModuleImports(moduleId)"
  )
  static String cssFromModuleImports(String moduleId) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }
}
