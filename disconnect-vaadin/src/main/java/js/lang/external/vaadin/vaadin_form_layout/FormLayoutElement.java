package js.lang.external.vaadin.vaadin_form_layout;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.extras.JsEnum;
import js.lang.Any;
import js.lang.Unknown;
import js.lang.external.polymer.PolymerElement;
import js.lang.external.vaadin.vaadin_element_mixin.ElementMixin;
import js.lang.external.vaadin.vaadin_themable_mixin.ThemableMixin;
import org.teavm.jso.JSIndexer;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * <code>&lt;vaadin-form-layout&gt;</code> is a Web Component providing configurable responsive
 * layout for form elements.
 *
 * <pre><code class="language-html">&lt;vaadin-form-layout&gt;
 *
 *   &lt;vaadin-form-item&gt;
 *     &lt;label slot=&quot;label&quot;&gt;First Name&lt;/label&gt;
 *     &lt;input class=&quot;full-width&quot; value=&quot;Jane&quot;&gt;
 *   &lt;/vaadin-form-item&gt;
 *
 *   &lt;vaadin-form-item&gt;
 *     &lt;label slot=&quot;label&quot;&gt;Last Name&lt;/label&gt;
 *     &lt;input class=&quot;full-width&quot; value=&quot;Doe&quot;&gt;
 *   &lt;/vaadin-form-item&gt;
 *
 *   &lt;vaadin-form-item&gt;
 *     &lt;label slot=&quot;label&quot;&gt;Email&lt;/label&gt;
 *     &lt;input class=&quot;full-width&quot; value=&quot;jane.doe@example.com&quot;&gt;
 *   &lt;/vaadin-form-item&gt;
 *
 * &lt;/vaadin-form-layout&gt;
 * </code></pre>
 * It supports any child elements as layout items.
 *
 * By default, it makes a layout of two columns if the element width is equal or
 * wider than 40em, and a single column layout otherwise.
 *
 * The number of columns and the responsive behavior are customizable with
 * the <code>responsiveSteps</code> property.
 *
 * <h3>Spanning Items on Multiple Columns</h3>
 * You can use <code>colspan</code> attribute on the items.
 * In the example below, the first text field spans on two columns:
 *
 * <pre><code class="language-html">&lt;vaadin-form-layout&gt;
 *
 *   &lt;vaadin-form-item colspan=&quot;2&quot;&gt;
 *     &lt;label slot=&quot;label&quot;&gt;Address&lt;/label&gt;
 *     &lt;input class=&quot;full-width&quot;&gt;
 *   &lt;/vaadin-form-item&gt;
 *
 *   &lt;vaadin-form-item&gt;
 *     &lt;label slot=&quot;label&quot;&gt;First Name&lt;/label&gt;
 *     &lt;input class=&quot;full-width&quot; value=&quot;Jane&quot;&gt;
 *   &lt;/vaadin-form-item&gt;
 *
 *   &lt;vaadin-form-item&gt;
 *     &lt;label slot=&quot;label&quot;&gt;Last Name&lt;/label&gt;
 *     &lt;input class=&quot;full-width&quot; value=&quot;Doe&quot;&gt;
 *   &lt;/vaadin-form-item&gt;
 *
 * &lt;/vaadin-form-layout&gt;
 * </code></pre>
 * <h3>Explicit New Row</h3>
 * Use the <code>&lt;br&gt;</code> line break element to wrap the items on a new row:
 *
 * <pre><code class="language-html">&lt;vaadin-form-layout&gt;
 *
 *   &lt;vaadin-form-item&gt;
 *     &lt;label slot=&quot;label&quot;&gt;Email&lt;/label&gt;
 *     &lt;input class=&quot;full-width&quot;&gt;
 *   &lt;/vaadin-form-item&gt;
 *
 *   &lt;br&gt;
 *
 *   &lt;vaadin-form-item&gt;
 *     &lt;label slot=&quot;label&quot;&gt;Confirm Email&lt;/label&gt;
 *     &lt;input class=&quot;full-width&quot;&gt;
 *   &lt;/vaadin-form-item&gt;
 *
 * &lt;/vaadin-form-layout&gt;
 * </code></pre>
 * <h3>CSS Properties Reference</h3>
 * The following custom CSS properties are available on the <code>&lt;vaadin-form-layout&gt;</code>
 * element:
 *
 * <table>
 * <thead>
 * <tr><th>Custom CSS property</th><th>Description</th><th>Default</th></tr>
 * </thead>
 * <tbody>
 * <tr><td><code>--vaadin-form-layout-column-spacing</code></td><td>Length of the spacing between columns</td><td><code>2em</code></td></tr>
 * </tbody>
 * </table>
 */
