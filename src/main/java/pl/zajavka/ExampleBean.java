package pl.zajavka;

public class ExampleBean {

    private InjectedBean injectedBean;

    public ExampleBean(InjectedBean injectedBean) {
        this.injectedBean = injectedBean;
    }
}
