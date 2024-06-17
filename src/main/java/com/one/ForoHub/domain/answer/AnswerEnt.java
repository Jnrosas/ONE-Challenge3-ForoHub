package com.one.ForoHub.domain.answer;

import com.one.ForoHub.domain.author.AuthorDto;
import com.one.ForoHub.domain.author.AuthorEnt;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class AnswerEnt {
   @Column(name = "answer_topic")
   private String topic;
   @Column(name = "answer_message")
   private String message;
   private LocalDateTime answerDate;
   @Column(name = "answer_author")
   private String author;
   private Boolean solution;

   public AnswerEnt(AnswerDto answer) {
      this.topic = answer.topic();
      this.message = answer.message();
      this.answerDate = answer.answerDate();
      this.author = answer.author().name();
      this.solution = answer.solution();
   }


}
