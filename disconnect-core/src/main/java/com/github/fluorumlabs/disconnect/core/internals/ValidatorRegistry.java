package com.github.fluorumlabs.disconnect.core.internals;

import com.github.fluorumlabs.disconnect.core.internals.validators.FutureOrPresentValidatorForDate;
import com.github.fluorumlabs.disconnect.core.internals.validators.FutureValidatorForDate;
import com.github.fluorumlabs.disconnect.core.internals.validators.PastOrPresentValidatorForDate;
import com.github.fluorumlabs.disconnect.core.internals.validators.PastValidatorForDate;
import org.hibernate.validator.constraints.*;
import org.hibernate.validator.constraints.br.CNPJ;
import org.hibernate.validator.constraints.br.CPF;
import org.hibernate.validator.constraints.pl.NIP;
import org.hibernate.validator.constraints.pl.PESEL;
import org.hibernate.validator.constraints.pl.REGON;
import org.hibernate.validator.constraints.time.DurationMax;
import org.hibernate.validator.constraints.time.DurationMin;
import org.hibernate.validator.internal.constraintvalidators.bv.NotBlankValidator;
import org.hibernate.validator.internal.constraintvalidators.bv.*;
import org.hibernate.validator.internal.constraintvalidators.bv.notempty.*;
import org.hibernate.validator.internal.constraintvalidators.bv.number.bound.*;
import org.hibernate.validator.internal.constraintvalidators.bv.number.bound.decimal.*;
import org.hibernate.validator.internal.constraintvalidators.bv.number.sign.*;
import org.hibernate.validator.internal.constraintvalidators.bv.size.*;
import org.hibernate.validator.internal.constraintvalidators.hv.*;
import org.hibernate.validator.internal.constraintvalidators.hv.br.CNPJValidator;
import org.hibernate.validator.internal.constraintvalidators.hv.br.CPFValidator;
import org.hibernate.validator.internal.constraintvalidators.hv.pl.NIPValidator;
import org.hibernate.validator.internal.constraintvalidators.hv.pl.PESELValidator;
import org.hibernate.validator.internal.constraintvalidators.hv.pl.REGONValidator;
import org.hibernate.validator.internal.constraintvalidators.hv.time.DurationMaxValidator;
import org.hibernate.validator.internal.constraintvalidators.hv.time.DurationMinValidator;

import javax.validation.ConstraintValidator;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.*;
import java.lang.annotation.Annotation;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.Duration;
import java.util.*;

/**
 * Created by Artem Godin on 10/10/2019.
 */
public class ValidatorRegistry {
    private static final Map<Class<? extends Annotation>, Map<Class<?>, Class<? extends ConstraintValidator>>> defaultValidators = new HashMap<>();

    static {
        registerDefaultValidators();
    }

    public static Map<Class<?>, Class<? extends ConstraintValidator>> getValidators(Class<? extends Annotation> annotation) {
        return defaultValidators.get(annotation);
    }

    private static void register(Class<? extends Annotation> annotation, Class<?> type, Class<? extends ConstraintValidator> validator) {
        defaultValidators.computeIfAbsent(annotation, a -> new LinkedHashMap<>())
                .put(type, validator);
    }

