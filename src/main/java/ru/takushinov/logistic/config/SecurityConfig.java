package ru.takushinov.logistic.config;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.HttpStatusEntryPoint;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import ru.takushinov.logistic.service.UserService;
import ru.takushinov.logistic.util.JwtRequestFilter;


@Configuration
@RequiredArgsConstructor
public class SecurityConfig {
    private final UserService userService;

    private final JwtRequestFilter filter;

    @Bean
    public WebSecurityCustomizer webSecurityCustomizer() {
        return web -> web.ignoring().requestMatchers("/api/v1/auth/");
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
        httpSecurity
                .csrf()
                .disable()
                .authorizeHttpRequests()
//                .requestMatchers(HttpMethod.POST, "/api/v1/users/**").hasRole("SUPERADMIN")
//                .requestMatchers(HttpMethod.PUT, "/api/v1/users/**").hasRole("SUPERADMIN")
//                .requestMatchers(HttpMethod.DELETE, "/api/v1/users/**").hasRole("SUPERADMIN")
//                .requestMatchers(HttpMethod.GET, "/api/v1/users/**").hasAnyRole("ADMIN", "SUPERADMIN")
//                .requestMatchers( HttpMethod.POST, "/api/v1/products/**").hasRole("ADMIN")
//                .requestMatchers( HttpMethod.PUT, "/api/v1/products/**").hasRole("ADMIN")
                .requestMatchers( HttpMethod.POST, "/api/v1/users/**").hasRole("ADMIN")
                .anyRequest().permitAll()
                .and()
                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                .and()
                .headers().frameOptions().disable()
                .and()
                .exceptionHandling()
                .authenticationEntryPoint(new HttpStatusEntryPoint(HttpStatus.UNAUTHORIZED))
                .and()
                .authenticationProvider(authenticationProvider())
                .addFilterBefore(filter, UsernamePasswordAuthenticationFilter.class);
        return httpSecurity.build();
    }

//    @Bean
//    public UserDetailsService userDetailsService() {
//        return new UserService();
//
//    }


    @Bean
    public AuthenticationProvider authenticationProvider() {
        DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();
        authProvider.setUserDetailsService(userService);
        authProvider.setPasswordEncoder(passwordEncoder());
        return authProvider;
    }

    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration config) throws Exception {
        return config.getAuthenticationManager();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

}