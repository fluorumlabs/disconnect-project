package com.github.fluorumlabs.disconnect.core.logging;

import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;

/**
 * Created by Artem Godin on 3/25/2020.
 */
public final class DisconnectProductionLoggerFactorySubstitution {
	private static final Logger productionLogger = new DisconnectProductionLogger();

	private static final ILoggerFactory productionLoggerFactory =
			new DisconnectProductionLoggerFactory();

	private DisconnectProductionLoggerFactorySubstitution() {
	}

	public static Logger getLogger(String name) {
		return productionLogger;
	}

	public static Logger getLogger(Class<?> clazz) {
		return productionLogger;
	}

	public static ILoggerFactory getILoggerFactory() {
		return productionLoggerFactory;
	}
}
