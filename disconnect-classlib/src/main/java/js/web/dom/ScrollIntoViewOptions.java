package js.web.dom;


import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;


public interface ScrollIntoViewOptions extends ScrollOptions {
    @JSProperty
    @Nullable
    ScrollLogicalPosition getBlock();

    @JSProperty
    void setBlock(ScrollLogicalPosition block);

    @JSProperty
    @Nullable
    ScrollLogicalPosition getInline();

    @JSProperty
    void setInline(ScrollLogicalPosition inline);

}
