package com.github.fluorumlabs.disconnect.maven;

import com.github.fluorumlabs.disconnect.maven.internals.CachingTeaVMTool;
import com.github.fluorumlabs.disconnect.maven.internals.Globals;
import com.github.fluorumlabs.disconnect.maven.internals.MavenTeaVMToolLog;
import com.github.marschall.memoryfilesystem.MemoryFileSystemBuilder;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.maven.artifact.Artifact;
import org.apache.maven.artifact.repository.ArtifactRepository;
import org.apache.maven.artifact.repository.MavenArtifactRepository;
import org.apache.maven.artifact.resolver.ArtifactResolutionRequest;
import org.apache.maven.artifact.resolver.ArtifactResolutionResult;
import org.apache.maven.execution.MavenSession;
import org.apache.maven.model.Plugin;
import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.BuildPluginManager;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.Component;
import org.apache.maven.plugins.annotations.Parameter;
import org.apache.maven.project.MavenProject;
import org.apache.maven.repository.RepositorySystem;
import org.codehaus.plexus.util.xml.Xpp3Dom;
import org.teavm.tooling.TeaVMProblemRenderer;
import org.teavm.tooling.TeaVMTargetType;
import org.teavm.tooling.TeaVMToolException;
import org.teavm.tooling.builder.InProcessBuildStrategy;
import org.teavm.tooling.sources.DirectorySourceFileProvider;
import org.teavm.tooling.sources.JarSourceFileProvider;
import org.teavm.tooling.sources.SourceFileProvider;
import org.teavm.vm.TeaVMOptimizationLevel;

import javax.annotation.Nullable;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.nio.file.FileSystem;
import java.util.*;
import java.util.stream.Collectors;

import static org.twdata.maven.mojoexecutor.MojoExecutor.*;


abstract class AbstractDisconnectMojo extends AbstractMojo {
	private static final String VAADIN_DISCONNECT_CLIENT_GENERATED_ENTRY_POINT = "com.github.fluorumlabs.disconnect" +
			".client.GeneratedEntryPoint";

	static boolean initialCompile = true;

	private static FileSystem inMemoryFileSystem = null;

	private static int packageJsonHash = -1;

	private static int appBootstrapLiveHash = -1;

	private static int buildConfigHash = -1;

	/**
	 * The project currently being build.
	 */
	@Parameter(defaultValue = "${project}", readonly = true)
	private MavenProject mavenProject;

	/**
	 * The current Maven session.
	 */
	@Parameter(defaultValue = "${session}", readonly = true)
	private MavenSession mavenSession;

	/**
	 * The Maven BuildPluginManager component.
	 */
	@Component
	private BuildPluginManager pluginManager;

	@Component
	private RepositorySystem repositorySystem;

	@Parameter(required = true, readonly = true, defaultValue = "${localRepository}")
	private MavenArtifactRepository localRepository;

	@Parameter(required = true, readonly = true, defaultValue = "${project.remoteArtifactRepositories}")
	private List<MavenArtifactRepository> remoteRepositories;

	@Parameter(readonly = true, defaultValue = "${plugin.artifacts}")
	private List<Artifact> pluginArtifacts;

	@Parameter(defaultValue = "${project.build.directory}")
	private File outputDirectory;

	@Parameter(defaultValue = "${project.build.sourceDirectory}")
	private File sourceDirectory;

	@Parameter(defaultValue = "${project.build.testSourceDirectory}")
	private File testSourceDirectory;

	@Parameter(defaultValue = "${project.basedir}")
	private File projectDirectory;

	@Parameter(defaultValue = "false")
	private boolean production;

	@Parameter(defaultValue = "${project.artifactId}")
	private String artifactId;

	@Parameter(defaultValue = "${project.version}")
	private String version;

	@Nullable
	private String buildTimestamp;

	private MavenProject getMavenProject() {
		return mavenProject;
	}

	MavenSession getMavenSession() {
		return mavenSession;
	}

	private BuildPluginManager getPluginManager() {
		return pluginManager;
	}

	boolean isProduction() {
		return production;
	}

	File getOutputDirectory() {
		return outputDirectory;
	}

	File getSourceDirectory() {
		return sourceDirectory;
	}

	File getProjectDirectory() {
		return projectDirectory;
	}

	String getBuildTimestamp() {
		if (buildTimestamp == null) {
			buildTimestamp = Long.toHexString(System.currentTimeMillis());
		}
		return buildTimestamp;
	}

