package js.lang.external.lit_html;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.web.dom.Element;
import org.teavm.jso.JSIndexer;
import org.teavm.jso.JSProperty;

@NpmPackage(
    name = "lit-html",
    version = "^1.2.1"
)
@Import(
    module = "lit-html/src/env.js"
)
public interface ShadyCSS extends Any {
  @JSProperty("nativeCss")
  boolean getNativeCss();

  @JSProperty("nativeCss")
  void setNativeCss(boolean value);

  @JSProperty("nativeShadow")
  boolean getNativeShadow();

  @JSProperty("nativeShadow")
  void setNativeShadow(boolean value);

  void styleElement(Element host, @Nullable StyleElementOverrideProps overrideProps);

  /**
   *
   */
  void styleElement(Element host);

  void prepareTemplateDom(Element template, String elementName);

  void prepareTemplateStyles(Element template, String elementName, @Nullable String typeExtension);

  /**
   *
   */
  void prepareTemplateStyles(Element template, String elementName);

  @JSProperty("ScopingShim")
  @Nullable
  ScopingShim getScopingShim();

  @JSProperty("ScopingShim")
  void setScopingShim(@Nullable ScopingShim value);

  interface StyleElementOverrideProps extends Any {
    @JSIndexer
    String get(String key);

    @JSIndexer
    void set(String key, String value);

    class Builder {
      private final StyleElementOverrideProps object = Any.empty();

      public StyleElementOverrideProps build() {
        return object;
      }

      public StyleElementOverrideProps.Builder set(String key, String value) {
        object.set(key, value);
        return this;
      }
    }
  }

  interface ScopingShim extends Any {
    void prepareAdoptedCssText(String[] cssTextArray, String elementName);
  }
}
