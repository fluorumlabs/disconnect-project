package js.lang.external.lit_html.directives;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import js.lang.Promise;
import js.lang.Unknown;
import js.lang.external.lit_html.Part;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSFunctor;

import javax.annotation.Nullable;

@NpmPackage(
    name = "lit-html",
    version = "^1.2.1"
)
@Import(
    symbols = {"asyncAppend as AsyncAppend_asyncAppend"},
    module = "lit-html/directives/async-append.js"
)
@Import(
    module = "lit-html/directives/async-append.js"
)
public interface AsyncAppend extends Any {
  /**
   * A directive that renders the items of an async iterable<a href="https://github.com/tc39/proposal-async-iteration">1</a>, appending new
   * values after previous values, similar to the built-in support for iterables.
   *
   * Async iterables are objects with a [Symbol.asyncIterator] method, which
   * returns an iterator who's <code>next()</code> method returns a Promise. When a new
   * value is available, the Promise resolves and the value is appended to the
   * Part controlled by the directive. If another value other than this
   * directive has been set on the Part, the iterable will no longer be listened
   * to and new values won't be written to the Part.
   *
   * @param value An async iterable
   * @param mapper An optional function that maps from (value, index) to another
   * value. Useful for generating templates for each item in the iterable.
   *
   */
  @JSBody(
      params = {"value", "mapper"},
      script = "return AsyncAppend_asyncAppend(value, mapper)"
  )
  static <T extends Any> AsyncAppendResultFunction asyncAppend(Unknown /* AsyncIterable<T> */ value,
      @Nullable AsyncAppendMapperFunction<T> mapper) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * A directive that renders the items of an async iterable<a href="https://github.com/tc39/proposal-async-iteration">1</a>, appending new
   * values after previous values, similar to the built-in support for iterables.
   *
   * Async iterables are objects with a [Symbol.asyncIterator] method, which
   * returns an iterator who's <code>next()</code> method returns a Promise. When a new
   * value is available, the Promise resolves and the value is appended to the
   * Part controlled by the directive. If another value other than this
   * directive has been set on the Part, the iterable will no longer be listened
   * to and new values won't be written to the Part.
   *
   * @param value An async iterable
   */
  @JSBody(
      params = {"value"},
      script = "return AsyncAppend_asyncAppend(value)"
  )
  static <T extends Any> AsyncAppendResultFunction asyncAppend(Unknown /* AsyncIterable<T> */ value) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  @FunctionalInterface
  @JSFunctor
  interface AsyncAppendResultFunction extends Any {
    Promise<Unknown /* void */> apply(Part part);
  }

  @FunctionalInterface
  @JSFunctor
  interface AsyncAppendMapperFunction<T extends Any> extends Any {
    Unknown /* unknown */ apply(T v, double index);
  }
}