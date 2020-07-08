package js.lang.external.vaadin.crud;

import js.lang.Any;
import org.teavm.jso.JSBody;

/**
 * Created by Artem Godin on 7/3/2020.
 */
public interface CrudI18n extends Any {
    @JSBody(script = "this.confirm = this.confirm || {}; return this.confirm;")
    Confirmation confirm();

    @JSBody(params = "value", script = "this.newItem = value; return this;")
    CrudI18n newItem(String value);

    @JSBody(params = "value", script = "this.editItem = value; return this;")
    CrudI18n editItem(String value);

    @JSBody(params = "value", script = "this.saveItem = value; return this;")
    CrudI18n saveItem(String value);

    @JSBody(params = "value", script = "this.cancel = value; return this;")
    CrudI18n cancel(String value);

    @JSBody(params = "value", script = "this.deleteItem = value; return this;")
    CrudI18n deleteItem(String value);

    @JSBody(params = "value", script = "this.editLabel = value; return this;")
    CrudI18n editLabel(String value);

    interface Confirmation extends Any {
        @JSBody(script = "this.delete = this.delete || {}; return this.delete;")
        Action delete();

        @JSBody(script = "this.cancel = this.cancel || {}; return this.cancel;")
        Action cancel();
    }

    interface Action extends Any {
        @JSBody(script = "this.button = this.button || {}; return this.button;")
        Button button();

        @JSBody(params = "value", script = "this.title = value; return this;")
        Action title(String value);

        @JSBody(params = "value", script = "this.content = value; return this;")
        Action content(String value);
    }

    interface Button extends Any {
        @JSBody(params = "value", script = "this.confirm = value; return this;")
        Button confirm(String value);

        @JSBody(params = "value", script = "this.dismiss = value; return this;")
        Button dismiss(String value);
    }
}
