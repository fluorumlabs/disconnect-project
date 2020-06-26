package js.lang.external.vaadin.vaadin_grid;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

@NpmPackage(
    name = "@vaadin/vaadin-grid",
    version = "^5.7.0-alpha4"
)
@Import(
    module = "@vaadin/vaadin-grid/src/vaadin-grid-column.js"
)
public interface ColumnBaseMixin extends Any {
  /**
   * When set to true, the column is user-resizable.
   *
   */
  @JSProperty("resizable")
  boolean getResizable();

  /**
   * When set to true, the column is user-resizable.
   *
   */
  @JSProperty("resizable")
  void setResizable(boolean value);

  /**
   * When true, the column is frozen. When a column inside of a column group is frozen,
   * all of the sibling columns inside the group will get frozen also.
   *
   */
  @JSProperty("frozen")
  boolean getFrozen();

  /**
   * When true, the column is frozen. When a column inside of a column group is frozen,
   * all of the sibling columns inside the group will get frozen also.
   *
   */
  @JSProperty("frozen")
  void setFrozen(boolean value);

  /**
   * When set to true, the cells for this column are hidden.
   *
   */
  @JSProperty("hidden")
  boolean getHidden();

  /**
   * When set to true, the cells for this column are hidden.
   *
   */
  @JSProperty("hidden")
  void setHidden(boolean value);

  /**
   * Text content to display in the header cell of the column.
   *
   */
  @JSProperty("header")
  @Nullable
  String getHeader();

  /**
   * Text content to display in the header cell of the column.
   *
   */
  @JSProperty("header")
  void setHeader(@Nullable String value);

  /**
   * Aligns the columns cell content horizontally.
   * Supported values: &quot;start&quot;, &quot;center&quot; and &quot;end&quot;.
   *
   */
  @JSProperty("textAlign")
  @Nullable
  GridColumnTextAlign getTextAlign();

  /**
   * Aligns the columns cell content horizontally.
   * Supported values: &quot;start&quot;, &quot;center&quot; and &quot;end&quot;.
   *
   */
  @JSProperty("textAlign")
  void setTextAlign(@Nullable GridColumnTextAlign value);

  /**
   * Custom function for rendering the header content.
   * Receives two arguments:
   *
   * <ul>
   * <li><code>root</code> The header cell content DOM element. Append your content to it.</li>
   * <li><code>column</code> The <code>&lt;vaadin-grid-column&gt;</code> element.</li>
   * </ul>
   */
  @JSProperty("headerRenderer")
  @Nullable
  GridHeaderFooterRenderer getHeaderRenderer();

  /**
   * Custom function for rendering the header content.
   * Receives two arguments:
   *
   * <ul>
   * <li><code>root</code> The header cell content DOM element. Append your content to it.</li>
   * <li><code>column</code> The <code>&lt;vaadin-grid-column&gt;</code> element.</li>
   * </ul>
   */
  @JSProperty("headerRenderer")
  void setHeaderRenderer(@Nullable GridHeaderFooterRenderer value);

  /**
   * Custom function for rendering the footer content.
   * Receives two arguments:
   *
   * <ul>
   * <li><code>root</code> The footer cell content DOM element. Append your content to it.</li>
   * <li><code>column</code> The <code>&lt;vaadin-grid-column&gt;</code> element.</li>
   * </ul>
   */
  @JSProperty("footerRenderer")
  @Nullable
  GridHeaderFooterRenderer getFooterRenderer();

  /**
   * Custom function for rendering the footer content.
   * Receives two arguments:
   *
   * <ul>
   * <li><code>root</code> The footer cell content DOM element. Append your content to it.</li>
   * <li><code>column</code> The <code>&lt;vaadin-grid-column&gt;</code> element.</li>
   * </ul>
   */
  @JSProperty("footerRenderer")
  void setFooterRenderer(@Nullable GridHeaderFooterRenderer value);
}
