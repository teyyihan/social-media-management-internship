package io.teyyihan.gateway.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.core.convert.converter.Converter
import org.springframework.http.HttpMethod
import org.springframework.security.authentication.AbstractAuthenticationToken
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter
import org.springframework.security.core.authority.SimpleGrantedAuthority
import org.springframework.security.oauth2.jwt.Jwt
import org.springframework.security.oauth2.server.resource.authentication.JwtAuthenticationConverter
import org.springframework.security.web.access.AccessDeniedHandlerImpl


@Configuration
@EnableWebSecurity
class SecurityConfig: WebSecurityConfigurerAdapter() {

    @Throws(java.lang.Exception::class)
    override fun configure(http: HttpSecurity) {
        http.cors().disable().csrf().disable()
            .authorizeRequests()
            .antMatchers(HttpMethod.POST, "/publish/**").authenticated()
            .and()
            .exceptionHandling()
            .accessDeniedHandler(AccessDeniedHandlerImpl())
            .and()
            .oauth2ResourceServer()
            .jwt()
            .jwtAuthenticationConverter(grantedAuthoritiesExtractor())
    }

    @Bean
    fun grantedAuthoritiesExtractor(): Converter<Jwt, AbstractAuthenticationToken> {
        val converter = JwtAuthenticationConverter()
        converter.setJwtGrantedAuthoritiesConverter(Converter { jwt: Jwt ->
            val resource = jwt.getClaimAsMap("realm_access")
            val roles = resource["roles"] as List<String>
            return@Converter roles.map { role -> SimpleGrantedAuthority(role) }
        })
        return converter
    }

}