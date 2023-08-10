package com.test.restServer1.dto.Users;

import lombok.*;

@Setter @Getter @AllArgsConstructor
@NoArgsConstructor @Builder @ToString
public class SignUpRequestDTO {
    Long id;
    String pw;
    String email;
    String phone;
    String address;
    String name;
}
