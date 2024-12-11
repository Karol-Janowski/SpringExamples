package pl.zajavka.code;

import org.springframework.stereotype.Service;

@Service
public class InjectedBean {

    public InjectedBean() {
        System.out.println("calling InjectedBean()");
    }

    public void someMethod() {
        System.out.println("Calling someMethod");
    }

    public void initMethod() {
        System.out.println("InjectedBean initMethod()");
    }

    public void destroyMethod() {
        System.out.println("InjectedBean destroyMethod");
    }
}
