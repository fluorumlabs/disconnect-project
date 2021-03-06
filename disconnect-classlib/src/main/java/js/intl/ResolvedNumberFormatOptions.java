package js.intl;

import js.lang.Any;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;


public interface ResolvedNumberFormatOptions extends Any {
    @JSProperty
    String getLocale();

    @JSProperty
    void setLocale(String locale);

    @JSProperty
    @Nullable
    String getNumberingSystem();

    @JSProperty
    void setNumberingSystem(String numberingSystem);

    @JSProperty
    @Nullable
    String getStyle();

    @JSProperty
    void setStyle(String style);

    @JSProperty
    @Nullable
    String getCurrency();

    @JSProperty
    void setCurrency(String currency);

    @JSProperty
    @Nullable
    String getCurrencyDisplay();

    @JSProperty
    void setCurrencyDisplay(String currencyDisplay);

    @JSProperty
    int getMinimumIntegerDigits();

    @JSProperty
    void setMinimumIntegerDigits(int minimumIntegerDigits);

    @JSProperty
    int getMinimumFractionDigits();

    @JSProperty
    void setMinimumFractionDigits(int minimumFractionDigits);

    @JSProperty
    int getMaximumFractionDigits();

    @JSProperty
    void setMaximumFractionDigits(int maximumFractionDigits);

    @JSProperty
    int getMinimumSignificantDigits();

    @JSProperty
    void setMinimumSignificantDigits(int minimumSignificantDigits);

    @JSProperty
    int getMaximumSignificantDigits();

    @JSProperty
    void setMaximumSignificantDigits(int maximumSignificantDigits);

    @JSProperty
    boolean isUseGrouping();

    @JSProperty
    void setUseGrouping(boolean useGrouping);
}
