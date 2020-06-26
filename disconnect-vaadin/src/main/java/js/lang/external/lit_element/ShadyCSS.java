package js.lang.external.lit_element;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.web.dom.Element;
import org.teavm.jso.JSIndexer;
import org.teavm.jso.JSProperty;

@NpmPackage(
    name = "lit-element",
    version = "^2.3.1"
)
@Import(
    module = "lit-element/src/env.js"
)
public interface ShadyCSS extends Any {
  void styleElement(Element host, @Nullable StyleElementOverrideProps overrideProps);

  /**
   *
   */
  void styleElement(Element host);

  String getComputedStyleValue(Element element, String property);

  @JSProperty("ScopingShim")
  @Nullable
  ScopingShim getScopingShim();

  @JSProperty("ScopingShim")
  void setScopingShim(@Nullable ScopingShim value);

  @JSProperty("nativeShadow")
  boolean getNativeShadow();

  @JSProperty("nativeShadow")
  void setNativeShadow(boolean value);

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
    void prepareAdoptedCssText(String[] cssText, String name);
  }
}
