package pl.zajavka.code;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExampleBean {

    private final InjectedBean injectedBean;
    private final AnotherInjectedBean anotherInjectedBean;

    @Autowired
    public ExampleBean(InjectedBean injectedBean, AnotherInjectedBean anotherInjectedBean) {
        this.injectedBean = injectedBean;
        this.anotherInjectedBean = anotherInjectedBean;
        System.out.println("calling exampleBean()");
    }

    public void exampleMethod() {
        System.out.println("calling exampleMethod()");
    }
}
