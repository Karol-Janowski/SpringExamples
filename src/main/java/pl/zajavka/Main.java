package pl.zajavka;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import pl.zajavka.code.ExampleBean;
import pl.zajavka.code.InjectedBean;
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

        System.out.println("### Before context ###");
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(ExampleConfigurationClass.class);
        System.out.println("### After context ###");

        System.out.println("### Before Bean Retrival");
        InjectedBean bean = context.getBean(InjectedBean.class);
        System.out.println("### After Bean retrival ###");

        System.out.println("### Before calling method ###");
        bean.someMethod();
        System.out.println("### After calling method ###");

        System.out.println("### Before context closing ###");
        context.close();
        System.out.println("### After context closing ###");
    }
}
