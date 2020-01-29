package js.web.dom;

import js.lang.Any;
import org.teavm.jso.JSBody;


@Deprecated
public interface Image extends Any {
                @JSBody(script = "return new Image()")
                static HTMLImageElement create() {
                    throw new UnsupportedOperationException("Available only in JavaScript");
                }

                @JSBody(params="width", script = "return new Image(width)")
                static HTMLImageElement create(int width) {
                    throw new UnsupportedOperationException("Available only in JavaScript");
                }

                @JSBody(params={"width","height"}, script = "return new Image(width, height)")
                static HTMLImageElement create(int width, int height) {
                    throw new UnsupportedOperationException("Available only in JavaScript");
                }

}
