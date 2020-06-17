package js.lang.external.vaadin.router;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import js.lang.Unknown;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

@NpmPackage(
    name = "@vaadin/router",
    version = "^1.7.2"
)
@Import(
    module = "@vaadin/router/dist/vaadin-router.js"
)
public interface Route extends Any {
  @JSProperty("path")
  String getPath();

  @JSProperty("path")
  void setPath(String value);

  @JSProperty("name")
  @Nullable
  String getName();

  @JSProperty("name")
  void setName(@Nullable String value);

  @JSProperty("action")
  @Nullable
  ActionFn getAction();

  @JSProperty("action")
  void setAction(@Nullable ActionFn value);

  @JSProperty("bundle")
  @Nullable
  String getBundle();

  @JSProperty("bundle")
  void setBundle(@Nullable String value);

  @JSProperty("children")
  @Nullable
  Unknown getChildren();

  @JSProperty("children")
  void setChildren(Route[] value);

  @JSProperty("children")
  void setChildren(@Nullable ChildrenFn value);

  @JSProperty("component")
  @Nullable
  String getComponent();

  @JSProperty("component")
  void setComponent(@Nullable String value);

  @JSProperty("redirect")
  @Nullable
  String getRedirect();

  @JSProperty("redirect")
  void setRedirect(@Nullable String value);

  class Builder {
    private final Route object = Any.empty();

    public Route build() {
      return object;
    }

    public Builder path(String value) {
      object.setPath(value);
      return this;
    }

    public Builder name(@Nullable String value) {
      object.setName(value);
      return this;
    }

    public Builder action(@Nullable ActionFn value) {
      object.setAction(value);
      return this;
    }

    public Builder bundle(@Nullable String value) {
      object.setBundle(value);
      return this;
    }

    public Builder children(Route[] value) {
      object.setChildren(value);
      return this;
    }

    public Builder children(@Nullable ChildrenFn value) {
      object.setChildren(value);
      return this;
    }

    public Builder component(@Nullable String value) {
      object.setComponent(value);
      return this;
    }

    public Builder redirect(@Nullable String value) {
      object.setRedirect(value);
      return this;
    }
  }
}
