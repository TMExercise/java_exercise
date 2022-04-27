package com.interview.exercise.entities.user;

import com.interview.exercise.entities.pack.Package;
import com.interview.exercise.entities.role.Role;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class User implements UserMapper {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String surname;
    private String company;
    private LocalDateTime insertTime;

    @OneToOne
    private Role role;

    @ManyToMany
    private List<Package> packages;

    @Override
    public User userDtoToUser(UserDto userDto) {
        return null;
    }

    @Override
    public LocalDateTime modifyInsertName(UserDto userDto) {
        return UserMapper.super.modifyInsertName(userDto);
    }
}
