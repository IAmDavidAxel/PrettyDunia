package com.example.prettydunia.domain.user;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "user")
@NoArgsConstructor
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String lastName;
    private String username;
    private String role;
    private String plainPassword;
    private String phoneNumber;
    private String email;
    private String dateOfBirth;

    public User(String name, String lastName, String username, String role, String plainPassword,
                String phoneNumber, String email, String dateOfBirth) {

        this.name = name;
        this.lastName = lastName;
        this.username = username;
        this.role = role;
        this.plainPassword = plainPassword;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
    }

}
