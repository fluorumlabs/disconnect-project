package js.lang.external.vaadin.vaadin_progress_bar;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import org.teavm.jso.JSProperty;

@NpmPackage(
    name = "@vaadin/vaadin-progress-bar",
    version = "^1.3.0-alpha1"
)
@Import(
    module = "@vaadin/vaadin-progress-bar/src/vaadin-progress-mixin.js"
)
public interface ProgressMixin extends Any {
  /**
   * Current progress value.
   *
   */
  @JSProperty("value")
  double getValue();

  /**
   * Current progress value.
   *
   */
  @JSProperty("value")
  void setValue(double value);

  /**
   * Minimum bound of the progress bar.
   *
   */
  @JSProperty("min")
  double getMin();

  /**
   * Minimum bound of the progress bar.
   *
   */
  @JSProperty("min")
  void setMin(double value);

  /**
   * Maximum bound of the progress bar.
   *
   */
  @JSProperty("max")
  double getMax();

  /**
   * Maximum bound of the progress bar.
   *
   */
  @JSProperty("max")
  void setMax(double value);

  /**
   * Indeterminate state of the progress bar.
   * This property takes precedence over other state properties (min, max, value).
   *
   */
  @JSProperty("indeterminate")
  boolean getIndeterminate();

  /**
   * Indeterminate state of the progress bar.
   * This property takes precedence over other state properties (min, max, value).
   *
   */
  @JSProperty("indeterminate")
  void setIndeterminate(boolean value);

  void ready();
}
