package com.ducnd.beginer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @GetMapping(value = "getDemo")
    public String getDemo() {
        return "demo";
    }
}
