package pl.zajavka;

import org.springframework.context.annotation.Configuration;

@Configuration
public class ExampleConfigurationClass {

    public ExampleBean exampleBean(InjectedBean injectedBean, AnotherInjectedBean anotherInjectedBean) {
        return new ExampleBean(injectedBean, anotherInjectedBean);
    }


}
