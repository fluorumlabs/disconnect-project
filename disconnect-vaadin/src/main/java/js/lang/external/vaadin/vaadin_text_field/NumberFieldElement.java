package js.lang.external.vaadin.vaadin_text_field;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import org.teavm.jso.JSProperty;

/**
 * <code>&lt;vaadin-number-field&gt;</code> is a Web Component for number field control in forms.
 *
 * <pre><code class="language-html">&lt;vaadin-number-field label=&quot;Number&quot;&gt;
 * &lt;/vaadin-number-field&gt;
 * </code></pre>
 */
@NpmPackage(
    name = "@vaadin/vaadin-text-field",
    version = "^2.7.0-alpha5"
)
@Import(
    module = "@vaadin/vaadin-text-field/vaadin-number-field.js"
)
public interface NumberFieldElement extends TextFieldElement {
  /**
   * Set to true to display value increase/decrease controls.
   *
   */
  @JSProperty("hasControls")
  boolean getHasControls();

  /**
   * Set to true to display value increase/decrease controls.
   *
   */
  @JSProperty("hasControls")
  void setHasControls(boolean value);

  /**
   * The minimum value of the field.
   *
   */
  @JSProperty("min")
  double getMin();

  /**
   * The minimum value of the field.
   *
   */
  @JSProperty("min")
  void setMin(double value);

  /**
   * The maximum value of the field.
   *
   */
  @JSProperty("max")
  double getMax();

  /**
   * The maximum value of the field.
   *
   */
  @JSProperty("max")
  void setMax(double value);

  /**
   * Specifies the allowed number intervals of the field.
   *
   */
  @JSProperty("step")
  double getStep();

  /**
   * Specifies the allowed number intervals of the field.
   *
   */
  @JSProperty("step")
  void setStep(double value);

  boolean checkValidity();
}
