package js.lang.external.polymer.iron.iconset.svg;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import js.lang.Any;

@NpmPackage(
    name = IronIconsetSvg.NPM_PACKAGE,
    version = IronIconsetSvg.NPM_VERSION
)
@Import(
    module = "@polymer/iron-iconset-svg/iron-iconset-svg.js"
)
public interface IronIconsetSvg extends Any {
  String NPM_PACKAGE = "@polymer/iron-iconset-svg";

  String NPM_VERSION = "^3.0.1";
}
