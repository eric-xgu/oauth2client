package com.ringo.oauth2client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;

@SpringBootApplication
//开启单点登录
@EnableOAuth2Sso
public class Oauth2clientApplication {

    public static void main(String[] args) {
        SpringApplication.run(Oauth2clientApplication.class, args);
    }

}
