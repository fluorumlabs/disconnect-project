package com.github.fluorumlabs.disconnect.core;

/**
 * Created by Artem Godin on 2/12/2020.
 */
public class EventStreamErrorException extends RuntimeException {
	public EventStreamErrorException(String message) {
		super(message);
	}
}
