package com.github.fluorumlabs.disconnect.vaadin.i18n;

import js.lang.Any;
import org.teavm.jso.JSByRef;
import org.teavm.jso.JSFunctor;
import org.teavm.jso.JSProperty;

/**
 * Created by Artem Godin on 2/4/2020.
 */
public interface UploadI18n extends Any {
	@JSProperty
	OneOrMany getDropFiles();

	@JSProperty
	void setDropFiles(OneOrMany dropFiles);

	@JSProperty
	OneOrMany getAddFiles();

	@JSProperty
	void setAddFiles(OneOrMany addFiles);

	@JSProperty
	String getCancel();

	@JSProperty
	void setCancel(String cancel);

	@JSProperty
	Error getError();

	@JSProperty
	void setError(Error error);

	@JSProperty
	Uploading getUploading();

	@JSProperty
	void setUploading(Uploading uploading);

	@JSProperty
	Units getUnits();

	@JSProperty
	void setUnits(Units units);

	@JSProperty
	SizeFormatter getFormatSize();

	@JSProperty
	void setFormatSize(SizeFormatter formatSize);

	@JSProperty
	TimeFormatter getFormatTime();

	@JSProperty
	void setFormatTime(TimeFormatter formatTime);

	interface OneOrMany extends Any {
		@JSProperty
		String getOne();

		@JSProperty
		void setOne(String one);

		@JSProperty
		String getMany();

		@JSProperty
		void setMany(String many);
	}

	interface Error extends Any {
		@JSProperty
		String getTooManyFiles();

		@JSProperty
		void setTooManyFiles(String tooManyFiles);

		@JSProperty
		String getFileIsTooBig();

		@JSProperty
		void setFileIsTooBig(String fileIsTooBig);

		@JSProperty
		String getIncorrectFileType();

		@JSProperty
		void setIncorrectFileType(String incorrectFileType);
	}

	interface Uploading extends Any {
		@JSProperty
		UploadingStatus getStatus();

		@JSProperty
		void setStatus(UploadingStatus status);

		@JSProperty
		UploadingRemainingTime getRemainingTime();

		@JSProperty
		void setRemainingTime(UploadingRemainingTime remainingTime);

		@JSProperty
		UploadingError getError();

		@JSProperty
		void setError(UploadingError error);
	}

	interface UploadingStatus extends Any {
		@JSProperty
		String getConnecting();

		@JSProperty
		void setConnecting(String connecting);

		@JSProperty
		String getStalled();

		@JSProperty
		void setStalled(String stalled);

		@JSProperty
		String getProcessing();

		@JSProperty
		void setProcessing(String processing);

		@JSProperty
		String getHeld();

		@JSProperty
		void setHeld(String held);
	}

	interface UploadingRemainingTime extends Any {
		@JSProperty
		String getPrefix();

		@JSProperty
		void setPrefix(String prefix);

		@JSProperty
		String getUnknown();

		@JSProperty
		void setUnknown(String unknown);
	}

	interface UploadingError extends Any {
		@JSProperty
		String getServerUnavailable();

		@JSProperty
		void setServerUnavailable(String serverUnavailable);

		@JSProperty
		String getUnexpectedServerError();

		@JSProperty
		void setUnexpectedServerError(String unexpectedServerError);

		@JSProperty
		String getForbidden();

		@JSProperty
		void setForbidden(String forbidden);
	}

	interface Units extends Any {
		@JSProperty
		String[] getSize();

		@JSProperty
		void setSize(@JSByRef String... size);
	}

	@JSFunctor
	@FunctionalInterface
	interface SizeFormatter extends Any {
		String formatSize(int bytes);
	}

	@JSFunctor
	@FunctionalInterface
	interface TimeFormatter extends Any {
		String formatTime(int seconds, int[] time);
	}
}
