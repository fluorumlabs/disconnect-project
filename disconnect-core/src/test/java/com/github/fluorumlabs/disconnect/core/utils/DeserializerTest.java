package com.github.fluorumlabs.disconnect.core.utils;

import com.github.fluorumlabs.disconnect.core.toolchain.DisconnectTestRunner;
import js.lang.Any;
import js.util.JSON;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.io.Serializable;
import java.util.*;
import java.util.function.BiFunction;

/**
 * Created by Artem Godin on 6/12/2020.
 */
@RunWith(DisconnectTestRunner.class)
public class DeserializerTest {

    @Test
    public void deserialize() {
        verify((Integer)null,Integer.class, SerDes::deserialize);
        verify("Test",String.class, SerDes::deserialize);
        verify(new Primitives((byte)1,'a',3,(short)4,5,6,true,TestEnum.VALUE_A,"Test",new int[]{1,2,3}), Primitives.class, SerDes::deserialize);
    }

    @Test
    public void deserializeList() {
        verify((List<Integer>)null,Integer.class, SerDes::deserializeList);
        verify(Collections.<Integer>emptyList(),Integer.class, SerDes::deserializeList);
        verify(Collections.singletonList(1),Integer.class, SerDes::deserializeList);
        verify(Arrays.asList(1,2,3),Integer.class, SerDes::deserializeList);
    }

    @Test
    public void deserializeEnumSet() {
        verify((EnumSet<TestEnum>)null,TestEnum.class, SerDes::deserializeEnumSet);
        verify(EnumSet.noneOf(TestEnum.class),TestEnum.class, SerDes::deserializeEnumSet);
        verify(EnumSet.of(TestEnum.VALUE_A),TestEnum.class, SerDes::deserializeEnumSet);
        verify(EnumSet.allOf(TestEnum.class),TestEnum.class, SerDes::deserializeEnumSet);
    }

    @Test
    public void deserializeSet() {
        Set<Integer> testSet1 = new LinkedHashSet<>();
        testSet1.add(3);
        testSet1.add(2);
        testSet1.add(1);

        verify((Set<Integer>)null,Integer.class, SerDes::deserializeSet);
        verify(Collections.<Integer>emptySet(),Integer.class, SerDes::deserializeSet);
        verify(Collections.singleton(1),Integer.class, SerDes::deserializeSet);
    }

    @Test
    public void deserializeMap() {
        Map<String,Integer> testMap1 = new HashMap<>();
        Map<String,Integer> testMap2 = new HashMap<>();

        testMap1.put("a",5);
        testMap2.put("a",7);
        testMap2.put("b",9);

        verify((Map<String,Integer>)null,Integer.class, SerDes::deserializeMap);
        verify(Collections.<String,Integer>emptyMap(),Integer.class, SerDes::deserializeMap);
        verify(testMap1,Integer.class, SerDes::deserializeMap);
        verify(testMap2,Integer.class, SerDes::deserializeMap);
    }

    @Test
    public void deserializeBeanWithList() {
        verify(new BeanWithList(null),BeanWithList.class, SerDes::deserialize);
        verify(new BeanWithList(Arrays.asList("aaa","bbb","ccc")),BeanWithList.class, SerDes::deserialize);
    }

    @Test
    public void deserializeBeanWithMap() {
        Map<String,String> testMap = new HashMap<>();

        testMap.put("a","aaa");
        testMap.put("b","bbb");

        verify(new BeanWithMap(null),BeanWithMap.class, SerDes::deserialize);
        verify(new BeanWithMap(testMap),BeanWithMap.class, SerDes::deserialize);
    }

    private <T, R> void verify(R test, Class<T> type, BiFunction<Serialized<R>,Class<T>,R> deserializer) {
        Any serialized = SerDes.serialize(test);
        String serializedValue = JSON.stringify(serialized);
        Object deserialized = deserializer.apply(serialized.cast(), type);
        String deserializedValue = JSON.stringify(SerDes.serialize(deserialized));

        Assert.assertThat("Value was not properly deserialized", deserializedValue, Is.is(serializedValue));
    }

    private enum TestEnum {
        VALUE_A, VALUE_B;
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Primitives implements Serializable {
        private byte aByte;
        private char aChar;
        private int anInt;
        private short aShort;
        private float aFloat;
        private double aDouble;
        private boolean aBoolean;
        private TestEnum anEnum;
        private String aString;

        private int[] anIntArray;
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class BeanWithList implements Serializable {
        private List<String> values;
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class BeanWithMap implements Serializable{
        private Map<String, String> values;
    }

}