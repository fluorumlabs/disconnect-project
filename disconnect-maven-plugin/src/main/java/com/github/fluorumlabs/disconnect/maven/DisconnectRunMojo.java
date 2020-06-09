package com.github.fluorumlabs.disconnect.maven;

import com.github.fluorumlabs.disconnect.maven.internals.Globals;
import com.github.fluorumlabs.disconnect.maven.internals.TkMimeAwareFiles;
import org.apache.commons.io.FileUtils;
import org.apache.maven.Maven;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.Component;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.ResolutionScope;
import org.takes.facets.fork.FkRegex;
import org.takes.facets.fork.TkFork;
import org.takes.http.FtBasic;
import org.takes.rs.RsHtml;
import org.takes.rs.RsWithBody;
import org.takes.rs.RsWithHeader;
import org.takes.tk.TkWithType;
import org.teavm.tooling.util.FileSystemWatcher;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * Execute a Mojo using the MojoExecutor.
 */
@SuppressWarnings("unused")
@Mojo(name = "run",
        requiresDependencyResolution = ResolutionScope.COMPILE_PLUS_RUNTIME,
        requiresDependencyCollection = ResolutionScope.COMPILE_PLUS_RUNTIME)
public class DisconnectRunMojo extends AbstractDisconnectMojo {
    private boolean stopped = false;
    private FileSystemWatcher watcher;

    private long lastRebuildTimestamp = -1;

    @Component
    protected Maven maven;

    private boolean shutdownServer = false;

    public void execute() throws MojoExecutionException {
        Globals.setLiveMode(true);
        Globals.setTestMode(false);

        getLog().info("");

        try {
            FileSystemWatcher watcher = new FileSystemWatcher(new String[]{getSourceDirectory().getAbsolutePath()});

            while (true) {

                if (!initialCompile) {
                    watcher.waitForChange(250);
                }

                boolean hasProperChanges = watcher.hasChanges();
                if (hasProperChanges) {
                    hasProperChanges = watcher.grabChangedFiles()
                            .stream()
                            .anyMatch(f -> !f.isDirectory() && !f.getName().endsWith("___"));
                }

                // 2. Unpack dependencies to jar_modules
                unpackJarModules();

                // 3. Clean frontend/static
                if (initialCompile) {
                    cleanFrontendStatic();
                }

                if (initialCompile || hasProperChanges) {
                    try {
                        printSeparator();
                        compile();
                        printSeparator();

                        copyResources(new File(getProjectDirectory(), "src/main/resources/frontend"), new File(getOutputDirectory(), Globals.getFrontendBase()));
                        injectBuildTimestamp(new File(getOutputDirectory(), Globals.getFrontendBase()));

                        build(false);

                        boolean wasBuildConfigChanged = wasBuildConfigChanged();
                        boolean wasPackageJsonChanged = wasPackageJsonChanged();
                        boolean wasAppBootstrapChanged = wasAppBootstrapChanged();

                        // 5. Install Node & NPM
                        if (initialCompile) {
                            printSeparator();
                            installNpm();
                        }

                        if (wasPackageJsonChanged) {
                            printSeparator();
                            runNpm("install --no-progress -s");
                        }

                        if (wasPackageJsonChanged || wasBuildConfigChanged || wasAppBootstrapChanged) {
                            printSeparator();
                            runNpm("run rollup");
                            copyResources(new File(getOutputDirectory(), Globals.getFrontendBase()+ "/static"), new File(getOutputDirectory(), "classes/static"));
                        }

                        copyFile(new File(getOutputDirectory(), Globals.getFrontendBase()+ "/app/classes.js"),
                                new File(getOutputDirectory(), Globals.getClassesBase()+"/static/bin"));
                    } catch (MojoExecutionException e) {
                        getLog().error("There were compilation errors", e);
                    }

                    lastRebuildTimestamp = System.currentTimeMillis();

                    printSeparator();
                    getLog().info("");
                    if (initialCompile) {
                        initialCompile = false;
                        printLiveBanner();
                        new Thread(this::runDevServer).start();
                    }
                }
            }
        } catch (Throwable e) {
            getLog().error("File system monitoring aborted", e);
        } finally {
            shutdownServer = true;
            try {
                watcher.dispose();
            } catch (IOException e) {
                getLog().error("File system monitoring aborted", e);
            }
        }
    }

    private void runDevServer() {
        try {
            new FtBasic(new TkFork(
                    new FkRegex("/disconnect\\.reloader\\.marker",
                            new TkWithType(req -> {
                                return new RsWithHeader(
                                        new RsWithBody(Long.toString(lastRebuildTimestamp)),
                                        "Access-Control-Allow-Origin","*");
                            }, "text/plain")),
                    new FkRegex("[^.]*", new RsHtml(FileUtils.readFileToString(new File(getOutputDirectory(), Globals.getClassesBase()+"/static/index.html"), StandardCharsets.UTF_8))),
                    new FkRegex(".*", new TkMimeAwareFiles(new File(getOutputDirectory(), Globals.getClassesBase()+"/static")))
            ),
                    8000
            ).start(() -> shutdownServer);
        } catch (IOException e) {
            getLog().error("Error starting development server", e);
        }
    }


}