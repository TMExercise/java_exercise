package com.interview.exercise.entities.role;

import com.interview.exercise.entities.user.UserDto;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RoleDto {
    private String name;
    private String surname;
    private UserDto user;
}
