package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface DefsArrowOptions extends Any {
  @JSProperty("children")
  @Nullable
  DefsOptions[] getChildren();

  @JSProperty("children")
  void setChildren(DefsOptions[] value);

  @JSProperty("id")
  @Nullable
  String getId();

  @JSProperty("id")
  void setId(@Nullable String value);

  @JSProperty("markerHeight")
  double getMarkerHeight();

  @JSProperty("markerHeight")
  void setMarkerHeight(double value);

  @JSProperty("markerWidth")
  double getMarkerWidth();

  @JSProperty("markerWidth")
  void setMarkerWidth(double value);

  @JSProperty("refX")
  double getRefX();

  @JSProperty("refX")
  void setRefX(double value);

  @JSProperty("refY")
  double getRefY();

  @JSProperty("refY")
  void setRefY(double value);

  @JSProperty("render")
  boolean getRender();

  @JSProperty("render")
  void setRender(boolean value);

  @JSProperty("tagName")
  @Nullable
  String getTagName();

  @JSProperty("tagName")
  void setTagName(@Nullable String value);

  class Builder {
    private final DefsArrowOptions object = Any.empty();

    public DefsArrowOptions build() {
      return object;
    }

    public Builder children(DefsOptions[] value) {
      object.setChildren(value);
      return this;
    }

    public Builder id(@Nullable String value) {
      object.setId(value);
      return this;
    }

    public Builder markerHeight(double value) {
      object.setMarkerHeight(value);
      return this;
    }

    public Builder markerWidth(double value) {
      object.setMarkerWidth(value);
      return this;
    }

    public Builder refX(double value) {
      object.setRefX(value);
      return this;
    }

    public Builder refY(double value) {
      object.setRefY(value);
      return this;
    }

    public Builder render(boolean value) {
      object.setRender(value);
      return this;
    }

    public Builder tagName(@Nullable String value) {
      object.setTagName(value);
      return this;
    }
  }
}
