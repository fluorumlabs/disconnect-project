package js.web.dom;

import js.lang.Any;
import org.teavm.jso.JSByRef;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;


public interface MutationObserverInit extends Any {
    /**
     * Set to a list of attribute local names (without namespace) if not all attribute mutations need to be observed and attributes is true or omitted.
     */
    @JSProperty
    @Nullable
    String[] getAttributeFilter();

    @JSProperty
    void setAttributeFilter(@JSByRef String... attributeFilter);

    /**
     * Set to true if attributes is true or omitted and target's attribute value before the mutation needs to be recorded.
     */
    @JSProperty
    boolean isAttributeOldValue();

    @JSProperty
    void setAttributeOldValue(boolean attributeOldValue);

    /**
     * Set to true if mutations to target's attributes are to be observed. Can be omitted if attributeOldValue or attributeFilter is specified.
     */
    @JSProperty
    boolean isAttributes();

    @JSProperty
    void setAttributes(boolean attributes);

    /**
     * Set to true if mutations to target's data are to be observed. Can be omitted if characterDataOldValue is specified.
     */
    @JSProperty
    boolean isCharacterData();

    @JSProperty
    void setCharacterData(boolean characterData);

    /**
     * Set to true if characterData is set to true or omitted and target's data before the mutation needs to be recorded.
     */
    @JSProperty
    boolean isCharacterDataOldValue();

    @JSProperty
    void setCharacterDataOldValue(boolean characterDataOldValue);

    /**
     * Set to true if mutations to target's children are to be observed.
     */
    @JSProperty
    boolean isChildList();

    @JSProperty
    void setChildList(boolean childList);

    /**
     * Set to true if mutations to not just target, but also target's descendants are to be observed.
     */
    @JSProperty
    boolean isSubtree();

    @JSProperty
    void setSubtree(boolean subtree);

}
