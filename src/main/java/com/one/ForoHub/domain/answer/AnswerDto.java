package com.one.ForoHub.domain.answer;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.one.ForoHub.domain.author.AuthorDto;

import java.time.LocalDateTime;

@JsonIgnoreProperties(ignoreUnknown = true)
public record AnswerDto(
      String topic,
      String message,
      LocalDateTime date,
      AuthorDto author,
      Boolean solution
) {
}
