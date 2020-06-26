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
    symbols = {"asyncReplace as AsyncReplace_asyncReplace"},
    module = "lit-html/directives/async-replace.js"
)
@Import(
    module = "lit-html/directives/async-replace.js"
)
public interface AsyncReplace extends Any {
  /**
   * A directive that renders the items of an async iterable<a href="https://github.com/tc39/proposal-async-iteration">1</a>, replacing
   * previous values with new values, so that only one value is ever rendered
   * at a time.
   *
   * Async iterables are objects with a [Symbol.asyncIterator] method, which
   * returns an iterator who's <code>next()</code> method returns a Promise. When a new
   * value is available, the Promise resolves and the value is rendered to the
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
      script = "return AsyncReplace_asyncReplace(value, mapper)"
  )
  static <T extends Any> AsyncReplaceResultFunction asyncReplace(Unknown /* AsyncIterable<T> */ value,
      @Nullable AsyncReplaceMapperFunction<T> mapper) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * A directive that renders the items of an async iterable<a href="https://github.com/tc39/proposal-async-iteration">1</a>, replacing
   * previous values with new values, so that only one value is ever rendered
   * at a time.
   *
   * Async iterables are objects with a [Symbol.asyncIterator] method, which
   * returns an iterator who's <code>next()</code> method returns a Promise. When a new
   * value is available, the Promise resolves and the value is rendered to the
   * Part controlled by the directive. If another value other than this
   * directive has been set on the Part, the iterable will no longer be listened
   * to and new values won't be written to the Part.
   *
   * @param value An async iterable
   */
  @JSBody(
      params = {"value"},
      script = "return AsyncReplace_asyncReplace(value)"
  )
  static <T extends Any> AsyncReplaceResultFunction asyncReplace(Unknown /* AsyncIterable<T> */ value) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  @FunctionalInterface
  @JSFunctor
  interface AsyncReplaceResultFunction extends Any {
    Promise<Unknown /* void */> apply(Part part);
  }

  @FunctionalInterface
  @JSFunctor
  interface AsyncReplaceMapperFunction<T extends Any> extends Any {
    Unknown /* unknown */ apply(T v, double index);
  }
}
