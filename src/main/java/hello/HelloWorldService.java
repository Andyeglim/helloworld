package hello;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class HelloWorldService {

    public String getHelloMessage(final String name) {
        return "Hello " + name;
    }

}
