package ru.itis.dto.teacher;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class TeacherDto {
    Long id;
    String firstName;
    String lastName;
    Integer age;
    Integer experience;
}
