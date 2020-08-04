package com.github.fluorumlabs.disconnect.core.observables;

import lombok.Data;

import javax.validation.constraints.Positive;
import java.io.Serializable;

/**
 * Created by Artem Godin on 6/23/2020.
 */
@Data
public class InnerBean implements Serializable {
    private @Positive int field;
}
