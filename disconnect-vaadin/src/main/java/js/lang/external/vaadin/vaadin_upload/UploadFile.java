package js.lang.external.vaadin.vaadin_upload;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import js.lang.Any;
import js.web.dom.File;
import org.teavm.jso.JSProperty;

@NpmPackage(
    name = "@vaadin/vaadin-upload",
    version = "^4.4.0-alpha1"
)
@Import(
    module = "@vaadin/vaadin-upload/vaadin-upload.js"
)
public interface UploadFile extends File {
  @JSProperty("uploadTarget")
  String getUploadTarget();

  @JSProperty("uploadTarget")
  void setUploadTarget(String value);

  @JSProperty("elapsed")
  double getElapsed();

  @JSProperty("elapsed")
  void setElapsed(double value);

  @JSProperty("elapsedStr")
  String getElapsedStr();

  @JSProperty("elapsedStr")
  void setElapsedStr(String value);

  @JSProperty("remaining")
  double getRemaining();

  @JSProperty("remaining")
  void setRemaining(double value);

  @JSProperty("remainingStr")
  String getRemainingStr();

  @JSProperty("remainingStr")
  void setRemainingStr(String value);

  @JSProperty("progress")
  double getProgress();

  @JSProperty("progress")
  void setProgress(double value);

  @JSProperty("speed")
  double getSpeed();

  @JSProperty("speed")
  void setSpeed(double value);

  @JSProperty("totalStr")
  String getTotalStr();

  @JSProperty("totalStr")
  void setTotalStr(String value);

  @JSProperty("loaded")
  double getLoaded();

  @JSProperty("loaded")
  void setLoaded(double value);

  @JSProperty("loadedStr")
  String getLoadedStr();

  @JSProperty("loadedStr")
  void setLoadedStr(String value);

  @JSProperty("status")
  String getStatus();

  @JSProperty("status")
  void setStatus(String value);

  @JSProperty("error")
  String getError();

  @JSProperty("error")
  void setError(String value);

  @JSProperty("abort")
  boolean getAbort();

  @JSProperty("abort")
  void setAbort(boolean value);

  @JSProperty("complete")
  boolean getComplete();

  @JSProperty("complete")
  void setComplete(boolean value);

  @JSProperty("uploading")
  boolean getUploading();

  @JSProperty("uploading")
  void setUploading(boolean value);

  class Builder {
    private final UploadFile object = Any.empty();

    public UploadFile build() {
      return object;
    }

    public Builder uploadTarget(String value) {
      object.setUploadTarget(value);
      return this;
    }

    public Builder elapsed(double value) {
      object.setElapsed(value);
      return this;
    }

    public Builder elapsedStr(String value) {
      object.setElapsedStr(value);
      return this;
    }

    public Builder remaining(double value) {
      object.setRemaining(value);
      return this;
    }

    public Builder remainingStr(String value) {
      object.setRemainingStr(value);
      return this;
    }

    public Builder progress(double value) {
      object.setProgress(value);
      return this;
    }

    public Builder speed(double value) {
      object.setSpeed(value);
      return this;
    }

    public Builder totalStr(String value) {
      object.setTotalStr(value);
      return this;
    }

    public Builder loaded(double value) {
      object.setLoaded(value);
      return this;
    }

    public Builder loadedStr(String value) {
      object.setLoadedStr(value);
      return this;
    }

    public Builder status(String value) {
      object.setStatus(value);
      return this;
    }

    public Builder error(String value) {
      object.setError(value);
      return this;
    }

    public Builder abort(boolean value) {
      object.setAbort(value);
      return this;
    }

    public Builder complete(boolean value) {
      object.setComplete(value);
      return this;
    }

    public Builder uploading(boolean value) {
      object.setUploading(value);
      return this;
    }
  }
}
