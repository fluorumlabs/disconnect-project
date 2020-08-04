package com.github.fluorumlabs.disconnect.core.utils;

import com.github.fluorumlabs.disconnect.core.toolchain.DisconnectTestRunner;
import js.lang.Any;
import js.util.JSON;
import org.junit.Assert;
import org.junit.runner.RunWith;

import java.io.Serializable;
import java.util.*;

import static org.hamcrest.core.Is.is;

/**
 * Created by Artem Godin on 6/11/2020.
 */
@RunWith(DisconnectTestRunner.class)
public class SerializerTest {

    public void testStringSerialize() {
        verify(
                Pair.of(null, "null"),
                Pair.of("", "\"\""),
                Pair.of("\0", "\"\\u0000\""),
                Pair.of("Test", "\"Test\"")
                );
    }

    public void testBooleanSerialize() {
        verify(
                Pair.of(null, "null"),
                Pair.of(false, "false"),
                Pair.of(true, "true")
        );
    }

    public void testIntegerSerialize() {
        verify(
                Pair.of(null, "null"),
                Pair.of(0, "0"),
                Pair.of(Integer.MAX_VALUE, "2147483647"),
                Pair.of(Integer.MIN_VALUE, "-2147483648")
        );
    }

    public void testArraySerialize() {
        verify(
                Pair.of(null, "null"),
                Pair.of(new Integer[]{}, "[]"),
                Pair.of(new Integer[]{1}, "[1]"),
                Pair.of(new Integer[]{1,null,3}, "[1,null,3]")
        );
    }

    public void testDoubleSerialize() {
        verify(
                Pair.of(null, "null"),
                Pair.of(0.0, "0"),
                Pair.of(Double.MAX_VALUE, "1.7976931348623157e+308"),
                Pair.of(Double.MIN_VALUE, "5e-324")
        );
    }

    public void testDateSerialize() {
        verify(
                Pair.of(null, "null"),
                Pair.of(new Date(0), "0"),
                Pair.of(new Date(17000000), "17000000")
        );
    }

    public void testObjectSerialize() {
        verify(
                Pair.of(null, "null"),
                Pair.of(Value.of(null), "{\"value\":null}"),
                Pair.of(Value.of("Test"), "{\"value\":\"Test\"}")
        );
    }

    public void testEnumSerialize() {
        verify(
                Pair.of(null, "null"),
                Pair.of(Value.of(TestEnum.VALUE_A), "{\"value\":\"VALUE_A\"}"),
                Pair.of(Value.of(TestEnum.VALUE_B), "{\"value\":\"VALUE_B\"}")
        );
    }

    public void testOptionalSerialize() {
        verify(
                Pair.of(null, "null"),
                Pair.of(Value.of(null), "{\"value\":null}"),
                Pair.of(Value.of(Optional.empty()), "{\"value\":null}"),
                Pair.of(Value.of(Optional.of("Test")), "{\"value\":\"Test\"}")
        );
    }

    public void testCollectionSerialize() {
        verify(
                Pair.of(null, "null"),
                Pair.of(Value.of(null), "{\"value\":null}"),
                Pair.of(Value.of(Collections.emptyList()), "{\"value\":[]}"),
                Pair.of(Value.of(Collections.emptySet()), "{\"value\":[]}"),
                Pair.of(Value.of(Collections.singletonList(1)), "{\"value\":[1]}"),
                Pair.of(Value.of(Arrays.asList(1,2,3)), "{\"value\":[1,2,3]}"),
                Pair.of(Value.of(new LinkedHashSet(Arrays.asList(1,2,3))), "{\"value\":[1,2,3]}"),
                Pair.of(Value.of(EnumSet.allOf(TestEnum.class)), "{\"value\":[\"VALUE_A\",\"VALUE_B\"]}")
        );
    }

    public void testMapSerialize() {
        Map<String,Integer> simpleMap = new HashMap<>();
        Map<String,Object> complexMap = new HashMap<>();
        simpleMap.put("a",1);

        complexMap.put("a",1);
        complexMap.put("b",simpleMap);

        verify(
                Pair.of(null, "null"),
                Pair.of(Value.of(null), "{\"value\":null}"),
                Pair.of(Value.of(Collections.emptyMap()), "{\"value\":{}}"),
                Pair.of(Value.of(simpleMap), "{\"value\":{\"a\":1}}"),
                Pair.of(Value.of(complexMap), "{\"value\":{\"a\":1,\"b\":{\"a\":1}}}")
        );
    }

    public void testBeanWithPrimitives() {
        BeanWithPrimitive value = new BeanWithPrimitive();
        value.x = 5;
        value.y = new int[] {1,2,3};
        value.z = new int[][] {new int[]{1,2,3}, new int[]{1,2}};

        verify(Pair.of(value, "{\"x\":5,\"y\":[1,2,3],\"z\":[[1,2,3],[1,2]]}"));
    }

    private static <T> void verify(Pair<T>... cases) {
        for (Pair<T> value : cases) {
            Any result = SerDes.serialize(value.getKey());
            Assert.assertThat("Value `"+ value.getKey() + "` is not serialized properly", JSON.stringify(result), is(value.getValue()));
        }
    }

    private enum TestEnum {
        VALUE_A, VALUE_B;
    }

    private static class BeanWithPrimitive implements Serializable{
        private int x;
        private int[] y;
        private int[][] z;

        public int getX() {
            return x;
        }

        public int[] getY() {
            return y;
        }

        public int[][] getZ() {
            return z;
        }
    }

    private static class Pair<T> implements Serializable{
        private final T key;
        private final String value;

        private Pair(T key, String value) {
            this.key = key;
            this.value = value;
        }

        public T getKey() {
            return key;
        }

        public String getValue() {
            return value;
        }

        public static <T> Pair<T> of(T key, String value) {
            return new Pair<>(key, value);
        }
    }

    private static class Value<T> implements Serializable {
        private final T value;

        private Value(T value) {
            this.value = value;
        }

        static <T> Value<T> of(T value) {
            return new Value<>(value);
        }

        public T getValue() {
            return value;
        }

        public String toString() {
            return "[value="+value+"]";
        }
    }
}