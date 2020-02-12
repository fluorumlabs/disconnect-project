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
    private File root;
    private boolean enableWebComponents = false;
    private boolean enablePWA = false;
    private SourceWriter sourceWriter;

    private boolean isLiveBuild = false;
    private Properties properties;

    public void setEnablePWA(boolean enablePWA) {
        this.enablePWA = enablePWA;
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

        properties = context.getProperties();
        root = new File(context.getProperties().getProperty("frontend.directory"));
        sourceWriter = context.getWriter();
        writeImports();
    }

    private void writeImports() throws IOException {
        sourceWriter.append("var __this__ = {};").newLine();
        if (isLiveBuild) {
            sourceWriter.append(importedSymbols.stream()
                    .map(s -> "var "+s+" = __this__."+s+" = window.Disconnect.Imports."+s+";\n")
                    .collect(Collectors.joining())).newLine();
        } else {
            sourceWriter.append(importedSymbols.stream()
                    .map(s -> "__this__."+s+" = "+s+";\n")
                    .collect(Collectors.joining())).newLine();
        }
    }

    @Override
    public void complete() throws IOException {
        sourceWriter.append("main();").newLine();
        if ( !root.exists() ) {
            Files.createDirectory(root.toPath());
        }
        File src = new File(root,"src");
        if ( !src.exists()) {
            Files.createDirectory(new File(root, "src").toPath());
        }

        writeBootstrapJs();
        writeLiveBootstrapJs();
        writeBuildConfigJs();
        writeSwConfigJs();
        writePackageJson();
    }

    private void writeBootstrapJs() throws IOException {
        try (PrintWriter printWriter = new PrintWriter(new FileWriter(new File(root, "src/app.bootstrap.js")))) {
            printWriter.println(String.join("\n", imports));
            if (enablePWA) {
                printWriter.println("import {Workbox} from 'workbox-window';\n" +
                        "\n" +
                        "if ('serviceWorker' in navigator) {\n" +
                        "  const wb = new Workbox('sw.js');\n" +
                        "\n" +
                        "  wb.register();\n" +
                        "}");
            }
            printWriter.println("import './classes.js';");
        }
    }

    private void writeLiveBootstrapJs() throws IOException {
        try (PrintWriter printWriter = new PrintWriter(new FileWriter(new File(root, "src/app.bootstrap.live.js")))) {
            printWriter.println(String.join("\n", imports));
            printWriter.println("window.Disconnect = window.Disconnect||{};");
            printWriter.println("window.Disconnect.Imports = {};");
            printWriter.println(importedSymbols.stream()
                    .map(s -> "window.Disconnect.Imports." + s + " = " + s + ";\n")
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

    private void writeSwConfigJs() throws IOException {
        try (PrintWriter printWriter = new PrintWriter(new FileWriter(new File(root, "src/sw.config.js")))) {
            printWriter.println("import registerRPCStrategy from 'disconnect-core-jar/frontend/workbox-util.js';");
            printWriter.println("export default function registerRoutes(workbox) {");
            printWriter.println(String.join("\n", rpcRouteConfigs));
            printWriter.println("}");
        }
    }

    private void writePackageJson() throws IOException {
        try (PrintWriter printWriter = new PrintWriter(new FileWriter(new File(root, "package.json")))) {
            printWriter.print("{\n" +
                    "    \"description\": \"" + properties.getProperty("frontend.artifactId", "unknown-disconnect-project") + "\",\n" +
                    "    \"version\": \"" + properties.getProperty("frontend.verstion", "0.0.0") + "\",\n" +
                    "    \"license\": \"UNLICENSED\",\n" +
                    "    \"private\": \"true\",\n" +
                    "    \"dependencies\": {\n" +
                    "" +
                    packages.stream()
                            .distinct()
                            .collect(Collectors.joining(",\n")) + "\n" +
                    "    },\n" +
                    "    \"scripts\": {\n" +
                    "        \"rollup\": \"rollup -c ./jar_modules/disconnect-core-jar/frontend/template/rollup.config.js\"\n" +
                    "    }\n" +
                    "}\n");
        }
    }

    private void writeBuildConfigJs() throws IOException {
        try (PrintWriter printWriter = new PrintWriter(new FileWriter(new File(root, "build.config.js")))) {
            String[] tokens = new String[]{
                    "$enableWebComponents",
                    "$enableWorkbox",
                    "$injectSymbols"
            };
            String[] values = new String[]{
                    Boolean.toString(enableWebComponents),
                    Boolean.toString(enablePWA),
                    "{\n" + String.join(",\n", injectedSymbols) + "\n}"
            };

            printWriter.print(StringUtils.replaceEach("{\n" +
                    "    \"enableWebComponents\": $enableWebComponents,\n" +
                    "    \"enableWorkbox\": $enableWorkbox,\n" +
                    "    \"injectedSymbols\": $injectSymbols\n" +
                    "}\n", tokens, values));
        }
    }
}
