package com.one.ForoHub.domain.topic;

import com.one.ForoHub.domain.Author;
import com.one.ForoHub.domain.answer.Answer;

import java.time.LocalDateTime;
import java.util.List;

public record TopicDto(
      String title,
      String message,
      LocalDateTime topicDate,
      Course course,
      Boolean status,
      Author author,
      List<Answer> answer
) {
}
