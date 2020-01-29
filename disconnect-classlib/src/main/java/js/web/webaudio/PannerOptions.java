package js.web.webaudio;


import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;


public interface PannerOptions extends AudioNodeOptions {
    @JSProperty
    double getConeInnerAngle();

    @JSProperty
    void setConeInnerAngle(double coneInnerAngle);

    @JSProperty
    double getConeOuterAngle();

    @JSProperty
    void setConeOuterAngle(double coneOuterAngle);

    @JSProperty
    double getConeOuterGain();

    @JSProperty
    void setConeOuterGain(double coneOuterGain);

    @JSProperty
    @Nullable
    DistanceModelType getDistanceModel();

    @JSProperty
    void setDistanceModel(DistanceModelType distanceModel);

    @JSProperty
    double getMaxDistance();

    @JSProperty
    void setMaxDistance(double maxDistance);

    @JSProperty
    double getOrientationX();

    @JSProperty
    void setOrientationX(double orientationX);

    @JSProperty
    double getOrientationY();

    @JSProperty
    void setOrientationY(double orientationY);

    @JSProperty
    double getOrientationZ();

    @JSProperty
    void setOrientationZ(double orientationZ);

    @JSProperty
    @Nullable
    PanningModelType getPanningModel();

    @JSProperty
    void setPanningModel(PanningModelType panningModel);

    @JSProperty
    double getPositionX();

    @JSProperty
    void setPositionX(double positionX);

    @JSProperty
    double getPositionY();

    @JSProperty
    void setPositionY(double positionY);

    @JSProperty
    double getPositionZ();

    @JSProperty
    void setPositionZ(double positionZ);

    @JSProperty
    double getRefDistance();

    @JSProperty
    void setRefDistance(double refDistance);

    @JSProperty
    double getRolloffFactor();

    @JSProperty
    void setRolloffFactor(double rolloffFactor);

}
