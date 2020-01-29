package js.util.iterable;

import java.util.Iterator;


public class IntIteratorWrapper implements Iterator<Integer> {
    private final IntIterator wrappedIterator;

    private IntIteratorResult currentResult;

    IntIteratorWrapper(IntIterator wrappedIterator) {
        this.wrappedIterator = wrappedIterator;
        currentResult = wrappedIterator.doNext();
    }

    /**
     * Returns {@code true} if the iteration has more elements.
     * (In other words, returns {@code true} if {@link #next} would
     * return an element rather than throwing an exception.)
     *
     * @return {@code true} if the iteration has more elements
     */
    @Override
    public boolean hasNext() {
        return !currentResult.getDone();
    }

    /**
     * Returns the next element in the iteration.
     *
     * @return the next element in the iteration
     *
     * @throws NoSuchElementException if the iteration has no more elements
     */
    @Override
    public Integer next() {
        int currentValue = currentResult.getValue();
        currentResult = wrappedIterator.doNext();
        return currentValue;
    }
}
