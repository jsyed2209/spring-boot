package org.ncr;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/isAlive")
public class IsAliveController {

    @GetMapping
    public String isAlive() {
        return "Application is alive and running!";
    }
}
