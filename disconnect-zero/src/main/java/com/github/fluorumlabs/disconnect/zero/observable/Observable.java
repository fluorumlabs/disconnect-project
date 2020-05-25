package com.github.fluorumlabs.disconnect.zero.observable;

import com.github.fluorumlabs.disconnect.zero.Application;

import java.util.function.*;


public class Observable<VALUE> extends ObservableBase<VALUE> implements ReadableObservable<VALUE> {
	Observable() {
	}

	public static <VALUE> Observable<VALUE> of(VALUE value) {
		Observable<VALUE> observable = new Observable<>();
		observable.setCurrentValue(value);
		return observable;
	}

	public static <VALUE> Observable<VALUE> from(Supplier<VALUE> supplier) {
		Observable<VALUE> observable = new Observable<>();
		observable.setCurrentValue(supplier.get());
		return observable;
	}

	public static <VALUE> Observable<VALUE> fromAsync(Supplier<VALUE> supplier) {
		Observable<VALUE> observable = new Observable<>();
		observable.setCurrentValue(null);

		new Thread(() -> observable.pushNewValue(supplier.get())).start();

		return observable;
	}

	public static <VALUE_A, VALUE_B> BiObservable<VALUE_A, VALUE_B> join(Observable<VALUE_A> left,
																		 Observable<VALUE_B> right) {
		BiObservable.Guarded<VALUE_A, VALUE_B> observable = new BiObservable.Guarded<>();
		left.accept(observable::pushLeftValue);
		right.accept(observable::pushRightValue);
		return observable;
	}

	public static <VALUE_A, VALUE_B, VALUE_C> TriObservable<VALUE_A, VALUE_B, VALUE_C> join(Observable<VALUE_A> a,
																							Observable<VALUE_B> b,
																							Observable<VALUE_C> c) {
		TriObservable.Guarded<VALUE_A, VALUE_B, VALUE_C> observable = new TriObservable.Guarded<>();
		a.accept(observable::pushValueA);
		b.accept(observable::pushValueB);
		c.accept(observable::pushValueC);
		return observable;
	}

	public static <VALUE_A, VALUE_B, VALUE_C> TriObservable<VALUE_A, VALUE_B, VALUE_C> join(Observable<VALUE_A> a,
																							BiObservable<VALUE_B,
																									VALUE_C> b) {
		TriObservable.Guarded<VALUE_A, VALUE_B, VALUE_C> observable = new TriObservable.Guarded<>();
		a.accept(observable::pushValueA);
		b.accept((bb, cc) -> {
			observable.pushValueB(bb);
			observable.pushValueC(cc);
		});
		return observable;
	}

	public static <VALUE_A, VALUE_B, VALUE_C> TriObservable<VALUE_A, VALUE_B, VALUE_C> join(BiObservable<VALUE_A,
			VALUE_B> a,
																							Observable<VALUE_C> c) {
		TriObservable.Guarded<VALUE_A, VALUE_B, VALUE_C> observable = new TriObservable.Guarded<>();
		a.accept((aa, bb) -> {
			observable.pushValueA(aa);
			observable.pushValueB(bb);
		});
		c.accept(observable::pushValueC);
		return observable;
	}

	public <NEW_VALUE> Observable<NEW_VALUE> map(Function<VALUE, NEW_VALUE> mapper) {
		Observable<NEW_VALUE> observable = new Observable<>();
		acceptImpl(value -> observable.pushNewValue(mapper.apply(value)));
		return observable;
	}

	public <NEW_VALUE> Observable<NEW_VALUE> mapAsync(Function<VALUE, NEW_VALUE> mapper) {
		Observable<NEW_VALUE> observable = new Observable<>();
		acceptImpl(value -> new Thread(() -> observable.pushNewValue(mapper.apply(value))).start());
		return observable;
	}

	public <NEW_VALUE, VALUE_B> Observable<NEW_VALUE> map(BiFunction<VALUE, VALUE_B, NEW_VALUE> mapper,
														  Observable<VALUE_B> valueB) {
		return join(this, valueB).apply(mapper);
	}

	public <NEW_VALUE, VALUE_B> Observable<NEW_VALUE> mapAsync(BiFunction<VALUE, VALUE_B, NEW_VALUE> mapper,
															   Observable<VALUE_B> valueB) {
		return join(this, valueB).applyAsync(mapper);
	}

	public <NEW_VALUE, VALUE_B, VALUE_C> Observable<NEW_VALUE> map(TriFunction<VALUE, VALUE_B, VALUE_C, NEW_VALUE> mapper,
																   Observable<VALUE_B> valueB,
																   Observable<VALUE_C> valueC) {
		return join(this, valueB, valueC).apply(mapper);
	}

