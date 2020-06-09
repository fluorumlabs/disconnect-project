package com.github.fluorumlabs.disconnect.polymer;

import com.github.fluorumlabs.disconnect.core.Application;
import com.github.fluorumlabs.disconnect.core.components.html.webcomponent.Template;
import com.github.fluorumlabs.disconnect.core.internals.TagRegistryManager;
import com.github.fluorumlabs.disconnect.core.toolchain.DisconnectTestRunner;
import js.web.dom.Window;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNot.not;

/**
 * Created by Artem Godin on 6/8/2020.
 */
@RunWith(DisconnectTestRunner.class)
public class DomIfTest {
    @BeforeClass
    public void init() {
        TagRegistryManager.registerTags();
    }

    @Test
    public void testDomIf() {
        DomIf domIf = new DomIf();

        Template template = new Template();

        template.getContent().add("Text");

        domIf.add(template);
        domIf.setRestamp(true);
        domIf.setIfValue(true);

        Application.render(domIf);
        domIf.render();

        Assert.assertThat("Visible text is not found in document", Window.DOCUMENT.getBody().getInnerText(), is("Text"));

        domIf.setIfValue(false);
        domIf.render();

        Assert.assertThat("Visible text is found in document", Window.DOCUMENT.getBody().getInnerText(), not("Text"));
    }
}