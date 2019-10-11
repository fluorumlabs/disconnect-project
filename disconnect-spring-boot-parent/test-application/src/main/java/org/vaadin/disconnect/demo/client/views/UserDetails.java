package org.vaadin.disconnect.demo.client.views;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by Artem Godin on 10/11/2019.
 */
@PasswordsMatch
class UserDetails {
    @NotNull
    @NotBlank
    @Size(min = 8, max = 50)
    private String password;

    @NotNull
    @NotBlank
    @Size(min = 8, max = 50)
    private String confirmPassword;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }
}
