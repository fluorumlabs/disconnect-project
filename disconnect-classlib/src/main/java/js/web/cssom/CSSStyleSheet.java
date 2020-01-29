package js.web.cssom;


import js.lang.Unknown;
import js.web.dom.Element;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * A single CSS style sheet. It inherits properties and methods from its parent, StyleSheet.
 */
public interface CSSStyleSheet extends StyleSheet {
    @JSBody(script = "return CSSStyleSheet.prototype")
    static CSSStyleSheet prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new CSSStyleSheet()")
    static CSSStyleSheet create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    CSSRuleList getCssRules();

    @Deprecated
    @JSProperty
    String getCssText();

    @JSProperty
    void setCssText(String cssText);

    @Deprecated
    @JSProperty
    String getId();

    @Deprecated
    @JSProperty
    StyleSheetList getImports();

    @Deprecated
    @JSProperty
    boolean isIsAlternate();

    @Deprecated
    @JSProperty
    boolean isIsPrefAlternate();

    @JSProperty
    @Nullable
    CSSRule getOwnerRule();

    @Deprecated
    @JSProperty
    Element getOwningElement();

    @Deprecated
    @JSProperty
    Unknown getPages();

    @Deprecated
    @JSProperty
    boolean isReadOnly();

    @JSProperty
    CSSRuleList getRules();

    @Deprecated
    int addImport(String bstrURL, int lIndex);

    @Deprecated
    int addImport(String bstrURL);

    @Deprecated
    int addPageRule(String bstrSelector, String bstrStyle, int lIndex);

    @Deprecated
    int addPageRule(String bstrSelector, String bstrStyle);

    int addRule(String bstrSelector, String bstrStyle, int lIndex);

    int addRule(String bstrSelector, String bstrStyle);

    int addRule(String bstrSelector);

    void deleteRule(int index);

    void deleteRule();

    int insertRule(String rule, int index);

    int insertRule(String rule);

    @Deprecated
    void removeImport(int lIndex);

    void removeRule(int lIndex);

}
