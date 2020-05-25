package com.github.fluorumlabs.disconnect.core.components;

import com.github.fluorumlabs.disconnect.core.annotations.ImportStyle;
import com.github.fluorumlabs.disconnect.core.toolchain.DisconnectTestRunner;
import com.github.fluorumlabs.disconnect.core.Application;
import com.github.fluorumlabs.disconnect.core.components.html.text.block.Div;
import com.github.fluorumlabs.disconnect.core.internals.TagRegistryManager;
import js.web.cssom.CSSStyleDeclaration;
import js.web.dom.Window;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.core.Is.is;

/**
 * Created by Artem Godin on 4/21/2020.
 */
@RunWith(DisconnectTestRunner.class)
@ImportStyle("disconnect-core-jar/frontend/document-style.scss")
@ImportStyle(value = "disconnect-core-jar/frontend/global-style.scss", scope = ImportStyle.Scope.GLOBAL)
public class StylerTest {

	@BeforeClass
	public void init() {
		TagRegistryManager.registerTags();
	}

	@Test
	public void testNoStyleBleed() {
		Div test = new Div();
		test.add("Test");

		Application.render(test);

		CSSStyleDeclaration computedStyle = Window.WINDOW.getComputedStyle(test.getElement());

		Assert.assertThat("Registered component styles are leaking", computedStyle.getColor(), is("rgb(0, 0, 0)"));
		Assert.assertThat("Local component styles are leaking", computedStyle.getBorderTopColor(), is("rgb(0, 0, 0)"));
	}

	@Test
	public void testDocumentStyle() {
		Div test = new Div();
		test.add("Test");

		Application.render(test);

		CSSStyleDeclaration computedStyle = Window.WINDOW.getComputedStyle(test.getElement());

		Assert.assertThat("Document styles are not properly applied", computedStyle.getFontWeight(), is("100"));
	}

	@Test
	public void testGlobalStyle() {
		Div test = new Div();
		test.add("Test");

		Application.render(test);

		CSSStyleDeclaration divComputedStyle = Window.WINDOW.getComputedStyle(test.getElement());
		Assert.assertThat("Global styles are not properly applied", divComputedStyle.getBackgroundColor(), is("rgb(128, 128, 128)"));

		TemplatedCustomElement test2 = new TemplatedCustomElement();

		Application.render(test2);

		CSSStyleDeclaration testComputedStyle = Window.WINDOW.getComputedStyle(test2.getElement().getShadowRoot().getElementById("test"));
		Assert.assertThat("Global styles are not properly applied for component", testComputedStyle.getBackgroundColor(), is("rgb(128, 128, 128)"));
	}

	@Test
	public void testComponentStyle() {
		TemplatedCustomElement test = new TemplatedCustomElement();

		Application.render(test);
		CSSStyleDeclaration testComputedStyle = Window.WINDOW.getComputedStyle(test.getElement().getShadowRoot().getElementById("test"));
		Assert.assertThat("Component styles are not properly applied", testComputedStyle.getColor(), is("rgb(255, 0, 0)"));
		Assert.assertThat("Local styles are not properly applied", testComputedStyle.getBorderTopColor(), is("rgb(0, 128, 0)"));
	}

	@Test
	public void testInheritedComponentStyle() {
		ExtendedTemplatedCustomElement test = new ExtendedTemplatedCustomElement();

		Application.render(test);
		CSSStyleDeclaration testComputedStyle = Window.WINDOW.getComputedStyle(test.getElement().getShadowRoot().getElementById("test"));
		Assert.assertThat("Component styles are not properly applied", testComputedStyle.getColor(), is("rgb(255, 0, 0)"));
		Assert.assertThat("Local styles are not properly applied", testComputedStyle.getBorderTopColor(), is("rgb(0, 128, 0)"));
	}
}