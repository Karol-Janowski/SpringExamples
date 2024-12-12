package pl.zajavka.configuration;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import pl.zajavka.Main;
import pl.zajavka.code.*;

@Configuration
@ComponentScan(basePackageClasses = Main.class)
public class ExampleConfigurationClass {

//    @Bean(initMethod = "initMethod", destroyMethod = "destroyMethod")
//    public InjectedBean injectedBean() {
//        return new InjectedBean();
//    }

    @Bean
    @Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
    public SingletonBean singletonBean(final ObjectFactory<PrototypeBean> prototypeBean) {
        return new SingletonBean(prototypeBean);
    }

    @Bean
    @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public PrototypeBean prototypeBean() {
        return new PrototypeBean();
    }
}