	void resetBuildTimestamp() {
		buildTimestamp = null;
	}

	Map<String, String> build(boolean productionBuild) throws MojoExecutionException {
		resetBuildTimestamp();

		Map<String, String> compilationUnits = new LinkedHashMap<>();

		if (!Globals.isTestMode()) {
			compilationUnits.put("app", VAADIN_DISCONNECT_CLIENT_GENERATED_ENTRY_POINT);
		}

		// collect other compilation units
		String extension = Globals.getCompilationUnitExtension();
		FileUtils.listFiles(new File(outputDirectory, Globals.getClassesBase()), new String[]{extension},
				false)
				.forEach(file -> {
					String cuName = StringUtils.removeEnd(file.getName(), "." + extension);
					try {
						String entryPoint = FileUtils.readFileToString(file, "UTF-8");
						compilationUnits.put(cuName, entryPoint);
					} catch (IOException e) {
						getLog().warn("Cannot read compilation unit descriptor for [" + cuName + "] -- skipping " +
								"compilation", e);
					}
				});

		boolean first = true;

		for (Map.Entry<String, String> cuEntry : compilationUnits.entrySet()) {
			if (!first) {
				printSeparator();
			}
			getLog().info("Building [" + cuEntry.getKey() + "]");
			printSeparator();

			build(cuEntry.getKey(), cuEntry.getValue(), productionBuild);
			first = false;
		}

		try {
			// Assemble package.json
			Set<String> dependencies = new HashSet<>();
			for (String compilationUnit : compilationUnits.keySet()) {
				dependencies.addAll(FileUtils.readLines(
						new File(outputDirectory, Globals.getFrontendBase() + "/" + compilationUnit +
								"/package.fragment"), "UTF-8"));
			}

			String corePath = "disconnect-core".equals(artifactId)?"./":"./jar_modules/disconnect-core-jar/frontend/";

			try (PrintWriter printWriter =
						 new PrintWriter(new FileWriter(new File(outputDirectory, Globals.getFrontendBase() +
								 "/package.json")))) {
				printWriter.print("{\n" +
						"\"description\": \"" + artifactId + "\",\n" +
						"\"version\": \"" + version + "\",\n" +
						"\"license\": \"UNLICENSED\",\n" +
						"\"private\": \"true\",\n" +
						"\"dependencies\": {\n" +
						dependencies.stream().sorted().collect(Collectors.joining(",\n")) + "\n" +
						"},\n" +
						"\"scripts\": {\n" +
						"    \"rollup\": \"rollup -c "+corePath+"template/rollup" +
						".config.js\"\n" +
						"}\n" +
						"}\n");
			}

			// Assemble build config
			try (PrintWriter printWriter = new PrintWriter(new FileWriter(new File(outputDirectory,
					Globals.getFrontendBase() + "/build.config.js")))) {
				printWriter.println("[");
				printWriter.println(compilationUnits.keySet().stream().map(cu -> "\"" + cu + "\"")
						.collect(Collectors.joining(",\n")));
				printWriter.println("]");
			}

		} catch (IOException e) {
			throw new MojoExecutionException("Build error", e);
		}

		return compilationUnits;
	}

