package com.one.ForoHub.models.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class TopicService {
   @Autowired
   private TopicRepository topicRepository;

   public TopicListDto getTopicById(Long id) {
      Optional<Topic> topicEnt = topicRepository.findById(id);
      if (topicEnt.isPresent()) {
         Topic topic = topicEnt.get();
         return new TopicListDto(topic.getId(), topic.getTitle(), topic.getMessage(),
               topic.getDate(), topic.getStatus(), topic.getAuthor().getName(),
               topic.getCourse());
      }
      return null;
   }
}
