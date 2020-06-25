package js.lang.external.polymer;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.FunctionalInterface;
import javax.annotation.Nullable;
import js.lang.Any;
import js.web.dom.MouseEvent;
import org.teavm.jso.JSFunctor;
import org.teavm.jso.JSProperty;

@NpmPackage(
    name = "@polymer/polymer",
    version = "^3.4.1"
)
@Import(
    module = "@polymer/polymer/polymer-element.js"
)
public interface GestureRecognizer extends Any {
  void reset();

  @JSProperty("reset")
  ResetFn getReset();

  @JSProperty("reset")
  void setReset(ResetFn value);

  void mousedown(MouseEvent e);

  @JSProperty("mousedown")
  @Nullable
  MousedownFn getMousedown();

  @JSProperty("mousedown")
  void setMousedown(@Nullable MousedownFn value);

  void mousemove(MouseEvent e);

  @JSProperty("mousemove")
  @Nullable
  MousemoveFn getMousemove();

  @JSProperty("mousemove")
  void setMousemove(@Nullable MousemoveFn value);

  void mouseup(MouseEvent e);

  @JSProperty("mouseup")
  @Nullable
  MouseupFn getMouseup();

  @JSProperty("mouseup")
  void setMouseup(@Nullable MouseupFn value);

  void touchstart(TouchEvent e);

  @JSProperty("touchstart")
  @Nullable
  TouchstartFn getTouchstart();

  @JSProperty("touchstart")
  void setTouchstart(@Nullable TouchstartFn value);

  void touchmove(TouchEvent e);

  @JSProperty("touchmove")
  @Nullable
  TouchmoveFn getTouchmove();

  @JSProperty("touchmove")
  void setTouchmove(@Nullable TouchmoveFn value);

  void touchend(TouchEvent e);

  @JSProperty("touchend")
  @Nullable
  TouchendFn getTouchend();

  @JSProperty("touchend")
  void setTouchend(@Nullable TouchendFn value);

  void click(MouseEvent e);

  @JSProperty("click")
  @Nullable
  ClickFn getClick();

  @JSProperty("click")
  void setClick(@Nullable ClickFn value);

  @FunctionalInterface
  @JSFunctor
  interface ResetFn extends Any {
    void apply();
  }

  @FunctionalInterface
  @JSFunctor
  interface MousedownFn extends Any {
    void apply(MouseEvent e);
  }

  @FunctionalInterface
  @JSFunctor
  interface MousemoveFn extends Any {
    void apply(MouseEvent e);
  }

  @FunctionalInterface
  @JSFunctor
  interface MouseupFn extends Any {
    void apply(MouseEvent e);
  }

  @FunctionalInterface
  @JSFunctor
  interface TouchstartFn extends Any {
    void apply(TouchEvent e);
  }

  @FunctionalInterface
  @JSFunctor
  interface TouchmoveFn extends Any {
    void apply(TouchEvent e);
  }

  @FunctionalInterface
  @JSFunctor
  interface TouchendFn extends Any {
    void apply(TouchEvent e);
  }

  @FunctionalInterface
  @JSFunctor
  interface ClickFn extends Any {
    void apply(MouseEvent e);
  }

  class Builder {
    private final GestureRecognizer object = Any.empty();

    public GestureRecognizer build() {
      return object;
    }

    public Builder reset(ResetFn value) {
      object.setReset(value);
      return this;
    }

    public Builder mousedown(@Nullable MousedownFn value) {
      object.setMousedown(value);
      return this;
    }

    public Builder mousemove(@Nullable MousemoveFn value) {
      object.setMousemove(value);
      return this;
    }

    public Builder mouseup(@Nullable MouseupFn value) {
      object.setMouseup(value);
      return this;
    }

    public Builder touchstart(@Nullable TouchstartFn value) {
      object.setTouchstart(value);
      return this;
    }

    public Builder touchmove(@Nullable TouchmoveFn value) {
      object.setTouchmove(value);
      return this;
    }

    public Builder touchend(@Nullable TouchendFn value) {
      object.setTouchend(value);
      return this;
    }

    public Builder click(@Nullable ClickFn value) {
      object.setClick(value);
      return this;
    }
  }
}
