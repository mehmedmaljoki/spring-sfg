package meski.springframework.sfg.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@ConfigurationProperties("meski")
@Configuration
public class SfgConfiguration {
    private String username;
    private String password;
    private String idbcurl;


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getIdbcurl() {
        return idbcurl;
    }

    public void setIdbcurl(String idbcurl) {
        this.idbcurl = idbcurl;
    }
}
