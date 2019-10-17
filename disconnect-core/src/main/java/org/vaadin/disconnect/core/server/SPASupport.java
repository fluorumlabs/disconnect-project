package org.vaadin.disconnect.core.server;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by Artem Godin on 10/17/2019.
 */
@Controller
public class SPASupport {
    @GetMapping({"/", "/{x:[\\w-]+}", "/{x:^(?!static|rpc$).*$}/**/{y:[\\w-]+}"})
    public String home() {
        return "forward:/static/index.html";
    }

    @GetMapping("/sw.js")
    public String serviceWorker() {
        return "forward:/static/bin/sw.js";
    }
}
