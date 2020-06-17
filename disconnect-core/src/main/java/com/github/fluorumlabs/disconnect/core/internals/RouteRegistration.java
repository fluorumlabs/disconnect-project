package com.github.fluorumlabs.disconnect.core.internals;


import java.util.List;

/**
 * Created by Artem Godin on 5/6/2020.
 */
public interface RouteRegistration {
	Class<?> getTarget();
	Class<?> getOutlet();
	Class<?> getParent();
	List<String> getRoutes();
	List<Class<? extends Exception>> getExceptions();
}
