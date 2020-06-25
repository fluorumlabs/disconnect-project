package js.lang.external.polymer;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import js.lang.Any;
import js.lang.Unknown;
import org.teavm.jso.JSProperty;

/**
 * The object passed to &quot;.*&quot; wildcard obsevers. A record of a change made to an
 * object.
 * @template B The object matching the non-wildcard portion of the path.
 * @template V Additional types that could be set at the path.
 *
 */
@NpmPackage(
    name = "@polymer/polymer",
    version = "^3.4.1"
)
@Import(
    module = "@polymer/polymer/polymer-element.js"
)
public interface PolymerDeepPropertyChange<B extends Any, V extends Any> extends Any {
  /**
   * Path to the property that changed.
   *
   */
  @JSProperty("path")
  String getPath();

  /**
   * Path to the property that changed.
   *
   */
  @JSProperty("path")
  void setPath(String value);

  /**
   * The object matching the non-wildcard portion of the path.
   *
   */
  @JSProperty("base")
  B getBase();

  /**
   * The object matching the non-wildcard portion of the path.
   *
   */
  @JSProperty("base")
  void setBase(B value);

  /**
   * New value of the path that changed.
   *
   */
  @JSProperty("value")
  Unknown getValue();

  /**
   * New value of the path that changed.
   *
   */
  @JSProperty("value")
  void setValue(B value);

  /**
   * New value of the path that changed.
   *
   */
  @JSProperty("value")
  void setValue(V value);

  /**
   * The object passed to &quot;.*&quot; wildcard obsevers. A record of a change made to an
   * object.
   * @template B The object matching the non-wildcard portion of the path.
   * @template V Additional types that could be set at the path.
   *
   */
  class Builder<B extends Any, V extends Any> {
    private final PolymerDeepPropertyChange<B, V> object = Any.empty();

    public PolymerDeepPropertyChange<B, V> build() {
      return object;
    }

    /**
     * Path to the property that changed.
     *
     */
    public Builder<B, V> path(String value) {
      object.setPath(value);
      return this;
    }

    /**
     * The object matching the non-wildcard portion of the path.
     *
     */
    public Builder<B, V> base(B value) {
      object.setBase(value);
      return this;
    }

    /**
     * New value of the path that changed.
     *
     */
    public Builder<B, V> value(B value) {
      object.setValue(value);
      return this;
    }

    /**
     * New value of the path that changed.
     *
     */
    public Builder<B, V> value(V value) {
      object.setValue(value);
      return this;
    }
  }
}