	public <NEW_VALUE, VALUE_B, VALUE_C> Observable<NEW_VALUE> mapAsync(TriFunction<VALUE, VALUE_B, VALUE_C,
			NEW_VALUE> mapper,
																		Observable<VALUE_B> valueB,
																		Observable<VALUE_C> valueC) {
		return join(this, valueB, valueC).applyAsync(mapper);
	}

	public <NEW_VALUE, VALUE_B, VALUE_C> Observable<NEW_VALUE> map(TriFunction<VALUE, VALUE_B, VALUE_C, NEW_VALUE> mapper,
																   BiObservable<VALUE_B, VALUE_C> valueBC) {
		return join(this, valueBC).apply(mapper);
	}

	public <NEW_VALUE, VALUE_B, VALUE_C> Observable<NEW_VALUE> mapAsync(TriFunction<VALUE, VALUE_B, VALUE_C,
			NEW_VALUE> mapper,
																		BiObservable<VALUE_B, VALUE_C> valueBC) {
		return join(this, valueBC).applyAsync(mapper);
	}

	public Observable<VALUE> nonNull() {
		Observable<VALUE> observable = new Observable<>();
		acceptImpl(value -> {
			if (value != null) {
				observable.pushNewValue(value);
			}
		});
		return observable;
	}

	public Observable<VALUE> filter(Predicate<VALUE> predicate) {
		Observable<VALUE> observable = new Observable<>();
		acceptImpl(value -> {
			if (predicate.test(value)) {
				observable.pushNewValue(value);
			}
		});
		return observable;
	}

	public Observable<VALUE> filterAsync(Predicate<VALUE> predicate) {
		Observable<VALUE> observable = new Observable<>();
		acceptImpl(value -> new Thread(() -> {
			if (predicate.test(value)) {
				observable.pushNewValue(value);
			}
		}).start());
		return observable;
	}

	public <VALUE_B> Observable<VALUE> filter(BiPredicate<VALUE, VALUE_B> predicate, Observable<VALUE_B> other) {
		Observable<VALUE> observable = new Observable<>();
		join(this, other).filter(predicate).acceptImpl(value -> observable.pushNewValue(value.getValueA()));
		return observable;
	}

	public <VALUE_B> Observable<VALUE> filterAsync(BiPredicate<VALUE, VALUE_B> predicate, Observable<VALUE_B> other) {
		Observable<VALUE> observable = new Observable<>();
		join(this, other).filterAsync(predicate).acceptImpl(value -> observable.pushNewValue(value.getValueA()));
		return observable;
	}

	public <VALUE_B, VALUE_C> Observable<VALUE> filter(TriPredicate<VALUE, VALUE_B, VALUE_C> predicate,
													   Observable<VALUE_B> other1,
													   Observable<VALUE_C> other2) {
		Observable<VALUE> observable = new Observable<>();
		join(this, other1, other2).filter(predicate).acceptImpl((Triplet<VALUE, VALUE_B, VALUE_C> value) -> observable.pushNewValue(value.getValueA()));
		return observable;
	}

	public <VALUE_B, VALUE_C> Observable<VALUE> filterAsync(TriPredicate<VALUE, VALUE_B, VALUE_C> predicate,
															Observable<VALUE_B> other1,
															Observable<VALUE_C> other2) {
		Observable<VALUE> observable = new Observable<>();
		join(this, other1, other2).filterAsync(predicate).acceptImpl((Triplet<VALUE, VALUE_B, VALUE_C> value) -> observable.pushNewValue(value.getValueA()));
		return observable;
	}

	public <VALUE_B, VALUE_C> Observable<VALUE> filter(TriPredicate<VALUE, VALUE_B, VALUE_C> predicate,
													   BiObservable<VALUE_B, VALUE_C> other) {
		Observable<VALUE> observable = new Observable<>();
		join(this, other).filter(predicate).acceptImpl((Triplet<VALUE, VALUE_B, VALUE_C> value) -> observable.pushNewValue(value.getValueA()));
		return observable;
	}

	public <VALUE_B, VALUE_C> Observable<VALUE> filterAsync(TriPredicate<VALUE, VALUE_B, VALUE_C> predicate,
															BiObservable<VALUE_B, VALUE_C> other) {
		Observable<VALUE> observable = new Observable<>();
		join(this, other).filterAsync(predicate).acceptImpl((Triplet<VALUE, VALUE_B, VALUE_C> value) -> observable.pushNewValue(value.getValueA()));
		return observable;
	}


	public Forked<VALUE> when(Predicate<VALUE> predicate) {
		Forked<VALUE> forkedObserver = new Forked<>();
		acceptImpl(value -> forkedObserver.pushNewValue(Pair.of(value, predicate.test(value))));
		return forkedObserver;
	}

	public Forked<VALUE> whenAsync(Predicate<VALUE> predicate) {
		Forked<VALUE> forkedObserver = new Forked<>();
		acceptImpl(value -> new Thread(() -> forkedObserver.pushNewValue(Pair.of(value, predicate.test(value)))).start());
		return forkedObserver;
	}

