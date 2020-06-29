package js.lang.external.vaadin.vaadin_upload;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import org.teavm.jso.JSFunctor;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

@NpmPackage(
    name = "@vaadin/vaadin-upload",
    version = "^4.4.0-alpha1"
)
@Import(
    module = "@vaadin/vaadin-upload/vaadin-upload.js"
)
public interface UploadI18n extends Any {
  @JSProperty("dropFiles")
  DropFiles getDropFiles();

  @JSProperty("dropFiles")
  void setDropFiles(DropFiles value);

  @JSProperty("addFiles")
  AddFiles getAddFiles();

  @JSProperty("addFiles")
  void setAddFiles(AddFiles value);

  @JSProperty("cancel")
  String getCancel();

  @JSProperty("cancel")
  void setCancel(String value);

  @JSProperty("error")
  Error getError();

  @JSProperty("error")
  void setError(Error value);

  @JSProperty("uploading")
  Uploading getUploading();

  @JSProperty("uploading")
  void setUploading(Uploading value);

  @JSProperty("units")
  Units getUnits();

  @JSProperty("units")
  void setUnits(Units value);

  String formatSize(double bytes);

  @JSProperty("formatSize")
  @Nullable
  FormatSizeFunction getFormatSize();

  @JSProperty("formatSize")
  void setFormatSize(@Nullable FormatSizeFunction value);

  String formatTime(double seconds, double[] units);

  @JSProperty("formatTime")
  @Nullable
  FormatTimeFunction getFormatTime();

  @JSProperty("formatTime")
  void setFormatTime(@Nullable FormatTimeFunction value);

  static Builder builder() {
    return new Builder();
  }

  interface DropFiles extends Any {
    @JSProperty("one")
    String getOne();

    @JSProperty("one")
    void setOne(String value);

    @JSProperty("many")
    String getMany();

    @JSProperty("many")
    void setMany(String value);

    static DropFiles.Builder builder() {
      return new DropFiles.Builder();
    }

    final class Builder {
      private final DropFiles object = Any.empty();

      private Builder() {
      }

      public DropFiles build() {
        return object;
      }

      public DropFiles.Builder one(String value) {
        object.setOne(value);
        return this;
      }

      public DropFiles.Builder many(String value) {
        object.setMany(value);
        return this;
      }
    }
  }

  interface AddFiles extends Any {
    @JSProperty("one")
    String getOne();

    @JSProperty("one")
    void setOne(String value);

    @JSProperty("many")
    String getMany();

    @JSProperty("many")
    void setMany(String value);

    static AddFiles.Builder builder() {
      return new AddFiles.Builder();
    }

    final class Builder {
      private final AddFiles object = Any.empty();

      private Builder() {
      }

      public AddFiles build() {
        return object;
      }

      public AddFiles.Builder one(String value) {
        object.setOne(value);
        return this;
      }

      public AddFiles.Builder many(String value) {
        object.setMany(value);
        return this;
      }
    }
  }

  interface Error extends Any {
    @JSProperty("tooManyFiles")
    String getTooManyFiles();

    @JSProperty("tooManyFiles")
    void setTooManyFiles(String value);

    @JSProperty("fileIsTooBig")
    String getFileIsTooBig();

    @JSProperty("fileIsTooBig")
    void setFileIsTooBig(String value);

    @JSProperty("incorrectFileType")
    String getIncorrectFileType();

    @JSProperty("incorrectFileType")
    void setIncorrectFileType(String value);

    static Error.Builder builder() {
      return new Error.Builder();
    }

    final class Builder {
      private final Error object = Any.empty();

      private Builder() {
      }

      public Error build() {
        return object;
      }

      public Error.Builder tooManyFiles(String value) {
        object.setTooManyFiles(value);
        return this;
      }

      public Error.Builder fileIsTooBig(String value) {
        object.setFileIsTooBig(value);
        return this;
      }

      public Error.Builder incorrectFileType(String value) {
        object.setIncorrectFileType(value);
        return this;
      }
    }
  }

  interface Uploading extends Any {
    @JSProperty("status")
    Status getStatus();

    @JSProperty("status")
    void setStatus(Status value);

    @JSProperty("remainingTime")
    RemainingTime getRemainingTime();

    @JSProperty("remainingTime")
    void setRemainingTime(RemainingTime value);

    @JSProperty("error")
    Error getError();

    @JSProperty("error")
    void setError(Error value);

    static Uploading.Builder builder() {
      return new Uploading.Builder();
    }

    interface Status extends Any {
      @JSProperty("connecting")
      String getConnecting();

      @JSProperty("connecting")
      void setConnecting(String value);

      @JSProperty("stalled")
      String getStalled();

      @JSProperty("stalled")
      void setStalled(String value);

      @JSProperty("processing")
      String getProcessing();

