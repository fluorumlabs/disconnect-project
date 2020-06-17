package com.github.fluorumlabs.disconnect;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import com.squareup.javapoet.AnnotationSpec;
import com.squareup.javapoet.ClassName;
import com.squareup.javapoet.JavaFile;
import com.vladsch.flexmark.Extension;
import com.vladsch.flexmark.ext.autolink.AutolinkExtension;
import com.vladsch.flexmark.ext.gfm.strikethrough.StrikethroughExtension;
import com.vladsch.flexmark.ext.ins.InsExtension;
import com.vladsch.flexmark.ext.tables.TablesExtension;
import com.vladsch.flexmark.formatter.internal.Formatter;
import com.vladsch.flexmark.html.HtmlRenderer;
import com.vladsch.flexmark.parser.Parser;
import com.vladsch.flexmark.util.options.MutableDataSet;
import js.lang.Any;
import lombok.Getter;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.text.StringEscapeUtils;

import javax.annotation.Nullable;
import javax.lang.model.element.Modifier;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Artem Godin on 6/2/2020.
 */
@Getter
public class GlobalContext {
    public static final String JSDOC_TOKEN = "\uf001";
    public static final String ROUND_TOKEN = "\uf002";
    public static final String SQUARE_TOKEN = "\uf003";
    public static final String ANGLE_TOKEN = "\uf004";
    public static final String FIGURE_TOKEN = "\uf005";
    public static final String STRING_TOKEN = "\uf006";
    public static final String ARROW_TOKEN = "\uf007";

    private static final Pattern COMMENT = Pattern.compile("\\/\\/.*?\\n");
    private static final Pattern JSDOC = Pattern.compile("(\\/\\*\\*(.*?)\\*\\/)", Pattern.MULTILINE | Pattern.DOTALL);
    private static final Pattern ROUND_BRACKETS = Pattern.compile("(\\(([^(\\[{<'\"]*?)\\))", Pattern.MULTILINE | Pattern.DOTALL);
    private static final Pattern SQUARE_BRACKETS = Pattern.compile("(\\[([^(\\[{<'\"]*?)\\])", Pattern.MULTILINE | Pattern.DOTALL);
    private static final Pattern ANGLE_BRACKETS = Pattern.compile("(<([^(\\[{<'\"]*?)>)", Pattern.MULTILINE | Pattern.DOTALL);
    private static final Pattern FIGURE_BRACKETS = Pattern.compile("(\\{([^(\\[{<'\"]*?)\\})", Pattern.MULTILINE | Pattern.DOTALL);
    private static final Pattern STRING_BRACKETS_SINGLE = Pattern.compile("(\\'([^(\\[{<'\"]*?)\\')", Pattern.MULTILINE | Pattern.DOTALL);
    private static final Pattern STRING_BRACKETS_DOUBLE = Pattern.compile("(\"([^(\\[{<'\"]*?)\")", Pattern.MULTILINE | Pattern.DOTALL);
    private static final Pattern JSDOC_REMOVE_STARTING_STAR = Pattern.compile("(^|\\n)[\\s]*[*]");
    private static final Pattern KEBAB_SPLIT = Pattern.compile("-");
    private static final MutableDataSet flexmarkOptions = new MutableDataSet();
    private static final Parser parser;
    private static final HtmlRenderer htmlRenderer;
    private static final com.vladsch.flexmark.formatter.internal.Formatter formatter;
    private static final List<Extension> extensionList = Arrays.asList(TablesExtension.create(),
            StrikethroughExtension.create(),
            AutolinkExtension.create(),
            InsExtension.create());

    static {
        flexmarkOptions.set(FlexmarkHtmlParserPatched.BR_AS_EXTRA_BLANK_LINES, false);

        parser = Parser.builder(flexmarkOptions).extensions(extensionList).build();
        htmlRenderer = HtmlRenderer.builder(flexmarkOptions).extensions(extensionList).build();
        formatter = Formatter.builder(flexmarkOptions).extensions(extensionList).build();
    }

    private final Path globalRoot;
    private final String globalPackage;
    private final List<String> tokens = new ArrayList<>();
    private final List<String> jsdocTokens = new ArrayList<>();
    private final Set<Module> modules = new HashSet<>();
    private final Map<String, Module> exports = new HashMap<>();
    private final Map<String, Interface> interfaces = new HashMap<>();
    private final Map<String, List<String>> unions = new HashMap<>();

    public GlobalContext(Path globalRoot, String globalPackage) {
        this.globalRoot = globalRoot;
        this.globalPackage = globalPackage;
    }

    public static String renderMarkdown(String markdown) {
        String render = htmlRenderer.render(parser.parse(StringUtils.replace(markdown, "@returns", "@return")));
        return StringUtils.replaceEach(render, new String[]{"<p>", "</p>"}, new String[]{"", "\n"});
    }


