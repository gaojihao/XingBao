package com.lizhi.xbkt;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HomeController {

    @RequestMapping("/hello")

    public String index() {
        return "Hello World";
    }
}
