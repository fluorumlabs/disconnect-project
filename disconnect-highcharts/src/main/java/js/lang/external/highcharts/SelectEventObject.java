package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import js.web.dom.Event;
import org.teavm.jso.JSProperty;

/**
 * Object for select events.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface SelectEventObject extends Any {
  @JSProperty("originalEvent")
  Event getOriginalEvent();

  @JSProperty("originalEvent")
  void setOriginalEvent(Event value);

  @JSProperty("xAxis")
  SelectDataObject[] getXAxis();

  @JSProperty("xAxis")
  void setXAxis(SelectDataObject[] value);

  @JSProperty("yAxis")
  SelectDataObject[] getYAxis();

  @JSProperty("yAxis")
  void setYAxis(SelectDataObject[] value);

  class Builder {
    private final SelectEventObject object = Any.empty();

    public SelectEventObject build() {
      return object;
    }

    public Builder originalEvent(Event value) {
      object.setOriginalEvent(value);
      return this;
    }

    public Builder xAxis(SelectDataObject[] value) {
      object.setXAxis(value);
      return this;
    }

    public Builder yAxis(SelectDataObject[] value) {
      object.setYAxis(value);
      return this;
    }
  }
}
