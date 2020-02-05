package com.github.fluorumlabs.disconnect.polymer.types;

import com.github.fluorumlabs.disconnect.polymer.elements.TemplateInstanceBase;
import js.lang.Any;
import js.lang.Unknown;
import js.util.Record;
import org.teavm.jso.JSFunctor;
import org.teavm.jso.JSProperty;

/**
 * Created by Artem Godin on 2/3/2020.
 */
public interface TemplatizeOptions extends Any {
	@JSProperty
	Record<Unknown> getInstanceProps();

	@JSProperty
	void setInstanceProps(Record<Unknown> instanceProps);

	@JSProperty
	boolean getMutableData();

	@JSProperty
	void setMutableData(boolean mutableData);

	@JSProperty
	boolean getParentModel();

	@JSProperty
	void setParentModel(boolean parentModel);

	@JSProperty
	HostPropForwarder getForwardHostProp();

	@JSProperty
	void setForwardHostProp(HostPropForwarder forwardHostProp);

	@JSProperty
	InstancePropNotifier getNotifyInstanceProp();

	@JSProperty
	void setNotifyInstanceProp(InstancePropNotifier notifyInstanceProp);

	@JSFunctor
	@FunctionalInterface
	interface HostPropForwarder extends Any {
		void forwardHostProp(String property, Any value);
	}

	@JSFunctor
	@FunctionalInterface
	interface InstancePropNotifier extends Any {
		void notifyInstanceProp(TemplateInstanceBase instance, String property, Any value);
	}
}
