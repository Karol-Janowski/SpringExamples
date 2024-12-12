package pl.zajavka;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import pl.zajavka.code.ExampleBean;
import pl.zajavka.code.ExamplePrototypeBean;
import pl.zajavka.code.ExampleSingletonBean;
import pl.zajavka.code.InjectedBean;
import pl.zajavka.configuration.ExampleConfigurationClass;

import java.sql.SQLOutput;

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

        // Bean scopes
        // - singletone - default
        // - prototype
        // scopy dostepne tylko dla webowych aplikacji // kontekst webowy
        // - request - zadanie http
        // - session - instancja serwisu na jedna sesje http
        // - application - jeden serwis na kontekst webowy
        // - websocket - jedna instancja na websocket

//        System.out.println("### Before context ###");
//        AbstractApplicationContext context = new AnnotationConfigApplicationContext(ExampleConfigurationClass.class);
//        System.out.println("### After context ###");
//
//        System.out.println("### Before Bean Retrival");
//        InjectedBean bean = context.getBean(InjectedBean.class);
//        System.out.println("### After Bean retrival ###");
//
//        System.out.println("### Before calling method ###");
//        bean.someMethod();
//        System.out.println("### After calling method ###");
//
//        System.out.println("### Before context closing ###");
//        context.close();
//        System.out.println("### After context closing ###");

        AbstractApplicationContext context = new AnnotationConfigApplicationContext(ExampleConfigurationClass.class);

        ExampleSingletonBean singleton1 = context.getBean(ExampleSingletonBean.class);
        ExampleSingletonBean singleton2 = context.getBean(ExampleSingletonBean.class);

        ExamplePrototypeBean prototype1 = context.getBean(ExamplePrototypeBean.class);
        ExamplePrototypeBean prototype2 = context.getBean(ExamplePrototypeBean.class);

        System.out.println("singletion1 == singletione2? " + (singleton1 == singleton2));
        System.out.println("prototype1 == prototype2? " + (prototype1 == prototype2));

        InjectedBean injectedBean = context.getBean(InjectedBean.class);
        boolean isInjectedBeanAsSingleton =
                injectedBean == singleton1.getInjectedBean()
                && injectedBean == singleton2.getInjectedBean()
                && injectedBean == prototype1.getInjectedBean()
                && injectedBean == prototype2.getInjectedBean();

        System.out.println("Is injectedBean a singleton? " + isInjectedBeanAsSingleton);

    }
}
