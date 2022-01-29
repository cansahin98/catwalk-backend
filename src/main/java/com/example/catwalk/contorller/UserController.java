package com.example.catwalk.contorller;

import com.example.catwalk.entity.User;
import com.example.catwalk.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@CrossOrigin
public class UserController {
    private final UserService userService;

    @PostMapping(value = "/register")
    public ResponseEntity<User> register(@RequestBody User user)
    {
        User controlerUser = userService.register(user);
        if (controlerUser != null)
            return new ResponseEntity<User>(HttpStatus.ACCEPTED);
        return new ResponseEntity<User>(HttpStatus.BAD_REQUEST);
    }


}
