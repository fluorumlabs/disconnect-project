package js.lang.external.vaadin.login;

import js.lang.Any;
import org.teavm.jso.JSBody;

/**
 * Created by Artem Godin on 7/3/2020.
 */
public interface LoginI18n {
    @JSBody(params = "value", script = "this.additionalInformation = value; return this;")
    LoginI18n additionalInformation(String value);

    @JSBody(script = "this.form = this.form || {}; return this.form;")
    Form form();

    @JSBody(script = "this.errorMessage = this.errorMessage || {}; return this.errorMessage;")
    ErrorMessage errorMessage();

    @JSBody(script = "this.header = this.header || {}; return this.header;")
    Header header();

    interface Form extends Any {
        @JSBody(params = "value", script = "this.title = value; return this;")
        Form title(String value);

        @JSBody(params = "value", script = "this.username = value; return this;")
        Form username(String value);

        @JSBody(params = "value", script = "this.password = value; return this;")
        Form password(String value);

        @JSBody(params = "value", script = "this.submit = value; return this;")
        Form submit(String value);

        @JSBody(params = "value", script = "this.forgotPassword = value; return this;")
        Form forgotPassword(String value);
    }

    interface ErrorMessage extends Any {
        @JSBody(params = "value", script = "this.title = value; return this;")
        ErrorMessage title(String value);

        @JSBody(params = "value", script = "this.message = value; return this;")
        ErrorMessage message(String value);
    }

    interface Header extends Any {
        @JSBody(params = "value", script = "this.title = value; return this;")
        Header title(String value);

        @JSBody(params = "value", script = "this.description = value; return this;")
        Header description(String value);
    }
}
