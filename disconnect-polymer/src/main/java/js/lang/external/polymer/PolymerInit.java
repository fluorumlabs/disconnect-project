package js.lang.external.polymer;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import js.lang.JsFunction;
import js.lang.Unknown;
import org.teavm.jso.JSIndexer;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

@NpmPackage(
    name = "@polymer/polymer",
    version = "^3.4.1"
)
@Import(
    module = "@polymer/polymer/polymer-element.js"
)
public interface PolymerInit extends Any {
  @JSProperty("is")
  String getIs();

  @JSProperty("is")
  void setIs(String value);

  @JSProperty("extends")
  @Nullable
  String getExtendsValue();

  @JSProperty("extends")
  void setExtendsValue(@Nullable String value);

  @JSProperty("properties")
  @Nullable
  Properties getProperties();

  @JSProperty("properties")
  void setProperties(@Nullable Properties value);

  @JSProperty("observers")
  @Nullable
  String[] getObservers();

  @JSProperty("observers")
  void setObservers(String[] value);

  @JSProperty("hostAttributes")
  @Nullable
  HostAttributes getHostAttributes();

  @JSProperty("hostAttributes")
  void setHostAttributes(@Nullable HostAttributes value);

  @JSProperty("listeners")
  @Nullable
  Listeners getListeners();

  @JSProperty("listeners")
  void setListeners(@Nullable Listeners value);

  @JSProperty("behaviors")
  @Nullable
  Unknown getBehaviors();

  @JSProperty("behaviors")
  void setBehaviors(@Nullable Any value);

  void registered();

  void created();

  void attached();

  void detached();

  void ready();

  void attributeChanged(String name, @Nullable String old, @Nullable String value);

  /**
   *
   */
  void attributeChanged(String name, @Nullable String old);

  /**
   *
   */
  void attributeChanged(String name);

  @JSIndexer
  Any get(String others);

  @JSIndexer
  void set(String others, Any value);

  interface Properties extends Any {
    @JSIndexer
    Unknown get(String key);

    @JSIndexer
    void set(String key, PolymerElementPropertiesMeta value);

    @JSIndexer
    void set(String key, JsFunction value);

    class Builder {
      private final Properties object = Any.empty();

      public Properties build() {
        return object;
      }

      public Builder set(String key, PolymerElementPropertiesMeta value) {
        object.set(key, value);
        return this;
      }

      public Builder set(String key, JsFunction value) {
        object.set(key, value);
        return this;
      }
    }
  }

  interface HostAttributes extends Any {
    @JSIndexer
    Any get(String key);

    @JSIndexer
    void set(String key, Any value);

    class Builder {
      private final HostAttributes object = Any.empty();

      public HostAttributes build() {
        return object;
      }

      public Builder set(String key, Any value) {
        object.set(key, value);
        return this;
      }
    }
  }

  interface Listeners extends Any {
    @JSIndexer
    String get(String key);

    @JSIndexer
    void set(String key, String value);

    class Builder {
      private final Listeners object = Any.empty();

      public Listeners build() {
        return object;
      }

      public Builder set(String key, String value) {
        object.set(key, value);
        return this;
      }
    }
  }
}
