package com.github.fluorumlabs.disconnect;

import com.vladsch.flexmark.util.Utils;
import com.vladsch.flexmark.util.format.TableFormatOptions;
import com.vladsch.flexmark.util.html.CellAlignment;
import com.vladsch.flexmark.util.options.DataHolder;
import com.vladsch.flexmark.util.options.MutableDataHolder;
import com.vladsch.flexmark.util.options.MutableDataSetter;

import java.util.Map;

@SuppressWarnings("WeakerAccess")
public class HtmlParserPatchedOptions implements MutableDataSetter {
    public boolean listContentIndent;
    public boolean setextHeadings;
    public boolean outputUnknownTags;
    public boolean typographicQuotes;
    public boolean typographicSmarts;
    public boolean wrapAutoLinks;
    public boolean extractAutoLinks;
    public boolean renderComments;
    public boolean dotOnlyNumericLists;
    public boolean preCodePreserveEmphasis;
    public boolean listsEndOnDoubleBlank;
    public boolean divAsParagraph;
    public boolean brAsParaBreaks;
    public boolean brAsExtraBlankLines;
    public char orderedListDelimiter;
    public char unorderedListDelimiter;
    public int definitionMarkerSpaces;
    public int minSetextHeadingMarkerLength;
    public String codeIndent;
    public String eolInTitleAttribute;
    public String nbspText;
    public String thematicBreak;
    public Map<Object, CellAlignment> tableCellAlignmentMap;
    public TableFormatOptions tableOptions;

    HtmlParserPatchedOptions() {
       this((DataHolder) null);
    }

    HtmlParserPatchedOptions(HtmlParserPatchedOptions other) {
        listContentIndent = other.listContentIndent;
        setextHeadings = other.setextHeadings;
        outputUnknownTags = other.outputUnknownTags;
        typographicQuotes = other.typographicQuotes;
        typographicSmarts = other.typographicSmarts;
        wrapAutoLinks = other.wrapAutoLinks;
        extractAutoLinks = other.extractAutoLinks;
        renderComments = other.renderComments;
        dotOnlyNumericLists = other.dotOnlyNumericLists;
        preCodePreserveEmphasis = other.preCodePreserveEmphasis;
        listsEndOnDoubleBlank = other.listsEndOnDoubleBlank;
        divAsParagraph = other.divAsParagraph;
        brAsParaBreaks = other.brAsParaBreaks;
        brAsExtraBlankLines = other.brAsExtraBlankLines;
        orderedListDelimiter = other.orderedListDelimiter;
        unorderedListDelimiter = other.unorderedListDelimiter;
        definitionMarkerSpaces = other.definitionMarkerSpaces;
        minSetextHeadingMarkerLength = other.minSetextHeadingMarkerLength;
        codeIndent = other.codeIndent;
        eolInTitleAttribute = other.eolInTitleAttribute;
        nbspText = other.nbspText;
        thematicBreak = other.thematicBreak;
        tableCellAlignmentMap = other.tableCellAlignmentMap;
        tableOptions = other.tableOptions;
    }

    HtmlParserPatchedOptions(DataHolder options) {
        listContentIndent = FlexmarkHtmlParserPatched.LIST_CONTENT_INDENT.getFrom(options);
        setextHeadings = FlexmarkHtmlParserPatched.SETEXT_HEADINGS.getFrom(options);
        outputUnknownTags = FlexmarkHtmlParserPatched.OUTPUT_UNKNOWN_TAGS.getFrom(options);
        typographicQuotes = FlexmarkHtmlParserPatched.TYPOGRAPHIC_QUOTES.getFrom(options);
        typographicSmarts = FlexmarkHtmlParserPatched.TYPOGRAPHIC_SMARTS.getFrom(options);
        wrapAutoLinks = FlexmarkHtmlParserPatched.WRAP_AUTO_LINKS.getFrom(options);
        extractAutoLinks = FlexmarkHtmlParserPatched.EXTRACT_AUTO_LINKS.getFrom(options);
        renderComments = FlexmarkHtmlParserPatched.RENDER_COMMENTS.getFrom(options);
        dotOnlyNumericLists = FlexmarkHtmlParserPatched.DOT_ONLY_NUMERIC_LISTS.getFrom(options);
        preCodePreserveEmphasis = FlexmarkHtmlParserPatched.PRE_CODE_PRESERVE_EMPHASIS.getFrom(options);
        listsEndOnDoubleBlank = FlexmarkHtmlParserPatched.LISTS_END_ON_DOUBLE_BLANK.getFrom(options);
        divAsParagraph = FlexmarkHtmlParserPatched.DIV_AS_PARAGRAPH.getFrom(options);
        brAsParaBreaks = FlexmarkHtmlParserPatched.BR_AS_PARA_BREAKS.getFrom(options);
        brAsExtraBlankLines = FlexmarkHtmlParserPatched.BR_AS_EXTRA_BLANK_LINES.getFrom(options);
        orderedListDelimiter = FlexmarkHtmlParserPatched.ORDERED_LIST_DELIMITER.getFrom(options);
        unorderedListDelimiter = FlexmarkHtmlParserPatched.UNORDERED_LIST_DELIMITER.getFrom(options);
        definitionMarkerSpaces = FlexmarkHtmlParserPatched.DEFINITION_MARKER_SPACES.getFrom(options);
        minSetextHeadingMarkerLength = Utils.minLimit(FlexmarkHtmlParserPatched.MIN_SETEXT_HEADING_MARKER_LENGTH.getFrom(options), 3);
        codeIndent = FlexmarkHtmlParserPatched.CODE_INDENT.getFrom(options);
        eolInTitleAttribute = FlexmarkHtmlParserPatched.EOL_IN_TITLE_ATTRIBUTE.getFrom(options);
        nbspText = FlexmarkHtmlParserPatched.NBSP_TEXT.getFrom(options);
        thematicBreak = FlexmarkHtmlParserPatched.THEMATIC_BREAK.getFrom(options);
        tableCellAlignmentMap = FlexmarkHtmlParserPatched.TABLE_CELL_ALIGNMENT_MAP.getFrom(options);
        tableOptions =  new TableFormatOptions(options);
    }

