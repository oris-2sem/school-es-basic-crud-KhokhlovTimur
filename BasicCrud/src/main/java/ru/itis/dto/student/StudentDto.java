package ru.itis.dto.student;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;
import lombok.experimental.FieldDefaults;
import ru.itis.dto.parent.ParentDto;
import ru.itis.dto.group.GroupDto;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class StudentDto {
    Long id;
    String firstName;
    String lastName;
    Integer age;
    String login;
    GroupDto group;
    ParentDto parent;
}
