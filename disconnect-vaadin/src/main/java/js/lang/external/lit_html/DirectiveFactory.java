package js.lang.external.lit_html;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.FunctionalInterface;
import js.lang.Any;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSFunctor;

@FunctionalInterface
@JSFunctor
@NpmPackage(
    name = "lit-html",
    version = "^1.2.1"
)
@Import(
    module = "lit-html/lib/directive.js"
)
public interface DirectiveFactory extends Any {
  @JSBody(
      params = {"args"},
      script = "return this.apply.apply(this, args)"
  )
  Any apply(Any... args);
}
