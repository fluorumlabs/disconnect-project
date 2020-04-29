package com.github.fluorumlabs.disconnect.example.basic.client;

import com.github.fluorumlabs.disconnect.core.annotations.AllowClientCalls;
import com.github.fluorumlabs.disconnect.core.annotations.CompilationUnit;
import js.lang.JsString;
import js.util.collections.Array;
import lombok.extern.slf4j.Slf4j;

/**
 * Created by Artem Godin on 2/28/2020.
 */
@CompilationUnit
@Slf4j
public class BackgroundService {
	@AllowClientCalls
	public Array<JsString> testSomething() {
		log.trace("I am here");
		return Array.of(JsString.of("test1"), JsString.of("test2"));
	}
}
