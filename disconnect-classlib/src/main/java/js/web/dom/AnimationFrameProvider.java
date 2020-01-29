package js.web.dom;

import js.lang.Any;
import js.extras.Handle;
import js.util.function.JsDoubleConsumer;


public interface AnimationFrameProvider extends Any {
    void cancelAnimationFrame(AnimationFrameHandle handle);
    AnimationFrameHandle requestAnimationFrame(JsDoubleConsumer callback);

    abstract class AnimationFrameHandle extends Handle {
    }
}
