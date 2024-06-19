package com.one.ForoHub.domain.topic;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.one.ForoHub.domain.answer.AnswerDto;
import com.one.ForoHub.domain.author.AuthorDto;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record TopicDto(
   @NotBlank String title,
   @NotBlank String message,
   @NotNull LocalDateTime date,
   @NotNull Boolean status,
   @Valid AuthorDto author,
   @NotNull Course course,
   @Valid List<AnswerDto> answer
) {
}
