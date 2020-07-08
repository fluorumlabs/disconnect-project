package com.github.fluorumlabs.disconnect.vaadin.grid;

import com.github.fluorumlabs.disconnect.core.utils.Mirrored;
import com.github.fluorumlabs.disconnect.core.utils.SerDes;
import js.lang.external.vaadin.grid.GridItemModel;
import lombok.Getter;

/**
 * Created by Artem Godin on 7/7/2020.
 */
@Getter
public class ItemModel<T> {
    private final int index;
    private final T item;

    private final int level;

    private final boolean selected;
    private final boolean expanded;
    private final boolean detailsOpened;

    public ItemModel(GridItemModel<Mirrored<T>> jsModel, Class<T> itemClass) {
        index = jsModel.getIndex();
        item = SerDes.unmirror(jsModel.getItem(), itemClass);

        level = jsModel.getLevel();
        selected = jsModel.isSelected();
        expanded = jsModel.isExpanded();
        detailsOpened = jsModel.isDetailsOpened();
    }
}
