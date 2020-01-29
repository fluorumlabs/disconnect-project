package js.web.webanimations;

import org.teavm.jso.JSBody;


public interface DocumentTimeline extends AnimationTimeline {
    @JSBody(script = "return DocumentTimeline.prototype")
    static DocumentTimeline prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new DocumentTimeline()")
    static DocumentTimeline create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = "options", script = "return new DocumentTimeline(options)")
    static DocumentTimeline create(DocumentTimelineOptions options) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

}
