package com.one.ForoHub.domain.topic;

import com.one.ForoHub.domain.answer.AnswerEnt;
import com.one.ForoHub.domain.author.AuthorEnt;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

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
   @Column(insertable=false, updatable=false)
   private String message;
   private LocalDateTime topicDate;
   @Enumerated(EnumType.STRING)
   private Course course;
   private Boolean status;
   @Embedded
   private AuthorEnt author;
   @Embedded
   private AnswerEnt answer;

   public TopicEnt(TopicDto data) {
      this.title = data.title();
      this.message = data.message();
      this.topicDate = data.topicDate();
      this.course = data.course();
      this.status = data.status();
      this.author = new AuthorEnt(data.author());
      this.answer = new AnswerEnt(data.answer());
   }
}
