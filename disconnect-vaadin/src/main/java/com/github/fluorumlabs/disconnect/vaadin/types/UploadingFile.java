package com.github.fluorumlabs.disconnect.vaadin.types;

import js.web.dom.File;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * - `uploadTarget`: The target URL used to upload this file.
 * - `elapsed`: Elapsed time since the upload started.
 * - `elapsedStr`: Human-readable elapsed time.
 * - `remaining`: Number of seconds remaining for the upload to finish.
 * - `remainingStr`: Human-readable remaining time for the upload to finish.
 * - `progress`: Percentage of the file already uploaded.
 * - `speed`: Upload speed in kB/s.
 * - `size`: File size in bytes.
 * - `totalStr`: Human-readable total size of the file.
 * - `loaded`: Bytes transferred so far.
 * - `loadedStr`: Human-readable uploaded size at the moment.
 * - `status`: Status of the upload process.
 * - `error`: Error message in case the upload failed.
 * - `abort`: True if the file was canceled by the user.
 * - `complete`: True when the file was transferred to the server.
 * - `uploading`: True while transferring data to the server.
 */
public interface UploadingFile extends File {
    @JSProperty
    String getUploadTarget();

    @JSProperty
    void setUploadTarget(String uploadTarget);

    @JSProperty
    double getElapsed();

    @JSProperty
    void setElapsed(double elapsed);

    @JSProperty
    String getElapsedStr();

    @JSProperty
    void setElapsedStr(String elapsedStr);

    @JSProperty
    double getRemaining();

    @JSProperty
    void setRemaining(double remaining);

    @JSProperty
    String getRemainingStr();

    @JSProperty
    void setRemainingStr(String remainingStr);

    @JSProperty
    double getProgress();

    @JSProperty
    void setProgress(double progress);

    @JSProperty
    double getSpeed();

    @JSProperty
    void setSpeed(double speed);

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

    @Nullable
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
