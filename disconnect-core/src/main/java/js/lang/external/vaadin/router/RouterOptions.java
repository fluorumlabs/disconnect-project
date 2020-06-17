package js.lang.external.vaadin.router;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

@NpmPackage(
    name = "@vaadin/router",
    version = "^1.7.2"
)
@Import(
    module = "@vaadin/router/dist/vaadin-router.js"
)
public interface RouterOptions extends Any {
  @JSProperty("baseUrl")
  @Nullable
  String getBaseUrl();

  @JSProperty("baseUrl")
  void setBaseUrl(@Nullable String value);

  class Builder {
    private final RouterOptions object = Any.empty();

    public RouterOptions build() {
      return object;
    }

    public Builder baseUrl(@Nullable String value) {
      object.setBaseUrl(value);
      return this;
    }
  }
}
