package com.one.ForoHub.models.user;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;



public record UserDto(
      @NotBlank String name,
      @NotBlank @Email String email,
      @NotBlank String password
) {
}
