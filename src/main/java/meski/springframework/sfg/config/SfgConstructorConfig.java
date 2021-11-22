package meski.springframework.sfg.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

@ConstructorBinding
@ConfigurationProperties("meski")
public class SfgConstructorConfig {
    private final String username;
    private final String password;
    private final String idbcurl;

    public SfgConstructorConfig(String username, String password, String idbcurl) {
        this.username = username;
        this.password = password;
        this.idbcurl = idbcurl;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getIdbcurl() {
        return idbcurl;
    }
}
