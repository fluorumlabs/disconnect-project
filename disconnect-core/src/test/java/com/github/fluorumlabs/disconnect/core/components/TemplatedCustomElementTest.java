package com.github.fluorumlabs.disconnect.core.components;

import com.github.fluorumlabs.disconnect.core.Application;
import com.github.fluorumlabs.disconnect.core.components.html.text.block.Div;
import com.github.fluorumlabs.disconnect.core.toolchain.DisconnectTestRunner;
import js.web.dom.Element;
import js.web.webcomponents.ShadowRoot;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Optional;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.notNullValue;
import static org.junit.Assert.assertThat;

/**
 * Created by Artem Godin on 4/21/2020.
 */
@RunWith(DisconnectTestRunner.class)
public class TemplatedCustomElementTest {

	@Test
	public void testQuery() {
		ExtendedTemplatedCustomElement component = new ExtendedTemplatedCustomElement();
		Application.render(component);

		assertThat("Queried element not found", component.getTestDiv(), notNullValue());
		assertThat("Div content is invalid", component.getTestDiv().getTextContent(), is("Test"));
	}

	@Test
	public void testDefaultSlot() {
		ExtendedTemplatedCustomElement component = new ExtendedTemplatedCustomElement();
		Application.render(component);

		Div newComponent = new Div();
		newComponent.setTextContent("Div1");
		Div newComponent2 = new Div();
		newComponent2.setTextContent("Div2");

		assertThat("Wrong children count", component.size(), is(0));
		assertThat("Wrong children count in default slot", component.getDefaultSlot().size(), is(0));
		assertThat("Wrong children count in named slot", component.getNamedSlot().size(), is(0));

		component.add(newComponent); // Adds to default slot

		assertThat("Wrong children count", component.size(), is(1));
		assertThat("Wrong children count in default slot", component.getDefaultSlot().size(), is(1));
		assertThat("Wrong children count in named slot", component.getNamedSlot().size(), is(0));
		assertThat("Wrong element in component", component.get(0).getTextContent(), is("Div1"));
		assertThat("Wrong element in default slot", component.getDefaultSlot().get(0).getTextContent(), is("Div1"));

		component.getDefaultSlot().add(newComponent2);
		assertThat("Wrong children count", component.size(), is(2));
		assertThat("Wrong children count in default slot", component.getDefaultSlot().size(), is(2));
		assertThat("Wrong children count in named slot", component.getNamedSlot().size(), is(0));
		assertThat("Wrong element in component", component.get(0).getTextContent(), is("Div1"));
		assertThat("Wrong element in component", component.get(1).getTextContent(), is("Div2"));
		assertThat("Wrong element in default slot", component.getDefaultSlot().get(0).getTextContent(), is("Div1"));
		assertThat("Wrong element in default slot", component.getDefaultSlot().get(1).getTextContent(), is("Div2"));

		component.getDefaultSlot().remove(newComponent);
		assertThat("Wrong children count", component.size(), is(1));
		assertThat("Wrong children count in default slot", component.getDefaultSlot().size(), is(1));
		assertThat("Wrong children count in named slot", component.getNamedSlot().size(), is(0));
		assertThat("Wrong element in component", component.get(0).getTextContent(), is("Div2"));
		assertThat("Wrong element in default slot", component.getDefaultSlot().get(0).getTextContent(), is("Div2"));
	}

	@Test
	public void testNamedSlot() {
		ExtendedTemplatedCustomElement component = new ExtendedTemplatedCustomElement();
		Application.render(component);

		Div newComponent = new Div();
		newComponent.setTextContent("Div1");
		Div newComponent2 = new Div();
		newComponent2.setTextContent("Div2");

		assertThat("Wrong children count", component.size(), is(0));
		assertThat("Wrong children count in default slot", component.getDefaultSlot().size(), is(0));
		assertThat("Wrong children count in named slot", component.getNamedSlot().size(), is(0));

		newComponent.setSlot("named");
		component.add(newComponent); // Adds to named slot

		assertThat("Wrong children count", component.size(), is(1));
		assertThat("Wrong children count in default slot", component.getDefaultSlot().size(), is(0));
		assertThat("Wrong children count in named slot", component.getNamedSlot().size(), is(1));
		assertThat("Wrong element in component", component.get(0).getTextContent(), is("Div1"));
		assertThat("Wrong element in named slot", component.getNamedSlot().get(0).getTextContent(), is("Div1"));

		component.getNamedSlot().add(newComponent2);
		assertThat("Slot name was not automatically stamped", newComponent2.getSlot(), is("named"));
		assertThat("Wrong children count", component.size(), is(2));
		assertThat("Wrong children count in default slot", component.getDefaultSlot().size(), is(0));
		assertThat("Wrong children count in named slot", component.getNamedSlot().size(), is(2));
		assertThat("Wrong element in component", component.get(0).getTextContent(), is("Div1"));
		assertThat("Wrong element in component", component.get(1).getTextContent(), is("Div2"));
		assertThat("Wrong element in named slot", component.getNamedSlot().get(0).getTextContent(), is("Div1"));
		assertThat("Wrong element in named slot", component.getNamedSlot().get(1).getTextContent(), is("Div2"));

		component.getNamedSlot().remove(newComponent);
		assertThat("Slot name was not automatically removed", newComponent.getSlot(), is(""));
		assertThat("Wrong children count", component.size(), is(1));
		assertThat("Wrong children count in default slot", component.getDefaultSlot().size(), is(0));
		assertThat("Wrong children count in named slot", component.getNamedSlot().size(), is(1));
		assertThat("Wrong element in component", component.get(0).getTextContent(), is("Div2"));
		assertThat("Wrong element in named slot", component.getNamedSlot().get(0).getTextContent(), is("Div2"));

	}

	@Test
	public void testComponentUsage() {
		ParentComponent parentComponent = new ParentComponent();
		Application.render(parentComponent);
		Optional<Component<?>> component = parentComponent.getRoot().find("child-component");

		assertThat("Child component not found", component.isPresent(), is(true));

		Element element = component.get().getElement();
		ShadowRoot shadowRoot = element.getShadowRoot();

		assertThat("Child component was not upgraded", shadowRoot, notNullValue());
		assertThat("Child component text content is wrong", shadowRoot.getTextContent(), is("Test"));
	}

}