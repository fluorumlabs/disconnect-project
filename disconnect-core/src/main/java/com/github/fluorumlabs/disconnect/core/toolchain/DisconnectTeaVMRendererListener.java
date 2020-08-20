package com.github.fluorumlabs.disconnect.core.toolchain;

import org.apache.commons.lang3.StringUtils;
import org.teavm.backend.javascript.codegen.SourceWriter;
import org.teavm.backend.javascript.rendering.RenderingManager;
import org.teavm.vm.BuildTarget;
import org.teavm.vm.spi.RendererListener;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.util.*;
import java.util.stream.Collectors;


public class DisconnectTeaVMRendererListener implements RendererListener {
	private final Set<String> packages = new HashSet<>();

	private final List<String> imports = new ArrayList<>();

	private final List<String> importedSymbols = new ArrayList<>();

	private final List<String> injectedSymbols = new ArrayList<>();

	private final List<String> rpcRouteConfigs = new ArrayList<>();

	public static String COMPILATION_UNIT;
	public static String BUILD_TIMESTAMP;

	private File root;

	private boolean enableWebComponents = false;

	private SourceWriter sourceWriter;

	private boolean isLiveBuild = false;

	public boolean isApplication() {
		return "app".equals(COMPILATION_UNIT);
	}

	public void setEnableWebComponents(boolean enableWebComponents) {
		if (!this.enableWebComponents && enableWebComponents) {
			addPackage("        \"@webcomponents/webcomponentsjs\": \"latest\"");
			addImport("import '@webcomponents/webcomponentsjs/custom-elements-es5-adapter.js';");
			addImport("import '@webcomponents/webcomponentsjs/webcomponents-bundle.js';");
		}
		this.enableWebComponents = enableWebComponents;
	}

	public void addPackage(String packageJsonRow) {
		packages.add(packageJsonRow);
	}

	public void addRPCRouteConfig(String rpcRouteConfig) {
		rpcRouteConfigs.add(rpcRouteConfig);
	}

	public void addImport(String importRow) {
		if (!imports.contains(importRow)) {
			imports.add(importRow);
		}
	}

	public void addImportedSymbol(String symbol) {
		if (!importedSymbols.contains(symbol)) {
			importedSymbols.add(symbol);
		}
	}

	public void addInjectedSymbol(String symbol) {
		if (!injectedSymbols.contains(symbol)) {
			injectedSymbols.add(symbol);
		}
	}

	@Override
	public void begin(RenderingManager context, BuildTarget buildTarget) throws IOException {
		if ("live".equals(context.getProperties().getProperty("frontend.build"))) {
			isLiveBuild = true;
		}

		root = new File(context.getProperties().getProperty("frontend.directory"));
		sourceWriter = context.getWriter();
		writeImports();
	}

	private void writeImports() throws IOException {
		if (!isApplication()) {
			sourceWriter.append("var window = self;").newLine();
		}
		sourceWriter.append("var __this__ = {};").newLine();
		if (isLiveBuild && isApplication()) {
			sourceWriter.append(importedSymbols.stream()
					.map(s -> "var " + s + " = __this__." + s + " = self.Disconnect.Imports." + s + ";\n")
					.collect(Collectors.joining())).newLine();
		} else {
			sourceWriter.append(importedSymbols.stream()
					.map(s -> "__this__." + s + " = " + s + ";\n")
					.collect(Collectors.joining())).newLine();
		}
	}

	@Override
	public void complete() throws IOException {
		sourceWriter.append("self.Disconnect&&self.Disconnect.DeferInitialization?self.Disconnect.DeferInitialization.then(() => main()):main();").newLine();
		if (!root.exists()) {
			Files.createDirectory(root.toPath());
		}
		File src = new File(root, COMPILATION_UNIT);
		if (!src.exists()) {
			Files.createDirectory(new File(root, COMPILATION_UNIT).toPath());
		}

		writeBootstrapJs();
		if (isApplication()) {
			writeLiveBootstrapJs();
		}
		writeBuildConfigJs();
		writePackageJson();
	}

