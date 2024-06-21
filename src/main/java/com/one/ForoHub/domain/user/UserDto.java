package com.one.ForoHub.domain.user;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record UserDto(
      @NotBlank String name,
      @NotBlank @Email String email,
      @NotBlank String password
) {
}
