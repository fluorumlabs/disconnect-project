package com.github.fluorumlabs.disconnect.core.router;

/**
 * Created by Artem Godin on 6/17/2020.
 */
public interface HasLifecycleCallbacks {
    default void onBeforeEnter(BeforeEnter beforeEnter) {
    }
    default void onBeforeLeave(BeforeLeave beforeLeave) {
    }
    default void onAfterEnter(AfterEnter afterEnter) {
    }
    default void onAfterLeave(AfterLeave afterLeave) {
    }
}