    private static void registerDefaultValidators() {
        register(AssertFalse.class, Boolean.class, AssertFalseValidator.class);
        register(AssertTrue.class, Boolean.class, AssertTrueValidator.class);

        register(DecimalMax.class, BigDecimal.class, DecimalMaxValidatorForBigDecimal.class);
        register(DecimalMax.class, BigInteger.class, DecimalMaxValidatorForBigInteger.class);
        register(DecimalMax.class, Double.class, DecimalMaxValidatorForDouble.class);
        register(DecimalMax.class, Float.class, DecimalMaxValidatorForFloat.class);
        register(DecimalMax.class, Long.class, DecimalMaxValidatorForLong.class);
        register(DecimalMax.class, Number.class, DecimalMaxValidatorForNumber.class);
        register(DecimalMax.class, CharSequence.class, DecimalMaxValidatorForCharSequence.class);

        register(DecimalMin.class, BigDecimal.class, DecimalMinValidatorForBigDecimal.class);
        register(DecimalMin.class, BigInteger.class, DecimalMinValidatorForBigInteger.class);
        register(DecimalMin.class, Double.class, DecimalMinValidatorForDouble.class);
        register(DecimalMin.class, Float.class, DecimalMinValidatorForFloat.class);
        register(DecimalMin.class, Long.class, DecimalMinValidatorForLong.class);
        register(DecimalMin.class, Number.class, DecimalMinValidatorForNumber.class);
        register(DecimalMin.class, CharSequence.class, DecimalMinValidatorForCharSequence.class);

        register(Digits.class, CharSequence.class, DigitsValidatorForCharSequence.class);
        register(Digits.class, Number.class, DigitsValidatorForNumber.class);

        //putConstraint(tmpConstraints, Email.class, EmailValidator.class);

        //register(Future.class, Calendar.class, FutureValidatorForCalendar.class);
        register(Future.class, Date.class, FutureValidatorForDate.class);
        // Java 8 date/time API validators
        //register(Future.class, HijrahDate.class, FutureValidatorForHijrahDate.class);
        //register(Future.class, Instant.class, FutureValidatorForInstant.class);
        //register(Future.class, JapaneseDate.class, FutureValidatorForJapaneseDate.class);
        //register(Future.class, LocalDate.class, FutureValidatorForLocalDate.class);
        //register(Future.class, LocalDateTime.class, FutureValidatorForLocalDateTime.class);
        //register(Future.class, LocalTime.class, FutureValidatorForLocalTime.class);
        //register(Future.class, MinguoDate.class, FutureValidatorForMinguoDate.class);
        //register(Future.class, MonthDay.class, FutureValidatorForMonthDay.class);
        //register(Future.class, OffsetDateTime.class, FutureValidatorForOffsetDateTime.class);
        //register(Future.class, OffsetTime.class, FutureValidatorForOffsetTime.class);
        //register(Future.class, ThaiBuddhistDate.class, FutureValidatorForThaiBuddhistDate.class);
        //register(Future.class, Year.class, FutureValidatorForYear.class);
        //register(Future.class, YearMonth.class, FutureValidatorForYearMonth.class);
        //register(Future.class, ZonedDateTime.class, FutureValidatorForZonedDateTime.class);

        //register(FutureOrPresent.class, Calendar.class, FutureOrPresentValidatorForCalendar.class);
        register(FutureOrPresent.class, Date.class, FutureOrPresentValidatorForDate.class);
        // Java 8 date/time API validators
        //register(FutureOrPresent.class, HijrahDate.class, FutureOrPresentValidatorForHijrahDate.class);
        //register(FutureOrPresent.class, Instant.class, FutureOrPresentValidatorForInstant.class);
        //register(FutureOrPresent.class, JapaneseDate.class, FutureOrPresentValidatorForJapaneseDate.class);
        //register(FutureOrPresent.class, LocalDate.class, FutureOrPresentValidatorForLocalDate.class);
        //register(FutureOrPresent.class, LocalDateTime.class, FutureOrPresentValidatorForLocalDateTime.class);
        //register(FutureOrPresent.class, LocalTime.class, FutureOrPresentValidatorForLocalTime.class);
        //register(FutureOrPresent.class, MinguoDate.class, FutureOrPresentValidatorForMinguoDate.class);
        //register(FutureOrPresent.class, MonthDay.class, FutureOrPresentValidatorForMonthDay.class);
        //register(FutureOrPresent.class, OffsetDateTime.class, FutureOrPresentValidatorForOffsetDateTime.class);
        //register(FutureOrPresent.class, OffsetTime.class, FutureOrPresentValidatorForOffsetTime.class);
        //register(FutureOrPresent.class, ThaiBuddhistDate.class, FutureOrPresentValidatorForThaiBuddhistDate.class);
        //register(FutureOrPresent.class, Year.class, FutureOrPresentValidatorForYear.class);
        //register(FutureOrPresent.class, YearMonth.class, FutureOrPresentValidatorForYearMonth.class);
        //register(FutureOrPresent.class, ZonedDateTime.class, FutureOrPresentValidatorForZonedDateTime.class);

        register(ISBN.class, CharSequence.class, ISBNValidator.class);

        register(Max.class, BigDecimal.class, MaxValidatorForBigDecimal.class);
        register(Max.class, BigInteger.class, MaxValidatorForBigInteger.class);
        register(Max.class, Double.class, MaxValidatorForDouble.class);
        register(Max.class, Float.class, MaxValidatorForFloat.class);
        register(Max.class, Long.class, MaxValidatorForLong.class);
        register(Max.class, Number.class, MaxValidatorForNumber.class);
        register(Max.class, CharSequence.class, MaxValidatorForCharSequence.class);

        register(Min.class, BigDecimal.class, MinValidatorForBigDecimal.class);
        register(Min.class, BigInteger.class, MinValidatorForBigInteger.class);
        register(Min.class, Double.class, MinValidatorForDouble.class);
        register(Min.class, Float.class, MinValidatorForFloat.class);
        register(Min.class, Long.class, MinValidatorForLong.class);
        register(Min.class, Number.class, MinValidatorForNumber.class);
        register(Min.class, CharSequence.class, MinValidatorForCharSequence.class);

        register(Negative.class, BigDecimal.class, NegativeValidatorForBigDecimal.class);
        register(Negative.class, BigInteger.class, NegativeValidatorForBigInteger.class);
        register(Negative.class, Double.class, NegativeValidatorForDouble.class);
        register(Negative.class, Float.class, NegativeValidatorForFloat.class);
        register(Negative.class, Long.class, NegativeValidatorForLong.class);
        register(Negative.class, Integer.class, NegativeValidatorForInteger.class);
        register(Negative.class, Short.class, NegativeValidatorForShort.class);
        register(Negative.class, Byte.class, NegativeValidatorForByte.class);
        register(Negative.class, Number.class, NegativeValidatorForNumber.class);

        register(NegativeOrZero.class, BigDecimal.class, NegativeOrZeroValidatorForBigDecimal.class);
        register(NegativeOrZero.class, BigInteger.class, NegativeOrZeroValidatorForBigInteger.class);
        register(NegativeOrZero.class, Double.class, NegativeOrZeroValidatorForDouble.class);
        register(NegativeOrZero.class, Float.class, NegativeOrZeroValidatorForFloat.class);
        register(NegativeOrZero.class, Long.class, NegativeOrZeroValidatorForLong.class);
        register(NegativeOrZero.class, Integer.class, NegativeOrZeroValidatorForInteger.class);
        register(NegativeOrZero.class, Short.class, NegativeOrZeroValidatorForShort.class);
        register(NegativeOrZero.class, Byte.class, NegativeOrZeroValidatorForByte.class);
        register(NegativeOrZero.class, Number.class, NegativeOrZeroValidatorForNumber.class);

        register(NotBlank.class, CharSequence.class, NotBlankValidator.class);

        register(NotEmpty.class, CharSequence.class, NotEmptyValidatorForCharSequence.class);
        register(NotEmpty.class, Collection.class, NotEmptyValidatorForCollection.class);
        register(NotEmpty.class, Object[].class, NotEmptyValidatorForArray.class);
        register(NotEmpty.class, Map.class, NotEmptyValidatorForMap.class);
        register(NotEmpty.class, boolean[].class, NotEmptyValidatorForArraysOfBoolean.class);
        register(NotEmpty.class, byte[].class, NotEmptyValidatorForArraysOfByte.class);
        register(NotEmpty.class, char[].class, NotEmptyValidatorForArraysOfChar.class);
        register(NotEmpty.class, double[].class, NotEmptyValidatorForArraysOfDouble.class);
        register(NotEmpty.class, float[].class, NotEmptyValidatorForArraysOfFloat.class);
        register(NotEmpty.class, int[].class, NotEmptyValidatorForArraysOfInt.class);
        register(NotEmpty.class, long[].class, NotEmptyValidatorForArraysOfLong.class);
        register(NotEmpty.class, short[].class, NotEmptyValidatorForArraysOfShort.class);

        register(NotNull.class, Object.class, NotNullValidator.class);
        register(Null.class, Object.class, NullValidator.class);

        //register(Past.class, Calendar.class, PastValidatorForCalendar.class);
        register(Past.class, Date.class, PastValidatorForDate.class);
        // Java 8 date/time API validators
        //register(Past.class, HijrahDate.class, PastValidatorForHijrahDate.class);
        //register(Past.class, Instant.class, PastValidatorForInstant.class);
        //register(Past.class, JapaneseDate.class, PastValidatorForJapaneseDate.class);
        //register(Past.class, LocalDate.class, PastValidatorForLocalDate.class);
        //register(Past.class, LocalDateTime.class, PastValidatorForLocalDateTime.class);
        //register(Past.class, LocalTime.class, PastValidatorForLocalTime.class);
        //register(Past.class, MinguoDate.class, PastValidatorForMinguoDate.class);
        //register(Past.class, MonthDay.class, PastValidatorForMonthDay.class);
        //register(Past.class, OffsetDateTime.class, PastValidatorForOffsetDateTime.class);
        //register(Past.class, OffsetTime.class, PastValidatorForOffsetTime.class);
        //register(Past.class, ThaiBuddhistDate.class, PastValidatorForThaiBuddhistDate.class);
        //register(Past.class, Year.class, PastValidatorForYear.class);
        //register(Past.class, YearMonth.class, PastValidatorForYearMonth.class);
        //register(Past.class, ZonedDateTime.class, PastValidatorForZonedDateTime.class);

        //register(PastOrPresent.class, Calendar.class, PastOrPresentValidatorForCalendar.class);
        register(PastOrPresent.class, Date.class, PastOrPresentValidatorForDate.class);
        // Java 8 date/time API validators
        //register(PastOrPresent.class, HijrahDate.class, PastOrPresentValidatorForHijrahDate.class);
        //register(PastOrPresent.class, Instant.class, PastOrPresentValidatorForInstant.class);
        //register(PastOrPresent.class, JapaneseDate.class, PastOrPresentValidatorForJapaneseDate.class);
        //register(PastOrPresent.class, LocalDate.class, PastOrPresentValidatorForLocalDate.class);
        //register(PastOrPresent.class, LocalDateTime.class, PastOrPresentValidatorForLocalDateTime.class);
        //register(PastOrPresent.class, LocalTime.class, PastOrPresentValidatorForLocalTime.class);
        //register(PastOrPresent.class, MinguoDate.class, PastOrPresentValidatorForMinguoDate.class);
        //register(PastOrPresent.class, MonthDay.class, PastOrPresentValidatorForMonthDay.class);
        //register(PastOrPresent.class, OffsetDateTime.class, PastOrPresentValidatorForOffsetDateTime.class);
        //register(PastOrPresent.class, OffsetTime.class, PastOrPresentValidatorForOffsetTime.class);
        //register(PastOrPresent.class, ThaiBuddhistDate.class, PastOrPresentValidatorForThaiBuddhistDate.class);
        //register(PastOrPresent.class, Year.class, PastOrPresentValidatorForYear.class);
        //register(PastOrPresent.class, YearMonth.class, PastOrPresentValidatorForYearMonth.class);
        //register(PastOrPresent.class, ZonedDateTime.class, PastOrPresentValidatorForZonedDateTime.class);

        register(Pattern.class, CharSequence.class, PatternValidator.class);

        register(Positive.class, BigDecimal.class, PositiveValidatorForBigDecimal.class);
        register(Positive.class, BigInteger.class, PositiveValidatorForBigInteger.class);
        register(Positive.class, Double.class, PositiveValidatorForDouble.class);
        register(Positive.class, Float.class, PositiveValidatorForFloat.class);
        register(Positive.class, Long.class, PositiveValidatorForLong.class);
        register(Positive.class, Integer.class, PositiveValidatorForInteger.class);
        register(Positive.class, Short.class, PositiveValidatorForShort.class);
        register(Positive.class, Byte.class, PositiveValidatorForByte.class);
        register(Positive.class, Number.class, PositiveValidatorForNumber.class);

        register(PositiveOrZero.class, BigDecimal.class, PositiveOrZeroValidatorForBigDecimal.class);
        register(PositiveOrZero.class, BigInteger.class, PositiveOrZeroValidatorForBigInteger.class);
        register(PositiveOrZero.class, Double.class, PositiveOrZeroValidatorForDouble.class);
        register(PositiveOrZero.class, Float.class, PositiveOrZeroValidatorForFloat.class);
        register(PositiveOrZero.class, Long.class, PositiveOrZeroValidatorForLong.class);
        register(PositiveOrZero.class, Integer.class, PositiveOrZeroValidatorForInteger.class);
        register(PositiveOrZero.class, Short.class, PositiveOrZeroValidatorForShort.class);
        register(PositiveOrZero.class, Byte.class, PositiveOrZeroValidatorForByte.class);
        register(PositiveOrZero.class, Number.class, PositiveOrZeroValidatorForNumber.class);

        register(Size.class, CharSequence.class, SizeValidatorForCharSequence.class);
        register(Size.class, Collection.class, SizeValidatorForCollection.class);
        register(Size.class, Object[].class, SizeValidatorForArray.class);
        register(Size.class, Map.class, SizeValidatorForMap.class);
        register(Size.class, boolean[].class, SizeValidatorForArraysOfBoolean.class);
        register(Size.class, byte[].class, SizeValidatorForArraysOfByte.class);
        register(Size.class, char[].class, SizeValidatorForArraysOfChar.class);
        register(Size.class, double[].class, SizeValidatorForArraysOfDouble.class);
        register(Size.class, float[].class, SizeValidatorForArraysOfFloat.class);
        register(Size.class, int[].class, SizeValidatorForArraysOfInt.class);
        register(Size.class, long[].class, SizeValidatorForArraysOfLong.class);
        register(Size.class, short[].class, SizeValidatorForArraysOfShort.class);

        // Hibernate Validator specific constraints

        register(CNPJ.class, CharSequence.class, CNPJValidator.class);
        register(CPF.class, CharSequence.class, CPFValidator.class);
        register(DurationMax.class, Duration.class, DurationMaxValidator.class);
        register(DurationMin.class, Duration.class, DurationMinValidator.class);
        register(EAN.class, CharSequence.class, EANValidator.class);
        register(Email.class, CharSequence.class, com.github.fluorumlabs.disconnect.core.internals.validators.EmailValidator.class);
        register(org.hibernate.validator.constraints.Email.class, CharSequence.class, com.github.fluorumlabs.disconnect.core.internals.validators.EmailValidator.class);
        register(Length.class, CharSequence.class, LengthValidator.class);
        register(CodePointLength.class, CharSequence.class, CodePointLengthValidator.class);
        register(ModCheck.class, CharSequence.class, ModCheckValidator.class);
        register(LuhnCheck.class, CharSequence.class, LuhnCheckValidator.class);
        register(Mod10Check.class, CharSequence.class, Mod10CheckValidator.class);
        register(Mod11Check.class, CharSequence.class, Mod11CheckValidator.class);
        register(REGON.class, CharSequence.class, REGONValidator.class);
        register(NIP.class, CharSequence.class, NIPValidator.class);
        register(PESEL.class, CharSequence.class, PESELValidator.class);
        register(org.hibernate.validator.constraints.NotBlank.class, CharSequence.class, org.hibernate.validator.internal.constraintvalidators.hv.NotBlankValidator.class);
        //register(ParameterScriptAssert.class, ParameterScriptAssertValidator.class);
        //register(SafeHtml.class, SafeHtmlValidator.class);
        //register(ScriptAssert.class, ScriptAssertValidator.class);
        register(UniqueElements.class, Collection.class, UniqueElementsValidator.class);
        register(URL.class, CharSequence.class, URLValidator.class);

    }

}
