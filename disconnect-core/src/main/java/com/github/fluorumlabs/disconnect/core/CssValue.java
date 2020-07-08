package com.github.fluorumlabs.disconnect.core;

import js.lang.Unknown;
import org.apache.commons.lang3.StringUtils;

/**
 * Created by Artem Godin on 7/3/2020.
 */
public class CssValue extends Measure<CssValue.Unit> {
    /**
     * Instantiates a new Css value.
     *
     * @param value the value
     * @param unit  the unit
     */
    protected CssValue(double value, Unit unit) {
        super(value, unit);
    }

    public static CssValue parse(String value) {
        if (StringUtils.isNumeric(value)) {
            return px(Unknown.of(value).doubleValue());
        } else {
            return Measure.parse(Unit.class, value, CssValue::new);
        }
    }

    /**
     * Centimeters
     *
     * @param value the value
     * @return the css value
     */
    public static CssValue cm(double value) {
        return new CssValue(value, Unit.CM);
    }

    /**
     * Millimeters
     *
     * @param value the value
     * @return the css value
     */
    public static CssValue mm(double value) {
        return new CssValue(value, Unit.MM);
    }

    /**
     * Inches (1in = 96px = 2.54cm)
     *
     * @param value the value
     * @return the css value
     */
    public static CssValue in(double value) {
        return new CssValue(value, Unit.IN);
    }

    /**
     * Pixels (1px = 1/96th of 1in)
     *
     * @param value the value
     * @return the css value
     */
    public static CssValue px(double value) {
        return new CssValue(value, Unit.PX);
    }

    /**
     * Points (1pt = 1/72 of 1in)
     *
     * @param value the value
     * @return the css value
     */
    public static CssValue pt(double value) {
        return new CssValue(value, Unit.PT);
    }

    /**
     * Picas (1pc = 12 pt)
     *
     * @param value the value
     * @return the css value
     */
    public static CssValue pc(double value) {
        return new CssValue(value, Unit.PC);
    }

    /**
     * Percents
     *
     * @param value the value
     * @return the css value
     */
    public static CssValue percent(double value) {
        return new CssValue(value, Unit.PERCENT);
    }

    /**
     * Relative to the font-size of the element (2em means 2 times the size of the current font)
     *
     * @param value the value
     * @return the css value
     */
    public static CssValue em(double value) {
        return new CssValue(value, Unit.EM);
    }

    /**
     * Relative to the x-height of the current font (rarely used)
     *
     * @param value the value
     * @return the css value
     */
    public static CssValue ex(double value) {
        return new CssValue(value, Unit.EX);
    }

    /**
     * Relative to the width of the "0" (zero)
     *
     * @param value the value
     * @return the css value
     */
    public static CssValue ch(double value) {
        return new CssValue(value, Unit.CH);
    }

    /**
     * Relative to font-size of the root element
     *
     * @param value the value
     * @return the css value
     */
    public static CssValue rem(double value) {
        return new CssValue(value, Unit.REM);
    }

    /**
     * Relative to 1% of the width of the viewport
     *
     * @param value the value
     * @return the css value
     */
    public static CssValue vw(double value) {
        return new CssValue(value, Unit.VW);
    }

    /**
     * Relative to 1% of the height of the viewport
     *
     * @param value the value
     * @return the css value
     */
    public static CssValue vh(double value) {
        return new CssValue(value, Unit.VH);
    }

    /**
     * Relative to 1% of viewport's smaller dimension
     *
     * @param value the value
     * @return the css value
     */
    public static CssValue vmin(double value) {
        return new CssValue(value, Unit.VMIN);
    }

    /**
     * Relative to 1% of viewport's larger dimension
     *
     * @param value the value
     * @return the css value
     */
    public static CssValue vmax(double value) {
        return new CssValue(value, Unit.VMAX);
    }

    /**
     * Created by Artem Godin on 7/3/2020.
     */
    public enum Unit {
        /**
         * centimeters
         */
        CM("cm"),
        /**
         * millimeters
         */
        MM("mm"),
        /**
         * inches (1in = 96px = 2.54cm)
         */
        IN("in"),
        /**
         * pixels (1px = 1/96th of 1in)
         */
        PX("px"),
        /**
         * points (1pt = 1/72 of 1in)
         */
        PT("pt"),
        /**
         * picas (1pc = 12 pt)
         */
        PC("pc"),
        /**
         * percents
         */
        PERCENT("%"),
        /**
         * Relative to the font-size of the element (2em means 2 times the size of the current font)
         */
        EM("em"),
        /**
         * Relative to the x-height of the current font (rarely used)
         */
        EX("ex"),
        /**
         * Relative to the width of the "0" (zero)
         */
        CH("ch"),
        /**
         * Relative to font-size of the root element
         */
        REM("rem"),
        /**
         * Relative to 1% of the width of the viewport
         */
        VW("vw"),
        /**
         * Relative to 1% of the height of the viewport
         */
        VH("vh"),
        /**
         * Relative to 1% of viewport's smaller dimension
         */
        VMIN("vmin"),
        /**
         * Relative to 1% of viewport's larger dimension
         */
        VMAX("vmax");

        private final String value;

        Unit(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
}
