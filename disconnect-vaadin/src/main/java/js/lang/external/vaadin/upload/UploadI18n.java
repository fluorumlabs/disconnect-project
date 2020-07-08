package js.lang.external.vaadin.upload;

import js.lang.Any;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSFunctor;
import org.teavm.jso.JSObject;

/**
 * Created by Artem Godin on 7/3/2020.
 */
public interface UploadI18n extends Any {
    @JSBody(params = "value", script = "this.cancel = value; return this;")
    UploadI18n cancel(String value);

    @JSBody(params = "value", script = "this.formatSize = value; return this;")
    UploadI18n formatSize(SizeFormatter value);

    @JSBody(params = "value", script = "this.formatTime = value; return this;")
    UploadI18n formatTime(TimeFormatter value);

    @JSBody(script = "this.dropFiles = this.dropFiles || {}; return this.dropFiles;")
    Plurality dropFiles();

    @JSBody(script = "this.addFiles = this.addFiles || {}; return this.addFiles;")
    Plurality addFiles();

    @JSBody(script = "this.error = this.error || {}; return this.error;")
    Error error();

    @JSBody(script = "this.uploading = this.uploading || {}; return this.uploading;")
    Uploading uploading();

    @JSBody(script = "this.units = this.units || {}; return this.units;")
    Units units();

    interface Plurality extends Any {
        @JSBody(params = "value", script = "this.one = value; return this;")
        Plurality one(String value);

        @JSBody(params = "value", script = "this.many = value; return this;")
        Plurality many(String value);
    }

    interface Error extends Any {
        @JSBody(params = "value", script = "this.tooManyFiles = value; return this;")
        Error tooManyFiles(String value);

        @JSBody(params = "value", script = "this.fileIsTooBig = value; return this;")
        Error fileIsTooBig(String value);

        @JSBody(params = "value", script = "this.incorrectFileType = value; return this;")
        Error incorrectFileType(String value);
    }

    interface Units extends Any {
        @JSBody(params = "value", script = "this.size = value; return this;")
        Units size(String... value);

        @JSBody(params = "value", script = "this.sizeBase = value; return this;")
        Units sizeBase(int value);
    }

    interface Uploading extends Any {
        @JSBody(script = "this.status = this.status || {}; return this.status")
        UploadI18n.UploadingStatus status();

        @JSBody(script = "this.remainingTime = this.remainingTime || {}; return this.remainingTime")
        UploadI18n.UploadingRemainingTime remainingTime();

        @JSBody(script = "this.error = this.error || {}; return this.error")
        UploadI18n.UploadingError error();
    }

    interface UploadingStatus extends Any {
        @JSBody(params = "value", script = "this.connecting = value; return this;")
        UploadingStatus connecting(String value);

        @JSBody(params = "value", script = "this.stalled = value; return this;")
        UploadingStatus stalled(String value);

        @JSBody(params = "value", script = "this.processing = value; return this;")
        UploadingStatus processing(String value);

        @JSBody(params = "value", script = "this.held = value; return this;")
        UploadingStatus held(String value);
    }

    interface UploadingRemainingTime extends Any {
        @JSBody(params = "value", script = "this.prefix = value; return this;")
        UploadingRemainingTime prefix(String value);

        @JSBody(params = "value", script = "this.unknown = value; return this;")
        UploadingRemainingTime unknown(String value);
    }

    interface UploadingError extends Any {
        @JSBody(params = "value", script = "this.serverUnavailable = value; return this;")
        UploadingError serverUnavailable(String value);

        @JSBody(params = "value", script = "this.unexpectedServerError = value; return this;")
        UploadingError unexpectedServerError(String value);

        @JSBody(params = "value", script = "this.forbidden = value; return this;")
        UploadingError forbidden(String value);
    }

    @JSFunctor
    @FunctionalInterface
    interface SizeFormatter extends JSObject {
        String format(int bytes);
    }

    @JSFunctor
    @FunctionalInterface
    interface TimeFormatter extends JSObject {
        String format(int seconds, int[] units);
    }
}
