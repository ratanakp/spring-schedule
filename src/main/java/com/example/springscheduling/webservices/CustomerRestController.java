package com.example.springscheduling.webservices;

import com.example.springscheduling.repositories.CustomerRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "/api/v1/customers")
public class CustomerRestController {

    private CustomerRepository customerRepository;

    public CustomerRestController(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @GetMapping("")
    public ResponseEntity<Map<String, Object>> getAllCustomer() {

        Map<String, Object> response = new HashMap<>();

        response.put("status", true);
        response.put("message", "Get customer success!");
        response.put("data", this.customerRepository.findAll());

        return ResponseEntity.ok(response);
    }
}
