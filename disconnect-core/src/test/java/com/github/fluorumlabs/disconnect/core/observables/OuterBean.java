package com.github.fluorumlabs.disconnect.core.observables;

import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * Created by Artem Godin on 6/23/2020.
 */
@Data
public class OuterBean {
    private @NotNull @Valid InnerBean subBean;
    private @Valid InnerBean optionalSubBean;
}
