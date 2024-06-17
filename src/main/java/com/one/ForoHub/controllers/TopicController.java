package com.one.ForoHub.controllers;

import com.one.ForoHub.domain.topic.TopicDto;
import com.one.ForoHub.domain.topic.TopicEnt;
import com.one.ForoHub.domain.topic.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/topics")
public class TopicController {

   @Autowired
   private TopicRepository topicRepository;

   @PostMapping
   public void postTopic(@RequestBody TopicDto data) {
      topicRepository.save(new TopicEnt(data));
   }
}
