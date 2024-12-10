package pl.zajavka;

public class ExampleBean {

    private final InjectedBean injectedBean;
    private final AnotherInjectedBean anotherInjectedBean;

    public ExampleBean(InjectedBean injectedBean, AnotherInjectedBean anotherInjectedBean) {
        this.injectedBean = injectedBean;
        this.anotherInjectedBean = anotherInjectedBean;
        System.out.println("calling exampleBean()");
    }

    public void exampleMethod() {
        System.out.println("calling exampleMethod()");
    }
}
