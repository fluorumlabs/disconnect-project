package js.lang.external.polymer.iron.overlay.behavior;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.UnsupportedOperationException;
import js.lang.Any;
import js.lang.external.polymer.iron.fit.behavior.IronFitBehavior;
import js.lang.external.polymer.iron.resizable.behavior.IronResizableBehavior;
import org.teavm.jso.JSBody;

@NpmPackage(
    name = "@polymer/iron-overlay-behavior",
    version = "^3.0.3"
)
@Import(
    symbols = {"IronOverlayBehaviorImpl as IronOverlayBehavior_IronOverlayBehaviorImpl", "IronOverlayBehavior as IronOverlayBehavior_IronOverlayBehavior"},
    module = "@polymer/iron-overlay-behavior/iron-overlay-behavior.js"
)
public interface IronOverlayBehavior extends IronOverlayBehaviorImpl, IronFitBehavior, IronResizableBehavior {
  @JSBody(
      script = "return IronOverlayBehavior_IronOverlayBehaviorImpl"
  )
  static Any IronOverlayBehaviorImpl() {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  @JSBody(
      script = "return IronOverlayBehavior_IronOverlayBehavior"
  )
  static Any IronOverlayBehavior() {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }
}
