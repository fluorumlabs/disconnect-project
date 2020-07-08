package com.github.fluorumlabs.disconnect.core.components;

import com.github.fluorumlabs.disconnect.core.internals.TagRegistry;
import com.github.fluorumlabs.disconnect.core.utils.LowerCase;
import js.lang.Any;
import js.web.cssom.CSSStyleDeclaration;
import js.web.dom.DOMRectReadOnly;
import js.web.dom.DOMStringMap;
import js.web.dom.FocusOptions;
import js.web.dom.HTMLElement;

import java.util.Optional;

/**
 * Created by Artem Godin on 5/13/2020.
 */
public class HtmlComponent<X extends HTMLElement> extends Component<X> implements GlobalEvents<X> {
    protected HtmlComponent() {
    }

    protected HtmlComponent(String textContent) {
        this();
        setTextContent(textContent);
    }

    protected HtmlComponent(Component<?>... components) {
        this();
        add(components);
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
        return LowerCase.parse(Autocapitalize.class, getElement().getAutocapitalize());
    }

    public void setAutocapitalize(Autocapitalize autocapitalize) {
        getElement().setAutocapitalize(LowerCase.of(autocapitalize));
    }

    public Dir getDir() {
        return LowerCase.parse(Dir.class, getElement().getDir());
    }

    public void setDir(Dir dir) {
        getElement().setDir(LowerCase.of(dir));
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

    public void addClass(String className) {
        getClassList().add(className);
    }

    public void addClass(String... classNames) {
        getClassList().add(classNames);
    }

    public void removeClass(String className) {
        getClassList().remove(className);
    }

    public void removeClass(String... classNames) {
        getClassList().remove(classNames);
    }

    public void setClass(String className) {
        getElement().setClassName(className);
    }

    public void setClass(String... className) {
        getElement().setClassName(String.join(" ",className));
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

    public enum Dir {
        LTR, RTL
    }

    public enum Autocapitalize {
        ON, OFF, NONE, CHARACTERS, WORDS, SENTENCES
    }

    public enum Autocomplete {
        OFF,
        ON,
        NAME,

        HONORIFIC_PREFIX,
        GIVEN_NAME,
        ADDITIONAL_NAME,
        FAMILY_NAME,
        HONORIFIC_SUFFIX,
        NICKNAME,

        EMAIL,
        USERNAME,

        NEW_PASSWORD,
        CURRENT_PASSWORD,
        ONE_TIME_CODE,

        ORGANIZATION_TITLE,
        ORGANIZATION,
        STREET_ADDRES,
        ADDRESS_LINE_1,
        ADDRESS_LINE_2,
        ADDRESS_LINE_3,
        ADDRESS_LEVEL_4,
        ADDRESS_LEVEL_3,
        ADDRESS_LEVEL_2,
        ADDRESS_LEVEL_1,
        COUNTRY,
        COUNTRY_NAME,
        POSTAL_CODE,

        CC_NAME,
        CC_GIVEN_NAME,
        CC_ADDITIONAL_NAME,
        CC_FAMILY_NAME,
        CC_NUMBER,
        CC_EXP,
        CC_EXP_MONTH,
        CC_EXP_YEAR,
        CC_CSC,
        CC_TYPE,

        TRANSACTION_CURRENCY,
        TRANSACTION_AMOUNT,
        LANGUAGE,

        BDAY,
        BDAY_DAY,
        BDAY_MONTH,
        BDAY_YEAR,
        SEX,

        TEL,
        TEL_COUNTRY_CODE,
        TEL_NATIONAL,
        TEL_AREA_CODE,
        TEL_LOCAL,
        TEL_EXTENSION,
        IMPP,
        URL,
        PHOTO

        }

    public enum Autocorrect {
        ON, OFF
    }
}
