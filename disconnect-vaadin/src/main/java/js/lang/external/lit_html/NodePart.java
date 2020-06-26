package js.lang.external.lit_html;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Unknown;
import js.web.dom.Node;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * A Part that controls a location within a Node tree. Like a Range, NodePart
 * has start and end locations and can set and update the Nodes between those
 * locations.
 *
 * NodeParts support several value types: primitives, Nodes, TemplateResults,
 * as well as arrays and iterables of those types.
 *
 */
@NpmPackage(
    name = "lit-html",
    version = "^1.2.1"
)
@Import(
    symbols = {"NodePart as NodePart_NodePart"},
    module = "lit-html/lib/parts.js"
)
@Import(
    module = "lit-html/lib/parts.js"
)
public interface NodePart extends Part {
  @JSProperty("options")
  RenderOptions getOptions();

  @JSProperty("startNode")
  Node getStartNode();

  @JSProperty("startNode")
  void setStartNode(Node value);

  @JSProperty("endNode")
  Node getEndNode();

  @JSProperty("endNode")
  void setEndNode(Node value);

  @JSProperty("value")
  Unknown /* unknown */ getValue();

  @JSBody(
      params = {"options"},
      script = "return new NodePart_NodePart(options)"
  )
  static NodePart create(RenderOptions options) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Appends this part into a container.
   *
   * This part must be empty, as its contents are not automatically moved.
   *
   */
  void appendInto(Node container);

  /**
   * Inserts this part after the <code>ref</code> node (between <code>ref</code> and <code>ref</code>'s next
   * sibling). Both <code>ref</code> and its next sibling must be static, unchanging nodes
   * such as those that appear in a literal section of a template.
   *
   * This part must be empty, as its contents are not automatically moved.
   *
   */
  void insertAfterNode(Node ref);

  /**
   * Appends this part into a parent part.
   *
   * This part must be empty, as its contents are not automatically moved.
   *
   */
  void appendIntoPart(NodePart part);

  /**
   * Inserts this part after the <code>ref</code> part.
   *
   * This part must be empty, as its contents are not automatically moved.
   *
   */
  void insertAfterPart(NodePart ref);

  void setValue(Unknown /* unknown */ value);

  void commit();

  void clear(@Nullable Node startNode);

  /**
   *
   */
  void clear();
}
