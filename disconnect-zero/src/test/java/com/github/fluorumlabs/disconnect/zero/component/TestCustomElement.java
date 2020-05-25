package com.github.fluorumlabs.disconnect.zero.component;

import com.github.fluorumlabs.disconnect.zero.annotations.Attribute;
import com.github.fluorumlabs.disconnect.zero.annotations.CustomElement;
import com.github.fluorumlabs.disconnect.zero.component.html.text.block.Div;
import com.github.fluorumlabs.disconnect.zero.observable.ObservableValue;

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
