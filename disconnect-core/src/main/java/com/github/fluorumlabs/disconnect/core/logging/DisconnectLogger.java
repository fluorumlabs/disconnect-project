package com.github.fluorumlabs.disconnect.core.logging;

import com.github.fluorumlabs.disconnect.core.internals.DisconnectUtils;
import js.lang.Any;
import js.lang.JsString;
import js.util.RegExp;
import org.slf4j.Logger;
import org.slf4j.Marker;
import org.teavm.jso.JSBody;

import java.io.PrintWriter;
import java.io.StringWriter;

import static js.web.dom.Window.CONSOLE;

/**
 * Created by Artem Godin on 3/24/2020.
 */
public class DisconnectLogger implements Logger {
	private static final JsString TRACE_BADGE =
			JsString.of("background-color: #f1f1fc; color: #5755d9; border-radius: 4px");

	private static final JsString INFO_BADGE =
			JsString.of("background-color: #32b643; color: #000; border-radius: 4px");

	private static final JsString DEBUG_BADGE =
			JsString.of("background-color: #5755d9; color: #000; border-radius: 4px");

	private static final JsString WARN_BADGE =
			JsString.of("background-color: #ffb700; color: #000; border-radius: 4px");

	private static final JsString ERROR_BADGE =
			JsString.of("background-color: #e85600; color: #000; border-radius: 4px");

	private static final JsString DEFAULT_STYLE = JsString.of("");

	private static final RegExp PACKAGE_NAME_SHORTENER = RegExp.create("([a-z])[a-z0-9_]+\\.", "g");

	private final String name;

	public DisconnectLogger(String name) {
		this.name = JsString.of(name).replace(PACKAGE_NAME_SHORTENER, "$1.").toString();
	}

	@JSBody(params = "any", script = "var result = any.toString && any.toString();\n" +
			"if ( result !== '[object Object]' ) {\n" +
			"    return result;\n" +
			"}\n" +
			"try {\n" +
			"    return JSON.stringify(any)\n" +
			"} catch (e) {\n" +
			"    return '[object Object]'\n" +
			"}")
	private static native String stringify(Any any);

	private static String stringify(Object any) {
		if (any != null && !DisconnectUtils.optional(any.getClass()).isPresent()) {
			return stringify((Any) any);
		} else {
			return String.valueOf(any);
		}
	}

