package js.web.cssom;

import js.util.collections.StringArrayLike;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * An object that is a CSS declaration block, and exposes style information and various style-related methods and properties.
 */
public interface CSSStyleDeclaration extends StringArrayLike {
    @JSBody(script = "return CSSStyleDeclaration.prototype")
    static CSSStyleDeclaration prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new CSSStyleDeclaration()")
    static CSSStyleDeclaration create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    String getAlignContent();

    @JSProperty
    void setAlignContent(String alignContent);

    @JSProperty
    String getAlignItems();

    @JSProperty
    void setAlignItems(String alignItems);

    @JSProperty
    String getAlignSelf();

    @JSProperty
    void setAlignSelf(String alignSelf);

    @JSProperty
    String getAlignmentBaseline();

    @JSProperty
    void setAlignmentBaseline(String alignmentBaseline);

    @JSProperty
    String getAnimation();

    @JSProperty
    void setAnimation(String animation);

    @JSProperty
    String getAnimationDelay();

    @JSProperty
    void setAnimationDelay(String animationDelay);

    @JSProperty
    String getAnimationDirection();

    @JSProperty
    void setAnimationDirection(String animationDirection);

    @JSProperty
    String getAnimationDuration();

    @JSProperty
    void setAnimationDuration(String animationDuration);

    @JSProperty
    String getAnimationFillMode();

    @JSProperty
    void setAnimationFillMode(String animationFillMode);

    @JSProperty
    String getAnimationIterationCount();

    @JSProperty
    void setAnimationIterationCount(String animationIterationCount);

    @JSProperty
    String getAnimationName();

    @JSProperty
    void setAnimationName(String animationName);

    @JSProperty
    String getAnimationPlayState();

    @JSProperty
    void setAnimationPlayState(String animationPlayState);

    @JSProperty
    String getAnimationTimingFunction();

    @JSProperty
    void setAnimationTimingFunction(String animationTimingFunction);

    @JSProperty
    String getBackfaceVisibility();

    @JSProperty
    void setBackfaceVisibility(String backfaceVisibility);

    @JSProperty
    String getBackground();

    @JSProperty
    void setBackground(String background);

    @JSProperty
    String getBackgroundAttachment();

    @JSProperty
    void setBackgroundAttachment(String backgroundAttachment);

    @JSProperty
    String getBackgroundClip();

    @JSProperty
    void setBackgroundClip(String backgroundClip);

    @JSProperty
    String getBackgroundColor();

    @JSProperty
    void setBackgroundColor(String backgroundColor);

    @JSProperty
    String getBackgroundImage();

    @JSProperty
    void setBackgroundImage(String backgroundImage);

    @JSProperty
    String getBackgroundOrigin();

    @JSProperty
    void setBackgroundOrigin(String backgroundOrigin);

    @JSProperty
    String getBackgroundPosition();

    @JSProperty
    void setBackgroundPosition(String backgroundPosition);

    @JSProperty
    String getBackgroundPositionX();

    @JSProperty
    void setBackgroundPositionX(String backgroundPositionX);

    @JSProperty
    String getBackgroundPositionY();

    @JSProperty
    void setBackgroundPositionY(String backgroundPositionY);

    @JSProperty
    String getBackgroundRepeat();

    @JSProperty
    void setBackgroundRepeat(String backgroundRepeat);

    @JSProperty
    String getBackgroundSize();

    @JSProperty
    void setBackgroundSize(String backgroundSize);

    @JSProperty
    String getBaselineShift();

    @JSProperty
    void setBaselineShift(String baselineShift);

    @JSProperty
    String getBlockSize();

    @JSProperty
    void setBlockSize(String blockSize);

    @JSProperty
    String getBorder();

    @JSProperty
    void setBorder(String border);

    @JSProperty
    String getBorderBlockEnd();

    @JSProperty
    void setBorderBlockEnd(String borderBlockEnd);

    @JSProperty
    String getBorderBlockEndColor();

    @JSProperty
    void setBorderBlockEndColor(String borderBlockEndColor);

    @JSProperty
    String getBorderBlockEndStyle();

    @JSProperty
    void setBorderBlockEndStyle(String borderBlockEndStyle);

    @JSProperty
    String getBorderBlockEndWidth();

    @JSProperty
    void setBorderBlockEndWidth(String borderBlockEndWidth);

    @JSProperty
    String getBorderBlockStart();

    @JSProperty
    void setBorderBlockStart(String borderBlockStart);

    @JSProperty
    String getBorderBlockStartColor();

    @JSProperty
    void setBorderBlockStartColor(String borderBlockStartColor);

    @JSProperty
    String getBorderBlockStartStyle();

    @JSProperty
    void setBorderBlockStartStyle(String borderBlockStartStyle);

    @JSProperty
    String getBorderBlockStartWidth();

    @JSProperty
    void setBorderBlockStartWidth(String borderBlockStartWidth);

    @JSProperty
    String getBorderBottom();

    @JSProperty
    void setBorderBottom(String borderBottom);

    @JSProperty
    String getBorderBottomColor();

    @JSProperty
    void setBorderBottomColor(String borderBottomColor);

    @JSProperty
    String getBorderBottomLeftRadius();

    @JSProperty
    void setBorderBottomLeftRadius(String borderBottomLeftRadius);

    @JSProperty
    String getBorderBottomRightRadius();

    @JSProperty
    void setBorderBottomRightRadius(String borderBottomRightRadius);

    @JSProperty
    String getBorderBottomStyle();

    @JSProperty
    void setBorderBottomStyle(String borderBottomStyle);

    @JSProperty
    String getBorderBottomWidth();

    @JSProperty
    void setBorderBottomWidth(String borderBottomWidth);

    @JSProperty
    String getBorderCollapse();

    @JSProperty
    void setBorderCollapse(String borderCollapse);

    @JSProperty
    String getBorderColor();

    @JSProperty
    void setBorderColor(String borderColor);

    @JSProperty
    String getBorderImage();

    @JSProperty
    void setBorderImage(String borderImage);

    @JSProperty
    String getBorderImageOutset();

    @JSProperty
    void setBorderImageOutset(String borderImageOutset);

    @JSProperty
    String getBorderImageRepeat();

    @JSProperty
    void setBorderImageRepeat(String borderImageRepeat);

    @JSProperty
    String getBorderImageSlice();

    @JSProperty
    void setBorderImageSlice(String borderImageSlice);

    @JSProperty
    String getBorderImageSource();

    @JSProperty
    void setBorderImageSource(String borderImageSource);

    @JSProperty
    String getBorderImageWidth();

    @JSProperty
    void setBorderImageWidth(String borderImageWidth);

    @JSProperty
    String getBorderInlineEnd();

    @JSProperty
    void setBorderInlineEnd(String borderInlineEnd);

    @JSProperty
    String getBorderInlineEndColor();

    @JSProperty
    void setBorderInlineEndColor(String borderInlineEndColor);

    @JSProperty
    String getBorderInlineEndStyle();

    @JSProperty
    void setBorderInlineEndStyle(String borderInlineEndStyle);

    @JSProperty
    String getBorderInlineEndWidth();

    @JSProperty
    void setBorderInlineEndWidth(String borderInlineEndWidth);

    @JSProperty
    String getBorderInlineStart();

    @JSProperty
    void setBorderInlineStart(String borderInlineStart);

    @JSProperty
    String getBorderInlineStartColor();

    @JSProperty
    void setBorderInlineStartColor(String borderInlineStartColor);

