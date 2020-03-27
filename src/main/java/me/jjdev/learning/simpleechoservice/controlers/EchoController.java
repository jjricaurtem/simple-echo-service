package me.jjdev.learning.simpleechoservice.controlers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EchoController {

    @GetMapping()
    public final String status() {
        return "OK";
    }

    @GetMapping("/greeting")
    public final String echo(
            @RequestParam(name = "name", required = false, defaultValue = "World") String name) {
        return "Hello " + name;
    }
}
