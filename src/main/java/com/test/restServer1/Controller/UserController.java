package com.test.restServer1.Controller;

import com.test.restServer1.dto.Users.SignUpRequestDTO;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
@Tag(name = "User", description = "User Sever - About User")
public class UserController {

    @RequestMapping(method = RequestMethod.POST, value = "")
    public ResponseEntity<?> signUp(SignUpRequestDTO signUpRequestDTO) {
        return ResponseEntity.ok("");
    }
}
