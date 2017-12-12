package hello;

import org.springframework.stereotype.Component;
import org.springframework.web.util.HtmlUtils;

@Component
public class HelloWorldService {

    public String getHelloMessage(final String name) {
        return "Hello " + HtmlUtils.htmlEscape(name);
    }

}
