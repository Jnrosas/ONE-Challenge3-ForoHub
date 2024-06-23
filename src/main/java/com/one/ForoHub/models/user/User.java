package com.one.ForoHub.models.user;

import com.one.ForoHub.models.response.Response;
import com.one.ForoHub.models.topic.Topic;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class User {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
   private String name;
   private String email;
   private String password;
   @OneToMany(mappedBy = "author", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
   private List<Topic> topics = new ArrayList<>();
   @OneToMany(mappedBy = "author", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
   private List<Response> responses = new ArrayList<>();

   public User(UserDto author) {
      this.name = author.name();
      this.email = author.email();
      this.password = author.password();

   }

   public User updateAuthor(UserDto author) {
      this.name = author.name();
      this.email = author.email();
      this.password = author.password();
      return this;
   }
}
