package com.one.ForoHub.domain.author;

import com.one.ForoHub.domain.answer.Answer;
import com.one.ForoHub.domain.topic.Topic;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "authors")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Author {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
   private String name;
   private String email;
   private String password;
   @OneToMany(mappedBy = "author")
   private List<Topic> topics;
   @OneToMany(mappedBy = "author")
   private List<Answer> answers;

   public Author(AuthorDto author) {
      this.name = author.name();
      this.email = author.email();
      this.password = author.password();
   }
}
