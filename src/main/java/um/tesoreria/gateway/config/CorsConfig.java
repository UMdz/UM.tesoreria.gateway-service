package um.tesoreria.gateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.reactive.CorsWebFilter;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;

import java.util.Arrays;
import java.util.Collections;

@Configuration
public class CorsConfig {

    @Bean
    public CorsWebFilter corsWebFilter() {
        CorsConfiguration corsConfig = new CorsConfiguration();

        // allowedOriginPatterns es la forma moderna y segura en Spring Boot 3+/4+ 
        // para permitir cualquier origen (incluyendo localhost vs 127.0.0.1)
        // Spring WebFlux y los navegadores son muy estrictos cuando allowCredentials es true.
        // El comodín "*" global suele ser rechazado. Debemos especificar los patrones exactos.
        corsConfig.setAllowedOriginPatterns(Arrays.asList(
                "http://localhost:[*]",
                "http://127.0.0.1:[*]",
                "http://192.168.201.*:[*]",
                "http://192.168.7.*:[*]",
                "http://192.168.1.*:[*]",
                "http://10.147.20.*[*]",
                "http://172.16.201.*[*]",
                "https://localhost:[*]",
                "https://127.0.0.1:[*]",
                "https://192.168.201.*:[*]",
                "https://192.168.7.*:[*]",
                "https://192.168.1.*:[*]",
                "https://10.147.20.*[*]",
                "https://172.16.201.*[*]"
        ));
        corsConfig.setMaxAge(3600L);
        corsConfig.setAllowedMethods(Arrays.asList("GET", "POST", "PUT", "DELETE", "OPTIONS", "HEAD", "PATCH"));
        corsConfig.setAllowedHeaders(Collections.singletonList("*"));

        // Habilitar credenciales suele ser necesario cuando el frontend y backend 
        // manejan tokens, cookies o headers de autorización estrictos.
        corsConfig.setAllowCredentials(true);

        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        // Aplicar esta configuración de CORS a TODAS las rutas del Gateway
        source.registerCorsConfiguration("/**", corsConfig);

        return new CorsWebFilter(source);
    }
}
