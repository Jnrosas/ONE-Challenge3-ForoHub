package com.one.ForoHub.controllers;

import com.one.ForoHub.domain.topic.Topic;
import com.one.ForoHub.domain.topic.TopicDto;
import com.one.ForoHub.domain.topic.TopicRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
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
   @Transactional
   public void postTopic(@RequestBody @Valid TopicDto data) {
      topicRepository.save(new Topic(data));
   }
}
