package js.lang.external.polymer.lib.legacy;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.util.errors.JsError;

@NpmPackage(
    name = "@polymer/polymer",
    version = "^3.4.1"
)
@Import(
    module = "@polymer/polymer/lib/legacy/legacy-data-mixin.js"
)
public interface UndefinedArgumentError extends JsError {
}
