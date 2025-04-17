package cl.bennu.commons.controller.config;


import org.springframework.http.HttpMethod;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

public abstract class RestConfig {

    public static UrlBasedCorsConfigurationSource basic() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        CorsConfiguration config = new CorsConfiguration();
        config.addAllowedMethod(HttpMethod.GET);
        config.addAllowedMethod(HttpMethod.POST);
        config.addAllowedMethod(HttpMethod.PUT);
        config.addAllowedMethod(HttpMethod.DELETE);
        config.addAllowedMethod(HttpMethod.PATCH);

        config.addAllowedHeader("*");
        config.addAllowedOrigin("*");

        source.registerCorsConfiguration("/**", config);

        return source;
    }

}

