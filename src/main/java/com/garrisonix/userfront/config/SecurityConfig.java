package com.garrisonix.userfront.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    private static final String[] PUBLIC = {
            "/",
            "/index/",
            "/css/**",
            "/js/**",
            "/images/**",
            "/signup/"
    };
    @Override
    protected void configure(HttpSecurity httpSecurity) throws Exception {
        httpSecurity
                .authorizeRequests()
                .antMatchers(PUBLIC).permitAll();
    }
}
