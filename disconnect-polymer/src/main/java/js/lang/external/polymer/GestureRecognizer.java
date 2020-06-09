package js.lang.external.polymer;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import js.web.dom.MouseEvent;
import js.web.touchevents.TouchEvent;
import org.teavm.jso.JSFunctor;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

@NpmPackage(
    name = "@polymer/polymer",
    version = "^3.4.1"
)
@Import(
    module = "@polymer/polymer/polymer-element.js"
)
public interface GestureRecognizer extends Any {
  @JSProperty("reset")
  Reset getReset();

  @JSProperty("reset")
  void setReset(Reset value);

  @JSProperty("mousedown")
  @Nullable
  Mousedown getMousedown();

  @JSProperty("mousedown")
  void setMousedown(@Nullable Mousedown value);

  @JSProperty("mousemove")
  @Nullable
  Mousemove getMousemove();

  @JSProperty("mousemove")
  void setMousemove(@Nullable Mousemove value);

  @JSProperty("mouseup")
  @Nullable
  Mouseup getMouseup();

  @JSProperty("mouseup")
  void setMouseup(@Nullable Mouseup value);

  @JSProperty("touchstart")
  @Nullable
  Touchstart getTouchstart();

  @JSProperty("touchstart")
  void setTouchstart(@Nullable Touchstart value);

  @JSProperty("touchmove")
  @Nullable
  Touchmove getTouchmove();

  @JSProperty("touchmove")
  void setTouchmove(@Nullable Touchmove value);

  @JSProperty("touchend")
  @Nullable
  Touchend getTouchend();

  @JSProperty("touchend")
  void setTouchend(@Nullable Touchend value);

  @JSProperty("click")
  @Nullable
  Click getClick();

  @JSProperty("click")
  void setClick(@Nullable Click value);

  @FunctionalInterface
  @JSFunctor
  interface Reset extends Any {
    void apply();
  }

  @FunctionalInterface
  @JSFunctor
  interface Mousedown extends Any {
    void apply(MouseEvent e);
  }

  @FunctionalInterface
  @JSFunctor
  interface Mousemove extends Any {
    void apply(MouseEvent e);
  }

  @FunctionalInterface
  @JSFunctor
  interface Mouseup extends Any {
    void apply(MouseEvent e);
  }

  @FunctionalInterface
  @JSFunctor
  interface Touchstart extends Any {
    void apply(TouchEvent e);
  }

  @FunctionalInterface
  @JSFunctor
  interface Touchmove extends Any {
    void apply(TouchEvent e);
  }

  @FunctionalInterface
  @JSFunctor
  interface Touchend extends Any {
    void apply(TouchEvent e);
  }

  @FunctionalInterface
  @JSFunctor
  interface Click extends Any {
    void apply(MouseEvent e);
  }

  class Builder {
    private final GestureRecognizer object = Any.empty();

    public GestureRecognizer build() {
      return object;
    }

    public Builder reset(Reset value) {
      object.setReset(value);
      return this;
    }

    public Builder mousedown(@Nullable Mousedown value) {
      object.setMousedown(value);
      return this;
    }

    public Builder mousemove(@Nullable Mousemove value) {
      object.setMousemove(value);
      return this;
    }

    public Builder mouseup(@Nullable Mouseup value) {
      object.setMouseup(value);
      return this;
    }

    public Builder touchstart(@Nullable Touchstart value) {
      object.setTouchstart(value);
      return this;
    }

    public Builder touchmove(@Nullable Touchmove value) {
      object.setTouchmove(value);
      return this;
    }

    public Builder touchend(@Nullable Touchend value) {
      object.setTouchend(value);
      return this;
    }

    public Builder click(@Nullable Click value) {
      object.setClick(value);
      return this;
    }
  }
}
