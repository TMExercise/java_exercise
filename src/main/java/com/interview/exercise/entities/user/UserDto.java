package com.interview.exercise.entities.user;

import com.interview.exercise.entities.role.RoleDto;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserDto {
    private String name;
    private String surname;
    private RoleDto role;
}
