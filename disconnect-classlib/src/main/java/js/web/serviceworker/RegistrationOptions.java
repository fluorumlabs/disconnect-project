package js.web.serviceworker;

import js.lang.Any;
import js.web.webworkers.WorkerType;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;


public interface RegistrationOptions extends Any {
    @JSProperty
    @Nullable
    String getScope();

    @JSProperty
    void setScope(String scope);

    @JSProperty
    @Nullable
    WorkerType getType();

    @JSProperty
    void setType(WorkerType type);

    @JSProperty
    @Nullable
    ServiceWorkerUpdateViaCache getUpdateViaCache();

    @JSProperty
    void setUpdateViaCache(ServiceWorkerUpdateViaCache updateViaCache);

}
