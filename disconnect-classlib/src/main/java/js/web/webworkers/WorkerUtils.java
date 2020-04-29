package js.web.webworkers;

import js.web.dom.WindowBase64;
import js.web.indexeddb.IDBFactory;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/**
 * Created by Artem Godin on 2/28/2020.
 */
public interface WorkerUtils extends WindowBase64 {

	@JSBody(script = "return WorkerNavigator.prototype")
	static WorkerUtils prototype() {
		throw new UnsupportedOperationException("Available only in JavaScript");
	}

	@JSBody(script = "return new WorkerNavigator()")
	static WorkerUtils create() {
		throw new UnsupportedOperationException("Available only in JavaScript");
	}

	@JSProperty
	IDBFactory getIndexedDB();

	@JSProperty
	WorkerNavigator getNavigator();

	@JSBody(params = "urls", script = "this.importScripts.apply(this, urls)")
	void importScripts(String... urls);
}
