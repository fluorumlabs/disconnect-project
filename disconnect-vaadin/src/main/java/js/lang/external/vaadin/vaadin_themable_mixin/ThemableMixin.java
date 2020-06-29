package js.lang.external.vaadin.vaadin_themable_mixin;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;

@NpmPackage(
    name = "@vaadin/vaadin-themable-mixin",
    version = "^1.6.1"
)
@Import(
    module = "@vaadin/vaadin-themable-mixin/vaadin-themable-mixin.js"
)
public interface ThemableMixin extends ThemePropertyMixin {
  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final ThemableMixin object = Any.empty();

    private Builder() {
    }

    public ThemableMixin build() {
      return object;
    }
  }
}
