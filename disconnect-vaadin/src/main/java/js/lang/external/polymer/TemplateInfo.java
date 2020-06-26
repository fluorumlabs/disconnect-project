package js.lang.external.polymer;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import js.web.dom.Node;
import org.teavm.jso.JSProperty;

@NpmPackage(
    name = "@polymer/polymer",
    version = "^3.4.1"
)
@Import(
    module = "@polymer/polymer/polymer-element.js"
)
public interface TemplateInfo extends Any {
  @JSProperty("nodeInfoList")
  NodeInfo[] getNodeInfoList();

  @JSProperty("nodeInfoList")
  void setNodeInfoList(NodeInfo[] value);

  @JSProperty("nodeList")
  Node[] getNodeList();

  @JSProperty("nodeList")
  void setNodeList(Node[] value);

  @JSProperty("stripWhitespace")
  boolean getStripWhitespace();

  @JSProperty("stripWhitespace")
  void setStripWhitespace(boolean value);

  @JSProperty("hasInsertionPoint")
  boolean getHasInsertionPoint();

  @JSProperty("hasInsertionPoint")
  void setHasInsertionPoint(boolean value);

  @JSProperty("hostProps")
  Any getHostProps();

  @JSProperty("hostProps")
  void setHostProps(Any value);

  @JSProperty("propertyEffects")
  Any getPropertyEffects();

  @JSProperty("propertyEffects")
  void setPropertyEffects(Any value);

  @JSProperty("childNodes")
  Node[] getChildNodes();

  @JSProperty("childNodes")
  void setChildNodes(Node[] value);

  @JSProperty("wasPreBound")
  boolean getWasPreBound();

  @JSProperty("wasPreBound")
  void setWasPreBound(boolean value);

  class Builder {
    private final TemplateInfo object = Any.empty();

    public TemplateInfo build() {
      return object;
    }

    public Builder nodeInfoList(NodeInfo[] value) {
      object.setNodeInfoList(value);
      return this;
    }

    public Builder nodeList(Node[] value) {
      object.setNodeList(value);
      return this;
    }

    public Builder stripWhitespace(boolean value) {
      object.setStripWhitespace(value);
      return this;
    }

    public Builder hasInsertionPoint(boolean value) {
      object.setHasInsertionPoint(value);
      return this;
    }

    public Builder hostProps(Any value) {
      object.setHostProps(value);
      return this;
    }

    public Builder propertyEffects(Any value) {
      object.setPropertyEffects(value);
      return this;
    }

    public Builder childNodes(Node[] value) {
      object.setChildNodes(value);
      return this;
    }

    public Builder wasPreBound(boolean value) {
      object.setWasPreBound(value);
      return this;
    }
  }
}
