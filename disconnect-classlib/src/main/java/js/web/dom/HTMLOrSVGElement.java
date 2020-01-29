package js.web.dom;

import js.web.dom.DOMStringMap;
import js.web.dom.FocusOptions;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;import js.lang.Any;


public interface HTMLOrSVGElement extends Any {
    @JSProperty
    DOMStringMap getDataset();

    @JSProperty
    @Nullable
    String getNonce();

    @JSProperty
    void setNonce(String nonce);

    @JSProperty
    double getTabIndex();

    @JSProperty
    void setTabIndex(double tabIndex);

    void blur();
    void focus(FocusOptions options);
    void focus();
}
