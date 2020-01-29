package js.web.dom;

import js.lang.Unknown;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * Lets web applications asynchronously read the contents of files (or raw data buffers) stored on the user's computer, using File or Blob objects to specify the file or data to read.
 */
public interface FileReader extends EventTarget {
    @JSBody(script = "return FileReader.prototype")
    static FileReader prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new FileReader()")
    static FileReader create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return FileReader.DONE")
    static int DONE() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return FileReader.EMPTY")
    static int EMPTY() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return FileReader.LOADING")
    static int LOADING() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    @Nullable
    DOMException getError();

    @JSProperty
    @Nullable
    EventListener<ProgressEvent<FileReader>> getOnabort();

    @JSProperty
    void setOnabort(EventListener<ProgressEvent<FileReader>> onabort);

    default void addAbortEventListener(EventListener<ProgressEvent<FileReader>> listener, AddEventListenerOptions options) {
        addEventListener("abort", listener, options);
    }

    default void addAbortEventListener(EventListener<ProgressEvent<FileReader>> listener, boolean options) {
        addEventListener("abort", listener, options);
    }

    default void addAbortEventListener(EventListener<ProgressEvent<FileReader>> listener) {
        addEventListener("abort", listener);
    }

    default void removeAbortEventListener(EventListener<ProgressEvent<FileReader>> listener, EventListenerOptions options) {
        removeEventListener("abort", listener, options);
    }

    default void removeAbortEventListener(EventListener<ProgressEvent<FileReader>> listener, boolean options) {
        removeEventListener("abort", listener, options);
    }

    default void removeAbortEventListener(EventListener<ProgressEvent<FileReader>> listener) {
        removeEventListener("abort", listener);
    }

    @JSProperty
    @Nullable
    EventListener<ProgressEvent<FileReader>> getOnerror();

    @JSProperty
    void setOnerror(EventListener<ProgressEvent<FileReader>> onerror);

    default void addErrorEventListener(EventListener<ProgressEvent<FileReader>> listener, AddEventListenerOptions options) {
        addEventListener("error", listener, options);
    }

    default void addErrorEventListener(EventListener<ProgressEvent<FileReader>> listener, boolean options) {
        addEventListener("error", listener, options);
    }

    default void addErrorEventListener(EventListener<ProgressEvent<FileReader>> listener) {
        addEventListener("error", listener);
    }

    default void removeErrorEventListener(EventListener<ProgressEvent<FileReader>> listener, EventListenerOptions options) {
        removeEventListener("error", listener, options);
    }

    default void removeErrorEventListener(EventListener<ProgressEvent<FileReader>> listener, boolean options) {
        removeEventListener("error", listener, options);
    }

    default void removeErrorEventListener(EventListener<ProgressEvent<FileReader>> listener) {
        removeEventListener("error", listener);
    }

    @JSProperty
    @Nullable
    EventListener<ProgressEvent<FileReader>> getOnload();

    @JSProperty
    void setOnload(EventListener<ProgressEvent<FileReader>> onload);

    default void addLoadEventListener(EventListener<ProgressEvent<FileReader>> listener, AddEventListenerOptions options) {
        addEventListener("load", listener, options);
    }

    default void addLoadEventListener(EventListener<ProgressEvent<FileReader>> listener, boolean options) {
        addEventListener("load", listener, options);
    }

    default void addLoadEventListener(EventListener<ProgressEvent<FileReader>> listener) {
        addEventListener("load", listener);
    }

    default void removeLoadEventListener(EventListener<ProgressEvent<FileReader>> listener, EventListenerOptions options) {
        removeEventListener("load", listener, options);
    }

    default void removeLoadEventListener(EventListener<ProgressEvent<FileReader>> listener, boolean options) {
        removeEventListener("load", listener, options);
    }

    default void removeLoadEventListener(EventListener<ProgressEvent<FileReader>> listener) {
        removeEventListener("load", listener);
    }

