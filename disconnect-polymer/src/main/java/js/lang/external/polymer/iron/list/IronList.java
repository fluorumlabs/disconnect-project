package js.lang.external.polymer.iron.list;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import js.lang.Any;

@NpmPackage(
    name = IronList.NPM_PACKAGE,
    version = IronList.NPM_VERSION
)
@Import(
    module = "@polymer/iron-list/iron-list.js"
)
public interface IronList extends Any {
  String NPM_PACKAGE = "@polymer/iron-list";

  String NPM_VERSION = "^3.1.0";
}
