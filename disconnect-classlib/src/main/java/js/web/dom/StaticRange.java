package js.web.dom;

import org.teavm.jso.JSBody;


public interface StaticRange extends AbstractRange {
                @JSBody(script = "return StaticRange.prototype")
                static StaticRange prototype() {
                    throw new UnsupportedOperationException("Available only in JavaScript");
                }

                @JSBody(script = "return new StaticRange()")
                static StaticRange create() {
                    throw new UnsupportedOperationException("Available only in JavaScript");
                }

        }
