package js.web.dom;

import js.extras.JsEnum;

 //"subtitles" | "captions" | "descriptions" | "chapters" | "metadata";
        public abstract class TextTrackMode extends JsEnum {
  public static final TextTrackMode DISABLED = JsEnum.of("disabled");
  public static final TextTrackMode HIDDEN = JsEnum.of("hidden");
  public static final TextTrackMode SHOWING = JsEnum.of("showing");

}
