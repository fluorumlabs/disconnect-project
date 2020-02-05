package com.github.fluorumlabs.disconnect.vaadin;

import com.github.fluorumlabs.disconnect.vaadin.elements.LoginFormWrapperElement;
import com.github.fluorumlabs.disconnect.vaadin.mixins.HasElementMixin;
import com.github.fluorumlabs.disconnect.vaadin.mixins.HasLoginMixin;
import com.github.fluorumlabs.disconnect.vaadin.mixins.HasThemableMixin;
import com.github.fluorumlabs.disconnect.zero.component.AbstractComponent;
import com.github.fluorumlabs.disconnect.zero.component.Component;
import com.github.fluorumlabs.disconnect.zero.component.HasSlottedComponents;
import js.web.dom.Element;

/**
 * `<vaadin-login-form-wrapper>` is a helper component providing a wrapper for the login form.
 * <p>
 * See the usage in `<vaadin-login-form>`.
 * <p>
 * ### Styling
 * <p>
 * The following Shadow DOM parts of the `<vaadin-login-form-wrapper>` are available for styling:
 * <p>
 * Part name      | Description
 * ---------------|---------------------------------------------------------|
 * `form`         | Container for the entire component's content
 * `form-title`   | Title of the login form
 * `error-message`| Container for error message, contains error-message-title and error-message-description parts.
 * Hidden by default.
 * `error-message-title`       | Container for error message title
 * `error-message-description` | Container for error message description
 * `error-message-description` | Container for error message description
 * `footer`  | Container additional information text from `i18n` object
 * <p>
 * See [ThemableMixin – how to apply styles for shadow parts](https://github.com/vaadin/vaadin-themable-mixin/wiki)
 * <p>
 * ### Component's slots
 * <p>
 * The following slots are available for being set
 * <p>
 * Slot name | Description
 * ----------|---------------------------------------------------|
 * `form`    | Html form placeholder. See the usage in `<vaadin-login-form>`.
 * <p>
 * See examples of setting the content into slots in the live demos.
 */
public class VaadinLoginFormWrapper extends AbstractComponent<LoginFormWrapperElement>
		implements HasElementMixin<LoginFormWrapperElement, VaadinLoginFormWrapper>,
		HasThemableMixin<LoginFormWrapperElement, VaadinLoginFormWrapper>,
		HasLoginMixin<LoginFormWrapperElement, VaadinLoginFormWrapper>,
		HasSlottedComponents<LoginFormWrapperElement, VaadinLoginFormWrapper, Component<? extends Element>> {
	public VaadinLoginFormWrapper() {
		super("vaadin-login-form-wrapper");
	}

	public VaadinLoginFormWrapper setForm(Component<? extends Element> component) {
		return replaceSlotted("form", component);
	}

	public VaadinLoginFormWrapper setForm(Component<? extends Element>... components) {
		return replaceSlotted("form", components);
	}

	public VaadinLoginFormWrapper addToForm(Component<? extends Element> component) {
		return addSlotted("form", component);
	}

	public VaadinLoginFormWrapper addToForm(Component<? extends Element>... components) {
		return addSlotted("form", components);
	}

	public VaadinLoginFormWrapper insertToForm(Component<? extends Element> component) {
		return insertSlotted("form", component);
	}

	public VaadinLoginFormWrapper insertToForm(Component<? extends Element>... components) {
		return insertSlotted("form", components);
	}

	public VaadinLoginFormWrapper clearForm() {
		return removeAllSlotted("form");
	}
}
