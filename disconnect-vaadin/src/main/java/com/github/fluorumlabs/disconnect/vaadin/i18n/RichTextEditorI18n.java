package com.github.fluorumlabs.disconnect.vaadin.i18n;

import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * Created by Artem Godin on 2/4/2020.
 */
public interface RichTextEditorI18n extends Any {
    @JSProperty
    String getUndo();

    @JSProperty
    void setUndo(String undo);

    @JSProperty
    String getRedo();

    @JSProperty
    void setRedo(String redo);

    @JSProperty
    String getBold();

    @JSProperty
    void setBold(String bold);

    @JSProperty
    String getItalic();

    @JSProperty
    void setItalic(String italic);

    @JSProperty
    String getUnderline();

    @JSProperty
    void setUnderline(String underline);

    @JSProperty
    String getStrike();

    @JSProperty
    void setStrike(String strike);

    @JSProperty
    String getH1();

    @JSProperty
    void setH1(String h1);

    @JSProperty
    String getH2();

    @JSProperty
    void setH2(String h2);

    @JSProperty
    String getH3();

    @JSProperty
    void setH3(String h3);

    @JSProperty
    String getSubscript();

    @JSProperty
    void setSubscript(String subscript);

    @JSProperty
    String getSuperscript();

    @JSProperty
    void setSuperscript(String superscript);

    @JSProperty
    String getListOrdered();

    @JSProperty
    void setListOrdered(String listOrdered);

    @JSProperty
    String getListBullet();

    @JSProperty
    void setListBullet(String listBullet);

    @JSProperty
    String getAlignLeft();

    @JSProperty
    void setAlignLeft(String alignLeft);

    @JSProperty
    String getAlignCenter();

    @JSProperty
    void setAlignCenter(String alignCenter);

    @JSProperty
    String getAlignRight();

    @JSProperty
    void setAlignRight(String alignRight);

    @JSProperty
    String getImage();

    @JSProperty
    void setImage(String image);

    @JSProperty
    String getLink();

    @JSProperty
    void setLink(String link);

    @JSProperty
    String getBlockquote();

    @JSProperty
    void setBlockquote(String blockquote);

    @JSProperty
    String getCodeBlock();

    @JSProperty
    void setCodeBlock(String codeBlock);

    @JSProperty
    String getClean();

    @JSProperty
    void setClean(String clean);

    @JSProperty
    String getLinkDialogTitle();

    @JSProperty
    void setLinkDialogTitle(String linkDialogTitle);

    @JSProperty
    String getOk();

    @JSProperty
    void setOk(String ok);

    @JSProperty
    String getCancel();

    @JSProperty
    void setCancel(String cancel);

    @JSProperty
    String getRemove();

    @JSProperty
    void setRemove(String remove);
}
