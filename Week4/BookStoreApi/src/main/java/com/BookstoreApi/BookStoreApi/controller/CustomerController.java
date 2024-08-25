package com.BookstoreApi.BookStoreApi.controller;

import com.BookstoreApi.BookStoreApi.model.Customer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @PostMapping("/register")
    public ResponseEntity<String> registerCustomer(@RequestBody Customer customer) {
        // Here you would typically save the customer to the database
        return ResponseEntity.ok("Customer registered successfully");
    }

    @PostMapping("/register-form")
    public ResponseEntity<String> registerCustomerForm(@RequestParam String name,
                                                       @RequestParam String email,
                                                       @RequestParam String password) {
        // Process form data
        return ResponseEntity.ok("Customer registered successfully via form");
    }
}
