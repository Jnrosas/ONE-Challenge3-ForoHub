package com.one.ForoHub.domain.author;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.one.ForoHub.domain.answer.AnswerDto;
import com.one.ForoHub.domain.topic.TopicDto;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record AuthorDto(
     @NotBlank String name,
     @NotBlank @Email String email,
     @NotBlank String password,
     @NotNull List<TopicDto> topics,
     @NotNull List<AnswerDto> answers
) {
}
