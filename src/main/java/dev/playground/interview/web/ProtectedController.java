package dev.playground.interview.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProtectedController {
    @GetMapping("/protected")
    public String protectedEndpoint() {
        return "You have accessed a protected resource";
    }
}
