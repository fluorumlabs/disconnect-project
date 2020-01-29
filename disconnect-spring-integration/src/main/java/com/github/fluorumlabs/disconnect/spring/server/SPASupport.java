package com.github.fluorumlabs.disconnect.spring.server;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class SPASupport {
    @GetMapping({"/", "/{x:[\\w-]+}", "/{x:^(?!static|rpc$).*$}/**/{y:[\\w-]+}"})
    public String forward() {
        return "forward:/index.html";
    }
}
