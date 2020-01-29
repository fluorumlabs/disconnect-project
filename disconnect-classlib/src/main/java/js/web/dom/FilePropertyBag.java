package js.web.dom;


import org.teavm.jso.JSProperty;


public interface FilePropertyBag extends BlobPropertyBag {
    @JSProperty
    double getLastModified();

    @JSProperty
    void setLastModified(double lastModified);

}
