package com.interview.exercise.entities.pack;

import com.interview.exercise.entities.user.User;
import com.interview.exercise.entities.user.UserRepository;
import com.interview.exercise.entities.user.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/paczki")

public class PackageController {

    @Autowired
    UserRepository appUserRepository;


    @GetMapping("/all")
    public List<Package> getAllPackagesInSystem(List<UserDto> consideredUsers) {

        int helper = 0;

        List<User> allUsers = new ArrayList<User>();
        List <String> userSurnames  = new ArrayList<>();
        for (UserDto myUser :consideredUsers) {

            System.out.println(myUser.getName());

            userSurnames.add( consideredUsers.get(helper).getSurname());

            helper++;


            allUsers = appUserRepository.findAllByLastName(userSurnames);
        }

        List<Package> paczki = new ArrayList<>();

        for (User user: allUsers) {
            List<Package> packages = user.getPackages();
            paczki.addAll(packages);
        }

        return paczki;
    }

}
