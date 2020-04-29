package js.web.webworkers;

import js.web.beacon.NavigatorBeacon;
import js.web.dom.NavigatorConcurrentHardware;
import js.web.dom.NavigatorID;
import js.web.dom.NavigatorOnLine;
import js.web.serviceworker.ServiceWorkerContainer;
import js.web.storage.NavigatorStorage;
import org.teavm.jso.JSProperty;

/**
 * Created by Artem Godin on 2/28/2020.
 */
public interface WorkerNavigator extends NavigatorID,
		NavigatorOnLine, NavigatorBeacon, NavigatorConcurrentHardware, NavigatorStorage {
	@JSProperty
	ServiceWorkerContainer getServiceWorker();
}