    @JSProperty
    String getBorderInlineStartStyle();

    @JSProperty
    void setBorderInlineStartStyle(String borderInlineStartStyle);

    @JSProperty
    String getBorderInlineStartWidth();

    @JSProperty
    void setBorderInlineStartWidth(String borderInlineStartWidth);

    @JSProperty
    String getBorderLeft();

    @JSProperty
    void setBorderLeft(String borderLeft);

    @JSProperty
    String getBorderLeftColor();

    @JSProperty
    void setBorderLeftColor(String borderLeftColor);

    @JSProperty
    String getBorderLeftStyle();

    @JSProperty
    void setBorderLeftStyle(String borderLeftStyle);

    @JSProperty
    String getBorderLeftWidth();

    @JSProperty
    void setBorderLeftWidth(String borderLeftWidth);

    @JSProperty
    String getBorderRadius();

    @JSProperty
    void setBorderRadius(String borderRadius);

    @JSProperty
    String getBorderRight();

    @JSProperty
    void setBorderRight(String borderRight);

    @JSProperty
    String getBorderRightColor();

    @JSProperty
    void setBorderRightColor(String borderRightColor);

    @JSProperty
    String getBorderRightStyle();

    @JSProperty
    void setBorderRightStyle(String borderRightStyle);

    @JSProperty
    String getBorderRightWidth();

    @JSProperty
    void setBorderRightWidth(String borderRightWidth);

    @JSProperty
    String getBorderSpacing();

    @JSProperty
    void setBorderSpacing(String borderSpacing);

    @JSProperty
    String getBorderStyle();

    @JSProperty
    void setBorderStyle(String borderStyle);

    @JSProperty
    String getBorderTop();

    @JSProperty
    void setBorderTop(String borderTop);

    @JSProperty
    String getBorderTopColor();

    @JSProperty
    void setBorderTopColor(String borderTopColor);

    @JSProperty
    String getBorderTopLeftRadius();

    @JSProperty
    void setBorderTopLeftRadius(String borderTopLeftRadius);

    @JSProperty
    String getBorderTopRightRadius();

    @JSProperty
    void setBorderTopRightRadius(String borderTopRightRadius);

    @JSProperty
    String getBorderTopStyle();

    @JSProperty
    void setBorderTopStyle(String borderTopStyle);

    @JSProperty
    String getBorderTopWidth();

    @JSProperty
    void setBorderTopWidth(String borderTopWidth);

    @JSProperty
    String getBorderWidth();

    @JSProperty
    void setBorderWidth(String borderWidth);

    @JSProperty
    String getBottom();

    @JSProperty
    void setBottom(String bottom);

    @JSProperty
    String getBoxShadow();

    @JSProperty
    void setBoxShadow(String boxShadow);

    @JSProperty
    String getBoxSizing();

    @JSProperty
    void setBoxSizing(String boxSizing);

    @JSProperty
    String getBreakAfter();

    @JSProperty
    void setBreakAfter(String breakAfter);

    @JSProperty
    String getBreakBefore();

    @JSProperty
    void setBreakBefore(String breakBefore);

    @JSProperty
    String getBreakInside();

    @JSProperty
    void setBreakInside(String breakInside);

    @JSProperty
    String getCaptionSide();

    @JSProperty
    void setCaptionSide(String captionSide);

    @JSProperty
    String getCaretColor();

    @JSProperty
    void setCaretColor(String caretColor);

    @JSProperty
    String getClear();

    @JSProperty
    void setClear(String clear);

    @JSProperty
    String getClip();

    @JSProperty
    void setClip(String clip);

    @JSProperty
    String getClipPath();

    @JSProperty
    void setClipPath(String clipPath);

    @JSProperty
    String getClipRule();

    @JSProperty
    void setClipRule(String clipRule);

    @JSProperty
    @Nullable
    String getColor();

    @JSProperty
    void setColor(String color);

    @JSProperty
    String getColorInterpolation();

    @JSProperty
    void setColorInterpolation(String colorInterpolation);

    @JSProperty
    String getColorInterpolationFilters();

    @JSProperty
    void setColorInterpolationFilters(String colorInterpolationFilters);

    @JSProperty
    String getColumnCount();

    @JSProperty
    void setColumnCount(String columnCount);

    @JSProperty
    String getColumnFill();

    @JSProperty
    void setColumnFill(String columnFill);

    @JSProperty
    String getColumnGap();

    @JSProperty
    void setColumnGap(String columnGap);

    @JSProperty
    String getColumnRule();

    @JSProperty
    void setColumnRule(String columnRule);

    @JSProperty
    String getColumnRuleColor();

    @JSProperty
    void setColumnRuleColor(String columnRuleColor);

    @JSProperty
    String getColumnRuleStyle();

    @JSProperty
    void setColumnRuleStyle(String columnRuleStyle);

    @JSProperty
    String getColumnRuleWidth();

    @JSProperty
    void setColumnRuleWidth(String columnRuleWidth);

    @JSProperty
    String getColumnSpan();

    @JSProperty
    void setColumnSpan(String columnSpan);

    @JSProperty
    String getColumnWidth();

    @JSProperty
    void setColumnWidth(String columnWidth);

    @JSProperty
    String getColumns();

    @JSProperty
    void setColumns(String columns);

    @JSProperty
    String getContent();

    @JSProperty
    void setContent(String content);

    @JSProperty
    String getCounterIncrement();

    @JSProperty
    void setCounterIncrement(String counterIncrement);

    @JSProperty
    String getCounterReset();

    @JSProperty
    void setCounterReset(String counterReset);

    @JSProperty
    @Nullable
    String getCssFloat();

    @JSProperty
    void setCssFloat(String cssFloat);

    @JSProperty
    String getCssText();

    @JSProperty
    void setCssText(String cssText);

    @JSProperty
    String getCursor();

    @JSProperty
    void setCursor(String cursor);

    @JSProperty
    String getDirection();

    @JSProperty
    void setDirection(String direction);

    @JSProperty
    String getDisplay();

    @JSProperty
    void setDisplay(String display);

    @JSProperty
    String getDominantBaseline();

    @JSProperty
    void setDominantBaseline(String dominantBaseline);

    @JSProperty
    String getEmptyCells();

    @JSProperty
    void setEmptyCells(String emptyCells);

    @JSProperty
    @Nullable
    String getEnableBackground();

    @JSProperty
    void setEnableBackground(String enableBackground);

    @JSProperty
    String getFill();

    @JSProperty
    void setFill(String fill);

    @JSProperty
    String getFillOpacity();

    @JSProperty
    void setFillOpacity(String fillOpacity);

    @JSProperty
    String getFillRule();

    @JSProperty
    void setFillRule(String fillRule);

    @JSProperty
    String getFilter();

    @JSProperty
    void setFilter(String filter);

    @JSProperty
    String getFlex();

    @JSProperty
    void setFlex(String flex);

    @JSProperty
    String getFlexBasis();

    @JSProperty
    void setFlexBasis(String flexBasis);

    @JSProperty
    String getFlexDirection();

    @JSProperty
    void setFlexDirection(String flexDirection);

    @JSProperty
    String getFlexFlow();

    @JSProperty
    void setFlexFlow(String flexFlow);

    @JSProperty
    String getFlexGrow();

    @JSProperty
    void setFlexGrow(String flexGrow);

    @JSProperty
    String getFlexShrink();

    @JSProperty
    void setFlexShrink(String flexShrink);

