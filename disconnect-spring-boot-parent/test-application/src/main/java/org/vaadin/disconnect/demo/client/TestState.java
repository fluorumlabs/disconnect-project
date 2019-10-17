package org.vaadin.disconnect.demo.client;

import org.vaadin.disconnect.vue.annotations.Mutation;
import org.vaadin.disconnect.vue.annotations.PersistToLocalStorage;
import org.vaadin.disconnect.vue.annotations.VuexState;

import java.io.Serializable;

/**
 * Created by Artem Godin on 10/16/2019.
 */
@VuexState
@PersistToLocalStorage
public class TestState implements Serializable {
    private static final long serialVersionUID = 239892599;

    private String emailAddress = "";

    @Mutation
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
