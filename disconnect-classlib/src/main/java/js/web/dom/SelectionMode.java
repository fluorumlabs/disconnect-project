package js.web.dom;

import js.extras.JsEnum;

 //"" | "up";
        public abstract class SelectionMode extends JsEnum {
        public static final SelectionMode SELECT = JsEnum.of("select");
        public static final SelectionMode START = JsEnum.of("start");
        public static final SelectionMode END = JsEnum.of("end");
        public static final SelectionMode PRESERVE = JsEnum.of("preserve");

}
