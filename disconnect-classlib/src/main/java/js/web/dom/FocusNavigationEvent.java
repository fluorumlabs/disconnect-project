package js.web.dom;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;


public interface FocusNavigationEvent extends Event {
    @JSProperty
    NavigationReason getNavigationReason();

    @JSProperty
    double getOriginHeight();

    @JSProperty
    double getOriginLeft();

    @JSProperty
    double getOriginTop();

    @JSProperty
    double getOriginWidth();

    void requestFocus();

    @JSBody(script = "return FocusNavigationEvent.prototype")
    static FocusNavigationEvent prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params={"type","eventInitDict"}, script = "return new FocusNavigationEvent(type, eventInitDict)")
    static FocusNavigationEvent create(String type, FocusNavigationEventInit eventInitDict) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params="type", script = "return new FocusNavigationEvent(type)")
    static FocusNavigationEvent create(String type) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }


    interface FocusNavigationEventInit extends EventInit {
        @JSProperty
        @Nullable
        String  getNavigationReason();

        @JSProperty
        void setNavigationReason(String navigationReason);

        @JSProperty
        double getOriginHeight();

        @JSProperty
        void setOriginHeight(double originHeight);

        @JSProperty
        double getOriginLeft();

        @JSProperty
        void setOriginLeft(double originLeft);

        @JSProperty
        double getOriginTop();

        @JSProperty
        void setOriginTop(double originTop);

        @JSProperty
        double getOriginWidth();

        @JSProperty
        void setOriginWidth(double originWidth);

    }
}