    @JSProperty
    String getFlexWrap();

    @JSProperty
    void setFlexWrap(String flexWrap);

    @JSProperty
    String getFloat();

    @JSProperty
    void setFloat(String value);

    @JSProperty
    String getFloodColor();

    @JSProperty
    void setFloodColor(String floodColor);

    @JSProperty
    String getFloodOpacity();

    @JSProperty
    void setFloodOpacity(String floodOpacity);

    @JSProperty
    String getFont();

    @JSProperty
    void setFont(String font);

    @JSProperty
    String getFontFamily();

    @JSProperty
    void setFontFamily(String fontFamily);

    @JSProperty
    String getFontFeatureSettings();

    @JSProperty
    void setFontFeatureSettings(String fontFeatureSettings);

    @JSProperty
    String getFontKerning();

    @JSProperty
    void setFontKerning(String fontKerning);

    @JSProperty
    String getFontSize();

    @JSProperty
    void setFontSize(String fontSize);

    @JSProperty
    String getFontSizeAdjust();

    @JSProperty
    void setFontSizeAdjust(String fontSizeAdjust);

    @JSProperty
    String getFontStretch();

    @JSProperty
    void setFontStretch(String fontStretch);

    @JSProperty
    String getFontStyle();

    @JSProperty
    void setFontStyle(String fontStyle);

    @JSProperty
    String getFontSynthesis();

    @JSProperty
    void setFontSynthesis(String fontSynthesis);

    @JSProperty
    String getFontVariant();

    @JSProperty
    void setFontVariant(String fontVariant);

    @JSProperty
    String getFontVariantCaps();

    @JSProperty
    void setFontVariantCaps(String fontVariantCaps);

    @JSProperty
    String getFontVariantEastAsian();

    @JSProperty
    void setFontVariantEastAsian(String fontVariantEastAsian);

    @JSProperty
    String getFontVariantLigatures();

    @JSProperty
    void setFontVariantLigatures(String fontVariantLigatures);

    @JSProperty
    String getFontVariantNumeric();

    @JSProperty
    void setFontVariantNumeric(String fontVariantNumeric);

    @JSProperty
    String getFontVariantPosition();

    @JSProperty
    void setFontVariantPosition(String fontVariantPosition);

    @JSProperty
    String getFontWeight();

    @JSProperty
    void setFontWeight(String fontWeight);

    @JSProperty
    String getGap();

    @JSProperty
    void setGap(String gap);

    @JSProperty
    @Nullable
    String getGlyphOrientationHorizontal();

    @JSProperty
    void setGlyphOrientationHorizontal(String glyphOrientationHorizontal);

    @JSProperty
    String getGlyphOrientationVertical();

    @JSProperty
    void setGlyphOrientationVertical(String glyphOrientationVertical);

    @JSProperty
    String getGrid();

    @JSProperty
    void setGrid(String grid);

    @JSProperty
    String getGridArea();

    @JSProperty
    void setGridArea(String gridArea);

    @JSProperty
    String getGridAutoColumns();

    @JSProperty
    void setGridAutoColumns(String gridAutoColumns);

    @JSProperty
    String getGridAutoFlow();

    @JSProperty
    void setGridAutoFlow(String gridAutoFlow);

    @JSProperty
    String getGridAutoRows();

    @JSProperty
    void setGridAutoRows(String gridAutoRows);

    @JSProperty
    String getGridColumn();

    @JSProperty
    void setGridColumn(String gridColumn);

    @JSProperty
    String getGridColumnEnd();

    @JSProperty
    void setGridColumnEnd(String gridColumnEnd);

    @JSProperty
    String getGridColumnGap();

    @JSProperty
    void setGridColumnGap(String gridColumnGap);

    @JSProperty
    String getGridColumnStart();

    @JSProperty
    void setGridColumnStart(String gridColumnStart);

    @JSProperty
    String getGridGap();

    @JSProperty
    void setGridGap(String gridGap);

    @JSProperty
    String getGridRow();

    @JSProperty
    void setGridRow(String gridRow);

    @JSProperty
    String getGridRowEnd();

    @JSProperty
    void setGridRowEnd(String gridRowEnd);

    @JSProperty
    String getGridRowGap();

    @JSProperty
    void setGridRowGap(String gridRowGap);

    @JSProperty
    String getGridRowStart();

    @JSProperty
    void setGridRowStart(String gridRowStart);

    @JSProperty
    String getGridTemplate();

    @JSProperty
    void setGridTemplate(String gridTemplate);

    @JSProperty
    String getGridTemplateAreas();

    @JSProperty
    void setGridTemplateAreas(String gridTemplateAreas);

    @JSProperty
    String getGridTemplateColumns();

    @JSProperty
    void setGridTemplateColumns(String gridTemplateColumns);

    @JSProperty
    String getGridTemplateRows();

    @JSProperty
    void setGridTemplateRows(String gridTemplateRows);

    @JSProperty
    String getHeight();

    @JSProperty
    void setHeight(String height);

    @JSProperty
    String getHyphens();

    @JSProperty
    void setHyphens(String hyphens);

    @JSProperty
    String getImageOrientation();

    @JSProperty
    void setImageOrientation(String imageOrientation);

    @JSProperty
    String getImageRendering();

    @JSProperty
    void setImageRendering(String imageRendering);

    @JSProperty
    @Nullable
    String getImeMode();

    @JSProperty
    void setImeMode(String imeMode);

    @JSProperty
    String getInlineSize();

    @JSProperty
    void setInlineSize(String inlineSize);

    @JSProperty
    String getJustifyContent();

    @JSProperty
    void setJustifyContent(String justifyContent);

    @JSProperty
    String getJustifyItems();

    @JSProperty
    void setJustifyItems(String justifyItems);

    @JSProperty
    String getJustifySelf();

    @JSProperty
    void setJustifySelf(String justifySelf);

    @JSProperty
    @Nullable
    String getKerning();

    @JSProperty
    void setKerning(String kerning);

    @JSProperty
    @Nullable
    String getLayoutGrid();

    @JSProperty
    void setLayoutGrid(String layoutGrid);

    @JSProperty
    @Nullable
    String getLayoutGridChar();

    @JSProperty
    void setLayoutGridChar(String layoutGridChar);

    @JSProperty
    @Nullable
    String getLayoutGridLine();

    @JSProperty
    void setLayoutGridLine(String layoutGridLine);

    @JSProperty
    @Nullable
    String getLayoutGridMode();

    @JSProperty
    void setLayoutGridMode(String layoutGridMode);

    @JSProperty
    @Nullable
    String getLayoutGridType();

    @JSProperty
    void setLayoutGridType(String layoutGridType);

    @JSProperty
    String getLeft();

    @JSProperty
    void setLeft(String left);

    @JSProperty
    String getLetterSpacing();

    @JSProperty
    void setLetterSpacing(String letterSpacing);

    @JSProperty
    String getLightingColor();

    @JSProperty
    void setLightingColor(String lightingColor);

    @JSProperty
    String getLineBreak();

    @JSProperty
    void setLineBreak(String lineBreak);

    @JSProperty
    String getLineHeight();

    @JSProperty
    void setLineHeight(String lineHeight);

    @JSProperty
    String getListStyle();

    @JSProperty
    void setListStyle(String listStyle);

    @JSProperty
    String getListStyleImage();

    @JSProperty
    void setListStyleImage(String listStyleImage);

    @JSProperty
    String getListStylePosition();