	private String formatThrowable(Throwable t) {
		if (t == null) {
			return "null";
		}
		StringWriter stringWriter = new StringWriter();
		try (PrintWriter printWriter = new PrintWriter(stringWriter)) {
			printWriter.print("%c ");
			printWriter.print(name);
			printWriter.print(" %c ");
			t.printStackTrace(printWriter);
		}
		return stringWriter.toString();
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public boolean isTraceEnabled() {
		return true;
	}

	@Override
	public void trace(String msg) {
		CONSOLE.trace(format(msg), TRACE_BADGE, DEFAULT_STYLE);
	}

	@Override
	public void trace(String format, Object arg) {
		CONSOLE.trace(format(format, arg), TRACE_BADGE, DEFAULT_STYLE);
	}

	@Override
	public void trace(String format, Object arg1, Object arg2) {
		CONSOLE.trace(format(format, arg1, arg2), TRACE_BADGE, DEFAULT_STYLE);
	}

	@Override
	public void trace(String format, Object... arguments) {
		CONSOLE.trace(format(format, arguments), TRACE_BADGE, DEFAULT_STYLE);
	}

	@Override
	public void trace(String msg, Throwable t) {
		CONSOLE.trace(format(msg), TRACE_BADGE, DEFAULT_STYLE);
		CONSOLE.trace(formatThrowable(t), TRACE_BADGE, DEFAULT_STYLE);
	}

	@Override
	public boolean isTraceEnabled(Marker marker) {
		return true;
	}

	@Override
	public void trace(Marker marker, String msg) {
		CONSOLE.trace(format(msg), TRACE_BADGE, DEFAULT_STYLE);

	}

	@Override
	public void trace(Marker marker, String format, Object arg) {
		CONSOLE.trace(format(format, arg), TRACE_BADGE, DEFAULT_STYLE);

	}

	@Override
	public void trace(Marker marker, String format, Object arg1, Object arg2) {
		CONSOLE.trace(format(format, arg1, arg2), TRACE_BADGE, DEFAULT_STYLE);

	}

	@Override
	public void trace(Marker marker, String format, Object... argArray) {
		CONSOLE.trace(format(format, argArray), TRACE_BADGE, DEFAULT_STYLE);

	}

	@Override
	public void trace(Marker marker, String msg, Throwable t) {
		CONSOLE.trace(format(msg), TRACE_BADGE, DEFAULT_STYLE);
		CONSOLE.trace(formatThrowable(t), TRACE_BADGE, DEFAULT_STYLE);
	}

	@Override
	public boolean isDebugEnabled() {
		return true;
	}

	@Override
	public void debug(String msg) {
		CONSOLE.debug(format(msg), DEBUG_BADGE, DEFAULT_STYLE);
	}

	@Override
	public void debug(String format, Object arg) {
		CONSOLE.debug(format(format, arg), DEBUG_BADGE, DEFAULT_STYLE);
	}

	@Override
	public void debug(String format, Object arg1, Object arg2) {
		CONSOLE.debug(format(format, arg1, arg2), DEBUG_BADGE, DEFAULT_STYLE);
	}

	@Override
	public void debug(String format, Object... arguments) {
		CONSOLE.debug(format(format, arguments), DEBUG_BADGE, DEFAULT_STYLE);
	}

	@Override
	public void debug(String msg, Throwable t) {
		CONSOLE.debug(format(msg), DEBUG_BADGE, DEFAULT_STYLE);
		CONSOLE.debug(formatThrowable(t), DEBUG_BADGE, DEFAULT_STYLE);
	}

	@Override
	public boolean isDebugEnabled(Marker marker) {
		return true;
	}

	@Override
	public void debug(Marker marker, String msg) {
		CONSOLE.debug(format(msg), DEBUG_BADGE, DEFAULT_STYLE);
	}

	@Override
	public void debug(Marker marker, String format, Object arg) {
		CONSOLE.debug(format(format, arg), DEBUG_BADGE, DEFAULT_STYLE);
	}

	@Override
	public void debug(Marker marker, String format, Object arg1, Object arg2) {
		CONSOLE.debug(format(format, arg1, arg2), DEBUG_BADGE, DEFAULT_STYLE);
	}

	@Override
	public void debug(Marker marker, String format, Object... arguments) {
		CONSOLE.debug(format(format, arguments), DEBUG_BADGE, DEFAULT_STYLE);
	}

	@Override
	public void debug(Marker marker, String msg, Throwable t) {
		CONSOLE.debug(format(msg), DEBUG_BADGE, DEFAULT_STYLE);
		CONSOLE.debug(formatThrowable(t), DEBUG_BADGE, DEFAULT_STYLE);
	}

	@Override
	public boolean isInfoEnabled() {
		return true;
	}

	@Override
	public void info(String msg) {
		CONSOLE.info(format(msg), INFO_BADGE, DEFAULT_STYLE);
	}

	@Override
	public void info(String format, Object arg) {
		CONSOLE.info(format(format, arg), INFO_BADGE, DEFAULT_STYLE);
	}

	@Override
	public void info(String format, Object arg1, Object arg2) {
		CONSOLE.info(format(format, arg1, arg2), INFO_BADGE, DEFAULT_STYLE);
	}

	@Override
	public void info(String format, Object... arguments) {
		CONSOLE.info(format(format, arguments), INFO_BADGE, DEFAULT_STYLE);
	}

	@Override
	public void info(String msg, Throwable t) {
		CONSOLE.info(format(msg), INFO_BADGE, DEFAULT_STYLE);
		CONSOLE.info(formatThrowable(t), INFO_BADGE, DEFAULT_STYLE);
	}

	@Override
	public boolean isInfoEnabled(Marker marker) {
		return false;
	}

	@Override
	public void info(Marker marker, String msg) {
		CONSOLE.info(format(msg), INFO_BADGE, DEFAULT_STYLE);
	}

	@Override
	public void info(Marker marker, String format, Object arg) {
		CONSOLE.info(format(format, arg), INFO_BADGE, DEFAULT_STYLE);
	}

	@Override
	public void info(Marker marker, String format, Object arg1, Object arg2) {
		CONSOLE.info(format(format, arg1, arg2), INFO_BADGE, DEFAULT_STYLE);
	}

	@Override
	public void info(Marker marker, String format, Object... arguments) {
		CONSOLE.info(format(format, arguments), INFO_BADGE, DEFAULT_STYLE);
	}

	@Override
	public void info(Marker marker, String msg, Throwable t) {
		CONSOLE.info(format(msg), INFO_BADGE, DEFAULT_STYLE);
		CONSOLE.info(formatThrowable(t), INFO_BADGE, DEFAULT_STYLE);
	}

	@Override
	public boolean isWarnEnabled() {
		return true;
	}

	@Override
	public void warn(String msg) {
		CONSOLE.warn(format(msg), WARN_BADGE, DEFAULT_STYLE);
	}

	@Override
	public void warn(String format, Object arg) {
		CONSOLE.warn(format(format, arg), WARN_BADGE, DEFAULT_STYLE);
	}

	@Override
	public void warn(String format, Object... arguments) {
		CONSOLE.warn(format(format, arguments), WARN_BADGE, DEFAULT_STYLE);
	}

	@Override
	public void warn(String format, Object arg1, Object arg2) {
		CONSOLE.warn(format(format, arg1, arg2), WARN_BADGE, DEFAULT_STYLE);
	}

	@Override
	public void warn(String msg, Throwable t) {
		CONSOLE.warn(format(msg), WARN_BADGE, DEFAULT_STYLE);
		CONSOLE.warn(formatThrowable(t), WARN_BADGE, DEFAULT_STYLE);
	}

	@Override
	public boolean isWarnEnabled(Marker marker) {
		return true;
	}

	@Override
	public void warn(Marker marker, String msg) {
		CONSOLE.warn(format(msg), WARN_BADGE, DEFAULT_STYLE);
	}

	@Override
	public void warn(Marker marker, String format, Object arg) {
		CONSOLE.warn(format(format, arg), WARN_BADGE, DEFAULT_STYLE);
	}

	@Override
	public void warn(Marker marker, String format, Object arg1, Object arg2) {
		CONSOLE.warn(format(format, arg1, arg2), WARN_BADGE, DEFAULT_STYLE);
	}

	@Override
	public void warn(Marker marker, String format, Object... arguments) {
		CONSOLE.warn(format(format, arguments), WARN_BADGE, DEFAULT_STYLE);
	}

	@Override
	public void warn(Marker marker, String msg, Throwable t) {
		CONSOLE.warn(format(msg), WARN_BADGE, DEFAULT_STYLE);
		CONSOLE.warn(formatThrowable(t), WARN_BADGE, DEFAULT_STYLE);
	}

	@Override
	public boolean isErrorEnabled() {
		return true;
	}

	@Override
	public void error(String msg) {
		CONSOLE.error(format(msg), ERROR_BADGE, DEFAULT_STYLE);
	}

	@Override
	public void error(String format, Object arg) {
		CONSOLE.error(format(format, arg), ERROR_BADGE, DEFAULT_STYLE);
	}

	@Override
	public void error(String format, Object arg1, Object arg2) {
		CONSOLE.error(format(format, arg1, arg2), ERROR_BADGE, DEFAULT_STYLE);
	}

	@Override
	public void error(String format, Object... arguments) {
		CONSOLE.error(format(format, arguments), ERROR_BADGE, DEFAULT_STYLE);
	}

	@Override
	public void error(String msg, Throwable t) {
		CONSOLE.error(format(msg), ERROR_BADGE, DEFAULT_STYLE);
		CONSOLE.error(formatThrowable(t), ERROR_BADGE, DEFAULT_STYLE);
	}

	@Override
	public boolean isErrorEnabled(Marker marker) {
		return true;
	}

	@Override
	public void error(Marker marker, String msg) {
		CONSOLE.error(format(msg), ERROR_BADGE, DEFAULT_STYLE);
	}

	@Override
	public void error(Marker marker, String format, Object arg) {
		CONSOLE.error(format(format, arg), ERROR_BADGE, DEFAULT_STYLE);
	}

	@Override
	public void error(Marker marker, String format, Object arg1, Object arg2) {
		CONSOLE.error(format(format, arg1, arg2), ERROR_BADGE, DEFAULT_STYLE);
	}

	@Override
	public void error(Marker marker, String format, Object... arguments) {
		CONSOLE.error(format(format, arguments), ERROR_BADGE, DEFAULT_STYLE);
	}

	@Override
	public void error(Marker marker, String msg, Throwable t) {
		CONSOLE.error(format(msg), ERROR_BADGE, DEFAULT_STYLE);
		CONSOLE.error(formatThrowable(t), ERROR_BADGE, DEFAULT_STYLE);
	}

	private String format(String format, Object... arguments) {
		StringBuilder sb = new StringBuilder("%c ");
		sb.append(name).append(" %c ");
		int index = 0;
		int argIndex = 0;
		while (index < format.length()) {
			int next = format.indexOf("{}", index);
			if (next == -1) {
				break;
			}
			sb.append(format.subSequence(index, next));
			sb.append(argIndex < arguments.length ? stringify(arguments[argIndex]) : "{}");
			index = next + 2;
			++argIndex;
		}
		sb.append(format.substring(index));
		return sb.toString();
	}

	private String format(String format, Object argument1) {
		StringBuilder sb = new StringBuilder("%c ");
		sb.append(name).append(" %c ");
		int next = format.indexOf("{}");
		if (next >= 0) {
			sb.append(format.subSequence(0, next));
			sb.append(stringify(argument1));
			sb.append(format.substring(next + 2));
		}
		return sb.toString();
	}

	private String format(String format, Object argument1, Object argument2) {
		StringBuilder sb = new StringBuilder("%c ");
		sb.append(name).append(" %c ");
		int next = format.indexOf("{}");
		if (next >= 0) {
			sb.append(format.subSequence(0, next));
			sb.append(stringify(argument1));
			int index = next + 2;
			next = format.indexOf("{}", index);
			if (next >= 0) {
				sb.append(format.subSequence(index, next));
				sb.append(stringify(argument2));
				sb.append(format.substring(next + 2));
			} else {
				sb.append(format.substring(next + 2));
			}
		}

		return sb.toString();
	}
}
