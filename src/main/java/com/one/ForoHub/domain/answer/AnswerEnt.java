package com.one.ForoHub.domain.answer;

import com.one.ForoHub.domain.author.AuthorEnt;
import com.one.ForoHub.domain.topic.TopicEnt;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "answers")
public class AnswerEnt {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
   private String message;
   private TopicEnt topic;
   private LocalDateTime answerDate;
   private AuthorEnt author;
   private String solution;
}
