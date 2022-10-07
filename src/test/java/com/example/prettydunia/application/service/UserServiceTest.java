package com.example.prettydunia.application.service;

import com.example.prettydunia.domain.appointment.AppointmentRepository;
import com.example.prettydunia.domain.user.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.*;

public class UserServiceTest {


    private UserService userService;

    @Mock
    private UserFactory userFactory;
    @Mock
    private UserRepository userRepository;
    @Mock
    private AppointmentRepository appointmentRepository;


    @BeforeEach
    public void setup(){

        userService = new UserService(userRepository,userFactory,appointmentRepository);
    }

}