@NpmPackage(
    name = "@vaadin/vaadin-form-layout",
    version = "^2.3.0-alpha1"
)
@Import(
    module = "@vaadin/vaadin-form-layout/src/vaadin-form-layout.js"
)
public interface FormLayoutElement extends PolymerElement, ThemableMixin, ElementMixin {
  /**
   * Allows specifying a responsive behavior with the number of columns
   * and the label position depending on the layout width.
   *
   * Format: array of objects, each object defines one responsive step
   * with <code>minWidth</code> CSS length, <code>columns</code> number, and optional
   * <code>labelsPosition</code> string of <code>&quot;aside&quot;</code> or <code>&quot;top&quot;</code>. At least one item is required.
   *
   * <h4>Examples</h4>
   * <pre><code class="language-javascript">formLayout.responsiveSteps = [{columns: 1}];
   * // The layout is always a single column, labels aside.
   * </code></pre>
   * <pre><code class="language-javascript">formLayout.responsiveSteps = [
   *   {minWidth: 0, columns: 1},
   *   {minWidth: '40em', columns: 2}
   * ];
   * // Sets two responsive steps:
   * // 1. When the layout width is &lt; 40em, one column, labels aside.
   * // 2. Width &gt;= 40em, two columns, labels aside.
   * </code></pre>
   * <pre><code class="language-javascript">formLayout.responsiveSteps = [
   *   {minWidth: 0, columns: 1, labelsPosition: 'top'},
   *   {minWidth: '20em', columns: 1},
   *   {minWidth: '40em', columns: 2}
   * ];
   * // Default value. Three responsive steps:
   * // 1. Width &lt; 20em, one column, labels on top.
   * // 2. 20em &lt;= width &lt; 40em, one column, labels aside.
   * // 3. Width &gt;= 40em, two columns, labels aside.
   * </code></pre>
   */
  @JSProperty("responsiveSteps")
  ResponsiveSteps[] getResponsiveSteps();

  /**
   * Allows specifying a responsive behavior with the number of columns
   * and the label position depending on the layout width.
   *
   * Format: array of objects, each object defines one responsive step
   * with <code>minWidth</code> CSS length, <code>columns</code> number, and optional
   * <code>labelsPosition</code> string of <code>&quot;aside&quot;</code> or <code>&quot;top&quot;</code>. At least one item is required.
   *
   * <h4>Examples</h4>
   * <pre><code class="language-javascript">formLayout.responsiveSteps = [{columns: 1}];
   * // The layout is always a single column, labels aside.
   * </code></pre>
   * <pre><code class="language-javascript">formLayout.responsiveSteps = [
   *   {minWidth: 0, columns: 1},
   *   {minWidth: '40em', columns: 2}
   * ];
   * // Sets two responsive steps:
   * // 1. When the layout width is &lt; 40em, one column, labels aside.
   * // 2. Width &gt;= 40em, two columns, labels aside.
   * </code></pre>
   * <pre><code class="language-javascript">formLayout.responsiveSteps = [
   *   {minWidth: 0, columns: 1, labelsPosition: 'top'},
   *   {minWidth: '20em', columns: 1},
   *   {minWidth: '40em', columns: 2}
   * ];
   * // Default value. Three responsive steps:
   * // 1. Width &lt; 20em, one column, labels on top.
   * // 2. 20em &lt;= width &lt; 40em, one column, labels aside.
   * // 3. Width &gt;= 40em, two columns, labels aside.
   * </code></pre>
   */
  @JSProperty("responsiveSteps")
  void setResponsiveSteps(ResponsiveSteps... value);

  void ready();

  /**
   * Set custom CSS property values and update the layout.
   *
   */
  void updateStyles(@Nullable UpdateStylesProperties properties);

  /**
   * Set custom CSS property values and update the layout.
   *
   */
  void updateStyles();

  interface ResponsiveSteps extends Any {
    @JSProperty("minWidth")
    @Nullable
    Unknown /* string | 0 */ getMinWidth();

    @JSProperty("minWidth")
    void setMinWidth(@Nullable String value);

    @JSProperty("minWidth")
    void setMinWidth(@Nullable MinWidth value);

    @JSProperty("columns")
    double getColumns();

    @JSProperty("columns")
    void setColumns(double value);

    @JSProperty("labelsPosition")
    @Nullable
    FormLayoutLabelsPosition getLabelsPosition();

    @JSProperty("labelsPosition")
    void setLabelsPosition(@Nullable FormLayoutLabelsPosition value);

    static ResponsiveSteps.Builder builder() {
      return new ResponsiveSteps.Builder();
    }

    abstract class MinWidth extends JsEnum {
      public static final MinWidth VALUE_0 = JsEnum.of(0);
    }

    final class Builder {
      private final ResponsiveSteps object = Any.empty();

      private Builder() {
      }

      public ResponsiveSteps build() {
        return object;
      }

      public ResponsiveSteps.Builder minWidth(@Nullable String value) {
        object.setMinWidth(value);
        return this;
      }

      public ResponsiveSteps.Builder minWidth(@Nullable MinWidth value) {
        object.setMinWidth(value);
        return this;
      }

      public ResponsiveSteps.Builder columns(double value) {
        object.setColumns(value);
        return this;
      }

      public ResponsiveSteps.Builder labelsPosition(@Nullable FormLayoutLabelsPosition value) {
        object.setLabelsPosition(value);
        return this;
      }
    }
  }

  interface UpdateStylesProperties extends Any {
    @JSIndexer
    String get(String key);

    @JSIndexer
    void set(String key, String value);

    static UpdateStylesProperties.Builder builder() {
      return new UpdateStylesProperties.Builder();
    }

    final class Builder {
      private final UpdateStylesProperties object = Any.empty();

      private Builder() {
      }

      public UpdateStylesProperties build() {
        return object;
      }

      public UpdateStylesProperties.Builder set(String key, String value) {
        object.set(key, value);
        return this;
      }
    }
  }
}
