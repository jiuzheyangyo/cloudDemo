package com.zhu.auth.authserver.config;

import org.springframework.boot.autoconfigure.security.oauth2.resource.OAuth2ResourceServerConfiguration;
import org.springframework.boot.autoconfigure.security.oauth2.resource.ResourceServerProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@Configuration
@EnableResourceServer
public class OAuth2ResourceConfig extends OAuth2ResourceServerConfiguration{
    public OAuth2ResourceConfig(ResourceServerProperties resource) {
        super(resource);
    }
}
