package org.vaadin.disconnect.demo.client;

import org.vaadin.disconnect.vuetify.theme.CssColor;
import org.vaadin.disconnect.vuetify.theme.Theme;
import org.vaadin.disconnect.vuetify.theme.ThemeColor;
import org.vaadin.disconnect.vuetify.theme.VuetifyColor;

/**
 * Created by Artem Godin on 10/18/2019.
 */
public enum VaadinThemeColors implements ThemeColor {
    WATER, LAVA, SALMON, GOLD, GRASS,
    CHARCOAL, GRAPHITE, STAINLESS, ALUMINIUM, SNOW;

    public static void applyTo(Theme theme) {
        theme.define(WATER,"#00b4f0");
        theme.define(LAVA,"#F64D5A");
        theme.define(SALMON,"#e61e6d");
        theme.define(GOLD,"#FCBB34");
        theme.define(GRASS,"#34C65D");
        theme.define(CHARCOAL,"#2d3033");
        theme.define(GRAPHITE,"#36393d");
        theme.define(STAINLESS,"#829191");
        theme.define(ALUMINIUM,"#d3dae2");
        theme.define(SNOW,"#fafbfc");

        theme.alias(VuetifyColor.PRIMARY, VaadinThemeColors.WATER);
        theme.alias(VuetifyColor.SECONDARY, VaadinThemeColors.SALMON);
        theme.alias(VuetifyColor.ACCENT, VaadinThemeColors.GOLD);
        theme.alias(VuetifyColor.ERROR, VaadinThemeColors.LAVA);
        theme.alias(VuetifyColor.WARNING, VaadinThemeColors.GOLD);
        theme.alias(VuetifyColor.INFO, VaadinThemeColors.GRAPHITE);
        theme.alias(VuetifyColor.SUCCESS, VaadinThemeColors.GRASS);
    }
}
