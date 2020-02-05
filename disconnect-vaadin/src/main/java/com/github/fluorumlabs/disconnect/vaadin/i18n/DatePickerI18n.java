package com.github.fluorumlabs.disconnect.vaadin.i18n;

import js.lang.Any;
import org.teavm.jso.JSByRef;
import org.teavm.jso.JSFunctor;
import org.teavm.jso.JSProperty;

/**
 * Created by Artem Godin on 2/4/2020.
 */
public interface DatePickerI18n extends Any {
	@JSProperty
	String[] getMonthNames();

	@JSProperty
	void setMonthNames(@JSByRef String... monthNames);

	@JSProperty
	String[] getWeekdays();

	@JSProperty
	void setWeekdays(@JSByRef String... weekdays);

	@JSProperty
	String[] getWeekdaysShort();

	@JSProperty
	void setWeekdaysShort(@JSByRef String... weekdaysShort);

	@JSProperty
	int getFirstDayOfWeek();

	@JSProperty
	void setFirstDayOfWeek(int firstDayOfWeek);

	@JSProperty
	String getWeek();

	@JSProperty
	void setWeek(String week);

	@JSProperty
	String getCalendar();

	@JSProperty
	void setCalendar(String calendar);

	@JSProperty
	String getClear();

	@JSProperty
	void setClear(String clear);

	@JSProperty
	String getToday();

	@JSProperty
	void setToday(String today);

	@JSProperty
	String getCancel();

	@JSProperty
	void setCancel(String cancel);

	@JSProperty
	DateFormatter getFormatDate();

	@JSProperty
	void setFormatDate(DateFormatter formatDate);

	@JSProperty
	DateParser getParseDate();

	@JSProperty
	void setParseDate(DateParser parseDate);

	@JSProperty
	TitleFormatter getFormatTitle();

	@JSProperty
	void setFormatTitle(TitleFormatter formatTitle);

	@JSFunctor
	@FunctionalInterface
	interface DateFormatter extends Any {
		String formatDate(SimpleDate d);
	}

	@JSFunctor
	@FunctionalInterface
	interface DateParser extends Any {
		SimpleDate parseDate(String text);
	}

	@JSFunctor
	@FunctionalInterface
	interface TitleFormatter extends Any {
		String formatTitle(String monthName, int fullYear);
	}

	interface SimpleDate extends Any {
		@JSProperty
		int getDay();

		@JSProperty
		void setDay(int day);

		@JSProperty
		int getMonth();

		@JSProperty
		void setMonth(int month);

		@JSProperty
		int getYear();

		@JSProperty
		void setYear(int year);
	}
}
