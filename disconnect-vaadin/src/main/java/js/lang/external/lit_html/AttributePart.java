package js.lang.external.lit_html;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Unknown;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/**
 * A Part that controls all or part of an attribute value.
 *
 */
@NpmPackage(
    name = "lit-html",
    version = "^1.2.1"
)
@Import(
    symbols = {"AttributePart as AttributePart_AttributePart"},
    module = "lit-html/lib/parts.js"
)
@Import(
    module = "lit-html/lib/parts.js"
)
public interface AttributePart extends Part {
  @JSProperty("committer")
  AttributeCommitter getCommitter();

  @JSProperty("value")
  Unknown /* unknown */ getValue();

  @JSBody(
      params = {"committer"},
      script = "return new AttributePart_AttributePart(committer)"
  )
  static AttributePart create(AttributeCommitter committer) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  void setValue(Unknown /* unknown */ value);

  void commit();
}
