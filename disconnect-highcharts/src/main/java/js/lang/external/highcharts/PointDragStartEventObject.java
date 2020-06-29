package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.web.dom.MouseEvent;
import org.teavm.jso.JSProperty;

/**
 * Contains common information for a drag event on series point.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface PointDragStartEventObject extends MouseEvent {
  /**
   * Data property being dragged.
   *
   */
  @JSProperty("updateProp")
  @Nullable
  String getUpdateProp();

  /**
   * Data property being dragged.
   *
   */
  @JSProperty("updateProp")
  void setUpdateProp(@Nullable String value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final PointDragStartEventObject object = Any.empty();

    private Builder() {
    }

    public PointDragStartEventObject build() {
      return object;
    }

    /**
     * Data property being dragged.
     *
     */
    public Builder updateProp(@Nullable String value) {
      object.setUpdateProp(value);
      return this;
    }
  }
}
