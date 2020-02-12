package com.github.fluorumlabs.disconnect.core;

/**
 * Created by Artem Godin on 2/12/2020.
 */
public class ServerSideException extends RuntimeException {
	private final String serverSideClass;

	public ServerSideException(String serverSideClass, String message) {
		super(message);
		this.serverSideClass = serverSideClass;
	}

	public String getServerSideClass() {
		return serverSideClass;
	}
}
