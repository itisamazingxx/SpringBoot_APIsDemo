package org.example;

import org.springframework.web.bind.annotation.*;

@RestController
public class SystemController {
    @GetMapping("/account/id/{id}")
    public String getName(@PathVariable("id") String userId) {
        if (userId.equals("1")) {
            return "this account has already enrolled";
        } else if (userId.equals("2")) {
            return "account status: pending";
        }
        else { return "status terminated"; }
    }

    @PostMapping("/account/user")
    public Person createUser(@RequestBody Person person) {
        person.age = person.age + 1;
        return person;
    }
}


