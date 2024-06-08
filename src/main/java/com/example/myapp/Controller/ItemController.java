package com.example.myapp.Controller;

import java.util.ArrayList;
// import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;

@ComponentScan(basePackages = {"com.example.myapp"})
@RestController
public class ItemController {
    
    @GetMapping("/api/items")    
    public List<String> getItems(){
        
        List<String> items = new ArrayList<>();
        items.add("alpha");
        items.add("beta");
        items.add("gamma");

        return items;

    }
    
}

