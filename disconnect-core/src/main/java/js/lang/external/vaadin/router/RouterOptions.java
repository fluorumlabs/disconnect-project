package js.lang.external.vaadin.router;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

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

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final RouterOptions object = Any.empty();

    private Builder() {
    }

    public RouterOptions build() {
      return object;
    }

    public Builder baseUrl(@Nullable String value) {
      object.setBaseUrl(value);
      return this;
    }
  }
}
