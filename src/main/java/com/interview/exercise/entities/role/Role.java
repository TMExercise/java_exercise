package com.interview.exercise.entities.role;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.interview.exercise.entities.user.User;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
@Data
public class Role implements RoleMapper {

    @Id
    @GeneratedValue
    private Double id;
    private String name;
    private String surname;
    public String roleType;
    public String upperName;

    @JsonBackReference
    @OneToOne
    public User user;


    @Override
    public Role roleDtoToRole(RoleDto roleDto) {
        Role role = new Role();
        role.setName(roleDto.getName());
        role.setSurname(roleDto.getSurname());
        role.setUser(new User().userDtoToUser(roleDto.getUser()));
        return role;

    }

    @Override
    public String nameToUpper(RoleDto roleDto) {
        return RoleMapper.super.nameToUpper(roleDto);
    }
}
