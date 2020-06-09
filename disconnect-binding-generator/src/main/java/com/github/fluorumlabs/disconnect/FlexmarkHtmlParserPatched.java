package com.github.fluorumlabs.disconnect;

import com.vladsch.flexmark.ext.emoji.internal.EmojiCheatSheet;
import com.vladsch.flexmark.util.Utils;
import com.vladsch.flexmark.util.format.RomanNumeral;
import com.vladsch.flexmark.util.format.Table;
import com.vladsch.flexmark.util.format.TableFormatOptions;
import com.vladsch.flexmark.util.html.CellAlignment;
import com.vladsch.flexmark.util.html.FormattingAppendable;
import com.vladsch.flexmark.util.html.FormattingAppendableImpl;
import com.vladsch.flexmark.util.options.DataHolder;
import com.vladsch.flexmark.util.options.DataKey;
import com.vladsch.flexmark.util.sequence.BasedSequence;
import com.vladsch.flexmark.util.sequence.BasedSequenceImpl;
import com.vladsch.flexmark.util.sequence.RepeatedCharSequence;
import com.vladsch.flexmark.util.sequence.SubSequence;
import org.jsoup.Jsoup;
import org.jsoup.nodes.*;
import org.jsoup.select.Elements;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Do not escape [ ] and \ in code blocks
 */

@SuppressWarnings({"WeakerAccess", "SameParameterValue"})
public class FlexmarkHtmlParserPatched {
    public static final DataKey<Boolean> LIST_CONTENT_INDENT = new DataKey<Boolean>("LIST_CONTENT_INDENT", true);
    public static final DataKey<Boolean> SETEXT_HEADINGS = new DataKey<Boolean>("SETEXT_HEADINGS", true);
    public static final DataKey<Boolean> OUTPUT_UNKNOWN_TAGS = new DataKey<Boolean>("OUTPUT_UNKNOWN_TAGS", false);
    public static final DataKey<Boolean> TYPOGRAPHIC_QUOTES = new DataKey<Boolean>("TYPOGRAPHIC_QUOTES", true);
    public static final DataKey<Boolean> TYPOGRAPHIC_SMARTS = new DataKey<Boolean>("TYPOGRAPHIC_SMARTS", true);
    public static final DataKey<Boolean> EXTRACT_AUTO_LINKS = new DataKey<Boolean>("EXTRACT_AUTO_LINKS", true);
    public static final DataKey<Boolean> WRAP_AUTO_LINKS = new DataKey<Boolean>("WRAP_AUTO_LINKS", false);
    public static final DataKey<Boolean> RENDER_COMMENTS = new DataKey<Boolean>("RENDER_COMMENTS", false);
    public static final DataKey<Boolean> DOT_ONLY_NUMERIC_LISTS = new DataKey<Boolean>("DOT_ONLY_NUMERIC_LISTS", true);
    public static final DataKey<Boolean> PRE_CODE_PRESERVE_EMPHASIS = new DataKey<Boolean>("PRE_CODE_PRESERVE_EMPHASIS", false);
    public static final DataKey<Character> ORDERED_LIST_DELIMITER = new DataKey<Character>("ORDERED_LIST_DELIMITER", '.');
    public static final DataKey<Character> UNORDERED_LIST_DELIMITER = new DataKey<Character>("UNORDERED_LIST_DELIMITER", '*');
    public static final DataKey<Integer> DEFINITION_MARKER_SPACES = new DataKey<Integer>("DEFINITION_MARKER_SPACES", 3);
    public static final DataKey<Integer> MIN_SETEXT_HEADING_MARKER_LENGTH = new DataKey<Integer>("MIN_SETEXT_HEADING_MARKER_LENGTH", 3);
    public static final DataKey<String> CODE_INDENT = new DataKey<String>("CODE_INDENT", "    ");
    public static final DataKey<String> NBSP_TEXT = new DataKey<String>("NBSP_TEXT", " ");
    public static final DataKey<String> EOL_IN_TITLE_ATTRIBUTE = new DataKey<String>("EOL_IN_TITLE_ATTRIBUTE", " ");
    public static final DataKey<String> THEMATIC_BREAK = new DataKey<String>("THEMATIC_BREAK", "*** ** * ** ***");

    public static final DataKey<Integer> TABLE_MIN_SEPARATOR_COLUMN_WIDTH = TableFormatOptions.MIN_SEPARATOR_COLUMN_WIDTH;
    public static final DataKey<Integer> TABLE_MIN_SEPARATOR_DASHES = TableFormatOptions.MIN_SEPARATOR_DASHES;
    public static final DataKey<Boolean> TABLE_LEAD_TRAIL_PIPES = TableFormatOptions.LEAD_TRAIL_PIPES;
    public static final DataKey<Boolean> TABLE_SPACE_AROUND_PIPES = TableFormatOptions.SPACE_AROUND_PIPES;
    public static final DataKey<Boolean> LISTS_END_ON_DOUBLE_BLANK = new DataKey<Boolean>("LISTS_END_ON_DOUBLE_BLANK", false);
    public static final DataKey<Boolean> DIV_AS_PARAGRAPH = new DataKey<Boolean>("DIV_AS_PARAGRAPH", false);
    public static final DataKey<Boolean> BR_AS_PARA_BREAKS = new DataKey<Boolean>("BR_AS_PARA_BREAKS", true);
    public static final DataKey<Boolean> BR_AS_EXTRA_BLANK_LINES = new DataKey<Boolean>("BR_AS_EXTRA_BLANK_LINES", true);

    private static final Map<Object, CellAlignment> tableCellAlignments = new LinkedHashMap<Object, CellAlignment>();

    static {
        tableCellAlignments.put(Pattern.compile("\\bleft\\b"), CellAlignment.LEFT);
        tableCellAlignments.put(Pattern.compile("\\bcenter\\b"), CellAlignment.CENTER);
        tableCellAlignments.put(Pattern.compile("\\bright\\b"), CellAlignment.RIGHT);
        tableCellAlignments.put("text-left", CellAlignment.LEFT);
        tableCellAlignments.put("text-center", CellAlignment.CENTER);
        tableCellAlignments.put("text-right", CellAlignment.RIGHT);
    }

    private static final Map<String, String> specialCharsMap = new HashMap<String, String>();
    private static final String typographicQuotes = "“|”|‘|’|«|»|&ldquo;|&rdquo;|&lsquo;|&rsquo;|&apos;|&laquo;|&raquo;";
    private static final String typographicSmarts = "…|–|—|&hellip;|&endash;|&emdash;";

