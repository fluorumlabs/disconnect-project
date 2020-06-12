package com.github.fluorumlabs.disconnect.polymer;

import com.github.fluorumlabs.disconnect.core.Application;
import com.github.fluorumlabs.disconnect.core.toolchain.DisconnectTestRunner;
import js.web.dom.Window;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNot.not;

/**
 * Created by Artem Godin on 6/8/2020.
 */
@RunWith(DisconnectTestRunner.class)
public class DomIfTemplateTest {
    @Test
    public void testDomIf() {
        TestComponentComponent domIf = new TestComponentComponent();

        Application.render(domIf);
        Application.waitNextFrame();

        Assert.assertThat("Visible text is not found in document", Window.DOCUMENT.getBody().getInnerText(), is("Text"));

        domIf.hide();
        Application.waitNextFrame();

        Assert.assertThat("Visible text is found in document", Window.DOCUMENT.getBody().getInnerText(), not("Text"));
    }
}