package server;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class WebController {
    @Autowired
    private AppConfig appConfig;

    @GetMapping("/api/serverinfo")
    public String serverInfo() {
        System.out.println(appConfig.applicationName);
        String serverTime = new Date().toString();
        String serverEnvironment = appConfig.serverEnvironment;
        return String.format("Server time: %s (%s environment)", serverTime, serverEnvironment);
    }
}
