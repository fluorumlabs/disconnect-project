package js.web.console;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import js.lang.Any;
import js.lang.Unknown;
import org.teavm.jso.JSByRef;

/** Provides access to the browser's debugging console (e.g. the Web Console in Firefox). The specifics of how it works varies from browser to browser, but there is a de facto set of features that are typically provided. */
public interface Console extends Any {
    @JSProperty
    Unknown getMemory();

    @JSProperty
    void setMemory(Unknown memory);

    @JSBody(params = {"condition","message","data"}, script="this.assert.apply(this, [condition, message].concat(data));")
    void doAssert(boolean condition, String message, @JSByRef Any... data);
    @JSBody(params = {"condition","message"}, script="this.assert.apply(condition, message);")
    void doAssert(boolean condition, String message);
    @JSBody(params = {"condition"}, script="this.assert(condition);")
    void doAssert(boolean condition);
    @JSBody(script="this.assert();")
    void doAssert();
    void clear();
    void count(String label);
    void count();
    @JSBody(params = {"message","optionalParams"}, script="this.debug.apply(this, [message].concat(optionalParams));")
    void debug(Any message, @JSByRef Any... optionalParams);
    void debug(Any message);
    void debug(String message);
    void debug(int message);
    void debug(double message);
    void debug(boolean message);
    void debug();
    @JSBody(params = {"value","optionalParams"}, script="this.dir.apply(this, [value].concat(optionalParams));")
    void dir(Any value, @JSByRef Any... optionalParams);
    void dir(Any value);
    void dir();
    void dirxml(Any value);
    @JSBody(params = {"message","optionalParams"}, script="this.error.apply(this, [message].concat(optionalParams));")
    void error(Any message, @JSByRef Any... optionalParams);
    void error(Any message);
    void error(String message);
    void error(int message);
    void error(double message);
    void error(boolean message);
    void error();
    @JSBody(params = {"message","optionalParams"}, script="this.exception.apply(this, [message].concat(optionalParams));")
    void exception(String message, @JSByRef Any... optionalParams);
    void exception(String message);
    void exception();
    @JSBody(params = {"groupTitle","optionalParams"}, script="this.group.apply(this, [groupTitle].concat(optionalParams));")
    void group(String groupTitle, @JSByRef Any... optionalParams);
    void group(String groupTitle);
    void group();
    @JSBody(params = {"groupTitle","optionalParams"}, script="this.groupCollapsed.apply(this, [groupTitle].concat(optionalParams));")
    void groupCollapsed(String groupTitle, @JSByRef Any... optionalParams);
    void groupCollapsed(String groupTitle);
    void groupCollapsed();
    void groupEnd();
    @JSBody(params = {"message","optionalParams"}, script="this.info.apply(this, [message].concat(optionalParams));")
    void info(Any message, @JSByRef Any... optionalParams);
    void info(Any message);
    void info(String message);
    void info(int message);
    void info(double message);
    void info(boolean message);
    void info();
    @JSBody(params = {"message","optionalParams"}, script="this.log.apply(this, [message].concat(optionalParams));")
    void log(Any message, @JSByRef Any... optionalParams);
    void log(Any message);
    void log(String message);
    void log(int message);
    void log(double message);
    void log(boolean message);
    void log();
    void markTimeline(String label);
    void markTimeline();
    void profile(String reportName);
    void profile();
    void profileEnd(String reportName);
    void profileEnd();
    @JSBody(params = {"tabularData"}, script="this.table.apply(this, tabularData);")
    void table(@JSByRef Any... tabularData);
    void time(String label);
    void time();
    void timeEnd(String label);
    void timeEnd();
    void timeStamp(String label);
    void timeStamp();
    void timeline(String label);
    void timeline();
    void timelineEnd(String label);
    void timelineEnd();
    @JSBody(params = {"message","optionalParams"}, script="this.trace.apply(this, [message].concat(optionalParams));")
    void trace(Any message, @JSByRef Any... optionalParams);
    void trace(Any message);
    void trace(String message);
    void trace(int message);
    void trace(double message);
    void trace(boolean message);
    void trace();
    @JSBody(params = {"message","optionalParams"}, script="this.warn.apply(this, [message].concat(optionalParams));")
    void warn(Any message, @JSByRef Any... optionalParams);
    void warn(Any message);
    void warn(String message);
    void warn(int message);
    void warn(double message);
    void warn(boolean message);
    void warn();

    @JSBody(script = "return Console.prototype")
    static Console prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new Console()")
    static Console create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

}
