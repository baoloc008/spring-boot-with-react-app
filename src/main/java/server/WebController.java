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
    public ServerInfo serverInfo() {
        return ServerInfo.builder()
                .environment(appConfig.serverEnvironment)
                .name(appConfig.applicationName)
                .time(new Date().toString())
                .build();
    }
}
