package org.coding4life.epateway.service;

import org.springframework.stereotype.Service;

@Service
public class HelloService implements SampleService{
    @Override
    public String getMessage() {
        return "Hello, World!";
    }
}
