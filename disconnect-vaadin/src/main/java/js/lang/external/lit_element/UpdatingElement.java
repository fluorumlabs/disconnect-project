package js.lang.external.lit_element;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.extras.JsEnum;
import js.lang.Promise;
import js.lang.Unknown;
import js.web.dom.HTMLElement;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

@NpmPackage(
    name = "lit-element",
    version = "^2.3.1"
)
@Import(
    symbols = {"defaultConverter as UpdatingElement_defaultConverter", "notEqual as UpdatingElement_notEqual", "UpdatingElement as UpdatingElement_UpdatingElement"},
    module = "lit-element/lib/updating-element.js"
)
@Import(
    module = "lit-element/lib/updating-element.js"
)
public interface UpdatingElement extends HTMLElement {
  /**
   * Map of changed properties with old values. Takes an optional generic
   * interface corresponding to the declared element properties.
   *
   */
  @JSBody(
      script = "return UpdatingElement_defaultConverter"
  )
  static ComplexAttributeConverter defaultConverter() {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Change function that returns true if <code>value</code> is different from <code>oldValue</code>.
   * This method is used as the default for a property's <code>hasChanged</code> function.
   *
   */
  @JSBody(
      script = "return UpdatingElement_notEqual"
  )
  static HasChanged notEqual() {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * User-supplied object that maps property names to <code>PropertyDeclaration</code>
   * objects containing options for configuring the property.
   *
   */
  @JSBody(
      script = "return UpdatingElement.properties"
  )
  static PropertyDeclarations getProperties() {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Returns a list of attributes corresponding to the registered properties.
   * @nocollapse
   *
   */
  @JSBody(
      script = "return UpdatingElement.observedAttributes"
  )
  static Unknown /* ( ) : string [ ] */ getObservedAttributes() {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Creates a property accessor on the element prototype if one does not exist
   * and stores a PropertyDeclaration for the property with the given options.
   * The property setter calls the property's <code>hasChanged</code> property option
   * or uses a strict identity check to determine whether or not to request
   * an update.
   *
   * This method may be overridden to customize properties; however,
   * when doing so, it's important to call <code>super.createProperty</code> to ensure
   * the property is setup correctly. This method calls
   * <code>getPropertyDescriptor</code> internally to get a descriptor to install.
   * To customize what properties do when they are get or set, override
   * <code>getPropertyDescriptor</code>. To customize the options for a property,
   * implement <code>createProperty</code> like this:
   *
   * static createProperty(name, options) {
   * options = Object.assign(options, {myOption: true});
   * super.createProperty(name, options);
   * }
   *
   * @nocollapse
   *
   */
  @JSBody(
      params = {"name", "options"},
      script = "UpdatingElement_UpdatingElement.createProperty(name, options)"
  )
  static void createProperty(String name, @Nullable PropertyDeclaration options) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Creates a property accessor on the element prototype if one does not exist
   * and stores a PropertyDeclaration for the property with the given options.
   * The property setter calls the property's <code>hasChanged</code> property option
   * or uses a strict identity check to determine whether or not to request
   * an update.
   *
   * This method may be overridden to customize properties; however,
   * when doing so, it's important to call <code>super.createProperty</code> to ensure
   * the property is setup correctly. This method calls
   * <code>getPropertyDescriptor</code> internally to get a descriptor to install.
   * To customize what properties do when they are get or set, override
   * <code>getPropertyDescriptor</code>. To customize the options for a property,
   * implement <code>createProperty</code> like this:
   *
   * static createProperty(name, options) {
   * options = Object.assign(options, {myOption: true});
   * super.createProperty(name, options);
   * }
   *
   * @nocollapse
   *
   */
  @JSBody(
      params = {"name"},
      script = "UpdatingElement_UpdatingElement.createProperty(name)"
  )
  static void createProperty(String name) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Map with keys of properties that should be reflected when updated.
   *
   */
  @JSBody(
      script = "return new UpdatingElement_UpdatingElement()"
  )
  static UpdatingElement create() {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Requests an update which is processed asynchronously. This should
   * be called when an element should update based on some state not triggered
   * by setting a property. In this case, pass no arguments. It should also be
   * called when manually implementing a property setter. In this case, pass the
   * property <code>name</code> and <code>oldValue</code> to ensure that any configured property
   * options are honored. Returns the <code>updateComplete</code> Promise which is resolved
   * when the update completes.
   *
   * @param name {PropertyKey} (optional) name of requesting property
   * @param oldValue {any} (optional) old value of requesting property
   * @return {Promise} A Promise that is resolved when the update completes.
   *
   */
  Promise<?> requestUpdate(@Nullable String name,
      @Nullable Unknown /* unknown */ oldValue);

  /**
   * Requests an update which is processed asynchronously. This should
   * be called when an element should update based on some state not triggered
   * by setting a property. In this case, pass no arguments. It should also be
   * called when manually implementing a property setter. In this case, pass the
   * property <code>name</code> and <code>oldValue</code> to ensure that any configured property
   * options are honored. Returns the <code>updateComplete</code> Promise which is resolved
   * when the update completes.
   *
   * @param name {PropertyKey} (optional) name of requesting property
   * @return {Promise} A Promise that is resolved when the update completes.
   *
   */
  Promise<?> requestUpdate(@Nullable String name);

  /**
   * Requests an update which is processed asynchronously. This should
   * be called when an element should update based on some state not triggered
   * by setting a property. In this case, pass no arguments. It should also be
   * called when manually implementing a property setter. In this case, pass the
   * property <code>name</code> and <code>oldValue</code> to ensure that any configured property
   * options are honored. Returns the <code>updateComplete</code> Promise which is resolved
   * when the update completes.
   *
   * @return {Promise} A Promise that is resolved when the update completes.
   *
   */
  Promise<?> requestUpdate();

  /**
   * Returns a Promise that resolves when the element has completed updating.
   * The Promise value is a boolean that is <code>true</code> if the element completed the
   * update without triggering another update. The Promise result is <code>false</code> if
   * a property was set inside <code>updated()</code>. If the Promise is rejected, an
   * exception was thrown during the update.
   *
   * To await additional asynchronous work, override the <code>_getUpdateComplete</code>
   * method. For example, it is sometimes useful to await a rendered element
   * before fulfilling this Promise. To do this, first await
   * <code>super._getUpdateComplete()</code>, then any subsequent state.
   *
   * @return {Promise} The Promise returns a boolean that indicates if the
   * update resolved without triggering another update.
   *
   */
  @JSProperty("updateComplete")
  Promise<?> getUpdateComplete();

  abstract class Finalized extends JsEnum {
    public static final Finalized FINALIZED = JsEnum.of("finalized");
  }
}
