package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown /* ( boolean | number | string | Array < SVGDefinitionObject > | undefined ) */;
import org.teavm.jso.JSIndexer;
import org.teavm.jso.JSProperty;

/**
 * Serialized form of an SVG definition, including children. Some key property
 * names are reserved: tagName, textContent, and children.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface SVGDefinitionObject extends Any {
  @JSIndexer
  @Nullable
  Unknown /* ( boolean | number | string | Array < SVGDefinitionObject > | undefined ) */ get(
      String key);

  @JSIndexer
  void set(String key, boolean value);

  @JSIndexer
  void set(String key, double value);

  @JSIndexer
  void set(String key, @Nullable String value);

  @JSIndexer
  void set(String key, SVGDefinitionObject[] value);

  @JSProperty("children")
  @Nullable
  SVGDefinitionObject[] getChildren();

  @JSProperty("children")
  void setChildren(SVGDefinitionObject[] value);

  @JSProperty("tagName")
  @Nullable
  String getTagName();

  @JSProperty("tagName")
  void setTagName(@Nullable String value);

  @JSProperty("textContent")
  @Nullable
  String getTextContent();

  @JSProperty("textContent")
  void setTextContent(@Nullable String value);

  class Builder {
    private final SVGDefinitionObject object = Any.empty();

    public SVGDefinitionObject build() {
      return object;
    }

    public Builder set(String key, boolean value) {
      object.set(key, value);
      return this;
    }

    public Builder set(String key, double value) {
      object.set(key, value);
      return this;
    }

    public Builder set(String key, @Nullable String value) {
      object.set(key, value);
      return this;
    }

    public Builder set(String key, SVGDefinitionObject[] value) {
      object.set(key, value);
      return this;
    }

    public Builder children(SVGDefinitionObject[] value) {
      object.setChildren(value);
      return this;
    }

    public Builder tagName(@Nullable String value) {
      object.setTagName(value);
      return this;
    }

    public Builder textContent(@Nullable String value) {
      object.setTextContent(value);
      return this;
    }
  }
}
