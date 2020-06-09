package com.github.fluorumlabs.disconnect.maven;

import com.github.fluorumlabs.disconnect.maven.internals.Globals;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.ResolutionScope;

import java.io.File;
import java.util.Map;

/**
 * Execute a Mojo using the MojoExecutor.
 */
@SuppressWarnings("unused")
@Mojo(name = "build-tests",
        defaultPhase = LifecyclePhase.TEST_COMPILE,
        requiresDependencyResolution = ResolutionScope.COMPILE_PLUS_RUNTIME,
        requiresDependencyCollection = ResolutionScope.COMPILE_PLUS_RUNTIME)
public class DisconnectTestBuildMojo extends AbstractDisconnectMojo {
    public void execute() throws MojoExecutionException {
        Globals.setLiveMode(false);
        Globals.setTestMode(true);

        // 2. Unpack dependencies to jar_modules
        unpackJarModules();

        // 3. Clean frontend/static
        if (initialCompile) {
            cleanFrontendStatic();
        }

        // 4. Copy local frontend resources
        copyResources(new File(getProjectDirectory(), "src/main/resources/frontend"), new File(getOutputDirectory(), Globals.getFrontendBase()));
        copyResources(new File(getProjectDirectory(), "src/test/resources/frontend"), new File(getOutputDirectory(), Globals.getFrontendBase()));
        injectBuildTimestamp(new File(getOutputDirectory(), Globals.getFrontendBase()));

        // 1. Build classes.js
        Map<String, String> compilationUnits = build(isProduction());
        printSeparator();

        // 5. Install Node & NPM
        if (initialCompile) {
            installNpm();
            printSeparator();
        }

        // 6. npm install
        runNpm("install --no-progress -s");
        printSeparator();

        // 6. rollup
        runNpm("run rollup");

        // 7. Copy generated frontend
        copyResources(new File(getOutputDirectory(), Globals.getFrontendBase()+ "/static"), new File(getOutputDirectory(),Globals.getClassesBase()+"/static"));

        initialCompile = false;
    }

}