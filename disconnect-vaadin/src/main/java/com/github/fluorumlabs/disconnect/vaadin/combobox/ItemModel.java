package com.github.fluorumlabs.disconnect.vaadin.combobox;

import com.github.fluorumlabs.disconnect.core.utils.Mirrored;
import com.github.fluorumlabs.disconnect.core.utils.SerDes;
import lombok.Getter;

import java.io.Serializable;

/**
 * Created by Artem Godin on 7/7/2020.
 */
@Getter
public class ItemModel<T extends Serializable> implements Serializable {
    private final int index;
    private final T item;

    public ItemModel(js.lang.external.vaadin.combobox.ComboBoxItemModel<Mirrored<T>> jsModel, Class<T> itemClass) {
        index = jsModel.getIndex();
        item = SerDes.unmirror(jsModel.getItem(), itemClass);
    }
}
