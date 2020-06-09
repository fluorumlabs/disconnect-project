package js.lang.external.polymer;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import js.util.collections.Array;
import org.teavm.jso.JSProperty;

/**
 * The object passed to &quot;.splices&quot; observers. A set of mutations made to the
 * array.
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
public interface PolymerSpliceChange<T extends Any> extends Any {
  @JSProperty("indexSplices")
  Array< PolymerSplice < T > > getIndexSplices();

  @JSProperty("indexSplices")
  void setIndexSplices(Array < PolymerSplice < T > > value);

  /**
   * The object passed to &quot;.splices&quot; observers. A set of mutations made to the
   * array.
   * @template T The type of the array being observed.
   *
   */
  class Builder<T extends Any> {
    private final PolymerSpliceChange<T> object = Any.empty();

    public PolymerSpliceChange<T> build() {
      return object;
    }

    public Builder<T> indexSplices(Array < PolymerSplice < T > > value) {
      object.setIndexSplices(value);
      return this;
    }
  }
}
