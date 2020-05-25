package com.github.fluorumlabs.disconnect.core.events;

import java.util.HashMap;
import java.util.Map;


public
enum Key {
    UNIDENTIFIED("Unidentified"),

    /* Modifier keys */
    ALT("Alt"),
    ALT_GRAPH("AltGraph"),
    CAPS_LOCK("CapsLock"),
    CONTROL("Control"),
    FN("Fn"),
    FN_LOCK("FnLock"),
    HYPER("Hyper"),
    META("Meta"),
    NUM_LOCK("NumLock"),
    SCROLL_LOCK("ScrollLock"),
    SHIFT("Shift"),
    SUPER("Super"),
    SYMBOL("Symbol"),
    SYMBOL_LOCK("SymbolLock", "Scroll"),

    /* Whitespace */
    ENTER("Enter"),
    TAB("Tab"),
    SPACEBAR("Spacebar", " "),

    /* Navigation */
    ARROW_DOWN("ArrowDown", "Down"),
    ARROW_LEFT("ArrowLeft", "Left"),
    ARROW_RIGHT("ArrowRight", "Right"),
    ARROW_UP("ArrowUp", "Up"),
    END("End"),
    HOME("Home"),
    PAGE_DOWN("PageDown"),

    /* Editing */
    BACKSPACE("Backspace"),
    CLEAR("Clear"),
    COPY("Copy"),
    CR_SEL("CrSel", "Crsel"),
    CUT("Cut"),
    DELETE("Delete", "Del"),
    ERASE_EOF("EraseEof"),
    EX_SEL("ExSel", "Exsel"),
    INSERT("Insert"),
    PASTE("Paste"),
    REDO("Redo"),
    UNDO("Undo"),

    /* UI */
    ACCEPT("Accept"),
    AGAIN("Again"),
    ATTN("Attn"),
    CANCEL("Cancel"),
    CONTEXT_MENU("ContextMenu", "Apps"),
    ESCAPE("Escape", "Esc"),
    EXECUTE("Execute"),
    FIND("Find"),
    FINISH("Finish"),
    HELP("Help"),
    PAUSE("Pause"),
    PLAY("Play"),
    PROPS("Props"),
    SELECT("Select"),
    ZOOM_IN("ZoomIn"),
    ZOOM_OUT("ZoomOut"),

    /* Device */
    BRIGHTNESS_DOWN("BrightnessDown"),
    BRIGHTNESS_UP("BrightnessUp"),
    EJECT("Eject"),
    LOG_OFF("LogOff"),
    POWER("Power"),
    POWER_OFF("PowerOff"),
    PRINT_SCREEN("PrintScreen"),
    HIBERNATE("Hibernate"),
    STANDBY("Standby"),
    WAKE_UP("WakeUp"),

    /* Composition/IME */
    ALL_CANDIDATES("AllCandidates"),
    ALPHANUMERIC("Alphanumeric"),
    CODE_INPUT("CodeInput"),
    COMPOSE("Compose"),
    CONVERT("Convert"),
    DEAD("Dead"),
    FINAL_MODE("FinalMode"),
    GROUP_FIRST("GroupFirst"),
    GROUP_LAST("GroupLast"),
    GROUP_NEXT("GroupNext"),
    GROUP_PREVIOUS("GroupPrevious"),
    MODE_CHANGE("ModeChange"),
    NEXT_CANDIDATE("NextCandidate"),
    NON_CONVERT("NonConvert", "Nonconvert"),
    PREVIOUS_CANDIDATE("PreviousCandidate"),
    PROCESS("Process"),
    SINGLE_CANDIDATE("SingleCandidate"),

    /* Korean */
    HANGUL_MODE("HangulMode"),
    HANJA_MODE("HanjaMode"),
    JUNJA_MODE("JunjaMode"),

    /* Japanese */
    EISU("Eisu"),
    HANKAKU("Hankaku"),
    HIRAGANA("Hiragana"),
    HIRAGANA_KATAKANA("HiraganaKatakana"),
    KANA_MODE("KanaMode"),
    KANJI_MODE("KanjiMode"),
    KATAKANA("Katakana"),
    ROMAJI("Romaji"),
    ZENKAKU("Zenkaku"),
    ZENKAKU_HANAKU("ZenkakuHanaku"),

    /* Function */
    F1("F1"),
    F2("F2"),
    F3("F3"),
    F4("F4"),
    F5("F5"),
    F6("F6"),
    F7("F7"),
    F8("F8"),
    F9("F9"),
    F10("F10"),
    F11("F11"),
    F12("F12"),
    F13("F13"),
    F14("F14"),
    F15("F15"),
    F16("F16"),
    F17("F17"),
    F18("F18"),
    F19("F19"),
    F20("F20"),
    Soft1("Soft1"),
    Soft2("Soft2"),
    Soft3("Soft3"),
    Soft4("Soft4"),

    /* Phone */
    APP_SWITCH("AppSwitch"),
    CALL("Call"),
    CAMERA("Camera"),
    CAMERA_FOCUS("CameraFocus"),
    END_CALL("EndCall"),
    GO_BACK("GoBack"),
    GO_HOME("GoHome"),
    HEADSET_HOOK("HeadsetHook"),
    LAST_NUMBER_REDIAL("LastNumberRedial"),
    NOTIFICATION("Notification"),
    MANNER_MODE("MannerMode"),
    VOICE_DIAL("VoiceDial");


    private final String[] values;

    private static final Map<String, Key> STRING_KEY_MAP = new HashMap<>();
    static {
        for (Key key : Key.values()) {
            for (String value : key.values) {
                STRING_KEY_MAP.put(value, key);
            }
        }
    }

    Key(String value) {
        this.values = new String[]{value};
    }

    Key(String... values) {
        this.values = values;
    }


    public static Key of(String x) {
        return STRING_KEY_MAP.getOrDefault(x, UNIDENTIFIED);
    }
}
