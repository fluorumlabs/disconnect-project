package com.github.fluorumlabs.disconnect.core.components.html.form;

import js.web.dom.Autocomplete;

/**
 * Created by Artem Godin on 5/14/2020.
 */
public class HiddenValue extends Input{
    public HiddenValue() {
        setType("hidden");
    }

    /**
     * Specifies whether autocomplete is applied to an editable text field.
     */
    @Override
    public Autocomplete getAutocomplete() {
        return super.getAutocomplete();
    }

    @Override
    public void setAutocomplete(Autocomplete autocomplete) {
        super.setAutocomplete(autocomplete);
    }
}
