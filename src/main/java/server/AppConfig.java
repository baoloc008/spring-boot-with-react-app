package server;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
@Data
public class AppConfig {
    @Value("${server.environment}")
    public String serverEnvironment;

    @Value("${application.name}")
    public String applicationName;
}
