package org.vaadin.disconnect.demo.client.views;

import org.vaadin.disconnect.demo.client.LoadingState;
import org.vaadin.disconnect.vue.annotations.Route;
import org.vaadin.disconnect.vue.annotations.State;
import org.vaadin.disconnect.vue.annotations.VueComponent;
import org.vaadin.disconnect.vue.client.elements.Element;
import org.vaadin.disconnect.vue.client.elements.HtmlElement;
import org.vaadin.disconnect.vue.client.elements.RouterView;
import org.vaadin.disconnect.vue.client.ui.Component;
import org.vaadin.disconnect.vue.client.validation.Validation;
import org.vaadin.disconnect.vue.client.validation.ValidationResult;
import org.vaadin.disconnect.vuetify.elements.Button;
import org.vaadin.disconnect.vuetify.elements.inputs.TextField;
import org.vaadin.disconnect.vuetify.elements.wrappers.VerticalLayout;

import javax.validation.Constraint;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import javax.validation.Payload;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.util.Objects;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by Artem Godin on 9/27/2019.
 */
@VueComponent
@Route("test")
@TestView.PasswordsMatch
public class TestView extends Component {

    @NotNull
    @NotBlank
    @Size(min = 8, max = 50)
    private String password = null;

    @NotNull
    @NotBlank
    @Size(min = 8, max = 50)
    private String confirmPassword = null;

    @State
    private LoadingState loadingState;

    @Override
    public Element init() {
        VerticalLayout verticalLayout = new VerticalLayout();

        TextField passwordField = new TextField("Type password");
        passwordField.bind(this::getPassword, this::setPassword, true);

        TextField confirmPasswordField = new TextField("Type password again");
        confirmPasswordField.bind(this::getConfirmPassword, this::setConfirmPassword, true);

        HtmlElement div = Element.of("div");

        Button button = new Button("Test validation");

        observe(() -> Objects.equals(password, confirmPassword))
                .map(eq -> eq ? null : "passwords must match")
                .then(confirmPasswordField::setErrorMessage);

        button.onClick(() -> {
            ValidationResult validationResult = Validation.validate(this);
            if (validationResult.isValid()) {
                div.setText("");
            } else {
                div.setText(validationResult.first());
                passwordField.revalidate();
                confirmPasswordField.revalidate();
            }
        });

        verticalLayout.add(div, passwordField, confirmPasswordField, button, new RouterView());

        return verticalLayout;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }


    @Constraint(validatedBy = {PasswordMatchingValidator.class})
    @Target({METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER, TYPE_USE})
    @Retention(RUNTIME)
    public @interface PasswordsMatch {
        String message() default "passwords must match";

        Class<?>[] groups() default {};

        Class<? extends Payload>[] payload() default {};
    }

    public static class PasswordMatchingValidator implements ConstraintValidator<PasswordsMatch, TestView> {
        @Override
        public boolean isValid(TestView value, ConstraintValidatorContext context) {
            return value.getPassword() != null && value.getPassword().equals(value.getConfirmPassword());
        }

        @Override
        public void initialize(PasswordsMatch constraintAnnotation) {

        }
    }
}
