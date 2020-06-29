package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * Definition for a menu item in the context menu.
 *
 */
@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public interface ExportingMenuObject extends Any {
  /**
   * The click handler for the menu item.
   *
   */
  @JSProperty("onclick")
  @Nullable
  EventCallbackFunction<Chart> getOnclick();

  /**
   * The click handler for the menu item.
   *
   */
  @JSProperty("onclick")
  void setOnclick(@Nullable EventCallbackFunction<Chart> value);

  /**
   * Indicates a separator line instead of an item.
   *
   */
  @JSProperty("separator")
  boolean getSeparator();

  /**
   * Indicates a separator line instead of an item.
   *
   */
  @JSProperty("separator")
  void setSeparator(boolean value);

  /**
   * The text for the menu item.
   *
   */
  @JSProperty("text")
  @Nullable
  String getText();

  /**
   * The text for the menu item.
   *
   */
  @JSProperty("text")
  void setText(@Nullable String value);

  /**
   * If internationalization is required, the key to a language string.
   *
   */
  @JSProperty("textKey")
  @Nullable
  String getTextKey();

  /**
   * If internationalization is required, the key to a language string.
   *
   */
  @JSProperty("textKey")
  void setTextKey(@Nullable String value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final ExportingMenuObject object = Any.empty();

    private Builder() {
    }

    public ExportingMenuObject build() {
      return object;
    }

    /**
     * The click handler for the menu item.
     *
     */
    public Builder onclick(@Nullable EventCallbackFunction<Chart> value) {
      object.setOnclick(value);
      return this;
    }

    /**
     * Indicates a separator line instead of an item.
     *
     */
    public Builder separator(boolean value) {
      object.setSeparator(value);
      return this;
    }

    /**
     * The text for the menu item.
     *
     */
    public Builder text(@Nullable String value) {
      object.setText(value);
      return this;
    }

    /**
     * If internationalization is required, the key to a language string.
     *
     */
    public Builder textKey(@Nullable String value) {
      object.setTextKey(value);
      return this;
    }
  }
}
