package js.lang.external.vaadin.vaadin_element_mixin;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import java.lang.UnsupportedOperationException;
import javax.annotation.Nullable;
import js.lang.Any;
import js.web.dom.Element;
import org.teavm.jso.JSBody;

/**
 * Helper that provides a set of functions for RTL.
 *
 */
@NpmPackage(
    name = "@vaadin/vaadin-element-mixin",
    version = "^2.4.1"
)
@Import(
    symbols = {"DirHelper as DirHelper_DirHelper"},
    module = "@vaadin/vaadin-element-mixin/vaadin-dir-helper.js"
)
@Import(
    module = "@vaadin/vaadin-element-mixin/vaadin-dir-helper.js"
)
public interface DirHelper extends Any {
  /**
   * Get the scroll type in the current browser view.
   *
   * @return the scroll type. Possible values are <code>default|reverse|negative</code>
   *
   */
  @JSBody(
      script = "return DirHelper_DirHelper.detectScrollType()"
  )
  static String detectScrollType() {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Get the scrollLeft value of the element relative to the direction
   *
   * @param scrollType type of the scroll detected with <code>detectScrollType</code>
   * @param direction current direction of the element
   * @return the scrollLeft value.
   *
   */
  @JSBody(
      params = {"scrollType", "direction", "element"},
      script = "return DirHelper_DirHelper.getNormalizedScrollLeft(scrollType, direction, element)"
  )
  static double getNormalizedScrollLeft(String scrollType, String direction,
      @Nullable Element element) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Get the scrollLeft value of the element relative to the direction
   *
   * @param scrollType type of the scroll detected with <code>detectScrollType</code>
   * @param direction current direction of the element
   * @return the scrollLeft value.
   *
   */
  @JSBody(
      params = {"scrollType", "direction"},
      script = "return DirHelper_DirHelper.getNormalizedScrollLeft(scrollType, direction)"
  )
  static double getNormalizedScrollLeft(String scrollType, String direction) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Set the scrollLeft value of the element relative to the direction
   *
   * @param scrollType type of the scroll detected with <code>detectScrollType</code>
   * @param direction current direction of the element
   * @param scrollLeft the scrollLeft value to be set
   *
   */
  @JSBody(
      params = {"scrollType", "direction", "element", "scrollLeft"},
      script = "DirHelper_DirHelper.setNormalizedScrollLeft(scrollType, direction, element, scrollLeft)"
  )
  static void setNormalizedScrollLeft(String scrollType, String direction,
      @Nullable Element element, double scrollLeft) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }
}
