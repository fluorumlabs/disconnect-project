package com.github.fluorumlabs.disconnect.core.logging;

import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;

/**
 * Created by Artem Godin on 3/25/2020.
 */
public class DisconnectProductionLoggerFactory implements ILoggerFactory {
	private final Logger productionLogger = new DisconnectProductionLogger();

	@Override
	public Logger getLogger(String name) {
		return productionLogger;
	}
}
