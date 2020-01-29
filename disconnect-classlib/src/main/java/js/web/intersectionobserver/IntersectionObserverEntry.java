package js.web.intersectionobserver;

import js.web.dom.DOMRectReadOnly;
import js.web.dom.Element;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;import js.lang.Any;

/** This Intersection Observer API interface describes the intersection between the target element and its root container at a specific moment of transition. */
        public interface IntersectionObserverEntry extends Any {
        @JSProperty
        DOMRectReadOnly getBoundingClientRect();

        @JSProperty
        double getIntersectionRatio();

        @JSProperty
        DOMRectReadOnly getIntersectionRect();

        @JSProperty
        boolean isIsIntersecting();

        @JSProperty
        @Nullable
        DOMRectReadOnly  getRootBounds();

        @JSProperty
        Element getTarget();

        @JSProperty
        double getTime();

        @JSBody(script = "return IntersectionObserverEntry.prototype")
        static IntersectionObserverEntry prototype() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(params="intersectionObserverEntryInit", script = "return new IntersectionObserverEntry(intersectionObserverEntryInit)")
        static IntersectionObserverEntry create(IntersectionObserverEntryInit intersectionObserverEntryInit) {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }


        }
