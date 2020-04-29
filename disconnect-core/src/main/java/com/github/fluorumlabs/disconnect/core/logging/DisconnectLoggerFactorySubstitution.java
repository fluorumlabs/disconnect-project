package com.github.fluorumlabs.disconnect.core.logging;

import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Artem Godin on 3/25/2020.
 */
public final class DisconnectLoggerFactorySubstitution {
	private static final Map<String, Logger> loggers = new HashMap<>();
	private static final ILoggerFactory loggerFactory = new DisconnectLoggerFactory();

	private DisconnectLoggerFactorySubstitution() {
	}

	public static Logger getLogger(String name) {
		return loggers.computeIfAbsent(name, DisconnectLogger::new);
	}

	public static Logger getLogger(Class<?> clazz) {
		return getLogger(clazz.getName());
	}

	public static ILoggerFactory getILoggerFactory() {
		return loggerFactory;
	}}
