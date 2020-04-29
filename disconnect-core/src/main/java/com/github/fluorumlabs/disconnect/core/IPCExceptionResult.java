package com.github.fluorumlabs.disconnect.core;

import java.io.Serializable;

/**
 * Created by Artem Godin on 2/12/2020.
 */
public class IPCExceptionResult implements Serializable {
	public String exceptionClass = null;
	public String exceptionMessage = null;
}