    static {
        specialCharsMap.put("“", "\"");
        specialCharsMap.put("”", "\"");
        specialCharsMap.put("&ldquo;", "\"");
        specialCharsMap.put("&rdquo;", "\"");
        specialCharsMap.put("‘", "'");
        specialCharsMap.put("’", "'");
        specialCharsMap.put("&lsquo;", "'");
        specialCharsMap.put("&rsquo;", "'");
        specialCharsMap.put("&apos;", "'");
        specialCharsMap.put("«", "<<");
        specialCharsMap.put("&laquo;", "<<");
        specialCharsMap.put("»", ">>");
        specialCharsMap.put("&raquo;", ">>");
        specialCharsMap.put("…", "...");
        specialCharsMap.put("&hellip;", "...");
        specialCharsMap.put("–", "--");
        specialCharsMap.put("&endash;", "--");
        specialCharsMap.put("—", "---");
        specialCharsMap.put("&emdash;", "---");
    }

    private static final Pattern NUMERIC_DOT_LIST = Pattern.compile("^\\d+\\.$");
    private static final Pattern NUMERIC_PAREN_LIST = Pattern.compile("^\\d+\\)$");
    private static final Pattern NON_NUMERIC_DOT_LIST = Pattern.compile("^(?:(?:" + RomanNumeral.ROMAN_NUMERAL.pattern() + ")|(?:" + RomanNumeral.LOWERCASE_ROMAN_NUMERAL.pattern() + ")|[a-z]+|[A-Z]+)\\.$");
    private static final Pattern NON_NUMERIC_PAREN_LIST = Pattern.compile("^(?:[a-z]+|[A-Z]+)\\)$");

    public static final DataKey<Map<Object, CellAlignment>> TABLE_CELL_ALIGNMENT_MAP = new DataKey<Map<Object, CellAlignment>>("TABLE_CELL_ALIGNMENT_MAP", tableCellAlignments);

    private final HtmlParserPatchedOptions myOptions;
    private final Pattern specialCharsPattern;

    private Stack<State> myStateStack;
    private Map<String, String> myAbbreviations;
    private State myState;
    private boolean myTrace;
    private boolean myInlineCode;
    /**
     * PATCH: myBlockCode = true if we're processing block of code
     */
    private boolean myBlockCode;

    private FlexmarkHtmlParserPatched(DataHolder options) {
        myOptions = new HtmlParserPatchedOptions(options);

        if (myOptions.typographicQuotes && myOptions.typographicSmarts) {
            specialCharsPattern = Pattern.compile(typographicQuotes + "|" + typographicSmarts);
        } else if (myOptions.typographicQuotes) {
            specialCharsPattern = Pattern.compile(typographicQuotes);
        } else if (myOptions.typographicSmarts) {
            specialCharsPattern = Pattern.compile(typographicSmarts);
        } else {
            specialCharsPattern = null;
        }

        //myTrace = true;
        resetForParse();
    }

    private void resetForParse() {
        myStateStack = new Stack<State>();
        myAbbreviations = new HashMap<String, String>();
        myState = null;
    }

    public HtmlParserPatchedOptions getOptions() {
        return myOptions;
    }

    public boolean isTrace() {
        return myTrace;
    }

    public void setTrace(final boolean trace) {
        myTrace = trace;
    }

    /**
     * Parse HTML append to out
     *
     * @param out  formatting appendable to append the resulting Markdown
     * @param html html to be parsed
     */
    public void parse(FormattingAppendable out, String html) {
        Document document = Jsoup.parse(html);

        parse(out, document);
    }

    /**
     * Parse Document append to out
     *
     * @param out  formatting appendable to append the resulting Markdown
     * @param html html to be parsed
     */
    public void parse(FormattingAppendable out, Document html) {
        resetForParse();

        Element body = html.body();

        if (myTrace) {
            FormattingAppendableImpl trace = new FormattingAppendableImpl(0);
            trace.setIndentPrefix("  ");
            dumpHtmlTree(trace, body);
            trace.flush();
            System.out.println(trace.getAppendable());
        }

        processHtmlTree(out, body);

        // output abbreviations if any
        out.blankLine();
        if (!myAbbreviations.isEmpty()) {
            for (Map.Entry<String, String> entry : myAbbreviations.entrySet()) {
                out.line().append("*[").append(entry.getKey()).append("]: ").append(entry.getValue()).line();
            }
        }
        out.blankLine();
    }


    /**
     * Build parser with default options
     *
     * @return html parser instance
     */
    public static FlexmarkHtmlParserPatched build() {
        return new FlexmarkHtmlParserPatched(null);
    }

    /**
     * Build parser
     *
     * @param options parser options
     * @return html parser instance
     */
    public static FlexmarkHtmlParserPatched build(DataHolder options) {
        return new FlexmarkHtmlParserPatched(options);
    }

    public void dumpHtmlTree(FormattingAppendable out, Node node) {
        out.line().append(node.nodeName());
        for (Attribute attribute : node.attributes().asList()) {
            out.append(' ').append(attribute.getKey()).append("=\"").append(attribute.getValue()).append("\"");
        }

        out.line().indent();

        for (Node child : node.childNodes()) {
            dumpHtmlTree(out, child);
        }

        out.unIndent();
    }

    /**
     * Parse HTML with default options
     *
     * @param html html to be parsed
     * @return resulting markdown string
     */
    public static String parse(String html) {
        return parse(html, 1);
    }

    /**
     * Parse HTML with default options and max trailing blank lines
     *
     * @param html html to be parsed
     * @return resulting markdown string
     */
    public static String parse(String html, int maxBlankLines) {
        return parse(html, maxBlankLines, null);
    }

    /**
     * Parse HTML with given options and max trailing blank lines
     *
     * @param html          html to be parsed
     * @param maxBlankLines max trailing blank lines, -1 will suppress trailing EOL
     * @param options       data holder for parsing options
     * @return resulting markdown string
     */
    public static String parse(String html, int maxBlankLines, DataHolder options) {
        FormattingAppendableImpl out = new FormattingAppendableImpl(FormattingAppendable.SUPPRESS_TRAILING_WHITESPACE | FormattingAppendable.COLLAPSE_WHITESPACE);
        FlexmarkHtmlParserPatched parser = new FlexmarkHtmlParserPatched(options);
        parser.parse(out, html);
        return out.getText(maxBlankLines);
    }

    /**
     * Parse HTML with given options and max trailing blank lines
     *
     * @param html          html to be parsed
     * @param maxBlankLines max trailing blank lines, -1 will suppress trailing EOL
     * @param options       data holder for parsing options
     * @return resulting markdown string
     */
    public static String parse(Document html, int maxBlankLines, DataHolder options) {
        FormattingAppendableImpl out = new FormattingAppendableImpl(FormattingAppendable.SUPPRESS_TRAILING_WHITESPACE | FormattingAppendable.COLLAPSE_WHITESPACE);
        FlexmarkHtmlParserPatched parser = new FlexmarkHtmlParserPatched(options);
        parser.parse(out, html);
        return out.getText(maxBlankLines);
    }

