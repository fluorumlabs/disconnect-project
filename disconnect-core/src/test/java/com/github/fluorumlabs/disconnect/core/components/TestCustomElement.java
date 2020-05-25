package com.github.fluorumlabs.disconnect.core.components;

import com.github.fluorumlabs.disconnect.core.annotations.Attribute;
import com.github.fluorumlabs.disconnect.core.annotations.CustomElement;
import com.github.fluorumlabs.disconnect.core.components.CustomElementComponent;
import com.github.fluorumlabs.disconnect.core.components.html.text.block.Div;
import com.github.fluorumlabs.disconnect.core.observables.ObservableValue;

/**
 * Created by Artem Godin on 5/4/2020.
 */
@CustomElement
public class TestCustomElement extends CustomElementComponent {
	@Attribute(defaultValue = "Test")
	private ObservableValue<String> stringValue;

	public TestCustomElement() {
		Div div = new Div();
		getRoot().add(div);

		stringValue.accept(s -> div.setTextContent("String: "+s));
	}
}
