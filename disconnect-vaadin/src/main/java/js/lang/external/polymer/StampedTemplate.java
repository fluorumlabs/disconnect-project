package js.lang.external.polymer;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.web.dom.DocumentFragment;
import js.web.dom.Node;
import org.teavm.jso.JSIndexer;
import org.teavm.jso.JSProperty;

@NpmPackage(
    name = "@polymer/polymer",
    version = "^3.4.1"
)
@Import(
    module = "@polymer/polymer/polymer-element.js"
)
public interface StampedTemplate extends DocumentFragment {
  @JSProperty("nodeList")
  Node[] getNodeList();

  @JSProperty("nodeList")
  void setNodeList(Node[] value);

  @JSProperty("$")
  $ get$();

  @JSProperty("$")
  void set$($ value);

  @JSProperty("templateInfo")
  @Nullable
  TemplateInfo getTemplateInfo();

  @JSProperty("templateInfo")
  void setTemplateInfo(@Nullable TemplateInfo value);

  interface $ extends Any {
    @JSIndexer
    Node get(String key);

    @JSIndexer
    void set(String key, Node value);

    class Builder {
      private final $ object = Any.empty();

      public $ build() {
        return object;
      }

      public $.Builder set(String key, Node value) {
        object.set(key, value);
        return this;
      }
    }
  }

  class Builder {
    private final StampedTemplate object = Any.empty();

    public StampedTemplate build() {
      return object;
    }

    public Builder nodeList(Node[] value) {
      object.setNodeList(value);
      return this;
    }

    public Builder $($ value) {
      object.set$(value);
      return this;
    }

    public Builder templateInfo(@Nullable TemplateInfo value) {
      object.setTemplateInfo(value);
      return this;
    }
  }
}
