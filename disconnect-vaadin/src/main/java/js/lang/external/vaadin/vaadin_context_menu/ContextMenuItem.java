package js.lang.external.vaadin.vaadin_context_menu;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown /* string | HTMLElement */;
import js.web.dom.HTMLElement;
import org.teavm.jso.JSProperty;

@NpmPackage(
    name = "@vaadin/vaadin-context-menu",
    version = "^4.5.0-alpha2"
)
@Import(
    module = "@vaadin/vaadin-context-menu/vaadin-context-menu.js"
)
public interface ContextMenuItem extends Any {
  @JSProperty("text")
  @Nullable
  String getText();

  @JSProperty("text")
  void setText(@Nullable String value);

  @JSProperty("component")
  @Nullable
  Unknown /* string | HTMLElement */ getComponent();

  @JSProperty("component")
  void setComponent(@Nullable HTMLElement value);

  @JSProperty("component")
  void setComponent(@Nullable String value);

  @JSProperty("disabled")
  boolean getDisabled();

  @JSProperty("disabled")
  void setDisabled(boolean value);

  @JSProperty("checked")
  boolean getChecked();

  @JSProperty("checked")
  void setChecked(boolean value);

  @JSProperty("children")
  @Nullable
  ContextMenuItem[] getChildren();

  @JSProperty("children")
  void setChildren(ContextMenuItem[] value);

  class Builder {
    private final ContextMenuItem object = Any.empty();

    public ContextMenuItem build() {
      return object;
    }

    public Builder text(@Nullable String value) {
      object.setText(value);
      return this;
    }

    public Builder component(@Nullable HTMLElement value) {
      object.setComponent(value);
      return this;
    }

    public Builder component(@Nullable String value) {
      object.setComponent(value);
      return this;
    }

    public Builder disabled(boolean value) {
      object.setDisabled(value);
      return this;
    }

    public Builder checked(boolean value) {
      object.setChecked(value);
      return this;
    }

    public Builder children(ContextMenuItem[] value) {
      object.setChildren(value);
      return this;
    }
  }
}
