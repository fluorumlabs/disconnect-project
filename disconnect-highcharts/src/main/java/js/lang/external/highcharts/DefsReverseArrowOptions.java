package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface DefsReverseArrowOptions extends Any {
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

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final DefsReverseArrowOptions object = Any.empty();

    private Builder() {
    }

    public DefsReverseArrowOptions build() {
      return object;
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