	void build(String compilationUnit, String entryPoint, boolean productionBuild) throws MojoExecutionException {
		if (inMemoryFileSystem == null) {
			try {
				inMemoryFileSystem = MemoryFileSystemBuilder.newEmpty().build();
			} catch (IOException e) {
				getLog().warn("Cannot create in-memory file system for cache", e);
			}
		}

		CachingTeaVMTool tool = new CachingTeaVMTool();
		MavenTeaVMToolLog mavenTeaVMToolLog = new MavenTeaVMToolLog(getLog());

		//?? tool.setProgressListener(progressListener);
		tool.setLog(mavenTeaVMToolLog);
		tool.setTargetType(TeaVMTargetType.JAVASCRIPT);
		tool.setMainClass(entryPoint);
		tool.setEntryPointName("main");
		tool.setTargetDirectory(new File(outputDirectory, Globals.getFrontendBase() + "/" + compilationUnit));
		tool.setClassLoader(buildClassLoader());
		tool.setOptimizationLevel((Globals.isLiveMode() || Globals.isTestMode()) ? TeaVMOptimizationLevel.SIMPLE :
				productionBuild ?
				TeaVMOptimizationLevel.FULL : TeaVMOptimizationLevel.ADVANCED);
		tool.setFastDependencyAnalysis(false);

		tool.setIncremental(Globals.isLiveMode());
		tool.setCacheRoot(inMemoryFileSystem.getPath(compilationUnit));

		tool.setDebugInformationGenerated(Globals.isTestMode());

		tool.setMinifying(productionBuild && !Globals.isTestMode());

		tool.getProperties().setProperty("disconnect.compilation.unit", compilationUnit);
		tool.getProperties().setProperty("disconnect.build.timestamp", getBuildTimestamp());
		tool.getProperties().setProperty("frontend.directory",
				new File(outputDirectory, Globals.getFrontendBase()).getAbsolutePath());
		tool.getProperties().setProperty("frontend.build", Globals.isLiveMode() ? "live" :
				(isProduction() || !Globals.isTestMode()) ? "production" :
						"development");
		tool.getProperties().setProperty("frontend.artifactId", artifactId);
		tool.getProperties().setProperty("frontend.version", version);
		tool.getProperties().setProperty("frontend.compilationUnit", compilationUnit);

		getSourceFileProviders().forEach(tool::addSourceFileProvider);

		try {
			tool.generate();
		} catch (TeaVMToolException | RuntimeException | Error e) {
			throw new MojoExecutionException("Build error", e);
		}

		TeaVMProblemRenderer.describeProblems(tool.getDependencyInfo().getCallGraph(), tool.getProblemProvider(),
				mavenTeaVMToolLog);
		if (!tool.getProblemProvider().getSevereProblems().isEmpty()) {
			throw new MojoExecutionException("Build error");
		}
	}

	boolean wasPackageJsonChanged() {
		File file = new File(outputDirectory, Globals.getFrontendBase() + "/package.json");
		int newHash = getFileHash(file);
		if (newHash != packageJsonHash || newHash == -1) {
			packageJsonHash = newHash;
			return true;
		} else {
			return false;
		}
	}

	boolean wasAppBootstrapChanged() {
		File file = new File(outputDirectory, Globals.getFrontendBase() + "/app/bootstrap.live.js");
		int newHash = getFileHash(file);
		if (newHash != appBootstrapLiveHash || newHash == -1) {
			appBootstrapLiveHash = newHash;
			return true;
		} else {
			return false;
		}
	}

	boolean wasBuildConfigChanged() {
		File file = new File(outputDirectory, Globals.getFrontendBase() + "/build.config.js");
		int newHash = getFileHash(file);
		if (newHash != buildConfigHash || newHash == -1) {
			buildConfigHash = newHash;
			return true;
		} else {
			return false;
		}
	}

	private int getFileHash(File file) {
		try {
			return FileUtils.readFileToString(file, "UTF-8").hashCode();
		} catch (IOException e) {
			getLog().warn("Unable to compute file hash", e);
			return -1;
		}
	}

	private ClassLoader buildClassLoader() {
		URL[] urls = prepareClassPath().stream().map(entry -> {
			try {
				return new File(entry).toURI().toURL();
			} catch (MalformedURLException e) {
				throw new RuntimeException(entry);
			}
		}).toArray(URL[]::new);

		return new URLClassLoader(urls, InProcessBuildStrategy.class.getClassLoader());
	}

	private List<String> prepareClassPath() {
		List<String> paths = new ArrayList<>();
		for (Artifact artifact : mavenProject.getArtifacts()) {
			if (!filterByScope(artifact)) {
				continue;
			}
			File file = artifact.getFile();
			paths.add(file.getAbsolutePath());
		}

		File classes = new File(outputDirectory, "classes");

		paths.add(classes.getAbsolutePath());
		if (Globals.isTestMode()) {
			File testClasses = new File(outputDirectory, "test-classes");

			paths.add(testClasses.getAbsolutePath());
		}
		return paths;
	}

	private boolean filterByScope(Artifact artifact) {
		return isSupportedScope(artifact.getScope());
	}

	private boolean isSupportedScope(String scope) {
		switch (scope) {
			case Artifact.SCOPE_COMPILE:
			case Artifact.SCOPE_PROVIDED:
			case Artifact.SCOPE_SYSTEM:
				return true;
			default:
				return false;
		}
	}

