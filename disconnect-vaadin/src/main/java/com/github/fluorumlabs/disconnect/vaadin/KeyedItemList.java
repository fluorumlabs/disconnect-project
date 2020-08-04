package com.github.fluorumlabs.disconnect.vaadin;

import com.github.fluorumlabs.disconnect.core.utils.SidebandReference;

import java.io.Serializable;
import java.util.*;
import java.util.function.Function;

/**
 * Created by Artem Godin on 7/7/2020.
 */
public class KeyedItemList<T extends Serializable> extends AbstractList<T> implements RandomAccess {
    private final SidebandReference<String> key = new SidebandReference<>();
    private final Map<String, T> reverseLookup = new HashMap<>();
    private final List<T> itemList = new ArrayList<>();
    private final Function<T,String> keyExtractor;

    public KeyedItemList(Function<T, String> keyExtractor) {
        this.keyExtractor = keyExtractor;
    }

    public KeyedItemList(Function<T, String> keyExtractor, Collection<T> collection) {
        this.keyExtractor = keyExtractor;
        addAll(collection);
    }

    public KeyedItemList(Function<T, String> keyExtractor, T... collection) {
        this(keyExtractor, Arrays.asList(collection));
    }

    public KeyedItemList() {
        this(Objects::toString);
    }

    public KeyedItemList(Collection<T> collection) {
        this(Objects::toString, collection);
    }

    public KeyedItemList(T... collection) {
        this(Objects::toString, collection);
    }

    public String extractKey(T value) {
        return keyExtractor.apply(value);
    }

    public String getKey(T value) {
        String keyValue = key.retrieveObject(value);
        if (keyValue == null) {
            keyValue = extractKey(value);
            key.storeObject(value, keyValue);
        }
        return keyValue;
    }

    public T getItem(String key) {
        return reverseLookup.get(key);
    }

    @Override
    public T get(int index) {
        return itemList.get(index);
    }

    @Override
    public int size() {
        return itemList.size();
    }

    @Override
    public boolean add(T t) {
        reverseLookup.put(getKey(t), t);
        return itemList.add(t);
    }

    @Override
    public T set(int index, T element) {
        if (itemList.get(index) != null) {
            reverseLookup.remove(getKey(itemList.get(index)));
        }
        reverseLookup.put(getKey(element), element);
        return itemList.set(index, element);
    }

    @Override
    public void add(int index, T element) {
        reverseLookup.put(getKey(element), element);
        itemList.add(index, element);
    }

    @Override
    public T remove(int index) {
        if (itemList.get(index) != null) {
            reverseLookup.remove(getKey(itemList.get(index)));
        }
        return itemList.remove(index);
    }

    @Override
    public void clear() {
        reverseLookup.clear();
        itemList.clear();
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        for (T element : c) {
            reverseLookup.put(getKey(element), element);
        }
        return itemList.addAll(index, c);
    }

    @Override
    public boolean remove(Object o) {
        reverseLookup.remove(getKey((T)o));
        return itemList.remove(o);
    }
}
