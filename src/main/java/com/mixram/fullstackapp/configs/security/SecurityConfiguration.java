package com.mixram.fullstackapp.configs.security;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author mixram on 2021-05-13.
 * @since 0.1.0.0.0
 */
public abstract class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    // <editor-fold defaultstate="collapsed" desc="***API elements***">

    //

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="***Util elements***">

    //

    // </editor-fold>


    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers(
                "/info",
                "/health",
                "/metrics"
        );
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .requiresChannel().anyRequest().requiresSecure()
                .and()
                .formLogin().disable()
                .httpBasic().disable();
    }


    // <editor-fold defaultstate="collapsed" desc="***Private elements***">

    //

    // </editor-fold>
}
