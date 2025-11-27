package example;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"example"})  // diff fata de carte
public class ProjectConfiguration {
}