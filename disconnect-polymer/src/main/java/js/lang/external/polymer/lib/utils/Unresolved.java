package js.lang.external.polymer.lib.utils;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import js.lang.Any;

@NpmPackage(
    name = Unresolved.NPM_PACKAGE,
    version = Unresolved.NPM_VERSION
)
@Import(
    module = "@polymer/polymer/lib/utils/unresolved.js"
)
public interface Unresolved extends Any {
  String NPM_PACKAGE = "@polymer/polymer";

  String NPM_VERSION = "^3.4.1";
}
