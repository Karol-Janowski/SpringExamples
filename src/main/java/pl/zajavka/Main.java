package pl.zajavka;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.zajavka.code.ExampleBean;
import pl.zajavka.configuration.ExampleConfigurationClass;

public class Main {
    public static void main(String[] args) {
        // Spring
        // convention over configuration
        // dependency injection
        // inversion of control

        // Spring Bean - obiekt zarzadzany przez Spring IoC Container
        // IoC - Inversion of control
        // DI - Dependency Injection

        // Konfiguracja jawna
        // - pliki xml
        // - oparte o jave
        // -- @Configuration
        // -- @Bean
        // Konfiguracja niejawna/automatyczna
        // - Adnotacje

        // Spring stereotypes
        // @Component - spring bean bez szczegolnego znaczenia
        // @Service - Bean realizujacy logike biznesowa
        // @Repository
        // @Controler
        // component scanning
        // automatic beans binding

        ApplicationContext context = new AnnotationConfigApplicationContext(ExampleConfigurationClass.class);

        System.out.println("Context created");
        ExampleBean exampleBean = context.getBean("exampleBean", ExampleBean.class);
        exampleBean.exampleMethod();
    }
}
