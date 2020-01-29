package js.web.dom;


import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;


public interface InputEvent extends UIEvent {
        @JSProperty
        @Nullable
        String  getData();

        @JSProperty
        String getInputType();

        @JSProperty
        boolean isIsComposing();

        @JSBody(script = "return InputEvent.prototype")
        static InputEvent prototype() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(params={"type","eventInitDict"}, script = "return new InputEvent(type, eventInitDict)")
        static InputEvent create(String type, InputEventInit eventInitDict) {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(params="type", script = "return new InputEvent(type)")
        static InputEvent create(String type) {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }


        interface InputEventInit extends UIEventInit {
            @JSProperty
            @Nullable
            String  getData();

            @JSProperty
            void setData(String data);

            @JSProperty
            @Nullable
            String getInputType();

            @JSProperty
            void setInputType(String inputType);

            @JSProperty
            boolean isIsComposing();

            @JSProperty
            void setIsComposing(boolean isComposing);

        }
}
