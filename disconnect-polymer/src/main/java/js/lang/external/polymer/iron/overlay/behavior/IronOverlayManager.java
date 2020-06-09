package js.lang.external.polymer.iron.overlay.behavior;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import js.lang.Any;

@NpmPackage(
    name = IronOverlayManager.NPM_PACKAGE,
    version = IronOverlayManager.NPM_VERSION
)
@Import(
    module = "@polymer/iron-overlay-behavior/iron-overlay-manager.js"
)
public interface IronOverlayManager extends Any {
  String NPM_PACKAGE = "@polymer/iron-overlay-behavior";

  String NPM_VERSION = "^3.0.3";
}
