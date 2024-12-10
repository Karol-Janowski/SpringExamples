package pl.zajavka;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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
        // Konfiguracja niejawna/automatyczna
        // - Adnotacje

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        ExampleBean exampleBean = context.getBean("exampleBean", ExampleBean.class);
        exampleBean.exampleMethod();
    }
}
