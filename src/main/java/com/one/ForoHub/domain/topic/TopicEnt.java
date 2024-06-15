package com.one.ForoHub.domain.topic;

import com.one.ForoHub.domain.answer.AnswerEnt;
import com.one.ForoHub.domain.author.AuthorEnt;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "topics")
public class TopicEnt {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
   private String title;
   private String message;
   private LocalDateTime topicDate;
   private Boolean status;
   private AuthorEnt author;
   @Enumerated(EnumType.STRING)
   private Course course;
   private List<AnswerEnt> answers;
}
