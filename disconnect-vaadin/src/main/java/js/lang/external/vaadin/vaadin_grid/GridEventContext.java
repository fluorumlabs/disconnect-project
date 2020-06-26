package js.lang.external.vaadin.vaadin_grid;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.extras.JsEnum;
import js.lang.Any;
import js.lang.Unknown /* GridItem */;
import org.teavm.jso.JSProperty;

@NpmPackage(
    name = "@vaadin/vaadin-grid",
    version = "^5.7.0-alpha4"
)
@Import(
    module = "@vaadin/vaadin-grid/vaadin-grid.js"
)
public interface GridEventContext extends Any {
  @JSProperty("section")
  Section getSection();

  @JSProperty("section")
  void setSection(Section value);

  @JSProperty("item")
  @Nullable
  Unknown /* GridItem */ getItem();

  @JSProperty("item")
  void setItem(@Nullable Item value);

  @JSProperty("item")
  void setItem(@Nullable String value);

  @JSProperty("column")
  @Nullable
  GridColumnElement getColumn();

  @JSProperty("column")
  void setColumn(@Nullable GridColumnElement value);

  @JSProperty("index")
  double getIndex();

  @JSProperty("index")
  void setIndex(double value);

  @JSProperty("selected")
  boolean getSelected();

  @JSProperty("selected")
  void setSelected(boolean value);

  @JSProperty("detailsOpened")
  boolean getDetailsOpened();

  @JSProperty("detailsOpened")
  void setDetailsOpened(boolean value);

  @JSProperty("expanded")
  boolean getExpanded();

  @JSProperty("expanded")
  void setExpanded(boolean value);

  @JSProperty("level")
  double getLevel();

  @JSProperty("level")
  void setLevel(double value);

  abstract class Section extends JsEnum {
    public static final Section BODY = JsEnum.of("body");

    public static final Section HEADER = JsEnum.of("header");

    public static final Section FOOTER = JsEnum.of("footer");

    public static final Section DETAILS = JsEnum.of("details");
  }

  class Builder {
    private final GridEventContext object = Any.empty();

    public GridEventContext build() {
      return object;
    }

    public Builder section(Section value) {
      object.setSection(value);
      return this;
    }

    public Builder item(@Nullable Item value) {
      object.setItem(value);
      return this;
    }

    public Builder item(@Nullable String value) {
      object.setItem(value);
      return this;
    }

    public Builder column(@Nullable GridColumnElement value) {
      object.setColumn(value);
      return this;
    }

    public Builder index(double value) {
      object.setIndex(value);
      return this;
    }

    public Builder selected(boolean value) {
      object.setSelected(value);
      return this;
    }

    public Builder detailsOpened(boolean value) {
      object.setDetailsOpened(value);
      return this;
    }

    public Builder expanded(boolean value) {
      object.setExpanded(value);
      return this;
    }

    public Builder level(double value) {
      object.setLevel(value);
      return this;
    }
  }
}
