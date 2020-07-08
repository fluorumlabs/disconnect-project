package com.github.fluorumlabs.disconnect.core.utils;

import com.github.fluorumlabs.disconnect.core.toolchain.DisconnectTestRunner;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.List;
import java.util.Map;

import static org.hamcrest.core.IsSame.sameInstance;

/**
 * Created by Artem Godin on 6/12/2020.
 */
@RunWith(DisconnectTestRunner.class)
public class MirrorTest {

    @Test
    public void mirror() {
        Primitives primitives = new Primitives((byte)1,'a',3,(short)4,5,6,true, TestEnum.VALUE_A,"Test",new int[]{1,2,3});
        Mirrored<Primitives> mirror = SerDes.mirror(primitives);

        Primitives primitives2 = SerDes.unmirror(mirror, Primitives.class);
        Assert.assertThat("Unmirror returned new instance", primitives2, sameInstance(primitives));

        Mirrored<Primitives> mirror2 = SerDes.mirror(primitives);
        Assert.assertThat("Mirror returned new instance", mirror2, sameInstance(mirror));
    }

    private enum TestEnum {
        VALUE_A, VALUE_B;
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Primitives {
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
    public static class BeanWithList {
        private List<String> values;
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class BeanWithMap {
        private Map<String, String> values;
    }

}