package js.web.dom;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import js.lang.Any;

/** The validity states that an element can be in, with respect to constraint validation. Together, they help explain why an element's value fails to validate, if it's not valid. */
        public interface ValidityState extends Any {
        @JSProperty
        boolean isBadInput();

        @JSProperty
        boolean isCustomError();

        @JSProperty
        boolean isPatternMismatch();

        @JSProperty
        boolean isRangeOverflow();

        @JSProperty
        boolean isRangeUnderflow();

        @JSProperty
        boolean isStepMismatch();

        @JSProperty
        boolean isTooLong();

        @JSProperty
        boolean isTooShort();

        @JSProperty
        boolean isTypeMismatch();

        @JSProperty
        boolean isValid();

        @JSProperty
        boolean isValueMissing();

        @JSBody(script = "return ValidityState.prototype")
        static ValidityState prototype() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(script = "return new ValidityState()")
        static ValidityState create() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }


        }
