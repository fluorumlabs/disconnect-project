package com.github.fluorumlabs.disconnect.vaadin.i18n;

import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * Created by Artem Godin on 2/4/2020.
 */
public interface CrudI18n extends Any {
	@JSProperty
	String getNewItem();

	@JSProperty
	void setNewItem(String newItem);

	@JSProperty
	String getEditItem();

	@JSProperty
	void setEditItem(String editItem);

	@JSProperty
	String getSaveItem();

	@JSProperty
	void setSaveItem(String saveItem);

	@JSProperty
	String getCancel();

	@JSProperty
	void setCancel(String cancel);

	@JSProperty
	String getDeleteItem();

	@JSProperty
	void setDeleteItem(String deleteItem);

	@JSProperty
	String getEditLabel();

	@JSProperty
	void setEditLabel(String editLabel);

	interface Confirm extends Any {
		@JSProperty
		Action getDelete();

		@JSProperty
		void setDelete(Action delete);

		@JSProperty
		Action getCancel();

		@JSProperty
		void setCancel(Action cancel);
	}

	interface Action extends Any {
		@JSProperty
		String getTitle();

		@JSProperty
		void setTitle(String title);

		@JSProperty
		String getMessage();

		@JSProperty
		void setMessage(String message);

		@JSProperty
		Button getButton();

		@JSProperty
		void setButton(Button button);

	}

	interface Button extends Any {
		@JSProperty
		String getConfirm();

		@JSProperty
		void setConfirm(String confirm);

		@JSProperty
		String getDismiss();

		@JSProperty
		void setDismiss(String dismiss);
	}
}
