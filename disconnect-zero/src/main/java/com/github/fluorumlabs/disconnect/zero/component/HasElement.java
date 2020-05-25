package com.github.fluorumlabs.disconnect.zero.component;

import js.web.dom.Element;


public interface HasElement<X extends Element> {
    X getElement();
/*
    static <X extends Element, T extends HasElement<X>> T from(X element, Function<X,T> constructor) {
        ComponentReferenceHolder referenceHolder = element.cast();
        T instance = referenceHolder.get();

        if (instance != null && Platform.getPlatformObject(instance) != undefined) {
            return instance;
        } else {
            return constructor.apply(element);
        }
    }*/

static Element[] getElements(HasElement<? extends Element>[] elements) {
    Element[] newArray = new Element[elements.length];
    for (int i = 0; i < elements.length; i++) {
        newArray[i] = elements[i].getElement();
    }
    return newArray;
}

}
