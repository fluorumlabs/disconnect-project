package com.github.fluorumlabs.disconnect.core.logging;

import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Artem Godin on 3/25/2020.
 */
public class DisconnectLoggerFactory implements ILoggerFactory {
	private final Map<String, Logger> loggers = new HashMap<>();

	@Override
	public Logger getLogger(String name) {
		return loggers.computeIfAbsent(name, DisconnectLogger::new);
	}
}
