package com.jazz.duet.standards.config

import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter

@Configuration
class WebSecurityConfiguration : WebSecurityConfigurerAdapter() {

    private val AUTH_WHITELIST = arrayOf(
            "/swagger-resources/**", "/swagger-ui.html", "/v2/api-docs", "/webjars/**", "/api/**")

    @Throws(Exception::class)
    override fun configure(http: HttpSecurity) {
        http.authorizeRequests()
                .antMatchers(*AUTH_WHITELIST).permitAll()
                .antMatchers("/**/*").denyAll()
    }
}