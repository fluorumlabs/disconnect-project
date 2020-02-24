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
	/**
	 * Gets instance props.
	 *
	 * @return the instance props
	 */
	@JSProperty
	Record<Unknown> getInstanceProps();

	/**
	 * Sets instance props.
	 *
	 * @param instanceProps the instance props
	 */
	@JSProperty
	void setInstanceProps(Record<Unknown> instanceProps);

	/**
	 * Gets mutable data.
	 *
	 * @return the mutable data
	 */
	@JSProperty
	boolean getMutableData();

	/**
	 * Sets mutable data.
	 *
	 * @param mutableData the mutable data
	 */
	@JSProperty
	void setMutableData(boolean mutableData);

	/**
	 * Gets parent model.
	 *
	 * @return the parent model
	 */
	@JSProperty
	boolean getParentModel();

	/**
	 * Sets parent model.
	 *
	 * @param parentModel the parent model
	 */
	@JSProperty
	void setParentModel(boolean parentModel);

	/**
	 * Gets forward host prop.
	 *
	 * @return the forward host prop
	 */
	@JSProperty
	HostPropForwarder getForwardHostProp();

	/**
	 * Sets forward host prop.
	 *
	 * @param forwardHostProp the forward host prop
	 */
	@JSProperty
	void setForwardHostProp(HostPropForwarder forwardHostProp);

	/**
	 * Gets notify instance prop.
	 *
	 * @return the notify instance prop
	 */
	@JSProperty
	InstancePropNotifier getNotifyInstanceProp();

	/**
	 * Sets notify instance prop.
	 *
	 * @param notifyInstanceProp the notify instance prop
	 */
	@JSProperty
	void setNotifyInstanceProp(InstancePropNotifier notifyInstanceProp);

	/**
	 * The interface Host prop forwarder.
	 */
	@JSFunctor
	@FunctionalInterface
	interface HostPropForwarder extends Any {
		/**
		 * Forward host prop.
		 *
		 * @param property the property
		 * @param value    the value
		 */
		void forwardHostProp(String property, Any value);
	}

	/**
	 * The interface Instance prop notifier.
	 */
	@JSFunctor
	@FunctionalInterface
	interface InstancePropNotifier extends Any {
		/**
		 * Notify instance prop.
		 *
		 * @param instance the instance
		 * @param property the property
		 * @param value    the value
		 */
		void notifyInstanceProp(TemplateInstanceBase instance, String property, Any value);
	}
}