    private static class State {
        Node myParent;
        List<Node> myElements;
        int myIndex;

        State(final Node parent) {
            myParent = parent;
            myElements = parent.childNodes();
            myIndex = 0;
        }

        @Override
        public String toString() {
            return "State{" +
                    "myParent=" + myParent +
                    ", myElements=" + myElements +
                    ", myIndex=" + myIndex +
                    '}';
        }
    }

    private String dumpState() {
        if (!myStateStack.isEmpty()) {
            StringBuilder sb = new StringBuilder();

            while (!myStateStack.isEmpty()) {
                State state = myStateStack.pop();
                sb.append("\n").append(state.toString());
            }

            return sb.toString();
        }
        return "";
    }

    private void processHtmlTree(FormattingAppendable out, Node parent) {
        pushState(parent);

        State oldState = myState;
        Node node;

        while ((node = peek()) != null) {
            processElement(out, node);
        }

        if (oldState != myState) {
            throw new IllegalStateException("State not equal after process " + dumpState());
        }

        popState();
    }

    private void processElement(FormattingAppendable out, Node node) {
        TagParam tagParam = getTagParam(node);
        boolean processed = false;

        if (tagParam != null) {
            switch (tagParam.tagType) {
                // @formatter:off
                case A:
                    processed = processA(out, (Element) node);
                    break;
                case BR:
                    processed = processBr(out, (Element) node);
                    break;
                case ABBR:
                    processed = processAbbr(out, (Element) node);
                    break;
                case ASIDE:
                    processed = processAside(out, (Element) node);
                    break;
                case BLOCKQUOTE:
                    processed = processBlockquote(out, (Element) node);
                    break;
                case CODE:
                    processed = processCode(out, (Element) node);
                    break;
                case DEL:
                    processed = processDel(out, (Element) node);
                    break;
                case DIV:
                    processed = processDiv(out, (Element) node);
                    break;
                case DL:
                    processed = processDl(out, (Element) node);
                    break;
                case _EMPHASIS:
                    processed = processEmphasis(out, (Element) node);
                    break;
                case HR:
                    processed = processHr(out, (Element) node);
                    break;
                case IMG:
                    processed = processImg(out, (Element) node);
                    break;
                case INPUT:
                    processed = processInput(out, (Element) node);
                    break;
                case INS:
                    processed = processIns(out, (Element) node);
                    break;
                case OL:
                    processed = processOl(out, (Element) node);
                    break;
                case P:
                    processed = processP(out, (Element) node);
                    break;
                case PRE:
                    processed = processPre(out, (Element) node);
                    break;
                case _STRONG_EMPHASIS:
                    processed = processStrong(out, (Element) node);
                    break;
                case SUB:
                    processed = processSub(out, (Element) node);
                    break;
                case SUP:
                    processed = processSup(out, (Element) node);
                    break;
                case SVG:
                    processed = processSvg(out, (Element) node);
                    break;
                case UL:
                    processed = processUl(out, (Element) node);
                    break;
                case LI:
                    processed = processList(out, (Element) node, false, true);
                    break;
                case TABLE:
                    processed = processTable(out, (Element) node);
                    break;
                case _UNWRAPPED:
                    processed = processUnwrapped(out, node);
                    break;
                case _SPAN:
                    processed = processSpan(out, (Element) node);
                    break;
                case _WRAPPED:
                    processed = processWrapped(out, node, tagParam.param == null);
                    break;
                case _COMMENT:
                    processed = processComment(out, (Comment) node);
                    break;
                case _HEADING:
                    processed = processHeading(out, (Element) node);
                    break;
                case _TEXT:
                    processed = processText(out, (TextNode) node);
                    break;
                // @formatter:on
                default:
                    break;
            }
        } else {
            if (node instanceof Element) {
                processed = processEmoji(out, (Element) node);
            }
        }

        if (!processed) {
            // wrap markdown in HTML tag
            if (myOptions.outputUnknownTags) processWrapped(out, node, null);
            else processUnwrapped(out, node);
        }
    }

    private boolean processWrapped(final FormattingAppendable out, final Node node, Boolean isBlock) {
        if (node instanceof Element && (isBlock == null && ((Element) node).isBlock() || isBlock != null && isBlock)) {
            String s = node.toString();
            int pos = s.indexOf(">");
            out.lineIf(isBlock != null).append(s.substring(0, pos + 1)).lineIf(isBlock != null);
            next();

            processHtmlTree(out, node);

            int endPos = s.lastIndexOf("<");
            out.lineIf(isBlock != null).append(s.substring(endPos)).lineIf(isBlock != null);
        } else {
            out.append(node.toString());
            next();
        }
        return true;
    }

    private String prepareText(String text) {
        if (specialCharsPattern != null) {
            Matcher matcher = specialCharsPattern.matcher(text);
            int length = text.length();
            StringBuilder sb = new StringBuilder(length * 2);
            int lastPos = 0;

            while (matcher.find()) {
                if (lastPos < matcher.start()) {
                    sb.append(text, lastPos, matcher.start());
                }
                sb.append(specialCharsMap.get(matcher.group()));
                lastPos = matcher.end();
            }

            if (lastPos < length) {
                sb.append(text, lastPos, length);
            }

            text = sb.toString();
        }
        /**
         * PATCH: Do not escape if myBlockCode = true
         */
        if (!myBlockCode) {
            text = text.replace("\\", "\\\\").replace("\u00A0", myOptions.nbspText);
        }
        if (!myInlineCode && !myBlockCode) {
            // replace [ ] by escaped versions
            text = text.replace("[", "\\[").replace("]", "\\]");
        }

        return text;
    }

    private boolean processText(FormattingAppendable out, TextNode node) {
        skip();
        if (out.isPreFormatted()) {
            out.append(prepareText(node.getWholeText()));
        } else {
            out.append(prepareText(node.text()));
        }
        return true;
    }

    private void processTextNodes(FormattingAppendable out, Node node) {
        processTextNodes(out, node, null, null);
    }

    private void processTextNodes(FormattingAppendable out, Node node, CharSequence wrapText) {
        processTextNodes(out, node, wrapText, wrapText);
    }

    private void processTextNodes(FormattingAppendable out, Node node, CharSequence textPrefix, CharSequence textSuffix) {
        pushState(node);

        Node child;

        while ((child = peek()) != null) {
            if (child instanceof TextNode) {
                if (textPrefix != null && textPrefix.length() > 0) out.append(textPrefix);
                String text = ((TextNode) child).getWholeText();
                String preparedText = prepareText(text);
                out.append(preparedText);
                if (textSuffix != null && textSuffix.length() > 0) out.append(textSuffix);
                skip();
            } else if (child instanceof Element) {
                processElement(out, child);
            } else {
                skip();
            }
        }

        popState();
    }

