package js.lang.external.lit_html;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import js.web.webcomponents.HTMLTemplateElement;

/**
 * A TemplateResult for SVG fragments.
 *
 * This class wraps HTML in an <code>&lt;svg&gt;</code> tag in order to parse its contents in the
 * SVG namespace, then modifies the template to remove the <code>&lt;svg&gt;</code> tag so that
 * clones only container the original fragment.
 *
 */
@NpmPackage(
    name = "lit-html",
    version = "^1.2.1"
)
@Import(
    module = "lit-html/lib/template-result.js"
)
public interface SVGTemplateResult extends TemplateResult {
  String getHTML();

  HTMLTemplateElement getTemplateElement();
}