	public Observable<VALUE> on(SimpleObservableEvent event) {
		Delayed<VALUE> observable = new Delayed<>();
		acceptImpl(observable::setPendingValue);
		event.accept(observable::acceptPendingValue);
		return observable;
	}

	public Observable<VALUE> debounce(int milliseconds) {
		Observable<VALUE> observable = new Observable<>();
		acceptImpl(value -> Application.debounce(observable, () -> observable.pushNewValue(value), milliseconds));
		return observable;
	}

	public Observable<VALUE> accept(Consumer<VALUE> consumer) {
		acceptImpl(consumer);
		return this;
	}

	public Observable<VALUE> acceptAsync(Consumer<VALUE> consumer) {
		acceptImpl(value -> new Thread(() -> consumer.accept(value)).start());
		return this;
	}

	public Observable<VALUE> accept(Runnable runnable) {
		acceptImpl(v -> runnable.run());
		return this;
	}

	public Observable<VALUE> acceptAsync(Runnable runnable) {
		acceptImpl(value -> new Thread(runnable).start());
		return this;
	}

	public VALUE get() {
		return getCurrentValue();
	}

	public static class Delayed<VALUE> extends Observable<VALUE> {
		private VALUE pendingValue;

		private boolean hasPendingValue = false;

		void setPendingValue(VALUE value) {
			pendingValue = value;
			hasPendingValue = true;
		}

		void acceptPendingValue() {
			if (hasPendingValue) {
				hasPendingValue = false;
				pushNewValue(pendingValue);
				setCurrentValue(null);
			}
		}

		@Override
		boolean equalFunction(VALUE a, VALUE b) {
			return false;
		}
	}

	public static class Forked<VALUE> extends ObservableBase<Pair<VALUE, Boolean>> {
		public Observable<VALUE> then() {
			Observable<VALUE> observable = new Observable<>();
			acceptImpl(valueBooleanPair -> {
				if (valueBooleanPair.getValueB()) {
					observable.pushNewValue(valueBooleanPair.getValueA());
				}
			});
			return observable;
		}

		public Observable.Forked<VALUE> then(Consumer<VALUE> consumer) {
			acceptImpl(valueBooleanPair -> {
				if (valueBooleanPair.getValueB()) {
					consumer.accept(valueBooleanPair.getValueA());
				}
			});
			return this;
		}

		public Observable.Forked<VALUE> thenAsync(Consumer<VALUE> consumer) {
			acceptImpl(valueBooleanPair -> {
				if (valueBooleanPair.getValueB()) {
					new Thread(() -> consumer.accept(valueBooleanPair.getValueA())).start();
				}
			});
			return this;
		}

		public Observable.Forked<VALUE> then(Runnable runnable) {
			acceptImpl(valueBooleanPair -> {
				if (valueBooleanPair.getValueB()) {
					runnable.run();
				}
			});
			return this;
		}

		public Observable.Forked<VALUE> thenAsync(Runnable runnable) {
			acceptImpl(valueBooleanPair -> {
				if (valueBooleanPair.getValueB()) {
					new Thread(runnable).start();
				}
			});
			return this;
		}

		public Observable<VALUE> orElse() {
			Observable<VALUE> observable = new Observable<>();
			acceptImpl(valueBooleanPair -> {
				if (!valueBooleanPair.getValueB()) {
					observable.pushNewValue(valueBooleanPair.getValueA());
				}
			});
			return observable;
		}

		public Observable.Forked<VALUE> orElse(Consumer<VALUE> consumer) {
			acceptImpl(valueBooleanPair -> {
				if (!valueBooleanPair.getValueB()) {
					consumer.accept(valueBooleanPair.getValueA());
				}
			});
			return this;
		}

		public Observable.Forked<VALUE> orElseAsync(Consumer<VALUE> consumer) {
			acceptImpl(valueBooleanPair -> {
				if (!valueBooleanPair.getValueB()) {
					new Thread(() -> consumer.accept(valueBooleanPair.getValueA())).start();
				}
			});
			return this;
		}

		public Observable.Forked<VALUE> orElse(Runnable runnable) {
			acceptImpl(valueBooleanPair -> {
				if (!valueBooleanPair.getValueB()) {
					runnable.run();
				}
			});
			return this;
		}

		public Observable.Forked<VALUE> orElseAsync(Runnable runnable) {
			acceptImpl(valueBooleanPair -> {
				if (!valueBooleanPair.getValueB()) {
					new Thread(runnable).start();
				}
			});
			return this;
		}

		@Override
		boolean equalFunction(Pair<VALUE, Boolean> a, Pair<VALUE, Boolean> b) {
			return false;
		}
	}
}
