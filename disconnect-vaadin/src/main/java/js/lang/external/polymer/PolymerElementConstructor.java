package js.lang.external.polymer;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import java.lang.UnsupportedOperationException;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown /* string | HTMLTemplateElement | null */;
import js.web.dom.HTMLElement;
import js.web.webcomponents.HTMLTemplateElement;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

@NpmPackage(
    name = "@polymer/polymer",
    version = "^3.4.1"
)
@Import(
    symbols = {"PolymerElementConstructor as PolymerElementConstructor_PolymerElementConstructor"},
    module = "@polymer/polymer/polymer-element.js"
)
@Import(
    module = "@polymer/polymer/polymer-element.js"
)
public interface PolymerElementConstructor extends Any {
  @JSBody(
      script = "return new PolymerElementConstructor_PolymerElementConstructor()"
  )
  static HTMLElement create() {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  @JSProperty("is")
  @Nullable
  String getIs();

  @JSProperty("is")
  void setIs(@Nullable String value);

  @JSProperty("extends")
  @Nullable
  String getExtendsValue();

  @JSProperty("extends")
  void setExtendsValue(@Nullable String value);

  @JSProperty("properties")
  @Nullable
  Properties getProperties();

  @JSProperty("properties")
  void setProperties(@Nullable Properties value);

  @JSProperty("observers")
  @Nullable
  String[] getObservers();

  @JSProperty("observers")
  void setObservers(String[] value);

  @JSProperty("template")
  @Nullable
  Unknown /* string | HTMLTemplateElement | null */ getTemplate();

  @JSProperty("template")
  void setTemplate(@Nullable HTMLTemplateElement value);

  @JSProperty("template")
  void setTemplate(@Nullable String value);
}
