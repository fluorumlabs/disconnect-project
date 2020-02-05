package com.github.fluorumlabs.disconnect.vaadin.i18n;

import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * Created by Artem Godin on 2/4/2020.
 */
public interface LoginI18n extends Any {
	@JSProperty
	Header getHeader();

	@JSProperty
	void setHeader(Header header);

	@JSProperty
	Form getForm();

	@JSProperty
	void setForm(Form form);

	@JSProperty
	ErrorMessage getErrorMessage();

	@JSProperty
	void setErrorMessage(ErrorMessage errorMessage);

	@JSProperty
	String getAdditionalInformation();

	@JSProperty
	void setAdditionalInformation(String additionalInformation);

	interface Header extends Any {
		@JSProperty
		String getTitle();

		@JSProperty
		void setTitle(String title);

		@JSProperty
		String getDescription();

		@JSProperty
		void setDescription(String description);
	}

	interface Form extends Any {
		@JSProperty
		String getTitle();

		@JSProperty
		void setTitle(String title);

		@JSProperty
		String getUsername();

		@JSProperty
		void setUsername(String username);

		@JSProperty
		String getPassword();

		@JSProperty
		void setPassword(String password);

		@JSProperty
		String getSubmit();

		@JSProperty
		void setSubmit(String submit);

		@JSProperty
		String getForgotPassword();

		@JSProperty
		void setForgotPassword(String forgotPassword);
	}

	interface ErrorMessage extends Any {
		@JSProperty
		String getTitle();

		@JSProperty
		void setTitle(String title);

		@JSProperty
		String getMessage();

		@JSProperty
		void setMessage(String message);
	}
}
