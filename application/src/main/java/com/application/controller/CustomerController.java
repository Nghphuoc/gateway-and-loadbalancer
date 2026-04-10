package com.application.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/v1")
public class CustomerController {

    Logger logger = LoggerFactory.getLogger(CustomerController.class);

    @GetMapping("/users")
    public ResponseEntity<Object> getCustomer() {
        Map<String, String> user = new HashMap<>();
        user.put("firstName", "John");
        user.put("lastName", "Doe");
        user.put("age", "19");
        logger.info("Customer request received" + user);
        return ResponseEntity.ok(user);
    }
}
