package js.web.mediastreams;

import js.lang.Any;
import js.util.collections.Array;
import org.teavm.jso.JSByRef;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;


public interface MediaKeySystemConfiguration extends Any {
    @JSProperty
    @Nullable
    Array<MediaKeySystemMediaCapability> getAudioCapabilities();

    @JSProperty
    void setAudioCapabilities(@JSByRef MediaKeySystemMediaCapability... audioCapabilities);

    @JSProperty
    void setAudioCapabilities(Array<MediaKeySystemMediaCapability> audioCapabilities);

    @JSProperty
    @Nullable
    MediaKeysRequirement getDistinctiveIdentifier();

    @JSProperty
    void setDistinctiveIdentifier(MediaKeysRequirement distinctiveIdentifier);

    @JSProperty
    @Nullable
    String[] getInitDataTypes();

    @JSProperty
    void setInitDataTypes(@JSByRef String... initDataTypes);

    @JSProperty
    @Nullable
    String getLabel();

    @JSProperty
    void setLabel(String label);

    @JSProperty
    @Nullable
    MediaKeysRequirement getPersistentState();

    @JSProperty
    void setPersistentState(MediaKeysRequirement persistentState);

    @JSProperty
    @Nullable
    String[] getSessionTypes();

    @JSProperty
    void setSessionTypes(@JSByRef String... sessionTypes);

    @JSProperty
    @Nullable
    Array<MediaKeySystemMediaCapability> getVideoCapabilities();

    @JSProperty
    void setVideoCapabilities(@JSByRef MediaKeySystemMediaCapability... videoCapabilities);

    @JSProperty
    void setVideoCapabilities(Array<MediaKeySystemMediaCapability> videoCapabilities);

}
