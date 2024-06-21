package com.one.ForoHub.models.topic;

import com.one.ForoHub.models.response.Response;
import com.one.ForoHub.models.user.User;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "topics")
@Getter
@Setter
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
   @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
   @JoinColumn(name = "author_id", referencedColumnName = "id")
   private User author;
   @Enumerated(EnumType.STRING)
   private Course course;
   @OneToMany(mappedBy = "topic", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
   private List<Response> responses;
}
