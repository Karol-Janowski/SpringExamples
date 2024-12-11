package pl.zajavka.code;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ExampleBean {

    private final InjectedBean injectedBean;
    private SomeCommonInterface someCommonInterface;

    @Autowired
    public ExampleBean(InjectedBean injectedBean, @Qualifier("SomeBeanByName2") SomeCommonInterface someCommonInterface) {
        this.injectedBean = injectedBean;
        this.someCommonInterface = someCommonInterface;
        System.out.println("calling exampleBean()");
    }

    public void exampleMethod() {
        System.out.println("calling exampleMethod()");
    }
}
