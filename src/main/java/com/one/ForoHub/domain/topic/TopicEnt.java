package com.one.ForoHub.domain.topic;

import com.one.ForoHub.domain.answer.AnswerEnt;
import com.one.ForoHub.domain.author.AuthorEnt;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "topics")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class TopicEnt {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
   private String title;
   private String message;
   private LocalDateTime topicDate;
   @Enumerated(EnumType.STRING)
   private Course course;
   private Boolean status;
   @Embedded
   private AuthorEnt author;
   @Embedded
   private List<AnswerEnt> answer;
}
