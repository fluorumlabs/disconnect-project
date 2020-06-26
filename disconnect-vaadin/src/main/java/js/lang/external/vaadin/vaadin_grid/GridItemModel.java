package js.lang.external.vaadin.vaadin_grid;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
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
public interface GridItemModel extends Any {
  @JSProperty("index")
  double getIndex();

  @JSProperty("index")
  void setIndex(double value);

  @JSProperty("item")
  Unknown /* GridItem */ getItem();

  @JSProperty("item")
  void setItem(Item value);

  @JSProperty("item")
  void setItem(String value);

  @JSProperty("selected")
  boolean getSelected();

  @JSProperty("selected")
  void setSelected(boolean value);

  @JSProperty("expanded")
  boolean getExpanded();

  @JSProperty("expanded")
  void setExpanded(boolean value);

  @JSProperty("level")
  double getLevel();

  @JSProperty("level")
  void setLevel(double value);

  @JSProperty("detailsOpened")
  boolean getDetailsOpened();

  @JSProperty("detailsOpened")
  void setDetailsOpened(boolean value);

  class Builder {
    private final GridItemModel object = Any.empty();

    public GridItemModel build() {
      return object;
    }

    public Builder index(double value) {
      object.setIndex(value);
      return this;
    }

    public Builder item(Item value) {
      object.setItem(value);
      return this;
    }

    public Builder item(String value) {
      object.setItem(value);
      return this;
    }

    public Builder selected(boolean value) {
      object.setSelected(value);
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

    public Builder detailsOpened(boolean value) {
      object.setDetailsOpened(value);
      return this;
    }
  }
}
