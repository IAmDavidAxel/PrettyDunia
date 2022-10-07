package com.example.prettydunia.api.appointment;

import com.example.prettydunia.api.ApiResponse;
import com.example.prettydunia.api.dto.AppointmentDto;
import com.example.prettydunia.application.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/appointment")
public class AppointmentJsonResource {
    private UserService userService;

    public AppointmentJsonResource(UserService userService){
        this.userService = userService;
    }


    @PostMapping("/create/")
    public ResponseEntity<Object> create(@RequestBody AppointmentDto appointmentDto) {

        userService.createAppointment(appointmentDto);

        return  ResponseEntity.ok().body(new ApiResponse(true,"Appointment registered successfully"));
    }


}
