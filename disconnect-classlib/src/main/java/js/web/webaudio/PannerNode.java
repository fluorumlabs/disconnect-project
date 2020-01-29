package js.web.webaudio;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/** A PannerNode always has exactly one input and one the input can be mono or stereo but the output is always stereo  output(2 channels); you can't have panning effects without at least two audio channels! */
        public interface PannerNode extends AudioNode {
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
        DistanceModelType getDistanceModel();

        @JSProperty
        void setDistanceModel(DistanceModelType distanceModel);

        @JSProperty
        double getMaxDistance();

        @JSProperty
        void setMaxDistance(double maxDistance);

        @JSProperty
        AudioParam getOrientationX();

        @JSProperty
        AudioParam getOrientationY();

        @JSProperty
        AudioParam getOrientationZ();

        @JSProperty
        PanningModelType getPanningModel();

        @JSProperty
        void setPanningModel(PanningModelType panningModel);

        @JSProperty
        AudioParam getPositionX();

        @JSProperty
        AudioParam getPositionY();

        @JSProperty
        AudioParam getPositionZ();

        @JSProperty
        double getRefDistance();

        @JSProperty
        void setRefDistance(double refDistance);

        @JSProperty
        double getRolloffFactor();

        @JSProperty
        void setRolloffFactor(double rolloffFactor);

        @Deprecated
        void setOrientation(double x, double y, double z);
        @Deprecated
        void setPosition(double x, double y, double z);

        @JSBody(script = "return PannerNode.prototype")
        static PannerNode prototype() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(params={"context","options"}, script = "return new PannerNode(context, options)")
        static PannerNode create(BaseAudioContext context, PannerOptions options) {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(params="context", script = "return new PannerNode(context)")
        static PannerNode create(BaseAudioContext context) {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        }
