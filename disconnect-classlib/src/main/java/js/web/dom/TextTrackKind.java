package js.web.dom;

import js.extras.JsEnum;

 //"text/html" | "text/xml" | "application/xml" | "application/xhtml+xml" | "image/svg+xml";
        public abstract class TextTrackKind extends JsEnum {
        public static final TextTrackKind SUBTITLES = JsEnum.of("subtitles");
        public static final TextTrackKind CAPTIONS = JsEnum.of("captions");
        public static final TextTrackKind DESCRIPTIONS = JsEnum.of("descriptions");
        public static final TextTrackKind CHAPTERS = JsEnum.of("chapters");
        public static final TextTrackKind METADATA = JsEnum.of("metadata");

}