    @Override
    public MutableDataHolder setIn(final MutableDataHolder dataHolder) {
        dataHolder.set(FlexmarkHtmlParserPatched.LIST_CONTENT_INDENT, listContentIndent);
        dataHolder.set(FlexmarkHtmlParserPatched.SETEXT_HEADINGS, setextHeadings);
        dataHolder.set(FlexmarkHtmlParserPatched.OUTPUT_UNKNOWN_TAGS, outputUnknownTags);
        dataHolder.set(FlexmarkHtmlParserPatched.TYPOGRAPHIC_QUOTES, typographicQuotes);
        dataHolder.set(FlexmarkHtmlParserPatched.TYPOGRAPHIC_SMARTS, typographicSmarts);
        dataHolder.set(FlexmarkHtmlParserPatched.WRAP_AUTO_LINKS, wrapAutoLinks);
        dataHolder.set(FlexmarkHtmlParserPatched.EXTRACT_AUTO_LINKS, extractAutoLinks);
        dataHolder.set(FlexmarkHtmlParserPatched.RENDER_COMMENTS, renderComments);
        dataHolder.set(FlexmarkHtmlParserPatched.DOT_ONLY_NUMERIC_LISTS, dotOnlyNumericLists);
        dataHolder.set(FlexmarkHtmlParserPatched.PRE_CODE_PRESERVE_EMPHASIS, preCodePreserveEmphasis);
        dataHolder.set(FlexmarkHtmlParserPatched.LISTS_END_ON_DOUBLE_BLANK, listsEndOnDoubleBlank);
        dataHolder.set(FlexmarkHtmlParserPatched.DIV_AS_PARAGRAPH, divAsParagraph);
        dataHolder.set(FlexmarkHtmlParserPatched.BR_AS_PARA_BREAKS, brAsParaBreaks);
        dataHolder.set(FlexmarkHtmlParserPatched.BR_AS_EXTRA_BLANK_LINES, brAsExtraBlankLines);
        dataHolder.set(FlexmarkHtmlParserPatched.ORDERED_LIST_DELIMITER, orderedListDelimiter);
        dataHolder.set(FlexmarkHtmlParserPatched.UNORDERED_LIST_DELIMITER, unorderedListDelimiter);
        dataHolder.set(FlexmarkHtmlParserPatched.DEFINITION_MARKER_SPACES, definitionMarkerSpaces);
        dataHolder.set(FlexmarkHtmlParserPatched.MIN_SETEXT_HEADING_MARKER_LENGTH, minSetextHeadingMarkerLength);
        dataHolder.set(FlexmarkHtmlParserPatched.CODE_INDENT, codeIndent);
        dataHolder.set(FlexmarkHtmlParserPatched.EOL_IN_TITLE_ATTRIBUTE, eolInTitleAttribute);
        dataHolder.set(FlexmarkHtmlParserPatched.NBSP_TEXT, nbspText);
        dataHolder.set(FlexmarkHtmlParserPatched.THEMATIC_BREAK, thematicBreak);
        dataHolder.set(FlexmarkHtmlParserPatched.TABLE_CELL_ALIGNMENT_MAP, tableCellAlignmentMap);
        dataHolder.setFrom(tableOptions);
        return dataHolder;
    }
}
