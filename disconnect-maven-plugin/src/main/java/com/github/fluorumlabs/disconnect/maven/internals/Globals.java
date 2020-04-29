package com.github.fluorumlabs.disconnect.maven.internals;

/**
 * Created by Artem Godin on 4/21/2020.
 */
public final class Globals {
	private Globals() {}

	public static String getCompilationUnitExtension() {
		return testMode?"test-unit":"compilation-unit";
	}
	public static String getClassesBase() {
		return testMode?"test-classes":"classes";
	}
	public static String getFrontendBase() {
		return testMode?"test-frontend":"frontend";
	}

	public static boolean isTestMode() {
		return testMode;
	}

	public static void setTestMode(boolean testMode) {
		Globals.testMode = testMode;
	}

	private static boolean testMode = false;

	public static boolean isLiveMode() {
		return liveMode && !testMode;
	}

	public static void setLiveMode(boolean liveMode) {
		Globals.liveMode = liveMode;
	}

	private static boolean liveMode = false;


}
