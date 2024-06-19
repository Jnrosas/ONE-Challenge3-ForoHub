package com.one.ForoHub.domain.topic;

import com.one.ForoHub.domain.answer.Answer;
import com.one.ForoHub.domain.author.Author;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "topics")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Topic {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
   private String title;
   private String message;
   private LocalDateTime date;
   private Boolean status;
   @JoinColumn(name = "id_author")
   @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
   private Author author;
   @Enumerated(EnumType.STRING)
   private Course course;
   @OneToMany(mappedBy = "topic")
   private List<Answer> answers;

   public Topic(TopicDto data) {
      this.title = data.title();
      this.message = data.message();
      this.date = data.date();
      this.status = data.status();
      this.author = new Author(data.author());
      this.course = data.course();
      this.answers = new ArrayList<>();
   }
}
