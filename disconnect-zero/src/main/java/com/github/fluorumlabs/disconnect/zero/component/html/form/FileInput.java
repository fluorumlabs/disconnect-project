package com.github.fluorumlabs.disconnect.zero.component.html.form;

import js.web.dom.File;
import js.web.dom.FileList;

import javax.annotation.Nullable;
import java.util.stream.Stream;

/**
 * Created by Artem Godin on 5/14/2020.
 */
public class FileInput extends Input {
    public FileInput() {
        setType("file");
    }

    /**
     * Sets or retrieves a comma-separated list of content types.
     */
    @Override
    public String getAccept() {
        return super.getAccept();
    }

    @Override
    public void setAccept(String accept) {
        super.setAccept(accept);
    }

    /**
     * Returns a FileList object on a file type input object.
     * @return
     */
    @Override
    public Stream<File> getFiles() {
        return super.getFiles();
    }

    @Override
    public void setFiles(@Nullable FileList files) {
        super.setFiles(files);
    }

    /**
     * Sets or retrieves the Boolean value indicating whether multiple items can be selected from a list.
     */
    @Override
    public boolean isMultiple() {
        return super.isMultiple();
    }

    @Override
    public void setMultiple(boolean multiple) {
        super.setMultiple(multiple);
    }

    /**
     * When present, marks an element that can't be submitted without a value.
     */
    @Override
    public boolean isRequired() {
        return super.isRequired();
    }

    @Override
    public void setRequired(boolean required) {
        super.setRequired(required);
    }

    /**
     * Makes the selection equal to the current object.
     */
    @Override
    public void select() {
        super.select();
    }
}
