package com.github.fluorumlabs.disconnect.core.components;

import com.github.fluorumlabs.disconnect.core.toolchain.DisconnectTestRunner;
import com.github.fluorumlabs.disconnect.core.components.html.text.block.Div;
import com.github.fluorumlabs.disconnect.core.internals.TagRegistry;
import com.github.fluorumlabs.disconnect.core.internals.TagRegistryManager;
import js.lang.JsObject;
import js.web.dom.HTMLDivElement;
import js.web.dom.HTMLElement;
import js.web.dom.Window;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.core.Is.is;

/**
 * Created by Artem Godin on 4/21/2020.
 */
@RunWith(DisconnectTestRunner.class)
public class ComponentTest {

	@BeforeClass
	public void init() {
		TagRegistryManager.registerTags();
	}

	@Test
	public void testCreateComponent() {
		Div first = new Div();
		Assert.assertThat("First component doesn't have element attached", first.getElement(), notNullValue());
		Assert.assertThat("First element has wrong tag", first.getElement().getTagName(), is("DIV"));
		Div second = new Div();
		Assert.assertThat("Second component doesn't have element attached", second.getElement(), notNullValue());
		Assert.assertThat("Second element has wrong tag", first.getElement().getTagName(), is("DIV"));
		Assert.assertThat("Second component has the same element attached as the first", JsObject.is(first.getElement(), second.getElement()), is(false));
	}

	@Test
	public void testCreateExtendedComponent() {
		ExtendedDiv first = new ExtendedDiv();
		Assert.assertThat("First component doesn't have element attached", first.getElement(), notNullValue());
		Assert.assertThat("First element has wrong tag", first.getElement().getTagName(), is("DIV"));
	}

	@Test
	public void testAttachComponent() {
		HTMLElement element = Window.DOCUMENT.createElement("div");
		HasElement<?> attached = TagRegistry.recover(element);
		Assert.assertThat("Attached component doesn't have element attached", attached.getElement(), notNullValue());
		Assert.assertThat("Attached component has incorrect element attached", attached.getElement(), sameInstance(element));
		Assert.assertThat("Attached component has incorrect class", (Div)attached, isA(Div.class));
	}

	@Test
	public void testAttachExtendedComponent() {
		HTMLElement element = Window.DOCUMENT.createElement("div");
		HasElement<?> attached = TagRegistry.recover(element, ExtendedDiv.class);
		Assert.assertThat("Attached component doesn't have element attached", attached.getElement(), notNullValue());
		Assert.assertThat("Attached component has incorrect element attached", attached.getElement(), sameInstance(element));
		Assert.assertThat("Attached component has incorrect class", (ExtendedDiv)attached, isA(ExtendedDiv.class));
	}

    @Test
    public void testReattachComponent() {
        Div first = new Div();
        Assert.assertThat("First component doesn't have element attached", first.getElement(), notNullValue());
        Assert.assertThat("First element has wrong tag", first.getElement().getTagName(), is("DIV"));

        HTMLDivElement element = first.getElement();
        HasElement<?> attached = TagRegistry.recover(first.getElement());
        Assert.assertThat("Attached component is not the same as original", attached, sameInstance(first));
        Assert.assertThat("Attached component has incorrect element attached", attached.getElement(), sameInstance(element));
    }

    @Test
    public void testReattachExtendedComponent() {
        ExtendedDiv first = new ExtendedDiv();
        Assert.assertThat("First component doesn't have element attached", first.getElement(), notNullValue());
        Assert.assertThat("First element has wrong tag", first.getElement().getTagName(), is("DIV"));

        HTMLDivElement element = first.getElement();
        HasElement<?> attached = TagRegistry.recover(first.getElement());
        Assert.assertThat("Attached component is not the same as original", attached, sameInstance(first));
        Assert.assertThat("Attached component has incorrect element attached", attached.getElement(), sameInstance(element));
    }
}