package com.github.fluorumlabs.disconnect.core.internals;

import org.apache.commons.lang3.StringUtils;

import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Artem Godin on 3/25/2020.
 */
public final class CamelCaseUtils {
	private static final Pattern KEBAB_SPLIT = Pattern.compile("-");

	private static final Pattern CAMELCASE_CONVERT_STAGE1 = Pattern.compile("([a-z0-9])([A-Z])");

	private static final Pattern CAMELCASE_CONVERT_STAGE2 = Pattern.compile("([A-Z])([A-Z])(?=[a-z])");

	private CamelCaseUtils() {
	}

	public static String toCamelCase(String kebabCase) {
		return StringUtils.uncapitalize(Stream.of(KEBAB_SPLIT.split(kebabCase))
				.map(StringUtils::capitalize)
				.collect(Collectors.joining()));
	}

	public static String toKebabCase(String camelCase) {
		String stage1 = CAMELCASE_CONVERT_STAGE1.matcher(camelCase).replaceAll("$1-$2");
		String stage2 = CAMELCASE_CONVERT_STAGE2.matcher(stage1).replaceAll("$1-$2");
		return stage2.toLowerCase();
	}


}
