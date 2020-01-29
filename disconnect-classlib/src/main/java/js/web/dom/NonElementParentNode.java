package js.web.dom;

import js.lang.Any;

import javax.annotation.Nullable;


public interface NonElementParentNode extends Any {
    /**
     * Returns the first element within node's descendants whose ID is elementId.
     */
    @Nullable
    Element getElementById(String elementId);
}
