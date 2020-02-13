package com.github.fluorumlabs.disconnect.core;

import org.teavm.interop.Async;
import org.teavm.interop.AsyncCallback;

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

/**
 * Created by Artem Godin on 2/12/2020.
 */
public class AsyncSpliterator<T> implements Spliterator<T> {
	public AsyncSpliterator() {
	}

	private AsyncCallback<T> callback = null;
	private boolean empty = false;
	private List<T> queue = null;
	private RuntimeException exception = null;

	public void push(T value) {
		if (callback != null) {
			callback.complete(value);
		} else {
			if (queue == null) {
				queue = new ArrayList<>();
			}
			queue.add(value);
		}
	}

	public void complete() {
		if (callback != null) {
			callback.error(new NoMoreElements());
		}
		empty = true;
	}

	public void completeExceptionally(RuntimeException e) {
		if (callback != null) {
			callback.error(e);
		}
		empty = true;
		exception = e;
	}

	@Override
	public Spliterator<T> trySplit() {
		return null;
	}

	@Override
	public long estimateSize() {
		return Long.MAX_VALUE;
	}

	@Override
	public int characteristics() {
		return IMMUTABLE;
	}

	@Override
	public boolean tryAdvance(Consumer<? super T> action) {
		if (queue != null) {
			queue.forEach(action);
			queue = null;
		}
		if (exception != null) {
			throw exception;
		}
		if (empty) {
			return false;
		}
		try {
			action.accept(getNextValue(this));
			return true;
		} catch (NoMoreElements e) {
			return false;
		}
	}

	@Async
	private static native <T> T getNextValue(AsyncSpliterator<T> spliterator);

	private static <T> void getNextValue(AsyncSpliterator<T> spliterator, AsyncCallback<T> callback) {
		spliterator.callback = callback;
	}

	static class NoMoreElements extends RuntimeException {
	}
}
