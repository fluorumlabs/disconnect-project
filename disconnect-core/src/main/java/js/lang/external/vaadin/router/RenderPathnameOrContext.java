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
public interface RenderPathnameOrContext extends Any {
  @JSProperty("pathname")
  String getPathname();

  @JSProperty("pathname")
  void setPathname(String value);

  @JSProperty("search")
  @Nullable
  String getSearch();

  @JSProperty("search")
  void setSearch(@Nullable String value);

  @JSProperty("hash")
  @Nullable
  String getHash();

  @JSProperty("hash")
  void setHash(@Nullable String value);

  static RenderPathnameOrContext.Builder builder() {
    return new RenderPathnameOrContext.Builder();
  }

  final class Builder {
    private final RenderPathnameOrContext object = Any.empty();

    private Builder() {
    }

    public RenderPathnameOrContext build() {
      return object;
    }

    public RenderPathnameOrContext.Builder pathname(String value) {
      object.setPathname(value);
      return this;
    }

    public RenderPathnameOrContext.Builder search(@Nullable String value) {
      object.setSearch(value);
      return this;
    }

    public RenderPathnameOrContext.Builder hash(@Nullable String value) {
      object.setHash(value);
      return this;
    }
  }
}
