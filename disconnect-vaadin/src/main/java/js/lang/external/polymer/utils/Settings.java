package js.lang.external.polymer.utils;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.FunctionalInterface;
import java.lang.String;
import java.lang.UnsupportedOperationException;
import javax.annotation.Nullable;
import js.lang.Any;
import js.web.dom.Node;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSFunctor;

@NpmPackage(
    name = "@polymer/polymer",
    version = "^3.4.1"
)
@Import(
    symbols = {"setAllowTemplateFromDomModule as Settings_setAllowTemplateFromDomModule", "setCancelSyntheticClickEvents as Settings_setCancelSyntheticClickEvents", "setSuppressTemplateNotifications as Settings_setSuppressTemplateNotifications", "setFastDomIf as Settings_setFastDomIf", "setLegacyNoObservedAttributes as Settings_setLegacyNoObservedAttributes", "setPassiveTouchGestures as Settings_setPassiveTouchGestures", "setOrderedComputed as Settings_setOrderedComputed", "getSanitizeDOMValue as Settings_getSanitizeDOMValue", "setSyncInitialRender as Settings_setSyncInitialRender", "setLegacyUndefined as Settings_setLegacyUndefined", "setRemoveNestedTemplates as Settings_setRemoveNestedTemplates", "setLegacyOptimizations as Settings_setLegacyOptimizations", "setStrictTemplatePolicy as Settings_setStrictTemplatePolicy", "setRootPath as Settings_setRootPath", "setLegacyWarnings as Settings_setLegacyWarnings", "setSanitizeDOMValue as Settings_setSanitizeDOMValue", "setUseAdoptedStyleSheetsWithBuiltCSS as Settings_setUseAdoptedStyleSheetsWithBuiltCSS"},
    module = "@polymer/polymer/lib/utils/settings.js"
)
@Import(
    module = "@polymer/polymer/lib/utils/settings.js"
)
public interface Settings extends Any {
  /**
   * Sets the global rootPath property used by <code>ElementMixin</code> and
   * available via <code>rootPath</code>.
   *
   */
  @JSBody(
      params = {"path"},
      script = "Settings_setRootPath(path)"
  )
  static void setRootPath(String path) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Sets the global sanitizeDOMValue available via this module's exported
   * <code>sanitizeDOMValue</code> variable.
   *
   */
  @JSBody(
      params = {"newSanitizeDOMValue"},
      script = "Settings_setSanitizeDOMValue(newSanitizeDOMValue)"
  )
  static void setSanitizeDOMValue(
      @Nullable SetSanitizeDOMValueNewSanitizeDOMValueFunction newSanitizeDOMValue) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Sets the global sanitizeDOMValue available via this module's exported
   * <code>sanitizeDOMValue</code> variable.
   *
   */
  @JSBody(
      params = {},
      script = "Settings_setSanitizeDOMValue()"
  )
  static void setSanitizeDOMValue() {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Gets sanitizeDOMValue, for environments that don't well support <code>export let</code>.
   *
   * @return sanitizeDOMValue
   *
   */
  @JSBody(
      script = "return Settings_getSanitizeDOMValue()"
  )
  @Nullable
  static GetSanitizeDOMValueResultFunction getSanitizeDOMValue() {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Sets <code>passiveTouchGestures</code> globally for all elements using Polymer Gestures.
   *
   */
  @JSBody(
      params = {"usePassive"},
      script = "Settings_setPassiveTouchGestures(usePassive)"
  )
  static void setPassiveTouchGestures(boolean usePassive) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Sets <code>strictTemplatePolicy</code> globally for all elements
   *
   */
  @JSBody(
      params = {"useStrictPolicy"},
      script = "Settings_setStrictTemplatePolicy(useStrictPolicy)"
  )
  static void setStrictTemplatePolicy(boolean useStrictPolicy) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Sets <code>lookupTemplateFromDomModule</code> globally for all elements
   *
   */
  @JSBody(
      params = {"allowDomModule"},
      script = "Settings_setAllowTemplateFromDomModule(allowDomModule)"
  )
  static void setAllowTemplateFromDomModule(boolean allowDomModule) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Sets <code>legacyOptimizations</code> globally for all elements to enable optimizations
   * when only legacy based elements are used.
   *
   */
  @JSBody(
      params = {"useLegacyOptimizations"},
      script = "Settings_setLegacyOptimizations(useLegacyOptimizations)"
  )
  static void setLegacyOptimizations(boolean useLegacyOptimizations) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Sets <code>legacyWarnings</code> globally for all elements to migration warnings.
   *
   */
  @JSBody(
      params = {"useLegacyWarnings"},
      script = "Settings_setLegacyWarnings(useLegacyWarnings)"
  )
  static void setLegacyWarnings(boolean useLegacyWarnings) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Sets <code>syncInitialRender</code> globally for all elements to enable synchronous
   * initial rendering.
   *
   */
  @JSBody(
      params = {"useSyncInitialRender"},
      script = "Settings_setSyncInitialRender(useSyncInitialRender)"
  )
  static void setSyncInitialRender(boolean useSyncInitialRender) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Sets <code>legacyUndefined</code> globally for all elements to enable legacy
   * multi-property behavior for undefined values.
   *
   */
  @JSBody(
      params = {"useLegacyUndefined"},
      script = "Settings_setLegacyUndefined(useLegacyUndefined)"
  )
  static void setLegacyUndefined(boolean useLegacyUndefined) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Sets <code>orderedComputed</code> globally for all elements to enable ordered computed
   * property computation.
   *
   */
  @JSBody(
      params = {"useOrderedComputed"},
      script = "Settings_setOrderedComputed(useOrderedComputed)"
  )
  static void setOrderedComputed(boolean useOrderedComputed) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Sets <code>setCancelSyntheticEvents</code> globally for all elements to cancel synthetic click events.
   *
   */
  @JSBody(
      params = {"useCancelSyntheticClickEvents"},
      script = "Settings_setCancelSyntheticClickEvents(useCancelSyntheticClickEvents)"
  )
  static void setCancelSyntheticClickEvents(boolean useCancelSyntheticClickEvents) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Sets <code>removeNestedTemplates</code> globally, to eliminate nested templates
   * inside <code>dom-if</code> and <code>dom-repeat</code> as part of template parsing.
   *
   */
  @JSBody(
      params = {"useRemoveNestedTemplates"},
      script = "Settings_setRemoveNestedTemplates(useRemoveNestedTemplates)"
  )
  static void setRemoveNestedTemplates(boolean useRemoveNestedTemplates) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Sets <code>fastDomIf</code> globally, to put <code>dom-if</code> in a performance-optimized mode.
   *
   */
  @JSBody(
      params = {"useFastDomIf"},
      script = "Settings_setFastDomIf(useFastDomIf)"
  )
  static void setFastDomIf(boolean useFastDomIf) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Sets <code>suppressTemplateNotifications</code> globally, to disable <code>dom-change</code> and
   * <code>rendered-item-count</code> events from <code>dom-if</code> and <code>dom-repeat</code>.
   *
   */
  @JSBody(
      params = {"suppress"},
      script = "Settings_setSuppressTemplateNotifications(suppress)"
  )
  static void setSuppressTemplateNotifications(boolean suppress) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Sets <code>legacyNoObservedAttributes</code> globally, to disable <code>observedAttributes</code>.
   *
   */
  @JSBody(
      params = {"noObservedAttributes"},
      script = "Settings_setLegacyNoObservedAttributes(noObservedAttributes)"
  )
  static void setLegacyNoObservedAttributes(boolean noObservedAttributes) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Sets <code>useAdoptedStyleSheetsWithBuiltCSS</code> globally.
   *
   */
  @JSBody(
      params = {"value"},
      script = "Settings_setUseAdoptedStyleSheetsWithBuiltCSS(value)"
  )
  static void setUseAdoptedStyleSheetsWithBuiltCSS(boolean value) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  @FunctionalInterface
  @JSFunctor
  interface SetSanitizeDOMValueNewSanitizeDOMValueFunction extends Any {
    Any apply(Any p0, String p1, String p2, @Nullable Node p3);
  }

  @FunctionalInterface
  @JSFunctor
  interface GetSanitizeDOMValueResultFunction extends Any {
    Any apply(Any p0, String p1, String p2, @Nullable Node p3);
  }
}
