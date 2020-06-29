package js.lang.external.highcharts.modules;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.extras.JsEnum;
import js.lang.Any;
import js.lang.JsFunction;
import js.lang.Unknown;
import js.lang.external.highcharts.Dictionary;
import org.teavm.jso.JSProperty;

/**
 * Callback function that returns the correspondig Date object to a match.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/modules/data.src.js"
)
public interface AjaxSettingsObject extends Any {
  /**
   * The payload to send.
   *
   */
  @JSProperty("data")
  Unknown /* ( string | Dictionary < any > ) */ getData();

  /**
   * The payload to send.
   *
   */
  @JSProperty("data")
  void setData(Dictionary<Any> value);

  /**
   * The payload to send.
   *
   */
  @JSProperty("data")
  void setData(String value);

  /**
   * The data type expected.
   *
   */
  @JSProperty("dataType")
  DataType getDataType();

  /**
   * The data type expected.
   *
   */
  @JSProperty("dataType")
  void setDataType(DataType value);

  /**
   * Function to call on error.
   *
   */
  @JSProperty("error")
  JsFunction getError();

  /**
   * Function to call on error.
   *
   */
  @JSProperty("error")
  void setError(JsFunction value);

  /**
   * The headers; keyed on header name.
   *
   */
  @JSProperty("headers")
  Dictionary<Unknown /* string */> getHeaders();

  /**
   * The headers; keyed on header name.
   *
   */
  @JSProperty("headers")
  void setHeaders(Dictionary<Unknown /* string */> value);

  /**
   * Function to call on success.
   *
   */
  @JSProperty("success")
  JsFunction getSuccess();

  /**
   * Function to call on success.
   *
   */
  @JSProperty("success")
  void setSuccess(JsFunction value);

  /**
   * The verb to use.
   *
   */
  @JSProperty("type")
  Type getType();

  /**
   * The verb to use.
   *
   */
  @JSProperty("type")
  void setType(Type value);

  /**
   * The URL to call.
   *
   */
  @JSProperty("url")
  String getUrl();

  /**
   * The URL to call.
   *
   */
  @JSProperty("url")
  void setUrl(String value);

  static Builder builder() {
    return new Builder();
  }

  abstract class Type extends JsEnum {
    public static final Type DELETE = JsEnum.of("DELETE");

    public static final Type GET = JsEnum.of("GET");

    public static final Type POST = JsEnum.of("POST");

    public static final Type UPDATE = JsEnum.of("UPDATE");
  }

  final class Builder {
    private final AjaxSettingsObject object = Any.empty();

    private Builder() {
    }

    public AjaxSettingsObject build() {
      return object;
    }

    /**
     * The payload to send.
     *
     */
    public Builder data(Dictionary<Any> value) {
      object.setData(value);
      return this;
    }

    /**
     * The payload to send.
     *
     */
    public Builder data(String value) {
      object.setData(value);
      return this;
    }

    /**
     * The data type expected.
     *
     */
    public Builder dataType(DataType value) {
      object.setDataType(value);
      return this;
    }

    /**
     * Function to call on error.
     *
     */
    public Builder error(JsFunction value) {
      object.setError(value);
      return this;
    }

    /**
     * The headers; keyed on header name.
     *
     */
    public Builder headers(Dictionary<Unknown /* string */> value) {
      object.setHeaders(value);
      return this;
    }

    /**
     * Function to call on success.
     *
     */
    public Builder success(JsFunction value) {
      object.setSuccess(value);
      return this;
    }

    /**
     * The verb to use.
     *
     */
    public Builder type(Type value) {
      object.setType(value);
      return this;
    }

    /**
     * The URL to call.
     *
     */
    public Builder url(String value) {
      object.setUrl(value);
      return this;
    }
  }
}
