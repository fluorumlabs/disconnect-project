package js.web.dom;


import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/** Simple user interface events. */
        public interface UIEvent extends Event {
        @JSProperty
        int getDetail();

        @JSProperty
        @Nullable
        Window getView();

        @Deprecated
        @JSProperty
        int getWhich();

        @JSBody(script = "return UIEvent.prototype")
        static UIEvent prototype() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(params={"type","eventInitDict"}, script = "return new UIEvent(type, eventInitDict)")
        static UIEvent create(String type, UIEventInit eventInitDict) {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(params="type", script = "return new UIEvent(type)")
        static UIEvent create(String type) {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }


        interface UIEventInit extends EventInit {
            @JSProperty
            int getDetail();

            @JSProperty
            void setDetail(int detail);

            @JSProperty
            @Nullable
            Window getView();

            @JSProperty
            void setView(Window view);

        }
}
