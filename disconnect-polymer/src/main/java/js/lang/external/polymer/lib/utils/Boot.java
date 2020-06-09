package js.lang.external.polymer.lib.utils;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import js.lang.Any;

@NpmPackage(
    name = Boot.NPM_PACKAGE,
    version = Boot.NPM_VERSION
)
@Import(
    module = "@polymer/polymer/lib/utils/boot.js"
)
public interface Boot extends Any {
  String NPM_PACKAGE = "@polymer/polymer";

  String NPM_VERSION = "^3.4.1";
}
