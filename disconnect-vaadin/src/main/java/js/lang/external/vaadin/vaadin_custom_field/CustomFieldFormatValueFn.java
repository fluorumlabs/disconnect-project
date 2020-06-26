package js.lang.external.vaadin.vaadin_custom_field;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.FunctionalInterface;
import java.lang.String;
import js.lang.Any;
import js.lang.Unknown /* unknown */;
import org.teavm.jso.JSFunctor;

@FunctionalInterface
@JSFunctor
@NpmPackage(
    name = "@vaadin/vaadin-custom-field",
    version = "^1.2.0-alpha3"
)
@Import(
    module = "@vaadin/vaadin-custom-field/vaadin-custom-field.js"
)
public interface CustomFieldFormatValueFn extends Any {
  String apply(Unknown /* unknown */[] inputValues);
}
