package js.lang.external.vaadin.upload;

import js.web.dom.File;
import org.teavm.jso.JSProperty;

/**
 * Created by Artem Godin on 7/3/2020.
 */
public interface UploadFile extends File {
    @JSProperty
    String getUploadTarget();

    @JSProperty
    void setUploadTarget(String uploadTarget);

    @JSProperty
    int getElapsed();

    @JSProperty
    void setElapsed(int elapsed);

    @JSProperty
    String getElapsedStr();

    @JSProperty
    void setElapsedStr(String elapsedStr);

    @JSProperty
    int getRemaining();

    @JSProperty
    void setRemaining(int remaining);

    @JSProperty
    String getRemainingStr();

    @JSProperty
    void setRemainingStr(String remainingStr);

    @JSProperty
    double getProgress();

    @JSProperty
    void setProgress(double Progress);

    @JSProperty
    int getSpeed();

    @JSProperty
    void setSpeed(int speed);

    @JSProperty
    String getTotalStr();

    @JSProperty
    void setTotalStr(String totalStr);

    @JSProperty
    int getLoaded();

    @JSProperty
    void setLoaded(int loaded);

    @JSProperty
    String getLoadedStr();

    @JSProperty
    void setLoadedStr(String loadedStr);

    @JSProperty
    String getStatus();

    @JSProperty
    void setStatus(String status);

    @JSProperty
    String getError();

    @JSProperty
    void setError(String error);

    @JSProperty
    boolean getAbort();

    @JSProperty
    void setAbort(boolean abort);

    @JSProperty
    boolean getComplete();

    @JSProperty
    void setComplete(boolean complete);

    @JSProperty
    boolean getUploading();

    @JSProperty
    void setUploading(boolean uploading);
}
