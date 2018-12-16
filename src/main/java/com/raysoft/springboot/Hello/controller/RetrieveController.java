package com.raysoft.springboot.Hello.controller;

import com.raysoft.springboot.Hello.entity.Customer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RetrieveController {
    @RequestMapping("/get-customer")
    public Customer getCustomer(@RequestParam(value="id", defaultValue="0") long id) {
        Customer c = new Customer();
        if (id == 0) {
            c.setName("default");
        } else {
            c.setName("#itmaker");
        }
        return c;
    }
}
