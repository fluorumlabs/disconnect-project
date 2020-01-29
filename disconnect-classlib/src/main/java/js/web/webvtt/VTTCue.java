package js.web.webvtt;

import js.lang.Unknown;
import js.web.dom.TextTrackCue;
import js.web.mediastreams.AlignSetting;
import js.web.mediastreams.DirectionSetting;
import js.web.dom.DocumentFragment;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;


public interface VTTCue extends TextTrackCue {
        @JSProperty
        AlignSetting getAlign();

        @JSProperty
        void setAlign(AlignSetting align);

        @JSProperty
        Unknown getLine();

        @JSProperty
        void setLine(int line);
        @JSProperty
        void setLine(AutoKeyword line);

        @JSProperty
        LineAlignSetting getLineAlign();

        @JSProperty
        void setLineAlign(LineAlignSetting lineAlign);

        @JSProperty
        Unknown getPosition();

        @JSProperty
        void setPosition(int position);
        @JSProperty
        void setPosition(AutoKeyword position);

        @JSProperty
        PositionAlignSetting getPositionAlign();

        @JSProperty
        void setPositionAlign(PositionAlignSetting positionAlign);

        @JSProperty
        @Nullable
        VTTRegion getRegion();

        @JSProperty
        void setRegion(VTTRegion region);

        @JSProperty
        double getSize();

        @JSProperty
        void setSize(double size);

        @JSProperty
        boolean isSnapToLines();

        @JSProperty
        void setSnapToLines(boolean snapToLines);

        @JSProperty
        String getText();

        @JSProperty
        void setText(String text);

        @JSProperty
        DirectionSetting getVertical();

        @JSProperty
        void setVertical(DirectionSetting vertical);

        DocumentFragment getCueAsHTML();

        @JSBody(script = "return VTTCue.prototype")
        static VTTCue prototype() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(params={"startTime","endTime","text"}, script = "return new VTTCue(startTime, endTime, text)")
        static VTTCue create(double startTime, double endTime, String text) {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        }
