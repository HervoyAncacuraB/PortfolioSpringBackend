package com.cofebreak.portfoliospringbackend.config;

import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
            .antMatchers(HttpMethod.OPTIONS, "/portfolio", "/portfolio/**")
            .permitAll()
            .antMatchers(HttpMethod.POST, "/portfolio")
            .hasAuthority("SCOPE_portfolio:create")
            .antMatchers(HttpMethod.DELETE, "/portfolio/*")
            .hasAuthority("SCOPE_portfolio:delete")
            .antMatchers(HttpMethod.GET, "/portfolio")
            .permitAll()
            .and()
            .oauth2ResourceServer()
            .jwt();
    }
}
