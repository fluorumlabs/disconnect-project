package js.web.dom;

import js.extras.JsEnum;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/**
 * Provides event properties that are specific to modifications to the Document Object Model (DOM) hierarchy and nodes.
 */
public interface MutationEvent extends Event {
    @JSBody(script = "return MutationEvent.prototype")
    static MutationEvent prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new MutationEvent()")
    static MutationEvent create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    AttrChange getAttrChange();

    @JSProperty
    String getAttrName();

    @JSProperty
    String getNewValue();

    @JSProperty
    String getPrevValue();

    @JSProperty
    Node getRelatedNode();

    void initMutationEvent(String typeArg, boolean canBubbleArg, boolean cancelableArg, Node relatedNodeArg, String prevValueArg, String newValueArg, String attrNameArg, int attrChangeArg);

    abstract class AttrChange extends JsEnum {
        public static final AttrChange ADDITION = JsEnum.from("return MutationEvent.ADDITION");

        public static final AttrChange MODIFICATION = JsEnum.from("return MutationEvent.MODIFICATION");

        public static final AttrChange REMOVAL = JsEnum.from("return MutationEvent.REMOVAL");
    }

}
