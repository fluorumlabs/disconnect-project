package js.lang.external.lit_html;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import js.util.collections.JsSet;
import js.web.dom.Node;
import org.teavm.jso.JSBody;

import javax.annotation.Nullable;

@NpmPackage(
    name = "lit-html",
    version = "^1.2.1"
)
@Import(
    symbols = {"insertNodeIntoTemplate as ModifyTemplate_insertNodeIntoTemplate", "removeNodesFromTemplate as ModifyTemplate_removeNodesFromTemplate"},
    module = "lit-html/lib/modify-template.js"
)
@Import(
    module = "lit-html/lib/modify-template.js"
)
public interface ModifyTemplate extends Any {
  /**
   * Removes the list of nodes from a Template safely. In addition to removing
   * nodes from the Template, the Template part indices are updated to match
   * the mutated Template DOM.
   *
   * As the template is walked the removal state is tracked and
   * part indices are adjusted as needed.
   *
   * div
   * div#1 (remove) &lt;-- start removing (removing node is div#1)
   * div
   * div#2 (remove)  &lt;-- continue removing (removing node is still div#1)
   * div
   * div &lt;-- stop removing since previous sibling is the removing node (div#1,
   * removed 4 nodes)
   *
   */
  @JSBody(
      params = {"template", "nodesToRemove"},
      script = "ModifyTemplate_removeNodesFromTemplate(template, nodesToRemove)"
  )
  static void removeNodesFromTemplate(Template template, JsSet<Node> nodesToRemove) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Inserts the given node into the Template, optionally before the given
   * refNode. In addition to inserting the node into the Template, the Template
   * part indices are updated to match the mutated Template DOM.
   *
   */
  @JSBody(
      params = {"template", "node", "refNode"},
      script = "ModifyTemplate_insertNodeIntoTemplate(template, node, refNode)"
  )
  static void insertNodeIntoTemplate(Template template, Node node, @Nullable Node refNode) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Inserts the given node into the Template, optionally before the given
   * refNode. In addition to inserting the node into the Template, the Template
   * part indices are updated to match the mutated Template DOM.
   *
   */
  @JSBody(
      params = {"template", "node"},
      script = "ModifyTemplate_insertNodeIntoTemplate(template, node)"
  )
  static void insertNodeIntoTemplate(Template template, Node node) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }
}
