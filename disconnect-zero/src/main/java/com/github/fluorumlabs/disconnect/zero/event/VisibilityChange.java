package com.github.fluorumlabs.disconnect.zero.event;

import com.github.fluorumlabs.disconnect.zero.component.Component;


public class VisibilityChange extends Target {
    private final boolean becameVisible;

    public VisibilityChange(Component target, boolean becameVisible) {
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
