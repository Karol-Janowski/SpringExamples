package pl.zajavka.code;


import lombok.AllArgsConstructor;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalTime;
@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class SingletonBean {


    private ObjectFactory<PrototypeBean> prototypeBean;

    public ObjectFactory<PrototypeBean> callPrototype() {
        System.out.println("Calling prototype: " + LocalTime.now());
        return prototypeBean;
    }
}
