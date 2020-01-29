package js.web.webgl;

import js.util.iterable.IntIterable;
import org.teavm.jso.JSProperty;

import js.lang.Any;
import org.teavm.jso.JSByRef;


public interface WEBGL_draw_buffers extends Any {
        void drawBuffersWEBGL(@JSByRef int... buffers);
        void drawBuffersWEBGL(IntIterable buffers);
        @JSProperty
        int getCOLOR_ATTACHMENT0_WEBGL();

        @JSProperty
        int getCOLOR_ATTACHMENT10_WEBGL();

        @JSProperty
        int getCOLOR_ATTACHMENT11_WEBGL();

        @JSProperty
        int getCOLOR_ATTACHMENT12_WEBGL();

        @JSProperty
        int getCOLOR_ATTACHMENT13_WEBGL();

        @JSProperty
        int getCOLOR_ATTACHMENT14_WEBGL();

        @JSProperty
        int getCOLOR_ATTACHMENT15_WEBGL();

        @JSProperty
        int getCOLOR_ATTACHMENT1_WEBGL();

        @JSProperty
        int getCOLOR_ATTACHMENT2_WEBGL();

        @JSProperty
        int getCOLOR_ATTACHMENT3_WEBGL();

        @JSProperty
        int getCOLOR_ATTACHMENT4_WEBGL();

        @JSProperty
        int getCOLOR_ATTACHMENT5_WEBGL();

        @JSProperty
        int getCOLOR_ATTACHMENT6_WEBGL();

        @JSProperty
        int getCOLOR_ATTACHMENT7_WEBGL();

        @JSProperty
        int getCOLOR_ATTACHMENT8_WEBGL();

        @JSProperty
        int getCOLOR_ATTACHMENT9_WEBGL();

        @JSProperty
        int getDRAW_BUFFER0_WEBGL();

        @JSProperty
        int getDRAW_BUFFER10_WEBGL();

        @JSProperty
        int getDRAW_BUFFER11_WEBGL();

        @JSProperty
        int getDRAW_BUFFER12_WEBGL();

        @JSProperty
        int getDRAW_BUFFER13_WEBGL();

        @JSProperty
        int getDRAW_BUFFER14_WEBGL();

        @JSProperty
        int getDRAW_BUFFER15_WEBGL();

        @JSProperty
        int getDRAW_BUFFER1_WEBGL();

        @JSProperty
        int getDRAW_BUFFER2_WEBGL();

        @JSProperty
        int getDRAW_BUFFER3_WEBGL();

        @JSProperty
        int getDRAW_BUFFER4_WEBGL();

        @JSProperty
        int getDRAW_BUFFER5_WEBGL();

        @JSProperty
        int getDRAW_BUFFER6_WEBGL();

        @JSProperty
        int getDRAW_BUFFER7_WEBGL();

        @JSProperty
        int getDRAW_BUFFER8_WEBGL();

        @JSProperty
        int getDRAW_BUFFER9_WEBGL();

        @JSProperty
        int getMAX_COLOR_ATTACHMENTS_WEBGL();

        @JSProperty
        int getMAX_DRAW_BUFFERS_WEBGL();

        }
