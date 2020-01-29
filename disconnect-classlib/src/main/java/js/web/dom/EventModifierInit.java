package js.web.dom;


import org.teavm.jso.JSProperty;


public interface EventModifierInit extends UIEvent.UIEventInit {
    @JSProperty
    boolean isAltKey();

    @JSProperty
    void setAltKey(boolean altKey);

    @JSProperty
    boolean isCtrlKey();

    @JSProperty
    void setCtrlKey(boolean ctrlKey);

    @JSProperty
    boolean isMetaKey();

    @JSProperty
    void setMetaKey(boolean metaKey);

    @JSProperty
    boolean isModifierAltGraph();

    @JSProperty
    void setModifierAltGraph(boolean modifierAltGraph);

    @JSProperty
    boolean isModifierCapsLock();

    @JSProperty
    void setModifierCapsLock(boolean modifierCapsLock);

    @JSProperty
    boolean isModifierFn();

    @JSProperty
    void setModifierFn(boolean modifierFn);

    @JSProperty
    boolean isModifierFnLock();

    @JSProperty
    void setModifierFnLock(boolean modifierFnLock);

    @JSProperty
    boolean isModifierHyper();

    @JSProperty
    void setModifierHyper(boolean modifierHyper);

    @JSProperty
    boolean isModifierNumLock();

    @JSProperty
    void setModifierNumLock(boolean modifierNumLock);

    @JSProperty
    boolean isModifierScrollLock();

    @JSProperty
    void setModifierScrollLock(boolean modifierScrollLock);

    @JSProperty
    boolean isModifierSuper();

    @JSProperty
    void setModifierSuper(boolean modifierSuper);

    @JSProperty
    boolean isModifierSymbol();

    @JSProperty
    void setModifierSymbol(boolean modifierSymbol);

    @JSProperty
    boolean isModifierSymbolLock();

    @JSProperty
    void setModifierSymbolLock(boolean modifierSymbolLock);

    @JSProperty
    boolean isShiftKey();

    @JSProperty
    void setShiftKey(boolean shiftKey);

}
