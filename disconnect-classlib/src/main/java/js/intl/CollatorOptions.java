package js.intl;

import js.lang.Any;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;


public interface CollatorOptions extends Any {
    @JSProperty
    @Nullable
    String getUsage();

    @JSProperty
    void setUsage(String usage);

    @JSProperty
    @Nullable
    String getLocaleMatcher();

    @JSProperty
    void setLocaleMatcher(String localeMatcher);

    @JSProperty
    boolean isNumeric();

    @JSProperty
    void setNumeric(boolean numeric);

    @JSProperty
    @Nullable
    String getCaseFirst();

    @JSProperty
    void setCaseFirst(String caseFirst);

    @JSProperty
    @Nullable
    String getSensitivity();

    @JSProperty
    void setSensitivity(String sensitivity);

    @JSProperty
    boolean isIgnorePunctuation();

    @JSProperty
    void setIgnorePunctuation(boolean ignorePunctuation);
}
