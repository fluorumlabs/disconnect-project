package com.github.fluorumlabs.disconnect.core.components.html.form;

import com.github.fluorumlabs.disconnect.core.components.HtmlComponent;

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
    public HtmlComponent.Autocomplete getAutocomplete() {
        return super.getAutocomplete();
    }

    @Override
    public void setAutocomplete(HtmlComponent.Autocomplete autocomplete) {
        super.setAutocomplete(autocomplete);
    }
}
