package com.one.ForoHub.controllers;

import com.one.ForoHub.models.topic.*;
import com.one.ForoHub.models.user.UserDto;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@RestController
@RequestMapping("/topics")
public class TopicController {
   @Autowired
   private TopicRepository topicRepository;
   @Autowired
   private TopicService topicService;

   @PostMapping
   @Transactional
   public void postTopic(@RequestBody @Valid TopicDto data) {
      topicRepository.save(new Topic(data));
   }

   @GetMapping
   public Page<TopicListDto> listTopics(@PageableDefault(size = 2, sort = "date") Pageable pagination) {
      return topicRepository.findAll(pagination)
            .map(TopicListDto::new);
   }

   @GetMapping("/{id}")
   public TopicListDto pickTopicById(@PathVariable Long id) {
      return topicService.getTopicById(id);
   }

   @PutMapping("/{id}")
   @Transactional
   public void putTopic(@RequestBody @Valid TopicUpdateDto data, @PathVariable Long id) {
      topicService.updateTopic(data, id);
   }

}
