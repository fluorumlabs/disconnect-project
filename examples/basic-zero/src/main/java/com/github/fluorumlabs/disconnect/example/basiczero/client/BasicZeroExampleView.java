package com.github.fluorumlabs.disconnect.example.basiczero.client;

import com.github.fluorumlabs.disconnect.polymer.DomIf;
import com.github.fluorumlabs.disconnect.vaadin.AppLayout;
import com.github.fluorumlabs.disconnect.vaadin.Button;
import com.github.fluorumlabs.disconnect.vaadin.Tab;
import com.github.fluorumlabs.disconnect.vaadin.Tabs;
import com.github.fluorumlabs.disconnect.vaadin.constants.Orientation;
import com.github.fluorumlabs.disconnect.vaadin.theme.Lumo;
import com.github.fluorumlabs.disconnect.zero.component.html.Anchor;
import com.github.fluorumlabs.disconnect.zero.component.html.H1;
import com.github.fluorumlabs.disconnect.zero.component.html.Paragraph;
import js.lang.JsDate;

import java.util.ArrayList;
import java.util.List;


public class BasicZeroExampleView extends AppLayout {
	{
		navbarSlot().add(createMenuTabs());

		add(new H1("Disconnect: Basic example"));

		DomIf domIf = new DomIf(new Paragraph("This text supposed to be hidden via dom-if"));
		domIf.setIf(true);

		Button button = new Button().text("Click me!").theme(Button.Variant.SUCCESS);
		button.clickEvent().accept(evt -> {
			Lumo.useExtraSmallFontSize();
			add(new Paragraph("Button was clicked on " + JsDate.create().toISOString()));
		});

		button.visibilityChangeEvent().accept(evt -> {
			add(new Paragraph("Button visibility changed to " + evt.becameVisible()));
			domIf.setIf(evt.becameVisible());
		});

		com.github.fluorumlabs.disconnect.zero.component.html.Button hideButton = new com.github.fluorumlabs.disconnect.zero.component.html.Button("Hide button");
		hideButton.clickEvent().accept(evt -> button.toggleVisibility());

		add(button, hideButton, domIf);
	}

	private static Tabs createMenuTabs() {
		Tabs tabs = new Tabs();
		tabs.orientation(Orientation.HORIZONTAL).theme(Tabs.Variant.CENTERED, Tabs.Variant.EQUAL_WIDTH_TABS);
		getAvailableTabs().forEach(tabs::add);
		return tabs;
	}

	private static List<Tab> getAvailableTabs() {
		List<Tab> tabs = new ArrayList<>();
		tabs.add(new Tab().add(new Anchor("GitHub data")).theme(Tab.Variant.ICON_ON_TOP));
		return tabs;
	}

}
