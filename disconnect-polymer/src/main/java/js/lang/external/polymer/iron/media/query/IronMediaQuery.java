package js.lang.external.polymer.iron.media.query;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import js.lang.Any;

@NpmPackage(
    name = IronMediaQuery.NPM_PACKAGE,
    version = IronMediaQuery.NPM_VERSION
)
@Import(
    module = "@polymer/iron-media-query/iron-media-query.js"
)
public interface IronMediaQuery extends Any {
  String NPM_PACKAGE = "@polymer/iron-media-query";

  String NPM_VERSION = "^3.0.1";
}
