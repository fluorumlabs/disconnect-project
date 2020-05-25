package com.github.fluorumlabs.disconnect.zero.component;

import com.github.fluorumlabs.disconnect.zero.internals.TagRegistry;
import js.lang.Any;
import js.web.cssom.CSSStyleDeclaration;
import js.web.dom.*;

import java.util.Optional;

/**
 * Created by Artem Godin on 5/13/2020.
 */
public class HtmlComponent<X extends HTMLElement> extends Component<X> implements GlobalEvents<X> {
    protected HtmlComponent() {
    }

    public int getTabIndex() {
        return getElement().getTabIndex();
    }

    public void setTabIndex(int tabIndex) {
        getElement().setTabIndex(tabIndex);
    }

    public DOMStringMap getDataset() {
        return getElement().getDataset();
    }

    public void blur() {
        getElement().blur();
    }

    public void focus(boolean preventScroll) {
        FocusOptions options = Any.empty();
        options.setPreventScroll(preventScroll);
        getElement().focus(options);
    }

    public void focus() {
        focus(false);
    }

    //FIXME nonce?

    public String getAccessKey() {
        return getElement().getAccessKey();
    }

    public void setAccessKey(String accessKey) {
        getElement().setAccessKey(accessKey);
    }

    public Autocapitalize getAutocapitalize() {
        return getElement().getAutocapitalize();
    }

    public void setAutocapitalize(Autocapitalize autocapitalize) {
        getElement().setAutocapitalize(autocapitalize);
    }

    public Dir getDir() {
        return getElement().getDir();
    }

    public void setDir(Dir dir) {
        getElement().setDir(dir);
    }

    public boolean isDraggable() {
        return getElement().isDraggable();
    }

    public void setDraggable(boolean draggable) {
        getElement().setDraggable(draggable);
    }

    public boolean isHidden() {
        return getElement().isHidden();
    }

    public void setHidden(boolean hidden) {
        getElement().setHidden(hidden);
    }

    public String getInnerText() {
        return getElement().getInnerText();
    }

    public void setInnerText(String innerText) {
        getElement().setInnerText(innerText);
    }

    public String getLang() {
        return getElement().getLang();
    }

    public void setLang(String lang) {
        getElement().setLang(lang);
    }

    public DOMRectReadOnly getOffsetRect() {
        return DOMRectReadOnly.create(getElement().getOffsetLeft(), getElement().getOffsetTop(), getElement().getOffsetWidth(), getElement().getOffsetHeight());
    }

    public Optional<Component<?>> getOffsetParent() {
        return Optional.ofNullable(getElement().getOffsetParent())
                .map(TagRegistry::recover);
    }

    public boolean isSpellcheck() {
        return getElement().isSpellcheck();
    }

    public void setSpellcheck(boolean spellcheck) {
        getElement().setSpellcheck(spellcheck);
    }

    public String getTitle() {
        return getElement().getTitle();
    }

    public void setTitle(String title) {
        getElement().setTitle(title);
    }

    public boolean isTranslate() {
        return getElement().isTranslate();
    }

    public void setTranslate(boolean translate) {
        getElement().setTranslate(translate);
    }

    public void click() {
        getElement().click();
    }

    public CSSStyleDeclaration getStyle() {
        return getElement().getStyle();
    }

    /* FIXME
        @JSProperty
    String getContentEditable();

    @JSProperty
    void setContentEditable(String contentEditable);

    @JSProperty
    String getInputMode();

    @JSProperty
    void setInputMode(String inputMode);

    @JSProperty
    boolean isIsContentEditable();

     */


}
