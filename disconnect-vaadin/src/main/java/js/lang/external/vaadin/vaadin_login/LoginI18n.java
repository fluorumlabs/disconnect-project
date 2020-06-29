package js.lang.external.vaadin.vaadin_login;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

@NpmPackage(
    name = "@vaadin/vaadin-login",
    version = "^1.2.0-alpha2"
)
@Import(
    module = "@vaadin/vaadin-login/vaadin-login-overlay.js"
)
public interface LoginI18n extends Any {
  @JSProperty("form")
  Form getForm();

  @JSProperty("form")
  void setForm(Form value);

  @JSProperty("errorMessage")
  ErrorMessage getErrorMessage();

  @JSProperty("errorMessage")
  void setErrorMessage(ErrorMessage value);

  @JSProperty("header")
  @Nullable
  Header getHeader();

  @JSProperty("header")
  void setHeader(@Nullable Header value);

  @JSProperty("additionalInformation")
  @Nullable
  String getAdditionalInformation();

  @JSProperty("additionalInformation")
  void setAdditionalInformation(@Nullable String value);

  static Builder builder() {
    return new Builder();
  }

  interface Form extends Any {
    @JSProperty("title")
    String getTitle();

    @JSProperty("title")
    void setTitle(String value);

    @JSProperty("username")
    String getUsername();

    @JSProperty("username")
    void setUsername(String value);

    @JSProperty("password")
    String getPassword();

    @JSProperty("password")
    void setPassword(String value);

    @JSProperty("submit")
    String getSubmit();

    @JSProperty("submit")
    void setSubmit(String value);

    @JSProperty("forgotPassword")
    String getForgotPassword();

    @JSProperty("forgotPassword")
    void setForgotPassword(String value);

    static Form.Builder builder() {
      return new Form.Builder();
    }

    final class Builder {
      private final Form object = Any.empty();

      private Builder() {
      }

      public Form build() {
        return object;
      }

      public Form.Builder title(String value) {
        object.setTitle(value);
        return this;
      }

      public Form.Builder username(String value) {
        object.setUsername(value);
        return this;
      }

      public Form.Builder password(String value) {
        object.setPassword(value);
        return this;
      }

      public Form.Builder submit(String value) {
        object.setSubmit(value);
        return this;
      }

      public Form.Builder forgotPassword(String value) {
        object.setForgotPassword(value);
        return this;
      }
    }
  }

  interface ErrorMessage extends Any {
    @JSProperty("title")
    String getTitle();

    @JSProperty("title")
    void setTitle(String value);

    @JSProperty("message")
    String getMessage();

    @JSProperty("message")
    void setMessage(String value);

    static ErrorMessage.Builder builder() {
      return new ErrorMessage.Builder();
    }

    final class Builder {
      private final ErrorMessage object = Any.empty();

      private Builder() {
      }

      public ErrorMessage build() {
        return object;
      }

      public ErrorMessage.Builder title(String value) {
        object.setTitle(value);
        return this;
      }

      public ErrorMessage.Builder message(String value) {
        object.setMessage(value);
        return this;
      }
    }
  }

  interface Header extends Any {
    @JSProperty("title")
    @Nullable
    String getTitle();

    @JSProperty("title")
    void setTitle(@Nullable String value);

    @JSProperty("description")
    @Nullable
    String getDescription();

    @JSProperty("description")
    void setDescription(@Nullable String value);

    static Header.Builder builder() {
      return new Header.Builder();
    }

    final class Builder {
      private final Header object = Any.empty();

      private Builder() {
      }

      public Header build() {
        return object;
      }

      public Header.Builder title(@Nullable String value) {
        object.setTitle(value);
        return this;
      }

      public Header.Builder description(@Nullable String value) {
        object.setDescription(value);
        return this;
      }
    }
  }

  final class Builder {
    private final LoginI18n object = Any.empty();

    private Builder() {
    }

    public LoginI18n build() {
      return object;
    }

    public Builder form(Form value) {
      object.setForm(value);
      return this;
    }

    public Builder errorMessage(ErrorMessage value) {
      object.setErrorMessage(value);
      return this;
    }

    public Builder header(@Nullable Header value) {
      object.setHeader(value);
      return this;
    }

    public Builder additionalInformation(@Nullable String value) {
      object.setAdditionalInformation(value);
      return this;
    }
  }
}