    @JSProperty
    void setListStylePosition(String listStylePosition);

    @JSProperty
    String getListStyleType();

    @JSProperty
    void setListStyleType(String listStyleType);

    @JSProperty
    String getMargin();

    @JSProperty
    void setMargin(String margin);

    @JSProperty
    String getMarginBlockEnd();

    @JSProperty
    void setMarginBlockEnd(String marginBlockEnd);

    @JSProperty
    String getMarginBlockStart();

    @JSProperty
    void setMarginBlockStart(String marginBlockStart);

    @JSProperty
    String getMarginBottom();

    @JSProperty
    void setMarginBottom(String marginBottom);

    @JSProperty
    String getMarginInlineEnd();

    @JSProperty
    void setMarginInlineEnd(String marginInlineEnd);

    @JSProperty
    String getMarginInlineStart();

    @JSProperty
    void setMarginInlineStart(String marginInlineStart);

    @JSProperty
    String getMarginLeft();

    @JSProperty
    void setMarginLeft(String marginLeft);

    @JSProperty
    String getMarginRight();

    @JSProperty
    void setMarginRight(String marginRight);

    @JSProperty
    String getMarginTop();

    @JSProperty
    void setMarginTop(String marginTop);

    @JSProperty
    String getMarker();

    @JSProperty
    void setMarker(String marker);

    @JSProperty
    String getMarkerEnd();

    @JSProperty
    void setMarkerEnd(String markerEnd);

    @JSProperty
    String getMarkerMid();

    @JSProperty
    void setMarkerMid(String markerMid);

    @JSProperty
    String getMarkerStart();

    @JSProperty
    void setMarkerStart(String markerStart);

    @JSProperty
    String getMask();

    @JSProperty
    void setMask(String mask);

    @JSProperty
    String getMaskComposite();

    @JSProperty
    void setMaskComposite(String maskComposite);

    @JSProperty
    String getMaskImage();

    @JSProperty
    void setMaskImage(String maskImage);

    @JSProperty
    String getMaskPosition();

    @JSProperty
    void setMaskPosition(String maskPosition);

    @JSProperty
    String getMaskRepeat();

    @JSProperty
    void setMaskRepeat(String maskRepeat);

    @JSProperty
    String getMaskSize();

    @JSProperty
    void setMaskSize(String maskSize);

    @JSProperty
    String getMaskType();

    @JSProperty
    void setMaskType(String maskType);

    @JSProperty
    String getMaxBlockSize();

    @JSProperty
    void setMaxBlockSize(String maxBlockSize);

    @JSProperty
    String getMaxHeight();

    @JSProperty
    void setMaxHeight(String maxHeight);

    @JSProperty
    String getMaxInlineSize();

    @JSProperty
    void setMaxInlineSize(String maxInlineSize);

    @JSProperty
    String getMaxWidth();

    @JSProperty
    void setMaxWidth(String maxWidth);

    @JSProperty
    String getMinBlockSize();

    @JSProperty
    void setMinBlockSize(String minBlockSize);

    @JSProperty
    String getMinHeight();

    @JSProperty
    void setMinHeight(String minHeight);

    @JSProperty
    String getMinInlineSize();

    @JSProperty
    void setMinInlineSize(String minInlineSize);

    @JSProperty
    String getMinWidth();

    @JSProperty
    void setMinWidth(String minWidth);

    @JSProperty
    @Nullable
    String getMsContentZoomChaining();

    @JSProperty
    void setMsContentZoomChaining(String msContentZoomChaining);

    @JSProperty
    @Nullable
    String getMsContentZoomLimit();

    @JSProperty
    void setMsContentZoomLimit(String msContentZoomLimit);

    @JSProperty
    String getMsContentZoomLimitMax();

    @JSProperty
    void setMsContentZoomLimitMax(String msContentZoomLimitMax);

    @JSProperty
    String getMsContentZoomLimitMin();

    @JSProperty
    void setMsContentZoomLimitMin(String msContentZoomLimitMin);

    @JSProperty
    @Nullable
    String getMsContentZoomSnap();

    @JSProperty
    void setMsContentZoomSnap(String msContentZoomSnap);

    @JSProperty
    @Nullable
    String getMsContentZoomSnapPoints();

    @JSProperty
    void setMsContentZoomSnapPoints(String msContentZoomSnapPoints);

    @JSProperty
    @Nullable
    String getMsContentZoomSnapType();

    @JSProperty
    void setMsContentZoomSnapType(String msContentZoomSnapType);

    @JSProperty
    @Nullable
    String getMsContentZooming();

    @JSProperty
    void setMsContentZooming(String msContentZooming);

    @JSProperty
    @Nullable
    String getMsFlowFrom();

    @JSProperty
    void setMsFlowFrom(String msFlowFrom);

    @JSProperty
    @Nullable
    String getMsFlowInto();

    @JSProperty
    void setMsFlowInto(String msFlowInto);

    @JSProperty
    @Nullable
    String getMsFontFeatureSettings();

    @JSProperty
    void setMsFontFeatureSettings(String msFontFeatureSettings);

    @JSProperty
    String getMsGridColumn();

    @JSProperty
    void setMsGridColumn(String msGridColumn);

    @JSProperty
    @Nullable
    String getMsGridColumnAlign();

    @JSProperty
    void setMsGridColumnAlign(String msGridColumnAlign);

    @JSProperty
    String getMsGridColumnSpan();

    @JSProperty
    void setMsGridColumnSpan(String msGridColumnSpan);

    @JSProperty
    @Nullable
    String getMsGridColumns();

    @JSProperty
    void setMsGridColumns(String msGridColumns);

    @JSProperty
    String getMsGridRow();

    @JSProperty
    void setMsGridRow(String msGridRow);

    @JSProperty
    @Nullable
    String getMsGridRowAlign();

    @JSProperty
    void setMsGridRowAlign(String msGridRowAlign);

    @JSProperty
    String getMsGridRowSpan();

    @JSProperty
    void setMsGridRowSpan(String msGridRowSpan);

    @JSProperty
    @Nullable
    String getMsGridRows();

    @JSProperty
    void setMsGridRows(String msGridRows);

    @JSProperty
    @Nullable
    String getMsHighContrastAdjust();

    @JSProperty
    void setMsHighContrastAdjust(String msHighContrastAdjust);

    @JSProperty
    @Nullable
    String getMsHyphenateLimitChars();

    @JSProperty
    void setMsHyphenateLimitChars(String msHyphenateLimitChars);

    @JSProperty
    String getMsHyphenateLimitLines();

    @JSProperty
    void setMsHyphenateLimitLines(String msHyphenateLimitLines);

    @JSProperty
    String getMsHyphenateLimitZone();

    @JSProperty
    void setMsHyphenateLimitZone(String msHyphenateLimitZone);

    @JSProperty
    @Nullable
    String getMsHyphens();

    @JSProperty
    void setMsHyphens(String msHyphens);

    @JSProperty
    @Nullable
    String getMsImeAlign();

    @JSProperty
    void setMsImeAlign(String msImeAlign);

    @JSProperty
    @Nullable
    String getMsOverflowStyle();

    @JSProperty
    void setMsOverflowStyle(String msOverflowStyle);

    @JSProperty
    @Nullable
    String getMsScrollChaining();

    @JSProperty
    void setMsScrollChaining(String msScrollChaining);

    @JSProperty
    @Nullable
    String getMsScrollLimit();

    @JSProperty
    void setMsScrollLimit(String msScrollLimit);

