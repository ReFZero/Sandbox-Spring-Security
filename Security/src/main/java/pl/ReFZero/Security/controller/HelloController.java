package pl.ReFZero.Security.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class HelloController {


    @GetMapping("/")
    public String greeting() {
        return "Hello";
    }

    @GetMapping("/secured")
    public String secured() {
        return "You are logged in";
    }
}
