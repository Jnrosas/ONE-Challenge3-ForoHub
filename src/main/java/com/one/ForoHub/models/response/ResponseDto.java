package com.one.ForoHub.models.response;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.one.ForoHub.models.user.UserDto;

import java.time.LocalDateTime;

public record ResponseDto(
      String message,
      @JsonFormat(pattern = "dd/MM/yyyy HH:mm") LocalDateTime date,
      Boolean solution,
      UserDto author
) {
}
