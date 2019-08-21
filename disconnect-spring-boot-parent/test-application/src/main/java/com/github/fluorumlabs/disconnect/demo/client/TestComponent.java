package com.github.fluorumlabs.disconnect.demo.client;

import com.github.fluorumlabs.disconnect.demo.backend.ExampleService;
import com.github.fluorumlabs.disconnect.vue.annotations.VueModel;
import com.github.fluorumlabs.disconnect.vue.client.*;

import javax.annotation.Resource;

/**
 * Created by Artem Godin on 8/14/2019.
 */
public class TestComponent extends VueComponent<TestComponent.Model> {
    public static String tagName() {
        return "test-component";
    }

    @Resource
    ExampleService exampleService;

    @VueModel
    public interface Model extends VueComponentModel {
        int getCount();

        void setCount(int count);

        void setMessage(String message);

        String getMessage();

        int getDate();
    }

    public TestComponent() {
        getModel().setCount(500);
        getModel().setMessage("Click me");
    }

    static {
        Vue.registerComponent(TestComponent.tagName(), TestComponent::new);
    }

    @Override
    protected ElementPrototype render() {
        ElementPrototype container = Elements.create("div");
        container.add(
                Vaadin.button()
                        .withText("You didn't now that you clicked me " + getModel().getCount() + " times")
                        .withEventListener("click", evt -> getModel().setCount(getModel().getCount() + 1)),
                Vaadin.button()
                        .withAttribute("theme", "success")
                        .withText(getModel().getMessage())
                        .withEventListener("click", evt -> action())
        );

        return container;
    }

    public void action() {
        getModel().setMessage(exampleService.getCurrentDate());
    }
}
