package js.lang.external.lit_html;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.extras.JsEnum;
import js.lang.Any;
import js.util.RegExp;
import js.web.dom.Comment;
import js.web.webcomponents.HTMLTemplateElement;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

@NpmPackage(
    name = "lit-html",
    version = "^1.2.1"
)
@Import(
    symbols = {"markerRegex as Template_markerRegex", "boundAttributeSuffix as Template_boundAttributeSuffix", "lastAttributeNameRegex as Template_lastAttributeNameRegex", "marker as Template_marker", "createMarker as Template_createMarker", "nodeMarker as Template_nodeMarker", "isTemplatePartActive as Template_isTemplatePartActive", "Template as Template_Template"},
    module = "lit-html/lib/template.js"
)
@Import(
    module = "lit-html/lib/template.js"
)
public interface Template extends Any {
  /**
   * An expression marker with embedded unique key to avoid collision with
   * possible text in templates.
   *
   */
  @JSBody(
      script = "return Template_marker"
  )
  static String marker() {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * An expression marker used text-positions, multi-binding attributes, and
   * attributes with markup-like text values.
   *
   */
  @JSBody(
      script = "return Template_nodeMarker"
  )
  static String nodeMarker() {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  @JSBody(
      script = "return Template_markerRegex"
  )
  static RegExp markerRegex() {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Suffix appended to all bound attribute names.
   *
   */
  @JSBody(
      script = "return Template_boundAttributeSuffix"
  )
  static BoundAttributeSuffix boundAttributeSuffix() {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * An updatable Template that tracks the location of dynamic parts.
   *
   */
  @JSProperty("parts")
  Parts[] getParts();

  @JSProperty("element")
  HTMLTemplateElement getElement();

  @JSBody(
      params = {"result", "element"},
      script = "return new Template_Template(result, element)"
  )
  static Template create(TemplateResult result, HTMLTemplateElement element) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * A placeholder for a dynamic expression in an HTML template.
   *
   * There are two built-in part types: AttributePart and NodePart. NodeParts
   * always represent a single dynamic expression, while AttributeParts may
   * represent as many expressions are contained in the attribute.
   *
   * A Template's parts are mutable, so parts can be replaced or modified
   * (possibly to implement different template semantics). The contract is that
   * parts can only be replaced, not removed, added or reordered, and parts must
   * always consume the correct number of values in their <code>update()</code> method.
   *
   * TODO(justinfagnani): That requirement is a little fragile. A
   * TemplateInstance could instead be more careful about which values it gives
   * to Part.update().
   *
   */
  @JSBody(
      params = {"part"},
      script = "return Template_isTemplatePartActive(part)"
  )
  static boolean isTemplatePartActive(IsTemplatePartActivePart part) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  @JSBody(
      script = "return Template_createMarker()"
  )
  static Comment createMarker() {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * This regex extracts the attribute name preceding an attribute-position
   * expression. It does this by matching the syntax allowed for attributes
   * against the string literal directly preceding the expression, assuming that
   * the expression is in an attribute-value position.
   *
   * See attributes in the HTML spec:
   * <a href="https://www.w3.org/TR/html5/syntax.html#elements-attributes">https://www.w3.org/TR/html5/syntax.html#elements-attributes</a>
   *
   * &quot; \x09\x0a\x0c\x0d&quot; are HTML space characters:
   * <a href="https://www.w3.org/TR/html5/infrastructure.html#space-characters">https://www.w3.org/TR/html5/infrastructure.html#space-characters</a>
   *
   * &quot;\0-\x1F\x7F-\x9F&quot; are Unicode control characters, which includes every
   * space character except &quot; &quot;.
   *
   * So an attribute is:
   *
   * <ul>
   * <li>The name: any character except a control character, space character, ('),
   * (&quot;), &quot;&gt;&quot;, &quot;=&quot;, or &quot;/&quot;</li>
   * <li>Followed by zero or more space characters</li>
   * <li>Followed by &quot;=&quot;</li>
   * <li>Followed by zero or more space characters</li>
   * <li>Followed by:
   * <ul>
   * <li>Any character except space, ('), (&quot;), &quot;&lt;&quot;, &quot;&gt;&quot;, &quot;=&quot;, (`), or</li>
   * <li>(&quot;) then any non-(&quot;), or</li>
   * <li>(') then any non-(')</li>
   * </ul>
   * </li>
   * </ul>
   */
  @JSBody(
      script = "return Template_lastAttributeNameRegex"
  )
  static RegExp lastAttributeNameRegex() {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  abstract class BoundAttributeSuffix extends JsEnum {
    public static final BoundAttributeSuffix $LIT$ = JsEnum.of("$lit$");
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

  interface IsTemplatePartActivePart extends Any {
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
      private final IsTemplatePartActivePart object = Any.empty();

      public IsTemplatePartActivePart build() {
        return object;
      }

      public IsTemplatePartActivePart.Builder index(double value) {
        object.setIndex(value);
        return this;
      }
    }
  }

}
