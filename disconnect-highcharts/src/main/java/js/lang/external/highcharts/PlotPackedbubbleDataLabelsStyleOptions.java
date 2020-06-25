package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * (Highcharts, Highstock, Highmaps, Gantt) Styles for the label. The default
 * <code>color</code> setting is <code>&quot;contrast&quot;</code>, which is a pseudo color that Highcharts
 * picks up and applies the maximum contrast to the underlying point item, for
 * example the bar in a bar chart.
 *
 * The <code>textOutline</code> is a pseudo property that applies an outline of the given
 * width with the given color, which by default is the maximum contrast to the
 * text. So a bright text color will result in a black text outline for maximum
 * readability on a mixed background. In some cases, especially with grayscale
 * text, the text outline doesn't work well, in which cases it can be disabled
 * by setting it to <code>&quot;none&quot;</code>. When <code>useHTML</code> is true, the <code>textOutline</code> will not
 * be picked up. In this, case, the same effect can be acheived through the
 * <code>text-shadow</code> CSS property.
 *
 * For some series types, where each point has an extent, like for example tree
 * maps, the data label may overflow the point. There are two strategies for
 * handling overflow. By default, the text will wrap to multiple lines. The
 * other strategy is to set <code>style.textOverflow</code> to <code>ellipsis</code>, which will keep
 * the text on one line plus it will break inside long words.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface PlotPackedbubbleDataLabelsStyleOptions extends Any {
  @JSProperty("transition")
  @Nullable
  String getTransition();

  @JSProperty("transition")
  void setTransition(@Nullable String value);

  class Builder {
    private final PlotPackedbubbleDataLabelsStyleOptions object = Any.empty();

    public PlotPackedbubbleDataLabelsStyleOptions build() {
      return object;
    }

    public Builder transition(@Nullable String value) {
      object.setTransition(value);
      return this;
    }
  }
}
