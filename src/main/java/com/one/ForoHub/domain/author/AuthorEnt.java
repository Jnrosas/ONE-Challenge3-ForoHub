package com.one.ForoHub.domain.author;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class AuthorEnt {
   @Column(name = "author_name")
   private String name;
   @Column(name = "author_email")
   private String email;
   @Column(name = "author_password")
   private String password;

   public AuthorEnt(AuthorDto author) {
      this.name = author.name();
      this.email = author.email();
      this.password = author.password();
   }
}
