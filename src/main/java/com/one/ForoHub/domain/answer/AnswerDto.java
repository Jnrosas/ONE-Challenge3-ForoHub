package com.one.ForoHub.domain.answer;

import com.one.ForoHub.domain.author.AuthorDto;

import java.time.LocalDateTime;

public record AnswerDto(
      String topic,
      String message,
      LocalDateTime answerDate,
      AuthorDto author,
      Boolean solution
) {
}
