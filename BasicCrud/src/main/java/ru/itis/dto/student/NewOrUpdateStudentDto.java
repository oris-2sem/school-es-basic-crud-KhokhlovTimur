package ru.itis.dto.student;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class NewOrUpdateStudentDto {
    String firstName;
    String lastName;
    Integer age;
    String login;
    Long groupId;
    Long parentId;
}
