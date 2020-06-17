package js.lang.external.vaadin.router;

import js.lang.Any;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * Created by Artem Godin on 6/17/2020.
 */
public interface UrlLike extends Any {
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

  class Builder {
    private final UrlLike object = Any.empty();

    public UrlLike build() {
      return object;
    }

    public Builder pathname(String value) {
      object.setPathname(value);
      return this;
    }

    public Builder search(@Nullable String value) {
      object.setSearch(value);
      return this;
    }

    public Builder hash(@Nullable String value) {
      object.setHash(value);
      return this;
    }
  }
}
