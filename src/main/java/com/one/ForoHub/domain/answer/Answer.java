package com.one.ForoHub.domain.answer;

import com.one.ForoHub.domain.Author;

import java.time.LocalDateTime;

public record Answer(
      String topic,
      String message,
      LocalDateTime answerDate,
      Author author,
      Boolean solution
) {
}
