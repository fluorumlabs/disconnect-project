package js.lang.external.polymer;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import js.lang.Any;

@NpmPackage(
    name = PolymerLegacy.NPM_PACKAGE,
    version = PolymerLegacy.NPM_VERSION
)
@Import(
    module = "@polymer/polymer/polymer-legacy.js"
)
public interface PolymerLegacy extends Any {
  String NPM_PACKAGE = "@polymer/polymer";

  String NPM_VERSION = "^3.4.1";
}
