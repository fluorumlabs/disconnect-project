package com.github.fluorumlabs.disconnect.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.NoHandlerFoundException;
import org.springframework.web.servlet.view.RedirectView;

@SpringBootApplication
@ComponentScan(basePackages = {"com.github.fluorumlabs.disconnect.demo", "com.github.fluorumlabs.disconnect.core.server"})
@Controller
public class DemoApplication {

    @GetMapping("/*")
    public String home() {
        return "forward:/static/index.html";
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}