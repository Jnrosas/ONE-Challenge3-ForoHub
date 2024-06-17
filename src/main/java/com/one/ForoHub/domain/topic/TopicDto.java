package com.one.ForoHub.domain.topic;

import com.one.ForoHub.domain.author.AuthorDto;
import com.one.ForoHub.domain.answer.AnswerDto;

import java.time.LocalDateTime;

public record TopicDto(
      String title,
      String message,
      LocalDateTime topicDate,
      Course course,
      Boolean status,
      AuthorDto author,
      AnswerDto answer
) {
}
