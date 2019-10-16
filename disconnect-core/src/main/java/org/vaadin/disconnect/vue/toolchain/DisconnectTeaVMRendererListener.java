package org.vaadin.disconnect.vue.toolchain;

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
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Created by Artem Godin on 8/20/2019.
 */
public class DisconnectTeaVMRendererListener implements RendererListener {
    private final Set<String> packages = new HashSet<>();
    private final List<String> imports = new ArrayList<>();
    private final List<String> importedSymbols = new ArrayList<>();
    private final List<String> rpcRouteConfigs = new ArrayList<>();
    private File root;
    private boolean enableWebComponents = false;
    private SourceWriter sourceWriter;

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

    @Override
    public void begin(RenderingManager context, BuildTarget buildTarget) throws IOException {
        root = new File(context.getProperties().getProperty("frontend.directory"));
        sourceWriter = context.getWriter();

        writeImports();
    }

    private void writeImports() throws IOException {
        sourceWriter.append(String.join("\n", imports)).newLine();
        sourceWriter.append("import {Workbox} from 'workbox-window';\n" +
                "\n" +
                "if ('serviceWorker' in navigator) {\n" +
                "  const wb = new Workbox('/sw.js');\n" +
                "\n" +
                "  wb.register();\n" +
                "}\n" +
                "\n" +
                "var __this__ = {};\n").newLine();

        sourceWriter.append(importedSymbols.stream()
                .map(s -> "__this__."+s+" = "+s+";\n")
                .collect(Collectors.joining())).newLine();
    }

    @Override
    public void complete() throws IOException {
        if ( !root.exists() ) {
            Files.createDirectory(root.toPath());
        }
        File src = new File(root,"src");
        if ( !src.exists()) {
            Files.createDirectory(new File(root, "src").toPath());
        }

        writeBuildConfigJs();
        writeSwConfigJs();
        writePackageJson();
    }

    private void writeSwConfigJs() throws IOException {
        try (PrintWriter printWriter = new PrintWriter(new FileWriter(new File(root, "src/sw.config.js")))) {
            printWriter.println("import registerRPCStrategy from './disconnect/workbox-util.js';");
            printWriter.println("export default function registerRoutes(workbox) {");
            printWriter.println(String.join("\n", rpcRouteConfigs));
            printWriter.println("}");
        }
    }

    private void writePackageJson() throws IOException {
        try (PrintWriter printWriter = new PrintWriter(new FileWriter(new File(root, "package.json")))) {
            // language=json
            printWriter.print("{\n" +
                    "    \"dependencies\": {\n" +
                    "" +
                    packages.stream()
                            .distinct()
                            .collect(Collectors.joining(",\n")) + "\n" +
                    "    },\n" +
                    "    \"scripts\": {\n" +
                    "        \"rollup\": \"rollup -c rollup.config.js\"\n" +
                    "    }\n" +
                    "}\n");
        }
    }

    private void writeBuildConfigJs() throws IOException {
        try (PrintWriter printWriter = new PrintWriter(new FileWriter(new File(root, "build.config.js")))) {
            String[] tokens = new String[]{"$enableWebComponents"};
            String[] values = new String[]{Boolean.toString(enableWebComponents)};

            printWriter.print(StringUtils.replaceEach("export default {\n" +
                    "    enableWebComponents: $enableWebComponents\n" +
                    "}\n", tokens, values));
        }
    }
}
