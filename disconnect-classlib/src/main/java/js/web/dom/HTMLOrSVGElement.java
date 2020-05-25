package js.web.dom;

import js.lang.Any;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;


public interface HTMLOrSVGElement extends Any {
    @JSProperty
    DOMStringMap getDataset();

    @JSProperty
    @Nullable
    String getNonce();

    @JSProperty
    void setNonce(String nonce);

    @JSProperty
    int getTabIndex();

    @JSProperty
    void setTabIndex(int tabIndex);

    void blur();

    void focus(FocusOptions options);

    void focus();
}
