package org.vaadin.disconnect.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@ComponentScan(basePackages = {"org.vaadin.disconnect.demo", "org.vaadin.disconnect.core.server"})
@Controller
public class DemoApplication {

    @GetMapping("/*")
    public String home() {
        return "forward:/static/index.html";
    }

    @GetMapping("/sw.js")
    public String serviceWorker() {
        return "forward:/static/bin/sw.js";
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}