	private List<SourceFileProvider> getSourceFileProviders() {
		List<SourceFileProvider> providers = new ArrayList<>();
		MavenSourceFileProviderLookup lookup = new MavenSourceFileProviderLookup();
		lookup.setMavenProject(getMavenProject());
		lookup.setRepositorySystem(repositorySystem);
		lookup.setLocalRepository(localRepository);
		lookup.setRemoteRepositories(remoteRepositories);
		lookup.setPluginDependencies(pluginArtifacts);
		lookup.resolve(providers);

		providers.add(new DirectorySourceFileProvider(sourceDirectory));
		if (Globals.isTestMode()) {
			providers.add(new DirectorySourceFileProvider(testSourceDirectory));
		}

		return providers;
	}

	void printLiveBanner() {
		getLog().info("");
		printSeparator();
		getLog().info("RUNNING DISCONNECT IN LIVE MODE @ http://localhost:8000");
		printSeparator();
		getLog().info("");
	}

	void runNpm(String arguments) throws MojoExecutionException {
		executeMojo(
				plugin(
						groupId("com.github.eirslett"),
						artifactId("frontend-maven-plugin"),
						version("1.8.0")
				),
				goal("npm"),
				configuration(
						element(name("installDirectory"), "${project.build.directory}"),
						element(name("workingDirectory"), "${project.build.directory}/" + Globals.getFrontendBase()),
						element(name("environmentVariables"),
								element(name("NODE_TLS_REJECT_UNAUTHORIZED"), "0"),
								element(name("NODE_CURRENT_ARTIFACT"), artifactId),
								element(name("NODE_ENV"), Globals.isLiveMode() ? "live" : isProduction() ?
										"production" :
										"development")
						),
						element(name("arguments"), arguments)
				),
				executionEnvironment(
						getMavenProject(),
						getMavenSession(),
						getPluginManager()
				)
		);
	}

	void installNpm() throws MojoExecutionException {
		executeMojo(
				plugin(
						groupId("com.github.eirslett"),
						artifactId("frontend-maven-plugin"),
						version("1.8.0")
				),
				goal("install-node-and-npm"),
				configuration(
						element(name("installDirectory"), "${project.build.directory}"),
						element(name("workingDirectory"), "${project.build.directory}/" + Globals.getFrontendBase()),
						element(name("environmentVariables"),
								element(name("NODE_TLS_REJECT_UNAUTHORIZED"), "0"),
								element(name("NODE_ENV"), Globals.isLiveMode() ? "live" : isProduction() ?
										"production" :
										"development")
						),
						element(name("nodeVersion"), "v10.16.3"),
						element(name("npmVersion"), "6.9.0")
				),
				executionEnvironment(
						getMavenProject(),
						getMavenSession(),
						getPluginManager()
				)
		);
	}

	void copyFile(File source, File destination) throws MojoExecutionException {
		try {
			if (source.exists()) {
				FileUtils.copyFileToDirectory(source, destination);
			}
		} catch (IOException e) {
			throw new MojoExecutionException(String.format("Unable to copy %s to %s: %s", source.getAbsolutePath(),
					destination.getAbsolutePath(), e.getMessage()));
		}
	}


	void copyResources(File source, File destination) throws MojoExecutionException {
		try {
			if (source.exists()) {
				FileUtils.copyDirectory(source, destination);
			}
		} catch (IOException e) {
			throw new MojoExecutionException(String.format("Unable to copy %s to %s: %s", source.getAbsolutePath(),
					destination.getAbsolutePath(), e.getMessage()));
		}
	}

	void injectBuildTimestamp(File destination) throws MojoExecutionException {
		try {
			for (File file : FileUtils.listFiles(destination, new String[]{"html", "json"}, true)) {
				String content = FileUtils.readFileToString(file, "UTF-8");
				String replacedContent = StringUtils.replace(content, "${BUILD_TIMESTAMP}", getBuildTimestamp());
				FileUtils.writeStringToFile(file, replacedContent, "UTF-8");
			}
		} catch (IOException e) {
			throw new MojoExecutionException(String.format("Unable to inject build timestamp: %s", e.getMessage()));
		}
	}

	void cleanFrontendStatic() {
		File frontendStaticDirectory = new File(getOutputDirectory(), Globals.getFrontendBase() + "/static");
		try {
			FileUtils.deleteDirectory(frontendStaticDirectory);
		} catch (IOException e) {
			getLog().warn(String.format("Error deleting %s: %s", frontendStaticDirectory.getAbsolutePath(),
					e.getMessage()));
		}

		File classesStaticDirectory = new File(getOutputDirectory(), Globals.getClassesBase() + "/static");
		try {
			FileUtils.deleteDirectory(classesStaticDirectory);
		} catch (IOException e) {
			getLog().warn(String.format("Error deleting %s: %s", frontendStaticDirectory.getAbsolutePath(),
					e.getMessage()));
		}
	}

