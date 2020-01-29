package js.web.webspeech;

import js.extras.JsEnum;

 //"no-speech" | "aborted" | "audio-capture" | "network" | "not-allowed" |
//        "service-not-allowed" | "bad-grammar" | "language-not-supported";
        public abstract class SpeechSynthesisErrorCode extends JsEnum {
        public static final SpeechSynthesisErrorCode CANCELED = JsEnum.of("canceled");
        public static final SpeechSynthesisErrorCode INTERRUPTED = JsEnum.of("interrupted");
        public static final SpeechSynthesisErrorCode AUDIO_BUSY = JsEnum.of("audio-busy");
        public static final SpeechSynthesisErrorCode AUDIO_HARDWARE = JsEnum.of("audio-hardware");
        public static final SpeechSynthesisErrorCode NETWORK = JsEnum.of("network");
        public static final SpeechSynthesisErrorCode SYNTHESIS_UNAVAILABLE = JsEnum.of("synthesis-unavailable");
        public static final SpeechSynthesisErrorCode SYNTHESIS_FAILED = JsEnum.of("synthesis-failed");
        public static final SpeechSynthesisErrorCode LANGUAGE_UNAVAILABLE = JsEnum.of("language-unavailable");
        public static final SpeechSynthesisErrorCode VOICE_UNAVAILABLE = JsEnum.of("voice-unavailable");
        public static final SpeechSynthesisErrorCode TEXT_TOO_LONG = JsEnum.of("text-too-long");
        public static final SpeechSynthesisErrorCode INVALID_ARGUMENT = JsEnum.of("invalid-argument");

}
