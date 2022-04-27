package com.interview.exercise.entities.pack;

import com.interview.exercise.entities.user.User;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Package {

    @Id
    private int id;

    @ManyToMany
    private User packageUserToDeliveryFrom;

}
