package org.vaadin.disconnect.core.server;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.teavm.rhino.javascript.ast.ErrorCollector;

/**
 * Created by Artem Godin on 10/17/2019.
 */
@Controller
public class SPASupport {
    @GetMapping({"/", "/{x:[\\w-]+}", "/{x:^(?!static|rpc$).*$}/**/{y:[\\w-]+}"})
    public String forward() {
        return "forward:/index.html";
    }
}
