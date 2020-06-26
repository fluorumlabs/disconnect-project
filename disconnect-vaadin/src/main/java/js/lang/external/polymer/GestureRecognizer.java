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
  void reset();

  void mousedown(MouseEvent e);

  @JSProperty("mousedown")
  @Nullable
  MousedownFunction getMousedown();

  @JSProperty("mousedown")
  void setMousedown(@Nullable MousedownFunction value);

  void mousemove(MouseEvent e);

  @JSProperty("mousemove")
  @Nullable
  MousemoveFunction getMousemove();

  @JSProperty("mousemove")
  void setMousemove(@Nullable MousemoveFunction value);

  void mouseup(MouseEvent e);

  @JSProperty("mouseup")
  @Nullable
  MouseupFunction getMouseup();

  @JSProperty("mouseup")
  void setMouseup(@Nullable MouseupFunction value);

  void touchstart(TouchEvent e);

  @JSProperty("touchstart")
  @Nullable
  TouchstartFunction getTouchstart();

  @JSProperty("touchstart")
  void setTouchstart(@Nullable TouchstartFunction value);

  void touchmove(TouchEvent e);

  @JSProperty("touchmove")
  @Nullable
  TouchmoveFunction getTouchmove();

  @JSProperty("touchmove")
  void setTouchmove(@Nullable TouchmoveFunction value);

  void touchend(TouchEvent e);

  @JSProperty("touchend")
  @Nullable
  TouchendFunction getTouchend();

  @JSProperty("touchend")
  void setTouchend(@Nullable TouchendFunction value);

  void click(MouseEvent e);

  @JSProperty("click")
  @Nullable
  ClickFunction getClick();

  @JSProperty("click")
  void setClick(@Nullable ClickFunction value);

  @FunctionalInterface
  @JSFunctor
  interface MousedownFunction extends Any {
    void apply(MouseEvent e);
  }

  @FunctionalInterface
  @JSFunctor
  interface MousemoveFunction extends Any {
    void apply(MouseEvent e);
  }

  @FunctionalInterface
  @JSFunctor
  interface MouseupFunction extends Any {
    void apply(MouseEvent e);
  }

  @FunctionalInterface
  @JSFunctor
  interface TouchstartFunction extends Any {
    void apply(TouchEvent e);
  }

  @FunctionalInterface
  @JSFunctor
  interface TouchmoveFunction extends Any {
    void apply(TouchEvent e);
  }

  @FunctionalInterface
  @JSFunctor
  interface TouchendFunction extends Any {
    void apply(TouchEvent e);
  }

  @FunctionalInterface
  @JSFunctor
  interface ClickFunction extends Any {
    void apply(MouseEvent e);
  }

  class Builder {
    private final GestureRecognizer object = Any.empty();

    public GestureRecognizer build() {
      return object;
    }

    public Builder mousedown(@Nullable MousedownFunction value) {
      object.setMousedown(value);
      return this;
    }

    public Builder mousemove(@Nullable MousemoveFunction value) {
      object.setMousemove(value);
      return this;
    }

    public Builder mouseup(@Nullable MouseupFunction value) {
      object.setMouseup(value);
      return this;
    }

    public Builder touchstart(@Nullable TouchstartFunction value) {
      object.setTouchstart(value);
      return this;
    }

    public Builder touchmove(@Nullable TouchmoveFunction value) {
      object.setTouchmove(value);
      return this;
    }

    public Builder touchend(@Nullable TouchendFunction value) {
      object.setTouchend(value);
      return this;
    }

    public Builder click(@Nullable ClickFunction value) {
      object.setClick(value);
      return this;
    }
  }
}
