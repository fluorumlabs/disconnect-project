package com.github.fluorumlabs.disconnect.polymer.utils;

import js.lang.Any;
import js.util.collections.Array;
import js.util.function.JsConsumer;
import js.web.dom.EventListener;
import js.web.dom.MouseEvent;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * Created by Artem Godin on 2/3/2020.
 */
public interface GestureInfo extends Any {
    @Nullable
    @JSProperty
    String getState();

    @JSProperty
    void setState(String state);

    @JSProperty
    boolean getStarted();

    @JSProperty
    void setStarted(boolean started);

    @JSProperty
    Array<Move> getMoves();

    @JSProperty
    void setMoves(Array<Move> moves);

    @JSProperty
    double getX();

    @JSProperty
    void setX(double x);

    @JSProperty
    double getY();

    @JSProperty
    void setY(double y);

    @JSProperty
    boolean getPrevent();

    @JSProperty
    void setPrevent(boolean prevent);

    @JSBody(params = "move", script = "this.addMove(move)")
    void addMove(Move move);

    @JSProperty
    JsConsumer<Move> getAddMove();

    @JSProperty
    void setAddMove(JsConsumer<Move> addMove);

    @JSProperty
    EventListener<MouseEvent> getMoveFn();

    @JSProperty
    void setMoveFn(EventListener<MouseEvent> movefn);

    @JSProperty
    EventListener<MouseEvent> getUpFn();

    @JSProperty
    void setUpFn(EventListener<MouseEvent> upFn);

    interface Move extends Any {
        @JSProperty
        double getX();

        @JSProperty
        void setX(double x);

        @JSProperty
        double getY();

        @JSProperty
        void setY(double y);
    }
}
