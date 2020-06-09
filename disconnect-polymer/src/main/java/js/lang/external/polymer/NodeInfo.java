package js.lang.external.polymer;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import js.lang.Any;
import org.teavm.jso.JSProperty;

@NpmPackage(
    name = "@polymer/polymer",
    version = "^3.4.1"
)
@Import(
    module = "@polymer/polymer/polymer-element.js"
)
public interface NodeInfo extends Any {
  @JSProperty("id")
  String getId();

  @JSProperty("id")
  void setId(String value);

  @JSProperty("events")
  Events getEvents();

  @JSProperty("events")
  void setEvents(Events value);

  @JSProperty("hasInsertionPoint")
  boolean getHasInsertionPoint();

  @JSProperty("hasInsertionPoint")
  void setHasInsertionPoint(boolean value);

  @JSProperty("templateInfo")
  TemplateInfo getTemplateInfo();

  @JSProperty("templateInfo")
  void setTemplateInfo(TemplateInfo value);

  @JSProperty("parentInfo")
  NodeInfo getParentInfo();

  @JSProperty("parentInfo")
  void setParentInfo(NodeInfo value);

  @JSProperty("parentIndex")
  int getParentIndex();

  @JSProperty("parentIndex")
  void setParentIndex(int value);

  @JSProperty("infoIndex")
  int getInfoIndex();

  @JSProperty("infoIndex")
  void setInfoIndex(int value);

  @JSProperty("bindings")
  Binding[] getBindings();

  @JSProperty("bindings")
  void setBindings(Binding[] value);

  interface Events extends Any {
    @JSProperty("name")
    String getName();

    @JSProperty("name")
    void setName(String value);

    @JSProperty("value")
    String getValue();

    @JSProperty("value")
    void setValue(String value);

    class Builder {
      private final Events object = Any.empty();

      public Events build() {
        return object;
      }

      public Builder name(String value) {
        object.setName(value);
        return this;
      }

      public Builder value(String value) {
        object.setValue(value);
        return this;
      }
    }
  }

  class Builder {
    private final NodeInfo object = Any.empty();

    public NodeInfo build() {
      return object;
    }

    public Builder id(String value) {
      object.setId(value);
      return this;
    }

    public Builder events(Events value) {
      object.setEvents(value);
      return this;
    }

    public Builder hasInsertionPoint(boolean value) {
      object.setHasInsertionPoint(value);
      return this;
    }

    public Builder templateInfo(TemplateInfo value) {
      object.setTemplateInfo(value);
      return this;
    }

    public Builder parentInfo(NodeInfo value) {
      object.setParentInfo(value);
      return this;
    }

    public Builder parentIndex(int value) {
      object.setParentIndex(value);
      return this;
    }

    public Builder infoIndex(int value) {
      object.setInfoIndex(value);
      return this;
    }

    public Builder bindings(Binding[] value) {
      object.setBindings(value);
      return this;
    }
  }
}
