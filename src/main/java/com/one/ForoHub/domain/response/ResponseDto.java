package com.one.ForoHub.domain.response;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDateTime;

public record ResponseDto(
      String message,
      @JsonFormat(pattern = "dd-MM-yyyy HH:mm") LocalDateTime date,
      Boolean solution,
      Long topicId,
      Long userId
) {
}