    private void wrapTextNodes(FormattingAppendable out, Node node, CharSequence wrapText, boolean needSpaceAround) {
        String text = processTextNodes(node);
        String prefixBefore = null;
        String appendAfter = null;
        boolean addSpaceBefore = false;
        boolean addSpaceAfter = false;

        if (!text.isEmpty() && needSpaceAround) {
            if ("\u00A0 \t\n".indexOf(text.charAt(0)) != -1) {
                prefixBefore = prepareText(text.substring(0, 1));
                text = text.substring(1);
            } else if (text.startsWith("&nbsp;")) {
                prefixBefore = "&nbsp;";
                text = text.substring(prefixBefore.length());
            } else {
                // if we already have space or nothing before us
                addSpaceBefore = !(out.isPendingEOL() || out.isPendingSpace() || out.getModCount() == 0);
            }

            if (!text.isEmpty() && "\u00A0 \t\n".indexOf(text.charAt(text.length() - 1)) != -1) {
                appendAfter = prepareText(text.substring(text.length() - 1));
                text = text.substring(0, text.length() - 1);
            } else if (text.endsWith("&nbsp;")) {
                appendAfter = "&nbsp;";
                text = text.substring(0, text.length() - appendAfter.length());
            } else {
                // if next is not text space
                Node next = peek();
                addSpaceAfter = true;

                if (next instanceof TextNode) {
                    String nextText = ((TextNode) next).getWholeText();
                    if (!nextText.isEmpty() && Character.isWhitespace(nextText.charAt(0))) {
                        addSpaceAfter = false;
                    }
                }
            }
        }

        if (!text.isEmpty()) {
            // need to trim end of string
            int pos = text.length() - 1;
            while (pos >= 0 && Character.isWhitespace(text.charAt(pos))) pos--;
            pos++;

            if (pos > 0) {
                if (prefixBefore != null) out.append(prefixBefore);
                if (addSpaceBefore) out.append(' ');

                text = text.substring(0, pos);
                out.append(wrapText);
                out.append(text);
                out.append(wrapText);

                if (appendAfter != null) out.append(appendAfter);
                if (addSpaceAfter) out.append(' ');
            }
        }
    }

    private String processTextNodes(Node node) {
        pushState(node);

        Node child;
        FormattingAppendable out = new FormattingAppendableImpl(0);

        while ((child = peek()) != null) {
            if (child instanceof TextNode) {
                String text = ((TextNode) child).getWholeText();
                out.append(prepareText(text));
                skip();
            } else if (child instanceof Element) {
                processElement(out, child);
            }
        }

        popState();
        return out.getText();
    }

    private boolean processA(FormattingAppendable out, Element element) {
        skip();

        // see if it is an anchor or a link
        if (element.hasAttr("href")) {
            String text = Utils.removeStart(Utils.removeEnd(processTextNodes(element), '\n'), '\n');
            String href = element.attr("href");
            String title = element.hasAttr("title") ? element.attr("title") : null;

            if (!text.isEmpty() || !href.contains("#")) {
                if (myOptions.extractAutoLinks && href.equals(text) && (title == null || title.isEmpty())) {
                    if (myOptions.wrapAutoLinks) out.append('<');
                    out.append(text);
                    if (myOptions.wrapAutoLinks) out.append('>');
                } else {
                    out.append('[');
                    out.append(text);
                    out.append(']');
                    out.append('(').append(href);
                    if (title != null)
                        out.append(" \"").append(element.attr("title").replace("\n", myOptions.eolInTitleAttribute).replace("\"", "\\\"")).append('"');
                    out.append(")");
                }
            }
        } else {
            processTextNodes(out, element);
        }
        return true;
    }

    private boolean processBr(FormattingAppendable out, Element element) {
        skip();
        if (out.isPreFormatted()) {
            out.append('\n');
        } else {
            int options = out.getOptions();
            out.setOptions(options & ~(FormattingAppendable.SUPPRESS_TRAILING_WHITESPACE | FormattingAppendable.COLLAPSE_WHITESPACE));
            if (out.getPendingEOL() == 0) {
                // hard break
                out.repeat(' ', 2).line();
            } else {
                if (out.getPendingEOL() == 1) {
                    final String s = out.getAppendable().toString();
                    if (!s.endsWith("<br />")) {
                        // this is a paragraph break
                        if (myOptions.brAsParaBreaks) {
                            out.blankLine();
                        }
                    } else {
                        // this is blank line insertion via <br />
                        if (myOptions.brAsExtraBlankLines) {
                            out.append("<br />").line();
                        }
                    }
                } else {
                    // this is blank line insertion via <br />
                    if (myOptions.brAsExtraBlankLines) {
                        out.append("<br />").line();
                    }
                }
            }
            out.setOptions(options);
        }
        return true;
    }

    private boolean processAbbr(FormattingAppendable out, Element element) {
        skip();

        // see if it is an anchor or a link
        if (element.hasAttr("title")) {
            String text = processTextNodes(element).trim();
            myAbbreviations.put(text, element.attr("title"));
        }
        return true;
    }

    private boolean processAside(FormattingAppendable out, Element element) {
        skip();
        out.pushPrefix();
        out.addPrefix("| ");
        processHtmlTree(out, element);
        out.popPrefix();
        return true;
    }

    private boolean processBlockquote(FormattingAppendable out, Element element) {
        skip();
        out.pushPrefix();
        out.addPrefix("> ");
        processHtmlTree(out, element);
        out.popPrefix();
        return true;
    }

    private boolean processCode(FormattingAppendable out, Element element) {
        skip();
        BasedSequence text = SubSequence.of(element.ownText());
        int backTickCount = getMaxRepeatedChars(text, '`', 1);
        CharSequence backTicks = RepeatedCharSequence.of("`", backTickCount);
        boolean oldInlineCode = myInlineCode;
        myInlineCode = true;
        processTextNodes(out, element, backTicks);
        myInlineCode = oldInlineCode;
        return true;
    }

    private int getMaxRepeatedChars(final CharSequence text, final char c, int minCount) {
        BasedSequence chars = BasedSequenceImpl.of(text);
        int lastPos = 0;
        while (lastPos < chars.length()) {
            int pos = chars.indexOf(c, lastPos);
            if (pos < 0) break;
            int count = chars.countChars(c, pos);
            if (minCount <= count) minCount = count + 1;
            lastPos = pos + count;
        }
        return minCount;
    }

