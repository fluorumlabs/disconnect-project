package js.web.unknown;


import org.teavm.jso.JSByRef;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;


public interface StoreSiteSpecificExceptionsInformation extends StoreExceptionsInformation {
    @JSProperty
    @Nullable
    String[] getArrayOfDomainStrings();

    @JSProperty
    void setArrayOfDomainStrings(@JSByRef String... arrayOfDomainStrings);

}
