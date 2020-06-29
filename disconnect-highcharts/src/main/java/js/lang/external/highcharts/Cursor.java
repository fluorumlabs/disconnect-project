package js.lang.external.highcharts;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.extras.JsEnum;

@NpmPackage(
    name = "highcharts",
    version = "^8.1.2"
)
@Import(
    module = "highcharts/es-modules/masters/highcharts.src.js"
)
public abstract class Cursor extends JsEnum {
  public static final Cursor ALIAS = JsEnum.of("alias");

  public static final Cursor ALL_SCROLL = JsEnum.of("all-scroll");

  public static final Cursor AUTO = JsEnum.of("auto");

  public static final Cursor CELL = JsEnum.of("cell");

  public static final Cursor COL_RESIZE = JsEnum.of("col-resize");

  public static final Cursor CONTEXT_MENU = JsEnum.of("context-menu");

  public static final Cursor COPY = JsEnum.of("copy");

  public static final Cursor CROSSHAIR = JsEnum.of("crosshair");

  public static final Cursor DEFAULT = JsEnum.of("default");

  public static final Cursor E_RESIZE = JsEnum.of("e-resize");

  public static final Cursor EW_RESIZE = JsEnum.of("ew-resize");

  public static final Cursor GRAB = JsEnum.of("grab");

  public static final Cursor GRABBING = JsEnum.of("grabbing");

  public static final Cursor HELP = JsEnum.of("help");

  public static final Cursor MOVE = JsEnum.of("move");

  public static final Cursor N_RESIZE = JsEnum.of("n-resize");

  public static final Cursor NE_RESIZE = JsEnum.of("ne-resize");

  public static final Cursor NESW_RESIZE = JsEnum.of("nesw-resize");

  public static final Cursor NO_DROP = JsEnum.of("no-drop");

  public static final Cursor NONE = JsEnum.of("none");

  public static final Cursor NOT_ALLOWED = JsEnum.of("not-allowed");

  public static final Cursor NS_RESIZE = JsEnum.of("ns-resize");

  public static final Cursor NW_RESIZE = JsEnum.of("nw-resize");

  public static final Cursor NWSE_RESIZE = JsEnum.of("nwse-resize");

  public static final Cursor POINTER = JsEnum.of("pointer");

  public static final Cursor PROGRESS = JsEnum.of("progress");

  public static final Cursor ROW_RESIZE = JsEnum.of("row-resize");

  public static final Cursor S_RESIZE = JsEnum.of("s-resize");

  public static final Cursor SE_RESIZE = JsEnum.of("se-resize");

  public static final Cursor SW_RESIZE = JsEnum.of("sw-resize");

  public static final Cursor TEXT = JsEnum.of("text");

  public static final Cursor VERTICAL_TEXT = JsEnum.of("vertical-text");

  public static final Cursor W_RESIZE = JsEnum.of("w-resize");

  public static final Cursor WAIT = JsEnum.of("wait");

  public static final Cursor ZOOM_IN = JsEnum.of("zoom-in");

  public static final Cursor ZOOM_OUT = JsEnum.of("zoom-out");
}
