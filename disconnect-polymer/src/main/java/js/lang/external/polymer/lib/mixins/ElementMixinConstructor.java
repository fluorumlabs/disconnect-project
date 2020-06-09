package js.lang.external.polymer.lib.mixins;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.UnsupportedOperationException;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSBody;

@NpmPackage(
    name = "@polymer/polymer",
    version = "^3.4.1"
)
@Import(
    symbols = {"ElementMixinConstructor as ElementMixinConstructor_ElementMixinConstructor"},
    module = "@polymer/polymer/lib/mixins/element-mixin.js"
)
public interface ElementMixinConstructor extends Any {
  @JSBody(
      params = {"args"},
      script = "return ElementMixinConstructor_ElementMixinConstructor.apply(null, args)"
  )
  static ElementMixin create(Any... args) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Override of PropertiesChanged createProperties to create accessors
   * and property effects for all of the properties.
   *
   * @param props .
   *
   */
  void createProperties(Any props);

  /**
   * Creates observers for the given <code>observers</code> array.
   * Leverages <code>PropertyEffects</code> to create observers.
   *
   * @param observers Array of observer descriptors for
   * this class
   * @param dynamicFns Object containing keys for any properties
   * that are functions and should trigger the effect when the function
   * reference is changed
   *
   */
  void createObservers(@Nullable Any observers, @Nullable Any dynamicFns);

  /**
   * Creates observers for the given <code>observers</code> array.
   * Leverages <code>PropertyEffects</code> to create observers.
   *
   * @param observers Array of observer descriptors for
   * this class
   */
  void createObservers(@Nullable Any observers);

  /**
   * Creates observers for the given <code>observers</code> array.
   * Leverages <code>PropertyEffects</code> to create observers.
   *
   */
  void createObservers();
}
