package com.one.ForoHub.domain.author;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record AuthorDto(
      String name,
      String email,
      String password
) {
}
