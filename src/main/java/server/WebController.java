package server;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class WebController {
    @GetMapping("/api/serverinfo")
    public String serverInfo() {
        String serverTime = new Date().toString();
        String serverEnvironment = "test";
        return String.format("Server time: %s (%s environment)", serverTime, serverEnvironment);
    }
}
