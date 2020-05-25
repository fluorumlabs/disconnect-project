package com.github.fluorumlabs.disconnect.core.components.html.form;

/**
 * Created by Artem Godin on 5/14/2020.
 */
public class FormImageButton extends Input{
    public FormImageButton() {
        setType("image");
    }

    /**
     * Sets or retrieves a comma-separated list of content types.
     */
    @Override
    public String getAccept() {
        return super.getAccept();
    }

    /**
     * Sets or retrieves a text alternative to the graphic.
     */
    @Override
    public String getAlt() {
        return super.getAlt();
    }

    @Override
    public void setAlt(String alt) {
        super.setAlt(alt);
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

    /**
     * Sets or retrieves the height of the object.
     */
    @Override
    public double getHeight() {
        return super.getHeight();
    }

    @Override
    public void setHeight(double height) {
        super.setHeight(height);
    }

    /**
     * The address or URL of the a media resource that is to be considered.
     */
    @Override
    public String getSrc() {
        return super.getSrc();
    }

    @Override
    public void setSrc(String src) {
        super.setSrc(src);
    }

    /**
     * Sets or retrieves the width of the object.
     */
    @Override
    public double getWidth() {
        return super.getWidth();
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
    }
}
