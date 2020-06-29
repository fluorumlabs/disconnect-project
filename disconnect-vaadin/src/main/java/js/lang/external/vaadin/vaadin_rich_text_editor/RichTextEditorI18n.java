package js.lang.external.vaadin.vaadin_rich_text_editor;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import org.teavm.jso.JSProperty;

@NpmPackage(
    name = "@vaadin/vaadin-rich-text-editor",
    version = "^1.3.0-alpha1"
)
@Import(
    module = "@vaadin/vaadin-rich-text-editor/vaadin-rich-text-editor.js"
)
public interface RichTextEditorI18n extends Any {
  @JSProperty("undo")
  String getUndo();

  @JSProperty("undo")
  void setUndo(String value);

  @JSProperty("redo")
  String getRedo();

  @JSProperty("redo")
  void setRedo(String value);

  @JSProperty("bold")
  String getBold();

  @JSProperty("bold")
  void setBold(String value);

  @JSProperty("italic")
  String getItalic();

  @JSProperty("italic")
  void setItalic(String value);

  @JSProperty("underline")
  String getUnderline();

  @JSProperty("underline")
  void setUnderline(String value);

  @JSProperty("strike")
  String getStrike();

  @JSProperty("strike")
  void setStrike(String value);

  @JSProperty("h1")
  String getH1();

  @JSProperty("h1")
  void setH1(String value);

  @JSProperty("h2")
  String getH2();

  @JSProperty("h2")
  void setH2(String value);

  @JSProperty("h3")
  String getH3();

  @JSProperty("h3")
  void setH3(String value);

  @JSProperty("subscript")
  String getSubscript();

  @JSProperty("subscript")
  void setSubscript(String value);

  @JSProperty("superscript")
  String getSuperscript();

  @JSProperty("superscript")
  void setSuperscript(String value);

  @JSProperty("listOrdered")
  String getListOrdered();

  @JSProperty("listOrdered")
  void setListOrdered(String value);

  @JSProperty("listBullet")
  String getListBullet();

  @JSProperty("listBullet")
  void setListBullet(String value);

  @JSProperty("alignLeft")
  String getAlignLeft();

  @JSProperty("alignLeft")
  void setAlignLeft(String value);

  @JSProperty("alignCenter")
  String getAlignCenter();

  @JSProperty("alignCenter")
  void setAlignCenter(String value);

  @JSProperty("alignRight")
  String getAlignRight();

  @JSProperty("alignRight")
  void setAlignRight(String value);

  @JSProperty("image")
  String getImage();

  @JSProperty("image")
  void setImage(String value);

  @JSProperty("link")
  String getLink();

  @JSProperty("link")
  void setLink(String value);

  @JSProperty("blockquote")
  String getBlockquote();

  @JSProperty("blockquote")
  void setBlockquote(String value);

  @JSProperty("codeBlock")
  String getCodeBlock();

  @JSProperty("codeBlock")
  void setCodeBlock(String value);

  @JSProperty("clean")
  String getClean();

  @JSProperty("clean")
  void setClean(String value);

  @JSProperty("linkDialogTitle")
  String getLinkDialogTitle();

  @JSProperty("linkDialogTitle")
  void setLinkDialogTitle(String value);

  @JSProperty("ok")
  String getOk();

  @JSProperty("ok")
  void setOk(String value);

  @JSProperty("cancel")
  String getCancel();

  @JSProperty("cancel")
  void setCancel(String value);

  @JSProperty("remove")
  String getRemove();

  @JSProperty("remove")
  void setRemove(String value);

  static Builder builder() {
    return new Builder();
  }

  final class Builder {
    private final RichTextEditorI18n object = Any.empty();

    private Builder() {
    }

    public RichTextEditorI18n build() {
      return object;
    }

    public Builder undo(String value) {
      object.setUndo(value);
      return this;
    }

    public Builder redo(String value) {
      object.setRedo(value);
      return this;
    }

    public Builder bold(String value) {
      object.setBold(value);
      return this;
    }

    public Builder italic(String value) {
      object.setItalic(value);
      return this;
    }

    public Builder underline(String value) {
      object.setUnderline(value);
      return this;
    }

    public Builder strike(String value) {
      object.setStrike(value);
      return this;
    }

    public Builder h1(String value) {
      object.setH1(value);
      return this;
    }

    public Builder h2(String value) {
      object.setH2(value);
      return this;
    }

    public Builder h3(String value) {
      object.setH3(value);
      return this;
    }

    public Builder subscript(String value) {
      object.setSubscript(value);
      return this;
    }

    public Builder superscript(String value) {
      object.setSuperscript(value);
      return this;
    }

    public Builder listOrdered(String value) {
      object.setListOrdered(value);
      return this;
    }

    public Builder listBullet(String value) {
      object.setListBullet(value);
      return this;
    }

    public Builder alignLeft(String value) {
      object.setAlignLeft(value);
      return this;
    }

    public Builder alignCenter(String value) {
      object.setAlignCenter(value);
      return this;
    }

    public Builder alignRight(String value) {
      object.setAlignRight(value);
      return this;
    }

    public Builder image(String value) {
      object.setImage(value);
      return this;
    }

    public Builder link(String value) {
      object.setLink(value);
      return this;
    }

    public Builder blockquote(String value) {
      object.setBlockquote(value);
      return this;
    }

    public Builder codeBlock(String value) {
      object.setCodeBlock(value);
      return this;
    }

    public Builder clean(String value) {
      object.setClean(value);
      return this;
    }

    public Builder linkDialogTitle(String value) {
      object.setLinkDialogTitle(value);
      return this;
    }

    public Builder ok(String value) {
      object.setOk(value);
      return this;
    }

    public Builder cancel(String value) {
      object.setCancel(value);
      return this;
    }

    public Builder remove(String value) {
      object.setRemove(value);
      return this;
    }
  }
}
