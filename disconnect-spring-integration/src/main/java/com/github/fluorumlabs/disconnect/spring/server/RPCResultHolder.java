package com.github.fluorumlabs.disconnect.spring.server;

import java.io.Serializable;

/**
 * Created by Artem Godin on 2/12/2020.
 */
public class RPCResultHolder implements Serializable {
	public RPCResultHolder(Object result) {
		this.result = result;
	}

	public RPCResultHolder() {
	}

	public String exceptionClass = null;

	public String exceptionMessage = null;

	public Object result = null;
}
