package js.lang.external.vaadin.vaadin_menu_bar;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown /* string | HTMLElement */;
import js.web.dom.HTMLElement;
import org.teavm.jso.JSProperty;

@NpmPackage(
    name = "@vaadin/vaadin-menu-bar",
    version = "^1.2.0-alpha1"
)
@Import(
    module = "@vaadin/vaadin-menu-bar/vaadin-menu-bar.js"
)
public interface SubMenuItem extends Any {
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
  SubMenuItem[] getChildren();

  @JSProperty("children")
  void setChildren(SubMenuItem[] value);

  class Builder {
    private final SubMenuItem object = Any.empty();

    public SubMenuItem build() {
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

    public Builder children(SubMenuItem[] value) {
      object.setChildren(value);
      return this;
    }
  }
}
