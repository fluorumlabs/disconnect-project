package com.github.fluorumlabs.disconnect.core.components.html.table;

import com.github.fluorumlabs.disconnect.core.annotations.Tag;
import com.github.fluorumlabs.disconnect.core.components.HtmlComponent;
import com.github.fluorumlabs.disconnect.core.containers.ArrayLikeBackedComponentList;
import com.github.fluorumlabs.disconnect.core.containers.ComponentList;
import com.github.fluorumlabs.disconnect.core.internals.TagRegistry;
import js.web.dom.HTMLTableCaptionElement;
import js.web.dom.HTMLTableElement;

import javax.annotation.Nullable;
import java.util.Optional;

@Tag("table")
public class Table extends HtmlComponent<HTMLTableElement> {
    /**
     * Retrieves the caption object of a table.
     */
    public Optional<Caption> getCaption() {
        return Optional.ofNullable(getElement().getCaption()).map(TagRegistry::recover);
    }

    public void setCaption(@Nullable Caption caption) {
        if (caption == null) {
            getElement().setCaption(null);
            return;
        }
        getElement().setCaption(caption.getElement());
    }

    /**
     * Sets or retrieves the number of horizontal rows contained in the object.
     */
    public ComponentList<Row> getRows() {
        return  new ArrayLikeBackedComponentList<>(getElement().getRows());
    }

    /**
     * Retrieves a collection of all tBody objects in the table. Objects in this collection are in source order.
     */
    public ComponentList<Body> getBodies() {
        return  new ArrayLikeBackedComponentList<>(getElement().getTBodies());
    }

    /**
     * Retrieves the tFoot object of the table.
     */
    public Optional<Footer> getFooter() {
        return Optional.ofNullable(getElement().getTFoot()).map(TagRegistry::recover);
    }

    public void setFooter(@Nullable Footer tFoot) {
        if (tFoot == null) {
            getElement().setTFoot(null);
            return;
        }
        getElement().setTFoot(tFoot.getElement());
    }

    /**
     * Retrieves the tHead object of the table.
     */
    public Optional<Header> getHeader() {
        return Optional.ofNullable(getElement().getTHead()).map(TagRegistry::recover);
    }

    public void setHeader(@Nullable Header tHead) {
        if (tHead==null) {
            getElement().setTHead(null);
            return;
        }
        getElement().setTHead(tHead.getElement());
    }

    /**
     * Creates an empty caption element in the table.
     */
    public Caption createCaption() {
        return TagRegistry.recover(getElement().createCaption());
    }

    /**
     * Creates an empty tBody element in the table.
     */
    public Body createBody() {
        return TagRegistry.recover(getElement().createTBody());
    }

    /**
     * Creates an empty tFoot element in the table.
     */
    public Footer createFooter() {
        return TagRegistry.recover(getElement().createTFoot());
    }

    /**
     * Returns the tHead element object if successful, or null otherwise.
     */
    public Header createHeader() {
        return TagRegistry.recover(getElement().createTHead());
    }

    /**
     * Deletes the caption element and its contents from the table.
     */
    public void deleteCaption() {
        getElement().deleteCaption();
    }

    /**
     * Removes the specified row (tr) from the element and from the rows collection.
     *
     * @param index Number that specifies the zero-based position in the rows collection of the row to remove.
     */
    public void deleteRow(int index) {
        getElement().deleteRow(index);
    }

    /**
     * Deletes the tFoot element and its contents from the table.
     */
    public void deleteFooter() {
        getElement().deleteTFoot();
    }

    /**
     * Deletes the tHead element and its contents from the table.
     */
    public void deleteHeader() {
        getElement().deleteTHead();
    }

    /**
     * Creates a new row (tr) in the table, and adds the row to the rows collection.
     *
     * @param index Number that specifies where to insert the row in the rows collection. The default value is -1, which appends the new row to the end of the rows collection.
     */
    public Row insertRow(int index) {
        return TagRegistry.recover(getElement().insertRow(index));
    }

    public Row appendRow() {
        return TagRegistry.recover(getElement().insertRow());
    }

    @Tag("caption")
    public static class Caption extends HtmlComponent<HTMLTableCaptionElement> {
    }

    @Tag("colgroup")
    public static class ColumnGroup extends HtmlTableColComponent {
        @Tag("col")
        public static class Column extends HtmlTableColComponent {
        }

    }

    @Tag("thead")
    public static class Header extends HtmlTableSectionComponent {
    }

    @Tag("tbody")
    public static class Body extends HtmlTableSectionComponent {

    }

    @Tag("tfoot")
    public static class Footer extends HtmlTableSectionComponent {
    }


}
