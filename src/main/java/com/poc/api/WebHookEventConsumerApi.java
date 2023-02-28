package com.poc.api;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/webhook")
public class WebHookEventConsumerApi {

    @PostMapping("/payload")
    public String getWebHookEvents(@RequestBody String payLoad){
        System.out.println(payLoad);
        return payLoad;
    }
}
