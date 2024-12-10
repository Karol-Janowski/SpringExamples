package pl.zajavka.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import pl.zajavka.Main;
import pl.zajavka.code.Marker;

@Configuration
@ComponentScan(basePackageClasses = Main.class)
public class ExampleConfigurationClass {

}
