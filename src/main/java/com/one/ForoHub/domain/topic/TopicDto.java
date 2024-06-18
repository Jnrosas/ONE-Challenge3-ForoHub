package com.one.ForoHub.domain.topic;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.one.ForoHub.domain.answer.AnswerDto;
import com.one.ForoHub.domain.author.AuthorDto;

import java.time.LocalDateTime;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record TopicDto(
   String title,
   String message,
   LocalDateTime date,
   Boolean status,
   AuthorDto author,
   Course course,
   List<AnswerDto> answer
) {
}
