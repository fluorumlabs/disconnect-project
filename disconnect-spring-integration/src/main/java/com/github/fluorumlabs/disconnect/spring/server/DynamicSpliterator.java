package com.github.fluorumlabs.disconnect.spring.server;

import java.util.Spliterator;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;

/**
 * Created by Artem Godin on 2/12/2020.
 */
public class DynamicSpliterator<T> implements Spliterator<T> {
	private final static CompletionMarker COMPLETION_MARKER = new CompletionMarker();

	public DynamicSpliterator() {
	}

	private LinkedBlockingQueue<Object> queue = new LinkedBlockingQueue<>();

	public void push(T value) {
		queue.add(value);
	}

	public void complete() {
		queue.add(COMPLETION_MARKER);
	}

	public void completeExceptionally(RuntimeException e) {
		queue.add(e);
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
		try {
			do {
				Object polledObject = queue.poll(15, TimeUnit.SECONDS);
				if (polledObject == COMPLETION_MARKER) {
					return false;
				}
				if (polledObject instanceof RuntimeException) {
					throw (RuntimeException) polledObject;
				}
				if (polledObject != null) {
					action.accept((T) polledObject);
					return true;
				}
			} while (true);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();  // set interrupt flag
			// go away
		}
		return false;
	}

	static class CompletionMarker {
	}
}
