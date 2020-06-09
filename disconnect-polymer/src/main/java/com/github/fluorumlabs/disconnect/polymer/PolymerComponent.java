package com.github.fluorumlabs.disconnect.polymer;

import com.github.fluorumlabs.disconnect.core.components.Component;
import js.lang.external.polymer.PolymerElement;

/**
 * Created by Artem Godin on 6/8/2020.
 */
public abstract class PolymerComponent<X extends PolymerElement> extends Component<X> {
    protected PolymerComponent() {
    }

}
