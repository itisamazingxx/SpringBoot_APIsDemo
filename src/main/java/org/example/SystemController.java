package org.example;

import org.springframework.web.bind.annotation.*;

@RestController
public class SystemController {
    /**
     *
     * @param userId
     * 通过PathVariable将用户端口的输入传给参数 (需与路径变量一样)
     * @return String outcome
     */
    @GetMapping("/account/id/{id}")
    public String getValidation(@PathVariable("id") String userId) {
        if (userId.equals("1")) {
            return "validation active";
        }
        else return "validation expired";
    }

    @PostMapping("/account/user")
    public Person createUser(@RequestBody Person person) {
        person.age = person.age + 1;
        return person;
    }
}


