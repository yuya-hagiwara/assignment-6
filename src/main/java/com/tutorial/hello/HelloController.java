package com.tutorial.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "hello world";
    }

    @GetMapping("/human")
<<<<<<< HEAD
    public List<Human> getHuman() {
=======
    public List<Human> GetHuman() {
>>>>>>> origin/feature/hello-world
        List<Human> human = new ArrayList<>();
        human.add(new Human("yuya", 32));
        human.add(new Human("taka", 33));
        return human;
    }
}








