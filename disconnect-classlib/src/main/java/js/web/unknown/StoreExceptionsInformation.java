package js.web.unknown;


import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;


public interface StoreExceptionsInformation extends ExceptionInformation {
    @JSProperty
    @Nullable
    String  getDetailURI();

    @JSProperty
    void setDetailURI(String detailURI);

    @JSProperty
    @Nullable
    String  getExplanationString();

    @JSProperty
    void setExplanationString(String explanationString);

    @JSProperty
    @Nullable
    String  getSiteName();

    @JSProperty
    void setSiteName(String siteName);

}
