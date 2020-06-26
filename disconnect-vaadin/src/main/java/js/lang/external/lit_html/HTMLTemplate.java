package js.lang.external.lit_html;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.extras.JsEnum;
import js.lang.Any;
import js.web.webcomponents.HTMLTemplateElement;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

@NpmPackage(
    name = "lit-html",
    version = "^1.2.1"
)
@Import(
    symbols = {"HTMLTemplate as HTMLTemplate_HTMLTemplate"},
    module = "lit-html/lib/html.js"
)
@Import(
    module = "lit-html/lib/html.js"
)
public interface HTMLTemplate extends Any {
  @JSProperty("element")
  HTMLTemplateElement getElement();

  @JSProperty("element")
  void setElement(HTMLTemplateElement value);

  @JSProperty("parts")
  Parts[] getParts();

  @JSProperty("parts")
  void setParts(Parts[] value);

  @JSBody(
      params = {"element"},
      script = "return new HTMLTemplate_HTMLTemplate(element)"
  )
  static HTMLTemplate create(HTMLTemplateElement element) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  interface Parts extends Any {
    @JSProperty("type")
    Type getType();

    @JSProperty("index")
    double getIndex();

    @JSProperty("index")
    void setIndex(double value);

    @JSProperty("name")
    String getName();

    @JSProperty("strings")
    String[] getStrings();

    abstract class Type extends JsEnum {
      public static final Type ATTRIBUTE = JsEnum.of("attribute");
    }

    class Builder {
      private final Parts object = Any.empty();

      public Parts build() {
        return object;
      }

      public Parts.Builder index(double value) {
        object.setIndex(value);
        return this;
      }
    }
  }
}
