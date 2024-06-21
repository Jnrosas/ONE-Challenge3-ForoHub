package com.one.ForoHub.domain.topic;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.one.ForoHub.domain.response.ResponseDto;
import com.one.ForoHub.domain.user.UserDto;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;
import java.util.List;

public record TopicDto(
      @NotBlank String title,
      @NotBlank String message,
      @NotNull @JsonFormat(pattern = "dd-MM-yyyy HH:mm")LocalDateTime date,
      @NotNull Boolean status,
      @NotNull @Valid UserDto author,
      @NotNull Course course,
      List<ResponseDto> responses
) {
}