	private void writeBootstrapJs() throws IOException {
		try (PrintWriter printWriter = new PrintWriter(new FileWriter(new File(root,
                COMPILATION_UNIT + "/bootstrap.js")))) {
			printWriter.println(String.join("\n", imports));
			printWriter.println("import './classes.js';");
		}
	}

	private void writeLiveBootstrapJs() throws IOException {
		try (PrintWriter printWriter = new PrintWriter(new FileWriter(new File(root, COMPILATION_UNIT + "/bootstrap" +
				".live.js")))) {
			printWriter.println(String.join("\n", imports));
			printWriter.println("self.Disconnect = self.Disconnect||{};");
			printWriter.println("self.Disconnect.Imports = {};");
			printWriter.println(importedSymbols.stream()
					.map(s -> "self.Disconnect.Imports." + s + " = " + s + ";\n")
					.collect(Collectors.joining()));
			// Add classes loader
			printWriter.println("const scriptElement = document.createElement('script');\n" +
					"scriptElement.setAttribute('src', 'bin/classes.js');\n" +
					"document.head.appendChild(scriptElement);");
			printWriter.println("var lastRebuildTimestamp = -1;\n" +
					"\n" +
					"function handleReloaderMarker() {\n" +
					"    var currentRebuiltTimestamp = Number(this.responseText);\n" +
					"    if ( currentRebuiltTimestamp > lastRebuildTimestamp ) {\n" +
					"        if ( lastRebuildTimestamp !== -1 ) {\n" +
					"            document.location.reload();\n" +
					"        } else {\n" +
					"            lastRebuildTimestamp = currentRebuiltTimestamp;\n" +
					"        }\n" +
					"    }\n" +
					"}\n" +
					"\n" +
					"window.setInterval(() => {\n" +
					"    var reloadNotification = new XMLHttpRequest();\n" +
					"    reloadNotification.addEventListener(\"load\", handleReloaderMarker);\n" +
					"    reloadNotification.open(\"GET\", \"http://localhost:8000/disconnect.reloader.marker\");\n" +
					"    reloadNotification.send();    \n" +
					"}, 1000);\n");
		}
	}

	private void writePackageJson() throws IOException {
		try (PrintWriter printWriter =
					 new PrintWriter(new FileWriter(new File(root, COMPILATION_UNIT + "/package.fragment")))) {
			printWriter.print(
					packages.stream()
							.distinct()
							.map(s -> s + "\n")
							.collect(Collectors.joining()));
//            printWriter.print("{\n" +
//                    "    \"description\": \"" + properties.getProperty("frontend.artifactId",
//                    "unknown-disconnect-project") + "\",\n" +
//                    "    \"version\": \"" + properties.getProperty("frontend.verstion", "0.0.0") + "\",\n" +
//                    "    \"license\": \"UNLICENSED\",\n" +
//                    "    \"private\": \"true\",\n" +
//                    "    \"dependencies\": {\n" +
//                    "" +
//                    packages.stream()
//                            .distinct()
//                            .collect(Collectors.joining(",\n")) + "\n" +
//                    "    },\n" +
//                    "    \"scripts\": {\n" +
//                    "        \"rollup\": \"rollup -c ./jar_modules/disconnect-core-jar/frontend/template/rollup
//                    .config.js\"\n" +
//                    "    }\n" +
//                    "}\n");
		}
	}

	private void writeBuildConfigJs() throws IOException {
		try (PrintWriter printWriter = new PrintWriter(new FileWriter(new File(root, COMPILATION_UNIT +"/build.config" +
				".js")))) {
			String[] tokens = new String[]{
					"$enableWebComponents",
					"$injectSymbols"
			};
			String[] values = new String[]{
					Boolean.toString(enableWebComponents),
					"{\n" + String.join(",\n", injectedSymbols) + "\n}"
			};

			printWriter.print(StringUtils.replaceEach("{\n" +
					"    \"enableWebComponents\": $enableWebComponents,\n" +
					"    \"injectedSymbols\": $injectSymbols\n" +
					"}\n", tokens, values));
		}
	}
}
