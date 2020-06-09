package js.lang.external.polymer.iron.overlay.behavior;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import js.lang.Any;

@NpmPackage(
    name = IronOverlayBackdrop.NPM_PACKAGE,
    version = IronOverlayBackdrop.NPM_VERSION
)
@Import(
    module = "@polymer/iron-overlay-behavior/iron-overlay-backdrop.js"
)
public interface IronOverlayBackdrop extends Any {
  String NPM_PACKAGE = "@polymer/iron-overlay-behavior";

  String NPM_VERSION = "^3.0.3";
}
