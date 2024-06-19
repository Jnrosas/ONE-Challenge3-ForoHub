package com.one.ForoHub.domain.topic;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.one.ForoHub.domain.answer.AnswerDto;
import com.one.ForoHub.domain.author.AuthorDto;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record TopicDto(
   @NotBlank String title,
   @NotBlank String message,
   @NotBlank LocalDateTime date,
   @NotBlank Boolean status,
   @NotNull AuthorDto author,
   @NotBlank Course course,
   @NotNull List<AnswerDto> answer
) {
}
