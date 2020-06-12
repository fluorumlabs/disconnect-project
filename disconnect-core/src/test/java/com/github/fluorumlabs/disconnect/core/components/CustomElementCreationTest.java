package com.github.fluorumlabs.disconnect.core.components;

import com.github.fluorumlabs.disconnect.core.Application;
import com.github.fluorumlabs.disconnect.core.toolchain.DisconnectTestRunner;
import js.util.JS;
import js.web.dom.HTMLElement;
import js.web.dom.Window;
import js.web.webcomponents.ShadowRoot;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.core.Is.is;

/**
 * Created by Artem Godin on 4/21/2020.
 */
@RunWith(DisconnectTestRunner.class)
public class CustomElementCreationTest {

	@Test
	public void testJavaSideComponentCreation() {
		TestCustomElement testCustomElement = new TestCustomElement();
		testCustomElement.getElement().setId("testJavaSideComponentCreation");
		Application.render(testCustomElement);

		HTMLElement element = Window.DOCUMENT.getBody().querySelector("cgfdcc-test-custom-element#testJavaSideComponentCreation");
		Assert.assertThat("Custom element is not present in document.body", element, notNullValue());
		ShadowRoot shadowRoot = element.getShadowRoot();
		Assert.assertThat("Shadow Root is not properly attached", JS.isUndefinedOrNull(shadowRoot), CoreMatchers.is(false));
		HTMLElement div = shadowRoot.querySelector("div");
		Assert.assertThat("Div is not present in shadow root", JS.isUndefinedOrNull(div), is(false));
		Assert.assertThat("Div does not contain text", div.getTextContent(), is("String: Test"));
	}

	@Test
	public void testJsSideComponentCreation() {
		HTMLElement testCustomElement = Window.DOCUMENT.createElement("cgfdcc-test-custom-element");
		testCustomElement.setId("testJsSideComponentCreation");
		Window.DOCUMENT.getBody().appendChild(testCustomElement);

		HTMLElement element = Window.DOCUMENT.getBody().querySelector("cgfdcc-test-custom-element#testJsSideComponentCreation");
		Assert.assertThat("Custom element is not present in document.body", element, notNullValue());
		ShadowRoot shadowRoot = element.getShadowRoot();
		Assert.assertThat("Shadow Root is not properly attached", JS.isUndefinedOrNull(shadowRoot), is(false));
		HTMLElement div = shadowRoot.querySelector("div");
		Assert.assertThat("Div is not present in shadow root", JS.isUndefinedOrNull(div), is(false));
		Assert.assertThat("Div does not contain text", div.getTextContent(), is("String: Test"));
	}

	@Test
	public void testAttributePropagation() {
		TestCustomElement testCustomElement = new TestCustomElement();
		testCustomElement.getElement().setId("testAttributePropagation");
		Application.render(testCustomElement);

		HTMLElement element = Window.DOCUMENT.getBody().querySelector("cgfdcc-test-custom-element#testAttributePropagation");
		ShadowRoot shadowRoot = element.getShadowRoot();
		HTMLElement div = shadowRoot.querySelector("div");
		Assert.assertThat("Div does not contain text", div.getTextContent(), is("String: Test"));

		testCustomElement.getElement().setAttribute("string-value", "test");
		Assert.assertThat("Attribute value didn't trigger observer", div.getTextContent(), is("String: test"));
	}

}