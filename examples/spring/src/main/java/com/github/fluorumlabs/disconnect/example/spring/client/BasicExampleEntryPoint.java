package com.github.fluorumlabs.disconnect.example.spring.client;

import com.github.fluorumlabs.disconnect.core.annotations.EntryPoint;
import com.github.fluorumlabs.disconnect.example.spring.TestService;
import com.github.fluorumlabs.disconnect.vaadin.TextField;
import com.github.fluorumlabs.disconnect.vaadin.theme.Lumo;
import com.github.fluorumlabs.disconnect.zero.component.html.Div;

import javax.annotation.Resource;

import static js.web.dom.Window.DOCUMENT;

@EntryPoint
public class BasicExampleEntryPoint implements Runnable {

	@Resource
	private TestService testService;

	@Override
	public void run() {
		Lumo.useDarkTheme();
		H1 userCount = new H1("Trivial chat: No users yet");
		Div chat = new Div();
		TextField input = new TextField();
		input.label("Type your message and hit Enter :-P");
		input.getNode().getStyle().setWidth("100%"); // API not done yet

		input.keyDownEvent()
				.filter(keyboardEvent -> "Enter".equals(keyboardEvent.getKey()))
				.accept(keyboardEvent -> {
					testService.sendMessage(input.value());
					input.clear();
				});

		Div container = new Div(userCount, chat, input);
		DOCUMENT.getBody().appendChild(container.getNode());

		testService.getMessageStream().forEach(message -> {
			userCount.text("Trivial chat: " + message.userCount + " users online");
			if (message.message != null) {
				chat.add(new Div(message.message));
			}
		});
	}

}