    private boolean processDel(FormattingAppendable out, Element element) {
        skip();
        if (!myOptions.preCodePreserveEmphasis && out.isPreFormatted()) {
            wrapTextNodes(out, element, "", false);
        } else {
            wrapTextNodes(out, element, "~~", true);
        }
        return true;
    }

    private boolean processEmphasis(FormattingAppendable out, Element element) {
        skip();
        if (!myOptions.preCodePreserveEmphasis && out.isPreFormatted()) {
            wrapTextNodes(out, element, "", false);
        } else {
            wrapTextNodes(out, element, "*", true);
        }
        return true;
    }

    private boolean processHeading(FormattingAppendable out, Element element) {
        skip();

        TagParam tagParam = getTagParam(element);
        if (tagParam != null) {
            int level = (Integer) tagParam.param;
            if (level >= 1 && level <= 6) {
                String headingText = processTextNodes(element).trim();
                if (!headingText.isEmpty()) {
                    out.blankLine();

                    if (myOptions.setextHeadings && level <= 2) {
                        out.append(headingText);
                        out.line().repeat(level == 1 ? '=' : '-', Utils.minLimit(headingText.length(), myOptions.minSetextHeadingMarkerLength));
                    } else {
                        out.repeat('#', level).append(' ');
                        out.append(headingText);
                    }
                    out.blankLine();
                }
            }
        }
        return true;
    }

    private boolean processHr(FormattingAppendable out, Element element) {
        skip();
        out.blankLine().append(myOptions.thematicBreak).blankLine();
        return true;
    }

    private boolean processImg(FormattingAppendable out, Element element) {
        skip();

        // see if it is an anchor or a link
        if (element.hasAttr("src")) {
            String src = element.attr("src");
            EmojiCheatSheet.EmojiShortcut shortcut = EmojiCheatSheet.getImageShortcut(src);
            if (shortcut != null) {
                out.append(':').append(shortcut.name).append(':');
            } else {
                out.append("![");
                if (element.hasAttr("alt")) out.append(element.attr("alt"));
                out.append(']');
                out.append('(');
                int pos = src.indexOf('?');
                int eol = pos < 0 ? pos : src.indexOf("%0A", pos);
                if (pos > 0 && eol > 0) {
                    out.append(src, 0, pos + 1);
                    String decoded = Utils.urlDecode(src.substring(pos + 1).replace("+", "%2B"), "UTF8");
                    out.line().append(decoded);
                } else {
                    out.append(src);
                }
                if (element.hasAttr("title"))
                    out.append(" \"").append(element.attr("title").replace("\n", myOptions.eolInTitleAttribute).replace("\"", "\\\"")).append('"');
                out.append(")");
            }
        }
        return true;
    }

    private boolean processP(FormattingAppendable out, Element element) {
        skip();
        boolean isItemParagraph = false;
        boolean isDefinitionItemParagraph = false;
        /**
         * PATCH: isFirstQuoteParagraph = true for first <p> in <blockquote>
         */
        boolean isFirstQuoteParagraph = false;

        Element firstElementSibling = element.firstElementSibling();
        if (firstElementSibling == null || element == firstElementSibling) {
            String tagName = element.parent().tagName();
            isItemParagraph = tagName.equalsIgnoreCase("li");
            isDefinitionItemParagraph = tagName.equalsIgnoreCase("dd");
            isFirstQuoteParagraph = tagName.equalsIgnoreCase("blockquote");
        }
        out.blankLineIf(!(isItemParagraph || isDefinitionItemParagraph || isFirstQuoteParagraph));
        processTextNodes(out, element);
        out.blankLineIf(isItemParagraph || isDefinitionItemParagraph).line();
        return true;
    }

    private boolean processInput(FormattingAppendable out, Element element) {
        boolean isItemParagraph = false;

        Element firstElementSibling = element.firstElementSibling();
        if (firstElementSibling == null || element == firstElementSibling) {
            String tagName = element.parent().tagName();
            isItemParagraph = tagName.equalsIgnoreCase("li");
        }

        if (isItemParagraph) {
            if (element.hasAttr("type") && "checkbox".equalsIgnoreCase(element.attr("type"))) {
                skip();
                if (element.hasAttr("checked")) {
                    out.append("[x] ");
                } else {
                    out.append("[ ] ");
                }
                return true;
            }
        }
        return false;
    }

    private boolean processIns(FormattingAppendable out, Element element) {
        skip();
        if (!myOptions.preCodePreserveEmphasis && out.isPreFormatted()) {
            wrapTextNodes(out, element, "", false);
        } else {
            wrapTextNodes(out, element, "++", true);
        }
        return true;
    }

    private boolean processStrong(FormattingAppendable out, Element element) {
        skip();
        if (!myOptions.preCodePreserveEmphasis && out.isPreFormatted()) {
            wrapTextNodes(out, element, "", false);
        } else {
            wrapTextNodes(out, element, "**", true);
        }
        return true;
    }

    private boolean processSub(FormattingAppendable out, Element element) {
        skip();
        if (!myOptions.preCodePreserveEmphasis && out.isPreFormatted()) {
            wrapTextNodes(out, element, "", false);
        } else {
            wrapTextNodes(out, element, "~", false);
        }
        return true;
    }

    private boolean processSup(FormattingAppendable out, Element element) {
        skip();
        if (!myOptions.preCodePreserveEmphasis && out.isPreFormatted()) {
            wrapTextNodes(out, element, "", false);
        } else {
            wrapTextNodes(out, element, "^", false);
        }
        return true;
    }

    private boolean processSvg(FormattingAppendable out, Element element) {
        if (element.hasClass("octicon")) {
            skip();
            return true;
        }
        return false;
    }

