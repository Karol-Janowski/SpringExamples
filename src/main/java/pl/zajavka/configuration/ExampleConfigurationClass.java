package pl.zajavka.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import pl.zajavka.Main;
import pl.zajavka.code.SomeBean1;
import pl.zajavka.code.SomeCommonInterface;

@Configuration
@ComponentScan(basePackageClasses = Main.class)
public class ExampleConfigurationClass {

    @Bean
    public SomeCommonInterface someBeanByName() {
        return new SomeBean1();
    }
}