	void unpackJarModules() throws MojoExecutionException {
		executeMojo(
				plugin(
						groupId("org.apache.maven.plugins"),
						artifactId("maven-dependency-plugin")
				),
				goal("unpack-dependencies"),
				configuration(
						element(name("silent"), "true"),
						element(name("useSubDirectoryPerArtifact"), "true"),
						element(name("stripClassifier"), "true"),
						element(name("stripVersion"), "true"),

						element(name("includes"), "frontend/**"),
						element(name("outputDirectory"), "${project.build.directory}/" + Globals.getFrontendBase() +
								"/jar_modules")
				),
				executionEnvironment(
						getMavenProject(),
						getMavenSession(),
						getPluginManager()
				)
		);
	}

	void compile() throws MojoExecutionException {
		Plugin compilerPlugin = mavenProject.getPlugin("org.apache.maven.plugins:maven-compiler-plugin");

		if (compilerPlugin == null) {
			throw new MojoExecutionException("Unable to recompile project: maven-compiler-plugin is not found in pom" +
					".xml");
		}

		executeMojo(
				plugin(
						groupId(compilerPlugin.getGroupId()),
						artifactId(compilerPlugin.getArtifactId()),
						version(compilerPlugin.getVersion())
				),
				goal("compile"),
				new Xpp3Dom((Xpp3Dom) compilerPlugin.getConfiguration()),
				executionEnvironment(
						getMavenProject(),
						getMavenSession(),
						getPluginManager()
				)
		);
	}

	void printSeparator() {
		getLog().info("------------------------------------------------------------------------");
	}

	public static class MavenSourceFileProviderLookup {
		private MavenProject mavenProject;

		private RepositorySystem repositorySystem;

		private ArtifactRepository localRepository;

		private List<? extends ArtifactRepository> remoteRepositories;

		private List<Artifact> pluginDependencies;

		void setMavenProject(MavenProject mavenProject) {
			this.mavenProject = mavenProject;
		}

		void setRepositorySystem(RepositorySystem repositorySystem) {
			this.repositorySystem = repositorySystem;
		}

		void setLocalRepository(ArtifactRepository localRepository) {
			this.localRepository = localRepository;
		}

		void setRemoteRepositories(List<? extends ArtifactRepository> remoteRepositories) {
			this.remoteRepositories = remoteRepositories;
		}

		void setPluginDependencies(List<Artifact> pluginDependencies) {
			this.pluginDependencies = pluginDependencies;
		}

		void resolve(List<SourceFileProvider> providers) {
			List<Artifact> initialArtifacts = new ArrayList<>(mavenProject.getArtifacts());
			if (pluginDependencies != null) {
				initialArtifacts.addAll(pluginDependencies);
			}
			Set<Artifact> artifacts = new HashSet<>();
			for (Artifact artifact : initialArtifacts) {
				if (artifact.getClassifier() != null && artifact.getClassifier().equals("sources")) {
					artifacts.add(artifact);
				} else {
					artifacts.add(repositorySystem.createArtifactWithClassifier(artifact.getGroupId(),
							artifact.getArtifactId(), artifact.getVersion(), artifact.getType(), "sources"));
				}
			}

			artifacts.addAll(initialArtifacts);
			for (Artifact artifact : artifacts) {
				ArtifactResolutionRequest request = new ArtifactResolutionRequest()
						.setLocalRepository(localRepository)
						.setRemoteRepositories(new ArrayList<>(remoteRepositories))
						.setArtifact(artifact);
				ArtifactResolutionResult result = repositorySystem.resolve(request);
				for (Artifact resolvedArtifact : result.getArtifacts()) {
					if (resolvedArtifact.getFile() != null) {
						File file = resolvedArtifact.getFile();
						if (!file.isDirectory()) {
							providers.add(new JarSourceFileProvider(file));
						} else {
							providers.add(new DirectorySourceFileProvider(file));
						}
					}
				}
			}
			for (String sourceRoot : mavenProject.getCompileSourceRoots()) {
				providers.add(new DirectorySourceFileProvider(new File(sourceRoot)));
			}
			if (Globals.isTestMode()) {
				for (String sourceRoot : mavenProject.getTestCompileSourceRoots()) {
					providers.add(new DirectorySourceFileProvider(new File(sourceRoot)));
				}
			}
		}
	}

}