    @JSProperty
    String getMsScrollLimitXMax();

    @JSProperty
    void setMsScrollLimitXMax(String msScrollLimitXMax);

    @JSProperty
    String getMsScrollLimitXMin();

    @JSProperty
    void setMsScrollLimitXMin(String msScrollLimitXMin);

    @JSProperty
    String getMsScrollLimitYMax();

    @JSProperty
    void setMsScrollLimitYMax(String msScrollLimitYMax);

    @JSProperty
    String getMsScrollLimitYMin();

    @JSProperty
    void setMsScrollLimitYMin(String msScrollLimitYMin);

    @JSProperty
    @Nullable
    String getMsScrollRails();

    @JSProperty
    void setMsScrollRails(String msScrollRails);

    @JSProperty
    @Nullable
    String getMsScrollSnapPointsX();

    @JSProperty
    void setMsScrollSnapPointsX(String msScrollSnapPointsX);

    @JSProperty
    @Nullable
    String getMsScrollSnapPointsY();

    @JSProperty
    void setMsScrollSnapPointsY(String msScrollSnapPointsY);

    @JSProperty
    @Nullable
    String getMsScrollSnapType();

    @JSProperty
    void setMsScrollSnapType(String msScrollSnapType);

    @JSProperty
    @Nullable
    String getMsScrollSnapX();

    @JSProperty
    void setMsScrollSnapX(String msScrollSnapX);

    @JSProperty
    @Nullable
    String getMsScrollSnapY();

    @JSProperty
    void setMsScrollSnapY(String msScrollSnapY);

    @JSProperty
    @Nullable
    String getMsScrollTranslation();

    @JSProperty
    void setMsScrollTranslation(String msScrollTranslation);

    @JSProperty
    @Nullable
    String getMsTextCombineHorizontal();

    @JSProperty
    void setMsTextCombineHorizontal(String msTextCombineHorizontal);

    @JSProperty
    String getMsTextSizeAdjust();

    @JSProperty
    void setMsTextSizeAdjust(String msTextSizeAdjust);

    @JSProperty
    @Nullable
    String getMsTouchAction();

    @JSProperty
    void setMsTouchAction(String msTouchAction);

    @JSProperty
    @Nullable
    String getMsTouchSelect();

    @JSProperty
    void setMsTouchSelect(String msTouchSelect);

    @JSProperty
    @Nullable
    String getMsUserSelect();

    @JSProperty
    void setMsUserSelect(String msUserSelect);

    @JSProperty
    String getMsWrapFlow();

    @JSProperty
    void setMsWrapFlow(String msWrapFlow);

    @JSProperty
    String getMsWrapMargin();

    @JSProperty
    void setMsWrapMargin(String msWrapMargin);

    @JSProperty
    String getMsWrapThrough();

    @JSProperty
    void setMsWrapThrough(String msWrapThrough);

    @JSProperty
    String getObjectFit();

    @JSProperty
    void setObjectFit(String objectFit);

    @JSProperty
    String getObjectPosition();

    @JSProperty
    void setObjectPosition(String objectPosition);

    @JSProperty
    @Nullable
    String getOpacity();

    @JSProperty
    void setOpacity(String opacity);

    @JSProperty
    String getOrder();

    @JSProperty
    void setOrder(String order);

    @JSProperty
    String getOrphans();

    @JSProperty
    void setOrphans(String orphans);

    @JSProperty
    String getOutline();

    @JSProperty
    void setOutline(String outline);

    @JSProperty
    String getOutlineColor();

    @JSProperty
    void setOutlineColor(String outlineColor);

    @JSProperty
    String getOutlineOffset();

    @JSProperty
    void setOutlineOffset(String outlineOffset);

    @JSProperty
    String getOutlineStyle();

    @JSProperty
    void setOutlineStyle(String outlineStyle);

    @JSProperty
    String getOutlineWidth();

    @JSProperty
    void setOutlineWidth(String outlineWidth);

    @JSProperty
    String getOverflow();

    @JSProperty
    void setOverflow(String overflow);

    @JSProperty
    String getOverflowAnchor();

    @JSProperty
    void setOverflowAnchor(String overflowAnchor);

    @JSProperty
    String getOverflowWrap();

    @JSProperty
    void setOverflowWrap(String overflowWrap);

    @JSProperty
    String getOverflowX();

    @JSProperty
    void setOverflowX(String overflowX);

    @JSProperty
    String getOverflowY();

    @JSProperty
    void setOverflowY(String overflowY);

    @JSProperty
    String getPadding();

    @JSProperty
    void setPadding(String padding);

    @JSProperty
    String getPaddingBlockEnd();

    @JSProperty
    void setPaddingBlockEnd(String paddingBlockEnd);

    @JSProperty
    String getPaddingBlockStart();

    @JSProperty
    void setPaddingBlockStart(String paddingBlockStart);

    @JSProperty
    String getPaddingBottom();

    @JSProperty
    void setPaddingBottom(String paddingBottom);

    @JSProperty
    String getPaddingInlineEnd();

    @JSProperty
    void setPaddingInlineEnd(String paddingInlineEnd);

    @JSProperty
    String getPaddingInlineStart();

    @JSProperty
    void setPaddingInlineStart(String paddingInlineStart);

    @JSProperty
    String getPaddingLeft();

    @JSProperty
    void setPaddingLeft(String paddingLeft);

    @JSProperty
    String getPaddingRight();

    @JSProperty
    void setPaddingRight(String paddingRight);

    @JSProperty
    String getPaddingTop();

    @JSProperty
    void setPaddingTop(String paddingTop);

    @JSProperty
    String getPageBreakAfter();

    @JSProperty
    void setPageBreakAfter(String pageBreakAfter);

    @JSProperty
    String getPageBreakBefore();

    @JSProperty
    void setPageBreakBefore(String pageBreakBefore);

    @JSProperty
    String getPageBreakInside();

    @JSProperty
    void setPageBreakInside(String pageBreakInside);

    @JSProperty
    String getPaintOrder();

    @JSProperty
    void setPaintOrder(String paintOrder);

    @JSProperty
    CSSRule getParentRule();

    @JSProperty
    @Nullable
    String getPenAction();

    @JSProperty
    void setPenAction(String penAction);

    @JSProperty
    String getPerspective();

    @JSProperty
    void setPerspective(String perspective);

    @JSProperty
    String getPerspectiveOrigin();

    @JSProperty
    void setPerspectiveOrigin(String perspectiveOrigin);

    @JSProperty
    String getPlaceContent();

    @JSProperty
    void setPlaceContent(String placeContent);

    @JSProperty
    String getPlaceItems();

    @JSProperty
    void setPlaceItems(String placeItems);

    @JSProperty
    String getPlaceSelf();

    @JSProperty
    void setPlaceSelf(String placeSelf);

    @JSProperty
    @Nullable
    String getPointerEvents();

    @JSProperty
    void setPointerEvents(String pointerEvents);

    @JSProperty
    String getPosition();

    @JSProperty
    void setPosition(String position);

    @JSProperty
    String getQuotes();

    @JSProperty
    void setQuotes(String quotes);

    @JSProperty
    String getResize();

    @JSProperty
    void setResize(String resize);

    @JSProperty
    String getRight();

    @JSProperty
    void setRight(String right);

    @JSProperty
    String getRotate();

    @JSProperty
    void setRotate(String rotate);

    @JSProperty
    String getRowGap();

    @JSProperty
    void setRowGap(String rowGap);

