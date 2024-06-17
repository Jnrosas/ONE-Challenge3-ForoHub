package com.one.ForoHub.domain.answer;

import com.one.ForoHub.domain.author.AuthorEnt;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class AnswerEnt {
   private String topic;
   private String message;
   private LocalDateTime answerDate;
   private AuthorEnt author;
   private Boolean solution;
}
