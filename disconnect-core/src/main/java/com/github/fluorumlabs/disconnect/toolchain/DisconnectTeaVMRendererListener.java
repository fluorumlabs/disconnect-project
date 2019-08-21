package com.github.fluorumlabs.disconnect.toolchain;

import org.teavm.backend.javascript.rendering.RenderingManager;
import org.teavm.vm.BuildTarget;
import org.teavm.vm.spi.RendererListener;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Artem Godin on 8/20/2019.
 */
public class DisconnectTeaVMRendererListener implements RendererListener {
    private final Set<String> packages = new HashSet<>();
    private final Set<String> imports = new HashSet<>();
    private File root;

    public void addPackage(String packageJsonRow) {
        packages.add(packageJsonRow);
    }

    public void addImport(String importRow) {
        imports.add(importRow);
    }

    @Override
    public void begin(RenderingManager context, BuildTarget buildTarget) throws IOException {
        root = new File(context.getProperties().getProperty("frontend.directory"));
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

        writeRollupConfig();
        writeBabelRc();
        writeAppJs();
        writePackageJson();
    }

    private void writeRollupConfig() throws IOException {
        try (PrintWriter printWriter = new PrintWriter(new FileWriter(new File(root, "rollup.config.js")))) {
            // language=js
            printWriter.print("import {terser} from 'rollup-plugin-terser';\n" +
                    "import babel from 'rollup-plugin-babel';\n" +
                    "import replace from 'rollup-plugin-replace';\n" +
                    "import resolve from 'rollup-plugin-node-resolve';\n" +
                    "import commonjs from 'rollup-plugin-commonjs';\n" +
                    "\n" +
                    "import {resolve as pathResolve} from 'path';\n" +
                    "import fs from 'fs';\n" +
                    "\n" +
                    "const { PRODUCTION } = process.env\n" +
                    "\n" +
                    "function includeFile(id, target) {\n" +
                    "    let file = pathResolve(id, '../', target);\n" +
                    "    try {\n" +
                    "        return fs.readFileSync(file, {encoding: 'utf8'});\n" +
                    "        return content;\n" +
                    "    } catch (err) {\n" +
                    "        throw new Error('[disconnect-rollup-config] can not readFile: ' + file)\n" +
                    "    }\n" +
                    "}\n" +
                    "\n" +
                    "export default {\n" +
                    "    input: 'src/app.js',\n" +
                    "    output: {\n" +
                    "        file: 'js/app.js',\n" +
                    "        format: 'iife'\n" +
                    "    },\n" +
                    "    plugins: [\n" +
                    "        replace({\n" +
                    "            'process.env.NODE_ENV': JSON.stringify('production'),\n" +
                    "            'import_teavm_classes_js': fs.readFileSync('./teavm/classes.js', {encoding: 'utf8'})\n" +
                    "        }),\n" +
                    "        resolve(),\n" +
                    "        commonjs(),\n" +
                    "        babel({\n" +
                    "            exclude: 'node_modules/**'\n" +
                    "        }),\n" +
                    "        terser()\n" +
                    "    ]\n" +
                    "}"
            );
        }
    }

    private void writeBabelRc() throws IOException {
        try (PrintWriter printWriter = new PrintWriter(new FileWriter(new File(root, ".babelrc")))) {
            // language=json
            printWriter.print("{\n" +
                    "  \"presets\": [\"@babel/preset-env\"]\n" +
                    "}"
            );
        }
    }

    private void writeAppJs() throws IOException {
        try (PrintWriter printWriter = new PrintWriter(new FileWriter(new File(root, "src/app.js")))) {
            printWriter.print(String.join("\n", imports));
            // language=js
            printWriter.print("\n" +
                    "import_teavm_classes_js\n" +
                    "\n" +
                    "main();\n"
            );
        }
    }

    private void writePackageJson() throws IOException {
        try (PrintWriter printWriter = new PrintWriter(new FileWriter(new File(root, "package.json")))) {
            // language=json
            printWriter.print("{\n" +
                    "    \"dependencies\": {\n" +
                    "" + String.join(",\n", packages) + "\n" +
                    "    },\n" +
                    "    \"devDependencies\": {\n" +
                    "        \"@babel/core\": \"^7.5.5\",\n" +
                    "        \"@babel/preset-env\": \"^7.5.5\",\n" +
                    "        \"rollup\": \"^1.19.4\",\n" +
                    "        \"rollup-plugin-babel\": \"^4.3.3\",\n" +
                    "        \"rollup-plugin-commonjs\": \"^10.0.2\",\n" +
                    "        \"rollup-plugin-node-resolve\": \"^5.2.0\",\n" +
                    "        \"rollup-plugin-replace\": \"^2.2.0\",\n" +
                    "        \"rollup-plugin-terser\": \"^5.1.1\"\n" +
                    "    },\n" +
                    "    \"scripts\": {\n" +
                    "        \"rollup\": \"rollup -c rollup.config.js\"\n" +
                    "    }\n" +
                    "}\n");
        }
    }
}