    public static boolean is(ListIterator<String> itr, String... token) {
        int skip = 0;
        for (String s : token) {
            if (s != null) {
                skip++;
            } else {
                break;
            }
        }

        int pos = 0;
        for (String s : token) {
            if (!itr.hasNext()) {
                while (pos > 0) {
                    itr.previous();
                    pos--;
                }
                return false;
            }
            String tkn = itr.next();
            pos++;
            if (s != null) {
                if (!s.equals(tkn)) {
                    while (pos > 0) {
                        itr.previous();
                        pos--;
                    }
                    return false;
                }
            }
        }

        while (pos > 0) {
            itr.previous();
            pos--;
        }
        while (skip > 0) {
            itr.next();
            skip--;
        }
        return true;
    }

    @Nullable
    public static String upto(ListIterator<String> itr, String... tokens) {
        StringBuilder sb = new StringBuilder();
        int pos = 0;
        while (itr.hasNext()) {
            String next = itr.next();
            pos++;
            for (String token : tokens) {
                if (token.equals(next)) {
                    itr.previous();
                    return sb.toString().trim();
                }
            }
            sb.append(next).append(" ");
        }

        return sb.toString().trim();
    }

    public static boolean skipToken(ListIterator<String> itr, String... token) {
        int pos = 0;
        for (String s : token) {
            if (!itr.hasNext()) {
                while (pos > 0) {
                    itr.previous();
                    pos--;
                }
                return false;
            }
            String tkn = itr.next();
            pos++;
            if (s != null) {
                if (!s.equals(tkn)) {
                    while (pos > 0) {
                        itr.previous();
                        pos--;
                    }
                    return false;
                }
            }
        }
        return true;
    }

    public static int findAny(ListIterator<String> itr, String... token) {
        int pos = 0;
        while (itr.hasNext()) {
            String next = itr.next();
            pos++;
            if (token.equals(next)) {
                int result = pos;
                while (pos > 0) {
                    itr.previous();
                    pos--;
                }
                return result;
            }
        }

        while (pos > 0) {
            itr.previous();
            pos--;
        }
        return Integer.MAX_VALUE;
    }


    public static String toCamelCase(String kebabCase) {
        return StringUtils.uncapitalize(Stream.of(KEBAB_SPLIT.split(kebabCase))
                .map(StringUtils::capitalize)
                .collect(Collectors.joining()));
    }

    public void registerModule(Module module) {
        modules.add(module);
        module.registerSubmodules();
        module.registerExports();
        module.preprocessModule();
    }

    public void render(String targetPath) throws IOException {
        for (Module module : modules) {
            module.processModule();
        }

        List<Interface> dedupe = interfaces.values().stream()
                .distinct()
                .sorted(Comparator.comparing((Interface i) -> i.getInnerInterfaces().size()).reversed())
                .collect(Collectors.toList());

        for (Interface iface : dedupe) {
            render(iface);

            JavaFile file = JavaFile.builder(iface.getParentModule().getJavaPackage(), iface.getBuilder().build())
                    .build();
            file.writeTo(Paths.get(targetPath, "src", "main", "java"));
        }
    }

    private void render(Interface iface) throws IOException {
        if (iface.isRendered()) {
            return;
        }

        if (iface.getSuperInterfaces().isEmpty()) {
            iface.getBuilder().addSuperinterface(Any.class);
        } else {
            for (String superInterface : iface.getSuperInterfaces()) {
                if ("*".equals(superInterface)) {
                    break;
                }
                Interface superIface = interfaces.get(superInterface);
                if (superIface == null) {
                    iface.getBuilder().addSuperinterface(ClassName.bestGuess(superInterface));
                } else {
                    iface.getBuilder().addSuperinterface(superIface.getClassName());
                }
            }
        }

        String importName = iface.getParentModule().getNpmPackage() + iface.getParentModule().getNpmImport();

        if (iface.getParent() == null) {
            iface.getBuilder().addAnnotation(AnnotationSpec.builder(NpmPackage.class)
                    .addMember("name", "$S", iface.getParentModule().getNpmPackage())
                    .addMember("version", "$S", iface.getParentModule().getNpmVersion())
                    .build());
        }

        if (!iface.getSymbols().isEmpty()) {
            String importedSymbols = iface.getSymbols().stream()
                    .filter(s -> !s.startsWith("?"))
                    .map(s -> "\"" + s + " as " + iface.getClassName().simpleName()+"_"+s + "\"")
                    .collect(Collectors.joining(", "));
            if (!importedSymbols.isEmpty()) {
                iface.getBuilder().addAnnotation(AnnotationSpec.builder(Import.class)
                        .addMember("symbols", "{$L}", importedSymbols)
                        .addMember("module", "$S", importName)
                        .build());
            }
            iface.getSymbols().stream()
                    .filter(s ->s.startsWith("?"))
                    .map(s -> s.substring(1))
                    .findFirst()
                    .ifPresent(s -> {
                        iface.getBuilder().addAnnotation(AnnotationSpec.builder(Import.class)
                                .addMember("symbols", "$S", iface.getClassName().simpleName()+"_"+s)
                                .addMember("module", "$S", importName)
                                .addMember("defaultExport", "true")
                                .build());
                    });

        } else if (iface.getParent() == null){
            iface.getBuilder().addAnnotation(AnnotationSpec.builder(Import.class)
                    .addMember("module", "$S", importName)
                    .build());
        }

        for (Interface innerInterface : iface.getInnerInterfaces()) {
            innerInterface.setParent(iface);
            render(innerInterface);
            iface.getBuilder().addType(innerInterface.getBuilder().addModifiers(Modifier.STATIC).build());
        }

        if (iface.isBuildable() && iface.getBuilderBuilder() != null) {
            iface.getBuilder().addType(iface.getBuilderBuilder().addModifiers(Modifier.STATIC).build());
        }

        iface.setRendered(true);
    }

