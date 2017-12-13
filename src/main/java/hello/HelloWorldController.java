package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@SessionAttributes("name")
public class HelloWorldController {

    @Autowired
    private HelloWorldService helloWorldService;

    @GetMapping("/")
    public String helloWorld(@RequestParam(value = "name", defaultValue = "World") final String name) {
        return this.helloWorldService.getHelloMessage(name);
    }

}