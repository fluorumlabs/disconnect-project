package js.intl;

import js.lang.Any;
import org.teavm.jso.JSProperty;


public interface ResolvedCollatorOptions extends Any {
    @JSProperty
    String getLocale();

    @JSProperty
    void setLocale(String locale);

    @JSProperty
    String getUsage();

    @JSProperty
    void setUsage(String usage);

    @JSProperty
    String getSensitivity();

    @JSProperty
    void setSensitivity(String sensitivity);

    @JSProperty
    boolean isIgnorePunctuation();

    @JSProperty
    void setIgnorePunctuation(boolean ignorePunctuation);

    @JSProperty
    String getCollation();

    @JSProperty
    void setCollation(String collation);

    @JSProperty
    String getCaseFirst();

    @JSProperty
    void setCaseFirst(String caseFirst);

    @JSProperty
    boolean isNumeric();

    @JSProperty
    void setNumeric(boolean numeric);
}
