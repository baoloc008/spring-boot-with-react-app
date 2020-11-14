package server;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ServerInfo {
    public String time;
    public String environment;
    public String name;
}
