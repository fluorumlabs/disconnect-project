package js.web.webrtc;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import js.lang.Any;


public interface RTCIdentityAssertion extends Any {
        @JSProperty
        String getIdp();

        @JSProperty
        void setIdp(String idp);

        @JSProperty
        String getName();

        @JSProperty
        void setName(String name);

        @JSBody(script = "return RTCIdentityAssertion.prototype")
        static RTCIdentityAssertion prototype() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(params={"idp","name"}, script = "return new RTCIdentityAssertion(idp, name)")
        static RTCIdentityAssertion create(String idp, String name) {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        }
