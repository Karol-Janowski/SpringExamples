package pl.zajavka.code;

import org.springframework.stereotype.Component;


public class AnotherInjectedBean {

    public AnotherInjectedBean() {
        System.out.println("calling AnotherInjectedBean()");
    }
}
