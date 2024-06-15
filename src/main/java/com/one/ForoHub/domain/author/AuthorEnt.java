package com.one.ForoHub.domain.author;

import jakarta.persistence.*;

@Entity
@Table(name = "authors")
public class AuthorEnt {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   Long id;
   String name;
   String email;
   String password;

}
