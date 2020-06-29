package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts) Titles for yAxes are taken from xAxis.categories. All options
 * for <code>xAxis.labels</code> applies to parallel coordinates titles. For example, to
 * style categories, use xAxis.labels.style.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface ChartParallelAxesTitleOptions extends Any {
  @JSProperty("reserveSpace")
  boolean getReserveSpace();

  @JSProperty("reserveSpace")
  void setReserveSpace(boolean value);

  @JSProperty("text")
  @Nullable
  String getText();

  @JSProperty("text")
  void setText(@Nullable String value);

  /**
   * (Highcharts) Alignment of the text, can be <code>&quot;left&quot;</code>, <code>&quot;right&quot;</code> or
   * <code>&quot;center&quot;</code>. Default alignment depends on the title.align:
   *
   * Horizontal axes:
   *
   * <ul>
   * <li>
   * for <code>align</code> = <code>&quot;low&quot;</code>, <code>textAlign</code> is set to <code>left</code>
   *
   * </li>
   * <li>
   * for <code>align</code> = <code>&quot;middle&quot;</code>, <code>textAlign</code> is set to <code>center</code>
   *
   * </li>
   * <li>
   * for <code>align</code> = <code>&quot;high&quot;</code>, <code>textAlign</code> is set to <code>right</code>
   *
   * </li>
   * </ul>
   * Vertical axes:
   *
   * <ul>
   * <li>
   * for <code>align</code> = <code>&quot;low&quot;</code> and <code>opposite</code> = <code>true</code>, <code>textAlign</code> is set to
   * <code>right</code>
   *
   * </li>
   * <li>
   * for <code>align</code> = <code>&quot;low&quot;</code> and <code>opposite</code> = <code>false</code>, <code>textAlign</code> is set to
   * <code>left</code>
   *
   * </li>
   * <li>
   * for <code>align</code> = <code>&quot;middle&quot;</code>, <code>textAlign</code> is set to <code>center</code>
   *
   * </li>
   * <li>
   * for <code>align</code> = <code>&quot;high&quot;</code> and <code>opposite</code> = <code>true</code> <code>textAlign</code> is set to
   * <code>left</code>
   *
   * </li>
   * <li>
   * for <code>align</code> = <code>&quot;high&quot;</code> and <code>opposite</code> = <code>false</code> <code>textAlign</code> is set to
   * <code>right</code>
   *
   * </li>
   * </ul>
   */
  @JSProperty("textAlign")
  @Nullable
  TextAlign getTextAlign();

  /**
   * (Highcharts) Alignment of the text, can be <code>&quot;left&quot;</code>, <code>&quot;right&quot;</code> or
   * <code>&quot;center&quot;</code>. Default alignment depends on the title.align:
   *
   * Horizontal axes:
   *
   * <ul>
   * <li>
   * for <code>align</code> = <code>&quot;low&quot;</code>, <code>textAlign</code> is set to <code>left</code>
   *
   * </li>
   * <li>
   * for <code>align</code> = <code>&quot;middle&quot;</code>, <code>textAlign</code> is set to <code>center</code>
   *
   * </li>
   * <li>
   * for <code>align</code> = <code>&quot;high&quot;</code>, <code>textAlign</code> is set to <code>right</code>
   *
   * </li>
   * </ul>
   * Vertical axes:
   *
   * <ul>
   * <li>
   * for <code>align</code> = <code>&quot;low&quot;</code> and <code>opposite</code> = <code>true</code>, <code>textAlign</code> is set to
   * <code>right</code>
   *
   * </li>
   * <li>
   * for <code>align</code> = <code>&quot;low&quot;</code> and <code>opposite</code> = <code>false</code>, <code>textAlign</code> is set to
   * <code>left</code>
   *
   * </li>
   * <li>
   * for <code>align</code> = <code>&quot;middle&quot;</code>, <code>textAlign</code> is set to <code>center</code>
   *
   * </li>
   * <li>
   * for <code>align</code> = <code>&quot;high&quot;</code> and <code>opposite</code> = <code>true</code> <code>textAlign</code> is set to
   * <code>left</code>
   *
   * </li>
   * <li>
   * for <code>align</code> = <code>&quot;high&quot;</code> and <code>opposite</code> = <code>false</code> <code>textAlign</code> is set to
   * <code>right</code>
   *
   * </li>
   * </ul>
   */
  @JSProperty("textAlign")
  void setTextAlign(@Nullable TextAlign value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final ChartParallelAxesTitleOptions object = Any.empty();

    private Builder() {
    }

    public ChartParallelAxesTitleOptions build() {
      return object;
    }

    public Builder reserveSpace(boolean value) {
      object.setReserveSpace(value);
      return this;
    }

    public Builder text(@Nullable String value) {
      object.setText(value);
      return this;
    }

    /**
     * (Highcharts) Alignment of the text, can be <code>&quot;left&quot;</code>, <code>&quot;right&quot;</code> or
     * <code>&quot;center&quot;</code>. Default alignment depends on the title.align:
     *
     * Horizontal axes:
     *
     * <ul>
     * <li>
     * for <code>align</code> = <code>&quot;low&quot;</code>, <code>textAlign</code> is set to <code>left</code>
     *
     * </li>
     * <li>
     * for <code>align</code> = <code>&quot;middle&quot;</code>, <code>textAlign</code> is set to <code>center</code>
     *
     * </li>
     * <li>
     * for <code>align</code> = <code>&quot;high&quot;</code>, <code>textAlign</code> is set to <code>right</code>
     *
     * </li>
     * </ul>
     * Vertical axes:
     *
     * <ul>
     * <li>
     * for <code>align</code> = <code>&quot;low&quot;</code> and <code>opposite</code> = <code>true</code>, <code>textAlign</code> is set to
     * <code>right</code>
     *
     * </li>
     * <li>
     * for <code>align</code> = <code>&quot;low&quot;</code> and <code>opposite</code> = <code>false</code>, <code>textAlign</code> is set to
     * <code>left</code>
     *
     * </li>
     * <li>
     * for <code>align</code> = <code>&quot;middle&quot;</code>, <code>textAlign</code> is set to <code>center</code>
     *
     * </li>
     * <li>
     * for <code>align</code> = <code>&quot;high&quot;</code> and <code>opposite</code> = <code>true</code> <code>textAlign</code> is set to
     * <code>left</code>
     *
     * </li>
     * <li>
     * for <code>align</code> = <code>&quot;high&quot;</code> and <code>opposite</code> = <code>false</code> <code>textAlign</code> is set to
     * <code>right</code>
     *
     * </li>
     * </ul>
     */
    public Builder textAlign(@Nullable TextAlign value) {
      object.setTextAlign(value);
      return this;
    }
  }
}
