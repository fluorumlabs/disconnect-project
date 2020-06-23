package com.github.fluorumlabs.disconnect.core.observables;

import lombok.Data;

import javax.validation.constraints.Positive;

/**
 * Created by Artem Godin on 6/23/2020.
 */
@Data
public class InnerBean {
    private @Positive int field;
}
