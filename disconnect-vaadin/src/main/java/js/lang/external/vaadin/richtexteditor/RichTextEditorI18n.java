package js.lang.external.vaadin.richtexteditor;

import js.lang.Any;
import org.teavm.jso.JSBody;

/**
 * Created by Artem Godin on 7/3/2020.
 */
public interface RichTextEditorI18n extends Any {
    @JSBody(params = "value", script = "this.undo = value; return this;")
    RichTextEditorI18n undo(String value);

    @JSBody(params = "value", script = "this.redo = value; return this;")
    RichTextEditorI18n redo(String value);

    @JSBody(params = "value", script = "this.bold = value; return this;")
    RichTextEditorI18n bold(String value);

    @JSBody(params = "value", script = "this.italic = value; return this;")
    RichTextEditorI18n italic(String value);

    @JSBody(params = "value", script = "this.underline = value; return this;")
    RichTextEditorI18n underline(String value);

    @JSBody(params = "value", script = "this.strike = value; return this;")
    RichTextEditorI18n strike(String value);

    @JSBody(params = "value", script = "this.h1 = value; return this;")
    RichTextEditorI18n h1(String value);

    @JSBody(params = "value", script = "this.h2 = value; return this;")
    RichTextEditorI18n h2(String value);

    @JSBody(params = "value", script = "this.h3 = value; return this;")
    RichTextEditorI18n h3(String value);

    @JSBody(params = "value", script = "this.subscript = value; return this;")
    RichTextEditorI18n subscript(String value);

    @JSBody(params = "value", script = "this.superscript = value; return this;")
    RichTextEditorI18n superscript(String value);

    @JSBody(params = "value", script = "this.listOrdered = value; return this;")
    RichTextEditorI18n listOrdered(String value);

    @JSBody(params = "value", script = "this.listBullet = value; return this;")
    RichTextEditorI18n listBullet(String value);

    @JSBody(params = "value", script = "this.alignLeft = value; return this;")
    RichTextEditorI18n alignLeft(String value);

    @JSBody(params = "value", script = "this.alignCenter = value; return this;")
    RichTextEditorI18n alignCenter(String value);

    @JSBody(params = "value", script = "this.alignRight = value; return this;")
    RichTextEditorI18n alignRight(String value);

    @JSBody(params = "value", script = "this.image = value; return this;")
    RichTextEditorI18n image(String value);

    @JSBody(params = "value", script = "this.link = value; return this;")
    RichTextEditorI18n link(String value);

    @JSBody(params = "value", script = "this.blockquote = value; return this;")
    RichTextEditorI18n blockquote(String value);

    @JSBody(params = "value", script = "this.codeBlock = value; return this;")
    RichTextEditorI18n codeBlock(String value);

    @JSBody(params = "value", script = "this.clean = value; return this;")
    RichTextEditorI18n clean(String value);

    @JSBody(params = "value", script = "this.linkDialogTitle = value; return this;")
    RichTextEditorI18n linkDialogTitle(String value);

    @JSBody(params = "value", script = "this.ok = value; return this;")
    RichTextEditorI18n ok(String value);

    @JSBody(params = "value", script = "this.cancel = value; return this;")
    RichTextEditorI18n cancel(String value);

    @JSBody(params = "value", script = "this.remove = value; return this;")
    RichTextEditorI18n remove(String value);
}
