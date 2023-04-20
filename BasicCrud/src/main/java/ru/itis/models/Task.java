package ru.itis.models;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity(name = "tasks")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String comment;

    String description;

    @ManyToOne
    @JoinColumn(name = "student_id")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    Student student;

    @ManyToOne
    @JoinColumn(name = "lesson_id")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    Lesson lesson;

    String mark;

//    @Getter
//    @AllArgsConstructor
//    public enum Mark {
//        EXCELLENT(5),
//        GOOD(4),
//        SATISFACTORY(3),
//        BAD(2);
//
//        public final Integer value;
//    }
}
