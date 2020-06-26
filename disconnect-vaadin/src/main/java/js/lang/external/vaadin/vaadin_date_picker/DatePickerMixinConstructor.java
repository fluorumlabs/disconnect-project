package js.lang.external.vaadin.vaadin_date_picker;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.UnsupportedOperationException;
import js.lang.Any;
import org.teavm.jso.JSBody;

@NpmPackage(
    name = "@vaadin/vaadin-date-picker",
    version = "^4.3.0-alpha3"
)
@Import(
    symbols = {"DatePickerMixinConstructor as DatePickerMixinConstructor_DatePickerMixinConstructor"},
    module = "@vaadin/vaadin-date-picker/src/vaadin-date-picker-mixin.js"
)
@Import(
    module = "@vaadin/vaadin-date-picker/src/vaadin-date-picker-mixin.js"
)
public interface DatePickerMixinConstructor extends Any {
  @JSBody(
      params = {"args"},
      script = "return DatePickerMixinConstructor_DatePickerMixinConstructor.apply(null, args)"
  )
  static DatePickerMixin create(Any... args) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }
}
