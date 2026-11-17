package startup.vn.userservice.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PingMe {

    @GetMapping("/ping")
    public String ping() {
        return "[user-service] Pong!";
    }
}
