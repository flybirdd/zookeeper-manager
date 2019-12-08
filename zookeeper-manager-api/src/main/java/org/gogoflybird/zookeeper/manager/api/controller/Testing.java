package org.gogoflybird.zookeeper.manager.api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Testing 
{

    @RequestMapping("/")
    String home() {
        return "hello world";
    }
}