    public String emptyToken() {
        if (tokens.contains("")) {
            return Integer.toString(tokens.indexOf(""));
        } else {
            tokens.add("");
            return Integer.toString(tokens.size()-1);
        }

    }

    public String resolve(String index) {
        if (!StringUtils.isNumeric(index)) {
            throw new IllegalStateException("Requested dictionary index " + index + " is not an index");
        }
        int ix = Integer.parseInt(index);
        return tokens.get(ix);
    }

    public String resolveJsdoc(String index) {
        if (!StringUtils.isNumeric(index)) {
            throw new IllegalStateException("Requested dictionary index " + index + " is not an index");
        }
        int ix = Integer.parseInt(index);
        return jsdocTokens.get(ix);
    }

    public String reduce(String source) {
        String original = source;
        String processed = COMMENT.matcher(original).replaceAll("");
        do {
            original = processed;
            processed = reduceJsDoc(processed);
        } while (!processed.equals(original));

        processed = StringUtils.replace(processed, "\n", " ");
        processed = StringUtils.replace(processed, "\t", " ");
        processed = StringUtils.replace(processed, ";", " ; ");
        processed = StringUtils.replace(processed, ":", " : ");
        processed = StringUtils.replace(processed, ",", " , ");
        processed = StringUtils.replace(processed, "|", " | ");
        processed = StringUtils.replace(processed, "?", " ? ");
        processed = StringUtils.replace(processed, "...", " ... ");
        processed = StringUtils.replace(processed, "=>", " " + ARROW_TOKEN + " ");

        do {
            original = processed;
            processed = reduce(processed, JSDOC, JSDOC_TOKEN, Function.identity());
            processed = reduce(processed, ROUND_BRACKETS, ROUND_TOKEN, Function.identity());
            processed = reduce(processed, SQUARE_BRACKETS, SQUARE_TOKEN, Function.identity());
            processed = reduce(processed, ANGLE_BRACKETS, ANGLE_TOKEN, Function.identity());
            processed = reduce(processed, FIGURE_BRACKETS, FIGURE_TOKEN, Function.identity());
            processed = reduce(processed, STRING_BRACKETS_SINGLE, STRING_TOKEN, StringEscapeUtils::unescapeEcmaScript);
            processed = reduce(processed, STRING_BRACKETS_DOUBLE, STRING_TOKEN, StringEscapeUtils::unescapeEcmaScript);
        } while (!processed.equals(original));

        // Collapse whitespaces
        for (int i = 0; i < tokens.size(); i++) {
            tokens.set(i, String.join(" ", StringUtils.split(tokens.get(i), " ")));
        }

        return processed;
    }

    private String reduce(String source, Pattern pattern, String marker, Function<String, String> mapper) {
        Matcher matcher = pattern.matcher(source);
        if (matcher.find()) {
            StringBuffer sb = new StringBuffer(source.length());
            String value = matcher.group(2);

            String token;
            if (tokens.contains(value)) {
                token = String.format("%s %d", marker, tokens.indexOf(value));
            } else {
                token = String.format("%s %d", marker, tokens.size());
                tokens.add(value);
            }

            matcher.appendReplacement(sb, " " + token + " ");
            matcher.appendTail(sb);
            return sb.toString();
        }
        return source;
    }

    private String reduceJsDoc(String source) {
        Matcher matcher = JSDOC.matcher(source);
        if (matcher.find()) {
            StringBuffer sb = new StringBuffer(source.length());
            String value = matcher.group(2);
            String token = String.format("%s %d", JSDOC_TOKEN, jsdocTokens.size());
            jsdocTokens.add(JSDOC_REMOVE_STARTING_STAR.matcher(value).replaceAll("$1"));

            matcher.appendReplacement(sb, " " + token + " ");
            matcher.appendTail(sb);
            return sb.toString();
        }
        return source;
    }


}
