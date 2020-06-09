package js.lang.external.polymer.iron.icon;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import js.lang.Any;

@NpmPackage(
    name = IronIcon.NPM_PACKAGE,
    version = IronIcon.NPM_VERSION
)
@Import(
    module = "@polymer/iron-icon/iron-icon.js"
)
public interface IronIcon extends Any {
  String NPM_PACKAGE = "@polymer/iron-icon";

  String NPM_VERSION = "^3.0.1";
}
