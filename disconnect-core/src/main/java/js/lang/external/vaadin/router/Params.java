package js.lang.external.vaadin.router;

import js.lang.Any;
import js.lang.Unknown;
import org.teavm.jso.JSIndexer;

/**
 * Created by Artem Godin on 6/17/2020.
 */
public interface Params extends Any {
  @JSIndexer
  Unknown get(String key);

  @JSIndexer
  void set(String key, String value);

  @JSIndexer
  void set(String key, String[] value);

  @JSIndexer
  Unknown get(int key);

  @JSIndexer
  void set(int key, String value);

  @JSIndexer
  void set(int key, String[] value);

  class Builder {
    private final Params object = Any.empty();

    public Params build() {
      return object;
    }

    public Builder set(String key, String value) {
      object.set(key, value);
      return this;
    }

    public Builder set(String key, String[] value) {
      object.set(key, value);
      return this;
    }

    public Builder set(int key, String value) {
      object.set(key, value);
      return this;
    }

    public Builder set(int key, String[] value) {
      object.set(key, value);
      return this;
    }
  }
}
