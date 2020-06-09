package js.lang.external.polymer;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.extras.JsEnum;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * A record of changes made to an array.
 * @template T The type of the array being observed.
 *
 */
@NpmPackage(
    name = "@polymer/polymer",
    version = "^3.4.1"
)
@Import(
    module = "@polymer/polymer/polymer-element.js"
)
public interface PolymerSplice<T extends Any> extends Any {
  /**
   * Position where the splice started.
   *
   */
  @JSProperty("index")
  int getIndex();

  /**
   * Position where the splice started.
   *
   */
  @JSProperty("index")
  void setIndex(int value);

  /**
   * Array of removed items.
   *
   */
  @JSProperty("removed")
  T getRemoved();

  /**
   * Array of removed items.
   *
   */
  @JSProperty("removed")
  void setRemoved(T value);

  /**
   * Number of new items inserted at index.
   *
   */
  @JSProperty("addedCount")
  int getAddedCount();

  /**
   * Number of new items inserted at index.
   *
   */
  @JSProperty("addedCount")
  void setAddedCount(int value);

  /**
   * A reference to the array in question.
   *
   */
  @JSProperty("object")
  T getObject();

  /**
   * A reference to the array in question.
   *
   */
  @JSProperty("object")
  void setObject(T value);

  /**
   * The string literal 'splice'.
   *
   */
  @JSProperty("type")
  Type getType();

  /**
   * The string literal 'splice'.
   *
   */
  @JSProperty("type")
  void setType(Type value);

  abstract class Type extends JsEnum {
    public static final Type SPLICE = JsEnum.of("splice");
  }

  /**
   * A record of changes made to an array.
   * @template T The type of the array being observed.
   *
   */
  class Builder<T extends Any> {
    private final PolymerSplice<T> object = Any.empty();

    public PolymerSplice<T> build() {
      return object;
    }

    /**
     * Position where the splice started.
     *
     */
    public Builder<T> index(int value) {
      object.setIndex(value);
      return this;
    }

    /**
     * Array of removed items.
     *
     */
    public Builder<T> removed(T value) {
      object.setRemoved(value);
      return this;
    }

    /**
     * Number of new items inserted at index.
     *
     */
    public Builder<T> addedCount(int value) {
      object.setAddedCount(value);
      return this;
    }

    /**
     * A reference to the array in question.
     *
     */
    public Builder<T> object(T value) {
      object.setObject(value);
      return this;
    }

    /**
     * The string literal 'splice'.
     *
     */
    public Builder<T> type(Type value) {
      object.setType(value);
      return this;
    }
  }
}
