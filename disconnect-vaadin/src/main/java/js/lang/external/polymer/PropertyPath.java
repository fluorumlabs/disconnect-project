package js.lang.external.polymer;

import js.lang.Unknown;
import js.util.collections.Array;

/**
 * Created by Artem Godin on 7/2/2020.
 */
public interface PropertyPath extends Array<Unknown> {
    static Builder builder() {
        return new Builder();
    }

    class Builder {
        private final PropertyPath path = Array.create().cast();

        private Builder() {}

        public Builder get(String property) {
            path.push(Unknown.of(property));
            return this;
        }

        public Builder get(int index) {
            path.push(Unknown.of(index));
            return this;
        }

        public PropertyPath build() {
            return path;
        }
    }
}
