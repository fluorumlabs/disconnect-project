package js.lang.external.polymer;

import js.lang.Any;
import js.util.collections.Array;
import org.teavm.jso.JSProperty;

/**
 * Created by Artem Godin on 7/2/2020.
 */
public interface PolymerSplice<T extends Any> extends Any {
    /**
     * Position where the splice started.
     */
    @JSProperty("index")
    int getIndex();

    /**
     * Position where the splice started.
     */
    @JSProperty("index")
    void setIndex(int value);

    /**
     * Array of removed items.
     */
    @JSProperty("removed")
    Array<T> getRemoved();

    /**
     * Array of removed items.
     */
    @JSProperty("removed")
    void setRemoved(Array<T> value);

    /**
     * Number of new items inserted at index.
     */
    @JSProperty("addedCount")
    int getAddedCount();

    /**
     * Number of new items inserted at index.
     */
    @JSProperty("addedCount")
    void setAddedCount(int value);

    /**
     * A reference to the array in question.
     */
    @JSProperty("object")
    Array<T> getObject();

    /**
     * A reference to the array in question.
     */
    @JSProperty("object")
    void setObject(Array<T> value);

    class Builder<T extends Any> {
        private final PolymerSplice<T> object = Any.empty();

        public PolymerSplice<T> build() {
            return object;
        }

        /**
         * Position where the splice started.
         */
        public Builder<T> index(int value) {
            object.setIndex(value);
            return this;
        }

        /**
         * Array of removed items.
         */
        public Builder<T> removed(Array<T> value) {
            object.setRemoved(value);
            return this;
        }

        /**
         * Number of new items inserted at index.
         */
        public Builder<T> addedCount(int value) {
            object.setAddedCount(value);
            return this;
        }

        /**
         * A reference to the array in question.
         */
        public Builder<T> object(Array<T> value) {
            object.setObject(value);
            return this;
        }
    }
}
