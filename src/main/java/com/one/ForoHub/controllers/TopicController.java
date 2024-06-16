package com.one.ForoHub.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/topics")
public class TopicController {

   @PostMapping
   public void postTopic(@RequestBody TopicDto data) {
      System.out.println("El post llega bien");
      System.out.println(data);
   }
}
