package js.lang.external.highcharts.modules;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import js.lang.Any;
import js.lang.JsFunction;
import js.lang.Unknown /* ( string | Dictionary < any > ) */;
import js.lang.Unknown /* string */;
import js.lang.external.highcharts.Dictionary;
import org.teavm.jso.JSProperty;

@NpmPackage(
    name = "highcharts",
    version = "^8.1.0"
)
@Import(
    module = "highcharts/es-modules/masters/modules/export-data.src.js"
)
public interface ExportDataAjaxSettingsObject extends AjaxSettingsObject {
  @JSProperty("data")
  Unknown /* ( string | Dictionary < any > ) */ getData();

  @JSProperty("data")
  void setData(Dictionary<Any> value);

  @JSProperty("data")
  void setData(String value);

  @JSProperty("dataType")
  DataType getDataType();

  @JSProperty("dataType")
  void setDataType(DataType value);

  @JSProperty("error")
  JsFunction getError();

  @JSProperty("error")
  void setError(JsFunction value);

  @JSProperty("headers")
  Dictionary<Unknown /* string */> getHeaders();

  @JSProperty("headers")
  void setHeaders(Dictionary<Unknown /* string */> value);

  @JSProperty("success")
  JsFunction getSuccess();

  @JSProperty("success")
  void setSuccess(JsFunction value);

  @JSProperty("url")
  String getUrl();

  @JSProperty("url")
  void setUrl(String value);
}
