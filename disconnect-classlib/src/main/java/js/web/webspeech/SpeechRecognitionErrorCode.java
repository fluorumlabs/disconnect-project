package js.web.webspeech;

import js.extras.JsEnum;

public abstract class SpeechRecognitionErrorCode extends JsEnum {
    public static final SpeechRecognitionErrorCode NO_SPEECH = JsEnum.of("no-speech");

    public static final SpeechRecognitionErrorCode ABORTED = JsEnum.of("aborted");

    public static final SpeechRecognitionErrorCode AUDIO_CAPTURE = JsEnum.of("audio-capture");

    public static final SpeechRecognitionErrorCode NETWORK = JsEnum.of("network");

    public static final SpeechRecognitionErrorCode NOT_ALLOWED = JsEnum.of("not-allowed");

    public static final SpeechRecognitionErrorCode SERVICE_NOT_ALLOWED = JsEnum.of("service-not-allowed");

    public static final SpeechRecognitionErrorCode BAD_GRAMMAR = JsEnum.of("bad-grammar");

    public static final SpeechRecognitionErrorCode LANGUAGE_NOT_SUPPORTED = JsEnum.of("language-not-supported");

}
