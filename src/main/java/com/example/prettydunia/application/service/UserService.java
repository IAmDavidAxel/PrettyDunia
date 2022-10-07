package com.example.prettydunia.application.service;

import com.example.prettydunia.api.dto.AppointmentDto;
import com.example.prettydunia.api.dto.UserDto;
import com.example.prettydunia.domain.appointment.AppointmentRepository;
import com.example.prettydunia.domain.user.User;
import com.example.prettydunia.domain.user.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService{

    private UserRepository userRepository;
    private UserFactory  userFactory;

    private AppointmentRepository appointmentRepository;

    public UserService(UserRepository userRepository, UserFactory userFactory, AppointmentRepository appointmentRepository){
        this.userRepository = userRepository;
        this.userFactory = userFactory;
        this.appointmentRepository = appointmentRepository;
    }

    public synchronized void create(UserDto userDto) {
        User user = createFromFactory(userDto);
        saveUser(user);
    }

    public  synchronized List<UserDto> getAll() {
        List<User> users = userRepository.findAll();

        return userFactory.create(users);
    }

    private void saveUser(User user) {
        userRepository.save(user);
    }

    private User createFromFactory(UserDto userDto) {
        return userFactory.create(userDto);
    }

    public void createAppointment(AppointmentDto appointmentDto) {

    }
}
