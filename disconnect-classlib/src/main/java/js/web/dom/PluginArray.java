package js.web.dom;

import js.util.collections.ArrayLike;
import org.teavm.jso.JSBody;

import javax.annotation.Nullable;


/** Used to store a list of Plugin objects describing the available plugins; it's returned by the window.navigator.plugins property. The PluginArray is not a JavaScript array, but has the length property and supports accessing individual items using bracket notation (plugins[2]), as well as via item(index) and namedItem("name") methods. */
        @Deprecated
        public interface PluginArray extends ArrayLike<Plugin> {
        @Nullable
         Plugin item(int index);
        @Nullable
         Plugin namedItem(String name);
         void refresh(boolean reload);
         void refresh();

        @JSBody(script = "return PluginArray.prototype")
        static PluginArray prototype() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(script = "return new PluginArray()")
        static PluginArray create() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        }
