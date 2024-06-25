package com.one.ForoHub.controllers;

import com.one.ForoHub.models.topic.*;
import com.one.ForoHub.models.user.UserService;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;


@RestController
@RequestMapping("/topics")
public class TopicController {
   @Autowired
   private TopicRepository topicRepository;
   @Autowired
   private TopicService topicService;
   @Autowired
   private UserService userService;


   @PostMapping
   @Transactional
   public ResponseEntity<TopicListDto> postTopic(@RequestBody @Valid TopicDto data,
                                                 UriComponentsBuilder uri) {

      Topic topic = topicRepository.save(new Topic(data));

      //para encriptar clave
      userService.encryptPassword(topic);

      TopicListDto topicListDto = new TopicListDto(topic.getId(), topic.getTitle(),
            topic.getMessage(), topic.getDate(), topic.getStatus(), topic.getAuthor().getName(),
            topic.getCourse());
      URI url = uri.path("/topics/{id}").buildAndExpand(topic.getId()).toUri();
      return ResponseEntity.created(url).body(topicListDto);
   }

   @GetMapping
   public ResponseEntity<Page<TopicListDto>> listTopics(
         @PageableDefault(size = 2, sort = "date") Pageable pagination) {
      return ResponseEntity.ok(topicRepository.findAll(pagination)
            .map(TopicListDto::new));
   }

   @GetMapping("/{id}")
   public ResponseEntity<TopicListDto> pickTopicById(@PathVariable Long id) {
      return ResponseEntity.ok(topicService.getTopicById(id));
   }

   @PutMapping("/{id}")
   @Transactional
   public ResponseEntity<TopicListDto> putTopic(@RequestBody @Valid TopicUpdateDto data,
                                                @PathVariable Long id) {
      return ResponseEntity.ok(topicService.updateTopic(data, id));
   }

   @DeleteMapping("/{id}")
   @Transactional
   public ResponseEntity eraseTopic(@PathVariable Long id) {
      topicService.deleteTopic(id);
      return ResponseEntity.noContent().build();
   }

}
