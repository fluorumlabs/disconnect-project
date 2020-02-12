package com.github.fluorumlabs.disconnect.core;

import java.io.Serializable;

/**
 * Created by Artem Godin on 2/12/2020.
 */
public class RPCResult implements Serializable {
	String exceptionClass = null;
	String exceptionMessage = null;
}
