package com.one.ForoHub.domain.answer;

import com.one.ForoHub.domain.author.Author;
import com.one.ForoHub.domain.topic.Topic;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "answers")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Answer {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
   private Topic topic;
   private String message;
   private LocalDateTime date;
   private Author author;
   private Boolean solution;
}
