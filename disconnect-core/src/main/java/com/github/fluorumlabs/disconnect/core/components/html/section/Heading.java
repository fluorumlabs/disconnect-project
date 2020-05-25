package com.github.fluorumlabs.disconnect.core.components.html.section;

import com.github.fluorumlabs.disconnect.core.annotations.Tag;
import com.github.fluorumlabs.disconnect.core.components.HtmlComponent;
import js.web.dom.HTMLHeadingElement;

public class Heading extends HtmlComponent<HTMLHeadingElement> {
    protected Heading() {}

    @Tag("h1")
    public static class Level1 extends Heading {
    }

    @Tag("h2")
    public static class Level2 extends Heading {
    }

    @Tag("h3")
    public static class Level3 extends Heading {
    }

    @Tag("h4")
    public static class Level4 extends Heading {
    }

    @Tag("h5")
    public static class Level5 extends Heading {
    }

    @Tag("h6")
    public static class Level6 extends Heading {
    }
}
