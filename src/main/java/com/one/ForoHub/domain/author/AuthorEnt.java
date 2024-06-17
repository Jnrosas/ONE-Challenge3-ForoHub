package com.one.ForoHub.domain.author;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class AuthorEnt {
   private String name;
   private String email;
   private String password;
}