    @JSProperty
    @Nullable
    String getRubyAlign();

    @JSProperty
    void setRubyAlign(String rubyAlign);

    @JSProperty
    @Nullable
    String getRubyOverhang();

    @JSProperty
    void setRubyOverhang(String rubyOverhang);

    @JSProperty
    @Nullable
    String getRubyPosition();

    @JSProperty
    void setRubyPosition(String rubyPosition);

    @JSProperty
    String getScale();

    @JSProperty
    void setScale(String scale);

    @JSProperty
    String getScrollBehavior();

    @JSProperty
    void setScrollBehavior(String scrollBehavior);

    @JSProperty
    String getShapeRendering();

    @JSProperty
    void setShapeRendering(String shapeRendering);

    @JSProperty
    @Nullable
    String getStopColor();

    @JSProperty
    void setStopColor(String stopColor);

    @JSProperty
    @Nullable
    String getStopOpacity();

    @JSProperty
    void setStopOpacity(String stopOpacity);

    @JSProperty
    String getStroke();

    @JSProperty
    void setStroke(String stroke);

    @JSProperty
    String getStrokeDasharray();

    @JSProperty
    void setStrokeDasharray(String strokeDasharray);

    @JSProperty
    String getStrokeDashoffset();

    @JSProperty
    void setStrokeDashoffset(String strokeDashoffset);

    @JSProperty
    String getStrokeLinecap();

    @JSProperty
    void setStrokeLinecap(String strokeLinecap);

    @JSProperty
    String getStrokeLinejoin();

    @JSProperty
    void setStrokeLinejoin(String strokeLinejoin);

    @JSProperty
    String getStrokeMiterlimit();

    @JSProperty
    void setStrokeMiterlimit(String strokeMiterlimit);

    @JSProperty
    String getStrokeOpacity();

    @JSProperty
    void setStrokeOpacity(String strokeOpacity);

    @JSProperty
    String getStrokeWidth();

    @JSProperty
    void setStrokeWidth(String strokeWidth);

    @JSProperty
    String getTabSize();

    @JSProperty
    void setTabSize(String tabSize);

    @JSProperty
    String getTableLayout();

    @JSProperty
    void setTableLayout(String tableLayout);

    @JSProperty
    String getTextAlign();

    @JSProperty
    void setTextAlign(String textAlign);

    @JSProperty
    String getTextAlignLast();

    @JSProperty
    void setTextAlignLast(String textAlignLast);

    @JSProperty
    @Nullable
    String getTextAnchor();

    @JSProperty
    void setTextAnchor(String textAnchor);

    @JSProperty
    String getTextCombineUpright();

    @JSProperty
    void setTextCombineUpright(String textCombineUpright);

    @JSProperty
    String getTextDecoration();

    @JSProperty
    void setTextDecoration(String textDecoration);

    @JSProperty
    String getTextDecorationColor();

    @JSProperty
    void setTextDecorationColor(String textDecorationColor);

    @JSProperty
    String getTextDecorationLine();

    @JSProperty
    void setTextDecorationLine(String textDecorationLine);

    @JSProperty
    String getTextDecorationStyle();

    @JSProperty
    void setTextDecorationStyle(String textDecorationStyle);

    @JSProperty
    String getTextEmphasis();

    @JSProperty
    void setTextEmphasis(String textEmphasis);

    @JSProperty
    String getTextEmphasisColor();

    @JSProperty
    void setTextEmphasisColor(String textEmphasisColor);

    @JSProperty
    String getTextEmphasisPosition();

    @JSProperty
    void setTextEmphasisPosition(String textEmphasisPosition);

    @JSProperty
    String getTextEmphasisStyle();

    @JSProperty
    void setTextEmphasisStyle(String textEmphasisStyle);

    @JSProperty
    String getTextIndent();

    @JSProperty
    void setTextIndent(String textIndent);

    @JSProperty
    String getTextJustify();

    @JSProperty
    void setTextJustify(String textJustify);

    @JSProperty
    @Nullable
    String getTextKashida();

    @JSProperty
    void setTextKashida(String textKashida);

    @JSProperty
    @Nullable
    String getTextKashidaSpace();

    @JSProperty
    void setTextKashidaSpace(String textKashidaSpace);

    @JSProperty
    String getTextOrientation();

    @JSProperty
    void setTextOrientation(String textOrientation);

    @JSProperty
    String getTextOverflow();

    @JSProperty
    void setTextOverflow(String textOverflow);

    @JSProperty
    String getTextRendering();

    @JSProperty
    void setTextRendering(String textRendering);

    @JSProperty
    String getTextShadow();

    @JSProperty
    void setTextShadow(String textShadow);

    @JSProperty
    String getTextTransform();

    @JSProperty
    void setTextTransform(String textTransform);

    @JSProperty
    String getTextUnderlinePosition();

    @JSProperty
    void setTextUnderlinePosition(String textUnderlinePosition);

    @JSProperty
    String getTop();

    @JSProperty
    void setTop(String top);

    @JSProperty
    String getTouchAction();

    @JSProperty
    void setTouchAction(String touchAction);

    @JSProperty
    String getTransform();

    @JSProperty
    void setTransform(String transform);

    @JSProperty
    String getTransformBox();

    @JSProperty
    void setTransformBox(String transformBox);

    @JSProperty
    String getTransformOrigin();

    @JSProperty
    void setTransformOrigin(String transformOrigin);

    @JSProperty
    String getTransformStyle();

    @JSProperty
    void setTransformStyle(String transformStyle);

    @JSProperty
    String getTransition();

    @JSProperty
    void setTransition(String transition);

    @JSProperty
    String getTransitionDelay();

    @JSProperty
    void setTransitionDelay(String transitionDelay);

    @JSProperty
    String getTransitionDuration();

    @JSProperty
    void setTransitionDuration(String transitionDuration);

    @JSProperty
    String getTransitionProperty();

    @JSProperty
    void setTransitionProperty(String transitionProperty);

    @JSProperty
    String getTransitionTimingFunction();

    @JSProperty
    void setTransitionTimingFunction(String transitionTimingFunction);

    @JSProperty
    String getTranslate();

    @JSProperty
    void setTranslate(String translate);

    @JSProperty
    String getUnicodeBidi();

    @JSProperty
    void setUnicodeBidi(String unicodeBidi);

    @JSProperty
    String getUserSelect();

    @JSProperty
    void setUserSelect(String userSelect);

    @JSProperty
    String getVerticalAlign();

    @JSProperty
    void setVerticalAlign(String verticalAlign);

    @JSProperty
    String getVisibility();

    @JSProperty
    void setVisibility(String visibility);

    @Deprecated
    @JSProperty
    String getWebkitAlignContent();

    @JSProperty
    void setWebkitAlignContent(String webkitAlignContent);

    @Deprecated
    @JSProperty
    String getWebkitAlignItems();

    @JSProperty
    void setWebkitAlignItems(String webkitAlignItems);

    @Deprecated
    @JSProperty
    String getWebkitAlignSelf();

    @JSProperty
    void setWebkitAlignSelf(String webkitAlignSelf);

    @Deprecated
    @JSProperty
    String getWebkitAnimation();

    @JSProperty
    void setWebkitAnimation(String webkitAnimation);

    @Deprecated
    @JSProperty
    String getWebkitAnimationDelay();

    @JSProperty
    void setWebkitAnimationDelay(String webkitAnimationDelay);

