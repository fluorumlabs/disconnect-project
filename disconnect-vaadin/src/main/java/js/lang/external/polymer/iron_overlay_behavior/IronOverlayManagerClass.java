package js.lang.external.polymer.iron_overlay_behavior;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.UnsupportedOperationException;
import javax.annotation.Nullable;
import js.lang.Any;
import js.web.dom.Element;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/**
 * DO NOT EDIT
 *
 * This file was automatically generated by
 * <a href="https://github.com/Polymer/tools/tree/master/packages/gen-typescript-declarations">https://github.com/Polymer/tools/tree/master/packages/gen-typescript-declarations</a>
 *
 * To modify these typings, edit the source file(s):
 * iron-overlay-manager.js
 *
 */
@NpmPackage(
    name = "@polymer/iron-overlay-behavior",
    version = "^3.0.3"
)
@Import(
    symbols = {"IronOverlayManagerClass as IronOverlayManagerClass_IronOverlayManagerClass"},
    module = "@polymer/iron-overlay-behavior/iron-overlay-manager.js"
)
@Import(
    module = "@polymer/iron-overlay-behavior/iron-overlay-manager.js"
)
public interface IronOverlayManagerClass extends Any {
  /**
   * The shared backdrop element.
   *
   */
  @JSProperty("backdropElement")
  Element getBackdropElement();

  /**
   * The deepest active element.
   *
   */
  @JSProperty("deepActiveElement")
  Element getDeepActiveElement();

  @JSBody(
      script = "return new IronOverlayManagerClass_IronOverlayManagerClass()"
  )
  static IronOverlayManagerClass create() {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * Adds the overlay and updates its z-index if it's opened, or removes it if
   * it's closed. Also updates the backdrop z-index.
   *
   */
  void addOrRemoveOverlay(Element overlay);

  /**
   * Tracks overlays for z-index and focus management.
   * Ensures the last added overlay with always-on-top remains on top.
   *
   */
  void addOverlay(Element overlay);

  void removeOverlay(Element overlay);

  /**
   * Returns the current overlay.
   *
   */
  @Nullable
  Element currentOverlay();

  /**
   * Returns the current overlay z-index.
   *
   */
  double currentOverlayZ();

  /**
   * Ensures that the minimum z-index of new overlays is at least <code>minimumZ</code>.
   * This does not effect the z-index of any existing overlays.
   *
   */
  void ensureMinimumZ(double minimumZ);

  void focusOverlay();

  /**
   * Updates the backdrop z-index.
   *
   */
  void trackBackdrop();

  Element[] getBackdrops();

  /**
   * Returns the z-index for the backdrop.
   *
   */
  double backdropZ();
}