    private boolean processPre(FormattingAppendable out, Element element) {
        pushState(element);

        Node next = peek();

        String text;
        boolean hadCode = false;
        String className = "";

        /**
         * PATCH: Set myBlockCode = true
         */
        boolean oldBlockCode = myBlockCode;
        myBlockCode = true;

        if (next != null && next.nodeName().equalsIgnoreCase("code")) {
            hadCode = true;
            Element code = (Element) next;
            //text = code.toString();
            FormattingAppendable preText = new FormattingAppendableImpl(out.getOptions() & ~(FormattingAppendable.COLLAPSE_WHITESPACE | FormattingAppendable.SUPPRESS_TRAILING_WHITESPACE));
            preText.openPreFormatted(false);
            processHtmlTree(preText, code);
            preText.closePreFormatted();
            text = preText.getText(2);
            skip(1);
            className = Utils.removeStart(code.className(), "language-");
        } else {
            FormattingAppendable preText = new FormattingAppendableImpl(out.getOptions() & ~(FormattingAppendable.COLLAPSE_WHITESPACE | FormattingAppendable.SUPPRESS_TRAILING_WHITESPACE));
            preText.openPreFormatted(false);
            processHtmlTree(preText, element);
            preText.closePreFormatted();
            text = preText.getText(2);
        }

        /**
         * PATCH: Restore myBlockCode
         */
        myBlockCode = oldBlockCode;

        //int start = text.indexOf('>');
        //int end = text.lastIndexOf('<');
        //text = text.substring(start + 1, end);
        //text = Escaping.unescapeHtml(text);

        int backTickCount = getMaxRepeatedChars(text, '`', 3);
        CharSequence backTicks = RepeatedCharSequence.of("`", backTickCount);

        if (!className.isEmpty() || text.trim().isEmpty() || !hadCode) {
            out.blankLine().append(backTicks);
            if (!className.isEmpty()) {
                out.append(className);
            }
            out.line();
            out.openPreFormatted(true);
            out.append(text.isEmpty() ? "\n" : text);
            out.closePreFormatted();
            out.line().append(backTicks).blankLine();
        } else {
            // we indent the whole thing by 4 spaces
            out.blankLine();
            out.pushPrefix();
            out.addPrefix(myOptions.codeIndent);
            out.openPreFormatted(true);
            out.append(text.isEmpty() ? "\n" : text);
            out.closePreFormatted();
            out.blankLine();
            out.popPrefix();
        }

        popState();
        next();
        return true;
    }

    private static class ListState {
        boolean isNumbered;
        int itemCount;

        ListState(final boolean isNumbered) {
            this.isNumbered = isNumbered;
            itemCount = 0;
        }

        String getItemPrefix(final HtmlParserPatchedOptions options) {
            if (isNumbered) {
                return String.format("%d%c ", itemCount, options.orderedListDelimiter);
            } else {
                return String.format("%c ", options.unorderedListDelimiter);
            }
        }
    }

    private void processListItem(FormattingAppendable out, Element item, ListState listState) {
        skip();
        pushState(item);

        listState.itemCount++;
        CharSequence itemPrefix = listState.getItemPrefix(this.myOptions);
        CharSequence childPrefix = RepeatedCharSequence.of(" ", myOptions.listContentIndent ? itemPrefix.length() : 4);

        out.line().append(itemPrefix);
        out.pushPrefix();
        out.addPrefix(childPrefix);
        int offset = out.offset();
        processHtmlTree(out, item);
        if (offset == out.offset()) {
            // completely empty, add space and make sure it is not suppressed
            out.append(' ');
            out.flushWhitespaces();
        }
        out.line();
        out.popPrefix();
        popState();
    }

    private boolean hasListItemParent(Element element) {
        Element parent = element.parent();
        while (parent != null) {
            if (parent.tagName().equalsIgnoreCase("li")) {
                return true;
            }
            parent = parent.parent();
        }
        return false;
    }

    private boolean processList(FormattingAppendable out, Element element, boolean isNumbered, boolean isFakeList) {
        if (!isFakeList) {
            skip();
            pushState(element);
        }

        final Element previousElementSibling = element.previousElementSibling();
        final String tag = previousElementSibling == null ? null : previousElementSibling.tagName().toUpperCase();
        if (tag != null && tag.equals(element.tagName().toUpperCase()) && (tag.equals("UL") || tag.equals("OL"))) {
            if (myOptions.listsEndOnDoubleBlank) {
                out.blankLine(2);
            } else {
                out.line().append("<!-- -->").line();
            }
        }

        ListState listState = new ListState(isNumbered);

        Node item;
        while ((item = peek()) != null) {
            TagParam tagParam = getTagParam(item);
            if (tagParam != null) {
                switch (tagParam.tagType) {
                    case LI:
                        processListItem(out, (Element) item, listState);
                        break;
                    case P:
                        processListItem(out, (Element) item, listState);
                        break;
                    default:
                        skip();
                        break;
                }
            } else {
                processWrapped(out, item, true);
            }
        }

        out.blankLine();

        if (!isFakeList) {
            popState();
        }
        return true;
    }

    private boolean processOl(FormattingAppendable out, Element element) {
        return processList(out, element, true, false);
    }

    private boolean processUl(FormattingAppendable out, Element element) {
        return processList(out, element, false, false);
    }

    private void processDefinition(FormattingAppendable out, Element item) {
        pushState(item);
        int options = out.getOptions();
        Elements children = item.children();
        boolean firstIsPara = false;

        if (!children.isEmpty() && children.get(0).tagName().equalsIgnoreCase("p")) {
            // we need a blank line
            out.blankLine();
            firstIsPara = true;
        }

        CharSequence childPrefix = RepeatedCharSequence.of(" ", myOptions.listContentIndent ? myOptions.definitionMarkerSpaces + 1 : 4);

        out.line().setOptions(options & ~FormattingAppendable.COLLAPSE_WHITESPACE);
        out.append(':').repeat(' ', myOptions.definitionMarkerSpaces);
        out.pushPrefix();
        out.addPrefix(childPrefix);
        out.setOptions(options);
        if (firstIsPara) {
            processHtmlTree(out, item);
        } else {
            processTextNodes(out, item);
        }
        out.popPrefix();
        popState();
    }

    private boolean processDl(FormattingAppendable out, Element element) {
        skip();
        pushState(element);

        Node item;
        boolean lastWasDefinition = true;
        boolean firstItem = true;

        while ((item = next()) != null) {
            TagParam tagParam = getTagParam(item);
            if (tagParam != null) {
                switch (tagParam.tagType) {
                    case DT:
                        out.blankLineIf(lastWasDefinition).lineIf(!firstItem);
                        processTextNodes(out, item);
                        out.line();
                        lastWasDefinition = false;
                        firstItem = false;
                        break;
                    case DD:
                        processDefinition(out, (Element) item);
                        lastWasDefinition = true;
                        firstItem = false;
                        break;
                    default:
                        break;
                }
            } else {
                processWrapped(out, item, true);
            }
        }

        popState();
        return true;
    }

    private boolean processDiv(FormattingAppendable out, Element element) {
        // unwrap and process content
        skip();
        processHtmlTree(out, element);
        out.line();
        if (myOptions.divAsParagraph) out.blankLine();
        return true;
    }

    private boolean processUnwrapped(FormattingAppendable out, Node element) {
        // unwrap and process content
        skip();
        processHtmlTree(out, element);
        return true;
    }

