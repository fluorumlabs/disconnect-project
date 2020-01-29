package js.web.dom;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/** Inherits from Event, and represents the event object of an event sent on a document or worker when its content security policy is violated. */
        public interface SecurityPolicyViolationEvent extends Event {
        @JSProperty
        String getBlockedURI();

        @JSProperty
        int getColumnNumber();

        @JSProperty
        String getDocumentURI();

        @JSProperty
        String getEffectiveDirective();

        @JSProperty
        int getLineNumber();

        @JSProperty
        String getOriginalPolicy();

        @JSProperty
        String getReferrer();

        @JSProperty
        String getSourceFile();

        @JSProperty
        int getStatusCode();

        @JSProperty
        String getViolatedDirective();

        @JSBody(script = "return SecurityPolicyViolationEvent.prototype")
        static SecurityPolicyViolationEvent prototype() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(params={"type","eventInitDict"}, script = "return new SecurityPolicyViolationEvent(type, eventInitDict)")
        static SecurityPolicyViolationEvent create(String type, SecurityPolicyViolationEventInit eventInitDict) {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(params="type", script = "return new SecurityPolicyViolationEvent(type)")
        static SecurityPolicyViolationEvent create(String type) {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }


        interface SecurityPolicyViolationEventInit extends EventInit {
            @JSProperty
            @Nullable
            String getBlockedURI();

            @JSProperty
            void setBlockedURI(String blockedURI);

            @JSProperty
            int getColumnNumber();

            @JSProperty
            void setColumnNumber(int columnNumber);

            @JSProperty
            @Nullable
            String getDocumentURI();

            @JSProperty
            void setDocumentURI(String documentURI);

            @JSProperty
            @Nullable
            String getEffectiveDirective();

            @JSProperty
            void setEffectiveDirective(String effectiveDirective);

            @JSProperty
            int getLineNumber();

            @JSProperty
            void setLineNumber(int lineNumber);

            @JSProperty
            @Nullable
            String getOriginalPolicy();

            @JSProperty
            void setOriginalPolicy(String originalPolicy);

            @JSProperty
            @Nullable
            String getReferrer();

            @JSProperty
            void setReferrer(String referrer);

            @JSProperty
            @Nullable
            String getSourceFile();

            @JSProperty
            void setSourceFile(String sourceFile);

            @JSProperty
            int getStatusCode();

            @JSProperty
            void setStatusCode(int statusCode);

            @JSProperty
            @Nullable
            String getViolatedDirective();

            @JSProperty
            void setViolatedDirective(String violatedDirective);

        }
}
