package com.example.prettydunia.api.user;


import com.example.prettydunia.api.ApiResponse;
import com.example.prettydunia.api.dto.UserDto;
import com.example.prettydunia.application.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api/user")
public class UserJsonResource {

    private UserService userService;

    public UserJsonResource(UserService userService){
        this.userService= userService;
    }


    @PostMapping
    public ResponseEntity<Object> create(@RequestBody UserDto userDto) throws Exception {

        userService.create(userDto);

        return ResponseEntity.ok().body(new ApiResponse(true,"User registred successfully"));
    }

    @GetMapping("/get-all")
    public ResponseEntity<List<UserDto>> getAll() throws Exception{

        List<UserDto> userDtos = userService.getAll();

        return ResponseEntity.accepted().body(userDtos);
    }

}