      @JSProperty("processing")
      void setProcessing(String value);

      @JSProperty("held")
      String getHeld();

      @JSProperty("held")
      void setHeld(String value);

      static Status.Builder builder() {
        return new Status.Builder();
      }

      final class Builder {
        private final Status object = Any.empty();

        private Builder() {
        }

        public Status build() {
          return object;
        }

        public Status.Builder connecting(String value) {
          object.setConnecting(value);
          return this;
        }

        public Status.Builder stalled(String value) {
          object.setStalled(value);
          return this;
        }

        public Status.Builder processing(String value) {
          object.setProcessing(value);
          return this;
        }

        public Status.Builder held(String value) {
          object.setHeld(value);
          return this;
        }
      }
    }

    interface RemainingTime extends Any {
      @JSProperty("prefix")
      String getPrefix();

      @JSProperty("prefix")
      void setPrefix(String value);

      @JSProperty("unknown")
      String getUnknown();

      @JSProperty("unknown")
      void setUnknown(String value);

      static RemainingTime.Builder builder() {
        return new RemainingTime.Builder();
      }

      final class Builder {
        private final RemainingTime object = Any.empty();

        private Builder() {
        }

        public RemainingTime build() {
          return object;
        }

        public RemainingTime.Builder prefix(String value) {
          object.setPrefix(value);
          return this;
        }

        public RemainingTime.Builder unknown(String value) {
          object.setUnknown(value);
          return this;
        }
      }
    }

    interface Error extends Any {
      @JSProperty("serverUnavailable")
      String getServerUnavailable();

      @JSProperty("serverUnavailable")
      void setServerUnavailable(String value);

      @JSProperty("unexpectedServerError")
      String getUnexpectedServerError();

      @JSProperty("unexpectedServerError")
      void setUnexpectedServerError(String value);

      @JSProperty("forbidden")
      String getForbidden();

      @JSProperty("forbidden")
      void setForbidden(String value);

      static Error.Builder builder() {
        return new Error.Builder();
      }

      final class Builder {
        private final Error object = Any.empty();

        private Builder() {
        }

        public Error build() {
          return object;
        }

        public Error.Builder serverUnavailable(String value) {
          object.setServerUnavailable(value);
          return this;
        }

        public Error.Builder unexpectedServerError(String value) {
          object.setUnexpectedServerError(value);
          return this;
        }

        public Error.Builder forbidden(String value) {
          object.setForbidden(value);
          return this;
        }
      }
    }

    final class Builder {
      private final Uploading object = Any.empty();

      private Builder() {
      }

      public Uploading build() {
        return object;
      }

      public Uploading.Builder status(Status value) {
        object.setStatus(value);
        return this;
      }

      public Uploading.Builder remainingTime(RemainingTime value) {
        object.setRemainingTime(value);
        return this;
      }

      public Uploading.Builder error(Error value) {
        object.setError(value);
        return this;
      }
    }
  }

  interface Units extends Any {
    @JSProperty("size")
    String[] getSize();

    @JSProperty("size")
    void setSize(String... value);

    @JSProperty("sizeBase")
    double getSizeBase();

    @JSProperty("sizeBase")
    void setSizeBase(double value);

    static Units.Builder builder() {
      return new Units.Builder();
    }

    final class Builder {
      private final Units object = Any.empty();

      private Builder() {
      }

      public Units build() {
        return object;
      }

      public Units.Builder size(String... value) {
        object.setSize(value);
        return this;
      }

      public Units.Builder sizeBase(double value) {
        object.setSizeBase(value);
        return this;
      }
    }
  }

  @FunctionalInterface
  @JSFunctor
  interface FormatSizeFunction extends Any {
    String apply(double bytes);
  }

  @FunctionalInterface
  @JSFunctor
  interface FormatTimeFunction extends Any {
    String apply(double seconds, double[] units);
  }

  final class Builder {
    private final UploadI18n object = Any.empty();

    private Builder() {
    }

    public UploadI18n build() {
      return object;
    }

    public Builder dropFiles(DropFiles value) {
      object.setDropFiles(value);
      return this;
    }

    public Builder addFiles(AddFiles value) {
      object.setAddFiles(value);
      return this;
    }

    public Builder cancel(String value) {
      object.setCancel(value);
      return this;
    }

    public Builder error(Error value) {
      object.setError(value);
      return this;
    }

    public Builder uploading(Uploading value) {
      object.setUploading(value);
      return this;
    }

    public Builder units(Units value) {
      object.setUnits(value);
      return this;
    }

    public Builder formatSize(@Nullable FormatSizeFunction value) {
      object.setFormatSize(value);
      return this;
    }

    public Builder formatTime(@Nullable FormatTimeFunction value) {
      object.setFormatTime(value);
      return this;
    }
  }
}
