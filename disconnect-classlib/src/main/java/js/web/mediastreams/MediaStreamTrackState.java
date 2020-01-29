package js.web.mediastreams;

import js.extras.JsEnum;

 //"required" | "optional" | "not-allowed";
        public abstract class MediaStreamTrackState extends JsEnum {
  public static final MediaStreamTrackState LIVE = JsEnum.of("live");
  public static final MediaStreamTrackState ENDED = JsEnum.of("ended");

}
