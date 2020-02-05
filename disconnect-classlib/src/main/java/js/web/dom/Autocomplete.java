package js.web.dom;

import js.extras.JsEnum;

/**
 * Created by Artem Godin on 2/4/2020.
 */
public abstract class Autocomplete extends JsEnum {
    public static final Autocomplete OFF = JsEnum.of("off");
    public static final Autocomplete ON = JsEnum.of("on");
    public static final Autocomplete NAME = JsEnum.of("name");

    public static final Autocomplete HONORIFIC_PREFIX = JsEnum.of("honorific-prefix");
    public static final Autocomplete GIVEN_NAME = JsEnum.of("given-name");
    public static final Autocomplete ADDITIONAL_NAME = JsEnum.of("additional-name");
    public static final Autocomplete FAMILY_NAME = JsEnum.of("family-name");
    public static final Autocomplete HONORIFIC_SUFFIX = JsEnum.of("honorific-suffix");
    public static final Autocomplete NICKNAME = JsEnum.of("nickname");

    public static final Autocomplete EMAIL = JsEnum.of("email");
    public static final Autocomplete USERNAME = JsEnum.of("username");

    public static final Autocomplete NEW_PASSWORD = JsEnum.of("new-password");
    public static final Autocomplete CURRENT_PASSWORD = JsEnum.of("current-password");
    public static final Autocomplete ONE_TIME_CODE = JsEnum.of("one-time-code");
    
    public static final Autocomplete ORGANIZATION_TITLE = JsEnum.of("organization-title");
    public static final Autocomplete ORGANIZATION = JsEnum.of("organization");
    public static final Autocomplete STREET_ADDRES = JsEnum.of("street-addres");
    public static final Autocomplete ADDRESS_LINE_1 = JsEnum.of("address-line1");
    public static final Autocomplete ADDRESS_LINE_2 = JsEnum.of("address-line2");
    public static final Autocomplete ADDRESS_LINE_3 = JsEnum.of("address-line3");
    public static final Autocomplete ADDRESS_LEVEL_4 = JsEnum.of("address-level4");
    public static final Autocomplete ADDRESS_LEVEL_3 = JsEnum.of("address-level3");
    public static final Autocomplete ADDRESS_LEVEL_2 = JsEnum.of("address-level2");
    public static final Autocomplete ADDRESS_LEVEL_1 = JsEnum.of("address-level1");
    public static final Autocomplete COUNTRY = JsEnum.of("country");
    public static final Autocomplete COUNTRY_NAME = JsEnum.of("country-name");
    public static final Autocomplete POSTAL_CODE = JsEnum.of("postal-code");

    public static final Autocomplete CC_NAME = JsEnum.of("cc-name");
    public static final Autocomplete CC_GIVEN_NAME = JsEnum.of("cc-given-name");
    public static final Autocomplete CC_ADDITIONAL_NAME = JsEnum.of("cc-additional-name");
    public static final Autocomplete CC_FAMILY_NAME = JsEnum.of("cc-family-name");
    public static final Autocomplete CC_NUMBER = JsEnum.of("cc-number");
    public static final Autocomplete CC_EXP = JsEnum.of("cc-exp");
    public static final Autocomplete CC_EXP_MONTH = JsEnum.of("cc-exp-month");
    public static final Autocomplete CC_EXP_YEAR = JsEnum.of("cc-exp-year");
    public static final Autocomplete CC_CSC = JsEnum.of("cc-csc");
    public static final Autocomplete CC_TYPE = JsEnum.of("cc-type");

    public static final Autocomplete TRANSACTION_CURRENCY = JsEnum.of("transaction-currency");
    public static final Autocomplete TRANSACTION_AMOUNT = JsEnum.of("transaction-amount");
    public static final Autocomplete LANGUAGE = JsEnum.of("language");

    public static final Autocomplete BDAY = JsEnum.of("bday");
    public static final Autocomplete BDAY_DAY = JsEnum.of("bday-day");
    public static final Autocomplete BDAY_MONTH = JsEnum.of("bday-month");
    public static final Autocomplete BDAY_YEAR = JsEnum.of("bday-year");
    public static final Autocomplete SEX = JsEnum.of("sex");

    public static final Autocomplete TEL = JsEnum.of("tel");
    public static final Autocomplete TEL_COUNTRY_CODE = JsEnum.of("tel-country-code");
    public static final Autocomplete TEL_NATIONAL = JsEnum.of("tel-national");
    public static final Autocomplete TEL_AREA_CODE = JsEnum.of("tel-area-code");
    public static final Autocomplete TEL_LOCAL = JsEnum.of("tel-local");
    public static final Autocomplete TEL_EXTENSION = JsEnum.of("tel-extension");
    public static final Autocomplete IMPP = JsEnum.of("impp");
    public static final Autocomplete URL = JsEnum.of("url");
    public static final Autocomplete PHOTO = JsEnum.of("photo");
    


}
