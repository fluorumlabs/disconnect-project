package com.github.fluorumlabs.disconnect.spring.server;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletResponse;


@Controller
public class SPASupport {
    @GetMapping({"/", "/{x:[\\w-]+}", "/{x:^(?!static|rpc$).*$}/**/{y:[\\w-]+}"})
    public String forward(HttpServletResponse response) {
        response.addHeader("Cache-Control", "max-age=60, must-revalidate, no-transform");
        return "forward:/index.html";
    }
}