    @JSProperty
    @Nullable
    EventListener<ProgressEvent<FileReader>> getOnloadend();

    @JSProperty
    void setOnloadend(EventListener<ProgressEvent<FileReader>> onloadend);

    default void addLoadEndEventListener(EventListener<ProgressEvent<FileReader>> listener, AddEventListenerOptions options) {
        addEventListener("loadend", listener, options);
    }

    default void addLoadEndEventListener(EventListener<ProgressEvent<FileReader>> listener, boolean options) {
        addEventListener("loadend", listener, options);
    }

    default void addLoadEndEventListener(EventListener<ProgressEvent<FileReader>> listener) {
        addEventListener("loadend", listener);
    }

    default void removeLoadEndEventListener(EventListener<ProgressEvent<FileReader>> listener, EventListenerOptions options) {
        removeEventListener("loadend", listener, options);
    }

    default void removeLoadEndEventListener(EventListener<ProgressEvent<FileReader>> listener, boolean options) {
        removeEventListener("loadend", listener, options);
    }

    default void removeLoadEndEventListener(EventListener<ProgressEvent<FileReader>> listener) {
        removeEventListener("loadend", listener);
    }

    @JSProperty
    @Nullable
    EventListener<ProgressEvent<FileReader>> getOnloadstart();

    @JSProperty
    void setOnloadstart(EventListener<ProgressEvent<FileReader>> onloadstart);

    default void addLoadStartEventListener(EventListener<ProgressEvent<FileReader>> listener, AddEventListenerOptions options) {
        addEventListener("loadstart", listener, options);
    }

    default void addLoadStartEventListener(EventListener<ProgressEvent<FileReader>> listener, boolean options) {
        addEventListener("loadstart", listener, options);
    }

    default void addLoadStartEventListener(EventListener<ProgressEvent<FileReader>> listener) {
        addEventListener("loadstart", listener);
    }

    default void removeLoadStartEventListener(EventListener<ProgressEvent<FileReader>> listener, EventListenerOptions options) {
        removeEventListener("loadstart", listener, options);
    }

    default void removeLoadStartEventListener(EventListener<ProgressEvent<FileReader>> listener, boolean options) {
        removeEventListener("loadstart", listener, options);
    }

    default void removeLoadStartEventListener(EventListener<ProgressEvent<FileReader>> listener) {
        removeEventListener("loadstart", listener);
    }

    @JSProperty
    @Nullable
    EventListener<ProgressEvent<FileReader>> getOnprogress();

    @JSProperty
    void setOnprogress(EventListener<ProgressEvent<FileReader>> onprogress);

    default void addProgressEventListener(EventListener<ProgressEvent<FileReader>> listener, AddEventListenerOptions options) {
        addEventListener("progress", listener, options);
    }

    default void addProgressEventListener(EventListener<ProgressEvent<FileReader>> listener, boolean options) {
        addEventListener("progress", listener, options);
    }

    default void addProgressEventListener(EventListener<ProgressEvent<FileReader>> listener) {
        addEventListener("progress", listener);
    }

    default void removeProgressEventListener(EventListener<ProgressEvent<FileReader>> listener, EventListenerOptions options) {
        removeEventListener("progress", listener, options);
    }

    default void removeProgressEventListener(EventListener<ProgressEvent<FileReader>> listener, boolean options) {
        removeEventListener("progress", listener, options);
    }

    default void removeProgressEventListener(EventListener<ProgressEvent<FileReader>> listener) {
        removeEventListener("progress", listener);
    }

    @JSProperty
    int getReadyState();

    @JSProperty
    @Nullable
    Unknown getResult();

    void abort();

    void readAsArrayBuffer(Blob blob);

    void readAsBinaryString(Blob blob);

    void readAsDataURL(Blob blob);

    void readAsText(Blob blob, String encoding);

    void readAsText(Blob blob);
}
