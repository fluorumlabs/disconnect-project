package com.github.fluorumlabs.disconnect.polymer.types;

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
	/**
	 * Gets state.
	 *
	 * @return the state
	 */
	@Nullable
	@JSProperty
	String getState();

	/**
	 * Sets state.
	 *
	 * @param state the state
	 */
	@JSProperty
	void setState(String state);

	/**
	 * Gets started.
	 *
	 * @return the started
	 */
	@JSProperty
	boolean getStarted();

	/**
	 * Sets started.
	 *
	 * @param started the started
	 */
	@JSProperty
	void setStarted(boolean started);

	/**
	 * Gets moves.
	 *
	 * @return the moves
	 */
	@JSProperty
	Array<Move> getMoves();

	/**
	 * Sets moves.
	 *
	 * @param moves the moves
	 */
	@JSProperty
	void setMoves(Array<Move> moves);

	/**
	 * Gets x.
	 *
	 * @return the x
	 */
	@JSProperty
	double getX();

	/**
	 * Sets x.
	 *
	 * @param x the x
	 */
	@JSProperty
	void setX(double x);

	/**
	 * Gets y.
	 *
	 * @return the y
	 */
	@JSProperty
	double getY();

	/**
	 * Sets y.
	 *
	 * @param y the y
	 */
	@JSProperty
	void setY(double y);

	/**
	 * Gets prevent.
	 *
	 * @return the prevent
	 */
	@JSProperty
	boolean getPrevent();

	/**
	 * Sets prevent.
	 *
	 * @param prevent the prevent
	 */
	@JSProperty
	void setPrevent(boolean prevent);

	/**
	 * Add move.
	 *
	 * @param move the move
	 */
	@JSBody(params = "move", script = "this.addMove(move)")
	void addMove(Move move);

	/**
	 * Gets add move.
	 *
	 * @return the add move
	 */
	@JSProperty
	JsConsumer<Move> getAddMove();

	/**
	 * Sets add move.
	 *
	 * @param addMove the add move
	 */
	@JSProperty
	void setAddMove(JsConsumer<Move> addMove);

	/**
	 * Gets move fn.
	 *
	 * @return the move fn
	 */
	@JSProperty
	EventListener<MouseEvent> getMoveFn();

	/**
	 * Sets move fn.
	 *
	 * @param movefn the movefn
	 */
	@JSProperty
	void setMoveFn(EventListener<MouseEvent> movefn);

	/**
	 * Gets up fn.
	 *
	 * @return the up fn
	 */
	@JSProperty
	EventListener<MouseEvent> getUpFn();

	/**
	 * Sets up fn.
	 *
	 * @param upFn the up fn
	 */
	@JSProperty
	void setUpFn(EventListener<MouseEvent> upFn);

	/**
	 * The interface Move.
	 */
	interface Move extends Any {
		/**
		 * Gets x.
		 *
		 * @return the x
		 */
		@JSProperty
		double getX();

		/**
		 * Sets x.
		 *
		 * @param x the x
		 */
		@JSProperty
		void setX(double x);

		/**
		 * Gets y.
		 *
		 * @return the y
		 */
		@JSProperty
		double getY();

		/**
		 * Sets y.
		 *
		 * @param y the y
		 */
		@JSProperty
		void setY(double y);
	}
}
