package com.interview.exercise.entities.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    List<User> findAllByIdLike (List <Integer> ids);

    List<User> findAllByLastName (List <String> surnames);
}
