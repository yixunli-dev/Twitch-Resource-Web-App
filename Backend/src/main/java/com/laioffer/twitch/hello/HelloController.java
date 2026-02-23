package com.laioffer.twitch.hello;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController // controller 的决定因素
public class HelloController {

    @GetMapping("/hello")
    public Person sayHello(@RequestParam(required = false) String name) {
        if (name == null) {
            name = "Guest";
        }
        return new Person(
                name,
                "Laioffer",
                new Address("123 Main St", "San Francisco", null, null),
                new Book("The Hobbit", "J.R.R. Tolkien")
        );
    }


//    @GetMapping("/hello")
//    public Person sayHello() {
//        return new Person(
//                "John",
//                "Laioffer",
//                new Address("123 Main St", "San Francisco", "CA", "US"),
//                new Book("The Hobbit", "J.R.R. Tolkien")
//        );
//    }

//    @GetMapping("/hello")
//    public String sayHello() {
//        return "Hello World!";
//    }
//
//    @GetMapping("/goodbye")
//    public String sayGoodbye() {
//        return "Goodbye World!";
//    }
}
