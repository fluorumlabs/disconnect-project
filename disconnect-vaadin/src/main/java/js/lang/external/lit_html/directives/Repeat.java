package js.lang.external.lit_html.directives;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.UnsupportedOperationException;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.external.lit_html.DirectiveFn;
import org.teavm.jso.JSBody;

@NpmPackage(
    name = "lit-html",
    version = "^1.2.1"
)
@Import(
    symbols = {"repeat as Repeat_repeat"},
    module = "lit-html/directives/repeat.js"
)
@Import(
    module = "lit-html/directives/repeat.js"
)
public interface Repeat extends Any {
  /**
   * A directive that repeats a series of values (usually <code>TemplateResults</code>)
   * generated from an iterable, and updates those items efficiently when the
   * iterable changes based on user-provided <code>keys</code> associated with each item.
   *
   * Note that if a <code>keyFn</code> is provided, strict key-to-DOM mapping is maintained,
   * meaning previous DOM for a given key is moved into the new position if
   * needed, and DOM will never be reused with values for different keys (new DOM
   * will always be created for new keys). This is generally the most efficient
   * way to use <code>repeat</code> since it performs minimum unnecessary work for insertions
   * and removals.
   *
   * IMPORTANT: If providing a <code>keyFn</code>, keys <em>must</em> be unique for all items in a
   * given call to <code>repeat</code>. The behavior when two or more items have the same key
   * is undefined.
   *
   * If no <code>keyFn</code> is provided, this directive will perform similar to mapping
   * items to values, and DOM will be reused against potentially different items.
   *
   */
  @JSBody(
      params = {"items", "keyFnOrTemplate", "template"},
      script = "return Repeat_repeat(items, keyFnOrTemplate, template)"
  )
  static <T extends Any> DirectiveFn repeat(Iterable<T> items, ItemTemplate<T> keyFnOrTemplate,
      @Nullable ItemTemplate<T> template) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * A directive that repeats a series of values (usually <code>TemplateResults</code>)
   * generated from an iterable, and updates those items efficiently when the
   * iterable changes based on user-provided <code>keys</code> associated with each item.
   *
   * Note that if a <code>keyFn</code> is provided, strict key-to-DOM mapping is maintained,
   * meaning previous DOM for a given key is moved into the new position if
   * needed, and DOM will never be reused with values for different keys (new DOM
   * will always be created for new keys). This is generally the most efficient
   * way to use <code>repeat</code> since it performs minimum unnecessary work for insertions
   * and removals.
   *
   * IMPORTANT: If providing a <code>keyFn</code>, keys <em>must</em> be unique for all items in a
   * given call to <code>repeat</code>. The behavior when two or more items have the same key
   * is undefined.
   *
   * If no <code>keyFn</code> is provided, this directive will perform similar to mapping
   * items to values, and DOM will be reused against potentially different items.
   *
   */
  @JSBody(
      params = {"items", "keyFnOrTemplate", "template"},
      script = "return Repeat_repeat(items, keyFnOrTemplate, template)"
  )
  static <T extends Any> DirectiveFn repeat(Iterable<T> items, KeyFn<T> keyFnOrTemplate,
      @Nullable ItemTemplate<T> template) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * A directive that repeats a series of values (usually <code>TemplateResults</code>)
   * generated from an iterable, and updates those items efficiently when the
   * iterable changes based on user-provided <code>keys</code> associated with each item.
   *
   * Note that if a <code>keyFn</code> is provided, strict key-to-DOM mapping is maintained,
   * meaning previous DOM for a given key is moved into the new position if
   * needed, and DOM will never be reused with values for different keys (new DOM
   * will always be created for new keys). This is generally the most efficient
   * way to use <code>repeat</code> since it performs minimum unnecessary work for insertions
   * and removals.
   *
   * IMPORTANT: If providing a <code>keyFn</code>, keys <em>must</em> be unique for all items in a
   * given call to <code>repeat</code>. The behavior when two or more items have the same key
   * is undefined.
   *
   * If no <code>keyFn</code> is provided, this directive will perform similar to mapping
   * items to values, and DOM will be reused against potentially different items.
   *
   */
  @JSBody(
      params = {"items", "keyFnOrTemplate"},
      script = "return Repeat_repeat(items, keyFnOrTemplate)"
  )
  static <T extends Any> DirectiveFn repeat(Iterable<T> items, ItemTemplate<T> keyFnOrTemplate) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }

  /**
   * A directive that repeats a series of values (usually <code>TemplateResults</code>)
   * generated from an iterable, and updates those items efficiently when the
   * iterable changes based on user-provided <code>keys</code> associated with each item.
   *
   * Note that if a <code>keyFn</code> is provided, strict key-to-DOM mapping is maintained,
   * meaning previous DOM for a given key is moved into the new position if
   * needed, and DOM will never be reused with values for different keys (new DOM
   * will always be created for new keys). This is generally the most efficient
   * way to use <code>repeat</code> since it performs minimum unnecessary work for insertions
   * and removals.
   *
   * IMPORTANT: If providing a <code>keyFn</code>, keys <em>must</em> be unique for all items in a
   * given call to <code>repeat</code>. The behavior when two or more items have the same key
   * is undefined.
   *
   * If no <code>keyFn</code> is provided, this directive will perform similar to mapping
   * items to values, and DOM will be reused against potentially different items.
   *
   */
  @JSBody(
      params = {"items", "keyFnOrTemplate"},
      script = "return Repeat_repeat(items, keyFnOrTemplate)"
  )
  static <T extends Any> DirectiveFn repeat(Iterable<T> items, KeyFn<T> keyFnOrTemplate) {
    throw new UnsupportedOperationException("Available only in JavaScript");
  }
}
