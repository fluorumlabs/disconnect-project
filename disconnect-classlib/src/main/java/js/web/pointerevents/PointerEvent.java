package js.web.pointerevents;

import js.web.dom.MouseEvent;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/** The state of a DOM event produced by a pointer such as the geometry of the contact point, the device type that generated the event, the amount of pressure that was applied on the contact surface, etc. */
        public interface PointerEvent extends MouseEvent {
        @JSProperty
        double getHeight();

        @JSProperty
        boolean isIsPrimary();

        @JSProperty
        int getPointerId();

        @JSProperty
        String getPointerType();

        @JSProperty
        double getPressure();

        @JSProperty
        double getTangentialPressure();

        @JSProperty
        double getTiltX();

        @JSProperty
        double getTiltY();

        @JSProperty
        double getTwist();

        @JSProperty
        double getWidth();

        @JSBody(script = "return PointerEvent.prototype")
        static PointerEvent prototype() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(params={"type","eventInitDict"}, script = "return new PointerEvent(type, eventInitDict)")
        static PointerEvent create(String type, PointerEventInit eventInitDict) {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(params="type", script = "return new PointerEvent(type)")
        static PointerEvent create(String type) {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }



        interface PointerEventInit extends MouseEventInit {
            @JSProperty
            double getHeight();

            @JSProperty
            void setHeight(double height);

            @JSProperty
            boolean isIsPrimary();

            @JSProperty
            void setIsPrimary(boolean isPrimary);

            @JSProperty
            int getPointerId();

            @JSProperty
            void setPointerId(int pointerId);

            @JSProperty
            @Nullable
            String getPointerType();

            @JSProperty
            void setPointerType(String pointerType);

            @JSProperty
            double getPressure();

            @JSProperty
            void setPressure(double pressure);

            @JSProperty
            double getTangentialPressure();

            @JSProperty
            void setTangentialPressure(double tangentialPressure);

            @JSProperty
            double getTiltX();

            @JSProperty
            void setTiltX(double tiltX);

            @JSProperty
            double getTiltY();

            @JSProperty
            void setTiltY(double tiltY);

            @JSProperty
            double getTwist();

            @JSProperty
            void setTwist(double twist);

            @JSProperty
            double getWidth();

            @JSProperty
            void setWidth(double width);

        }
}
