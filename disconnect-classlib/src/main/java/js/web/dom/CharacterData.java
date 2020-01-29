package js.web.dom;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/** The CharacterData abstract interface represents a Node object that contains characters. This is an abstract interface, meaning there aren't any object of type it is implemented by other interfaces CharacterData, like Text, Comment, or ProcessingInstruction which aren't abstract. */
public interface CharacterData extends Node, ChildNode, NonDocumentTypeChildNode {
    @JSProperty
    String getData();

    @JSProperty
    void setData(String data);

    @JSProperty
    int getLength();

    void appendData(String data);
    void deleteData(int offset, int count);
    void insertData(int offset, String data);
    void replaceData(int offset, int count, String data);
    String substringData(int offset, int count);

    @JSBody(script = "return CharacterData.prototype")
    static CharacterData prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new CharacterData()")
    static CharacterData create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

}
