package com.example.prettydunia.application.service;

import com.example.prettydunia.api.dto.UserDto;
import com.example.prettydunia.domain.user.User;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class UserFactory {
    public User create(UserDto userDto) {

        String name = userDto.getName();
        String lastName = userDto.getLastName();
        String username = userDto.getUsername();
        String role = userDto.getRole();
        String plainPassword = userDto.getPassword();
        String phoneNumber = userDto.getPhoneNumber();
        String email = userDto.getEmail();
        String dateOfBirth = userDto.getDateOfBirth();

        return new User(name,lastName,username,role,plainPassword,phoneNumber,email,dateOfBirth);
    }


    public UserDto create(User user) {
        UserDto userDto = new UserDto();

        userDto.setName(user.getName());
        userDto.setLastName(user.getLastName());
        userDto.setRole(user.getRole());
        userDto.setUsername(user.getUsername());
        userDto.setPhoneNumber(user.getPhoneNumber());

        return userDto;
    }

    public List<UserDto> create(List<User> users) {
        return users.stream().map(this::create).collect(Collectors.toList());
    }
}
