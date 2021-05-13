package com.mixram.fullstackapp.configs.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

/**
 * @author mixram on 2021-05-13.
 * @since 0.1.0.0.0
 */
@Profile({"prod"})
@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(securedEnabled = true, prePostEnabled = true)
public class ProdSecurityConfiguration extends SecurityConfiguration {
}
