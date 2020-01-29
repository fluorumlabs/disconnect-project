package com.github.fluorumlabs.disconnect.maven;

import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.ResolutionScope;

import java.io.File;

/**
 * Execute a Mojo using the MojoExecutor.
 */
@SuppressWarnings("unused")
@Mojo(name = "build",
        defaultPhase = LifecyclePhase.COMPILE,
        requiresDependencyResolution = ResolutionScope.COMPILE_PLUS_RUNTIME,
        requiresDependencyCollection = ResolutionScope.COMPILE_PLUS_RUNTIME)
public class DisconnectBuildMojo extends AbstractDisconnectMojo {
    public void execute() throws MojoExecutionException {
        if (getMavenSession().getGoals().contains("test") && !liveMode) {
            liveMode = true;
        }

        // 1. Build classes.js
        build(isProduction());
        printSeparator();

        // 2. Unpack dependencies to jar_modules
        unpackJarModules();

        // 3. Clean frontend/static
        if (initialCompile) {
            cleanFrontendStatic();
        }

        // 4. Copy local frontend resources
        copyResources(new File(getProjectDirectory(), "src/main/resources/frontend"), new File(getOutputDirectory(), "frontend"));

        // 5. Install Node & NPM
        if (initialCompile) {
            installNpm();
            printSeparator();
        }

        // 6. npm install
        runNpm("install --no-audit");
        printSeparator();

        // 6. rollup
        runNpm("run rollup");
        if (liveMode) {
            copyFile(new File(getOutputDirectory(), "frontend/src/classes.js"), new File(getOutputDirectory(), "frontend/static/bin"));
        }

        // 7. Copy generated frontend
        copyResources(new File(getOutputDirectory(), "frontend/static"), new File(getOutputDirectory(),"classes/static"));

        // Compute hashes
        wasPackageJsonChanged();
        wasBuildConfigChanged();

        initialCompile = false;
    }

}