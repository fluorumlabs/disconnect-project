package com.github.fluorumlabs.disconnect.zero.component;

import js.util.collections.Array;
import js.util.collections.ReadonlyArray;
import js.web.dom.Element;

/**
 * Created by Artem Godin on 2/5/2020.
 */
public interface HasSlots extends Component<Element> {
    default Container slotted(String slotName) {
        return new Container(getNode(), slotName);
    }

    class Container {
        private final Element root;

        private final String slotName;

        Container(Element root, String slotName) {
            this.root = root;
            this.slotName = slotName;
        }

        private void assignSlot(Component<? extends Element> component) {
            component.getRenderedNode().<Element>cast().setSlot(slotName);
        }

        private ReadonlyArray<Element> getSlottedElements() {
            return Array.from(root.getChildren())
                    .filter(((value, key, parent) -> value.getSlot().equals(slotName)));
        }

        public Container add(Component<? extends Element> component) {
            assignSlot(component);
            root.append(component.getRenderedNode());
            return this;
        }

        public Container add(Component<? extends Element>... components) {
            for (Component<? extends Element> component : components) {
                add(component);
            }
            return this;
        }

        public Container insert(Component<? extends Element>... components) {
            ReadonlyArray<Element> slottedElements = getSlottedElements();
            if (slottedElements.getLength() == 0) {
                add(components);
            } else {
                for (Component<? extends Element> component : components) {
                    assignSlot(component);
                    root.insertBefore(component.getRenderedNode(), slottedElements.get(0));
                }
            }

            return this;
        }

        public Container insert(Component<? extends Element> component) {
            ReadonlyArray<Element> slottedElements = getSlottedElements();
            if (slottedElements.getLength() == 0) {
                add(component);
            } else {
                assignSlot(component);
                root.insertBefore(component.getRenderedNode(), slottedElements.get(0));
            }
            return this;
        }

        public Container replaceContent(Component<? extends Element> component) {
            removeAll();
            add(component);
            return this;
        }

        public Container replaceContent(Component<? extends Element>... components) {
            removeAll();
            add(components);
            return this;
        }

        public Container remove(Component<? extends Element> component) {
            root.removeChild(component.getRenderedNode());
            return this;
        }

        public Container remove(Component<? extends Element>... components) {
            for (Component<? extends Element> component : components) {
                remove(component);
            }
            return this;
        }

        public Container removeAll() {
            getSlottedElements().forEach((value, key, parent) -> root.removeChild(value));
            return this;
        }
    }
}
