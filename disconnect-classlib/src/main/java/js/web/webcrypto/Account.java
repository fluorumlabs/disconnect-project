package js.web.webcrypto;

import js.lang.Any;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;


public interface Account extends Any {
    @JSProperty
    String getDisplayName();

    @JSProperty
    void setDisplayName(String displayName);

    @JSProperty
    String getId();

    @JSProperty
    void setId(String id);

    @JSProperty
    @Nullable
    String getImageURL();

    @JSProperty
    void setImageURL(String imageURL);

    @JSProperty
    @Nullable
    String getName();

    @JSProperty
    void setName(String name);

    @JSProperty
    String getRpDisplayName();

    @JSProperty
    void setRpDisplayName(String rpDisplayName);
}