    private boolean processSpan(FormattingAppendable out, Element element) {
        // unwrap and process content
        if (element.hasAttr("style")) {
            String style = element.attr("style");
            if (style.equals("mso-list:Ignore")) {
                skip();
                String text = processTextNodes(element);
                if (NUMERIC_DOT_LIST.matcher(text).matches()) {
                    out.append(text).append(' ');
                } else if (NUMERIC_PAREN_LIST.matcher(text).matches()) {
                    if (myOptions.dotOnlyNumericLists) {
                        out.append(text, 0, text.length() - 1).append(". ");
                    } else {
                        out.append(text).append(' ');
                    }
                } else if (NON_NUMERIC_DOT_LIST.matcher(text).matches()) {
                    out.append("1. ");
                } else if (NON_NUMERIC_PAREN_LIST.matcher(text).matches()) {
                    if (myOptions.dotOnlyNumericLists) {
                        out.append("1. ");
                    } else {
                        out.append("1) ");
                    }
                } else if (text.equals("·")) {
                    out.append("* ");
                } else {
                    out.append("* ").append(text);
                }
                return true;
            }
        }

        skip();
        processHtmlTree(out, element);
        return true;
    }

    private boolean processEmoji(FormattingAppendable out, Element element) {
        if (element.tagName().equalsIgnoreCase("g-emoji")) {
            if (element.hasAttr("alias")) {
                skip();
                out.append(':').append(element.attr("alias")).append(':');
                return true;
            }
            if (element.hasAttr("fallback-src")) {
                EmojiCheatSheet.EmojiShortcut shortcut = EmojiCheatSheet.getImageShortcut(element.attr("fallback-src"));
                if (shortcut != null) {
                    skip();
                    out.append(':').append(shortcut.name).append(':');
                    return true;
                }
            }
        }
        return false;
    }

    private boolean processComment(FormattingAppendable out, Comment element) {
        skip();
        if (myOptions.renderComments) {
            out.append("<!--").append(element.getData()).append("-->");
        }
        return true;
    }

    private TagParam getTagParam(final Node node) {
        return ourTagProcessors.get(node.nodeName().toLowerCase());
    }

    private Table myTable;

    private boolean processTable(FormattingAppendable out, Element table) {
        Table oldTable = myTable;

        skip();
        pushState(table);

        myTable = new Table(myOptions.tableOptions);

        Node item;
        while ((item = next()) != null) {
            TagParam tagParam = getTagParam(item);
            if (tagParam != null) {
                switch (tagParam.tagType) {
                    case CAPTION:
                        processTableCaption(out, (Element) item);
                        break;
                    case TBODY:
                        myTable.setHeading(false);
                        processTableSection(out, (Element) item);
                        break;
                    case THEAD:
                        myTable.setHeading(true);
                        processTableSection(out, (Element) item);
                        break;
                    case TR:
                        Element tableRow = (Element) item;
                        Elements children = tableRow.children();
                        myTable.setHeading(!children.isEmpty() && children.get(0).tagName().equalsIgnoreCase("th"));
                        processTableRow(out, (Element) item);
                        break;
                }
            } else {
                // nothing
                //processWrapped(out, item, null);
            }
        }

        myTable.finalizeTable();
        int sepColumns = myTable.getMaxColumns();

        if (sepColumns > 0) {
            out.blankLine();
            myTable.appendTable(out);
            out.blankLine();
        }

        myTable = oldTable;
        popState();
        return true;
    }

    private void processTableSection(FormattingAppendable out, Element element) {
        pushState(element);

        Node node;
        while ((node = next()) != null) {
            TagParam tagParam = getTagParam(node);
            if (tagParam != null) {
                switch (tagParam.tagType) {
                    case TR: {
                        Element tableRow = (Element) node;
                        Elements children = tableRow.children();
                        boolean wasHeading = myTable.isHeading();

                        if (!children.isEmpty()) {
                            if (children.get(0).tagName().equalsIgnoreCase("th")) {
                                myTable.setHeading(true);
                            }
                        }

                        processTableRow(out, tableRow);
                        myTable.setHeading(wasHeading);
                        break;
                    }
                }
            } else {
                processWrapped(out, element, true);
            }
        }

        popState();
    }

    private void processTableRow(FormattingAppendable out, Element element) {
        pushState(element);

        Node node;
        while ((node = next()) != null) {
            TagParam tagParam = getTagParam(node);
            if (tagParam != null) {
                switch (tagParam.tagType) {
                    // @formatter:off
                    case TH:
                        processTableCell(out, (Element) node);
                        break;
                    case TD:
                        processTableCell(out, (Element) node);
                        break;
                    // @formatter:on
                }
            } else {
                processWrapped(out, element, true);
            }
        }

        myTable.nextRow();
        popState();
    }

    private void processTableCaption(FormattingAppendable out, Element element) {
        myTable.setCaption(processTextNodes(element).trim());
    }

    private void processTableCell(FormattingAppendable out, Element element) {
        String cellText = processTextNodes(element).trim().replaceAll("\\s*\n\\s*", " ");
        int colSpan = 1;
        int rowSpan = 1;
        CellAlignment alignment = null;

        if (element.hasAttr("colSpan")) {
            try {
                colSpan = Integer.parseInt(element.attr("colSpan"));
            } catch (NumberFormatException ignored) {

            }
        }

        if (element.hasAttr("rowSpan")) {
            try {
                rowSpan = Integer.parseInt(element.attr("rowSpan"));
            } catch (NumberFormatException ignored) {

            }
        }

        if (element.hasAttr("align")) {
            alignment = CellAlignment.getAlignment(element.attr("align"));
        } else {
            // see if has class that matches
            final Set<String> classNames = element.classNames();
            if (!classNames.isEmpty()) {
                for (String clazz : classNames) {
                    CellAlignment cellAlignment = myOptions.tableCellAlignmentMap.get(clazz);
                    if (cellAlignment != null) {
                        alignment = cellAlignment;
                        break;
                    }
                }

                if (alignment == null) {
                    // see if we have matching patterns
                    for (Object key : myOptions.tableCellAlignmentMap.keySet()) {
                        if (key instanceof Pattern) {
                            Pattern pattern = (Pattern) key;
                            for (String clazz : classNames) {
                                if (pattern.matcher(clazz).find()) {
                                    // have a match
                                    alignment = myOptions.tableCellAlignmentMap.get(key);
                                    break;
                                }
                            }

                            if (alignment != null) break;
                        }
                    }
                }
            }
        }

        // skip cells defined by row spans in previous rows
        myTable.addCell(new Table.TableCell(SubSequence.NULL, cellText, BasedSequence.NULL, rowSpan, colSpan, alignment));
    }

    private void pushState(Node parent) {
        myStateStack.push(myState);
        myState = new State(parent);
    }

    private void popState() {
        if (myStateStack.isEmpty()) throw new IllegalStateException("popState with an empty stack");
        myState = myStateStack.pop();
    }

    private Node peek() {
        if (myState.myIndex < myState.myElements.size()) return myState.myElements.get(myState.myIndex);
        return null;
    }

