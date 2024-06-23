package com.one.ForoHub.models.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
   @Autowired
   private TopicRepository topicRepository;

   public TopicListDto getTopicById(Long id) {
      Topic topicEnt = topicRepository.getReferenceById(id);
      var topicData = new TopicListDto(topicEnt.getId(), topicEnt.getTitle(), topicEnt.getMessage(),
            topicEnt.getDate(), topicEnt.getStatus(), topicEnt.getAuthor().getName(),
            topicEnt.getCourse());
      return topicData;
   }
}
