package com.one.ForoHub.controllers;

import com.one.ForoHub.models.topic.Topic;
import com.one.ForoHub.models.topic.TopicDto;
import com.one.ForoHub.models.topic.TopicListDto;
import com.one.ForoHub.models.topic.TopicRepository;
import com.one.ForoHub.models.user.User;
import com.one.ForoHub.models.user.UserDto;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

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

   @GetMapping
   public List<TopicListDto> listTopics() {
      return topicRepository.findAll()
            .stream()
            .map(t -> new TopicListDto(t))
            .collect(Collectors.toList());
   }
}
