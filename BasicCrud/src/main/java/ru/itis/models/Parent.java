package ru.itis.models;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity(name = "parents")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Parent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String login;
    String password;

    @OneToMany(mappedBy = "parent", cascade = CascadeType.ALL)
    Set<Student> students;
}
