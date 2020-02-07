package com.github.fluorumlabs.disconnect.example.basiczero.client;

import com.github.fluorumlabs.disconnect.polymer.DomIf;
import com.github.fluorumlabs.disconnect.vaadin.VaadinAppLayout;
import com.github.fluorumlabs.disconnect.vaadin.VaadinButton;
import com.github.fluorumlabs.disconnect.vaadin.VaadinTab;
import com.github.fluorumlabs.disconnect.vaadin.VaadinTabs;
import com.github.fluorumlabs.disconnect.vaadin.constants.Orientation;
import com.github.fluorumlabs.disconnect.vaadin.theme.Lumo;
import com.github.fluorumlabs.disconnect.zero.component.html.Anchor;
import com.github.fluorumlabs.disconnect.zero.component.html.Button;
import com.github.fluorumlabs.disconnect.zero.component.html.H1;
import com.github.fluorumlabs.disconnect.zero.component.html.Paragraph;
import js.lang.JsDate;

import java.util.ArrayList;
import java.util.List;


public class BasicZeroExampleView extends VaadinAppLayout {
	{
		navbarSlot().add(createMenuTabs());

		add(new H1("Disconnect: Basic example"));

		DomIf domIf = new DomIf(new Paragraph("This text supposed to be hidden via dom-if"));
		domIf.setIf(true);

		VaadinButton button = new VaadinButton().text("Click me!").theme(VaadinButton.Variant.SUCCESS);
		button.clickEvent().accept(evt -> {
			Lumo.useLightTheme();
			add(new Paragraph("Button was clicked on " + JsDate.create().toISOString()));
		});

		button.visibilityChangeEvent().accept(evt -> {
			add(new Paragraph("Button visibility changed to " + evt.becameVisible()));
			domIf.setIf(evt.becameVisible());
		});

		Button hideButton = new Button("Hide button");
		hideButton.clickEvent().accept(evt -> button.toggleVisibility());

		add(button, hideButton, domIf);
	}

	private static VaadinTabs createMenuTabs() {
		VaadinTabs tabs = new VaadinTabs();
		tabs.orientation(Orientation.HORIZONTAL);
		getAvailableTabs().forEach(tabs::add);
		return tabs;
	}

	private static List<VaadinTab> getAvailableTabs() {
		List<VaadinTab> tabs = new ArrayList<>();
		tabs.add(new VaadinTab().add(new Anchor("GitHub data")).theme(VaadinTab.Variant.ICON_ON_TOP));
		return tabs;
	}

}