    private Node peek(int skip) {
        if (myState.myIndex + skip >= 0 && myState.myIndex + skip < myState.myElements.size())
            return myState.myElements.get(myState.myIndex + skip);
        return null;
    }

    private Node next() {
        Node next = peek();
        if (next != null) myState.myIndex++;
        return next;
    }

    private void skip() {
        Node next = peek();
        if (next != null) myState.myIndex++;
    }

    private Node next(int skip) {
        if (skip > 0) {
            Node next = peek(skip - 1);
            if (next != null) myState.myIndex += skip;
            return next;
        }
        return peek();
    }

    @SuppressWarnings("SameParameterValue")
    private void skip(int skip) {
        if (skip > 0) {
            Node next = peek(skip - 1);
            if (next != null) myState.myIndex += skip;
        }
    }

    enum TagType {
        A,
        ABBR,
        ASIDE,
        BR,
        BLOCKQUOTE,
        CAPTION,
        CODE,
        DEL,
        DIV,
        DL,
        DD,
        DT,
        _EMPHASIS,
        HR,
        IMG,
        INPUT,
        INS,
        LI,
        OL,
        P,
        PRE,
        _STRONG_EMPHASIS,
        SUB,
        SUP,
        SVG,
        TABLE,
        TBODY,
        TD,
        TH,
        THEAD,
        TR,
        UL,
        _HEADING,
        _UNWRAPPED,
        _SPAN,
        _WRAPPED,
        _COMMENT,
        _TEXT,
    }

    private static class TagParam {
        final TagType tagType;
        final Object param;

        TagParam(final TagType tagType, final Object param) {
            this.tagType = tagType;
            this.param = param;
        }

        static TagParam tag(TagType tagType, Object param) {
            return new TagParam(tagType, param);
        }
    }

    private final static Map<String, TagParam> ourTagProcessors = new HashMap<String, TagParam>();

    static {
        ourTagProcessors.put("a", TagParam.tag(TagType.A, null));
        ourTagProcessors.put("abbr", TagParam.tag(TagType.ABBR, null));
        ourTagProcessors.put("aside", TagParam.tag(TagType.ASIDE, null));
        ourTagProcessors.put("br", TagParam.tag(TagType.BR, null));
        ourTagProcessors.put("blockquote", TagParam.tag(TagType.BLOCKQUOTE, null));
        ourTagProcessors.put("caption", TagParam.tag(TagType.CAPTION, null));
        ourTagProcessors.put("code", TagParam.tag(TagType.CODE, null));
        ourTagProcessors.put("del", TagParam.tag(TagType.DEL, null));
        ourTagProcessors.put("div", TagParam.tag(TagType.DIV, null));
        ourTagProcessors.put("dd", TagParam.tag(TagType.DD, null));
        ourTagProcessors.put("dl", TagParam.tag(TagType.DL, null));
        ourTagProcessors.put("dt", TagParam.tag(TagType.DT, null));
        ourTagProcessors.put("i", TagParam.tag(TagType._EMPHASIS, null));
        ourTagProcessors.put("em", TagParam.tag(TagType._EMPHASIS, null));
        ourTagProcessors.put("h1", TagParam.tag(TagType._HEADING, 1));
        ourTagProcessors.put("h2", TagParam.tag(TagType._HEADING, 2));
        ourTagProcessors.put("h3", TagParam.tag(TagType._HEADING, 3));
        ourTagProcessors.put("h4", TagParam.tag(TagType._HEADING, 4));
        ourTagProcessors.put("h5", TagParam.tag(TagType._HEADING, 5));
        ourTagProcessors.put("h6", TagParam.tag(TagType._HEADING, 6));
        ourTagProcessors.put("hr", TagParam.tag(TagType.HR, null));
        ourTagProcessors.put("img", TagParam.tag(TagType.IMG, null));
        ourTagProcessors.put("input", TagParam.tag(TagType.INPUT, null));
        ourTagProcessors.put("ins", TagParam.tag(TagType.INS, null));
        ourTagProcessors.put("u", TagParam.tag(TagType.INS, null));
        ourTagProcessors.put("li", TagParam.tag(TagType.LI, null));
        ourTagProcessors.put("ol", TagParam.tag(TagType.OL, null));
        ourTagProcessors.put("p", TagParam.tag(TagType.P, null));
        ourTagProcessors.put("pre", TagParam.tag(TagType.PRE, null));
        ourTagProcessors.put("b", TagParam.tag(TagType._STRONG_EMPHASIS, null));
        ourTagProcessors.put("strong", TagParam.tag(TagType._STRONG_EMPHASIS, null));
        ourTagProcessors.put("strike", TagParam.tag(TagType.DEL, null));
        ourTagProcessors.put("sub", TagParam.tag(TagType.SUB, null));
        ourTagProcessors.put("sup", TagParam.tag(TagType.SUP, null));
        ourTagProcessors.put("svg", TagParam.tag(TagType.SVG, null));
        ourTagProcessors.put("table", TagParam.tag(TagType.TABLE, null));
        ourTagProcessors.put("tbody", TagParam.tag(TagType.TBODY, null));
        ourTagProcessors.put("td", TagParam.tag(TagType.TD, null));
        ourTagProcessors.put("th", TagParam.tag(TagType.TH, null));
        ourTagProcessors.put("thead", TagParam.tag(TagType.THEAD, null));
        ourTagProcessors.put("tr", TagParam.tag(TagType.TR, null));
        ourTagProcessors.put("ul", TagParam.tag(TagType.UL, null));
        ourTagProcessors.put("#comment", TagParam.tag(TagType._COMMENT, null));
        ourTagProcessors.put("#text", TagParam.tag(TagType._TEXT, null));

        // keep wrapped
        ourTagProcessors.put("kbd", TagParam.tag(TagType._WRAPPED, false));
        ourTagProcessors.put("var", TagParam.tag(TagType._WRAPPED, false));

        // tags ignored, contents processed
        ourTagProcessors.put("article", TagParam.tag(TagType._UNWRAPPED, null));
        ourTagProcessors.put("address", TagParam.tag(TagType._UNWRAPPED, null));
        ourTagProcessors.put("article", TagParam.tag(TagType._UNWRAPPED, null));
        ourTagProcessors.put("frameset", TagParam.tag(TagType._UNWRAPPED, null));
        ourTagProcessors.put("section", TagParam.tag(TagType._UNWRAPPED, null));
        ourTagProcessors.put("span", TagParam.tag(TagType._SPAN, null));
        ourTagProcessors.put("small", TagParam.tag(TagType._UNWRAPPED, null));
        ourTagProcessors.put("iframe", TagParam.tag(TagType._UNWRAPPED, null));
    }
}
