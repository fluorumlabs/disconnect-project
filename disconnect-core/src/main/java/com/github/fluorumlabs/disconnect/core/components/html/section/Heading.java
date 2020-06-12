package com.github.fluorumlabs.disconnect.core.components.html.section;

import com.github.fluorumlabs.disconnect.core.annotations.Tag;
import com.github.fluorumlabs.disconnect.core.components.Component;
import com.github.fluorumlabs.disconnect.core.components.HtmlComponent;
import js.web.dom.HTMLHeadingElement;

public class Heading extends HtmlComponent<HTMLHeadingElement> {
    protected Heading() {}

    protected Heading(String textContent) {
        super(textContent);
    }

    protected Heading(Component<?>... components) {
        super(components);
    }

    @Tag("h1")
    public static class Level1 extends Heading {
        public Level1() {
            super();
        }

        public Level1(String textContent) {
            super(textContent);
        }

        public Level1(Component<?>... components) {
            super(components);
        }
    }

    @Tag("h2")
    public static class Level2 extends Heading {
        public Level2() {
            super();
        }

        public Level2(String textContent) {
            super(textContent);
        }

        public Level2(Component<?>... components) {
            super(components);
        }
    }

    @Tag("h3")
    public static class Level3 extends Heading {
        public Level3() {
            super();
        }

        public Level3(String textContent) {
            super(textContent);
        }

        public Level3(Component<?>... components) {
            super(components);
        }
    }

    @Tag("h4")
    public static class Level4 extends Heading {
        public Level4() {
            super();
        }

        public Level4(String textContent) {
            super(textContent);
        }

        public Level4(Component<?>... components) {
            super(components);
        }
    }

    @Tag("h5")
    public static class Level5 extends Heading {
        public Level5() {
            super();
        }

        public Level5(String textContent) {
            super(textContent);
        }

        public Level5(Component<?>... components) {
            super(components);
        }
    }

    @Tag("h6")
    public static class Level6 extends Heading {
    }
}
