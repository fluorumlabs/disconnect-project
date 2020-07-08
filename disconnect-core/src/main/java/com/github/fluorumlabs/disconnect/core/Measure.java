package com.github.fluorumlabs.disconnect.core;

import js.lang.Unknown;
import org.apache.commons.lang3.StringUtils;

import java.util.function.BiFunction;

/**
 * Created by Artem Godin on 7/3/2020.
 */
public class Measure<UNIT extends Enum<UNIT>> {
    private final double value;
    private final UNIT unit;

    protected Measure(double value, UNIT unit) {
        this.value = value;
        this.unit = unit;
    }

    public static <UNIT extends Enum<UNIT>> Measure<UNIT> of(double value, UNIT unit) {
        return new Measure<>(value, unit);
    }

    protected static <UNIT extends Enum<UNIT>, MEASURE extends Measure<UNIT>> MEASURE parse(Class<UNIT> clazz, String value, BiFunction<Double, UNIT, MEASURE> measureMaker) {
        if (value == null) {
            return null;
        }

        for (UNIT enumConstant : clazz.getEnumConstants()) {
            String postfix = enumConstant.toString();
            String number = value.substring(0, value.length() - postfix.length()).trim();
            if ( value.endsWith(postfix) && StringUtils.isNumeric(number)) {
                return measureMaker.apply(Unknown.of(number).doubleValue(), enumConstant);
            }
        }
        throw new IllegalArgumentException("Unknown to parse " + value +" to "+clazz.getSimpleName());
    }

    public double getValue() {
        return value;
    }

    public UNIT getUnit() {
        return unit;
    }

    @Override
    public String toString() {
        return Double.toString(value) + unit;
    }
}
