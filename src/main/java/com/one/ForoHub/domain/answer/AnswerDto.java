package com.one.ForoHub.domain.answer;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.one.ForoHub.domain.author.AuthorDto;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

@JsonIgnoreProperties(ignoreUnknown = true)
public record AnswerDto(
      @NotBlank String topic,
      @NotBlank String message,
      @NotNull LocalDateTime date,
      @Valid AuthorDto author,
      @NotNull Boolean solution
) {
}