    @Deprecated
    @JSProperty
    String getWebkitAnimationDirection();

    @JSProperty
    void setWebkitAnimationDirection(String webkitAnimationDirection);

    @Deprecated
    @JSProperty
    String getWebkitAnimationDuration();

    @JSProperty
    void setWebkitAnimationDuration(String webkitAnimationDuration);

    @Deprecated
    @JSProperty
    String getWebkitAnimationFillMode();

    @JSProperty
    void setWebkitAnimationFillMode(String webkitAnimationFillMode);

    @Deprecated
    @JSProperty
    String getWebkitAnimationIterationCount();

    @JSProperty
    void setWebkitAnimationIterationCount(String webkitAnimationIterationCount);

    @Deprecated
    @JSProperty
    String getWebkitAnimationName();

    @JSProperty
    void setWebkitAnimationName(String webkitAnimationName);

    @Deprecated
    @JSProperty
    String getWebkitAnimationPlayState();

    @JSProperty
    void setWebkitAnimationPlayState(String webkitAnimationPlayState);

    @Deprecated
    @JSProperty
    String getWebkitAnimationTimingFunction();

    @JSProperty
    void setWebkitAnimationTimingFunction(String webkitAnimationTimingFunction);

    @Deprecated
    @JSProperty
    String getWebkitAppearance();

    @JSProperty
    void setWebkitAppearance(String webkitAppearance);

    @Deprecated
    @JSProperty
    String getWebkitBackfaceVisibility();

    @JSProperty
    void setWebkitBackfaceVisibility(String webkitBackfaceVisibility);

    @Deprecated
    @JSProperty
    String getWebkitBackgroundClip();

    @JSProperty
    void setWebkitBackgroundClip(String webkitBackgroundClip);

    @Deprecated
    @JSProperty
    String getWebkitBackgroundOrigin();

    @JSProperty
    void setWebkitBackgroundOrigin(String webkitBackgroundOrigin);

    @Deprecated
    @JSProperty
    String getWebkitBackgroundSize();

    @JSProperty
    void setWebkitBackgroundSize(String webkitBackgroundSize);

    @Deprecated
    @JSProperty
    String getWebkitBorderBottomLeftRadius();

    @JSProperty
    void setWebkitBorderBottomLeftRadius(String webkitBorderBottomLeftRadius);

    @Deprecated
    @JSProperty
    String getWebkitBorderBottomRightRadius();

    @JSProperty
    void setWebkitBorderBottomRightRadius(String webkitBorderBottomRightRadius);

    @JSProperty
    @Nullable
    String getWebkitBorderImage();

    @JSProperty
    void setWebkitBorderImage(String webkitBorderImage);

    @Deprecated
    @JSProperty
    String getWebkitBorderRadius();

    @JSProperty
    void setWebkitBorderRadius(String webkitBorderRadius);

    @Deprecated
    @JSProperty
    String getWebkitBorderTopLeftRadius();

    @JSProperty
    void setWebkitBorderTopLeftRadius(String webkitBorderTopLeftRadius);

    @Deprecated
    @JSProperty
    String getWebkitBorderTopRightRadius();

    @JSProperty
    void setWebkitBorderTopRightRadius(String webkitBorderTopRightRadius);

    @Deprecated
    @JSProperty
    String getWebkitBoxAlign();

    @JSProperty
    void setWebkitBoxAlign(String webkitBoxAlign);

    @JSProperty
    @Nullable
    String getWebkitBoxDirection();

    @JSProperty
    void setWebkitBoxDirection(String webkitBoxDirection);

    @Deprecated
    @JSProperty
    String getWebkitBoxFlex();

    @JSProperty
    void setWebkitBoxFlex(String webkitBoxFlex);

    @Deprecated
    @JSProperty
    String getWebkitBoxOrdinalGroup();

    @JSProperty
    void setWebkitBoxOrdinalGroup(String webkitBoxOrdinalGroup);

    @JSProperty
    @Nullable
    String getWebkitBoxOrient();

    @JSProperty
    void setWebkitBoxOrient(String webkitBoxOrient);

    @Deprecated
    @JSProperty
    String getWebkitBoxPack();

    @JSProperty
    void setWebkitBoxPack(String webkitBoxPack);

    @Deprecated
    @JSProperty
    String getWebkitBoxShadow();

    @JSProperty
    void setWebkitBoxShadow(String webkitBoxShadow);

    @Deprecated
    @JSProperty
    String getWebkitBoxSizing();

    @JSProperty
    void setWebkitBoxSizing(String webkitBoxSizing);

    @JSProperty
    @Nullable
    String getWebkitColumnBreakAfter();

    @JSProperty
    void setWebkitColumnBreakAfter(String webkitColumnBreakAfter);

    @JSProperty
    @Nullable
    String getWebkitColumnBreakBefore();

    @JSProperty
    void setWebkitColumnBreakBefore(String webkitColumnBreakBefore);

    @JSProperty
    @Nullable
    String getWebkitColumnBreakInside();

    @JSProperty
    void setWebkitColumnBreakInside(String webkitColumnBreakInside);

    @JSProperty
    String getWebkitColumnCount();

    @JSProperty
    void setWebkitColumnCount(String webkitColumnCount);

    @JSProperty
    String getWebkitColumnGap();

    @JSProperty
    void setWebkitColumnGap(String webkitColumnGap);

    @JSProperty
    @Nullable
    String getWebkitColumnRule();

    @JSProperty
    void setWebkitColumnRule(String webkitColumnRule);

    @JSProperty
    String getWebkitColumnRuleColor();

    @JSProperty
    void setWebkitColumnRuleColor(String webkitColumnRuleColor);

    @JSProperty
    @Nullable
    String getWebkitColumnRuleStyle();

    @JSProperty
    void setWebkitColumnRuleStyle(String webkitColumnRuleStyle);

    @JSProperty
    String getWebkitColumnRuleWidth();

    @JSProperty
    void setWebkitColumnRuleWidth(String webkitColumnRuleWidth);

    @JSProperty
    @Nullable
    String getWebkitColumnSpan();

    @JSProperty
    void setWebkitColumnSpan(String webkitColumnSpan);

    @JSProperty
    String getWebkitColumnWidth();

    @JSProperty
    void setWebkitColumnWidth(String webkitColumnWidth);

    @JSProperty
    @Nullable
    String getWebkitColumns();

    @JSProperty
    void setWebkitColumns(String webkitColumns);

    @Deprecated
    @JSProperty
    String getWebkitFilter();

    @JSProperty
    void setWebkitFilter(String webkitFilter);

    @Deprecated
    @JSProperty
    String getWebkitFlex();

    @JSProperty
    void setWebkitFlex(String webkitFlex);

    @Deprecated
    @JSProperty
    String getWebkitFlexBasis();

    @JSProperty
    void setWebkitFlexBasis(String webkitFlexBasis);

    @Deprecated
    @JSProperty
    String getWebkitFlexDirection();

    @JSProperty
    void setWebkitFlexDirection(String webkitFlexDirection);

    @Deprecated
    @JSProperty
    String getWebkitFlexFlow();

    @JSProperty
    void setWebkitFlexFlow(String webkitFlexFlow);

    @Deprecated
    @JSProperty
    String getWebkitFlexGrow();

    @JSProperty
    void setWebkitFlexGrow(String webkitFlexGrow);

    @Deprecated
    @JSProperty
    String getWebkitFlexShrink();

    @JSProperty
    void setWebkitFlexShrink(String webkitFlexShrink);

