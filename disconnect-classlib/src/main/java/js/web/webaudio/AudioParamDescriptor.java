package js.web.webaudio;

import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;import js.lang.Any;


public interface AudioParamDescriptor extends Any {
    @JSProperty
    @Nullable
    AutomationRate getAutomationRate();

    @JSProperty
    void setAutomationRate(AutomationRate automationRate);

    @JSProperty
    double getDefaultValue();

    @JSProperty
    void setDefaultValue(double defaultValue);

    @JSProperty
    double getMaxValue();

    @JSProperty
    void setMaxValue(double maxValue);

    @JSProperty
    double getMinValue();

    @JSProperty
    void setMinValue(double minValue);

    @JSProperty
    String getName();

    @JSProperty
    void setName(String name);

}
