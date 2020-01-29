package com.github.fluorumlabs.disconnect.zero.event;

import com.github.fluorumlabs.disconnect.zero.component.AbstractComponent;


public class VisibilityChange extends Target {
    private final boolean becameVisible;

    public VisibilityChange(AbstractComponent target, boolean becameVisible) {
        super(target);
        this.becameVisible = becameVisible;
    }

    public boolean becameVisible() {
        return becameVisible;
    }

    public boolean becameHidden() {
        return !becameVisible;
    }
}
