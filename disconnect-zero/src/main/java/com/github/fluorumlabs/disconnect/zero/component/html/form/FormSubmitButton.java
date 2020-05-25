package com.github.fluorumlabs.disconnect.zero.component.html.form;

/**
 * Created by Artem Godin on 5/14/2020.
 */
public class FormSubmitButton extends Input{
    public FormSubmitButton() {
        setType("submit");
    }

    /**
     * Overrides the action attribute (where the data on a form is sent) on the parent form element.
     */
    @Override
    public String getFormAction() {
        return super.getFormAction();
    }

    @Override
    public void setFormAction(String formAction) {
        super.setFormAction(formAction);
    }

    /**
     * Used to override the encoding (formEnctype attribute) specified on the form element.
     */
    @Override
    public String getFormEnctype() {
        return super.getFormEnctype();
    }

    @Override
    public void setFormEnctype(String formEnctype) {
        super.setFormEnctype(formEnctype);
    }

    /**
     * Overrides the submit method attribute previously specified on a form element.
     */
    @Override
    public String getFormMethod() {
        return super.getFormMethod();
    }

    @Override
    public void setFormMethod(String formMethod) {
        super.setFormMethod(formMethod);
    }

    /**
     * Overrides any validation or required attributes on a form or form elements to allow it to be submitted without validation. This can be used to create a "save draft"-type submit option.
     */
    @Override
    public boolean isFormNoValidate() {
        return super.isFormNoValidate();
    }

    @Override
    public void setFormNoValidate(boolean formNoValidate) {
        super.setFormNoValidate(formNoValidate);
    }

    /**
     * Overrides the target attribute on a form element.
     */
    @Override
    public String getFormTarget() {
        return super.getFormTarget();
    }

    @Override
    public void setFormTarget(String formTarget) {
        super.setFormTarget(formTarget);
    }
}
