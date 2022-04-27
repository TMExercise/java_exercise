package com.interview.exercise.entities.user;

import java.time.LocalDateTime;

public interface UserMapper {

    User userDtoToUser(UserDto userDto);

    default LocalDateTime modifyInsertName (UserDto userDto) {
        return LocalDateTime.now();
    }
}
