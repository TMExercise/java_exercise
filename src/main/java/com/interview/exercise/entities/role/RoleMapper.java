package com.interview.exercise.entities.role;

public interface RoleMapper {

    public Role roleDtoToRole(RoleDto roleDto);

    public default String nameToUpper (RoleDto roleDto) {
        return roleDto.getName().toUpperCase();
    }
}
