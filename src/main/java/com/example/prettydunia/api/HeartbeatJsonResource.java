package com.example.prettydunia.api;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/heartbeat")
public class HeartbeatJsonResource {




    @GetMapping
    public String getHeartbeat(){

        return "Hello World";
    }
}
