package com.one.ForoHub.models.response;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.one.ForoHub.models.user.UserDto;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public record ResponseDto(
      @NotBlank String message,
      @NotNull @JsonFormat(pattern = "dd/MM/yyyy HH:mm") LocalDateTime date,
      @NotBlank Boolean solution,
      @NotNull UserDto author
) {
}