    @Deprecated
    @JSProperty
    String getWebkitFlexWrap();

    @JSProperty
    void setWebkitFlexWrap(String webkitFlexWrap);

    @Deprecated
    @JSProperty
    String getWebkitJustifyContent();

    @JSProperty
    void setWebkitJustifyContent(String webkitJustifyContent);

    @JSProperty
    String getWebkitLineClamp();

    @JSProperty
    void setWebkitLineClamp(String webkitLineClamp);

    @Deprecated
    @JSProperty
    String getWebkitMask();

    @JSProperty
    void setWebkitMask(String webkitMask);

    @Deprecated
    @JSProperty
    String getWebkitMaskBoxImage();

    @JSProperty
    void setWebkitMaskBoxImage(String webkitMaskBoxImage);

    @Deprecated
    @JSProperty
    String getWebkitMaskBoxImageOutset();

    @JSProperty
    void setWebkitMaskBoxImageOutset(String webkitMaskBoxImageOutset);

    @Deprecated
    @JSProperty
    String getWebkitMaskBoxImageRepeat();

    @JSProperty
    void setWebkitMaskBoxImageRepeat(String webkitMaskBoxImageRepeat);

    @Deprecated
    @JSProperty
    String getWebkitMaskBoxImageSlice();

    @JSProperty
    void setWebkitMaskBoxImageSlice(String webkitMaskBoxImageSlice);

    @Deprecated
    @JSProperty
    String getWebkitMaskBoxImageSource();

    @JSProperty
    void setWebkitMaskBoxImageSource(String webkitMaskBoxImageSource);

    @Deprecated
    @JSProperty
    String getWebkitMaskBoxImageWidth();

    @JSProperty
    void setWebkitMaskBoxImageWidth(String webkitMaskBoxImageWidth);

    @Deprecated
    @JSProperty
    String getWebkitMaskClip();

    @JSProperty
    void setWebkitMaskClip(String webkitMaskClip);

    @Deprecated
    @JSProperty
    String getWebkitMaskComposite();

    @JSProperty
    void setWebkitMaskComposite(String webkitMaskComposite);

    @Deprecated
    @JSProperty
    String getWebkitMaskImage();

    @JSProperty
    void setWebkitMaskImage(String webkitMaskImage);

    @Deprecated
    @JSProperty
    String getWebkitMaskOrigin();

    @JSProperty
    void setWebkitMaskOrigin(String webkitMaskOrigin);

    @Deprecated
    @JSProperty
    String getWebkitMaskPosition();

    @JSProperty
    void setWebkitMaskPosition(String webkitMaskPosition);

    @Deprecated
    @JSProperty
    String getWebkitMaskRepeat();

    @JSProperty
    void setWebkitMaskRepeat(String webkitMaskRepeat);

    @Deprecated
    @JSProperty
    String getWebkitMaskSize();

    @JSProperty
    void setWebkitMaskSize(String webkitMaskSize);

    @Deprecated
    @JSProperty
    String getWebkitOrder();

    @JSProperty
    void setWebkitOrder(String webkitOrder);

    @Deprecated
    @JSProperty
    String getWebkitPerspective();

    @JSProperty
    void setWebkitPerspective(String webkitPerspective);

    @Deprecated
    @JSProperty
    String getWebkitPerspectiveOrigin();

    @JSProperty
    void setWebkitPerspectiveOrigin(String webkitPerspectiveOrigin);

    @JSProperty
    @Nullable
    String getWebkitTapHighlightColor();

    @JSProperty
    void setWebkitTapHighlightColor(String webkitTapHighlightColor);

    @Deprecated
    @JSProperty
    String getWebkitTextFillColor();

    @JSProperty
    void setWebkitTextFillColor(String webkitTextFillColor);

    @Deprecated
    @JSProperty
    String getWebkitTextSizeAdjust();

    @JSProperty
    void setWebkitTextSizeAdjust(String webkitTextSizeAdjust);

    @Deprecated
    @JSProperty
    String getWebkitTextStroke();

    @JSProperty
    void setWebkitTextStroke(String webkitTextStroke);

    @Deprecated
    @JSProperty
    String getWebkitTextStrokeColor();

    @JSProperty
    void setWebkitTextStrokeColor(String webkitTextStrokeColor);

    @Deprecated
    @JSProperty
    String getWebkitTextStrokeWidth();

    @JSProperty
    void setWebkitTextStrokeWidth(String webkitTextStrokeWidth);

    @Deprecated
    @JSProperty
    String getWebkitTransform();

    @JSProperty
    void setWebkitTransform(String webkitTransform);

    @Deprecated
    @JSProperty
    String getWebkitTransformOrigin();

    @JSProperty
    void setWebkitTransformOrigin(String webkitTransformOrigin);

    @Deprecated
    @JSProperty
    String getWebkitTransformStyle();

    @JSProperty
    void setWebkitTransformStyle(String webkitTransformStyle);

    @Deprecated
    @JSProperty
    String getWebkitTransition();

    @JSProperty
    void setWebkitTransition(String webkitTransition);

    @Deprecated
    @JSProperty
    String getWebkitTransitionDelay();

    @JSProperty
    void setWebkitTransitionDelay(String webkitTransitionDelay);

    @Deprecated
    @JSProperty
    String getWebkitTransitionDuration();

    @JSProperty
    void setWebkitTransitionDuration(String webkitTransitionDuration);

    @Deprecated
    @JSProperty
    String getWebkitTransitionProperty();

    @JSProperty
    void setWebkitTransitionProperty(String webkitTransitionProperty);

    @Deprecated
    @JSProperty
    String getWebkitTransitionTimingFunction();

    @JSProperty
    void setWebkitTransitionTimingFunction(String webkitTransitionTimingFunction);

    @JSProperty
    @Nullable
    String getWebkitUserModify();

    @JSProperty
    void setWebkitUserModify(String webkitUserModify);

    @JSProperty
    @Nullable
    String getWebkitUserSelect();

    @JSProperty
    void setWebkitUserSelect(String webkitUserSelect);

    @JSProperty
    @Nullable
    String getWebkitWritingMode();

    @JSProperty
    void setWebkitWritingMode(String webkitWritingMode);

    @JSProperty
    String getWhiteSpace();

    @JSProperty
    void setWhiteSpace(String whiteSpace);

    @JSProperty
    String getWidows();

    @JSProperty
    void setWidows(String widows);

    @JSProperty
    String getWidth();

    @JSProperty
    void setWidth(String width);

    @JSProperty
    String getWillChange();

    @JSProperty
    void setWillChange(String willChange);

    @JSProperty
    String getWordBreak();

    @JSProperty
    void setWordBreak(String wordBreak);

    @JSProperty
    String getWordSpacing();

    @JSProperty
    void setWordSpacing(String wordSpacing);

    @JSProperty
    String getWordWrap();

    @JSProperty
    void setWordWrap(String wordWrap);

    @JSProperty
    String getWritingMode();

    @JSProperty
    void setWritingMode(String writingMode);

    @JSProperty
    String getZIndex();

    @JSProperty
    void setZIndex(String zIndex);

    @JSProperty
    @Nullable
    String getZoom();

    @JSProperty
    void setZoom(String zoom);

    String getPropertyPriority(String propertyName);

    String getPropertyValue(String propertyName);

    String item(int index);

    String removeProperty(String propertyName);

    void setProperty(String propertyName, String value, String priority);

    void setProperty(String propertyName, String value);

}
