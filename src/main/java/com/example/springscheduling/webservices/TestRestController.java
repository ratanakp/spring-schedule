package com.example.springscheduling.webservices;

import com.example.springscheduling.repositories.TestRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "/api/v1/tests")
public class TestRestController {

    private TestRepository testRepository;

    public TestRestController(TestRepository testRepository) {
        this.testRepository = testRepository;
    }


    @GetMapping("")
    public ResponseEntity<Map<String, Object>> getAllTests() {

        Map<String, Object> response = new HashMap<>();

        response.put("status", true);
        response.put("message", "Get all tests success!");
        response.put("data", this.testRepository.getAllTest());

        return ResponseEntity.ok(response);
    }
}
